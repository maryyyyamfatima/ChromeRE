package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iN0 */
/* loaded from: classes.dex */
public final class C6256iN0 extends AbstractC7442lp1 {
    public C6256iN0(InterfaceC7559m90 interfaceC7559m90, InterfaceC3506aN0 interfaceC3506aN0) {
        super(interfaceC7559m90, interfaceC3506aN0);
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
        if (i2 != 1) {
            return false;
        }
        c1730Ni0 = new C1730Ni0(a.b());
        c1730Ni0.b();
        try {
            c1730Ni0.c(C4193cN0.c);
            C0207Bp1 p = c1730Ni0.p(8);
            c1730Ni0.a();
            C5912hN0 c5912hN0 = (C5912hN0) ((InterfaceC3506aN0) this.g);
            c5912hN0.getClass();
            C4193cN0 c4193cN0 = new C4193cN0(0);
            c4193cN0.b = p;
            C6068hp1 c6068hp1 = c5912hN0.a;
            c6068hp1.g.A(c4193cN0.c(c6068hp1.a, new C5953hV1(1)));
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
                return AbstractC8130np1.a(interfaceC7559m90, AbstractC6598jN0.a, a, dv1);
            }
            if (i != 0) {
                return false;
            }
            C1730Ni0 c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C4537dN0.b);
                c1730Ni0.a();
                InterfaceC3506aN0 interfaceC3506aN0 = (InterfaceC3506aN0) this.g;
                C5568gN0 c5568gN0 = new C5568gN0(interfaceC7559m90, dv1, c5953hV1.d);
                C5912hN0 c5912hN0 = (C5912hN0) interfaceC3506aN0;
                c5912hN0.getClass();
                C4537dN0 c4537dN0 = new C4537dN0(0);
                C6068hp1 c6068hp1 = c5912hN0.a;
                c6068hp1.g.Y(c4537dN0.c(c6068hp1.a, new C5953hV1(0, 1, 0L)), new C5224fN0(c5568gN0));
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
