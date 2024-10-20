package defpackage;

import android.view.animation.Animation;
import org.chromium.chrome.browser.gesturenav.NavigationBubble;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U93 implements Animation.AnimationListener {
    public final /* synthetic */ X93 a;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        X93 x93 = this.a;
        x93.p.a();
        NavigationBubble navigationBubble = x93.p;
        navigationBubble.setVisibility(4);
        if (!x93.l) {
            x93.b();
        }
        navigationBubble.b(0);
        x93.q = x93.h;
    }

    public U93(X93 x93) {
        this.a = x93;
    }
}
