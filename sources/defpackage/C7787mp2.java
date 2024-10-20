package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mp2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7787mp2 extends AbstractC7094ko3 {
    public static final C4638dg0[] g;
    public static final C4638dg0 h;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        g = new C4638dg0[]{c4638dg0};
        h = c4638dg0;
    }

    public C7787mp2(int i) {
        super(16);
    }

    public static C7787mp2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C7787mp2 c7787mp2 = new C7787mp2(c1730Ni0.c(g).b);
            boolean z = false;
            c7787mp2.b = c1730Ni0.d(8, 0);
            c7787mp2.c = c1730Ni0.d(8, 1);
            c7787mp2.d = c1730Ni0.d(8, 2);
            c7787mp2.e = c1730Ni0.d(8, 3);
            int o = c1730Ni0.o(12);
            c7787mp2.f = o;
            if (o >= 0 && o <= 2) {
                z = true;
            }
            if (!z) {
                throw new C12221zl0("Invalid enum value.");
            }
            c7787mp2.f = o;
            return c7787mp2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(h);
        t.d(8, 0, this.b);
        t.d(8, 1, this.c);
        t.d(8, 2, this.d);
        t.d(8, 3, this.e);
        t.b(this.f, 12);
    }
}
