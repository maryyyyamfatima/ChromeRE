package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5766gw1 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public C2452Sw2[] b;
    public int c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C5766gw1(int i) {
        super(24);
    }

    public static C5766gw1 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C5766gw1 c5766gw1 = new C5766gw1(c1730Ni0.c(d).b);
            boolean z = false;
            C1730Ni0 s = c1730Ni0.s(8, false);
            int i = s.j(-1).b;
            c5766gw1.b = new C2452Sw2[i];
            for (int i2 = 0; i2 < i; i2++) {
                c5766gw1.b[i2] = C2452Sw2.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            int o = c1730Ni0.o(16);
            c5766gw1.c = o;
            if (o >= 0 && o <= 2) {
                z = true;
            }
            if (!z) {
                throw new C12221zl0("Invalid enum value.");
            }
            c5766gw1.c = o;
            return c5766gw1;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        C2452Sw2[] c2452Sw2Arr = this.b;
        if (c2452Sw2Arr == null) {
            t.q(8, false);
        } else {
            KA0 r = t.r(c2452Sw2Arr.length, 8);
            int i = 0;
            while (true) {
                C2452Sw2[] c2452Sw2Arr2 = this.b;
                if (i >= c2452Sw2Arr2.length) {
                    break;
                }
                r.k(c2452Sw2Arr2[i], (i * 8) + 8, false);
                i++;
            }
        }
        t.b(this.c, 16);
    }
}
