package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class S93 extends Visibility {
    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return a(view, view.getScaleX(), 1.0f);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return a(view, view.getScaleX(), 0.0f);
    }

    public static ObjectAnimator a(View view, float f, float f2) {
        Path path = new Path();
        path.moveTo(f, f);
        path.lineTo(f2, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "ScaleX", "ScaleY", path);
        if (f2 == 0.0f) {
            ofFloat.addListener(new R93(view));
        }
        return ofFloat;
    }
}
