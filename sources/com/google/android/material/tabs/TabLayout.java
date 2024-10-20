package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.ViewPager;
import defpackage.AbstractC0270Cc;
import defpackage.AbstractC3965bi2;
import defpackage.C0119Ax3;
import defpackage.C0249Bx3;
import defpackage.C0379Cx3;
import defpackage.C0639Ex3;
import defpackage.C0769Fx3;
import defpackage.C10237tx3;
import defpackage.C10580ux3;
import defpackage.C10923vx3;
import defpackage.C11952yx3;
import defpackage.C9550rx2;
import defpackage.C9893sx2;
import defpackage.DM1;
import defpackage.EM1;
import defpackage.Ec4;
import defpackage.Hd4;
import defpackage.InterfaceC11266wx3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Hd4
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    public static final C9893sx2 T = new C9893sx2(16);
    public int A;
    public final int B;
    public int C;
    public final int D;
    public final boolean E;
    public boolean F;
    public final boolean G;
    public C10237tx3 H;
    public InterfaceC11266wx3 I;

    /* renamed from: J, reason: collision with root package name */
    public final ArrayList f11501J;
    public C0769Fx3 K;
    public ValueAnimator L;
    public ViewPager M;
    public AbstractC3965bi2 N;
    public C11952yx3 O;
    public C0379Cx3 P;
    public C10923vx3 Q;
    public boolean R;
    public final C9550rx2 S;
    public final ArrayList a;
    public C0249Bx3 g;
    public final C0119Ax3 h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public ColorStateList n;
    public final ColorStateList o;
    public final ColorStateList p;
    public Drawable q;
    public int r;
    public final PorterDuff.Mode s;
    public final float t;
    public final float u;
    public final int v;
    public int w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0260, code lost:            if (r14 != 2) goto L66;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TabLayout(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void t(float f, int i, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round >= 0) {
            C0119Ax3 c0119Ax3 = this.h;
            if (round >= c0119Ax3.getChildCount()) {
                return;
            }
            if (z2) {
                ValueAnimator valueAnimator = c0119Ax3.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c0119Ax3.a.cancel();
                }
                c0119Ax3.b(c0119Ax3.getChildAt(i), c0119Ax3.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.L;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.L.cancel();
            }
            scrollTo(i < 0 ? 0 : h(i, f), 0);
            if (z) {
                u(round);
            }
        }
    }

    public final void c(C0249Bx3 c0249Bx3) {
        e(c0249Bx3, this.a.isEmpty());
    }

    public void e(C0249Bx3 c0249Bx3, boolean z) {
        d(c0249Bx3, this.a.size(), z);
    }

    public void d(C0249Bx3 c0249Bx3, int i, boolean z) {
        if (c0249Bx3.g != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        c0249Bx3.e = i;
        ArrayList arrayList = this.a;
        arrayList.add(i, c0249Bx3);
        int size = arrayList.size();
        while (true) {
            i++;
            if (i >= size) {
                break;
            } else {
                ((C0249Bx3) arrayList.get(i)).e = i;
            }
        }
        C0639Ex3 c0639Ex3 = c0249Bx3.h;
        c0639Ex3.setSelected(false);
        c0639Ex3.setActivated(false);
        int i2 = c0249Bx3.e;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.D == 1 && this.A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.h.addView(c0639Ex3, i2, layoutParams);
        if (z) {
            c0249Bx3.b();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.D;
        return (i == 0 || i == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8) {
            int i = this.D;
            if (!(i == 0 || i == 2)) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void b(InterfaceC11266wx3 interfaceC11266wx3) {
        ArrayList arrayList = this.f11501J;
        if (arrayList.contains(interfaceC11266wx3)) {
            return;
        }
        arrayList.add(interfaceC11266wx3);
    }

    public final C0249Bx3 m() {
        C0249Bx3 c0249Bx3 = (C0249Bx3) T.b();
        if (c0249Bx3 == null) {
            c0249Bx3 = new C0249Bx3();
        }
        c0249Bx3.g = this;
        C9550rx2 c9550rx2 = this.S;
        C0639Ex3 c0639Ex3 = c9550rx2 != null ? (C0639Ex3) c9550rx2.b() : null;
        if (c0639Ex3 == null) {
            c0639Ex3 = new C0639Ex3(this, getContext());
        }
        if (c0249Bx3 != c0639Ex3.a) {
            c0639Ex3.a = c0249Bx3;
            c0639Ex3.a();
        }
        c0639Ex3.setFocusable(true);
        int i = this.x;
        if (i == -1) {
            int i2 = this.D;
            i = (i2 == 0 || i2 == 2) ? this.z : 0;
        }
        c0639Ex3.setMinimumWidth(i);
        if (TextUtils.isEmpty(c0249Bx3.d)) {
            c0639Ex3.setContentDescription(c0249Bx3.c);
        } else {
            c0639Ex3.setContentDescription(c0249Bx3.d);
        }
        c0249Bx3.h = c0639Ex3;
        int i3 = c0249Bx3.i;
        if (i3 != -1) {
            c0639Ex3.setId(i3);
        }
        return c0249Bx3;
    }

    public final int l() {
        return this.a.size();
    }

    public final C0249Bx3 k(int i) {
        if (i < 0 || i >= l()) {
            return null;
        }
        return (C0249Bx3) this.a.get(i);
    }

    public final int j() {
        C0249Bx3 c0249Bx3 = this.g;
        if (c0249Bx3 != null) {
            return c0249Bx3.e;
        }
        return -1;
    }

    public final void p(int i) {
        C0249Bx3 c0249Bx3 = this.g;
        int i2 = c0249Bx3 != null ? c0249Bx3.e : 0;
        q(i);
        ArrayList arrayList = this.a;
        C0249Bx3 c0249Bx32 = (C0249Bx3) arrayList.remove(i);
        if (c0249Bx32 != null) {
            c0249Bx32.g = null;
            c0249Bx32.h = null;
            c0249Bx32.a = null;
            c0249Bx32.b = null;
            c0249Bx32.i = -1;
            c0249Bx32.c = null;
            c0249Bx32.d = null;
            c0249Bx32.e = -1;
            c0249Bx32.f = null;
            T.a(c0249Bx32);
        }
        int size = arrayList.size();
        for (int i3 = i; i3 < size; i3++) {
            ((C0249Bx3) arrayList.get(i3)).e = i3;
        }
        if (i2 == i) {
            r(arrayList.isEmpty() ? null : (C0249Bx3) arrayList.get(Math.max(0, i - 1)), true);
        }
    }

    public final void o() {
        for (int childCount = this.h.getChildCount() - 1; childCount >= 0; childCount--) {
            q(childCount);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            C0249Bx3 c0249Bx3 = (C0249Bx3) it.next();
            it.remove();
            c0249Bx3.g = null;
            c0249Bx3.h = null;
            c0249Bx3.a = null;
            c0249Bx3.b = null;
            c0249Bx3.i = -1;
            c0249Bx3.c = null;
            c0249Bx3.d = null;
            c0249Bx3.e = -1;
            c0249Bx3.f = null;
            T.a(c0249Bx3);
        }
        this.g = null;
    }

    public final void v(ViewPager viewPager, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.M;
        if (viewPager2 != null) {
            C0379Cx3 c0379Cx3 = this.P;
            if (c0379Cx3 != null && (arrayList2 = viewPager2.R) != null) {
                arrayList2.remove(c0379Cx3);
            }
            C10923vx3 c10923vx3 = this.Q;
            if (c10923vx3 != null && (arrayList = this.M.S) != null) {
                arrayList.remove(c10923vx3);
            }
        }
        C0769Fx3 c0769Fx3 = this.K;
        if (c0769Fx3 != null) {
            this.f11501J.remove(c0769Fx3);
            this.K = null;
        }
        if (viewPager != null) {
            this.M = viewPager;
            if (this.P == null) {
                this.P = new C0379Cx3(this);
            }
            C0379Cx3 c0379Cx32 = this.P;
            c0379Cx32.c = 0;
            c0379Cx32.b = 0;
            viewPager.b(c0379Cx32);
            C0769Fx3 c0769Fx32 = new C0769Fx3(viewPager);
            this.K = c0769Fx32;
            b(c0769Fx32);
            AbstractC3965bi2 abstractC3965bi2 = viewPager.j;
            if (abstractC3965bi2 != null) {
                s(abstractC3965bi2, true);
            }
            if (this.Q == null) {
                this.Q = new C10923vx3(this);
            }
            C10923vx3 c10923vx32 = this.Q;
            c10923vx32.a = true;
            if (viewPager.S == null) {
                viewPager.S = new ArrayList();
            }
            viewPager.S.add(c10923vx32);
            t(0.0f, viewPager.k, true, true);
        } else {
            this.M = null;
            s(null, false);
        }
        this.R = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof DM1) {
            EM1.b(this, (DM1) background);
        }
        if (this.M == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                v((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.R) {
            v(null, false);
            this.R = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.h.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    public final void s(AbstractC3965bi2 abstractC3965bi2, boolean z) {
        C11952yx3 c11952yx3;
        AbstractC3965bi2 abstractC3965bi22 = this.N;
        if (abstractC3965bi22 != null && (c11952yx3 = this.O) != null) {
            abstractC3965bi22.a.unregisterObserver(c11952yx3);
        }
        this.N = abstractC3965bi2;
        if (z && abstractC3965bi2 != null) {
            if (this.O == null) {
                this.O = new C11952yx3(this);
            }
            abstractC3965bi2.a.registerObserver(this.O);
        }
        n();
    }

    public final void n() {
        int i;
        o();
        AbstractC3965bi2 abstractC3965bi2 = this.N;
        if (abstractC3965bi2 != null) {
            int f = abstractC3965bi2.f();
            for (int i2 = 0; i2 < f; i2++) {
                C0249Bx3 m = m();
                this.N.getClass();
                m.d(null);
                e(m, false);
            }
            ViewPager viewPager = this.M;
            if (viewPager == null || f <= 0 || (i = viewPager.k) == j() || i >= l()) {
                return;
            }
            r(k(i), true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        f(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        f(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        f(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f(view);
    }

    public final void f(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            C0249Bx3 m = m();
            CharSequence charSequence = tabItem.a;
            if (charSequence != null) {
                m.d(charSequence);
            }
            Drawable drawable = tabItem.g;
            if (drawable != null) {
                m.b = drawable;
                TabLayout tabLayout = m.g;
                if (tabLayout.A == 1 || tabLayout.D == 2) {
                    tabLayout.w(true);
                }
                m.e();
            }
            int i = tabItem.h;
            if (i != 0) {
                m.f = LayoutInflater.from(m.h.getContext()).inflate(i, (ViewGroup) m.h, false);
                m.e();
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                m.c(tabItem.getContentDescription());
            }
            c(m);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof DM1) {
            ((DM1) background).i(f);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        accessibilityNodeInfoCompat.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, l(), false, 1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C0639Ex3 c0639Ex3;
        Drawable drawable;
        int i = 0;
        while (true) {
            C0119Ax3 c0119Ax3 = this.h;
            if (i < c0119Ax3.getChildCount()) {
                View childAt = c0119Ax3.getChildAt(i);
                if ((childAt instanceof C0639Ex3) && (drawable = (c0639Ex3 = (C0639Ex3) childAt).l) != null) {
                    drawable.setBounds(c0639Ex3.getLeft(), c0639Ex3.getTop(), c0639Ex3.getRight(), c0639Ex3.getBottom());
                    c0639Ex3.l.draw(canvas);
                }
                i++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:            if (r0 != 2) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:            if (r9.getMeasuredWidth() != getMeasuredWidth()) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:            r3 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:            if (r9.getMeasuredWidth() < getMeasuredWidth()) goto L46;     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.getContext()
            java.util.ArrayList r1 = r8.a
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            r5 = 1
            if (r4 >= r2) goto L28
            java.lang.Object r6 = r1.get(r4)
            Bx3 r6 = (defpackage.C0249Bx3) r6
            if (r6 == 0) goto L25
            android.graphics.drawable.Drawable r7 = r6.b
            if (r7 == 0) goto L25
            java.lang.CharSequence r6 = r6.c
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L25
            r1 = r5
            goto L29
        L25:
            int r4 = r4 + 1
            goto Lc
        L28:
            r1 = r3
        L29:
            if (r1 == 0) goto L32
            boolean r1 = r8.E
            if (r1 != 0) goto L32
            r1 = 72
            goto L34
        L32:
            r1 = 48
        L34:
            float r0 = defpackage.Ee4.a(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r10)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L58
            if (r1 == 0) goto L49
            goto L6b
        L49:
            int r10 = r8.getPaddingTop()
            int r10 = r10 + r0
            int r0 = r8.getPaddingBottom()
            int r0 = r0 + r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L6b
        L58:
            int r1 = r8.getChildCount()
            if (r1 != r5) goto L6b
            int r1 = android.view.View.MeasureSpec.getSize(r10)
            if (r1 < r0) goto L6b
            android.view.View r1 = r8.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L6b:
            int r0 = android.view.View.MeasureSpec.getSize(r9)
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            if (r1 == 0) goto L89
            int r1 = r8.y
            if (r1 <= 0) goto L7a
            goto L87
        L7a:
            float r0 = (float) r0
            android.content.Context r1 = r8.getContext()
            r2 = 56
            float r1 = defpackage.Ee4.a(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L87:
            r8.w = r1
        L89:
            super.onMeasure(r9, r10)
            int r9 = r8.getChildCount()
            if (r9 != r5) goto Ld7
            android.view.View r9 = r8.getChildAt(r3)
            int r0 = r8.D
            if (r0 == 0) goto Lac
            if (r0 == r5) goto La0
            r1 = 2
            if (r0 == r1) goto Lac
            goto Lb7
        La0:
            int r0 = r9.getMeasuredWidth()
            int r1 = r8.getMeasuredWidth()
            if (r0 == r1) goto Lb7
        Laa:
            r3 = r5
            goto Lb7
        Lac:
            int r0 = r9.getMeasuredWidth()
            int r1 = r8.getMeasuredWidth()
            if (r0 >= r1) goto Lb7
            goto Laa
        Lb7:
            if (r3 == 0) goto Ld7
            int r0 = r8.getPaddingTop()
            int r1 = r8.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            int r0 = r0.height
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r10, r1, r0)
            int r0 = r8.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r9.measure(r0, r10)
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public final void q(int i) {
        C0119Ax3 c0119Ax3 = this.h;
        C0639Ex3 c0639Ex3 = (C0639Ex3) c0119Ax3.getChildAt(i);
        c0119Ax3.removeViewAt(i);
        if (c0639Ex3 != null) {
            if (c0639Ex3.a != null) {
                c0639Ex3.a = null;
                c0639Ex3.a();
            }
            c0639Ex3.setSelected(false);
            this.S.a(c0639Ex3);
        }
        requestLayout();
    }

    public final void g(int i) {
        boolean z;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = Ec4.a;
            if (isLaidOut()) {
                C0119Ax3 c0119Ax3 = this.h;
                int childCount = c0119Ax3.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        z = false;
                        break;
                    } else {
                        if (c0119Ax3.getChildAt(i2).getWidth() <= 0) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z) {
                    int scrollX = getScrollX();
                    int h = h(i, 0.0f);
                    int i3 = this.B;
                    if (scrollX != h) {
                        if (this.L == null) {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            this.L = valueAnimator;
                            valueAnimator.setInterpolator(AbstractC0270Cc.b);
                            this.L.setDuration(i3);
                            this.L.addUpdateListener(new C10580ux3(this));
                        }
                        this.L.setIntValues(scrollX, h);
                        this.L.start();
                    }
                    ValueAnimator valueAnimator2 = c0119Ax3.a;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        c0119Ax3.a.cancel();
                    }
                    c0119Ax3.c(i, i3, true);
                    return;
                }
            }
        }
        t(0.0f, i, true, true);
    }

    public final void u(int i) {
        C0119Ax3 c0119Ax3 = this.h;
        int childCount = c0119Ax3.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = c0119Ax3.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public final void r(C0249Bx3 c0249Bx3, boolean z) {
        C0249Bx3 c0249Bx32 = this.g;
        ArrayList arrayList = this.f11501J;
        if (c0249Bx32 == c0249Bx3) {
            if (c0249Bx32 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((InterfaceC11266wx3) arrayList.get(size)).g(c0249Bx3);
                }
                g(c0249Bx3.e);
                return;
            }
            return;
        }
        int i = c0249Bx3 != null ? c0249Bx3.e : -1;
        if (z) {
            if ((c0249Bx32 == null || c0249Bx32.e == -1) && i != -1) {
                t(0.0f, i, true, true);
            } else {
                g(i);
            }
            if (i != -1) {
                u(i);
            }
        }
        this.g = c0249Bx3;
        if (c0249Bx32 != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC11266wx3) arrayList.get(size2)).b(c0249Bx32);
            }
        }
        if (c0249Bx3 != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((InterfaceC11266wx3) arrayList.get(size3)).k(c0249Bx3);
            }
        }
    }

    public final int h(int i, float f) {
        C0119Ax3 c0119Ax3;
        View childAt;
        int i2 = this.D;
        if ((i2 != 0 && i2 != 2) || (childAt = (c0119Ax3 = this.h).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < c0119Ax3.getChildCount() ? c0119Ax3.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        WeakHashMap weakHashMap = Ec4.a;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void w(boolean z) {
        int i = 0;
        while (true) {
            C0119Ax3 c0119Ax3 = this.h;
            if (i >= c0119Ax3.getChildCount()) {
                return;
            }
            View childAt = c0119Ax3.getChildAt(i);
            int i2 = this.D;
            int i3 = this.x;
            if (i3 == -1) {
                i3 = (i2 == 0 || i2 == 2) ? this.z : 0;
            }
            childAt.setMinimumWidth(i3);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (i2 == 1 && this.A == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    public static ColorStateList i(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }
}
