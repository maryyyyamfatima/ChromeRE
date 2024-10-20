package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.tabs.TabLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ux3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10580ux3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TabLayout a;

    public C10580ux3(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
