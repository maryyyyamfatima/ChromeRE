package defpackage;

import android.animation.TimeAnimator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class PQ3 implements TimeAnimator.TimeListener {
    public final /* synthetic */ QQ3 a;

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        float max;
        QQ3 qq3 = this.a;
        if (JM1.a(qq3.h, qq3.k)) {
            return;
        }
        float f = qq3.k;
        float min = ((float) Math.min(j2, 50L)) * 0.001f;
        int width = qq3.getWidth();
        DC2 dc2 = qq3.l;
        dc2.getClass();
        if (f == 1.0f) {
            max = min;
        } else {
            max = Math.max(0.0f, Math.min(min, ((-6.6666665f) * dc2.b) + ((float) Math.sqrt((22.222221f * r3 * r3) + ((f - dc2.a) * 6.6666665f)))));
        }
        float f2 = min - max;
        if (max > 0.0f) {
            float f3 = (f == 1.0f ? 7.0f : 0.15f) * max;
            float f4 = dc2.a;
            float f5 = dc2.b;
            dc2.a = (((f3 * 0.5f) + f5) * max) + f4;
            dc2.b = f5 + f3;
        }
        if (f2 > 0.0f) {
            float f6 = (-0.15f) * f2;
            float f7 = dc2.a;
            float f8 = dc2.b;
            dc2.a = (((f6 * 0.5f) + f8) * f2) + f7;
            dc2.b = f8 + f6;
        }
        float min2 = Math.min(dc2.a, f);
        dc2.a = min2;
        if (f - min2 < 0.5f / width) {
            dc2.a = f;
            dc2.b = 0.0f;
        }
        float max2 = Math.max(dc2.a, 0.0f);
        super/*OU*/.a(max2);
        if (qq3.s != null) {
            int abs = Math.abs(qq3.getDrawable().getBounds().right - qq3.getDrawable().getBounds().left);
            TQ3 tq3 = qq3.s;
            tq3.h = max2 * abs;
            tq3.a(tq3.o, tq3.n);
        }
        if (JM1.a(qq3.h, 1.0f)) {
            qq3.d(true);
        }
    }

    public PQ3(QQ3 qq3) {
        this.a = qq3;
    }
}
