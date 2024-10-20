package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class PY2 {
    public static int b(LK2 lk2, AbstractC0933He2 abstractC0933He2, View view, View view2, AbstractC12077zK2 abstractC12077zK2, boolean z, boolean z2) {
        int max;
        if (abstractC12077zK2.x() == 0 || lk2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(AbstractC12077zK2.J(view), AbstractC12077zK2.J(view2));
        int max2 = Math.max(AbstractC12077zK2.J(view), AbstractC12077zK2.J(view2));
        if (z2) {
            max = Math.max(0, (lk2.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(abstractC0933He2.b(view2) - abstractC0933He2.e(view)) / (Math.abs(AbstractC12077zK2.J(view) - AbstractC12077zK2.J(view2)) + 1))) + (abstractC0933He2.k() - abstractC0933He2.e(view)));
    }

    public static int a(LK2 lk2, AbstractC0933He2 abstractC0933He2, View view, View view2, AbstractC12077zK2 abstractC12077zK2, boolean z) {
        if (abstractC12077zK2.x() == 0 || lk2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(AbstractC12077zK2.J(view) - AbstractC12077zK2.J(view2)) + 1;
        }
        return Math.min(abstractC0933He2.l(), abstractC0933He2.b(view2) - abstractC0933He2.e(view));
    }

    public static int c(LK2 lk2, AbstractC0933He2 abstractC0933He2, View view, View view2, AbstractC12077zK2 abstractC12077zK2, boolean z) {
        if (abstractC12077zK2.x() == 0 || lk2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return lk2.b();
        }
        return (int) (((abstractC0933He2.b(view2) - abstractC0933He2.e(view)) / (Math.abs(AbstractC12077zK2.J(view) - AbstractC12077zK2.J(view2)) + 1)) * lk2.b());
    }
}
