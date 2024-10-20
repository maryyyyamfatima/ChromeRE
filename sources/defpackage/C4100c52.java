package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c52 */
/* loaded from: classes2.dex */
public final class C4100c52 extends AbstractC7442lp1 {
    public C4100c52(InterfaceC7559m90 interfaceC7559m90, InterfaceC4094c42 interfaceC4094c42) {
        super(interfaceC7559m90, interfaceC4094c42);
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
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
        if (!c5953hV1.b(c5953hV1.a(4) ? 4 : 0)) {
            return false;
        }
        int i = c5953hV1.b;
        if (i == -2) {
            c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(CR2.b);
                BR2 b = BR2.b(c1730Ni0);
                c1730Ni0.a();
                return b.a == 0 && b.b.b <= 0;
            } finally {
            }
        }
        InterfaceC7786mp1 interfaceC7786mp1 = this.g;
        if (i == 0) {
            ((InterfaceC4094c42) interfaceC7786mp1).X(W42.d(a.b()).b);
            return true;
        }
        if (i == 2) {
            c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(M42.b);
                c1730Ni0.a();
                ((InterfaceC4094c42) interfaceC7786mp1).e0();
                return true;
            } finally {
            }
        }
        if (i == 4) {
            c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(L42.b);
                c1730Ni0.a();
                ((InterfaceC4094c42) interfaceC7786mp1).N();
                return true;
            } finally {
            }
        }
        if (i != 6) {
            return false;
        }
        c1730Ni0 = new C1730Ni0(a.b());
        c1730Ni0.b();
        try {
            c1730Ni0.c(N42.c);
            int o = c1730Ni0.o(8);
            c1730Ni0.a();
            ((InterfaceC4094c42) interfaceC7786mp1).b0(o);
            return true;
        } finally {
        }
        System.err.println(e.toString());
        return false;
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
            return AbstractC8130np1.a(interfaceC7559m90, AbstractC4444d52.a, a, dv1);
        }
        InterfaceC7786mp1 interfaceC7786mp1 = this.g;
        if (i == 1) {
            S42 d = S42.d(a.b());
            ((InterfaceC4094c42) interfaceC7786mp1).l1(d.b, d.c, new V42(interfaceC7559m90, dv1, c5953hV1.d));
            return true;
        }
        if (i == 3) {
            c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(O42.b);
                c1730Ni0.a();
                ((InterfaceC4094c42) interfaceC7786mp1).o(new R42(interfaceC7559m90, dv1, c5953hV1.d));
                return true;
            } finally {
            }
        }
        if (i != 5) {
            return false;
        }
        c1730Ni0 = new C1730Ni0(a.b());
        c1730Ni0.b();
        try {
            c1730Ni0.c(X42.c);
            int o = c1730Ni0.o(8);
            c1730Ni0.a();
            ((InterfaceC4094c42) interfaceC7786mp1).d1(o, new C3413a52(interfaceC7559m90, dv1, c5953hV1.d));
            return true;
        } finally {
        }
        System.err.println(e.toString());
        return false;
    }
}
