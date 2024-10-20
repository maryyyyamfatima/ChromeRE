package defpackage;

import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0245Bx extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public boolean b;
    public double c;
    public double d;
    public double e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(40, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public C0245Bx(int i) {
        super(40);
        this.b = true;
        this.c = 0.0d;
        this.d = Double.POSITIVE_INFINITY;
        this.e = 1.0d;
    }

    public static C0245Bx d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C0245Bx c0245Bx = new C0245Bx(c1730Ni0.c(f).b);
            c0245Bx.b = c1730Ni0.d(8, 0);
            c0245Bx.c = c1730Ni0.l(16);
            c0245Bx.d = c1730Ni0.l(24);
            c0245Bx.e = c1730Ni0.l(32);
            return c0245Bx;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.d(8, 0, this.b);
        double d = this.c;
        IA0 ia0 = t.b;
        ByteBuffer byteBuffer = ia0.b;
        int i = t.a;
        byteBuffer.putDouble(i + 16, d);
        ia0.b.putDouble(i + 24, this.d);
        ia0.b.putDouble(i + 32, this.e);
    }
}
