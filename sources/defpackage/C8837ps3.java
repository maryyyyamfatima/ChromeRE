package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ps3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8837ps3 extends AnimatorListenerAdapter {
    public final /* synthetic */ AbstractC9180qs3 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC9180qs3 abstractC9180qs3 = this.a;
        abstractC9180qs3.i = 0;
        abstractC9180qs3.j = null;
        abstractC9180qs3.n = false;
    }

    public C8837ps3(AbstractC9180qs3 abstractC9180qs3) {
        this.a = abstractC9180qs3;
    }
}
