package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z42 */
/* loaded from: classes2.dex */
public final class C11991z42 extends AbstractC7442lp1 {
    public C11991z42(InterfaceC7559m90 interfaceC7559m90, InterfaceC9247r42 interfaceC9247r42) {
        super(interfaceC7559m90, interfaceC9247r42);
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
            C10619v42 d = C10619v42.d(a.b());
            ((InterfaceC9247r42) interfaceC7786mp1).M0(d.b, d.c);
            return true;
        }
        if (i2 == 1) {
            c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C11305x42.b);
                c1730Ni0.a();
                ((InterfaceC9247r42) interfaceC7786mp1).x0();
                return true;
            } finally {
            }
        }
        if (i2 != 2) {
            return false;
        }
        c1730Ni0 = new C1730Ni0(a.b());
        c1730Ni0.b();
        try {
            c1730Ni0.c(C10962w42.b);
            c1730Ni0.a();
            ((InterfaceC9247r42) interfaceC7786mp1).O0();
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
                return AbstractC8130np1.a(this.a, A42.a, a, dv1);
            }
            return false;
        } catch (C12221zl0 e) {
            System.err.println(e.toString());
            return false;
        }
    }
}
