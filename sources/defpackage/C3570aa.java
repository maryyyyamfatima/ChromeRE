package defpackage;

import org.chromium.gfx.mojom.Rect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3570aa extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public C4422d14 b;
    public Rect c;
    public boolean d;
    public boolean e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(32, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public C3570aa(int i) {
        super(32);
    }

    public static C3570aa d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C3570aa c3570aa = new C3570aa(c1730Ni0.c(f).b);
            c3570aa.b = C4422d14.d(c1730Ni0.s(8, false));
            c3570aa.c = Rect.d(c1730Ni0.s(16, false));
            c3570aa.d = c1730Ni0.d(24, 0);
            c3570aa.e = c1730Ni0.d(24, 1);
            return c3570aa;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.k(this.b, 8, false);
        t.k(this.c, 16, false);
        t.d(24, 0, this.d);
        t.d(24, 1, this.e);
    }
}
