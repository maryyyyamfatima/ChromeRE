package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i22, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6145i22 extends AbstractC7094ko3 {
    public static final C4638dg0[] j;
    public static final C4638dg0 k;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public byte[] h;
    public C5457g22 i;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(72, 0);
        j = new C4638dg0[]{c4638dg0};
        k = c4638dg0;
    }

    public C6145i22(int i) {
        super(72);
    }

    public static C6145i22 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C6145i22 c6145i22 = new C6145i22(c1730Ni0.c(j).b);
            int o = c1730Ni0.o(8);
            c6145i22.b = o;
            if (!(o >= 0 && o <= 2)) {
                throw new C12221zl0("Invalid enum value.");
            }
            c6145i22.b = o;
            c6145i22.c = c1730Ni0.v(16, false);
            c6145i22.d = c1730Ni0.v(24, true);
            c6145i22.e = c1730Ni0.v(32, true);
            c6145i22.f = c1730Ni0.v(40, true);
            c6145i22.g = c1730Ni0.v(48, true);
            c6145i22.h = c1730Ni0.e(56, 0, -1);
            c6145i22.i = C5457g22.d(c1730Ni0.s(64, true));
            return c6145i22;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(k);
        t.b(this.b, 8);
        t.m(this.c, 16, false);
        t.m(this.d, 24, true);
        t.m(this.e, 32, true);
        t.m(this.f, 40, true);
        t.m(this.g, 48, true);
        t.c(56, 0, -1, this.h);
        t.k(this.i, 64, true);
    }
}
