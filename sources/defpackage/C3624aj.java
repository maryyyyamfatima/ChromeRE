package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3624aj extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageView[] g;

    public C3624aj(int i, ImageView[] imageViewArr) {
        this.a = i;
        this.g = imageViewArr;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        for (int i = 0; i < this.a; i++) {
            this.g[i].setAlpha(0.0f);
        }
    }
}
