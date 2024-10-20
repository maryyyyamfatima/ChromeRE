package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sy1 */
/* loaded from: classes.dex */
public class C9897sy1 implements ZK1, InterfaceC2201Qy1, InterfaceC7458ls {
    public final Context A;
    public boolean B;
    public boolean G;
    public final V10 H;

    /* renamed from: J */
    public final InterfaceC7697ma2 f11543J;
    public final C6829k20 K;
    public CC L;
    public final InterfaceC0079Ap3 O;
    public final float a;
    public final InterfaceC7839my1 g;
    public int h;
    public int i;
    public C0054Ak3 j;
    public final ViewGroup k;
    public InterfaceC10590uz3 l;
    public C9212qy1 m;
    public C8869py1 n;
    public C9554ry1 o;
    public AbstractC2976Wx1 r;
    public AbstractC2976Wx1 s;
    public boolean t;
    public AbstractC5518gD0 u;
    public boolean y;
    public final C0678Ff2 z;
    public final C12157za2 p = new C12157za2();
    public final C12157za2 q = new C12157za2();
    public final SparseArray v = new SparseArray();
    public int w = -1;
    public int x = -1;
    public final RectF C = new RectF();
    public final RectF D = new RectF();
    public final RectF E = new RectF();
    public final PointF F = new PointF();
    public final C8385oa2 I = new C8385oa2();
    public final ArrayList M = new ArrayList();
    public final HashMap N = new HashMap();
    public final C8385oa2 P = new C8385oa2();

    public void F(ArrayList arrayList) {
    }

    public boolean U(AbstractC2976Wx1 abstractC2976Wx1) {
        return false;
    }

    public boolean V(AbstractC2976Wx1 abstractC2976Wx1, int i) {
        return false;
    }

    public boolean W(boolean z) {
        return false;
    }

    public void c(int i) {
    }

    @Override // defpackage.H14
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.H14
    public final /* synthetic */ void x() {
    }

    public InterfaceC10551us3 y() {
        return null;
    }

