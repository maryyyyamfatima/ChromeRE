package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hz */
/* loaded from: classes.dex */
public final class C6124hz extends T93 implements DV1 {
    public final C6466iz a;

    public C6124hz(C6466iz c6466iz) {
        this.a = c6466iz;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(5, 2)) {
                return false;
            }
            C1730Ni0 c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C5780gz.c);
                C1544Lx b = C1544Lx.b(c1730Ni0, 8);
                c1730Ni0.a();
                this.a.a(b);
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
