package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class W84 extends AbstractC7442lp1 {
    public W84(InterfaceC7559m90 interfaceC7559m90, S84 s84) {
        super(interfaceC7559m90, s84);
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
            return AbstractC8130np1.a(interfaceC7559m90, AbstractC5157f94.a, a, dv1);
        }
        InterfaceC7786mp1 interfaceC7786mp1 = this.g;
        if (i == 0) {
            c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C3783b94.c);
                long r = c1730Ni0.r(8);
                c1730Ni0.a();
                ((S84) interfaceC7786mp1).f1(r, new C4813e94(interfaceC7559m90, dv1, c5953hV1.d));
                return true;
            } finally {
            }
        }
        if (i != 1) {
            return false;
        }
        c1730Ni0 = new C1730Ni0(a.b());
        c1730Ni0.b();
        try {
            c1730Ni0.c(X84.b);
            c1730Ni0.a();
            ((S84) interfaceC7786mp1).K0(new C3439a94(interfaceC7559m90, dv1, c5953hV1.d));
            return true;
        } finally {
        }
        System.err.println(e.toString());
        return false;
    }
}
