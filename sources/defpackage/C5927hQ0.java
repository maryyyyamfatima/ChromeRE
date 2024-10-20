package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hQ0 */
/* loaded from: classes.dex */
public final class C5927hQ0 extends AbstractC3779b90 {
    public Rect a;

    @Override // defpackage.AbstractC3779b90
    public final boolean a(View view, Rect rect) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        int left = floatingActionButton.getLeft();
        Rect rect2 = floatingActionButton.n;
        rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
        return true;
    }

    @Override // defpackage.AbstractC3779b90
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        if (view2 instanceof AppBarLayout) {
            q(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof C5153f90) {
            AbstractC3779b90 abstractC3779b90 = ((C5153f90) layoutParams).a;
        }
    }

    @Override // defpackage.AbstractC3779b90
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        List k = coordinatorLayout.k(floatingActionButton);
        int size = k.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) k.get(i4);
            if (!(view2 instanceof AppBarLayout)) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof C5153f90) {
                    AbstractC3779b90 abstractC3779b90 = ((C5153f90) layoutParams).a;
                }
            } else if (q(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                break;
            }
        }
        coordinatorLayout.r(floatingActionButton, i);
        Rect rect = floatingActionButton.n;
        if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
            return true;
        }
        C5153f90 c5153f90 = (C5153f90) floatingActionButton.getLayoutParams();
        if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c5153f90).rightMargin) {
            i2 = rect.right;
        } else {
            i2 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c5153f90).leftMargin ? -rect.left : 0;
        }
        if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c5153f90).bottomMargin) {
            i3 = rect.bottom;
        } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c5153f90).topMargin) {
            i3 = -rect.top;
        }
        if (i3 != 0) {
            WeakHashMap weakHashMap = Ec4.a;
            floatingActionButton.offsetTopAndBottom(i3);
        }
        if (i2 == 0) {
            return true;
        }
        WeakHashMap weakHashMap2 = Ec4.a;
        floatingActionButton.offsetLeftAndRight(i2);
        return true;
    }

    @Override // defpackage.AbstractC3779b90
    public final void c(C5153f90 c5153f90) {
        if (c5153f90.h == 0) {
            c5153f90.h = 80;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(androidx.coordinatorlayout.widget.CoordinatorLayout r5, com.google.android.material.appbar.AppBarLayout r6, com.google.android.material.floatingactionbutton.FloatingActionButton r7) {
        /*
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            f90 r0 = (defpackage.C5153f90) r0
            int r0 = r0.f
            int r1 = r6.getId()
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L11
            goto L15
        L11:
            int r0 = r7.a
            if (r0 == 0) goto L17
        L15:
            r0 = r3
            goto L18
        L17:
            r0 = r2
        L18:
            if (r0 != 0) goto L1c
            r2 = r3
            goto L60
        L1c:
            android.graphics.Rect r0 = r4.a
            if (r0 != 0) goto L27
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.a = r0
        L27:
            android.graphics.Rect r0 = r4.a
            defpackage.AbstractC11878yl0.a(r5, r6, r0)
            int r5 = r0.bottom
            int r0 = r6.e()
            java.util.WeakHashMap r1 = defpackage.Ec4.a
            int r1 = r6.getMinimumHeight()
            if (r1 == 0) goto L3b
            goto L4d
        L3b:
            int r1 = r6.getChildCount()
            if (r1 < r2) goto L4a
            int r1 = r1 - r2
            android.view.View r1 = r6.getChildAt(r1)
            int r3 = r1.getMinimumHeight()
        L4a:
            if (r3 == 0) goto L51
            r1 = r3
        L4d:
            int r1 = r1 * 2
            int r1 = r1 + r0
            goto L57
        L51:
            int r6 = r6.getHeight()
            int r1 = r6 / 3
        L57:
            if (r5 > r1) goto L5d
            r7.g()
            goto L60
        L5d:
            r7.j()
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5927hQ0.q(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, com.google.android.material.floatingactionbutton.FloatingActionButton):boolean");
    }
}
