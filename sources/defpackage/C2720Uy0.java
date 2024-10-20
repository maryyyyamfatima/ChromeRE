package defpackage;

import android.graphics.Color;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2720Uy0 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public C2720Uy0(boolean z, int i, int i2, int i3, float f2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
    }

    public final int b(int i, float f2) {
        if (this.a) {
            return AbstractC4242cX.g(i, 255) == this.d ? a(i, f2) : i;
        }
        return i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2720Uy0(android.content.Context r9) {
        /*
            r8 = this;
            r0 = 2131034568(0x7f0501c8, float:1.7679657E38)
            android.util.TypedValue r0 = defpackage.AbstractC6594jM1.a(r9, r0)
            r1 = 0
            if (r0 == 0) goto L17
            int r2 = r0.type
            r3 = 18
            if (r2 != r3) goto L17
            int r0 = r0.data
            if (r0 == 0) goto L17
            r0 = 1
            r3 = r0
            goto L18
        L17:
            r3 = r1
        L18:
            r0 = 2131034567(0x7f0501c7, float:1.7679655E38)
            int r4 = defpackage.AbstractC9685sM1.b(r0, r1, r9)
            r0 = 2131034566(0x7f0501c6, float:1.7679653E38)
            int r5 = defpackage.AbstractC9685sM1.b(r0, r1, r9)
            r0 = 2131034450(0x7f050152, float:1.7679418E38)
            int r6 = defpackage.AbstractC9685sM1.b(r0, r1, r9)
            android.content.res.Resources r9 = r9.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r7 = r9.density
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2720Uy0.<init>(android.content.Context):void");
    }

    public final int a(int i, float f2) {
        int i2;
        float min = (this.e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int e = AbstractC9685sM1.e(min, AbstractC4242cX.g(i, 255), this.b);
        if (min > 0.0f && (i2 = this.c) != 0) {
            e = AbstractC4242cX.f(AbstractC4242cX.g(i2, f), e);
        }
        return AbstractC4242cX.g(e, alpha);
    }
}
