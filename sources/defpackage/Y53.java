package defpackage;

import android.graphics.Path;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Y53 implements C50 {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final C5294fb d;
    public final C6326ib e;
    public final boolean f;

    public Y53(String str, boolean z, Path.FillType fillType, C5294fb c5294fb, C6326ib c6326ib, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = c5294fb;
        this.e = c6326ib;
        this.f = z2;
    }

    @Override // defpackage.C50
    public final Z40 a(JJ1 jj1, AbstractC11937yv abstractC11937yv) {
        return new C8661pN0(jj1, abstractC11937yv, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + "}";
    }
}
