package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jp2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6755jp2 extends AbstractC7094ko3 {
    public static final C4638dg0[] i;
    public static final C4638dg0 j;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int[] g;
    public C4427d23 h;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(56, 0);
        i = new C4638dg0[]{c4638dg0};
        j = c4638dg0;
    }

    public C6755jp2(int i2) {
        super(56);
    }

    public static C6755jp2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C6755jp2 c6755jp2 = new C6755jp2(c1730Ni0.c(i).b);
            c6755jp2.b = c1730Ni0.v(8, false);
            c6755jp2.c = c1730Ni0.v(16, false);
            int o = c1730Ni0.o(24);
            c6755jp2.d = o;
            if (!(o >= 0 && o <= 1)) {
                throw new C12221zl0("Invalid enum value.");
            }
            c6755jp2.d = o;
            c6755jp2.e = c1730Ni0.o(28);
            c6755jp2.f = c1730Ni0.o(32);
            c6755jp2.g = c1730Ni0.q(40, 0);
            int i2 = 0;
            while (true) {
                int[] iArr = c6755jp2.g;
                if (i2 < iArr.length) {
                    int i3 = iArr[i2];
                    if (!(i3 >= 0 && i3 <= 7)) {
                        throw new C12221zl0("Invalid enum value.");
                    }
                    i2++;
                } else {
                    c6755jp2.h = C4427d23.d(c1730Ni0.s(48, true));
                    return c6755jp2;
                }
            }
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(j);
        t.m(this.b, 8, false);
        t.m(this.c, 16, false);
        t.b(this.d, 24);
        t.b(this.e, 28);
        t.b(this.f, 32);
        t.o(this.g, 40, 0);
        t.k(this.h, 48, true);
    }
}
