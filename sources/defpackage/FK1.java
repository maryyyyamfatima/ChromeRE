package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FK1 extends AbstractC7094ko3 {
    public static final C4638dg0[] s;
    public static final C4638dg0 t;
    public C10772vY b;
    public int c;
    public byte[] d;
    public int[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public byte[] l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(56, 0);
        s = new C4638dg0[]{c4638dg0};
        t = c4638dg0;
    }

    public FK1(int i) {
        super(56);
    }

    public static FK1 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            FK1 fk1 = new FK1(c1730Ni0.c(s).b);
            fk1.b = C10772vY.d(c1730Ni0.s(8, false));
            int o = c1730Ni0.o(16);
            fk1.c = o;
            AbstractC0060Am.a(o);
            fk1.c = fk1.c;
            fk1.f = c1730Ni0.d(20, 0);
            fk1.g = c1730Ni0.d(20, 1);
            fk1.h = c1730Ni0.d(20, 2);
            fk1.i = c1730Ni0.d(20, 3);
            fk1.j = c1730Ni0.d(20, 4);
            fk1.k = c1730Ni0.d(20, 5);
            fk1.n = c1730Ni0.d(20, 6);
            fk1.o = c1730Ni0.d(20, 7);
            fk1.p = c1730Ni0.d(21, 0);
            fk1.q = c1730Ni0.d(21, 1);
            fk1.r = c1730Ni0.d(21, 2);
            fk1.d = c1730Ni0.e(24, 0, -1);
            fk1.e = c1730Ni0.q(32, 0);
            int i = 0;
            while (true) {
                int[] iArr = fk1.e;
                if (i < iArr.length) {
                    int i2 = iArr[i];
                    if (!(i2 >= 0 && i2 <= 4)) {
                        throw new C12221zl0("Invalid enum value.");
                    }
                    i++;
                } else {
                    fk1.l = c1730Ni0.e(40, 1, -1);
                    fk1.m = c1730Ni0.o(48);
                    return fk1;
                }
            }
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t2 = ka0.t(t);
        t2.k(this.b, 8, false);
        t2.b(this.c, 16);
        t2.d(20, 0, this.f);
        t2.d(20, 1, this.g);
        t2.d(20, 2, this.h);
        t2.d(20, 3, this.i);
        t2.d(20, 4, this.j);
        t2.d(20, 5, this.k);
        t2.d(20, 6, this.n);
        t2.d(20, 7, this.o);
        t2.d(21, 0, this.p);
        t2.d(21, 1, this.q);
        t2.d(21, 2, this.r);
        t2.c(24, 0, -1, this.d);
        t2.o(this.e, 32, 0);
        t2.c(40, 1, -1, this.l);
        t2.b(this.m, 48);
    }
}
