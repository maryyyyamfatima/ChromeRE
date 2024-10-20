package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.tasks.tab_management.c;
import org.chromium.chrome.browser.tasks.tab_management.n;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZC3 implements InterfaceC8947qB3, InterfaceC1943Oy3, InterfaceC11271wy3, InterfaceC0258Bz2, InterfaceC7922nC3 {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public final boolean G;
    public VC3 H;
    public boolean I;

    /* renamed from: J */
    public final int f11478J;
    public final Context K;
    public ViewOnClickListenerC1069If3 L;
    public final Handler a;
    public final JC3 g;
    public final KC3 h;
    public final YC3 i;
    public final PropertyModel j;
    public final InterfaceC10590uz3 k;
    public final RC3 l;
    public final QC3 m;
    public final JC o;
    public final SC3 p;
    public final ViewGroup q;
    public final TabContentManager r;
    public final C7507m02 s;
    public final LC3 t;
    public C0759Fv3 w;
    public InterfaceC12028zA3 x;
    public InterfaceC9289rB3 y;
    public C0388Cz2 z;
    public final C12157za2 n = new C12157za2();
    public final C8385oa2 u = new C8385oa2();
    public final C8385oa2 v = new C8385oa2();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [JC3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [KC3] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, LC3] */
    public ZC3(Context context, final YC3 yc3, PropertyModel propertyModel, InterfaceC10590uz3 interfaceC10590uz3, JC jc, ViewGroup viewGroup, TabContentManager tabContentManager, final WC3 wc3, XC3 xc3, C7507m02 c7507m02, int i) {
        this.i = yc3;
        this.j = propertyModel;
        this.k = interfaceC10590uz3;
        this.o = jc;
        this.s = c7507m02;
        this.f11478J = i;
        this.K = context;
        QC3 qc3 = new QC3(this);
        this.m = qc3;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        abstractC11276wz3.c(qc3);
        RC3 rc3 = new RC3(this, wc3, xc3);
        this.l = rc3;
        SC3 sc3 = new SC3(this);
        this.p = sc3;
        CC cc = (CC) jc;
        cc.d(sc3);
        if (abstractC11276wz3.a.isEmpty()) {
            abstractC11276wz3.c(new TC3(this));
        } else {
            abstractC11276wz3.c.b(rc3);
        }
        propertyModel.o(AbstractC1678Mx3.c, this);
        AbstractC7158kz3 d = abstractC11276wz3.c.d();
        propertyModel.k(AbstractC1678Mx3.b, d == null ? false : d.isIncognito());
        propertyModel.k(AbstractC1678Mx3.e, true);
        if (i != 2) {
            g();
            propertyModel.m(AbstractC1678Mx3.g, cc.o);
        }
        if (i == 0) {
            propertyModel.m(AbstractC1678Mx3.i, (int) context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08077f));
        }
        this.q = viewGroup;
        Objects.requireNonNull(yc3);
        this.g = new Runnable() { // from class: JC3
            @Override // java.lang.Runnable
            public final void run() {
                n nVar = (n) YC3.this;
                int i2 = 0;
                while (true) {
                    C1813Ny3 c1813Ny3 = nVar.j.a.e;
                    if (i2 >= c1813Ny3.size()) {
                        return;
                    }
                    if (((C7272lK1) c1813Ny3.get(i2)).b.h(AbstractC1683My3.a) == 0) {
                        ((C7272lK1) c1813Ny3.get(i2)).b.o(AbstractC9627sA3.e, null);
                    }
                    i2++;
                }
            }
        };
        this.h = new Runnable() { // from class: KC3
            @Override // java.lang.Runnable
            public final void run() {
                ZC3 zc3 = ZC3.this;
                ((n) zc3.i).u(null, false, zc3.G);
            }
        };
        this.a = new Handler();
        this.r = tabContentManager;
        this.G = n.t(i);
        ?? r2 = new InterfaceC7163l02() { // from class: LC3
            @Override // defpackage.InterfaceC7163l02
            public final void b(boolean z) {
                WC3 wc32 = WC3.this;
                if (!z) {
                    ((n) wc32).w();
                    return;
                }
                c cVar = ((n) wc32).j;
                cVar.j(3, 5);
                cVar.j(6, 4);
            }
        };
        this.t = r2;
        c7507m02.b.a(r2);
    }

    public final void g() {
        Context context = this.K;
        boolean d = AbstractC5241fQ2.d(context);
        ND2 nd2 = AbstractC1678Mx3.h;
        ND2 nd22 = AbstractC1678Mx3.f;
        PropertyModel propertyModel = this.j;
        if (d) {
            propertyModel.m(nd22, 0);
            propertyModel.m(nd2, 0);
        } else if (!AbstractC5177fD3.i(context)) {
            int i = ((CC) this.o).t;
            propertyModel.m(nd22, i);
            propertyModel.m(nd2, i);
        } else {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080803);
            propertyModel.m(nd22, dimensionPixelSize);
            propertyModel.m(nd2, dimensionPixelSize);
        }
    }

    @Override // defpackage.InterfaceC8947qB3
    public final boolean u0() {
        return this.j.j(AbstractC1678Mx3.a);
    }

    @Override // defpackage.InterfaceC8947qB3
    public final ViewGroup S() {
        return this.q;
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void P(InterfaceC9975tB3 interfaceC9975tB3) {
        this.n.a(interfaceC9975tB3);
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void z(DC3 dc3) {
        this.n.d(dc3);
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void w(boolean z) {
        LD2 ld2 = AbstractC1678Mx3.e;
        PropertyModel propertyModel = this.j;
        if (!z) {
            propertyModel.k(ld2, false);
        }
        propertyModel.k(AbstractC1678Mx3.a, false);
        b();
        propertyModel.k(ld2, true);
        C0759Fv3 c0759Fv3 = this.w;
        if (c0759Fv3 != null) {
            c0759Fv3.g.e(false);
            c0759Fv3.a.h();
        }
    }

    public final void f() {
        this.j.o(AbstractC1678Mx3.d, Integer.valueOf(this.G ? 0 : Math.max(((AbstractC11276wz3) this.k).c.d().index() - (this.f11478J == 2 ? 1 : 2), 0)));
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void m0(boolean z) {
        Handler handler = this.a;
        handler.removeCallbacks(this.g);
        handler.removeCallbacks(this.h);
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) this.k;
        boolean z2 = abstractC11276wz3.i;
        boolean z3 = this.G;
        YC3 yc3 = this.i;
        if (z2) {
            ((n) yc3).u(abstractC11276wz3.c.d(), AbstractC5177fD3.g(), z3);
            e();
            f();
        } else if (UN.E.a()) {
            C7432ln3 c = C7432ln3.c();
            try {
                IE2.m(this.K);
                ArrayList arrayList = IE2.f;
                c.close();
                ((n) yc3).v(arrayList, AbstractC5177fD3.g(), z3);
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        LD2 ld2 = AbstractC1678Mx3.e;
        PropertyModel propertyModel = this.j;
        if (!z) {
            propertyModel.k(ld2, false);
        }
        FI2.a("MobileToolbarShowStackView");
        propertyModel.k(AbstractC1678Mx3.a, true);
        b();
        this.C = abstractC11276wz3.e;
        this.D = abstractC11276wz3.i();
        propertyModel.k(ld2, true);
    }

    @Override // defpackage.InterfaceC8947qB3
    public final boolean C(boolean z) {
        boolean z2;
        boolean z3;
        InterfaceC12028zA3 interfaceC12028zA3 = this.x;
        if (interfaceC12028zA3 != null) {
            GA3 ga3 = (GA3) interfaceC12028zA3;
            if (ga3.i.j(HA3.a)) {
                ga3.n.a();
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return true;
            }
        }
        if (!this.j.j(AbstractC1678Mx3.a)) {
            return false;
        }
        C0759Fv3 c0759Fv3 = this.w;
        if (c0759Fv3 != null) {
            if (c0759Fv3.c()) {
                c0759Fv3.h();
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        if (z && this.f11478J == 2) {
            return false;
        }
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) this.k;
        if (abstractC11276wz3.h() == null) {
            return false;
        }
        c(abstractC11276wz3.i(), false);
        return true;
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        C(this.A);
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.u;
    }

    @Override // defpackage.InterfaceC8947qB3
    public final boolean k() {
        InterfaceC12028zA3 interfaceC12028zA3 = this.x;
        if (interfaceC12028zA3 != null) {
            if (((GA3) interfaceC12028zA3).i.j(HA3.a)) {
                return true;
            }
        }
        C0759Fv3 c0759Fv3 = this.w;
        return c0759Fv3 != null && c0759Fv3.c();
    }

    @Override // defpackage.InterfaceC8947qB3
    public final C8385oa2 T() {
        return this.v;
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void M(long j) {
        this.H = new VC3(j);
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void Q(long j) {
        if (this.f11478J == 2) {
            EI2.b("Startup.Android.LastVisitedTabIsSRPWhenOverviewShownAtLaunch", O83.a.e("Chrome.StartSurface.IsLastVisitedTabSRP", false));
        }
    }

    @Override // defpackage.InterfaceC8947qB3
    public final int q() {
        int i = this.f11478J;
        if (i != 0) {
            return i != 2 ? 3 : 1;
        }
        return 0;
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void m(boolean z) {
        this.A = z;
        b();
    }

    @Override // defpackage.InterfaceC8947qB3
    public final void E(ViewGroup viewGroup) {
        ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = this.L;
        if (viewOnClickListenerC1069If3 == null) {
            return;
        }
        viewOnClickListenerC1069If3.l = viewGroup;
        C1978Pf3 c1978Pf3 = viewOnClickListenerC1069If3.g;
        if (c1978Pf3 != null) {
            c1978Pf3.e(viewGroup);
        }
    }

    public final void c(int i, boolean z) {
        int i2;
        if (z && ((i2 = this.f11478J) == 2 || i2 == 0)) {
            Tab c = AbstractC1558Lz3.c(((AbstractC11276wz3) this.k).g(), i);
            C1998Pj3.b(c);
            if (i2 == 2) {
                C1998Pj3.c(c);
            }
        }
        this.F = true;
        InterfaceC9289rB3 interfaceC9289rB3 = this.y;
        if (interfaceC9289rB3 != null) {
            interfaceC9289rB3.e(i, SystemClock.uptimeMillis());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:            if (a(r3.getId()).size() != 1) goto L70;     */
    /* JADX WARN: Type inference failed for: r3v1, types: [PC3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.PC3 d(org.chromium.chrome.browser.tab.Tab r3) {
        /*
            r2 = this;
            android.content.Context r0 = r2.K
            boolean r0 = defpackage.AbstractC5177fD3.e(r0)
            if (r0 == 0) goto L26
            uz3 r0 = r2.k
            wz3 r0 = (defpackage.AbstractC11276wz3) r0
            boolean r0 = r0.o()
            boolean r1 = r3.isIncognito()
            if (r0 != r1) goto L26
            int r3 = r3.getId()
            java.util.List r3 = r2.a(r3)
            int r3 = r3.size()
            r0 = 1
            if (r3 == r0) goto L26
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 != 0) goto L2b
            r3 = 0
            return r3
        L2b:
            PC3 r3 = new PC3
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ZC3.d(org.chromium.chrome.browser.tab.Tab):PC3");
    }

    public final List a(int i) {
        return ((AbstractC11276wz3) this.k).c.d().G(i);
    }

    public final void e() {
        InterfaceC10590uz3 interfaceC10590uz3 = this.k;
        TabModel g = ((AbstractC11276wz3) interfaceC10590uz3).g();
        if (g == null) {
            return;
        }
        EI2.e(g.getCount(), "Tabs.TabCountInSwitcher");
        AbstractC7158kz3 d = ((AbstractC11276wz3) interfaceC10590uz3).c.d();
        if (d == null) {
            return;
        }
        EI2.e(d.getCount(), "Tabs.IndependentTabCountInSwitcher");
    }

    public final void b() {
        this.v.p(Boolean.valueOf(k()));
        boolean z = true;
        if (!k()) {
            if (!this.j.j(AbstractC1678Mx3.a) || ((this.A && this.f11478J == 2) || ((AbstractC11276wz3) this.k).h() == null)) {
                z = false;
            }
        }
        this.u.p(Boolean.valueOf(z));
    }
}
