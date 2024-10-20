package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.chromium.chrome.browser.tasks.tab_management.TabGridDialogView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iw3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6454iw3 extends AnimatorListenerAdapter {
    public final /* synthetic */ TabGridDialogView a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.p.bringToFront();
    }

    public C6454iw3(TabGridDialogView tabGridDialogView) {
        this.a = tabGridDialogView;
    }
}
