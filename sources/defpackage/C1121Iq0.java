package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Iq0 */
/* loaded from: classes.dex */
public final class C1121Iq0 extends T93 implements DV1 {
    public final InterfaceC0471Dq0 a;

    public C1121Iq0(InterfaceC0471Dq0 interfaceC0471Dq0) {
        this.a = interfaceC0471Dq0;
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
                c1730Ni0.c(C0991Hq0.c);
                Um4 d = Um4.d(c1730Ni0.s(8, true));
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
