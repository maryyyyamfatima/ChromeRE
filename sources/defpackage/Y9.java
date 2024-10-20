package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Y9 extends AbstractC7442lp1 {
    public Y9(InterfaceC7559m90 interfaceC7559m90, O9 o9) {
        super(interfaceC7559m90, o9);
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
        if (i2 == 3) {
            c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(R9.c);
                boolean d = c1730Ni0.d(8, 0);
                c1730Ni0.a();
                X9 x9 = (X9) ((O9) interfaceC7786mp1);
                x9.getClass();
                R9 r9 = new R9(0);
                r9.b = d;
                C6068hp1 c6068hp1 = x9.a;
                c6068hp1.g.A(r9.c(c6068hp1.a, new C5953hV1(3)));
                return true;
            } finally {
            }
        }
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(Q9.b);
                c1730Ni0.a();
                ((X9) ((O9) interfaceC7786mp1)).c();
                return true;
            } finally {
            }
        }
        c1730Ni0 = new C1730Ni0(a.b());
        c1730Ni0.b();
        try {
            c1730Ni0.c(S9.c);
            long r = c1730Ni0.r(8);
            c1730Ni0.a();
            X9 x92 = (X9) ((O9) interfaceC7786mp1);
            x92.getClass();
            S9 s9 = new S9(0);
            s9.b = r;
            C6068hp1 c6068hp12 = x92.a;
            c6068hp12.g.A(s9.c(c6068hp12.a, new C5953hV1(0)));
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
            if (!c5953hV1.b(c5953hV1.a(4) ? 5 : 1)) {
                return false;
            }
            int i = c5953hV1.b;
            InterfaceC7559m90 interfaceC7559m90 = this.a;
            if (i == -1) {
                return AbstractC8130np1.a(interfaceC7559m90, Z9.a, a, dv1);
            }
            if (i != 2) {
                return false;
            }
            C1730Ni0 c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(T9.b);
                c1730Ni0.a();
                O9 o9 = (O9) this.g;
                W9 w9 = new W9(interfaceC7559m90, dv1, c5953hV1.d);
                X9 x9 = (X9) o9;
                x9.getClass();
                T9 t9 = new T9(0);
                C6068hp1 c6068hp1 = x9.a;
                c6068hp1.g.Y(t9.c(c6068hp1.a, new C5953hV1(2, 1, 0L)), new V9(w9));
                return true;
            } catch (Throwable th) {
                c1730Ni0.a();
                throw th;
            }
        } catch (C12221zl0 e) {
            System.err.println(e.toString());
            return false;
        }
    }
}
