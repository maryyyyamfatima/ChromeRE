package defpackage;

import android.animation.Animator;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JJ1 extends Drawable implements Drawable.Callback, Animatable {
    public final Matrix a = new Matrix();
    public C8985qJ1 g;
    public final SJ1 h;
    public float i;
    public boolean j;
    public boolean k;
    public final ArrayList l;
    public C1462Lg1 m;
    public String n;
    public C11767yR0 o;
    public boolean p;
    public T10 q;
    public int r;
    public boolean s;
    public boolean t;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void e() {
        SJ1 sj1 = this.h;
        if (sj1.p) {
            sj1.cancel();
        }
        this.g = null;
        this.q = null;
        this.m = null;
        sj1.o = null;
        sj1.m = -2.1474836E9f;
        sj1.n = 2.1474836E9f;
        invalidateSelf();
    }

    public JJ1() {
        SJ1 sj1 = new SJ1();
        this.h = sj1;
        this.i = 1.0f;
        this.j = true;
        this.k = false;
        this.l = new ArrayList();
        FJ1 fj1 = new FJ1(this);
        this.r = 255;
        this.s = true;
        this.t = false;
        sj1.addUpdateListener(fj1);
    }

    public final void d() {
        C8985qJ1 c8985qJ1 = this.g;
        C2826Vt1 c2826Vt1 = AbstractC2586Tx1.a;
        Rect rect = c8985qJ1.i;
        C2456Sx1 c2456Sx1 = new C2456Sx1(Collections.emptyList(), c8985qJ1, "__container", -1L, 1, -1L, null, Collections.emptyList(), new C9759sb(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false);
        C8985qJ1 c8985qJ12 = this.g;
        this.q = new T10(this, c2456Sx1, c8985qJ12.h, c8985qJ12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.t) {
            return;
        }
        this.t = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.r = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.r;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC5888hI1.a("Use addColorFilter instead.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:            if (r3 == (r1.width() / r1.height())) goto L177;     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.JJ1.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        f();
    }

    public final void f() {
        float c;
        if (this.q == null) {
            this.l.add(new GJ1(this));
            return;
        }
        boolean c2 = c();
        SJ1 sj1 = this.h;
        if (c2 || sj1.getRepeatCount() == 0) {
            sj1.p = true;
            boolean f = sj1.f();
            Iterator it = sj1.g.iterator();
            while (it.hasNext()) {
                Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(sj1, f);
                } else {
                    animatorListener.onAnimationStart(sj1);
                }
            }
            sj1.o((int) (sj1.f() ? sj1.c() : sj1.d()));
            sj1.j = 0L;
            sj1.l = 0;
            if (sj1.p) {
                sj1.k(false);
                Choreographer.getInstance().postFrameCallback(sj1);
            }
        }
        if (c()) {
            return;
        }
        if (sj1.h < 0.0f) {
            c = sj1.d();
        } else {
            c = sj1.c();
        }
        h((int) c);
        sj1.k(true);
        sj1.g(sj1.f());
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.l.clear();
        SJ1 sj1 = this.h;
        sj1.k(true);
        sj1.g(sj1.f());
    }

    public final void g() {
        float c;
        if (this.q == null) {
            this.l.add(new HJ1(this));
            return;
        }
        boolean c2 = c();
        SJ1 sj1 = this.h;
        if (c2 || sj1.getRepeatCount() == 0) {
            sj1.p = true;
            sj1.k(false);
            Choreographer.getInstance().postFrameCallback(sj1);
            sj1.j = 0L;
            if (sj1.f() && sj1.k == sj1.d()) {
                sj1.k = sj1.c();
            } else if (!sj1.f() && sj1.k == sj1.c()) {
                sj1.k = sj1.d();
            }
        }
        if (c()) {
            return;
        }
        if (sj1.h < 0.0f) {
            c = sj1.d();
        } else {
            c = sj1.c();
        }
        h((int) c);
        sj1.k(true);
        sj1.g(sj1.f());
    }

    public final void i(int i, int i2) {
        if (this.g == null) {
            this.l.add(new AJ1(this, i, i2));
        } else {
            this.h.q(i, i2 + 0.99f);
        }
    }

    public final void j(float f, float f2) {
        C8985qJ1 c8985qJ1 = this.g;
        if (c8985qJ1 != null) {
            float f3 = c8985qJ1.j;
            float f4 = c8985qJ1.k;
            PointF pointF = CX1.a;
            i((int) AbstractC2277Rn2.a(f4, f3, f, f3), (int) AbstractC2277Rn2.a(f4, f3, f2, f3));
            return;
        }
        this.l.add(new BJ1(this, f, f2));
    }

    public final void h(int i) {
        if (this.g == null) {
            this.l.add(new CJ1(this, i));
        } else {
            this.h.o(i);
        }
    }

    public final void k(float f) {
        C8985qJ1 c8985qJ1 = this.g;
        if (c8985qJ1 != null) {
            float f2 = c8985qJ1.j;
            float f3 = c8985qJ1.k;
            PointF pointF = CX1.a;
            this.h.o(AbstractC2277Rn2.a(f3, f2, f, f2));
            AbstractC2576Tv1.a();
            return;
        }
        this.l.add(new DJ1(this, f));
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        SJ1 sj1 = this.h;
        if (sj1 == null) {
            return false;
        }
        return sj1.p;
    }

    public final boolean c() {
        return this.j || this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (this.g == null) {
            return -1;
        }
        return (int) (r0.i.width() * this.i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (this.g == null) {
            return -1;
        }
        return (int) (r0.i.height() * this.i);
    }

    public final void b(C8847pu1 c8847pu1, Object obj, TJ1 tj1) {
        float f;
        T10 t10 = this.q;
        if (t10 == null) {
            this.l.add(new EJ1(this, c8847pu1, obj, tj1));
            return;
        }
        boolean z = true;
        if (c8847pu1 != C8847pu1.c) {
            InterfaceC9190qu1 interfaceC9190qu1 = c8847pu1.b;
            if (interfaceC9190qu1 == null) {
                ArrayList arrayList = new ArrayList();
                this.q.c(c8847pu1, 0, arrayList, new C8847pu1(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((C8847pu1) arrayList.get(i)).b.f(tj1, obj);
                }
                z = true ^ arrayList.isEmpty();
            } else {
                interfaceC9190qu1.f(tj1, obj);
            }
        } else {
            t10.f(tj1, obj);
        }
        if (z) {
            invalidateSelf();
            if (obj == NJ1.C) {
                SJ1 sj1 = this.h;
                C8985qJ1 c8985qJ1 = sj1.o;
                if (c8985qJ1 == null) {
                    f = 0.0f;
                } else {
                    float f2 = sj1.k;
                    float f3 = c8985qJ1.j;
                    f = (f2 - f3) / (c8985qJ1.k - f3);
                }
                k(f);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
