package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bl1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0187Bl1 {
    public Animator a;
    public final /* synthetic */ C0447Dl1 b;

    public abstract Animator a();

    public abstract int c();

    public abstract void d();

    public abstract void e();

    public AbstractC0187Bl1(C0447Dl1 c0447Dl1) {
        this.b = c0447Dl1;
    }

    public final ValueAnimator b(C2136Ql1 c2136Ql1, float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(c2136Ql1.getTranslationY(), f);
        ofFloat.addUpdateListener(new C0057Al1(this, c2136Ql1));
        return ofFloat;
    }
}
