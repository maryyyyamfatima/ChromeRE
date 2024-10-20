package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.chromium.chrome.browser.tasks.tab_management.TabGridDialogView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jw3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6798jw3 extends AnimatorListenerAdapter {
    public final /* synthetic */ TabGridDialogView a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TabGridDialogView tabGridDialogView = this.a;
        tabGridDialogView.p.setTranslationX(0.0f);
        tabGridDialogView.p.setTranslationY(0.0f);
        tabGridDialogView.p.setScaleX(1.0f);
        tabGridDialogView.p.setScaleY(1.0f);
    }

    public C6798jw3(TabGridDialogView tabGridDialogView) {
        this.a = tabGridDialogView;
    }
}
