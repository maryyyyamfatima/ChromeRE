package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lq0 */
/* loaded from: classes.dex */
public final class C1511Lq0 extends AbstractC7442lp1 {
    public C1511Lq0(InterfaceC7559m90 interfaceC7559m90, InterfaceC0601Eq0 interfaceC0601Eq0) {
        super(interfaceC7559m90, interfaceC0601Eq0);
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
        try {
            C10620v43 a = c8697pU1.a();
            C5953hV1 c5953hV1 = a.d;
            if (!c5953hV1.b(c5953hV1.a(4) ? 5 : 1)) {
                return false;
            }
            int i = c5953hV1.b;
            InterfaceC7559m90 interfaceC7559m90 = this.a;
            if (i == -1) {
                return AbstractC8130np1.a(interfaceC7559m90, AbstractC1640Mq0.a, a, dv1);
            }
            if (i != 0) {
                return false;
            }
            C1730Ni0 c1730Ni0 = new C1730Ni0(a.b());
            c1730Ni0.b();
            try {
                c1730Ni0.c(C0861Gq0.b);
                c1730Ni0.a();
                ((C1381Kq0) ((InterfaceC0601Eq0) this.g)).c(new C1251Jq0(interfaceC7559m90, dv1, c5953hV1.d));
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
