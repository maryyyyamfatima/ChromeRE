package org.chromium.gfx.mojom;

import defpackage.AbstractC7094ko3;
import defpackage.C1730Ni0;
import defpackage.C4638dg0;
import defpackage.KA0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Rect extends AbstractC7094ko3 {
    public static final C4638dg0[] f;
    public static final C4638dg0 g;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        f = new C4638dg0[]{c4638dg0};
        g = c4638dg0;
    }

    public Rect(int i) {
        super(24);
    }

    public static Rect d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            Rect rect = new Rect(c1730Ni0.c(f).b);
            rect.b = c1730Ni0.o(8);
            rect.c = c1730Ni0.o(12);
            rect.d = c1730Ni0.o(16);
            rect.e = c1730Ni0.o(20);
            return rect;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(g);
        t.b(this.b, 8);
        t.b(this.c, 12);
        t.b(this.d, 16);
        t.b(this.e, 20);
    }
}
