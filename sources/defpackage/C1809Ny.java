package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ny */
/* loaded from: classes.dex */
public final class C1809Ny extends AbstractC7442lp1 {
    public C1809Ny(InterfaceC7559m90 interfaceC7559m90, InterfaceC1160Iy interfaceC1160Iy) {
        super(interfaceC7559m90, interfaceC1160Iy);
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
            if (!c5953hV1.b(i)) {
                return false;
            }
            int i2 = c5953hV1.b;
            if (i2 == -2) {
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
            }
            InterfaceC7786mp1 interfaceC7786mp1 = this.g;
            if (i2 == 0) {
                C1420Ky d = C1420Ky.d(a.b());
                ((InterfaceC1160Iy) interfaceC7786mp1).d0(d.b, d.c);
                return true;
            }
            if (i2 != 1) {
                return false;
            }
            C1549Ly d2 = C1549Ly.d(a.b());
            ((InterfaceC1160Iy) interfaceC7786mp1).X0(d2.b, d2.c);
            return true;
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
            if (c5953hV1.b(c5953hV1.a(4) ? 5 : 1) && c5953hV1.b == -1) {
                return AbstractC8130np1.a(this.a, AbstractC1939Oy.a, a, dv1);
            }
            return false;
        } catch (C12221zl0 e) {
            System.err.println(e.toString());
            return false;
        }
    }
}
