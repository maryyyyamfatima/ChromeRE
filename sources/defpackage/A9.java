package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A9 extends AbstractC7442lp1 {
    public A9(InterfaceC7559m90 interfaceC7559m90, InterfaceC4121c9 interfaceC4121c9) {
        super(interfaceC7559m90, interfaceC4121c9);
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
            return AbstractC8130np1.a(interfaceC7559m90, B9.a, a, dv1);
        }
        InterfaceC7786mp1 interfaceC7786mp1 = this.g;
        if (i == 0) {
            c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C9274r9.b);
                c1730Ni0.a();
                ((InterfaceC4121c9) interfaceC7786mp1).u0(new C10303u9(interfaceC7559m90, dv1, c5953hV1.d));
                return true;
            } finally {
            }
        }
        if (i == 1) {
            c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C10646v9.c);
                String v = c1730Ni0.v(8, false);
                c1730Ni0.a();
                ((InterfaceC4121c9) interfaceC7786mp1).j0(v, new C11675y9(interfaceC7559m90, dv1, c5953hV1.d));
                return true;
            } finally {
            }
        }
        if (i != 2) {
            return false;
        }
        c1730Ni0 = new C1730Ni0(a.b());
        c1730Ni0.b();
        try {
            c1730Ni0.c(C6870k9.b);
            c1730Ni0.a();
            ((InterfaceC4121c9) interfaceC7786mp1).Q(new C8932q9(interfaceC7559m90, dv1, c5953hV1.d));
            return true;
        } finally {
        }
        System.err.println(e.toString());
        return false;
    }
}
