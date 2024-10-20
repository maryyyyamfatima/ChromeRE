package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nm */
/* loaded from: classes.dex */
public final class C1749Nm extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public int b;
    public int c;
    public int d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public C1749Nm(int i) {
        super(24);
    }

    public static C1749Nm d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C1749Nm c1749Nm = new C1749Nm(c1730Ni0.c(e).b);
            int o = c1730Ni0.o(8);
            c1749Nm.b = o;
            AbstractC0060Am.a(o);
            c1749Nm.b = c1749Nm.b;
            int o2 = c1730Ni0.o(12);
            c1749Nm.c = o2;
            boolean z = true;
            if (!(o2 >= 0 && o2 <= 2)) {
                throw new C12221zl0("Invalid enum value.");
            }
            c1749Nm.c = o2;
            int o3 = c1730Ni0.o(16);
            c1749Nm.d = o3;
            if (o3 < 0 || o3 > 2) {
                z = false;
            }
            if (!z) {
                throw new C12221zl0("Invalid enum value.");
            }
            c1749Nm.d = o3;
            return c1749Nm;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.b(this.b, 8);
        t.b(this.c, 12);
        t.b(this.d, 16);
    }
}
