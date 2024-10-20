package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wp2 */
/* loaded from: classes2.dex */
public final class C11218wp2 extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public int b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C11218wp2(int i) {
        super(16);
    }

    public static C11218wp2 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C11218wp2 c11218wp2 = new C11218wp2(a.c(c).b);
            int o = a.o(8);
            c11218wp2.b = o;
            if (!(o >= 0 && o <= 4)) {
                throw new C12221zl0("Invalid enum value.");
            }
            c11218wp2.b = o;
            return c11218wp2;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        ka0.t(d).b(this.b, 8);
    }
}
