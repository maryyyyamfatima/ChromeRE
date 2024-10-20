package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fN0 */
/* loaded from: classes.dex */
public final class C5224fN0 extends T93 implements DV1 {
    public final C5568gN0 a;

    public C5224fN0(C5568gN0 c5568gN0) {
        this.a = c5568gN0;
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
                c1730Ni0.c(C4880eN0.c);
                C4422d14 d = C4422d14.d(c1730Ni0.s(8, false));
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
