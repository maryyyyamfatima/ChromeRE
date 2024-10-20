package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.chromium.chrome.browser.tasks.tab_management.TabGridDialogView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gw3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5768gw3 extends AnimatorListenerAdapter {
    public final /* synthetic */ TabGridDialogView a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TabGridDialogView tabGridDialogView = this.a;
        tabGridDialogView.l.setVisibility(4);
        tabGridDialogView.v = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TabGridDialogView tabGridDialogView = this.a;
        Animator animator2 = tabGridDialogView.v;
        if (animator2 != null) {
            animator2.end();
        }
        tabGridDialogView.v = tabGridDialogView.z;
    }

    public C5768gw3(TabGridDialogView tabGridDialogView) {
        this.a = tabGridDialogView;
    }
}
