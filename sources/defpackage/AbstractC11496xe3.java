package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xe3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11496xe3 {
    public static int b(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(View.MeasureSpec.getSize(i), i2);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.getSize(i);
        }
        throw new IllegalStateException(AbstractC9076qb1.a("Unexpected size mode: ", View.MeasureSpec.getMode(i)));
    }

    public static int a(float f, int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (i2 == 1) {
            return View.MeasureSpec.makeMeasureSpec(FH0.a(f), 1073741824);
        }
        if (i2 == 2) {
            return View.MeasureSpec.makeMeasureSpec(FH0.a(f), Integer.MIN_VALUE);
        }
        throw new IllegalArgumentException("Unexpected YogaMeasureMode: ".concat(AbstractC11238ws4.b(i)));
    }
}
