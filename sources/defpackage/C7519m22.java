package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.NestedScrollView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m22 */
/* loaded from: classes.dex */
public final class C7519m22 extends O0 {
    @Override // defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int p;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfoCompat.m(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (p = nestedScrollView.p()) <= 0) {
            return;
        }
        accessibilityNodeInfoCompat.q(true);
        if (nestedScrollView.getScrollY() > 0) {
            accessibilityNodeInfoCompat.b(C5792h1.p);
            accessibilityNodeInfoCompat.b(C5792h1.z);
        }
        if (nestedScrollView.getScrollY() < p) {
            accessibilityNodeInfoCompat.b(C5792h1.o);
            accessibilityNodeInfoCompat.b(C5792h1.B);
        }
    }

    @Override // defpackage.O0
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i != 4096) {
            if (i == 8192 || i == 16908344) {
                int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.x(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                return true;
            }
            if (i != 16908346) {
                return false;
            }
        }
        int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.p());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.x(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
        return true;
    }

    @Override // defpackage.O0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.p() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.p());
    }
}