    public void i() {
        this.H.a.clear();
        this.q.clear();
        C0054Ak3 c0054Ak3 = this.j;
        if (c0054Ak3 != null) {
            c0054Ak3.d();
        }
        C0678Ff2 c0678Ff2 = this.z;
        if (c0678Ff2 != null) {
            HashSet hashSet = c0678Ff2.a;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((AbstractC9101qf2) it.next()).destroy();
            }
            hashSet.clear();
            c0678Ff2.c = null;
            c0678Ff2.d.clear();
            c0678Ff2.e = null;
            c0678Ff2.f = null;
        }
        C8869py1 c8869py1 = this.n;
        if (c8869py1 != null) {
            c8869py1.destroy();
        }
        C9212qy1 c9212qy1 = this.m;
        if (c9212qy1 != null) {
            ((AbstractC11276wz3) this.l).s(c9212qy1);
        }
        C9554ry1 c9554ry1 = this.o;
        if (c9554ry1 != null) {
            ((AbstractC11276wz3) this.l).c.f(c9554ry1);
        }
    }

    public C9897sy1(InterfaceC7839my1 interfaceC7839my1, ViewGroup viewGroup, InterfaceC7697ma2 interfaceC7697ma2, InterfaceC0079Ap3 interfaceC0079Ap3) {
        this.g = interfaceC7839my1;
        this.a = 1.0f / interfaceC7839my1.getContext().getResources().getDisplayMetrics().density;
        this.f11543J = interfaceC7697ma2;
        this.O = interfaceC0079Ap3;
        this.A = interfaceC7839my1.getContext();
        Class[] clsArr = {C1198Jf2.class, GS3.class, C3188Yn3.class, RY2.class, C0319Cl3.class, N70.class};
        for (int i = 0; i < 6; i++) {
            this.N.put(clsArr[i], Integer.valueOf(i));
        }
        this.k = viewGroup;
        this.H = new V10(new RunnableC8183ny1(this));
        this.z = new C0678Ff2();
        this.K = new C6829k20(new RunnableC8183ny1(this));
    }

    public final boolean I(MotionEvent motionEvent) {
        AbstractC5518gD0 abstractC5518gD0 = this.u;
        if (abstractC5518gD0.b) {
            motionEvent.offsetLocation(abstractC5518gD0.c, abstractC5518gD0.d);
        }
        abstractC5518gD0.c(motionEvent);
        PointF v = v(motionEvent);
        if (v == null) {
            return true;
        }
        AbstractC5518gD0 abstractC5518gD02 = this.u;
        float f = v.x;
        float f2 = v.y;
        abstractC5518gD02.c = f;
        abstractC5518gD02.d = f2;
        return true;
    }

    public final PointF v(MotionEvent motionEvent) {
        int a = WS2.a(motionEvent.getActionMasked());
        PointF pointF = this.F;
        if (a == 0 || a == 9) {
            RectF rectF = this.E;
            A(rectF);
            pointF.set(-rectF.left, -rectF.top);
            return pointF;
        }
        if (a != 1 && a != 3 && a != 10) {
            return null;
        }
        pointF.set(0.0f, 0.0f);
        return pointF;
    }

    public void B(InterfaceC10590uz3 interfaceC10590uz3, ChromeActivity chromeActivity, B80 b80, C9537rv0 c9537rv0, QS3 qs3) {
        CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.g;
        compositorViewHolder.getClass();
        InterfaceC7839my1 interfaceC7839my1 = this.g;
        CC cc = ((CompositorViewHolder) interfaceC7839my1).t;
        this.L = cc;
        this.j = new C0054Ak3(this.A, this, compositorViewHolder, interfaceC7839my1, this.K, interfaceC10590uz3, (TabContentManager) ((C8385oa2) this.f11543J).g, cc, this.O);
        O(null, true);
        C0678Ff2 c0678Ff2 = this.z;
        c0678Ff2.e = c9537rv0;
        HashSet hashSet = c0678Ff2.a;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((AbstractC9101qf2) it.next()).P = c9537rv0;
        }
        ViewGroup viewGroup = this.k;
        c0678Ff2.f = viewGroup;
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((AbstractC9101qf2) it2.next()).O = viewGroup;
        }
        if (this.l == null) {
            R(interfaceC10590uz3);
        }
    }

    public void R(InterfaceC10590uz3 interfaceC10590uz3) {
        this.l = interfaceC10590uz3;
        this.I.p(interfaceC10590uz3);
        this.n = new C8869py1(this, this.l);
        AbstractC2976Wx1 abstractC2976Wx1 = this.s;
        if (abstractC2976Wx1 != null) {
            Y(abstractC2976Wx1, true);
        }
        C9212qy1 c9212qy1 = new C9212qy1(this);
        this.m = c9212qy1;
        ((AbstractC11276wz3) interfaceC10590uz3).c(c9212qy1);
        C9554ry1 g = g();
        this.o = g;
        ((AbstractC11276wz3) this.l).c.b(g);
    }

    public final void O(AbstractC2976Wx1 abstractC2976Wx1, boolean z) {
        if (abstractC2976Wx1 == null) {
            abstractC2976Wx1 = this.j;
        }
        this.s = abstractC2976Wx1;
        this.t = z;
    }

    public C9554ry1 g() {
        return new C9554ry1(this);
    }

    public static void d(C9897sy1 c9897sy1, int i, boolean z, boolean z2) {
        InterfaceC10590uz3 interfaceC10590uz3 = c9897sy1.l;
        Tab h = interfaceC10590uz3 != null ? ((AbstractC11276wz3) interfaceC10590uz3).h() : null;
        c9897sy1.a0(i, h != null ? h.getId() : -1, z, z2);
    }

    public void a(int i) {
        Tab m;
        C1551Ly1 c1551Ly1;
        InterfaceC10590uz3 interfaceC10590uz3 = this.l;
        if (interfaceC10590uz3 == null || this.r == null || (m = ((AbstractC11276wz3) interfaceC10590uz3).m(i)) == null || (c1551Ly1 = (C1551Ly1) this.v.get(i)) == null) {
            return;
        }
        boolean z = false;
        boolean z2 = (m.b() == null || C8693pT2.W0(m) || (m.isNativePage() || m.getUrl().h().equals("chrome-native")) || m.isHidden()) ? false : true;
        QS3 qs3 = (QS3) this.O.get();
        qs3.getClass();
        int f = QS3.f(m);
        if ((m.l() || m.g()) && !AbstractC5107f12.a(m.getUrl(), m.isIncognito())) {
            z = true;
        }
        int g = qs3.g(m);
        int a = AbstractC3494aK3.a(this.A, m, qs3.d(m.k(), m));
        float h = qs3.h(m);
        c1551Ly1.m(C1551Ly1.M, f);
        c1551Ly1.m(C1551Ly1.N, g);
        c1551Ly1.m(C1551Ly1.O, a);
        c1551Ly1.l(C1551Ly1.P, h);
        c1551Ly1.k(C1551Ly1.A, z);
        c1551Ly1.k(C1551Ly1.B, z2);
        c1551Ly1.k(C1551Ly1.L, true);
        ((CompositorViewHolder) this.g).v(null);
    }

    public void b0(int i, int i2, int i3, boolean z, boolean z2, float f, float f2) {
        AbstractC1558Lz3.d(((AbstractC11276wz3) this.l).j(z), i);
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        SystemClock.uptimeMillis();
        abstractC2976Wx1.y(i, i2, z, !z2, f, f2);
    }

    public final void A(RectF rectF) {
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        InterfaceC7839my1 interfaceC7839my1 = this.g;
        if (abstractC2976Wx1 == null) {
            ((CompositorViewHolder) interfaceC7839my1).m(rectF);
            return;
        }
        int p = abstractC2976Wx1.p();
        if (p == 0) {
            ((CompositorViewHolder) interfaceC7839my1).m(rectF);
            return;
        }
        if (p == 1) {
            CompositorViewHolder compositorViewHolder = (CompositorViewHolder) interfaceC7839my1;
            compositorViewHolder.m(rectF);
            if (compositorViewHolder.t != null) {
                rectF.top += r0.m;
            }
            rectF.bottom -= compositorViewHolder.f();
            return;
        }
        if (p != 3) {
            ((CompositorViewHolder) interfaceC7839my1).j(rectF);
            return;
        }
        if (!this.B) {
            ((CompositorViewHolder) interfaceC7839my1).m(rectF);
            return;
        }
        CompositorViewHolder compositorViewHolder2 = (CompositorViewHolder) interfaceC7839my1;
        compositorViewHolder2.m(rectF);
        if (compositorViewHolder2.t != null) {
            rectF.top += r0.m;
        }
        rectF.bottom -= compositorViewHolder2.f();
    }

    public final boolean G(int i) {
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        return abstractC2976Wx1 != null && abstractC2976Wx1.m() == i;
    }

    public void H(boolean z) {
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        if (abstractC2976Wx1 == null) {
            return;
        }
        abstractC2976Wx1.D(z);
    }

    public final void J() {
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        InterfaceC7839my1 interfaceC7839my1 = this.g;
        if (abstractC2976Wx1 != null) {
            float f = abstractC2976Wx1.a;
            float f2 = abstractC2976Wx1.g;
            RectF rectF = this.D;
            float f3 = rectF.top;
            CompositorViewHolder compositorViewHolder = (CompositorViewHolder) interfaceC7839my1;
            compositorViewHolder.m(rectF);
            RectF rectF2 = this.C;
            compositorViewHolder.j(rectF2);
            AbstractC2976Wx1 abstractC2976Wx12 = this.r;
            CC cc = compositorViewHolder.t;
            int i = cc != null ? cc.m : 0;
            int f4 = compositorViewHolder.f();
            int i2 = interfaceC7839my1.getWidth() > interfaceC7839my1.getHeight() ? 2 : 1;
            abstractC2976Wx12.getClass();
            float width = rectF.width();
            float f5 = abstractC2976Wx12.t;
            float f6 = width / f5;
            float height = rectF.height() / f5;
            float f7 = i / f5;
            float f8 = f4 / f5;
            boolean z = (Float.compare(abstractC2976Wx12.a, f6) == 0 && Float.compare(abstractC2976Wx12.g, height) == 0 && Float.compare(abstractC2976Wx12.h, f7) == 0 && Float.compare(abstractC2976Wx12.i, f8) == 0 && abstractC2976Wx12.k == i2) ? false : true;
            abstractC2976Wx12.a = f6;
            abstractC2976Wx12.g = height;
            abstractC2976Wx12.h = f7;
            abstractC2976Wx12.i = f8;
            abstractC2976Wx12.k = i2;
            if (z) {
                abstractC2976Wx12.s();
            }
            float width2 = rectF.width();
            float f9 = this.a;
            float f10 = width2 * f9;
            float height2 = rectF.height() * f9;
            if (f10 != f || height2 != f2 || f3 != rectF2.top) {
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.M;
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    ((InterfaceC3897bW2) arrayList.get(i3)).c0(f10, height2, rectF2.top, interfaceC7839my1.getWidth() > interfaceC7839my1.getHeight() ? 2 : 1);
                    i3++;
                }
            }
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.v;
            if (i4 >= sparseArray.size()) {
                return;
            }
            C1551Ly1 c1551Ly1 = (C1551Ly1) sparseArray.valueAt(i4);
            int width3 = interfaceC7839my1.getWidth();
            int height3 = interfaceC7839my1.getHeight();
            c1551Ly1.l(C1551Ly1.t, width3 * C1551Ly1.d);
            c1551Ly1.l(C1551Ly1.u, height3 * C1551Ly1.d);
            i4++;
        }
    }

    public void a0(int i, int i2, boolean z, boolean z2) {
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        if (abstractC2976Wx1 != null) {
            SystemClock.uptimeMillis();
            abstractC2976Wx1.v(i2);
        }
    }

    @Override // defpackage.InterfaceC10240ty1
    public void d0(int i, boolean z) {
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        if (abstractC2976Wx1 != null && !abstractC2976Wx1.q) {
            O(u(i), z);
            abstractC2976Wx1.J(-1, z);
        } else {
            Y(u(i), z);
        }
    }

    public void e0(int i) {
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        if (abstractC2976Wx1 != null) {
            abstractC2976Wx1.z(i);
        }
    }

    public void f0(boolean z) {
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        if (abstractC2976Wx1 != null) {
            abstractC2976Wx1.A();
        }
    }

    public final int o() {
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        if (abstractC2976Wx1 != null) {
            return abstractC2976Wx1.m();
        }
        return 0;
    }

    public final void X(int i, boolean z) {
        N(null);
        C12157za2 c12157za2 = this.p;
        if (z) {
            Iterator it = this.q.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    ((BV2) c11814ya2.next()).a(i);
                }
            }
            Iterator it2 = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya22 = (C11814ya2) it2;
                if (!c11814ya22.hasNext()) {
                    break;
                } else {
                    ((InterfaceC1292Jy1) c11814ya22.next()).a(i);
                }
            }
        }
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        Iterator it3 = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya23 = (C11814ya2) it3;
            if (!c11814ya23.hasNext()) {
                return;
            } else {
                ((InterfaceC1292Jy1) c11814ya23.next()).i(abstractC2976Wx1.m(), V(abstractC2976Wx1, i), U(abstractC2976Wx1));
            }
        }
    }

    public final void N(Runnable runnable) {
        if (this.y && runnable == null) {
            return;
        }
        ((CompositorViewHolder) this.g).v(runnable);
        this.y = true;
    }

    public void b() {
        if (this.s == null) {
            return;
        }
        Iterator it = this.p.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (c11814ya2.hasNext()) {
                ((InterfaceC1292Jy1) c11814ya2.next()).c(this.r.m());
            } else {
                Y(this.s, this.t);
                return;
            }
        }
    }

    public AbstractC2976Wx1 u(int i) {
        if (i == 0 || i == 1) {
            return this.j;
        }
        return null;
    }

    public void Y(AbstractC2976Wx1 abstractC2976Wx1, boolean z) {
        if (abstractC2976Wx1 == null) {
            return;
        }
        O(null, true);
        AbstractC2976Wx1 abstractC2976Wx12 = this.r;
        InterfaceC7839my1 interfaceC7839my1 = this.g;
        if (abstractC2976Wx12 != abstractC2976Wx1) {
            if (abstractC2976Wx12 != null) {
                abstractC2976Wx12.h();
                abstractC2976Wx12.e();
            }
            Context context = interfaceC7839my1.getContext();
            abstractC2976Wx1.j = context;
            float f = context.getResources().getDisplayMetrics().density;
            C1551Ly1.c = f;
            C1551Ly1.d = 1.0f / f;
            abstractC2976Wx1.a(this.k);
            this.r = abstractC2976Wx1;
        }
        CompositorViewHolder compositorViewHolder = (CompositorViewHolder) interfaceC7839my1;
        CC cc = compositorViewHolder.t;
        if (cc != null) {
            this.B = true ^ (cc.w == 1.0f);
            cc.g.u(this.w);
            this.r.getClass();
        }
        J();
        this.r.I(SystemClock.uptimeMillis(), z);
        AbstractC2976Wx1 abstractC2976Wx13 = this.r;
        abstractC2976Wx13.getClass();
        boolean z2 = abstractC2976Wx13 instanceof C0054Ak3;
        boolean b = this.r.b();
        if (z2 != compositorViewHolder.m || b != compositorViewHolder.n) {
            compositorViewHolder.m = z2;
            compositorViewHolder.n = b;
            compositorViewHolder.y(z2);
        }
        N(null);
        Iterator it = this.q.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            } else {
                ((BV2) c11814ya2.next()).s(this.r);
            }
        }
        Iterator it2 = this.p.iterator();
        while (true) {
            C11814ya2 c11814ya22 = (C11814ya2) it2;
            if (!c11814ya22.hasNext()) {
                return;
            } else {
                ((InterfaceC1292Jy1) c11814ya22.next()).d(abstractC2976Wx1.m(), W(z));
            }
        }
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        Iterator it = this.M.iterator();
        while (it.hasNext()) {
            InterfaceC3897bW2 interfaceC3897bW2 = (InterfaceC3897bW2) it.next();
            Boolean bool = (Boolean) ((C8385oa2) interfaceC3897bW2.r()).g;
            if (bool != null && bool.booleanValue()) {
                interfaceC3897bW2.h();
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.P;
    }

    public final void f(InterfaceC3897bW2 interfaceC3897bW2) {
        ArrayList arrayList = this.M;
        if (arrayList.contains(interfaceC3897bW2)) {
            throw new RuntimeException("Overlay already added!");
        }
        HashMap hashMap = this.N;
        if (!hashMap.containsKey(interfaceC3897bW2.getClass())) {
            throw new RuntimeException("Please add overlay to order list in constructor.");
        }
        int intValue = ((Integer) hashMap.get(interfaceC3897bW2.getClass())).intValue();
        int i = 0;
        while (i < arrayList.size() && intValue >= ((Integer) hashMap.get(((InterfaceC3897bW2) arrayList.get(i)).getClass())).intValue()) {
            i++;
        }
        arrayList.add(i, interfaceC3897bW2);
        ((C8385oa2) interfaceC3897bW2.r()).m(new Callback() { // from class: oy1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C9897sy1 c9897sy1 = C9897sy1.this;
                Iterator it = c9897sy1.M.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    C8385oa2 c8385oa2 = c9897sy1.P;
                    if (hasNext) {
                        Boolean bool = (Boolean) ((C8385oa2) ((InterfaceC3897bW2) it.next()).r()).g;
                        if (bool != null && bool.booleanValue()) {
                            c8385oa2.p(Boolean.TRUE);
                            return;
                        }
                    } else {
                        c8385oa2.p(Boolean.FALSE);
                        return;
                    }
                }
            }
        });
    }

    public void n(int i) {
        SparseArray sparseArray = this.v;
        C1551Ly1 c1551Ly1 = (C1551Ly1) sparseArray.get(i);
        sparseArray.clear();
        if (c1551Ly1 != null) {
            sparseArray.put(i, c1551Ly1);
        }
    }

    public void Z(int i, Tab tab) {
        tab.getId();
        tab.isIncognito();
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        if (abstractC2976Wx1 != null) {
            SystemClock.uptimeMillis();
            abstractC2976Wx1.C();
        }
    }

    public final void e(InterfaceC1292Jy1 interfaceC1292Jy1) {
        this.p.a(interfaceC1292Jy1);
    }

    public final void L(InterfaceC1292Jy1 interfaceC1292Jy1) {
        this.p.d(interfaceC1292Jy1);
    }
}
