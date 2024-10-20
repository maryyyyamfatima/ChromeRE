package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fn */
/* loaded from: classes.dex */
public final class C5366fn extends AbstractC7442lp1 {
    public C5366fn(InterfaceC7559m90 interfaceC7559m90, InterfaceC12226zm interfaceC12226zm) {
        super(interfaceC7559m90, interfaceC12226zm);
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        C10620v43 a;
        C5953hV1 c5953hV1;
        int i;
        C1730Ni0 c1730Ni0;
        try {
            a = c8697pU1.a();
            c5953hV1 = a.d;
            i = 4;
            if (!c5953hV1.a(4)) {
                i = 0;
            }
        } catch (C12221zl0 e) {
            System.err.println(e.toString());
            return false;
        }
        if (!c5953hV1.b(i)) {
            return false;
        }
        int i2 = c5953hV1.b;
        if (i2 == -2) {
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
        if (i2 != 3) {
            return false;
        }
        c1730Ni0 = new C1730Ni0(a.b());
        c1730Ni0.b();
        try {
            c1730Ni0.c(C2269Rm.b);
            c1730Ni0.a();
            ((InterfaceC12226zm) this.g).cancel();
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
            return AbstractC8130np1.a(interfaceC7559m90, AbstractC5710gn.a, a, dv1);
        }
        InterfaceC7786mp1 interfaceC7786mp1 = this.g;
        if (i == 0) {
            c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C3648an.c);
                JE2 d = JE2.d(c1730Ni0.s(8, false));
                c1730Ni0.a();
                ((InterfaceC12226zm) interfaceC7786mp1).t(d, new C4679dn(interfaceC7559m90, dv1, c5953hV1.d));
                return true;
            } finally {
            }
        }
        if (i == 1) {
            c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C2399Sm.c);
                ME2 d2 = ME2.d(c1730Ni0.s(8, false));
                c1730Ni0.a();
                ((InterfaceC12226zm) interfaceC7786mp1).o1(d2, new C2789Vm(interfaceC7559m90, dv1, c5953hV1.d));
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
            c1730Ni0.c(C2919Wm.b);
            c1730Ni0.a();
            ((InterfaceC12226zm) interfaceC7786mp1).y0(new C3309Zm(interfaceC7559m90, dv1, c5953hV1.d));
            return true;
        } finally {
        }
        System.err.println(e.toString());
        return false;
    }
}
