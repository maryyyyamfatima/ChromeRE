package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.chromium.chrome.browser.tasks.tab_management.TabGridDialogView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fw3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5424fw3 extends AnimatorListenerAdapter {
    public final /* synthetic */ TabGridDialogView a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.v = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TabGridDialogView tabGridDialogView = this.a;
        Animator animator2 = tabGridDialogView.v;
        if (animator2 != null) {
            animator2.end();
        }
        tabGridDialogView.v = tabGridDialogView.y;
        tabGridDialogView.l.setVisibility(0);
        tabGridDialogView.l.setAlpha(0.0f);
    }

    public C5424fw3(TabGridDialogView tabGridDialogView) {
        this.a = tabGridDialogView;
    }
}
