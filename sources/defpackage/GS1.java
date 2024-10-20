package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class GS1 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View g;

    public GS1(ImageView imageView, ImageButton imageButton) {
        this.a = imageView;
        this.g = imageButton;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.g.setAlpha(1.0f);
        this.a.setVisibility(8);
    }
}
