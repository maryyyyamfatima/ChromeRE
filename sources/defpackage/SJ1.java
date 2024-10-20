package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SJ1 extends ValueAnimator implements Choreographer.FrameCallback {
    public C8985qJ1 o;
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet g = new CopyOnWriteArraySet();
    public float h = 1.0f;
    public boolean i = false;
    public long j = 0;
    public float k = 0.0f;
    public int l = 0;
    public float m = -2.1474836E9f;
    public float n = 2.1474836E9f;
    public boolean p = false;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ long getStartDelay() {
        e();
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ ValueAnimator setDuration(long j) {
        n(j);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ void setInterpolator(TimeInterpolator timeInterpolator) {
        p(timeInterpolator);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ void setStartDelay(long j) {
        r(j);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        n(j);
        throw null;
    }

    public final long e() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void r(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public final ValueAnimator n(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public final void p(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void removeAllUpdateListeners() {
        this.a.clear();
    }

    @Override // android.animation.Animator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.g.add(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        float f;
        C8985qJ1 c8985qJ1 = this.o;
        if (c8985qJ1 == null) {
            f = 0.0f;
        } else {
            float f2 = this.k;
            float f3 = c8985qJ1.j;
            f = (f2 - f3) / (c8985qJ1.k - f3);
        }
        return Float.valueOf(f);
    }

    @Override // android.animation.Animator
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.g.remove(animatorListener);
    }

    @Override // android.animation.Animator
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void removeAllListeners() {
        this.g.clear();
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float d;
        float c;
        float d2;
        if (this.o == null) {
            return 0.0f;
        }
        if (f()) {
            d = c() - this.k;
            c = c();
            d2 = d();
        } else {
            d = this.k - d();
            c = c();
            d2 = d();
        }
        return d / (c - d2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        if (this.o == null) {
            return 0L;
        }
        return ((r0.k - r0.j) / r0.l) * 1000.0f;
    }

    public final void g(boolean z) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.p) {
            k(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        C8985qJ1 c8985qJ1 = this.o;
        if (c8985qJ1 == null || !this.p) {
            return;
        }
        long j2 = this.j;
        float abs = ((float) (j2 != 0 ? j - j2 : 0L)) / ((1.0E9f / c8985qJ1.l) / Math.abs(this.h));
        float f = this.k;
        if (f()) {
            abs = -abs;
        }
        float f2 = f + abs;
        this.k = f2;
        float d = d();
        float c = c();
        PointF pointF = CX1.a;
        boolean z = !(f2 >= d && f2 <= c);
        this.k = CX1.b(this.k, d(), c());
        this.j = j;
        h();
        if (z) {
            if (getRepeatCount() == -1 || this.l < getRepeatCount()) {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.l++;
                if (getRepeatMode() == 2) {
                    this.i = !this.i;
                    this.h = -this.h;
                } else {
                    this.k = f() ? c() : d();
                }
                this.j = j;
            } else {
                this.k = this.h < 0.0f ? d() : c();
                k(true);
                g(f());
            }
        }
        if (this.o != null) {
            float f3 = this.k;
            if (f3 < this.m || f3 > this.n) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.m), Float.valueOf(this.n), Float.valueOf(this.k)));
            }
        }
        AbstractC2576Tv1.a();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.p;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        k(true);
    }

    public final void h() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void o(float f) {
        if (this.k == f) {
            return;
        }
        this.k = CX1.b(f, d(), c());
        this.j = 0L;
        h();
    }

    public final void q(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        C8985qJ1 c8985qJ1 = this.o;
        float f3 = c8985qJ1 == null ? -3.4028235E38f : c8985qJ1.j;
        float f4 = c8985qJ1 == null ? Float.MAX_VALUE : c8985qJ1.k;
        float b = CX1.b(f, f3, f4);
        float b2 = CX1.b(f2, f3, f4);
        if (b == this.m && b2 == this.n) {
            return;
        }
        this.m = b;
        this.n = b2;
        o((int) CX1.b(this.k, b, b2));
    }

    public final boolean f() {
        return this.h < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.i) {
            return;
        }
        this.i = false;
        this.h = -this.h;
    }

    public final float d() {
        C8985qJ1 c8985qJ1 = this.o;
        if (c8985qJ1 == null) {
            return 0.0f;
        }
        float f = this.m;
        return f == -2.1474836E9f ? c8985qJ1.j : f;
    }

    public final float c() {
        C8985qJ1 c8985qJ1 = this.o;
        if (c8985qJ1 == null) {
            return 0.0f;
        }
        float f = this.n;
        return f == 2.1474836E9f ? c8985qJ1.k : f;
    }

    public final void k(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.p = false;
        }
    }
}
