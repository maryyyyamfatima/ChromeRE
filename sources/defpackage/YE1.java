package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.chromium.ui.widget.LoadingView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class YE1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ZE1 a;

    public YE1(ZE1 ze1) {
        this.a = ze1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LoadingView loadingView = this.a.a;
        int i = LoadingView.k;
        loadingView.d();
    }
}
