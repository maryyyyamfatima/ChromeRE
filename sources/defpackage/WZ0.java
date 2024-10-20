package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WZ0 implements Animation.AnimationListener {
    public final C11703yE1 a;
    public final /* synthetic */ View b;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public WZ0(View view) {
        C11703yE1 c11703yE1;
        this.b = view;
        if (view instanceof C11703yE1) {
            c11703yE1 = (C11703yE1) view;
        } else {
            ViewParent parent = view.getParent();
            while (parent != null && !(parent instanceof C11703yE1)) {
                parent = parent.getParent();
            }
            c11703yE1 = (C11703yE1) parent;
        }
        this.a = c11703yE1;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        C11703yE1 c11703yE1 = this.a;
        if (c11703yE1 != null) {
            c11703yE1.setHasTransientState(true);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C11703yE1 c11703yE1 = this.a;
        if (c11703yE1 != null) {
            c11703yE1.setHasTransientState(false);
        }
    }
}
