package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Q42 extends T93 implements DV1 {
    public final R42 a;

    public Q42(R42 r42) {
        this.a = r42;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(3, 2)) {
                return false;
            }
            C1730Ni0 c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(P42.c);
                C5113f22 d = C5113f22.d(c1730Ni0.s(8, true));
                c1730Ni0.a();
                this.a.a(d);
                return true;
            } catch (Throwable th) {
                c1730Ni0.a();
                throw th;
            }
        } catch (C12221zl0 unused) {
            return false;
        }
    }
}
