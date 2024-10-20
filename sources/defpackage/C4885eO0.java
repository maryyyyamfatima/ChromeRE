package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.chromium.chrome.browser.findinpage.FindToolbarTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4885eO0 extends AnimatorListenerAdapter {
    public final /* synthetic */ FindToolbarTablet a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.E = null;
    }

    public C4885eO0(FindToolbarTablet findToolbarTablet) {
        this.a = findToolbarTablet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.postInvalidateOnAnimation();
    }
}
