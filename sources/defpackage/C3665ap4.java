package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ap4 */
/* loaded from: classes2.dex */
public final class C3665ap4 extends AnimatorListenerAdapter {
    public final /* synthetic */ WindowAndroid a;

    public C3665ap4(WindowAndroid windowAndroid) {
        this.a = windowAndroid;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        WindowAndroid windowAndroid = this.a;
        windowAndroid.k.remove(animator);
        windowAndroid.x();
    }
}
