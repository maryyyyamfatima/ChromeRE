package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import org.chromium.chrome.browser.gesturenav.NavigationBubble;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A12 implements ValueAnimator.AnimatorUpdateListener {
    public int a;
    public int g;
    public final /* synthetic */ NavigationBubble h;

    public A12(NavigationBubble navigationBubble) {
        this.h = navigationBubble;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.h.m.setImageTintList(ColorStateList.valueOf(AbstractC3899bX.a(this.a, this.g, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false)));
    }
}
