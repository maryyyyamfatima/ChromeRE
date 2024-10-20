package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kF3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6905kF3 {
    public final AF3 a = new AF3();

    public final void b(Object obj) {
        this.a.n(obj);
    }

    public final boolean d(Object obj) {
        AF3 af3 = this.a;
        synchronized (af3.a) {
            if (af3.c) {
                return false;
            }
            af3.c = true;
            af3.e = obj;
            af3.b.b(af3);
            return true;
        }
    }

    public final void a(Exception exc) {
        this.a.m(exc);
    }

    public final boolean c(Exception exc) {
        AF3 af3 = this.a;
        synchronized (af3.a) {
            if (af3.c) {
                return false;
            }
            af3.c = true;
            af3.f = exc;
            af3.b.b(af3);
            return true;
        }
    }
}
