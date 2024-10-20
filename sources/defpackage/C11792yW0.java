package defpackage;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yW0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C11792yW0 extends Thread {
    public static final C12135zW0 y = new C12135zW0();
    public boolean a;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean t;
    public C3100Xw0 w;
    public final WeakReference x;
    public final ArrayList u = new ArrayList();
    public boolean v = true;
    public int p = 0;
    public int q = 0;
    public boolean s = true;
    public int r = 1;

    public C11792yW0(WeakReference weakReference) {
        this.x = weakReference;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C12135zW0 c12135zW0 = y;
        setName("GLThread " + getId());
        try {
            c();
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            c12135zW0.a(this);
            throw th;
        }
        c12135zW0.a(this);
    }

    public final void b() {
        AW0 aw0;
        if (!this.m || (aw0 = (AW0) this.x.get()) == null) {
            return;
        }
        ((VS2) aw0.i()).a();
    }

    public final void k() {
        if (this.n) {
            this.n = false;
            this.w.b();
        }
    }

    public final void j() {
        if (this.m) {
            C3100Xw0 c3100Xw0 = this.w;
            if (c3100Xw0.f != null) {
                AW0 aw0 = (AW0) c3100Xw0.a.get();
                if (aw0 != null) {
                    C10837vj0 d = aw0.d();
                    EGL10 egl10 = c3100Xw0.b;
                    EGLDisplay eGLDisplay = c3100Xw0.c;
                    EGLContext eGLContext = c3100Xw0.f;
                    d.getClass();
                    if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                        Log.e("DefaultContextFactory", "display:" + String.valueOf(eGLDisplay) + " context: " + String.valueOf(eGLContext));
                        throw new D84("eglDestroyContex failed: " + egl10.eglGetError());
                    }
                }
                c3100Xw0.f = null;
            }
            EGLDisplay eGLDisplay2 = c3100Xw0.c;
            if (eGLDisplay2 != null) {
                c3100Xw0.b.eglTerminate(eGLDisplay2);
                c3100Xw0.c = null;
            }
            this.m = false;
            C12135zW0 c12135zW0 = y;
            if (c12135zW0.a == this) {
                c12135zW0.a = null;
            }
            c12135zW0.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0230 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b A[Catch: all -> 0x0229, TryCatch #3 {, blocks: (B:7:0x001e, B:176:0x0027, B:79:0x011c, B:9:0x0032, B:164:0x0036, B:11:0x0048, B:13:0x004e, B:15:0x0059, B:17:0x0065, B:19:0x006f, B:24:0x007b, B:25:0x007e, B:27:0x0082, B:29:0x0087, B:31:0x008b, B:33:0x008e, B:35:0x0092, B:37:0x0096, B:39:0x009a, B:40:0x009d, B:41:0x00a7, B:43:0x00ab, B:45:0x00af, B:47:0x00b9, B:48:0x00c2, B:50:0x00c8, B:52:0x00cc, B:56:0x00d9, B:57:0x00de, B:60:0x00e6, B:62:0x00ec, B:63:0x00ef, B:64:0x00f2, B:66:0x00d4, B:67:0x00f3, B:69:0x00f8, B:71:0x00fc, B:72:0x0101, B:75:0x0105, B:77:0x0109, B:78:0x0115, B:161:0x0221), top: B:6:0x001e, outer: #7, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[Catch: all -> 0x0229, TryCatch #3 {, blocks: (B:7:0x001e, B:176:0x0027, B:79:0x011c, B:9:0x0032, B:164:0x0036, B:11:0x0048, B:13:0x004e, B:15:0x0059, B:17:0x0065, B:19:0x006f, B:24:0x007b, B:25:0x007e, B:27:0x0082, B:29:0x0087, B:31:0x008b, B:33:0x008e, B:35:0x0092, B:37:0x0096, B:39:0x009a, B:40:0x009d, B:41:0x00a7, B:43:0x00ab, B:45:0x00af, B:47:0x00b9, B:48:0x00c2, B:50:0x00c8, B:52:0x00cc, B:56:0x00d9, B:57:0x00de, B:60:0x00e6, B:62:0x00ec, B:63:0x00ef, B:64:0x00f2, B:66:0x00d4, B:67:0x00f3, B:69:0x00f8, B:71:0x00fc, B:72:0x0101, B:75:0x0105, B:77:0x0109, B:78:0x0115, B:161:0x0221), top: B:6:0x001e, outer: #7, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11792yW0.c():void");
    }

    public final boolean a() {
        return this.m && this.n && g();
    }

    public final boolean g() {
        return !this.i && this.j && !this.k && this.p > 0 && this.q > 0 && (this.s || this.r == 1);
    }

    public final void i(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("renderMode");
        }
        C12135zW0 c12135zW0 = y;
        synchronized (c12135zW0) {
            this.r = i;
            c12135zW0.notifyAll();
        }
    }

    public final void l() {
        C12135zW0 c12135zW0 = y;
        synchronized (c12135zW0) {
            this.j = true;
            this.o = false;
            c12135zW0.notifyAll();
            while (this.l && !this.o && !this.g) {
                try {
                    y.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void m() {
        C12135zW0 c12135zW0 = y;
        synchronized (c12135zW0) {
            this.j = false;
            c12135zW0.notifyAll();
            while (!this.l && !this.g) {
                try {
                    y.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void d() {
        C12135zW0 c12135zW0 = y;
        synchronized (c12135zW0) {
            this.h = true;
            c12135zW0.notifyAll();
            while (!this.g && !this.i) {
                try {
                    y.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void e() {
        C12135zW0 c12135zW0 = y;
        synchronized (c12135zW0) {
            this.h = false;
            this.s = true;
            this.t = false;
            c12135zW0.notifyAll();
            while (!this.g && this.i && !this.t) {
                try {
                    y.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void f(int i, int i2) {
        C12135zW0 c12135zW0 = y;
        synchronized (c12135zW0) {
            this.p = i;
            this.q = i2;
            this.v = true;
            this.s = true;
            this.t = false;
            c12135zW0.notifyAll();
            while (!this.g && !this.i && !this.t && a()) {
                try {
                    y.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void h() {
        C12135zW0 c12135zW0 = y;
        synchronized (c12135zW0) {
            this.a = true;
            c12135zW0.notifyAll();
            while (!this.g) {
                try {
                    y.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
