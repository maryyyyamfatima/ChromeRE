package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class PM1 {
    public static int a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE);
        }
        if (mode == 0) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        throw new IllegalStateException("Unexpected size spec mode");
    }

    public static void b(int i, int i2, float f, C8753pe3 c8753pe3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int ceil = (int) Math.ceil(size / f);
        int ceil2 = (int) Math.ceil(size2 * f);
        if (mode == 0 && mode2 == 0) {
            c8753pe3.a = 0;
            c8753pe3.b = 0;
            return;
        }
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            if (ceil > size2) {
                c8753pe3.a = ceil2;
                c8753pe3.b = size2;
                return;
            } else {
                c8753pe3.a = size;
                c8753pe3.b = ceil;
                return;
            }
        }
        if (mode == 1073741824) {
            c8753pe3.a = size;
            if (mode2 == 0 || ceil <= size2) {
                c8753pe3.b = ceil;
                return;
            } else {
                c8753pe3.b = size2;
                return;
            }
        }
        if (mode2 == 1073741824) {
            c8753pe3.b = size2;
            if (mode == 0 || ceil2 <= size) {
                c8753pe3.a = ceil2;
                return;
            } else {
                c8753pe3.a = size;
                return;
            }
        }
        if (mode == Integer.MIN_VALUE) {
            c8753pe3.a = size;
            c8753pe3.b = ceil;
        } else if (mode2 == Integer.MIN_VALUE) {
            c8753pe3.a = ceil2;
            c8753pe3.b = size2;
        }
    }
}
