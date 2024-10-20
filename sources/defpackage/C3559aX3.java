package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.chromium.components.translate.TranslateTabLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aX3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3559aX3 extends AnimatorListenerAdapter {
    public final /* synthetic */ TranslateTabLayout a;

    public C3559aX3(TranslateTabLayout translateTabLayout) {
        this.a = translateTabLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.V = null;
    }
}
