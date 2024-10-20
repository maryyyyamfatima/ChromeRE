package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class HG2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public HG2(Context context, int i, int i2, int i3, int i4, int i5) {
        Resources resources = context.getResources();
        this.a = i;
        this.b = a(resources, i2, 0);
        this.c = a(resources, i3, 0);
        this.d = a(resources, i4, i5);
    }

    public static int a(Resources resources, int i, int i2) {
        if (i == 0) {
            return 0;
        }
        float f = resources.getDisplayMetrics().density;
        float dimension = resources.getDimension(i);
        if (i2 != 0) {
            dimension += resources.getDimension(i2) * 2.0f;
        }
        return (int) (dimension / f);
    }
}
