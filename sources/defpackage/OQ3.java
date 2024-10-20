package defpackage;

import android.animation.AnimatorSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class OQ3 implements Runnable {
    public final /* synthetic */ QQ3 a;

    @Override // java.lang.Runnable
    public final void run() {
        QQ3 qq3 = this.a;
        if (qq3.j) {
            float f = qq3.h;
            DC2 dc2 = qq3.l;
            dc2.a = f;
            dc2.b = 0.0f;
            qq3.y.start();
            if (qq3.s != null) {
                int abs = Math.abs(qq3.getDrawable().getBounds().right - qq3.getDrawable().getBounds().left);
                TQ3 tq3 = qq3.s;
                tq3.h = qq3.h * abs;
                tq3.a(tq3.o, tq3.n);
                TQ3 tq32 = qq3.s;
                tq32.l = false;
                AnimatorSet animatorSet = tq32.i;
                if (animatorSet.isStarted()) {
                    return;
                }
                tq32.b();
                animatorSet.setStartDelay(0L);
                tq32.setScaleX(0.0f);
                tq32.setTranslationX(0.0f);
                animatorSet.start();
                tq32.animate().alpha(1.0f).setDuration(500L).setInterpolator(InterpolatorC0485Dt.e);
            }
        }
    }

    public OQ3(QQ3 qq3) {
        this.a = qq3;
    }
}
