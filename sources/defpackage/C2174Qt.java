package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qt */
/* loaded from: classes2.dex */
public final class C2174Qt extends AbstractC7442lp1 {
    public C2174Qt(InterfaceC7559m90 interfaceC7559m90, InterfaceC1005Ht interfaceC1005Ht) {
        super(interfaceC7559m90, interfaceC1005Ht);
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
                C1395Kt d = C1395Kt.d(a.b());
                ((InterfaceC1005Ht) this.g).T(d.b, d.c);
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
            if (!c5953hV1.b(c5953hV1.a(4) ? 5 : 1)) {
                return false;
            }
            int i = c5953hV1.b;
            InterfaceC7559m90 interfaceC7559m90 = this.a;
            if (i == -1) {
                return AbstractC8130np1.a(interfaceC7559m90, AbstractC2304Rt.a, a, dv1);
            }
            if (i != 1) {
                return false;
            }
            C1730Ni0 c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C1524Lt.b);
                c1730Ni0.a();
                ((InterfaceC1005Ht) this.g).q(new C1914Ot(interfaceC7559m90, dv1, c5953hV1.d));
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
