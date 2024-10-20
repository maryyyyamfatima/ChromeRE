package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: En, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0585En implements Runnable {
    public final /* synthetic */ QD1 a;

    public RunnableC0585En(QD1 qd1) {
        this.a = qd1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QD1 qd1 = this.a;
        if (qd1.t) {
            boolean z = qd1.r;
            C0455Dn c0455Dn = qd1.a;
            if (z) {
                qd1.r = false;
                c0455Dn.getClass();
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                c0455Dn.e = currentAnimationTimeMillis;
                c0455Dn.g = -1L;
                c0455Dn.f = currentAnimationTimeMillis;
                c0455Dn.h = 0.5f;
            }
            if ((c0455Dn.g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0455Dn.g + ((long) c0455Dn.i)) || !qd1.f()) {
                qd1.t = false;
                return;
            }
            boolean z2 = qd1.s;
            View view = qd1.h;
            if (z2) {
                qd1.s = false;
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (c0455Dn.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            float a = c0455Dn.a(currentAnimationTimeMillis2);
            long j = currentAnimationTimeMillis2 - c0455Dn.f;
            c0455Dn.f = currentAnimationTimeMillis2;
            qd1.v.scrollListBy((int) (((float) j) * ((a * 4.0f) + ((-4.0f) * a * a)) * c0455Dn.d));
            WeakHashMap weakHashMap = Ec4.a;
            view.postOnAnimation(this);
        }
    }
}
