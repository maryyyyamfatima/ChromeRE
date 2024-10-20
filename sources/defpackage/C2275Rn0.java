package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2275Rn0 extends AnimatorListenerAdapter {
    public final boolean a = true;
    public final /* synthetic */ C2665Un0 g;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C2665Un0 c2665Un0 = this.g;
        c2665Un0.e = false;
        FrameLayout frameLayout = c2665Un0.b;
        frameLayout.removeView(frameLayout.getChildAt(0));
        if (this.a) {
            N8 n8 = c2665Un0.a;
            if (n8.isShowing()) {
                n8.dismiss();
            }
            c2665Un0.a();
        }
    }

    public C2275Rn0(C2665Un0 c2665Un0) {
        this.g = c2665Un0;
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = c2665Un0.b;
        View childAt = frameLayout.getChildAt(0);
        if (childAt != null) {
            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, childAt.getAlpha(), 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, c2665Un0.c));
        }
        arrayList.add(ObjectAnimator.ofInt(frameLayout.getBackground(), AbstractC1050Ic.a, 127, 0));
        if (arrayList.isEmpty()) {
            return;
        }
        c2665Un0.e = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(195L);
        animatorSet.setInterpolator(AbstractC8142nr1.d);
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(this);
        animatorSet.start();
    }
}
