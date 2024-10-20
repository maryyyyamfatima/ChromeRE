package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class K50 extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public String b;
    public int c;
    public int d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public K50(int i) {
        super(24);
        this.c = 1;
        this.d = 0;
    }

    public static K50 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            K50 k50 = new K50(c1730Ni0.c(e).b);
            boolean z = false;
            k50.b = c1730Ni0.v(8, false);
            int o = c1730Ni0.o(16);
            k50.c = o;
            if (!(o >= 0 && o <= 1)) {
                throw new C12221zl0("Invalid enum value.");
            }
            k50.c = o;
            int o2 = c1730Ni0.o(20);
            k50.d = o2;
            if (o2 >= 0 && o2 <= 1) {
                z = true;
            }
            if (!z) {
                throw new C12221zl0("Invalid enum value.");
            }
            k50.d = o2;
            return k50;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.m(this.b, 8, false);
        t.b(this.c, 16);
        t.b(this.d, 20);
    }
}
