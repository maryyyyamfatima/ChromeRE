package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xn0 */
/* loaded from: classes2.dex */
public final class C11547xn0 extends AbstractC7442lp1 {
    public C11547xn0(InterfaceC7559m90 interfaceC7559m90, InterfaceC0711Fm0 interfaceC0711Fm0) {
        super(interfaceC7559m90, interfaceC0711Fm0);
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
        C10620v43 a;
        C5953hV1 c5953hV1;
        C1730Ni0 c1730Ni0;
        try {
            a = c8697pU1.a();
            c5953hV1 = a.d;
        } catch (C12221zl0 e) {
            System.err.println(e.toString());
            return false;
        }
        if (!c5953hV1.b(c5953hV1.a(4) ? 5 : 1)) {
            return false;
        }
        int i = c5953hV1.b;
        InterfaceC7559m90 interfaceC7559m90 = this.a;
        if (i == -1) {
            return AbstractC8130np1.a(interfaceC7559m90, AbstractC11890yn0.a, a, dv1);
        }
        InterfaceC7786mp1 interfaceC7786mp1 = this.g;
        if (i == 0) {
            ((InterfaceC0711Fm0) interfaceC7786mp1).H(C7085kn0.d(a.b()).b, new C8117nn0(interfaceC7559m90, dv1, c5953hV1.d));
            return true;
        }
        if (i == 1) {
            c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C9832sn0.b);
                c1730Ni0.a();
                ((InterfaceC0711Fm0) interfaceC7786mp1).l0(new C10861vn0(interfaceC7559m90, dv1, c5953hV1.d));
                return true;
            } finally {
            }
        }
        if (i == 2) {
            c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C8461on0.b);
                c1730Ni0.a();
                ((InterfaceC0711Fm0) interfaceC7786mp1).R(new C9489rn0(interfaceC7559m90, dv1, c5953hV1.d));
                return true;
            } finally {
            }
        }
        if (i != 3) {
            return false;
        }
        c1730Ni0 = new C1730Ni0(a.b());
        c1730Ni0.b();
        try {
            c1730Ni0.c(C5711gn0.c);
            String v = c1730Ni0.v(8, false);
            c1730Ni0.a();
            ((InterfaceC0711Fm0) interfaceC7786mp1).z0(v, new C6741jn0(interfaceC7559m90, dv1, c5953hV1.d));
            return true;
        } finally {
        }
        System.err.println(e.toString());
        return false;
    }
}
