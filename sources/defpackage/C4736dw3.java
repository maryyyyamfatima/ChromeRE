package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.chromium.chrome.browser.tasks.tab_management.TabGridDialogView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dw3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4736dw3 extends AnimatorListenerAdapter {
    public final /* synthetic */ TabGridDialogView a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TabGridDialogView tabGridDialogView = this.a;
        tabGridDialogView.u = null;
        tabGridDialogView.p.requestFocus();
        tabGridDialogView.p.sendAccessibilityEvent(8);
        ViewGroup viewGroup = (ViewGroup) tabGridDialogView.getParent();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != tabGridDialogView) {
                tabGridDialogView.E.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                childAt.setImportantForAccessibility(4);
            }
        }
    }

    public C4736dw3(TabGridDialogView tabGridDialogView) {
        this.a = tabGridDialogView;
    }
}
