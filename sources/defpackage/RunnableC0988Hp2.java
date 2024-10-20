package defpackage;

import android.view.animation.AlphaAnimation;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hp2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0988Hp2 implements Runnable {
    public final /* synthetic */ C1118Ip2 a;

    public RunnableC0988Hp2(C1118Ip2 c1118Ip2) {
        this.a = c1118Ip2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1118Ip2 c1118Ip2 = this.a;
        AlphaAnimation alphaAnimation = new AlphaAnimation(c1118Ip2.x.getAlpha(), 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setInterpolator(AbstractC8142nr1.g);
        alphaAnimation.setFillAfter(true);
        c1118Ip2.x.startAnimation(alphaAnimation);
    }
}
