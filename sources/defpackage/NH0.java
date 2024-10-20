package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NH0 extends AbstractC10705vK2 implements CK2 {
    public static final int[] H = {R.attr.state_pressed};
    public static final int[] I = new int[0];
    public final ValueAnimator E;
    public int F;
    public final JH0 G;
    public final int a;
    public final int g;
    public final StateListDrawable h;
    public final Drawable i;
    public final int j;
    public final int k;
    public final StateListDrawable l;
    public final Drawable m;
    public final int n;
    public final int o;
    public int p;
    public int q;
    public float r;
    public int s;
    public int t;
    public float u;
    public RecyclerView x;
    public int v = 0;
    public int w = 0;
    public boolean y = false;
    public boolean z = false;
    public int A = 0;
    public int B = 0;
    public final int[] C = new int[2];
    public final int[] D = new int[2];

    @Override // defpackage.CK2
    public final void e(boolean z) {
    }

    public NH0(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.E = ofFloat;
        this.F = 0;
        JH0 jh0 = new JH0(this);
        this.G = jh0;
        KH0 kh0 = new KH0(this);
        this.h = stateListDrawable;
        this.i = drawable;
        this.l = stateListDrawable2;
        this.m = drawable2;
        this.j = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.k = Math.max(i, drawable.getIntrinsicWidth());
        this.n = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.o = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.g = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new LH0(this));
        ofFloat.addUpdateListener(new MH0(this));
        RecyclerView recyclerView2 = this.x;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.f0(this);
            this.x.g0(this);
            this.x.h0(kh0);
            this.x.removeCallbacks(jh0);
        }
        this.x = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.x.w.add(this);
            this.x.i(kh0);
        }
    }

    public final void l(int i) {
        JH0 jh0 = this.G;
        StateListDrawable stateListDrawable = this.h;
        if (i == 2 && this.A != 2) {
            stateListDrawable.setState(H);
            this.x.removeCallbacks(jh0);
        }
        if (i == 0) {
            this.x.invalidate();
        } else {
            m();
        }
        if (this.A == 2 && i != 2) {
            stateListDrawable.setState(I);
            this.x.removeCallbacks(jh0);
            this.x.postDelayed(jh0, 1200);
        } else if (i == 1) {
            this.x.removeCallbacks(jh0);
            this.x.postDelayed(jh0, 1500);
        }
        this.A = i;
    }

    public final boolean k(float f, float f2) {
        RecyclerView recyclerView = this.x;
        WeakHashMap weakHashMap = Ec4.a;
        boolean z = recyclerView.getLayoutDirection() == 1;
        int i = this.j;
        if (z) {
            if (f > i) {
                return false;
            }
        } else if (f < this.v - i) {
            return false;
        }
        int i2 = this.q;
        int i3 = this.p / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void m() {
        int i = this.F;
        ValueAnimator valueAnimator = this.E;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.F = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // defpackage.AbstractC10705vK2
    public final void i(Canvas canvas, RecyclerView recyclerView) {
        if (this.v != this.x.getWidth() || this.w != this.x.getHeight()) {
            this.v = this.x.getWidth();
            this.w = this.x.getHeight();
            l(0);
            return;
        }
        if (this.F != 0) {
            if (this.y) {
                int i = this.v;
                int i2 = this.j;
                int i3 = i - i2;
                int i4 = this.q;
                int i5 = this.p;
                int i6 = i4 - (i5 / 2);
                StateListDrawable stateListDrawable = this.h;
                stateListDrawable.setBounds(0, 0, i2, i5);
                int i7 = this.w;
                int i8 = this.k;
                Drawable drawable = this.i;
                drawable.setBounds(0, 0, i8, i7);
                RecyclerView recyclerView2 = this.x;
                WeakHashMap weakHashMap = Ec4.a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i2, i6);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i2, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i6);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.z) {
                int i9 = this.w;
                int i10 = this.n;
                int i11 = i9 - i10;
                int i12 = this.t;
                int i13 = this.s;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable2 = this.l;
                stateListDrawable2.setBounds(0, 0, i13, i10);
                int i15 = this.v;
                int i16 = this.o;
                Drawable drawable2 = this.m;
                drawable2.setBounds(0, 0, i15, i16);
                canvas.translate(0.0f, i11);
                drawable2.draw(canvas);
                canvas.translate(i14, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i14, -i11);
            }
        }
    }

    @Override // defpackage.CK2
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.A;
        if (i == 1) {
            boolean k = k(motionEvent.getX(), motionEvent.getY());
            boolean j = j(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (k || j)) {
                if (j) {
                    this.B = 1;
                    this.u = (int) motionEvent.getX();
                } else if (k) {
                    this.B = 2;
                    this.r = (int) motionEvent.getY();
                }
                l(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:            if (r9 >= 0) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:            if (r5 >= 0) goto L49;     */
    @Override // defpackage.CK2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.NH0.a(android.view.MotionEvent):void");
    }

    public final boolean j(float f, float f2) {
        if (f2 >= this.w - this.n) {
            int i = this.t;
            int i2 = this.s;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }
}
