package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zl1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C12222zl1 extends AnimatorListenerAdapter {
    public final /* synthetic */ AbstractC0187Bl1 a;

    public C12222zl1(AbstractC0187Bl1 abstractC0187Bl1) {
        this.a = abstractC0187Bl1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC0187Bl1 abstractC0187Bl1 = this.a;
        abstractC0187Bl1.d();
        C0447Dl1 c0447Dl1 = abstractC0187Bl1.b;
        c0447Dl1.k = null;
        c0447Dl1.j.a(abstractC0187Bl1.c());
        abstractC0187Bl1.b.e();
    }
}
