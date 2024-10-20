package defpackage;

import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hH0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5882hH0 extends AbstractC0576El0 {
    public final C6568jH0 c;
    public final C0422Dg1 b = new C0422Dg1();
    public final Object d = new Object();
    public boolean e = true;

    public final void a() {
        synchronized (this.a) {
        }
        synchronized (this.d) {
            if (this.e) {
                this.c.b();
                this.e = false;
            }
        }
    }

    public final void finalize() {
        try {
            synchronized (this.d) {
                if (this.e) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    a();
                }
            }
        } finally {
            super.finalize();
        }
    }

    public C5882hH0(C6568jH0 c6568jH0) {
        this.c = c6568jH0;
    }
}
