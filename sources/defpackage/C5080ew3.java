package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.chromium.chrome.browser.tasks.tab_management.TabGridDialogView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ew3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5080ew3 extends AnimatorListenerAdapter {
    public final /* synthetic */ TabGridDialogView a;

    public C5080ew3(TabGridDialogView tabGridDialogView) {
        this.a = tabGridDialogView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TabGridDialogView tabGridDialogView = this.a;
        tabGridDialogView.setVisibility(8);
        tabGridDialogView.u = null;
        tabGridDialogView.p.clearFocus();
        ViewGroup viewGroup = (ViewGroup) tabGridDialogView.getParent();
        int i = 0;
        while (true) {
            int childCount = viewGroup.getChildCount();
            HashMap hashMap = tabGridDialogView.E;
            if (i < childCount) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != tabGridDialogView) {
                    Integer num = (Integer) hashMap.get(childAt);
                    childAt.setImportantForAccessibility(num == null ? 0 : num.intValue());
                }
                i++;
            } else {
                hashMap.clear();
                return;
            }
        }
    }
}
