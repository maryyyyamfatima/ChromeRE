package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.android.chrome.R;
import java.util.WeakHashMap;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QQ3 extends OU {
    public boolean j;
    public float k;
    public final DC2 l;
    public boolean m;
    public int n;
    public ViewGroup o;
    public int p;
    public final boolean q;
    public final InterfaceC7697ma2 r;
    public TQ3 s;
    public boolean t;
    public View u;
    public final int v;
    public Animator w;
    public final OQ3 x;
    public final TimeAnimator y;

    public QQ3(Context context, int i, View view, C8385oa2 c8385oa2) {
        super(context, i);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: LQ3
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                QQ3.this.i();
            }
        };
        this.x = new OQ3(this);
        TimeAnimator timeAnimator = new TimeAnimator();
        this.y = timeAnimator;
        timeAnimator.setTimeListener(new PQ3(this));
        this.v = i;
        this.r = c8385oa2;
        setAlpha(0.0f);
        View view2 = this.u;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.u = view;
            i();
            View view3 = this.u;
            if (view3 != null) {
                view3.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        }
        this.q = false;
        this.l = new DC2();
        c8385oa2.m(new Callback() { // from class: MQ3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                QQ3 qq3 = QQ3.this;
                qq3.getClass();
                qq3.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
            }
        });
        WeakHashMap weakHashMap = Ec4.a;
        setAccessibilityLiveRegion(1);
    }

    public final void f(int i) {
        this.a.setColor(i);
        TQ3 tq3 = this.s;
        if (tq3 != null) {
            tq3.a.setColor(AbstractC3899bX.a(i, -1, 0.4f, false));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t = true;
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = this.n;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t = false;
        TimeAnimator timeAnimator = this.y;
        timeAnimator.setTimeListener(null);
        timeAnimator.cancel();
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        TQ3 tq3 = this.s;
        if (tq3 != null) {
            tq3.setAlpha(f);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        TQ3 tq3 = this.s;
        if (tq3 != null) {
            tq3.h = i * this.h;
            tq3.a(tq3.o, tq3.n);
        }
    }

    public final void e() {
        if (this.m) {
            return;
        }
        this.m = true;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getLayoutParams());
        layoutParams.width = 1;
        layoutParams.topMargin = this.n;
        this.s = new TQ3(getContext(), layoutParams);
        int i = this.p;
        if (i != 0 || this.q) {
            g(i, false);
        } else {
            f(this.a.getColor());
        }
        AbstractC8540p04.f(this.o, this.s, this, true);
    }

    public final void h() {
        Object obj = ThreadUtils.a;
        this.j = true;
        OQ3 oq3 = this.x;
        removeCallbacks(oq3);
        postDelayed(oq3, 5000L);
        super.a(0.0f);
        DC2 dc2 = this.l;
        dc2.a = 0.0f;
        dc2.b = 0.0f;
        c(1.0f);
    }

    public final void d(boolean z) {
        Object obj = ThreadUtils.a;
        boolean a = JM1.a(this.h, 1.0f);
        TimeAnimator timeAnimator = this.y;
        if (!a) {
            a(1.0f);
            if (timeAnimator.isRunning() && z) {
                return;
            }
        }
        this.j = false;
        this.k = 0.0f;
        removeCallbacks(this.x);
        TQ3 tq3 = this.s;
        if (tq3 != null) {
            tq3.l = true;
            tq3.i.cancel();
            tq3.setScaleX(0.0f);
            tq3.setTranslationX(0.0f);
            tq3.animate().cancel();
            tq3.setAlpha(0.0f);
            tq3.n = 0.0f;
            tq3.h = 0.0f;
        }
        timeAnimator.cancel();
        if (z) {
            postDelayed(new Runnable() { // from class: NQ3
                @Override // java.lang.Runnable
                public final void run() {
                    QQ3 qq3 = QQ3.this;
                    qq3.getClass();
                    Object obj2 = ThreadUtils.a;
                    if (qq3.j) {
                        return;
                    }
                    qq3.c(0.0f);
                }
            }, 100L);
        } else {
            if (this.j) {
                return;
            }
            animate().cancel();
            setAlpha(0.0f);
        }
    }

    public final void c(float f) {
        float alpha = f - getAlpha();
        if (alpha == 0.0f) {
            return;
        }
        long abs = Math.abs(140.0f * alpha);
        InterpolatorC0485Dt interpolatorC0485Dt = InterpolatorC0485Dt.e;
        if (alpha < 0.0f) {
            interpolatorC0485Dt = InterpolatorC0485Dt.d;
        }
        Animator animator = this.w;
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<QQ3, Float>) ImageView.ALPHA, getAlpha(), f);
        ofFloat.setDuration(abs);
        ofFloat.setInterpolator(interpolatorC0485Dt);
        this.w = ofFloat;
        TQ3 tq3 = this.s;
        if (tq3 != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tq3, (Property<TQ3, Float>) ImageView.ALPHA, tq3.getAlpha(), f);
            ofFloat2.setDuration(abs);
            ofFloat2.setInterpolator(interpolatorC0485Dt);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(this.w, ofFloat2);
            this.w = animatorSet;
        }
        this.w.start();
    }

    @Override // defpackage.OU
    public final void a(float f) {
        Object obj = ThreadUtils.a;
        if (!this.j || JM1.a(this.k, f)) {
            return;
        }
        this.k = f;
        OQ3 oq3 = this.x;
        removeCallbacks(oq3);
        if (!this.y.isRunning()) {
            postDelayed(oq3, 5000L);
            super.a(this.k);
        }
        sendAccessibilityEvent(4);
        if (JM1.a(f, 1.0f) || f > 1.0f) {
            d(true);
        }
    }

    @Override // defpackage.OU, android.widget.ImageView, android.view.View
    public final void setVisibility(int i) {
        if (!((Boolean) ((C8385oa2) this.r).g).booleanValue()) {
            i = 8;
        }
        super.setVisibility(i);
        TQ3 tq3 = this.s;
        if (tq3 != null) {
            tq3.setVisibility(i);
        }
    }

    public final void g(int i, boolean z) {
        this.p = i;
        boolean e = AbstractC3494aK3.e(this.p, getContext(), z);
        if (this.q) {
            if (e) {
                i = -16777216;
            }
            f(getContext().getColor(R.color.f24830_resource_name_obfuscated_res_0x7f0707a6));
            setBackgroundColor(AbstractC3899bX.b(i));
            return;
        }
        if ((e || AbstractC3899bX.f(i)) && !z) {
            f(AbstractC10957w33.b(getContext()));
            setBackgroundColor(getContext().getColor(R.color.f25840_resource_name_obfuscated_res_0x7f070827));
            return;
        }
        f((AbstractC3899bX.g(i) || z) ? -1 : AbstractC3899bX.a(i, -16777216, 0.64f, false));
        if (this.s != null && (AbstractC3899bX.g(i) || z)) {
            this.s.a.setColor(AbstractC3899bX.a(i, -1, 0.4f, false));
        }
        setBackgroundColor(AbstractC3899bX.a(i, -1, 0.2f, false));
    }

    @Override // android.widget.ImageView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setCurrentItemIndex((int) (this.k * 100.0f));
        accessibilityEvent.setItemCount(100);
    }

    public final void i() {
        View view = this.u;
        int bottom = (view != null ? view.getBottom() : 0) - this.v;
        if (this.n != bottom) {
            this.n = bottom;
            if (this.t) {
                ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = this.n;
                TQ3 tq3 = this.s;
                if (tq3 == null || tq3.getLayoutParams() == null) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this.s.getLayoutParams()).topMargin = this.n;
            }
        }
    }
}
