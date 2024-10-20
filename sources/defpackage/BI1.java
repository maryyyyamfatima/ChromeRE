package defpackage;

import android.animation.Animator;
import android.text.TextUtils;
import org.chromium.chrome.browser.logo.LogoView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BI1 implements Animator.AnimatorListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ LogoView h;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LogoView logoView = this.h;
        logoView.a = logoView.g;
        logoView.k = logoView.l;
        logoView.n = logoView.o;
        logoView.g = null;
        logoView.l = null;
        logoView.r = 0.0f;
        logoView.i = null;
        String str = this.a;
        logoView.setContentDescription(str);
        boolean z = this.g;
        logoView.setClickable(z);
        logoView.setFocusable(z || !TextUtils.isEmpty(str));
    }

    public BI1(LogoView logoView, String str, boolean z) {
        this.h = logoView;
        this.a = str;
        this.g = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        onAnimationEnd(animator);
        this.h.invalidate();
    }
}
