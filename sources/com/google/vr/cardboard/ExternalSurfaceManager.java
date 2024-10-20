package com.google.vr.cardboard;

import android.opengl.GLES20;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import defpackage.CG0;
import defpackage.DG0;
import defpackage.FG0;
import defpackage.GG0;
import defpackage.HG0;
import defpackage.JG0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class ExternalSurfaceManager {
    public final CG0 a;
    public final Object b;
    public volatile HG0 c;
    public int d;
    public boolean e;

    public ExternalSurfaceManager(long j) {
        CG0 cg0 = new CG0(j);
        this.b = new Object();
        this.c = new HG0();
        this.d = 1;
        this.a = cg0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeCallback(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeUpdateSurface(long j, int i, int i2, long j2, float[] fArr);

    public void shutdown() {
        synchronized (this.b) {
            HG0 hg0 = this.c;
            this.c = new HG0();
            if (!hg0.a.isEmpty()) {
                Iterator it = hg0.a.entrySet().iterator();
                while (it.hasNext()) {
                    ((FG0) ((Map.Entry) it.next()).getValue()).b(this.a);
                }
            }
            if (!hg0.b.isEmpty()) {
                Iterator it2 = hg0.b.entrySet().iterator();
                while (it2.hasNext()) {
                    ((FG0) ((Map.Entry) it2.next()).getValue()).b(this.a);
                }
            }
        }
    }

    public int createExternalSurface() {
        return c(-1, -1, null);
    }

    public int createExternalSurface(int i, int i2, Runnable runnable, Runnable runnable2, Handler handler) {
        if (runnable == null || handler == null) {
            throw new IllegalArgumentException("Surface listener and handler must both be non-null for external Surface creation for Java callbacks.");
        }
        return c(i, i2, new DG0(runnable, runnable2, handler));
    }

    public int createExternalSurfaceWithNativeCallback(int i, int i2, long j, long j2) {
        return c(i, i2, new JG0(j, j2));
    }

    public final int c(int i, int i2, GG0 gg0) {
        int i3;
        synchronized (this.b) {
            HG0 hg0 = new HG0(this.c);
            i3 = this.d;
            this.d = i3 + 1;
            hg0.a.put(Integer.valueOf(i3), new FG0(i3, i, i2, gg0));
            this.c = hg0;
        }
        return i3;
    }

    public void releaseExternalSurface(int i) {
        synchronized (this.b) {
            HG0 hg0 = new HG0(this.c);
            FG0 fg0 = (FG0) hg0.a.remove(Integer.valueOf(i));
            if (fg0 != null) {
                hg0.b.put(Integer.valueOf(i), fg0);
                this.c = hg0;
            } else {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Not releasing nonexistent surface ID ");
                sb.append(i);
                Log.e("ExternalSurfaceManager", sb.toString());
            }
        }
    }

    public Surface getSurface(int i) {
        HG0 hg0 = this.c;
        if (hg0.a.containsKey(Integer.valueOf(i))) {
            FG0 fg0 = (FG0) hg0.a.get(Integer.valueOf(i));
            if (fg0.k) {
                return fg0.j;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder(58);
        sb.append("Surface with ID ");
        sb.append(i);
        sb.append(" does not exist, returning null");
        Log.e("ExternalSurfaceManager", sb.toString());
        return null;
    }

    public void consumerAttachToCurrentGLContext() {
        this.e = true;
        HG0 hg0 = this.c;
        if (hg0.a.isEmpty()) {
            return;
        }
        for (FG0 fg0 : hg0.a.values()) {
            if (!fg0.k) {
                GLES20.glGenTextures(1, fg0.f, 0);
                fg0.a(fg0.f[0]);
            }
        }
    }

    public void consumerAttachToCurrentGLContext(Map map) {
        this.e = true;
        HG0 hg0 = this.c;
        if (!this.c.a.isEmpty()) {
            for (Integer num : this.c.a.keySet()) {
                if (!map.containsKey(num)) {
                    Log.e("ExternalSurfaceManager", String.format("Surface %d's texture ID is not provided, abandoning attaching to current GL context.", num));
                    return;
                }
            }
        }
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (hg0.a.containsKey(entry.getKey())) {
                ((FG0) hg0.a.get(entry.getKey())).a(((Integer) entry.getValue()).intValue());
            } else {
                Log.e("ExternalSurfaceManager", String.format("Surface %d doesn't exist, skip attaching to current GL context.", entry.getKey()));
            }
        }
    }

    public void consumerDetachFromCurrentGLContext() {
        this.e = false;
        HG0 hg0 = this.c;
        if (hg0.a.isEmpty()) {
            return;
        }
        for (FG0 fg0 : hg0.a.values()) {
            if (fg0.k) {
                GG0 gg0 = fg0.b;
                if (gg0 != null) {
                    gg0.a();
                }
                fg0.i.detachFromGLContext();
                fg0.k = false;
            }
        }
    }

    public void consumerUpdateManagedSurfaces() {
        HG0 hg0 = this.c;
        if (this.e && !hg0.a.isEmpty()) {
            for (FG0 fg0 : hg0.a.values()) {
                if (!fg0.k) {
                    GLES20.glGenTextures(1, fg0.f, 0);
                    fg0.a(fg0.f[0]);
                }
                CG0 cg0 = this.a;
                if (fg0.k && fg0.d.getAndSet(false)) {
                    fg0.i.updateTexImage();
                    fg0.i.getTransformMatrix(fg0.c);
                    long timestamp = fg0.i.getTimestamp();
                    nativeUpdateSurface(cg0.a, fg0.a, fg0.f[0], timestamp, fg0.c);
                }
            }
        }
        if (hg0.b.isEmpty()) {
            return;
        }
        Iterator it = hg0.b.values().iterator();
        while (it.hasNext()) {
            ((FG0) it.next()).b(this.a);
        }
    }
}
