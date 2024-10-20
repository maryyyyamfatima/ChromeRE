package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: on1 */
/* loaded from: classes2.dex */
public final class C8462on1 extends AbstractC7442lp1 {
    public C8462on1(InterfaceC7559m90 interfaceC7559m90, InterfaceC2921Wm1 interfaceC2921Wm1) {
        super(interfaceC7559m90, interfaceC2921Wm1);
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        try {
            C10620v43 a = c8697pU1.a();
            C5953hV1 c5953hV1 = a.d;
            int i = 4;
            if (!c5953hV1.a(4)) {
                i = 0;
            }
            if (!c5953hV1.b(i) || c5953hV1.b != -2) {
                return false;
            }
            C1730Ni0 c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(CR2.b);
                BR2 b = BR2.b(c1730Ni0);
                c1730Ni0.a();
                return b.a == 0 && b.b.b <= 0;
            } catch (Throwable th) {
                c1730Ni0.a();
                throw th;
            }
        } catch (C12221zl0 e) {
            System.err.println(e.toString());
            return false;
        }
    }

    @Override // defpackage.EV1
    public final boolean Y(C8697pU1 c8697pU1, DV1 dv1) {
        try {
            C10620v43 a = c8697pU1.a();
            C5953hV1 c5953hV1 = a.d;
            if (!c5953hV1.b(c5953hV1.a(4) ? 5 : 1)) {
                return false;
            }
            int i = c5953hV1.b;
            InterfaceC7559m90 interfaceC7559m90 = this.a;
            if (i == -1) {
                return AbstractC8130np1.a(interfaceC7559m90, AbstractC8805pn1.a, a, dv1);
            }
            if (i != 0) {
                return false;
            }
            C6742jn1 d = C6742jn1.d(a.b());
            ((InterfaceC2921Wm1) this.g).m1(d.b, d.c, new C7774mn1(interfaceC7559m90, dv1, c5953hV1.d));
            return true;
        } catch (C12221zl0 e) {
            System.err.println(e.toString());
            return false;
        }
    }
}
