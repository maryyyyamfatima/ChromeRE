package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC2405Sn0 extends AnimatorListenerAdapter implements View.OnLayoutChangeListener {
    public final /* synthetic */ C2665Un0 a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C2665Un0 c2665Un0 = this.a;
        c2665Un0.b.getChildAt(0).removeOnLayoutChangeListener(this);
        FrameLayout frameLayout = c2665Un0.b;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(frameLayout.getBackground(), AbstractC1050Ic.a, 0, 255);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.setDuration(225L);
        animatorSet.setInterpolator(AbstractC8142nr1.g);
        animatorSet.start();
    }

    public ViewOnLayoutChangeListenerC2405Sn0(C2665Un0 c2665Un0) {
        this.a = c2665Un0;
    }
}
