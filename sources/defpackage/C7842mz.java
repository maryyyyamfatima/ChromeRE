package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mz */
/* loaded from: classes2.dex */
public final class C7842mz extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public int b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C7842mz(int i) {
        super(16);
    }

    public static C7842mz d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C7842mz c7842mz = new C7842mz(c1730Ni0.c(c).b);
            int o = c1730Ni0.o(8);
            c7842mz.b = o;
            if (!(o >= 0 && o <= 4)) {
                throw new C12221zl0("Invalid enum value.");
            }
            c7842mz.b = o;
            return c7842mz;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        ka0.t(d).b(this.b, 8);
    }
}
