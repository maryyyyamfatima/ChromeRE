package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wx */
/* loaded from: classes2.dex */
public final class C11262wx extends T93 implements DV1 {
    public final C11605xx a;

    public C11262wx(C11605xx c11605xx) {
        this.a = c11605xx;
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
                c1730Ni0.c(C10919vx.c);
                C0245Bx d = C0245Bx.d(c1730Ni0.s(8, false));
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
