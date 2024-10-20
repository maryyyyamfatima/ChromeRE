package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.view.Surface;
import com.google.vr.cardboard.ExternalSurfaceManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class FG0 {
    public final int a;
    public final GG0 b;
    public final float[] c;
    public final int g;
    public final int h;
    public volatile SurfaceTexture i;
    public volatile Surface j;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final int[] f = new int[1];
    public volatile boolean k = false;
    public volatile boolean l = false;
    public final Object m = new Object();

    public FG0(int i, int i2, int i3, GG0 gg0) {
        float[] fArr = new float[16];
        this.c = fArr;
        this.a = i;
        this.g = i2;
        this.h = i3;
        this.b = gg0;
        Matrix.setIdentityM(fArr, 0);
    }

    public final void a(int i) {
        if (this.k) {
            return;
        }
        this.f[0] = i;
        if (this.i == null) {
            this.i = new SurfaceTexture(this.f[0]);
            if (this.g > 0 && this.h > 0) {
                this.i.setDefaultBufferSize(this.g, this.h);
            }
            this.i.setOnFrameAvailableListener(new EG0(this));
            this.j = new Surface(this.i);
        } else {
            this.i.attachToGLContext(this.f[0]);
        }
        this.k = true;
        GG0 gg0 = this.b;
        if (gg0 != null) {
            gg0.b();
        }
    }

    public final void b(CG0 cg0) {
        synchronized (this.m) {
            this.l = true;
        }
        if (this.e.getAndSet(true)) {
            return;
        }
        GG0 gg0 = this.b;
        if (gg0 != null) {
            gg0.a();
        }
        if (this.i != null) {
            this.i.release();
            this.i = null;
            this.j = null;
        }
        ExternalSurfaceManager.nativeUpdateSurface(cg0.a, this.a, 0, 0L, this.c);
    }
}
