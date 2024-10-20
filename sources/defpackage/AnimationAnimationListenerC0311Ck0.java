package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ck0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0311Ck0 implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ C1091Ik0 c;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC0311Ck0(View view, ViewGroup viewGroup, C1091Ik0 c1091Ik0, C1983Pg3 c1983Pg3) {
        this.a = viewGroup;
        this.b = view;
        this.c = c1091Ik0;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.post(new RunnableC0181Bk0(this));
    }
}
