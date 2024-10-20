package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sw2 */
/* loaded from: classes2.dex */
public final class C2452Sw2 extends AbstractC7094ko3 {
    public static final C4638dg0[] d;
    public static final C4638dg0 e;
    public float b;
    public float c;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        d = new C4638dg0[]{c4638dg0};
        e = c4638dg0;
    }

    public C2452Sw2(int i) {
        super(16);
    }

    public static C2452Sw2 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C2452Sw2 c2452Sw2 = new C2452Sw2(c1730Ni0.c(d).b);
            c2452Sw2.b = c1730Ni0.m(8);
            c2452Sw2.c = c1730Ni0.m(12);
            return c2452Sw2;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(e);
        t.a(8, this.b);
        t.a(12, this.c);
    }
}
