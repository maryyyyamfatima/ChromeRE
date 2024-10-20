package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.OverScroller;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Nc4 {
    public static final Lc4 v = new Lc4();
    public int a;
    public int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public final float n;
    public final int o;
    public final OverScroller p;
    public final C9522rs3 q;
    public View r;
    public boolean s;
    public final ViewGroup t;
    public int c = -1;
    public final Mc4 u = new Mc4(this);

    public Nc4(Context context, ViewGroup viewGroup, C9522rs3 c9522rs3) {
        if (viewGroup == null) {
            throw new NullPointerException("Parent view may not be null");
        }
        if (c9522rs3 != null) {
            this.t = viewGroup;
            this.q = c9522rs3;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.p = new OverScroller(context, v);
            return;
        }
        throw new NullPointerException("Callback may not be null");
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final int e(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        float width = this.t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x005b, code lost:            if (java.lang.Math.abs(r6) >= java.lang.Math.round(r10 * 0.5f)) goto L27;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(float r21) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Nc4.f(float):void");
    }

    public final void d(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (~i3) & i2;
            }
        }
    }

    public final void j(int i, float f, float f2) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.e;
        this.g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.h;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.t;
        int left = viewGroup.getLeft();
        int i5 = this.o;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < viewGroup.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > viewGroup.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > viewGroup.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.k = (1 << i) | this.k;
    }

    public final void k(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.k & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    public final void l(int i) {
        this.t.removeCallbacks(this.u);
        if (this.a != i) {
            this.a = i;
            C2189Qw c2189Qw = this.q.c.b;
            if (c2189Qw != null) {
                AbstractC2969Ww abstractC2969Ww = c2189Qw.a;
                if (i == 0) {
                    C1199Jf3 b = C1199Jf3.b();
                    C1929Ow c1929Ow = abstractC2969Ww.m;
                    synchronized (b.a) {
                        if (b.c(c1929Ow)) {
                            C0939Hf3 c0939Hf3 = b.c;
                            if (c0939Hf3.c) {
                                c0939Hf3.c = false;
                                b.d(c0939Hf3);
                            }
                        }
                    }
                } else if (i == 1 || i == 2) {
                    C1199Jf3 b2 = C1199Jf3.b();
                    C1929Ow c1929Ow2 = abstractC2969Ww.m;
                    synchronized (b2.a) {
                        if (b2.c(c1929Ow2)) {
                            C0939Hf3 c0939Hf32 = b2.c;
                            if (!c0939Hf32.c) {
                                c0939Hf32.c = true;
                                b2.b.removeCallbacksAndMessages(c0939Hf32);
                            }
                        }
                    }
                }
            }
            if (this.a == 0) {
                this.r = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(android.view.View r6, int r7) {
        /*
            r5 = this;
            android.view.View r0 = r5.r
            r1 = 1
            if (r6 != r0) goto La
            int r0 = r5.c
            if (r0 != r7) goto La
            return r1
        La:
            r0 = 0
            if (r6 == 0) goto L62
            rs3 r2 = r5.q
            int r3 = r2.b
            r4 = -1
            if (r3 == r4) goto L16
            if (r3 != r7) goto L23
        L16:
            Tw r3 = r2.c
            Uw r3 = r3.h
            r3.getClass()
            boolean r3 = r6 instanceof com.google.android.material.snackbar.Snackbar$SnackbarLayout
            if (r3 == 0) goto L23
            r3 = r1
            goto L24
        L23:
            r3 = r0
        L24:
            if (r3 == 0) goto L62
            r5.c = r7
            android.view.ViewParent r0 = r6.getParent()
            android.view.ViewGroup r3 = r5.t
            if (r0 != r3) goto L49
            r5.r = r6
            r5.c = r7
            r2.b = r7
            int r7 = r6.getLeft()
            r2.a = r7
            android.view.ViewParent r6 = r6.getParent()
            if (r6 == 0) goto L45
            r6.requestDisallowInterceptTouchEvent(r1)
        L45:
            r5.l(r1)
            return r1
        L49:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view ("
            r7.<init>(r0)
            r7.append(r3)
            java.lang.String r0 = ")"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Nc4.m(android.view.View, int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void i(int i, float f, float f2) {
        boolean b = b(f, i, f2, 1);
        boolean z = b;
        if (b(f2, i, f, 4)) {
            z = (b ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (b(f, i, f2, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (b(f2, i, f, 8)) {
            r0 = (z2 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r0;
            this.q.getClass();
        }
    }

    public final boolean b(float f, int i, float f2, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (0 & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.q.getClass();
        }
        return (this.i[i] & i2) == 0 && abs > ((float) this.b);
    }

    public final boolean c(View view, float f) {
        if (view == null) {
            return false;
        }
        this.q.getClass();
        return (view.getWidth() > 0) && Math.abs(f) > ((float) this.b);
    }

    public final void h() {
        VelocityTracker velocityTracker = this.l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.l.getXVelocity(this.c);
        float abs = Math.abs(xVelocity);
        float f2 = this.n;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float abs2 = Math.abs(this.l.getYVelocity(this.c));
        if (abs2 >= f2) {
            int i = (abs2 > f ? 1 : (abs2 == f ? 0 : -1));
        }
        f(xVelocity);
    }

    public final View g(int i, int i2) {
        ViewGroup viewGroup = this.t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }
}
