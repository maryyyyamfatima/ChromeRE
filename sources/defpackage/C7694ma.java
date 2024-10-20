package defpackage;

import org.chromium.gfx.mojom.Rect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ma */
/* loaded from: classes2.dex */
public final class C7694ma extends AbstractC7442lp1 {
    public C7694ma(InterfaceC7559m90 interfaceC7559m90, N9 n9) {
        super(interfaceC7559m90, n9);
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
        if (i2 != 0) {
            return false;
        }
        c1730Ni0 = new C1730Ni0(a.b());
        c1730Ni0.b();
        try {
            c1730Ni0.c(C7006ka.c);
            Rect d = Rect.d(c1730Ni0.s(8, false));
            c1730Ni0.a();
            ((N9) this.g).m(d);
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
                return AbstractC8130np1.a(this.a, AbstractC8038na.a, a, dv1);
            }
            return false;
        } catch (C12221zl0 e) {
            System.err.println(e.toString());
            return false;
        }
    }
}
