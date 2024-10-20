package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zw0 */
/* loaded from: classes.dex */
public final class C12287zw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewOnClickListenerC0501Dw0 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw0 = this.a;
        viewOnClickListenerC0501Dw0.y = null;
        viewOnClickListenerC0501Dw0.dismiss();
    }

    public C12287zw0(ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw0) {
        this.a = viewOnClickListenerC0501Dw0;
    }
}
