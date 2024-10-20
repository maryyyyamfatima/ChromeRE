package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WG3 {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public ColorStateList i;
    public float j;
    public final int k;
    public boolean l = false;
    public Typeface m;

    public WG3(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, JG2.X0);
        this.j = obtainStyledAttributes.getDimension(0, 0.0f);
        this.i = AM1.b(context, obtainStyledAttributes, 3);
        AM1.b(context, obtainStyledAttributes, 4);
        AM1.b(context, obtainStyledAttributes, 5);
        this.c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.k = obtainStyledAttributes.getResourceId(i2, 0);
        this.b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = AM1.b(context, obtainStyledAttributes, 6);
        this.e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, JG2.o0);
        obtainStyledAttributes2.hasValue(0);
        this.h = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.m;
        int i = this.c;
        if (typeface == null && (str = this.b) != null) {
            this.m = Typeface.create(str, i);
        }
        if (this.m == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.m = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.m = Typeface.SERIF;
            } else if (i2 == 3) {
                this.m = Typeface.MONOSPACE;
            } else {
                this.m = Typeface.DEFAULT;
            }
            this.m = Typeface.create(this.m, i);
        }
    }
}
