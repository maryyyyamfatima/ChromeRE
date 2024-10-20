package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3096Xv1 extends AnimatorListenerAdapter {
    public final /* synthetic */ PopupWindow a;
    public final /* synthetic */ ViewGroup g;

    public C3096Xv1(PopupWindow popupWindow, ViewGroup viewGroup) {
        this.a = popupWindow;
        this.g = viewGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PostTask.c(AbstractC5103f04.a, new RunnableC2966Wv1(this));
    }
}
