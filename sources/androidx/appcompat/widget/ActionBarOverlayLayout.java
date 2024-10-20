package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.android.chrome.R;
import defpackage.BS1;
import defpackage.C11563xp4;
import defpackage.C12098zO3;
import defpackage.C2141Qm1;
import defpackage.C4097c5;
import defpackage.C5389fq4;
import defpackage.C7035ke4;
import defpackage.C8477op4;
import defpackage.C8755pf;
import defpackage.C9921t22;
import defpackage.ER3;
import defpackage.Ec4;
import defpackage.Ep4;
import defpackage.Gp4;
import defpackage.Hp4;
import defpackage.InterfaceC3030Xi0;
import defpackage.InterfaceC9235r22;
import defpackage.InterfaceC9578s22;
import defpackage.M4;
import defpackage.N4;
import defpackage.O4;
import defpackage.P4;
import defpackage.Q4;
import defpackage.Up4;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC3030Xi0, InterfaceC9235r22, InterfaceC9578s22 {
    public static final int[] G = {R.attr.f2140_resource_name_obfuscated_res_0x7f050003, android.R.attr.windowContentOverlay};
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final M4 C;
    public final N4 D;
    public final O4 E;
    public final C9921t22 F;
    public int a;
    public int g;
    public ContentFrameLayout h;
    public ActionBarContainer i;
    public ER3 j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public C5389fq4 v;
    public C5389fq4 w;
    public C5389fq4 x;
    public C5389fq4 y;
    public P4 z;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C8477op4 c8477op4;
        C7035ke4 c7035ke4;
        this.F.a = i;
        ActionBarContainer actionBarContainer = this.i;
        this.q = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        b();
        P4 p4 = this.z;
        if (p4 == null || (c7035ke4 = (c8477op4 = (C8477op4) p4).t) == null) {
            return;
        }
        c7035ke4.a();
        c8477op4.t = null;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        C9921t22 c9921t22 = this.F;
        return c9921t22.b | c9921t22.a;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C5389fq4 c5389fq4 = C5389fq4.b;
        this.v = c5389fq4;
        this.w = c5389fq4;
        this.x = c5389fq4;
        this.y = c5389fq4;
        this.C = new M4(this);
        this.D = new N4(this);
        this.E = new O4(this);
        c(context);
        this.F = new C9921t22();
    }

    public final void c(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(G);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.l = context.getApplicationInfo().targetSdkVersion < 19;
        this.A = new OverScroller(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = Ec4.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.r ^ i;
        this.r = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        P4 p4 = this.z;
        if (p4 != null) {
            ((C8477op4) p4).p = !z2;
            if (z || !z2) {
                C8477op4 c8477op4 = (C8477op4) p4;
                if (c8477op4.q) {
                    c8477op4.q = false;
                    c8477op4.w(true);
                }
            } else {
                C8477op4 c8477op42 = (C8477op4) p4;
                if (!c8477op42.q) {
                    c8477op42.q = true;
                    c8477op42.w(true);
                }
            }
        }
        if ((i2 & 256) == 0 || this.z == null) {
            return;
        }
        WeakHashMap weakHashMap = Ec4.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.g = i;
        P4 p4 = this.z;
        if (p4 != null) {
            ((C8477op4) p4).o = i;
        }
    }

    public static boolean a(FrameLayout frameLayout, Rect rect, boolean z) {
        boolean z2;
        Q4 q4 = (Q4) frameLayout.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) q4).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) q4).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) q4).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) q4).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) q4).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) q4).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) q4).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) q4).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        C5389fq4 g = C5389fq4.g(this, windowInsets);
        boolean a = a(this.i, new Rect(g.b(), g.d(), g.c(), g.a()), false);
        WeakHashMap weakHashMap = Ec4.a;
        WindowInsets f = g.f();
        Rect rect = this.s;
        if (f != null) {
            C5389fq4.g(this, computeSystemWindowInsets(f, rect));
        } else {
            rect.setEmpty();
        }
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        Up4 up4 = g.a;
        C5389fq4 l = up4.l(i, i2, i3, i4);
        this.v = l;
        boolean z = true;
        if (!this.w.equals(l)) {
            this.w = this.v;
            a = true;
        }
        Rect rect2 = this.t;
        if (rect2.equals(rect)) {
            z = a;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return up4.a().a.c().a.b().f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new Q4();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new Q4(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new Q4(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof Q4;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        Hp4 c11563xp4;
        k();
        measureChildWithMargins(this.i, i, 0, i2, 0);
        Q4 q4 = (Q4) this.i.getLayoutParams();
        int max = Math.max(0, this.i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) q4).leftMargin + ((ViewGroup.MarginLayoutParams) q4).rightMargin);
        int max2 = Math.max(0, this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) q4).topMargin + ((ViewGroup.MarginLayoutParams) q4).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.i.getMeasuredState());
        WeakHashMap weakHashMap = Ec4.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.a;
            if (this.n) {
                this.i.getClass();
            }
        } else {
            measuredHeight = this.i.getVisibility() != 8 ? this.i.getMeasuredHeight() : 0;
        }
        Rect rect = this.s;
        Rect rect2 = this.u;
        rect2.set(rect);
        C5389fq4 c5389fq4 = this.v;
        this.x = c5389fq4;
        if (!this.m && !z) {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            this.x = c5389fq4.a.l(0, measuredHeight, 0, 0);
        } else {
            C2141Qm1 b = C2141Qm1.b(c5389fq4.b(), this.x.d() + measuredHeight, this.x.c(), this.x.a() + 0);
            C5389fq4 c5389fq42 = this.x;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                c11563xp4 = new Gp4(c5389fq42);
            } else if (i3 >= 29) {
                c11563xp4 = new Ep4(c5389fq42);
            } else {
                c11563xp4 = new C11563xp4(c5389fq42);
            }
            c11563xp4.g(b);
            this.x = c11563xp4.b();
        }
        a(this.h, rect2, true);
        if (!this.y.equals(this.x)) {
            C5389fq4 c5389fq43 = this.x;
            this.y = c5389fq43;
            Ec4.b(this.h, c5389fq43);
        }
        measureChildWithMargins(this.h, i, 0, i2, 0);
        Q4 q42 = (Q4) this.h.getLayoutParams();
        int max3 = Math.max(max, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) q42).leftMargin + ((ViewGroup.MarginLayoutParams) q42).rightMargin);
        int max4 = Math.max(max2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) q42).topMargin + ((ViewGroup.MarginLayoutParams) q42).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                Q4 q4 = (Q4) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) q4).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) q4).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.k == null || this.l) {
            return;
        }
        if (this.i.getVisibility() == 0) {
            i = (int) (this.i.getTranslationY() + this.i.getBottom() + 0.5f);
        } else {
            i = 0;
        }
        this.k.setBounds(0, i, getWidth(), this.k.getIntrinsicHeight() + i);
        this.k.draw(canvas);
    }

    @Override // defpackage.InterfaceC9578s22
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.InterfaceC9235r22
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
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
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.InterfaceC9235r22
    public final void i(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.i.getVisibility() != 0) {
            return false;
        }
        return this.o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.q = this.q + i2;
        b();
        this.i.setTranslationY(-Math.max(0, Math.min(r1, this.i.getHeight())));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.o || this.p) {
            return;
        }
        if (this.q <= this.i.getHeight()) {
            b();
            postDelayed(this.D, 600L);
        } else {
            b();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.o || !z) {
            return false;
        }
        this.A.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (!(this.A.getFinalY() > this.i.getHeight())) {
            b();
            this.D.run();
        } else {
            b();
            this.E.run();
        }
        this.p = true;
        return true;
    }

    public final void k() {
        ER3 er3;
        if (this.h == null) {
            this.h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            Object findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof ER3) {
                er3 = (ER3) findViewById;
            } else if (findViewById instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) findViewById;
                if (toolbar.P == null) {
                    toolbar.P = new ER3(toolbar, true);
                }
                er3 = toolbar.P;
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.j = er3;
        }
    }

    public final void b() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            this.j.getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            this.j.getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            this.m = true;
            this.l = getContext().getApplicationInfo().targetSdkVersion < 19;
        }
    }

    public final void l(BS1 bs1, C8755pf c8755pf) {
        k();
        ER3 er3 = this.j;
        C4097c5 c4097c5 = er3.m;
        Toolbar toolbar = er3.a;
        if (c4097c5 == null) {
            er3.m = new C4097c5(toolbar.getContext());
        }
        C4097c5 c4097c52 = er3.m;
        c4097c52.j = c8755pf;
        if (bs1 == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        BS1 bs12 = toolbar.a.u;
        if (bs12 == bs1) {
            return;
        }
        if (bs12 != null) {
            bs12.r(toolbar.Q);
            bs12.r(toolbar.R);
        }
        if (toolbar.R == null) {
            toolbar.R = new C12098zO3(toolbar);
        }
        c4097c52.v = true;
        if (bs1 != null) {
            bs1.b(c4097c52, toolbar.o);
            bs1.b(toolbar.R, toolbar.o);
        } else {
            c4097c52.k(toolbar.o, null);
            toolbar.R.k(toolbar.o, null);
            c4097c52.j();
            toolbar.R.j();
        }
        ActionMenuView actionMenuView = toolbar.a;
        int i = toolbar.p;
        if (actionMenuView.w != i) {
            actionMenuView.w = i;
            if (i == 0) {
                actionMenuView.v = actionMenuView.getContext();
            } else {
                actionMenuView.v = new ContextThemeWrapper(actionMenuView.getContext(), i);
            }
        }
        ActionMenuView actionMenuView2 = toolbar.a;
        actionMenuView2.y = c4097c52;
        c4097c52.m = actionMenuView2;
        actionMenuView2.u = c4097c52.h;
        toolbar.Q = c4097c52;
    }
}
