package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class Ge4 {
    public static final int[] a = new int[2];

    public static void e(View view) {
        view.invalidate();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    e(childAt);
                }
            }
        }
    }

    public static void g(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), z);
            }
        }
    }

    public static void d(View view, View view2, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        if (view == null || view2 == view) {
            return;
        }
        while (view2 != null) {
            iArr[0] = view2.getLeft() + iArr[0];
            iArr[1] = view2.getTop() + iArr[1];
            if (view2.getParent() == view) {
                return;
            } else {
                view2 = (View) view2.getParent();
            }
        }
    }

    public static void c(View view, View view2, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        if (view == null || view2 == view) {
            return;
        }
        while (view2 != null) {
            iArr[0] = (int) (view2.getX() + iArr[0]);
            iArr[1] = (int) (view2.getY() + iArr[1]);
            if (view2.getParent() == view) {
                return;
            } else {
                view2 = (View) view2.getParent();
            }
        }
    }

    public static int b(Context context, float f) {
        return a(f, context.getResources().getDisplayMetrics());
    }

    public static int a(float f, DisplayMetrics displayMetrics) {
        return Math.round(TypedValue.applyDimension(1, f, displayMetrics));
    }

    public static void f(ViewGroup viewGroup, boolean z) {
        while (viewGroup != null) {
            viewGroup.setClipChildren(z);
            if (!(viewGroup.getParent() instanceof ViewGroup) || viewGroup.getId() == 16908290) {
                return;
            } else {
                viewGroup = (ViewGroup) viewGroup.getParent();
            }
        }
    }

    public static void h(View view, View view2, Canvas canvas) {
        while (view2 != view) {
            canvas.translate(view2.getLeft(), view2.getTop());
            if (!(view2.getParent() instanceof View)) {
                throw new IllegalArgumentException("View 'to' was not a desendent of 'from'.");
            }
            view2 = (View) view2.getParent();
        }
    }
}
