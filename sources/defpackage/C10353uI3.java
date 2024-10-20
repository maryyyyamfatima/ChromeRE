package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uI3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10353uI3 extends AbstractC7094ko3 {
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

    public C10353uI3(int i) {
        super(24);
    }

    public static C10353uI3 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C10353uI3 c10353uI3 = new C10353uI3(a.c(e).b);
            boolean z = false;
            c10353uI3.b = a.v(8, false);
            int o = a.o(16);
            c10353uI3.c = o;
            if (!(o >= -1 && o <= 14)) {
                throw new C12221zl0("Invalid enum value.");
            }
            c10353uI3.c = o;
            int o2 = a.o(20);
            c10353uI3.d = o2;
            if (o2 >= 0 && o2 <= 1) {
                z = true;
            }
            if (!z) {
                throw new C12221zl0("Invalid enum value.");
            }
            c10353uI3.d = o2;
            return c10353uI3;
        } finally {
            a.a();
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
