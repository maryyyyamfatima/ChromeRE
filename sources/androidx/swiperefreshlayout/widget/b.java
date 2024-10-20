package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.swiperefreshlayout.widget.b;
import defpackage.AnimationAnimationListenerC0614Es3;
import defpackage.AnimationAnimationListenerC1394Ks3;
import defpackage.C0744Fs3;
import defpackage.C1004Hs3;
import defpackage.C1134Is3;
import defpackage.C1653Ms3;
import defpackage.C1913Os3;
import defpackage.C4217cS;
import defpackage.C5211fK2;
import defpackage.C5936hS;
import defpackage.C6280iS;
import defpackage.C8893q22;
import defpackage.C9921t22;
import defpackage.Ec4;
import defpackage.G13;
import defpackage.InterfaceC8550p22;
import defpackage.InterfaceC9235r22;
import defpackage.InterfaceC9578s22;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class b extends ViewGroup implements InterfaceC9578s22, InterfaceC9235r22, InterfaceC8550p22 {
    public static final int[] N = {R.attr.enabled};
    public int A;
    public final int B;
    public final int C;
    public C6280iS D;
    public C0744Fs3 E;
    public C1004Hs3 F;
    public C1134Is3 G;
    public C1134Is3 H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final int f11491J;
    public final AnimationAnimationListenerC0614Es3 K;
    public final C1653Ms3 L;
    public final C1913Os3 M;
    public View a;
    public C5211fK2 g;
    public boolean h;
    public final int i;
    public final float j;
    public float k;
    public final C9921t22 l;
    public final C8893q22 m;
    public final int[] n;
    public final int[] o;
    public final int[] p;
    public boolean q;
    public final int r;
    public int s;
    public float t;
    public float u;
    public boolean v;
    public int w;
    public final DecelerateInterpolator x;
    public C4217cS y;
    public int z;

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        C8893q22 c8893q22 = this.m;
        if (c8893q22.d) {
            WeakHashMap weakHashMap = Ec4.a;
            c8893q22.c.stopNestedScroll();
        }
        c8893q22.d = z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.l.a = i;
        startNestedScroll(i & 2);
        this.k = 0.0f;
        this.q = true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.m.d;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        C9921t22 c9921t22 = this.l;
        return c9921t22.b | c9921t22.a;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.m.e(0) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.l.a = 0;
        this.q = false;
        float f = this.k;
        if (f > 0.0f) {
            l(f);
            this.k = 0.0f;
        } else {
            post(new Runnable() { // from class: Cs3
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.o();
                }
            });
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.m.f(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.m.g(0);
    }

    public final void o() {
        this.y.clearAnimation();
        this.D.stop();
        this.y.setVisibility(8);
        this.y.getBackground().setAlpha(255);
        this.D.setAlpha(255);
        r(this.B - this.s);
        this.s = this.y.getTop();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 285) {
            q(true, true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SwipeRefreshLayout$SavedState(super.onSaveInstanceState(), this.h);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SwipeRefreshLayout$SavedState swipeRefreshLayout$SavedState = (SwipeRefreshLayout$SavedState) parcelable;
        super.onRestoreInstanceState(swipeRefreshLayout$SavedState.getSuperState());
        q(swipeRefreshLayout$SavedState.a, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
    }

    public b(Context context) {
        super(context, null);
        this.h = false;
        this.j = -1.0f;
        this.n = new int[2];
        this.o = new int[2];
        this.p = new int[2];
        this.w = -1;
        this.z = -1;
        G13 g13 = (G13) this;
        this.K = new AnimationAnimationListenerC0614Es3(g13);
        this.L = new C1653Ms3(g13);
        this.M = new C1913Os3(g13);
        this.i = ViewConfiguration.get(context).getScaledTouchSlop();
        this.r = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.x = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = (int) (displayMetrics.density * 40.0f);
        this.f11491J = i;
        this.y = new C4217cS(getContext());
        C6280iS c6280iS = new C6280iS(getContext());
        this.D = c6280iS;
        c6280iS.d(1);
        this.y.setImageDrawable(this.D);
        this.y.setVisibility(8);
        addView(this.y);
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.C = i2;
        this.j = i2;
        this.l = new C9921t22();
        this.m = new C8893q22(this);
        setNestedScrollingEnabled(true);
        int i3 = -i;
        this.s = i3;
        this.B = i3;
        n(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, N);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.z;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    public final void q(boolean z, boolean z2) {
        if (z && this.h != z) {
            this.h = z;
            r((this.C + this.B) - this.s);
            this.I = z2;
            this.y.setVisibility(0);
            this.D.setAlpha(255);
            C0744Fs3 c0744Fs3 = new C0744Fs3(this);
            this.E = c0744Fs3;
            c0744Fs3.setDuration(this.r);
            AnimationAnimationListenerC0614Es3 animationAnimationListenerC0614Es3 = this.K;
            if (animationAnimationListenerC0614Es3 != null) {
                this.y.a = animationAnimationListenerC0614Es3;
            }
            this.y.clearAnimation();
            this.y.startAnimation(this.E);
            return;
        }
        p(z, false);
    }

    public final void p(boolean z, boolean z2) {
        if (this.h != z) {
            this.I = z2;
            k();
            this.h = z;
            AnimationAnimationListenerC0614Es3 animationAnimationListenerC0614Es3 = this.K;
            if (!z) {
                C1004Hs3 c1004Hs3 = new C1004Hs3(this);
                this.F = c1004Hs3;
                c1004Hs3.setDuration(150L);
                C4217cS c4217cS = this.y;
                c4217cS.a = animationAnimationListenerC0614Es3;
                c4217cS.clearAnimation();
                this.y.startAnimation(this.F);
                return;
            }
            this.A = this.s;
            C1653Ms3 c1653Ms3 = this.L;
            c1653Ms3.reset();
            c1653Ms3.setDuration(200L);
            c1653Ms3.setInterpolator(this.x);
            if (animationAnimationListenerC0614Es3 != null) {
                this.y.a = animationAnimationListenerC0614Es3;
            }
            this.y.clearAnimation();
            this.y.startAnimation(c1653Ms3);
        }
    }

    public final void k() {
        if (this.a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.y)) {
                    this.a = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.a == null) {
            k();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.y.getMeasuredWidth();
        int measuredHeight2 = this.y.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.s;
        this.y.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a == null) {
            k();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        C4217cS c4217cS = this.y;
        int i3 = this.f11491J;
        c4217cS.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        this.z = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.y) {
                this.z = i4;
                return;
            }
        }
    }

    public final boolean j() {
        View view = this.a;
        if (view instanceof ListView) {
            return ((ListView) view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        k();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || j() || this.h || this.q) {
            return false;
        }
        if (actionMasked == 0) {
            r(this.B - this.y.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.w = pointerId;
            this.v = false;
            int findPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex < 0) {
                return false;
            }
            this.u = motionEvent.getY(findPointerIndex);
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.w;
                    if (i == -1) {
                        Log.e("b", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex2 = motionEvent.findPointerIndex(i);
                    if (findPointerIndex2 < 0) {
                        return false;
                    }
                    s(motionEvent.getY(findPointerIndex2));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.w) {
                            this.w = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        }
                    }
                }
            }
            this.v = false;
            this.w = -1;
        }
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // defpackage.InterfaceC9578s22
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        int[] iArr2 = this.o;
        if (i5 == 0) {
            this.m.d(i, i2, i3, i4, iArr2, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        if ((i7 == 0 ? i4 + this.o[1] : i7) >= 0 || j()) {
            return;
        }
        float abs = this.k + Math.abs(r2);
        this.k = abs;
        m(abs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // defpackage.InterfaceC9235r22
    public final boolean f(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // defpackage.InterfaceC9235r22
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.InterfaceC9235r22
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.InterfaceC9235r22
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        d(view, i, i2, i3, i4, i5, this.p);
    }

    @Override // defpackage.InterfaceC9235r22
    public final void i(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.h || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.k;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.k = 0.0f;
                } else {
                    this.k = f - f2;
                    iArr[1] = i2;
                }
                m(this.k);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.n;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        d(view, i, i2, i3, i4, 0, this.p);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.m.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.m.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.m.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.m.b(f, f2);
    }

    public final void m(float f) {
        C6280iS c6280iS = this.D;
        C5936hS c5936hS = c6280iS.a;
        if (!c5936hS.n) {
            c5936hS.n = true;
        }
        c6280iS.invalidateSelf();
        float f2 = this.j;
        float min = Math.min(1.0f, Math.abs(f / f2));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - f2;
        float f3 = this.C;
        double max2 = Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i = this.B + ((int) ((f3 * min) + (f3 * pow * 2.0f)));
        if (this.y.getVisibility() != 0) {
            this.y.setVisibility(0);
        }
        this.y.setScaleX(1.0f);
        this.y.setScaleY(1.0f);
        if (f < f2) {
            if (this.D.a.t > 76) {
                C1134Is3 c1134Is3 = this.G;
                if (!((c1134Is3 == null || !c1134Is3.hasStarted() || c1134Is3.hasEnded()) ? false : true)) {
                    C1134Is3 c1134Is32 = new C1134Is3(this, this.D.a.t, 76);
                    c1134Is32.setDuration(300L);
                    C4217cS c4217cS = this.y;
                    c4217cS.a = null;
                    c4217cS.clearAnimation();
                    this.y.startAnimation(c1134Is32);
                    this.G = c1134Is32;
                }
            }
        } else if (this.D.a.t < 255) {
            C1134Is3 c1134Is33 = this.H;
            if (!((c1134Is33 == null || !c1134Is33.hasStarted() || c1134Is33.hasEnded()) ? false : true)) {
                C1134Is3 c1134Is34 = new C1134Is3(this, this.D.a.t, 255);
                c1134Is34.setDuration(300L);
                C4217cS c4217cS2 = this.y;
                c4217cS2.a = null;
                c4217cS2.clearAnimation();
                this.y.startAnimation(c1134Is34);
                this.H = c1134Is34;
            }
        }
        C6280iS c6280iS2 = this.D;
        float min2 = Math.min(0.8f, max * 0.8f);
        C5936hS c5936hS2 = c6280iS2.a;
        c5936hS2.e = 0.0f;
        c5936hS2.f = min2;
        c6280iS2.invalidateSelf();
        C6280iS c6280iS3 = this.D;
        float min3 = Math.min(1.0f, max);
        C5936hS c5936hS3 = c6280iS3.a;
        if (min3 != c5936hS3.p) {
            c5936hS3.p = min3;
        }
        c6280iS3.invalidateSelf();
        C6280iS c6280iS4 = this.D;
        c6280iS4.a.g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        c6280iS4.invalidateSelf();
        r(i - this.s);
    }

    public final void l(float f) {
        if (f > this.j) {
            p(true, true);
            return;
        }
        this.h = false;
        C6280iS c6280iS = this.D;
        C5936hS c5936hS = c6280iS.a;
        c5936hS.e = 0.0f;
        c5936hS.f = 0.0f;
        c6280iS.invalidateSelf();
        AnimationAnimationListenerC1394Ks3 animationAnimationListenerC1394Ks3 = new AnimationAnimationListenerC1394Ks3(this);
        this.A = this.s;
        C1913Os3 c1913Os3 = this.M;
        c1913Os3.reset();
        c1913Os3.setDuration(200L);
        c1913Os3.setInterpolator(this.x);
        C4217cS c4217cS = this.y;
        c4217cS.a = animationAnimationListenerC1394Ks3;
        c4217cS.clearAnimation();
        this.y.startAnimation(c1913Os3);
        C6280iS c6280iS2 = this.D;
        C5936hS c5936hS2 = c6280iS2.a;
        if (c5936hS2.n) {
            c5936hS2.n = false;
        }
        c6280iS2.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || j() || this.h || this.q) {
            return false;
        }
        if (actionMasked == 0) {
            this.w = motionEvent.getPointerId(0);
            this.v = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.w);
                if (findPointerIndex < 0) {
                    Log.e("b", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.v) {
                    float y = (motionEvent.getY(findPointerIndex) - this.t) * 0.5f;
                    this.v = false;
                    l(y);
                }
                this.w = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.w);
                if (findPointerIndex2 < 0) {
                    Log.e("b", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                s(y2);
                if (this.v) {
                    float f = (y2 - this.t) * 0.5f;
                    if (f <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    m(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e("b", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.w = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.w) {
                        this.w = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    public final void s(float f) {
        float f2 = this.u;
        float f3 = f - f2;
        int i = this.i;
        if (f3 <= i || this.v) {
            return;
        }
        this.t = f2 + i;
        this.v = true;
        this.D.setAlpha(76);
    }

    public final void n(float f) {
        r((this.A + ((int) ((this.B - r0) * f))) - this.y.getTop());
    }

    public final void r(int i) {
        this.y.bringToFront();
        C4217cS c4217cS = this.y;
        WeakHashMap weakHashMap = Ec4.a;
        c4217cS.offsetTopAndBottom(i);
        this.s = this.y.getTop();
    }
}
