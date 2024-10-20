package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ha */
/* loaded from: classes2.dex */
public final class C5976ha extends AbstractC7442lp1 {
    public C5976ha(InterfaceC7559m90 interfaceC7559m90, InterfaceC3914ba interfaceC3914ba) {
        super(interfaceC7559m90, interfaceC3914ba);
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
            if (i2 != -2) {
                if (i2 != 0) {
                    return false;
                }
                C5288fa d = C5288fa.d(a.b());
                ((InterfaceC3914ba) this.g).n(d.b, d.c, d.d);
                return true;
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
        try {
            C10620v43 a = c8697pU1.a();
            C5953hV1 c5953hV1 = a.d;
            if (c5953hV1.b(c5953hV1.a(4) ? 5 : 1) && c5953hV1.b == -1) {
                return AbstractC8130np1.a(this.a, AbstractC6320ia.a, a, dv1);
            }
            return false;
        } catch (C12221zl0 e) {
            System.err.println(e.toString());
            return false;
        }
    }
}
