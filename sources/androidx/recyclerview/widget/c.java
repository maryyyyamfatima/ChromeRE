package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import defpackage.C10425uX0;
import defpackage.Ec4;
import defpackage.InterpolatorC6929kK2;
import defpackage.VB1;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public int a;
    public int g;
    public OverScroller h;
    public Interpolator i;
    public boolean j;
    public boolean k;
    public final /* synthetic */ RecyclerView l;

    public c(RecyclerView recyclerView) {
        this.l = recyclerView;
        InterpolatorC6929kK2 interpolatorC6929kK2 = RecyclerView.N0;
        this.i = interpolatorC6929kK2;
        this.j = false;
        this.k = false;
        this.h = new OverScroller(recyclerView.getContext(), interpolatorC6929kK2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.l;
        if (recyclerView.s != null) {
            this.k = false;
            this.j = true;
            recyclerView.o();
            OverScroller overScroller = this.h;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.a;
                int i4 = currY - this.g;
                this.a = currX;
                this.g = currY;
                int n = RecyclerView.n(i3, recyclerView.O, recyclerView.Q, recyclerView.getWidth());
                int n2 = RecyclerView.n(i4, recyclerView.P, recyclerView.R, recyclerView.getHeight());
                int[] iArr = recyclerView.A0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean c = recyclerView.P().c(n, n2, 1, iArr, null);
                int[] iArr2 = recyclerView.A0;
                if (c) {
                    n -= iArr2[0];
                    n2 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.m(n, n2);
                }
                if (recyclerView.r != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.l0(n, n2, iArr2);
                    i = iArr2[0];
                    i2 = iArr2[1];
                    n -= i;
                    n2 -= i2;
                    VB1 vb1 = recyclerView.s.e;
                    if (vb1 != null && !vb1.d && vb1.e) {
                        int b = recyclerView.n0.b();
                        if (b == 0) {
                            vb1.j();
                        } else if (vb1.a < b) {
                            vb1.h(i, i2);
                        } else {
                            vb1.a = b - 1;
                            vb1.h(i, i2);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!recyclerView.v.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.A0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.P().d(i, i2, n, n2, null, 1, iArr3);
                int i5 = n - iArr2[0];
                int i6 = n2 - iArr2[1];
                if (i != 0 || i2 != 0) {
                    recyclerView.u(i, i2);
                }
                awakenScrollBars = recyclerView.awakenScrollBars();
                if (!awakenScrollBars) {
                    recyclerView.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                VB1 vb12 = recyclerView.s.e;
                if (!(vb12 != null && vb12.d) && z) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        if (i7 < 0) {
                            recyclerView.w();
                            if (recyclerView.O.isFinished()) {
                                recyclerView.O.onAbsorb(-i7);
                            }
                        } else if (i7 > 0) {
                            recyclerView.x();
                            if (recyclerView.Q.isFinished()) {
                                recyclerView.Q.onAbsorb(i7);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.y();
                            if (recyclerView.P.isFinished()) {
                                recyclerView.P.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.v();
                            if (recyclerView.R.isFinished()) {
                                recyclerView.R.onAbsorb(currVelocity);
                            }
                        }
                        if (i7 != 0 || currVelocity != 0) {
                            WeakHashMap weakHashMap = Ec4.a;
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                    if (RecyclerView.L0) {
                        C10425uX0 c10425uX0 = recyclerView.m0;
                        int[] iArr4 = c10425uX0.c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        c10425uX0.d = 0;
                    }
                } else {
                    b();
                    a aVar = recyclerView.l0;
                    if (aVar != null) {
                        aVar.a(recyclerView, i, i2);
                    }
                }
            }
            VB1 vb13 = recyclerView.s.e;
            if (vb13 != null && vb13.d) {
                vb13.h(0, 0);
            }
            this.j = false;
            if (!this.k) {
                recyclerView.r0(0);
                recyclerView.P().g(1);
                return;
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap weakHashMap2 = Ec4.a;
                recyclerView.postOnAnimation(this);
                return;
            }
        }
        recyclerView.removeCallbacks(this);
        this.h.abortAnimation();
    }

    public final void b() {
        if (this.j) {
            this.k = true;
            return;
        }
        RecyclerView recyclerView = this.l;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = Ec4.a;
        recyclerView.postOnAnimation(this);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.l;
        recyclerView.r0(2);
        this.g = 0;
        this.a = 0;
        Interpolator interpolator = this.i;
        InterpolatorC6929kK2 interpolatorC6929kK2 = RecyclerView.N0;
        if (interpolator != interpolatorC6929kK2) {
            this.i = interpolatorC6929kK2;
            this.h = new OverScroller(recyclerView.getContext(), interpolatorC6929kK2);
        }
        this.h.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.l;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.N0;
        }
        if (this.i != interpolator) {
            this.i = interpolator;
            this.h = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.g = 0;
        this.a = 0;
        recyclerView.r0(2);
        this.h.startScroll(0, 0, i, i2, i4);
        b();
    }
}
