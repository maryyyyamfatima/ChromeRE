package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0181Bk0 implements Runnable {
    public final /* synthetic */ AnimationAnimationListenerC0311Ck0 a;

    public RunnableC0181Bk0(AnimationAnimationListenerC0311Ck0 animationAnimationListenerC0311Ck0) {
        this.a = animationAnimationListenerC0311Ck0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnimationAnimationListenerC0311Ck0 animationAnimationListenerC0311Ck0 = this.a;
        animationAnimationListenerC0311Ck0.a.endViewTransition(animationAnimationListenerC0311Ck0.b);
        animationAnimationListenerC0311Ck0.c.a();
    }
}
