package org.chromium.media;

import J.N;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Surface;
import defpackage.AbstractC4851eH1;
import defpackage.C6308iX2;
import defpackage.C6650jX2;
import defpackage.V60;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ScreenCapture extends Fragment {
    public static final /* synthetic */ int x = 0;
    public long a;
    public final Object g = new Object();
    public int h = 4;
    public MediaProjection i;
    public MediaProjectionManager j;
    public VirtualDisplay k;
    public Surface l;
    public ImageReader m;
    public HandlerThread n;
    public Handler o;
    public Display p;
    public int q;
    public Intent r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;

    public ScreenCapture(long j) {
        this.a = j;
    }

    public static ScreenCapture createScreenCaptureMachine(long j) {
        return new ScreenCapture(j);
    }

    @Override // android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        a(0);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        a(0);
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        stopCapture();
    }

    public boolean allocate(int i, int i2) {
        this.t = i;
        this.u = i2;
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) V60.a.getSystemService("media_projection");
        this.j = mediaProjectionManager;
        if (mediaProjectionManager == null) {
            AbstractC4851eH1.a("ScreenCapture", "mMediaProjectionManager is null", new Object[0]);
            return false;
        }
        this.p = ((DisplayManager) V60.a.getSystemService("display")).getDisplay(0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.p.getMetrics(displayMetrics);
        this.s = displayMetrics.densityDpi;
        return true;
    }

    public final void onNativeDestroyed() {
        this.a = 0L;
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && this.a != 0) {
            if (i2 == -1) {
                this.w = i2;
                this.r = intent;
                a(1);
            }
            N.M2auslLM(this.a, this, i2 == -1);
        }
    }

    public boolean startCapture() {
        synchronized (this.g) {
            if (this.h != 1) {
                AbstractC4851eH1.a("ScreenCapture", "startCapture() invoked without user permission.", new Object[0]);
                return false;
            }
            MediaProjection mediaProjection = this.j.getMediaProjection(this.w, this.r);
            this.i = mediaProjection;
            if (mediaProjection == null) {
                AbstractC4851eH1.a("ScreenCapture", "mMediaProjection is null", new Object[0]);
                return false;
            }
            mediaProjection.registerCallback(new C6650jX2(this), null);
            HandlerThread handlerThread = new HandlerThread("ScreenCapture");
            this.n = handlerThread;
            handlerThread.start();
            this.o = new Handler(this.n.getLooper());
            this.v = 1;
            d();
            b();
            c();
            a(2);
            return true;
        }
    }

    public void stopCapture() {
        synchronized (this.g) {
            MediaProjection mediaProjection = this.i;
            if (mediaProjection != null && this.h == 2) {
                mediaProjection.stop();
                a(3);
                while (this.h != 4) {
                    try {
                        this.g.wait();
                    } catch (InterruptedException e) {
                        AbstractC4851eH1.a("ScreenCapture", "ScreenCaptureEvent: " + e, new Object[0]);
                    }
                }
            } else {
                a(4);
            }
        }
    }

    public final void b() {
        ImageReader imageReader = this.m;
        if (imageReader != null) {
            imageReader.close();
        }
        ImageReader newInstance = ImageReader.newInstance(this.t, this.u, this.v, 2);
        this.m = newInstance;
        this.l = newInstance.getSurface();
        this.m.setOnImageAvailableListener(new C6308iX2(this), this.o);
    }

    public final void c() {
        VirtualDisplay virtualDisplay = this.k;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        this.k = this.i.createVirtualDisplay("ScreenCapture", this.t, this.u, this.s, 16, this.l, null, null);
    }

    public final void a(int i) {
        synchronized (this.g) {
            this.h = i;
            this.g.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r6 = this;
            android.view.Display r0 = r6.p
            int r0 = r0.getRotation()
            r1 = 180(0xb4, float:2.52E-43)
            r2 = 90
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L1e
            if (r0 == r4) goto L1c
            r5 = 2
            if (r0 == r5) goto L1a
            r5 = 3
            if (r0 == r5) goto L17
            goto L1e
        L17:
            r0 = 270(0x10e, float:3.78E-43)
            goto L1f
        L1a:
            r0 = r1
            goto L1f
        L1c:
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            if (r0 == 0) goto L27
            if (r0 == r2) goto L25
            if (r0 == r1) goto L27
        L25:
            r1 = r4
            goto L28
        L27:
            r1 = r3
        L28:
            int r2 = r6.q
            if (r1 != r2) goto L2d
            return r3
        L2d:
            r6.q = r1
            if (r1 != r4) goto L37
            int r2 = r6.t
            int r3 = r6.u
            if (r2 < r3) goto L3f
        L37:
            if (r1 != 0) goto L49
            int r1 = r6.u
            int r2 = r6.t
            if (r1 >= r2) goto L49
        L3f:
            int r1 = r6.t
            int r2 = r6.u
            r6.u = r1
            int r2 = r2 - r1
            int r2 = r2 + r1
            r6.t = r2
        L49:
            long r1 = r6.a
            J.N.Ml8UDaFX(r1, r6, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.media.ScreenCapture.d():boolean");
    }

    public boolean startPrompt() {
        Activity activity = ApplicationStatus.c;
        if (activity == null) {
            AbstractC4851eH1.a("ScreenCapture", "activity is null", new Object[0]);
            return false;
        }
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        beginTransaction.add(this, "screencapture");
        try {
            beginTransaction.commit();
            synchronized (this.g) {
                while (this.h != 0) {
                    try {
                        this.g.wait();
                    } catch (InterruptedException e) {
                        AbstractC4851eH1.a("ScreenCapture", "ScreenCaptureException: " + e, new Object[0]);
                    }
                }
            }
            try {
                startActivityForResult(this.j.createScreenCaptureIntent(), 1);
                return true;
            } catch (ActivityNotFoundException e2) {
                AbstractC4851eH1.a("ScreenCapture", "ScreenCaptureException " + e2, new Object[0]);
                return false;
            }
        } catch (RuntimeException e3) {
            AbstractC4851eH1.a("ScreenCapture", "ScreenCaptureExcaption " + e3, new Object[0]);
            return false;
        }
    }
}
