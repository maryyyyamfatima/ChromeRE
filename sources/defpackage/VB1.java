package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class VB1 {
    public RecyclerView b;
    public AbstractC12077zK2 c;
    public boolean d;
    public boolean e;
    public View f;
    public boolean h;
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public int a = -1;
    public final JK2 g = new JK2();
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public void i(View view, JK2 jk2) {
        int i;
        int f = f();
        AbstractC12077zK2 abstractC12077zK2 = this.c;
        int i2 = 0;
        if (abstractC12077zK2 == null || !abstractC12077zK2.e()) {
            i = 0;
        } else {
            AK2 ak2 = (AK2) view.getLayoutParams();
            i = a((view.getLeft() - AbstractC12077zK2.E(view)) - ((ViewGroup.MarginLayoutParams) ak2).leftMargin, AbstractC12077zK2.L(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) ak2).rightMargin, abstractC12077zK2.G(), abstractC12077zK2.n - abstractC12077zK2.H(), f);
        }
        int g = g();
        AbstractC12077zK2 abstractC12077zK22 = this.c;
        if (abstractC12077zK22 != null && abstractC12077zK22.f()) {
            AK2 ak22 = (AK2) view.getLayoutParams();
            i2 = a((view.getTop() - AbstractC12077zK2.N(view)) - ((ViewGroup.MarginLayoutParams) ak22).topMargin, AbstractC12077zK2.v(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) ak22).bottomMargin, abstractC12077zK22.I(), abstractC12077zK22.o - abstractC12077zK22.F(), g);
        }
        int c = c((int) Math.sqrt((i2 * i2) + (i * i)));
        if (c > 0) {
            jk2.b(-i, -i2, c, this.j);
        }
    }

    public float b(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final int c(int i) {
        return (int) Math.ceil(d(i) / 0.3356d);
    }

    public int d(int i) {
        float abs = Math.abs(i);
        if (!this.m) {
            this.n = b(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }

    public int f() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public int g() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public VB1(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    public final PointF e(int i) {
        Object obj = this.c;
        if (obj instanceof KK2) {
            return ((KK2) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + KK2.class.getCanonicalName());
        return null;
    }

    public final void j() {
        if (this.e) {
            this.e = false;
            this.p = 0;
            this.o = 0;
            this.k = null;
            this.b.n0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            AbstractC12077zK2 abstractC12077zK2 = this.c;
            if (abstractC12077zK2.e == this) {
                abstractC12077zK2.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }

    public final void h(int i, int i2) {
        PointF e;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            j();
        }
        if (this.d && this.f == null && this.c != null && (e = e(this.a)) != null) {
            float f = e.x;
            if (f != 0.0f || e.y != 0.0f) {
                recyclerView.l0((int) Math.signum(f), (int) Math.signum(e.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        JK2 jk2 = this.g;
        if (view != null) {
            this.b.getClass();
            d L = RecyclerView.L(view);
            if ((L != null ? L.h() : -1) == this.a) {
                View view2 = this.f;
                LK2 lk2 = recyclerView.n0;
                i(view2, jk2);
                jk2.a(recyclerView);
                j();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            LK2 lk22 = recyclerView.n0;
            if (this.b.s.x() == 0) {
                j();
            } else {
                int i3 = this.o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.o = i4;
                int i5 = this.p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF e2 = e(this.a);
                    if (e2 != null) {
                        if (e2.x != 0.0f || e2.y != 0.0f) {
                            float f2 = e2.y;
                            float sqrt = (float) Math.sqrt((f2 * f2) + (r10 * r10));
                            float f3 = e2.x / sqrt;
                            e2.x = f3;
                            float f4 = e2.y / sqrt;
                            e2.y = f4;
                            this.k = e2;
                            this.o = (int) (f3 * 10000.0f);
                            this.p = (int) (f4 * 10000.0f);
                            jk2.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (d(10000) * 1.2f), this.i);
                        }
                    }
                    jk2.d = this.a;
                    j();
                }
            }
            boolean z = jk2.d >= 0;
            jk2.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.k0.b();
            }
        }
    }
}
