package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.android.chrome.R;
import org.chromium.chrome.browser.ui.tablet.emptybackground.EmptyBackgroundViewTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2985Wz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ EmptyBackgroundViewTablet a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EmptyBackgroundViewTablet emptyBackgroundViewTablet = this.a;
        emptyBackgroundViewTablet.h = null;
        emptyBackgroundViewTablet.getRootView().findViewById(R.id.control_container).setVisibility(4);
    }

    public C2985Wz0(EmptyBackgroundViewTablet emptyBackgroundViewTablet) {
        this.a = emptyBackgroundViewTablet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }
}
