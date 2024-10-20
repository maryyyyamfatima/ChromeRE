package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k42 */
/* loaded from: classes2.dex */
public final class C6843k42 extends AbstractC7442lp1 {
    public C6843k42(InterfaceC7559m90 interfaceC7559m90, InterfaceC5125f42 interfaceC5125f42) {
        super(interfaceC7559m90, interfaceC5125f42);
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
        InterfaceC7786mp1 interfaceC7786mp1 = this.g;
        if (i2 == 0) {
            C6157i42 d = C6157i42.d(a.b());
            ((C6499j42) ((InterfaceC5125f42) interfaceC7786mp1)).c(d.b, d.c, d.d);
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        c1730Ni0 = new C1730Ni0(a.b());
        c1730Ni0.b();
        try {
            c1730Ni0.c(C5813h42.c);
            C5113f22 d2 = C5113f22.d(c1730Ni0.s(8, false));
            c1730Ni0.a();
            C6499j42 c6499j42 = (C6499j42) ((InterfaceC5125f42) interfaceC7786mp1);
            c6499j42.getClass();
            C5813h42 c5813h42 = new C5813h42(0);
            c5813h42.b = d2;
            C6068hp1 c6068hp1 = c6499j42.a;
            c6068hp1.g.A(c5813h42.c(c6068hp1.a, new C5953hV1(1)));
            return true;
        } finally {
        }
        System.err.println(e.toString());
        return false;
    }

    @Override // defpackage.EV1
    public final boolean Y(C8697pU1 c8697pU1, DV1 dv1) {
        try {
            C10620v43 a = c8697pU1.a();
            C5953hV1 c5953hV1 = a.d;
            if (c5953hV1.b(c5953hV1.a(4) ? 5 : 1) && c5953hV1.b == -1) {
                return AbstractC8130np1.a(this.a, AbstractC7187l42.a, a, dv1);
            }
            return false;
        } catch (C12221zl0 e) {
            System.err.println(e.toString());
            return false;
        }
    }
}
