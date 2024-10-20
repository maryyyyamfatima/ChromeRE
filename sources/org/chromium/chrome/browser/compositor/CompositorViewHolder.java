package org.chromium.chrome.browser.compositor;

import J.N;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.A20;
import defpackage.AbstractC11276wz3;
import defpackage.AbstractC1868Oj3;
import defpackage.AbstractC5518gD0;
import defpackage.AbstractC8540p04;
import defpackage.B80;
import defpackage.C0565Ej;
import defpackage.C10154tj3;
import defpackage.C10262u20;
import defpackage.C10948w20;
import defpackage.C11634y20;
import defpackage.C11814ya2;
import defpackage.C11939yv1;
import defpackage.C12157za2;
import defpackage.C1751Nm1;
import defpackage.C2556Tr1;
import defpackage.C8385oa2;
import defpackage.C9296rD0;
import defpackage.C9897sy1;
import defpackage.CC;
import defpackage.D20;
import defpackage.E20;
import defpackage.E50;
import defpackage.Ec4;
import defpackage.F12;
import defpackage.G1;
import defpackage.GC;
import defpackage.HC;
import defpackage.InterfaceC0408Dd2;
import defpackage.InterfaceC0512Dy1;
import defpackage.InterfaceC10590uz3;
import defpackage.InterfaceC1621Mm1;
import defpackage.InterfaceC1818Nz3;
import defpackage.InterfaceC2426Sr1;
import defpackage.InterfaceC3897bW2;
import defpackage.InterfaceC7408lj3;
import defpackage.InterfaceC7697ma2;
import defpackage.InterfaceC7839my1;
import defpackage.Q50;
import defpackage.QS3;
import defpackage.RunnableC10605v20;
import defpackage.ViewOnLayoutChangeListenerC11977z20;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.components.content_capture.OnscreenContentProvider;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CompositorViewHolder extends FrameLayout implements E50, InterfaceC7839my1, InterfaceC0512Dy1, InterfaceC2426Sr1, GC, InterfaceC1621Mm1, G1, InterfaceC1818Nz3, ViewGroup.OnHierarchyChangeListener {
    public static final /* synthetic */ int W = 0;
    public RunnableC10605v20 A;
    public Tab B;
    public View C;
    public Q50 D;
    public C11634y20 E;
    public final Rect F;
    public final Point G;
    public boolean H;
    public boolean I;

    /* renamed from: J */
    public boolean f11520J;
    public boolean K;
    public boolean L;
    public C0565Ej M;
    public final C10262u20 N;
    public boolean O;
    public OnscreenContentProvider P;
    public final HashSet Q;
    public final HashSet R;
    public final HashSet S;
    public MotionEvent T;
    public QS3 U;
    public View V;
    public final C12157za2 a;
    public C9296rD0 g;
    public boolean h;
    public boolean i;
    public final C2556Tr1 j;
    public C9897sy1 k;
    public CompositorView l;
    public boolean m;
    public boolean n;
    public int o;
    public final ArrayList p;
    public boolean q;
    public Runnable r;
    public InterfaceC10590uz3 s;
    public CC t;
    public D20 u;
    public E20 v;
    public B80 w;
    public C1751Nm1 x;
    public InterfaceC7697ma2 y;
    public boolean z;

    @Override // defpackage.InterfaceC1621Mm1
    public final void a(Rect rect) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void clearChildFocus(View view) {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void e() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        this.j.a = this;
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        Q50 g;
        PointerIcon onResolvePointerIcon;
        if (Build.VERSION.SDK_INT >= 24 && (g = g()) != null) {
            WeakHashMap weakHashMap = Ec4.a;
            if (g.isAttachedToWindow()) {
                onResolvePointerIcon = g.onResolvePointerIcon(motionEvent, i);
                return onResolvePointerIcon;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [u20] */
    public CompositorViewHolder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new C12157za2();
        this.j = new C2556Tr1();
        this.m = true;
        this.p = new ArrayList();
        this.F = new Rect();
        this.G = new Point();
        this.N = new Callback() { // from class: u20
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int i = CompositorViewHolder.W;
                CompositorViewHolder.this.B();
            }
        };
        this.Q = new HashSet();
        this.R = new HashSet();
        this.S = new HashSet();
        this.g = new C9296rD0(new C10948w20(this));
        this.E = new C11634y20(this);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC11977z20(this));
        CompositorView compositorView = new CompositorView(getContext(), this);
        this.l = compositorView;
        addView(compositorView, 0, new FrameLayout.LayoutParams(-1, -2));
        setOnSystemUiVisibilityChangeListener(new A20(this));
        n();
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
    }

    public final Point i() {
        boolean z = this.z;
        Point point = this.G;
        if (z && C11939yv1.g.f(getContext(), this)) {
            Rect rect = this.F;
            getWindowVisibleDisplayFrame(rect);
            point.set(Math.min(rect.width(), getWidth()), Math.min(rect.height(), getHeight()));
        } else {
            point.set(getWidth(), getHeight());
        }
        return point;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:            if (r0.isAttachedToWindow() == false) goto L162;     */
    /* JADX WARN: Type inference failed for: r0v12, types: [v20] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r4 = this;
            Q50 r0 = r4.g()
            if (r0 == 0) goto Le
            java.util.WeakHashMap r1 = defpackage.Ec4.a
            boolean r1 = r0.isAttachedToWindow()
            if (r1 != 0) goto Lf
        Le:
            r0 = r4
        Lf:
            r1 = 0
            r2 = r1
        L11:
            if (r0 == 0) goto L28
            int r3 = r0.getSystemUiVisibility()
            r2 = r2 | r3
            android.view.ViewParent r3 = r0.getParent()
            boolean r3 = r3 instanceof android.view.View
            if (r3 != 0) goto L21
            goto L28
        L21:
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            goto L11
        L28:
            r0 = r2 & 4
            r3 = 1
            if (r0 != 0) goto L38
            r0 = r2 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L38
            r0 = r2 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L36
            goto L38
        L36:
            r0 = r1
            goto L39
        L38:
            r0 = r3
        L39:
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L3e
            r1 = r3
        L3e:
            boolean r2 = r4.z
            if (r2 != r0) goto L43
            return
        L43:
            r4.z = r0
            v20 r0 = r4.A
            if (r0 != 0) goto L51
            v20 r0 = new v20
            r0.<init>()
            r4.A = r0
            goto L5a
        L51:
            android.os.Handler r0 = r4.getHandler()
            v20 r2 = r4.A
            r0.removeCallbacks(r2)
        L5a:
            if (r1 == 0) goto L5f
            r0 = 500(0x1f4, double:2.47E-321)
            goto L61
        L5f:
            r0 = 0
        L61:
            v20 r2 = r4.A
            r4.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.compositor.CompositorViewHolder.n():void");
    }

    @Override // defpackage.InterfaceC1621Mm1
    public final void d() {
        if (this.z) {
            p();
        }
    }

    public final void p() {
        Q50 g = g();
        if (g != null) {
            Point i = i();
            w(l(), g, i.x, i.y);
        }
        t();
    }

    public final void u() {
        if (this.H) {
            return;
        }
        this.l.setBackgroundColor(-1);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        AbstractC5518gD0 abstractC5518gD0;
        AbstractC5518gD0 abstractC5518gD02;
        boolean z2;
        int i;
        super.onInterceptTouchEvent(motionEvent);
        Iterator it = this.a.iterator();
        do {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            z = false;
            if (c11814ya2.hasNext()) {
                F12 f12 = (F12) c11814ya2.next();
                Tab tab = f12.g;
                if (tab == null || !tab.isNativePage()) {
                    InterfaceC0408Dd2 interfaceC0408Dd2 = f12.f.a.V;
                    if (!(interfaceC0408Dd2.get() != null && ((C10154tj3) ((InterfaceC7408lj3) interfaceC0408Dd2.get())).c.w == 1)) {
                        z2 = false;
                        if (z2 && ((i = f12.h) == 2 || i == 3)) {
                            z = true;
                        }
                    }
                }
                z2 = true;
                if (z2) {
                    z = true;
                }
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0 || actionMasked == 5) {
                    this.K = true;
                } else if (actionMasked == 3 || actionMasked == 1) {
                    this.K = false;
                    B();
                }
                if (this.k == null) {
                    return false;
                }
                this.g.a(motionEvent, false);
                C9897sy1 c9897sy1 = this.k;
                boolean z3 = this.h;
                if (c9897sy1.r == null) {
                    return false;
                }
                if (motionEvent.getAction() == 0) {
                    c9897sy1.h = (int) motionEvent.getX();
                    c9897sy1.i = (int) motionEvent.getY();
                }
                PointF v = c9897sy1.v(motionEvent);
                ArrayList arrayList = c9897sy1.M;
                int size = arrayList.size() - 1;
                while (true) {
                    abstractC5518gD0 = null;
                    if (size < 0) {
                        abstractC5518gD02 = null;
                        break;
                    }
                    if (((InterfaceC3897bW2) arrayList.get(size)).p0() && (abstractC5518gD02 = ((InterfaceC3897bW2) arrayList.get(size)).l()) != null) {
                        if (v != null) {
                            float f = v.x;
                            float f2 = v.y;
                            abstractC5518gD02.c = f;
                            abstractC5518gD02.d = f2;
                        }
                        if (abstractC5518gD02.a(motionEvent, z3)) {
                            break;
                        }
                    }
                    size--;
                }
                if (abstractC5518gD02 == null) {
                    AbstractC5518gD0 k = c9897sy1.r.k();
                    if (k != null) {
                        if (v != null) {
                            float f3 = v.x;
                            float f4 = v.y;
                            k.c = f3;
                            k.d = f4;
                        }
                        if (k.a(motionEvent, z3)) {
                            abstractC5518gD0 = k;
                        }
                    }
                    abstractC5518gD02 = abstractC5518gD0;
                }
                c9897sy1.G = abstractC5518gD02 != c9897sy1.u;
                c9897sy1.u = abstractC5518gD02;
                if (abstractC5518gD02 != null) {
                    c9897sy1.r.K();
                }
                return c9897sy1.u != null;
            }
        } while (!z);
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        super.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        if (actionMasked == 0 || actionMasked == 5) {
            this.K = true;
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.K = false;
            B();
        }
        C9897sy1 c9897sy1 = this.k;
        if (c9897sy1 != null) {
            if (c9897sy1.u == null) {
                z = false;
            } else {
                if (c9897sy1.G && motionEvent.getActionMasked() != 0) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(0);
                    c9897sy1.I(obtain);
                }
                c9897sy1.G = false;
                c9897sy1.I(motionEvent);
                z = true;
            }
            if (z) {
                z2 = true;
            }
        }
        this.g.a(motionEvent, true);
        return z2;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        this.g.a(motionEvent, true);
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        E20 e20 = this.v;
        if (e20 == null || !e20.m(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchDragEvent(DragEvent dragEvent) {
        C9296rD0 c9296rD0 = this.g;
        dragEvent.getAction();
        C10948w20 c10948w20 = c9296rD0.a;
        C9897sy1 c9897sy1 = c10948w20.b.k;
        RectF rectF = c10948w20.a;
        if (c9897sy1 != null) {
            c9897sy1.A(rectF);
        }
        c9296rD0.b(-rectF.top);
        boolean dispatchDragEvent = super.dispatchDragEvent(dragEvent);
        C9296rD0 c9296rD02 = this.g;
        int action = dragEvent.getAction();
        c9296rD02.getClass();
        if (action == 6 || action == 4 || action == 3) {
            c9296rD02.b(0.0f);
        }
        return dispatchDragEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:            if ((r3.get() != null && ((defpackage.C10154tj3) ((defpackage.InterfaceC7408lj3) r3.get())).c.w == 1) != false) goto L210;     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            r1 = 2
            if (r0 == r1) goto L1b
            int r0 = r7.getActionMasked()
            if (r0 == 0) goto L1b
            int r0 = r7.getActionMasked()
            r1 = 5
            if (r0 == r1) goto L1b
            int r0 = r7.getActionMasked()
            r1 = 6
            if (r0 != r1) goto L1d
        L1b:
            r6.T = r7
        L1d:
            int r0 = r7.getActionMasked()
            r1 = 3
            r2 = 1
            if (r0 == r1) goto L2b
            int r0 = r7.getActionMasked()
            if (r0 != r2) goto L2e
        L2b:
            r0 = 0
            r6.T = r0
        L2e:
            za2 r0 = r6.a
            java.util.Iterator r0 = r0.iterator()
        L34:
            r1 = r0
            ya2 r1 = (defpackage.C11814ya2) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r1 = r1.next()
            F12 r1 = (defpackage.F12) r1
            org.chromium.chrome.browser.tab.Tab r3 = r1.g
            if (r3 == 0) goto L4d
            boolean r3 = r3.isNativePage()
            if (r3 != 0) goto L6d
        L4d:
            nE3 r3 = r1.f
            uE3 r3 = r3.a
            Dd2 r3 = r3.V
            java.lang.Object r4 = r3.get()
            r5 = 0
            if (r4 == 0) goto L6a
            java.lang.Object r3 = r3.get()
            lj3 r3 = (defpackage.InterfaceC7408lj3) r3
            tj3 r3 = (defpackage.C10154tj3) r3
            Fj3 r3 = r3.c
            int r3 = r3.w
            if (r3 != r2) goto L6a
            r3 = r2
            goto L6b
        L6a:
            r3 = r5
        L6b:
            if (r3 == 0) goto L6e
        L6d:
            r5 = r2
        L6e:
            if (r5 != 0) goto L71
            goto L34
        L71:
            android.view.GestureDetector r3 = r1.d
            r3.onTouchEvent(r7)
            int r3 = r7.getAction()
            if (r3 != r2) goto L34
            r1.b(r2)
            goto L34
        L80:
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.compositor.CompositorViewHolder.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Tab h() {
        InterfaceC10590uz3 interfaceC10590uz3;
        if (this.k == null || (interfaceC10590uz3 = this.s) == null) {
            return null;
        }
        Tab h = ((AbstractC11276wz3) interfaceC10590uz3).h();
        return h == null ? this.B : h;
    }

    public final Q50 g() {
        Tab h = h();
        if (h != null) {
            return h.y();
        }
        return null;
    }

    public final WebContents l() {
        Tab h = h();
        if (h != null) {
            return h.b();
        }
        return null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.s == null) {
            return;
        }
        Point i5 = i();
        Iterator it = ((AbstractC11276wz3) this.s).a.iterator();
        while (it.hasNext()) {
            TabModel tabModel = (TabModel) it.next();
            for (int i6 = 0; i6 < tabModel.getCount(); i6++) {
                Tab tabAt = tabModel.getTabAt(i6);
                if (tabAt != null) {
                    w(tabAt.b(), tabAt.y(), i5.x, i5.y);
                }
            }
        }
    }

    public final void z() {
        int i;
        TraceEvent.b("CompositorViewHolder:updateContentViewChildrenDimension", null);
        Q50 g = g();
        if (g != null) {
            CC cc = this.t;
            float f = cc.m + cc.r;
            float b = HC.b(cc);
            for (int i2 = 0; i2 < g.getChildCount(); i2++) {
                View childAt = g.getChildAt(i2);
                if ((childAt.getLayoutParams() instanceof FrameLayout.LayoutParams) && 48 == (((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity & 112)) {
                    childAt.setTranslationY(f);
                    TraceEvent.f("FullscreenManager:child.setTranslationY()");
                }
            }
            for (int i3 = 0; i3 < g.getChildCount(); i3++) {
                View childAt2 = g.getChildAt(i3);
                if (childAt2.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                    if (layoutParams.height == -1 && (layoutParams.topMargin != (i = (int) f) || layoutParams.bottomMargin != ((int) b))) {
                        layoutParams.topMargin = i;
                        layoutParams.bottomMargin = (int) b;
                        childAt2.requestLayout();
                        TraceEvent.f("FullscreenManager:child.requestLayout()");
                    }
                }
            }
            B();
        }
        TraceEvent.c("CompositorViewHolder:updateContentViewChildrenDimension");
    }

    public final void w(WebContents webContents, View view, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        if (webContents == null || view == null || this.I) {
            return;
        }
        InterfaceC7697ma2 interfaceC7697ma2 = this.y;
        int intValue = (interfaceC7697ma2 == null || (obj = ((C8385oa2) interfaceC7697ma2).g) == null) ? 0 : ((Integer) obj).intValue();
        CC cc = this.t;
        int i5 = intValue + (cc != null ? cc.n + cc.p : 0);
        if (this.f11520J) {
            i5 = (cc != null ? cc.m : 0) + f();
        }
        if (!(view.getWindowToken() != null)) {
            if (!(view.getWindowToken() != null)) {
                Point i6 = i();
                view.measure(View.MeasureSpec.makeMeasureSpec(i6.x, 1073741824), View.MeasureSpec.makeMeasureSpec(i6.y, 1073741824));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                webContents.b(view.getWidth(), view.getHeight() - i5);
            }
            v(null);
            return;
        }
        Tab tab = this.B;
        boolean z = tab != null && tab.b() == webContents && ImeAdapterImpl.b(webContents) != null && ImeAdapterImpl.b(webContents).D;
        if (z) {
            int b = C11939yv1.g.b(getRootView());
            i3 = i2 + b;
            i4 = b;
        } else {
            i3 = i2;
            i4 = 0;
        }
        webContents.b(i, i3 - i5);
        if (z) {
            boolean z2 = i4 > 0;
            if (z2 || this.O) {
                this.O = z2;
                Rect rect = new Rect();
                getRootView().getWindowVisibleDisplayFrame(rect);
                if (z2) {
                    int i7 = rect.left;
                    int i8 = rect.top;
                    CompositorView compositorView = this.l;
                    if (compositorView != null) {
                        N.MGbjFlrB(compositorView.k, compositorView, webContents, i7, i8, i, i4);
                        return;
                    }
                    return;
                }
                CompositorView compositorView2 = this.l;
                if (compositorView2 != null) {
                    N.MGbjFlrB(compositorView2.k, compositorView2, webContents, 0, 0, 0, 0);
                }
            }
        }
    }

    @Override // defpackage.GC
    public final void b(boolean z, int i, int i2, int i3) {
        t();
        if (z) {
            v(null);
        }
        z();
    }

    @Override // defpackage.GC
    public final void k(int i) {
        if (this.B == null) {
            return;
        }
        WebContents l = l();
        if (l != null) {
            l.C0();
        }
        Point i2 = i();
        w(this.B.b(), this.B.y(), i2.x, i2.y);
        t();
    }

    @Override // defpackage.GC
    public final void r() {
        if (this.B == null) {
            return;
        }
        WebContents l = l();
        if (l != null) {
            l.C0();
        }
        Point i = i();
        w(this.B.b(), this.B.y(), i.x, i.y);
        t();
    }

    public final void B() {
        CompositorView compositorView;
        if (this.K || this.L) {
            return;
        }
        CC cc = this.t;
        boolean z = false;
        if (cc != null) {
            int i = cc.t;
            if (!((i == cc.n || i == cc.m) && (HC.b(cc) == cc.p || HC.b(cc) == cc.o))) {
                return;
            }
            CC cc2 = this.t;
            boolean z2 = cc2.t > cc2.n || HC.b(cc2) > cc2.p;
            if (z2 != this.f11520J) {
                this.f11520J = z2;
                z = true;
            }
        }
        Point i2 = i();
        w(l(), g(), i2.x, i2.y);
        if (z) {
            WebContents l = l();
            boolean z3 = this.f11520J;
            if (l == null || (compositorView = this.l) == null) {
                return;
            }
            N.MI$giMjY(compositorView.k, compositorView, l, z3);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        z();
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        z();
    }

    public final void t() {
        C9897sy1 c9897sy1 = this.k;
        if (c9897sy1 != null) {
            c9897sy1.J();
        }
    }

    public final void m(RectF rectF) {
        Point i = i();
        rectF.set(0.0f, 0.0f, i.x, i.y);
    }

    public final void j(RectF rectF) {
        float f;
        m(rectF);
        CC cc = this.t;
        if (cc != null) {
            rectF.top = cc.m + cc.r + rectF.top;
            f = cc.e();
        } else {
            f = 0.0f;
        }
        rectF.bottom -= f() - f;
    }

    public final void v(Runnable runnable) {
        if (runnable != null) {
            this.Q.add(runnable);
            A();
        }
        CompositorView compositorView = this.l;
        long j = compositorView.k;
        if (j != 0) {
            N.M_Nkznfe(j, compositorView);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.h = C11939yv1.g.f(getContext(), this);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            t();
        }
        super.onLayout(z, i, i2, i3, i4);
        E20 e20 = this.v;
        if (e20 != null) {
            e20.v(e20.k, 65536);
            this.v.p();
        }
    }

    public final int f() {
        Object obj;
        InterfaceC7697ma2 interfaceC7697ma2 = this.y;
        int intValue = (interfaceC7697ma2 == null || (obj = ((C8385oa2) interfaceC7697ma2).g) == null) ? 0 : ((Integer) obj).intValue();
        CC cc = this.t;
        return intValue + (cc != null ? cc.o : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        c();
        this.j.a = null;
        super.onDetachedFromWindow();
        if (this.v != null) {
            this.u.setAccessibilityDelegate(null);
            this.v = null;
            removeView(this.u);
            this.u = null;
        }
    }

    public final void q(Runnable runnable) {
        View view = this.V;
        if (view != null) {
            view.clearFocus();
        }
        if (hasFocus() ? C11939yv1.g.d(this) : false) {
            this.r = runnable;
        } else {
            runnable.run();
        }
    }

    public final void y(boolean z) {
        if (this.C == null) {
            return;
        }
        WebContents l = l();
        if (z) {
            if (this.C != h().a() || this.C.getParent() == this) {
                return;
            }
            AbstractC8540p04.i(this.C);
            if (l != null) {
                g().setVisibility(0);
                B();
            }
            addView(this.C, 1);
            setFocusable(false);
            setFocusableInTouchMode(false);
            View view = this.V;
            if (view == null || !view.hasFocus()) {
                this.C.requestFocus();
                return;
            }
            return;
        }
        if (this.C.getParent() == this) {
            setFocusable(this.n);
            setFocusableInTouchMode(this.n);
            if (l != null && !l.isDestroyed()) {
                g().setVisibility(4);
            }
            removeView(this.C);
        }
    }

    public final void x(Tab tab) {
        if (tab != null && !AbstractC1868Oj3.a.i) {
            tab.C();
        }
        View a = tab != null ? tab.a() : null;
        if (this.C == a) {
            return;
        }
        y(false);
        Tab tab2 = this.B;
        if (tab2 != tab) {
            this.O = false;
            if (tab2 != null) {
                tab2.w(this.E);
            }
            if (tab != null) {
                tab.v(this.E);
                CompositorView compositorView = this.l;
                N.MefOJ2yP(compositorView.k, compositorView);
            }
            Q50 y = tab != null ? tab.y() : null;
            Q50 q50 = this.D;
            if (q50 != null) {
                q50.g.d(this);
            }
            if (y != null) {
                y.g.a(this);
            }
            this.D = y;
        }
        this.B = tab;
        this.C = a;
        y(this.m);
        Tab tab3 = this.B;
        if (tab3 != null) {
            s(tab3);
        }
        OnscreenContentProvider onscreenContentProvider = this.P;
        if (onscreenContentProvider == null) {
            this.P = new OnscreenContentProvider(getContext(), this, l());
            return;
        }
        WebContents l = l();
        onscreenContentProvider.c = new WeakReference(l);
        long j = onscreenContentProvider.a;
        if (j != 0) {
            N.Mljy_ZmC(j, l);
        }
    }

    public final void s(Tab tab) {
        WebContents b = tab.b();
        if (b != null) {
            int width = this.l.getWidth();
            int height = this.l.getHeight();
            CompositorView compositorView = this.l;
            if (compositorView != null) {
                N.MzYzRqF3(compositorView.k, compositorView, b, width, height);
            }
            boolean z = this.f11520J;
            CompositorView compositorView2 = this.l;
            if (compositorView2 != null) {
                N.MI$giMjY(compositorView2.k, compositorView2, b, z);
            }
        }
        if (tab.a() == null) {
            return;
        }
        if (tab.isNativePage()) {
            View a = tab.a();
            if (!((a == null || a.getWindowToken() == null) ? false : true)) {
                return;
            }
        }
        Point i = i();
        w(b, tab.a(), i.x, i.y);
    }

    public final void c() {
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            return;
        }
        TraceEvent.f("CompositorViewHolder.flushInvalidation");
        for (int i = 0; i < arrayList.size(); i++) {
            ((Runnable) arrayList.get(i)).run();
        }
        arrayList.clear();
    }

    @Override // defpackage.G1
    public final void D(boolean z) {
        if (z && this.v == null) {
            D20 d20 = new D20(this, getContext());
            this.u = d20;
            addView(d20);
            E20 e20 = new E20(this, this.u);
            this.v = e20;
            Ec4.m(this.u, e20);
        }
    }

    @Override // defpackage.InterfaceC1818Nz3
    public final void o(boolean z) {
        setFocusable(!z);
    }

    public final void A() {
        boolean z = (this.Q.isEmpty() && this.R.isEmpty() && this.S.isEmpty()) ? false : true;
        CompositorView compositorView = this.l;
        if (compositorView.w == z) {
            return;
        }
        compositorView.w = z;
        compositorView.k();
    }
}
