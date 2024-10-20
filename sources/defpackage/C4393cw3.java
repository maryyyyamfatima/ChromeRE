package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.chromium.chrome.browser.tasks.tab_management.TabGridDialogView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cw3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4393cw3 extends AnimatorListenerAdapter {
    public final /* synthetic */ TabGridDialogView a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a.k;
        if (view == null) {
            return;
        }
        view.setAlpha(1.0f);
    }

    public C4393cw3(TabGridDialogView tabGridDialogView) {
        this.a = tabGridDialogView;
    }
}
