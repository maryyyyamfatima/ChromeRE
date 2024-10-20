package defpackage;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oe */
/* loaded from: classes.dex */
public final class C1839Oe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout a;
    public final /* synthetic */ AppBarLayout g;
    public final /* synthetic */ AppBarLayout.Behavior h;

    public C1839Oe(AppBarLayout.Behavior behavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.h = behavior;
        this.a = coordinatorLayout;
        this.g = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.h.u(this.a, this.g, intValue);
    }
}
