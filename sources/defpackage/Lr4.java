package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Lr4 extends AbstractC9896sy0 {
    public static final TL2 b;
    public static final TL2 c;
    public final C10546ur4 a;

    static {
        C0822Gi1 c0822Gi1 = new C0822Gi1(4);
        c0822Gi1.b(EnumC11438xU.y, EnumC6775js4.h);
        c0822Gi1.b(EnumC11438xU.z, EnumC6775js4.i);
        c0822Gi1.b(EnumC11438xU.B, EnumC6775js4.j);
        c0822Gi1.b(EnumC11438xU.A, EnumC6775js4.k);
        c0822Gi1.b(EnumC11438xU.E, EnumC6775js4.l);
        c0822Gi1.b(EnumC11438xU.F, EnumC6775js4.m);
        c0822Gi1.b(EnumC11438xU.g, EnumC6775js4.g);
        b = c0822Gi1.a(false);
        C0822Gi1 c0822Gi12 = new C0822Gi1(4);
        c0822Gi12.b(EnumC11438xU.u, EnumC7119ks4.g);
        c0822Gi12.b(EnumC11438xU.v, EnumC7119ks4.h);
        c0822Gi12.b(EnumC11438xU.w, EnumC7119ks4.i);
        c0822Gi12.b(EnumC11438xU.x, EnumC7119ks4.j);
        c0822Gi12.b(EnumC11438xU.D, EnumC7119ks4.k);
        c0822Gi12.b(EnumC11438xU.C, EnumC7119ks4.l);
        c0822Gi12.b(EnumC11438xU.H, EnumC7119ks4.m);
        c = c0822Gi12.a(false);
    }

    public Lr4(C10546ur4 c10546ur4) {
        this.a = c10546ur4;
    }

    @Override // defpackage.AbstractC9896sy0
    public final void d(EnumC11438xU enumC11438xU, String str, U80 u80, Throwable th) {
        TL2 tl2 = b;
        boolean containsKey = tl2.containsKey(enumC11438xU);
        C10546ur4 c10546ur4 = this.a;
        if (containsKey) {
            EnumC6775js4 enumC6775js4 = (EnumC6775js4) tl2.get(enumC11438xU);
            if (c10546ur4.d.a()) {
                int i = enumC6775js4.a;
                int i2 = c10546ur4.c.a;
                c10546ur4.e.getClass();
                ((V90) c10546ur4.a.d.get()).c(Integer.valueOf(i), Integer.valueOf(i2), 0, c10546ur4.b);
                return;
            }
            return;
        }
        TL2 tl22 = c;
        if (tl22.containsKey(enumC11438xU)) {
            EnumC7119ks4 enumC7119ks4 = (EnumC7119ks4) tl22.get(enumC11438xU);
            if (c10546ur4.d.a()) {
                int i3 = enumC7119ks4.a;
                int i4 = c10546ur4.c.a;
                c10546ur4.e.getClass();
                ((V90) c10546ur4.a.c.get()).c(Integer.valueOf(i3), Integer.valueOf(i4), 0, c10546ur4.b);
            }
        }
    }
}
