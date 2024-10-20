package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class FS1 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View g;

    public FS1(ImageButton imageButton, ImageView imageView) {
        this.a = imageButton;
        this.g = imageView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.g;
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
        this.a.setAlpha(1.0f);
    }
}
