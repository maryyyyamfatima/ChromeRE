package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rs3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2303Rs3 extends ViewGroup {
    public static final int[] H = {R.attr.enabled};
    public final int A;
    public final int B;
    public boolean C;
    public final AnimationAnimationListenerC0484Ds3 D;
    public float E;
    public final C1523Ls3 F;
    public final C1783Ns3 G;
    public InterfaceC2173Qs3 a;
    public C11580xs3 g;
    public boolean h;
    public final float i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final DecelerateInterpolator n;
    public C3874bS o;
    public int p;
    public int q;
    public float r;
    public int s;
    public C11743yM1 t;
    public C0874Gs3 u;
    public C2043Ps3 v;
    public AnimationAnimationListenerC1264Js3 w;
    public float x;
    public boolean y;
    public boolean z;

    public C2303Rs3(Context context) {
        super(context, null);
        this.h = false;
        this.i = -1.0f;
        this.k = false;
        this.p = -1;
        this.D = new AnimationAnimationListenerC0484Ds3(this);
        this.F = new C1523Ls3(this);
        this.G = new C1783Ns3(this);
        getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.n = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, H);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = (int) (displayMetrics.density * 40.0f);
        this.A = i;
        this.B = i;
        this.o = new C3874bS(getContext());
        C11743yM1 c11743yM1 = new C11743yM1(getContext(), this);
        this.t = c11743yM1;
        c11743yM1.g.w = -328966;
        this.o.setImageDrawable(c11743yM1);
        this.o.setVisibility(8);
        addView(this.o);
        setChildrenDrawingOrderEnabled(true);
        float f = displayMetrics.density * 64.0f;
        this.x = f;
        this.i = f;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.p;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    public final void g(float f) {
        this.o.setScaleX(f);
        this.o.setScaleY(f);
    }

    public final void h(boolean z, boolean z2) {
        if (this.h != z) {
            this.y = z2;
            this.h = z;
            AnimationAnimationListenerC0484Ds3 animationAnimationListenerC0484Ds3 = this.D;
            if (!z) {
                k(animationAnimationListenerC0484Ds3);
                return;
            }
            this.q = this.j;
            C1523Ls3 c1523Ls3 = this.F;
            c1523Ls3.reset();
            c1523Ls3.setDuration(200L);
            c1523Ls3.setInterpolator(this.n);
            if (animationAnimationListenerC0484Ds3 != null) {
                this.o.a = animationAnimationListenerC0484Ds3;
            }
            this.o.clearAnimation();
            this.o.startAnimation(c1523Ls3);
        }
    }

    public final void k(AnimationAnimationListenerC0484Ds3 animationAnimationListenerC0484Ds3) {
        if (this.u == null) {
            C0874Gs3 c0874Gs3 = new C0874Gs3(this);
            this.u = c0874Gs3;
            c0874Gs3.setDuration(150L);
        }
        C3874bS c3874bS = this.o;
        c3874bS.a = animationAnimationListenerC0484Ds3;
        c3874bS.clearAnimation();
        this.o.startAnimation(this.u);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        if (getChildCount() == 0) {
            return;
        }
        int measuredWidth2 = this.o.getMeasuredWidth();
        int measuredHeight = this.o.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.j;
        this.o.layout(i5 - i6, i7, i5 + i6, measuredHeight + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.o.measure(View.MeasureSpec.makeMeasureSpec(this.A, 1073741824), View.MeasureSpec.makeMeasureSpec(this.B, 1073741824));
        if (!this.C && !this.k) {
            this.k = true;
            int i3 = (int) ((-this.o.getMeasuredHeight()) * 1.05f);
            this.s = i3;
            this.j = i3;
        }
        this.p = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.o) {
                this.p = i4;
                return;
            }
        }
    }

    public final boolean j(boolean z) {
        if (!isEnabled() || this.h) {
            return false;
        }
        this.o.clearAnimation();
        this.z = z;
        this.t.stop();
        i(this.s - this.o.getTop());
        this.E = 0.0f;
        this.l = true;
        this.t.setAlpha(76);
        return true;
    }

    public final void d(float f) {
        if (isEnabled() && this.l) {
            float f2 = this.i;
            float f3 = f2 / 3;
            float max = this.E + Math.max(-f3, Math.min(f3, f * 0.5f));
            this.E = max;
            C11400xM1 c11400xM1 = this.t.g;
            if (!c11400xM1.o) {
                c11400xM1.o = true;
                c11400xM1.a();
            }
            float f4 = max / f2;
            if (f4 < 0.0f) {
                return;
            }
            float min = Math.min(1.0f, Math.abs(f4));
            float max2 = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
            float abs = Math.abs(max) - f2;
            float f5 = this.C ? this.x - this.s : this.x;
            double max3 = Math.max(0.0f, Math.min(abs, f5 * 2.0f) / f5) / 4.0f;
            float pow = ((float) (max3 - Math.pow(max3, 2.0d))) * 2.0f;
            int i = this.s + ((int) ((f5 * min) + (f5 * pow * 2.0f)));
            if (this.o.getVisibility() != 0) {
                this.o.setVisibility(0);
            }
            if (!this.m) {
                this.o.setScaleX(1.0f);
                this.o.setScaleY(1.0f);
            }
            if (max < f2 && this.m) {
                g(f4);
            }
            C11743yM1 c11743yM1 = this.t;
            float min2 = Math.min(0.8f, max2 * 0.8f);
            C11400xM1 c11400xM12 = c11743yM1.g;
            c11400xM12.e = 0.0f;
            c11400xM12.a();
            c11400xM12.f = min2;
            c11400xM12.a();
            C11743yM1 c11743yM12 = this.t;
            float min3 = Math.min(1.0f, max2);
            C11400xM1 c11400xM13 = c11743yM12.g;
            if (min3 != c11400xM13.q) {
                c11400xM13.q = min3;
                c11400xM13.a();
            }
            this.t.setAlpha(((int) (Math.max(0.0f, Math.min(1.0f, (min - 0.9f) / 0.1f)) * 179.0f)) + 76);
            C11400xM1 c11400xM14 = this.t.g;
            c11400xM14.g = ((pow * 2.0f) + ((max2 * 0.4f) - 0.25f)) * 0.5f;
            c11400xM14.a();
            i(i - this.j);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        if (this.z && indexOfChild(view) == getChildCount() - 1) {
            return;
        }
        super.bringChildToFront(view);
    }

    public final void e(boolean z) {
        AnimationAnimationListenerC1264Js3 animationAnimationListenerC1264Js3;
        if (this.l) {
            this.l = false;
            float f = this.E;
            if (isEnabled() && z && f > this.i) {
                h(true, true);
                return;
            }
            this.h = false;
            C11400xM1 c11400xM1 = this.t.g;
            c11400xM1.e = 0.0f;
            c11400xM1.a();
            c11400xM1.f = 0.0f;
            c11400xM1.a();
            boolean z2 = this.m;
            if (z2) {
                animationAnimationListenerC1264Js3 = null;
            } else {
                if (this.w == null) {
                    this.w = new AnimationAnimationListenerC1264Js3(this);
                }
                animationAnimationListenerC1264Js3 = this.w;
            }
            int i = this.j;
            if (!z2) {
                this.q = i;
                C1783Ns3 c1783Ns3 = this.G;
                c1783Ns3.reset();
                c1783Ns3.setDuration(200L);
                c1783Ns3.setInterpolator(this.n);
                if (animationAnimationListenerC1264Js3 != null) {
                    this.o.a = animationAnimationListenerC1264Js3;
                }
                this.o.clearAnimation();
                this.o.startAnimation(c1783Ns3);
            } else {
                this.q = i;
                this.r = this.o.getScaleX();
                if (this.v == null) {
                    C2043Ps3 c2043Ps3 = new C2043Ps3(this);
                    this.v = c2043Ps3;
                    c2043Ps3.setDuration(150L);
                }
                if (animationAnimationListenerC1264Js3 != null) {
                    this.o.a = animationAnimationListenerC1264Js3;
                }
                this.o.clearAnimation();
                this.o.startAnimation(this.v);
            }
            C11400xM1 c11400xM12 = this.t.g;
            if (c11400xM12.o) {
                c11400xM12.o = false;
                c11400xM12.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [zs3, java.lang.Runnable] */
    public final void f() {
        this.l = false;
        h(false, false);
        this.t.stop();
        this.o.setVisibility(8);
        this.o.getBackground().setAlpha(255);
        this.t.setAlpha(255);
        if (this.m) {
            g(0.0f);
        } else {
            i(this.s - this.j);
        }
        this.j = this.o.getTop();
        C11580xs3 c11580xs3 = this.g;
        if (c11580xs3 != null) {
            final C0224Bs3 c0224Bs3 = c11580xs3.a;
            if (c0224Bs3.l != null) {
                return;
            }
            ?? r1 = new Runnable() { // from class: zs3
                @Override // java.lang.Runnable
                public final void run() {
                    C0224Bs3 c0224Bs32 = C0224Bs3.this;
                    c0224Bs32.l = null;
                    c0224Bs32.g();
                }
            };
            c0224Bs3.l = r1;
            PostTask.c(AbstractC5103f04.a, r1);
        }
    }

    public final void i(int i) {
        this.o.bringToFront();
        this.o.offsetTopAndBottom(i);
        this.j = this.o.getTop();
    }
}
