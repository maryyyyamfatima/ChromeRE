package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: az */
/* loaded from: classes.dex */
public final class C3718az extends T93 implements DV1 {
    public final C4061bz a;

    public C3718az(C4061bz c4061bz) {
        this.a = c4061bz;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(7, 2)) {
                return false;
            }
            C1730Ni0 c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C3369Zy.c);
                String v = c1730Ni0.v(8, false);
                c1730Ni0.a();
                this.a.a(v);
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
