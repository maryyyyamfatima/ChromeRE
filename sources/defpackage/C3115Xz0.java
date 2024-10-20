package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.android.chrome.R;
import org.chromium.chrome.browser.ui.tablet.emptybackground.EmptyBackgroundViewTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3115Xz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ EmptyBackgroundViewTablet a;

    public C3115Xz0(EmptyBackgroundViewTablet emptyBackgroundViewTablet) {
        this.a = emptyBackgroundViewTablet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        EmptyBackgroundViewTablet emptyBackgroundViewTablet = this.a;
        emptyBackgroundViewTablet.setVisibility(0);
        emptyBackgroundViewTablet.getRootView().findViewById(R.id.control_container).setVisibility(0);
        emptyBackgroundViewTablet.k.setEnabled(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EmptyBackgroundViewTablet emptyBackgroundViewTablet = this.a;
        emptyBackgroundViewTablet.setVisibility(8);
        emptyBackgroundViewTablet.h = null;
        emptyBackgroundViewTablet.k.setEnabled(true);
    }
}
