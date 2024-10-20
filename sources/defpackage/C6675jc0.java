package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jc0 */
/* loaded from: classes2.dex */
public final class C6675jc0 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public int b;
    public byte[] c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C6675jc0(int i) {
        super(24);
    }

    public static C6675jc0 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C6675jc0 c6675jc0 = new C6675jc0(c1730Ni0.c(d).b);
            int o = c1730Ni0.o(8);
            c6675jc0.b = o;
            boolean z = true;
            if (o != 0 && o != 1 && o != 2 && o != 4) {
                z = false;
            }
            if (!z) {
                throw new C12221zl0("Invalid enum value.");
            }
            c6675jc0.b = o;
            c6675jc0.c = c1730Ni0.e(16, 0, -1);
            return c6675jc0;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.b(this.b, 8);
        t.c(16, 0, -1, this.c);
    }
}
