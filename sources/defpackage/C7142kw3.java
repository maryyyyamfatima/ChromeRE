package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.chromium.chrome.browser.tasks.tab_management.TabGridDialogView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kw3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7142kw3 extends AnimatorListenerAdapter {
    public final /* synthetic */ TabGridDialogView a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TabGridDialogView tabGridDialogView = this.a;
        tabGridDialogView.i.setAlpha(0.0f);
        tabGridDialogView.j.setAlpha(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TabGridDialogView tabGridDialogView = this.a;
        tabGridDialogView.i.bringToFront();
        tabGridDialogView.j.bringToFront();
    }

    public C7142kw3(TabGridDialogView tabGridDialogView) {
        this.a = tabGridDialogView;
    }
}
