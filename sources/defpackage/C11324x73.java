package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x73, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11324x73 extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public int b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C11324x73(int i) {
        super(16);
    }

    public static C11324x73 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C11324x73 c11324x73 = new C11324x73(a.c(c).b);
            int o = a.o(8);
            c11324x73.b = o;
            if (!(o >= 0 && o <= 3)) {
                throw new C12221zl0("Invalid enum value.");
            }
            c11324x73.b = o;
            return c11324x73;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        ka0.t(d).b(this.b, 8);
    }
}
