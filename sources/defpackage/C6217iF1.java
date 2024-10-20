package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iF1 */
/* loaded from: classes2.dex */
public final class C6217iF1 extends T93 implements DV1 {
    public final C6559jF1 a;

    public C6217iF1(C6559jF1 c6559jF1) {
        this.a = c6559jF1;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(0, 2)) {
                return false;
            }
            C1730Ni0 c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C5873hF1.c);
                GU0 d = GU0.d(c1730Ni0.s(8, false));
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
