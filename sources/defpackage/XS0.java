package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XS0 extends AnimationSet implements Runnable {
    public final ViewGroup a;
    public final View g;
    public boolean h;
    public boolean i;
    public boolean j;

    public XS0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.j = true;
        this.a = viewGroup;
        this.g = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.j = true;
        if (this.h) {
            return !this.i;
        }
        if (!super.getTransformation(j, transformation)) {
            this.h = true;
            ViewTreeObserverOnPreDrawListenerC0018Ad2.a(this.a, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.j = true;
        if (this.h) {
            return !this.i;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.h = true;
            ViewTreeObserverOnPreDrawListenerC0018Ad2.a(this.a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.h;
        ViewGroup viewGroup = this.a;
        if (!z && this.j) {
            this.j = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.g);
            this.i = true;
        }
    }
}
