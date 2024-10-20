package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ym */
/* loaded from: classes.dex */
public final class C3179Ym extends T93 implements DV1 {
    public final InterfaceC11540xm a;

    public C3179Ym(C3309Zm c3309Zm) {
        this.a = c3309Zm;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            if (!a.d.c(2, 2)) {
                return false;
            }
            C1730Ni0 c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C3049Xm.c);
                boolean d = c1730Ni0.d(8, 0);
                c1730Ni0.a();
                this.a.a(Boolean.valueOf(d));
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
