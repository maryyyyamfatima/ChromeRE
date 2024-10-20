package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vp2 */
/* loaded from: classes2.dex */
public final class C10875vp2 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public int b;
    public String c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C10875vp2(int i) {
        super(24);
    }

    public static C10875vp2 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C10875vp2 c10875vp2 = new C10875vp2(a.c(d).b);
            int o = a.o(8);
            c10875vp2.b = o;
            if (!(o >= 0 && o <= 7)) {
                throw new C12221zl0("Invalid enum value.");
            }
            c10875vp2.b = o;
            c10875vp2.c = a.v(16, false);
            return c10875vp2;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.b(this.b, 8);
        t.m(this.c, 16, false);
    }
}
