package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class AR3 {
    public static View a(Toolbar toolbar) {
        ActionMenuView actionMenuView;
        Drawable drawable;
        int childCount = toolbar.getChildCount();
        while (true) {
            int i = childCount - 1;
            if (childCount <= 0) {
                actionMenuView = null;
                break;
            }
            if (toolbar.getChildAt(i) instanceof ActionMenuView) {
                actionMenuView = (ActionMenuView) toolbar.getChildAt(i);
                break;
            }
            childCount = i;
        }
        if (actionMenuView == null) {
            return null;
        }
        View childAt = actionMenuView.getChildAt(actionMenuView.getChildCount() - 1);
        boolean z = false;
        if (childAt != null && (childAt instanceof ImageView)) {
            Drawable drawable2 = ((ImageView) childAt).getDrawable();
            actionMenuView.l();
            C4097c5 c4097c5 = actionMenuView.y;
            Z4 z4 = c4097c5.n;
            if (z4 != null) {
                drawable = z4.getDrawable();
            } else {
                drawable = c4097c5.p ? c4097c5.o : null;
            }
            z = drawable2 == drawable;
        }
        if (z) {
            return childAt;
        }
        return null;
    }
}
