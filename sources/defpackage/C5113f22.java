package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f22, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5113f22 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public int b;
    public String c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C5113f22(int i) {
        super(24);
    }

    public static C5113f22 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C5113f22 c5113f22 = new C5113f22(c1730Ni0.c(d).b);
            int o = c1730Ni0.o(8);
            c5113f22.b = o;
            if (!(o >= 0 && o <= 5)) {
                throw new C12221zl0("Invalid enum value.");
            }
            c5113f22.b = o;
            c5113f22.c = c1730Ni0.v(16, false);
            return c5113f22;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.b(this.b, 8);
        t.m(this.c, 16, false);
    }
}
