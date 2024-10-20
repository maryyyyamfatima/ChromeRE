package defpackage;

import J.N;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.omnibox.g;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fj3 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC0699Fj3 implements InterfaceC9975tB3, View.OnClickListener, InterfaceC6720jj3, InterfaceC7458ls {
    public final C0179Bj3 A;
    public final C0049Aj3 B;
    public final JC C;
    public final C0439Dj3 D;
    public final C7752mj3 E;
    public final boolean F;
    public final InterfaceC0408Dd2 G;
    public boolean H;
    public Boolean I;

    /* renamed from: J */
    public Boolean f11442J;
    public boolean K;
    public final InterfaceC6092ht1 L;
    public InterfaceC6720jj3 N;
    public final ViewGroup O;
    public ViewOnClickListenerC1069If3 P;
    public final InterfaceC8947qB3 g;
    public final InterfaceC10590uz3 h;
    public final PropertyModel i;
    public final C7752mj3 j;
    public final boolean k;
    public final boolean m;
    public final boolean n;
    public final Runnable o;
    public DF0 p;
    public InterfaceC8947qB3 q;
    public PropertyModel r;
    public boolean s;
    public InterfaceC5991hc2 t;
    public final Context u;
    public final C0569Ej3 v;
    public int w;
    public int x;
    public TabModel z;
    public final C12157za2 a = new C12157za2();
    public final C12157za2 l = new C12157za2();
    public boolean M = true;
    public final C8385oa2 Q = new C8385oa2();
    public int y = 0;

    public ViewOnClickListenerC0699Fj3(InterfaceC8947qB3 interfaceC8947qB3, ViewGroup viewGroup, AbstractC11276wz3 abstractC11276wz3, PropertyModel propertyModel, C7752mj3 c7752mj3, boolean z, Context context, JC jc, C7752mj3 c7752mj32, boolean z2, boolean z3, C0538Ed2 c0538Ed2, boolean z4, C6434it1 c6434it1, RunnableC8096nj3 runnableC8096nj3, C9861ss c9861ss) {
        this.g = interfaceC8947qB3;
        this.O = viewGroup;
        this.h = abstractC11276wz3;
        this.i = propertyModel;
        this.j = c7752mj3;
        this.k = z;
        this.u = context;
        this.C = jc;
        this.E = c7752mj32;
        this.F = z2;
        this.n = z3;
        this.G = c0538Ed2;
        this.m = z4;
        this.L = c6434it1;
        this.o = runnableC8096nj3;
        if (propertyModel != null) {
            boolean o = abstractC11276wz3.o();
            this.s = o;
            this.B = new C0049Aj3(this);
            propertyModel.k(AbstractC6910kG3.b, o);
            propertyModel.o(AbstractC6910kG3.s, this);
            this.A = new C0179Bj3(this);
            if (abstractC11276wz3.a.isEmpty()) {
                abstractC11276wz3.c(new C0309Cj3(this));
            } else {
                this.z = abstractC11276wz3.j(false);
            }
            this.D = new C0439Dj3(this);
            this.v = new C0569Ej3(this);
            Resources resources = context.getResources();
            propertyModel.m(AbstractC6910kG3.v, resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807bc));
            propertyModel.m(AbstractC6910kG3.w, resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0805ea));
            propertyModel.m(AbstractC6910kG3.x, resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807b8));
        }
        interfaceC8947qB3.P(this);
        this.x = 0;
        this.w = 0;
        if (C9861ss.b()) {
            c9861ss.a(this, 4);
            n();
            ((C8385oa2) interfaceC8947qB3.r()).m(new Callback() { // from class: wj3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    ViewOnClickListenerC0699Fj3.this.n();
                }
            });
            interfaceC8947qB3.T().m(new Callback() { // from class: xj3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    ViewOnClickListenerC0699Fj3.this.n();
                }
            });
        }
    }

    public final void A(int i, int i2) {
        int i3;
        int i4;
        PropertyModel propertyModel = this.i;
        if (propertyModel == null || i == (i3 = this.w)) {
            return;
        }
        int i5 = this.x;
        if (i3 != 0) {
            this.x = i3;
        }
        this.w = i;
        x();
        if (propertyModel.j(AbstractC0829Gj3.e) && (i4 = this.w) != 0) {
            if (!(i4 == 1 || i4 == 2)) {
                this.w = f();
                x();
            }
        }
        o();
        int i6 = this.w;
        InterfaceC6092ht1 interfaceC6092ht1 = this.L;
        if (i6 == 0) {
            interfaceC6092ht1.b(7);
            interfaceC6092ht1.b(8);
        } else if (i6 == 1) {
            interfaceC6092ht1.a(7);
            interfaceC6092ht1.b(8);
        } else if (i6 == 2) {
            interfaceC6092ht1.b(7);
            interfaceC6092ht1.a(8);
        }
        if (i2 == 1) {
            AbstractC1868Oj3.a.h = null;
        }
        this.y = i2;
        BF0 bf0 = (BF0) propertyModel.i(AbstractC0829Gj3.f);
        if (bf0 != null) {
            int i7 = this.y;
            C12075zK0 c12075zK0 = bf0.b;
            c12075zK0.getClass();
            int i8 = i7 == 1 ? 1 : -1;
            SK0 sk0 = c12075zK0.f;
            if (i8 == -1) {
                sk0.getClass();
                i8 = AbstractC4860eJ0.a();
            }
            sk0.k.m(AbstractC4077c13.c, sk0.F.size() > i8 ? i8 : 0);
        }
        int i9 = this.w;
        if (i9 == 1) {
            FI2.a("StartSurface.SinglePane.Home");
            return;
        }
        if (i9 == 2) {
            FI2.a("StartSurface.SinglePane.Tabswitcher");
        } else if (i9 == 7 && i5 == 1) {
            AbstractC5241fQ2.h("FromTab");
        }
    }

    public final void x() {
        int count;
        Runnable runnable;
        int i = this.w;
        InterfaceC10590uz3 interfaceC10590uz3 = this.h;
        PropertyModel propertyModel = this.i;
        boolean z = false;
        if (i == 6) {
            PD2 pd2 = AbstractC6910kG3.z;
            Boolean bool = Boolean.TRUE;
            propertyModel.o(pd2, bool);
            propertyModel.o(AbstractC0829Gj3.h, bool);
            AbstractC1868Oj3.a.h = null;
        } else if (i == 4) {
            y(true, true);
        } else {
            ND2 nd2 = AbstractC0829Gj3.a;
            boolean z2 = this.n;
            LD2 ld2 = AbstractC7347lZ1.a;
            boolean z3 = this.F;
            JC jc = this.C;
            if (i == 1) {
                AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
                if (!abstractC11276wz3.i) {
                    count = O83.a.f(0, "Chrome.StartSurface.RegularTabCount");
                } else {
                    count = abstractC11276wz3.j(false).getCount();
                }
                boolean z4 = count > 0;
                boolean z5 = !this.s;
                if (!z3) {
                    if (z5 && (runnable = this.o) != null) {
                        runnable.run();
                    }
                    LD2 ld22 = AbstractC6910kG3.a;
                    propertyModel.k(ld2, z5);
                }
                B(z4 && !this.s);
                u((this.s || this.p == null) ? false : true);
                if (!z2) {
                    LD2 ld23 = AbstractC6910kG3.t;
                    if (propertyModel.j(ld23)) {
                        propertyModel.k(ld23, false);
                    }
                }
                v(!this.s);
                y(this.s, false);
                Context context = this.u;
                propertyModel.m(AbstractC6910kG3.y, context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080746) + context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080154));
                CC cc = (CC) jc;
                D(cc.n);
                propertyModel.m(nd2, cc.o);
                TabModel tabModel = this.z;
                if (tabModel != null) {
                    tabModel.g(this.A);
                } else {
                    this.H = true;
                }
            } else if (i == 2) {
                B(false);
                if (!z3) {
                    LD2 ld24 = AbstractC6910kG3.a;
                    propertyModel.k(ld2, false);
                }
                if (!z2) {
                    LD2 ld25 = AbstractC6910kG3.t;
                    if (propertyModel.j(ld25)) {
                        propertyModel.k(ld25, false);
                    }
                }
                v(false);
                y(true, false);
                u(false);
                propertyModel.m(AbstractC6910kG3.y, 0);
                D(((CC) jc).m);
                propertyModel.m(nd2, 0);
            } else if (i == 0 && this.r != null) {
                y(false, false);
            }
        }
        int i2 = this.w;
        if (i2 == 1 || i2 == 2) {
            if (this.s && ((AbstractC11276wz3) interfaceC10590uz3).j(true).getCount() <= 0) {
                z = true;
            }
            LD2 ld26 = AbstractC6910kG3.d;
            if (z == propertyModel.j(ld26)) {
                return;
            }
            LD2 ld27 = AbstractC6910kG3.c;
            if (!propertyModel.j(ld27)) {
                propertyModel.k(ld27, true);
            }
            propertyModel.k(ld26, z);
            LD2 ld28 = AbstractC6910kG3.f;
            boolean z6 = !z;
            propertyModel.k(ld28, z6);
            PropertyModel propertyModel2 = this.r;
            if (propertyModel2 != null) {
                if (!propertyModel2.j(ld27)) {
                    this.r.k(ld27, true);
                }
                this.r.k(ld26, z);
                this.r.k(ld28, z6);
            }
        }
    }

    public final boolean t() {
        OJ0 i;
        boolean z = this.w == 1;
        InterfaceC8947qB3 interfaceC8947qB3 = this.q;
        if (interfaceC8947qB3 != null && interfaceC8947qB3.k()) {
            return this.q.C(z);
        }
        InterfaceC8947qB3 interfaceC8947qB32 = this.g;
        if (interfaceC8947qB32.k()) {
            return interfaceC8947qB32.C(z);
        }
        if (this.w == 2) {
            if (this.x == 1 && !this.s) {
                A(1, this.y);
                AbstractC5241fQ2.h("FromTabSwitcher");
                return true;
            }
            return this.q.C(z);
        }
        if (z && (i = i()) != null) {
            i.a(23, false);
        }
        return interfaceC8947qB32.C(z);
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        t();
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.Q;
    }

    @Override // defpackage.InterfaceC9975tB3
    public final void d() {
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((MB3) c11814ya2.next()).b.N = false;
            }
        }
    }

    @Override // defpackage.InterfaceC9975tB3
    public final void c() {
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            }
            final MB3 mb3 = (MB3) c11814ya2.next();
            RB3 rb3 = mb3.b;
            rb3.N = true;
            if (!AbstractC5177fD3.i(mb3.a)) {
                rb3.g();
            }
            if (rb3.V()) {
                new Handler().postDelayed(new Runnable() { // from class: KB3
                    @Override // java.lang.Runnable
                    public final void run() {
                        RB3 rb32 = MB3.this.b;
                        Tab h = ((AbstractC11276wz3) rb32.l).h();
                        if (h != null) {
                            rb32.m.a(h);
                        }
                        rb32.p = null;
                    }
                }, 300L);
            } else {
                new Handler().postDelayed(new Runnable() { // from class: LB3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MB3.this.b.p = null;
                    }
                }, 300L);
            }
        }
        if (RC.a().e() && CachedFeatureFlags.b(AbstractC6265iP.d.b("StartSurfaceAndroid:warm_up_renderer"), false)) {
            N.Mo5fW0wM(Profile.d());
        }
    }

    @Override // defpackage.InterfaceC9975tB3
    public final void a() {
        PropertyModel propertyModel = this.i;
        if (propertyModel != null) {
            InterfaceC5991hc2 interfaceC5991hc2 = this.t;
            if (interfaceC5991hc2 != null) {
                ((g) interfaceC5991hc2).U(this.v);
            }
            propertyModel.k(AbstractC0829Gj3.e, false);
            PD2 pd2 = AbstractC0829Gj3.f;
            BF0 bf0 = (BF0) propertyModel.i(pd2);
            OJ0 i = i();
            if (i != null) {
                ((g) this.t).U(i);
            }
            if (bf0 != null) {
                bf0.b.b();
            }
            propertyModel.o(pd2, null);
            C0179Bj3 c0179Bj3 = this.A;
            if (c0179Bj3 != null) {
                TabModel tabModel = this.z;
                if (tabModel != null) {
                    tabModel.i(c0179Bj3);
                } else if (this.H) {
                    this.H = false;
                }
            }
            C0049Aj3 c0049Aj3 = this.B;
            if (c0049Aj3 != null) {
                ((AbstractC11276wz3) this.h).s(c0049Aj3);
            }
            C0439Dj3 c0439Dj3 = this.D;
            if (c0439Dj3 != null) {
                ((CC) this.C).g(c0439Dj3);
            }
            A(0, this.y);
            FI2.a("StartSurface.Hidden");
        }
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((MB3) c11814ya2.next()).getClass();
            }
        }
    }

    @Override // defpackage.InterfaceC9975tB3
    public final void b() {
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            }
            final RB3 rb3 = ((MB3) c11814ya2.next()).b;
            if (rb3.V()) {
                InterfaceC7408lj3 interfaceC7408lj3 = rb3.y;
                if (!(((C10154tj3) interfaceC7408lj3).c.x == 1)) {
                    Rect l = ((C10154tj3) interfaceC7408lj3).c.x == 1 ? rb3.S().l(true) : rb3.T().l(true);
                    C1551Ly1 c1551Ly1 = rb3.p[0];
                    rb3.h();
                    V10 j = rb3.j();
                    ArrayList arrayList = new ArrayList(5);
                    MD2 md2 = C1551Ly1.g;
                    float width = l.width();
                    float f = rb3.a;
                    float f2 = rb3.t;
                    HH0 hh0 = AbstractC8142nr1.e;
                    arrayList.add(C4424d20.f(j, c1551Ly1, md2, width / (f * f2), 1.0f, 300L, hh0));
                    arrayList.add(C4424d20.f(j, c1551Ly1, C1551Ly1.h, l.left / f2, 0.0f, 300L, hh0));
                    arrayList.add(C4424d20.f(j, c1551Ly1, C1551Ly1.i, l.top / f2, 0.0f, 300L, hh0));
                    arrayList.add(C4424d20.f(j, c1551Ly1, C1551Ly1.w, AbstractC5177fD3.f() ? Math.min(rb3.a / AbstractC7239lD3.c(rb3.j), c1551Ly1.s()) : rb3.a, c1551Ly1.s(), 300L, hh0));
                    C4424d20 c = C4424d20.c(j, 1.0f, 0.0f, 150L, new InterfaceC4080c20() { // from class: JB3
                        @Override // defpackage.InterfaceC4080c20
                        public final void a(C4424d20 c4424d20) {
                            RB3 rb32 = RB3.this;
                            rb32.getClass();
                            rb32.H = c4424d20.b();
                        }
                    });
                    c.j = AbstractC8142nr1.d;
                    arrayList.add(c);
                    AnimatorSet animatorSet = new AnimatorSet();
                    rb3.v = animatorSet;
                    animatorSet.playTogether(arrayList);
                    rb3.v.addListener(new OB3(rb3));
                    rb3.M = rb3.I;
                    rb3.f11464J = SystemClock.elapsedRealtime();
                    rb3.K = SystemClock.elapsedRealtime();
                    rb3.L = 0L;
                    rb3.v.start();
                }
            }
            RB3.R(rb3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.r == null) {
            InterfaceC8947qB3 e = this.j.a.e();
            this.q = e;
            e.T().m(new Callback() { // from class: vj3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    ViewOnClickListenerC0699Fj3.this.n();
                }
            });
        }
        FI2.a("StartSurface.SinglePane.MoreTabs");
        A(2, this.y);
    }

    @Override // defpackage.InterfaceC9289rB3
    public final void e(int i, long j) {
        if (!this.M) {
            this.M = true;
        } else {
            this.N.e(i, j);
        }
    }

    public final void u(boolean z) {
        ZK0 zk0;
        LD2 ld2 = AbstractC0829Gj3.c;
        PropertyModel propertyModel = this.i;
        if (z == propertyModel.j(ld2)) {
            return;
        }
        PD2 pd2 = AbstractC0829Gj3.f;
        if (z && propertyModel.j(AbstractC0829Gj3.e) && propertyModel.i(pd2) == null) {
            C10154tj3 c10154tj3 = this.E.a;
            if (!(((AbstractActivityC7416ll) c10154tj3.q).m() || ApplicationStatus.c(c10154tj3.a) == 6)) {
                g();
            }
        }
        propertyModel.k(ld2, z);
        BF0 bf0 = (BF0) propertyModel.i(pd2);
        if (bf0 == null || (zk0 = bf0.b.K) == null) {
            return;
        }
        if (z) {
            if (zk0.isEnabled()) {
                return;
            }
            zk0.setEnabled(true);
            return;
        }
        zk0.m();
    }

    public final void y(boolean z, boolean z2) {
        if (z) {
            if (this.r == null) {
                this.q = this.j.a.e();
            }
            PropertyModel propertyModel = this.r;
            if (propertyModel != null) {
                propertyModel.k(AbstractC6910kG3.a, false);
                this.r.k(AbstractC6910kG3.b, this.s);
            }
            InterfaceC8947qB3 interfaceC8947qB3 = this.q;
            if (interfaceC8947qB3 != null && !z2) {
                interfaceC8947qB3.m0(true);
            }
        } else {
            InterfaceC8947qB3 interfaceC8947qB32 = this.q;
            if (interfaceC8947qB32 != null && !z2) {
                interfaceC8947qB32.w(false);
            }
        }
        this.i.k(AbstractC0829Gj3.d, z);
    }

    public final void o() {
        n();
        this.g.m(this.w == 1);
        InterfaceC8947qB3 interfaceC8947qB3 = this.q;
        if (interfaceC8947qB3 != null) {
            interfaceC8947qB3.m(this.w == 1);
        }
        this.G.j(new Callback() { // from class: uj3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = ViewOnClickListenerC0699Fj3.this;
                Iterator it = viewOnClickListenerC0699Fj3.l.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        return;
                    }
                    InterfaceC7064kj3 interfaceC7064kj3 = (InterfaceC7064kj3) c11814ya2.next();
                    int i = viewOnClickListenerC0699Fj3.w;
                    boolean z = true;
                    if (i != 2) {
                        LD2 ld2 = AbstractC0829Gj3.d;
                        PropertyModel propertyModel = viewOnClickListenerC0699Fj3.i;
                        if (!propertyModel.j(ld2)) {
                            if (!(viewOnClickListenerC0699Fj3.w == 1) || !propertyModel.j(AbstractC6910kG3.a)) {
                                z = false;
                            }
                        }
                    }
                    interfaceC7064kj3.b(i, z);
                }
            }
        });
    }

    public final void D(int i) {
        this.i.m(AbstractC0829Gj3.g, i);
    }

    public final void v(boolean z) {
        PropertyModel propertyModel = this.i;
        if (propertyModel == null) {
            return;
        }
        propertyModel.k(AbstractC6910kG3.a, z);
        ThreadUtils.d(new Runnable() { // from class: zj3
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = ViewOnClickListenerC0699Fj3.this;
                InterfaceC5991hc2 interfaceC5991hc2 = viewOnClickListenerC0699Fj3.t;
                if (interfaceC5991hc2 != null) {
                    Vf4 I = ((g) interfaceC5991hc2).I();
                    PropertyModel propertyModel2 = viewOnClickListenerC0699Fj3.i;
                    if (I != null) {
                        propertyModel2.k(AbstractC6910kG3.i, ((g) viewOnClickListenerC0699Fj3.t).I().b());
                    }
                    propertyModel2.k(AbstractC6910kG3.e, ((g) viewOnClickListenerC0699Fj3.t).L(5));
                }
            }
        });
    }

    public final int f() {
        if (!this.k) {
            return 3;
        }
        int i = this.w;
        if (i == 7) {
            int i2 = this.x;
            if (i2 == 0) {
                return 1;
            }
            return i2;
        }
        if (i == 5) {
            return ((AbstractC11276wz3) this.h).o() ? 2 : 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 6) {
            return 1;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:            if (r8 == false) goto L164;     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(boolean r8) {
        /*
            r7 = this;
            r0 = 2
            qB3 r1 = r7.g
            r2 = 0
            r3 = 1
            if (r8 == 0) goto L40
            int r8 = r1.q()
            if (r8 != r0) goto Lf
            r8 = r3
            goto L10
        Lf:
            r8 = r2
        L10:
            if (r8 == 0) goto L3e
            uz3 r8 = r7.h
            wz3 r8 = (defpackage.AbstractC11276wz3) r8
            org.chromium.chrome.browser.tab.Tab r4 = r8.h()
            boolean r8 = r8.i
            if (r8 == 0) goto L2f
            if (r4 == 0) goto L2f
            org.chromium.url.GURL r8 = r4.getUrl()
            if (r8 == 0) goto L2f
            org.chromium.url.GURL r8 = r4.getUrl()
            boolean r8 = defpackage.T34.k(r8)
            goto L3c
        L2f:
            Q83 r8 = defpackage.O83.a
            java.lang.String r4 = "Chrome.AppLaunch.LastKnownActiveTabState"
            int r8 = r8.f(r2, r4)
            if (r8 != r3) goto L3b
            r8 = r3
            goto L3c
        L3b:
            r8 = r2
        L3c:
            if (r8 != 0) goto L40
        L3e:
            r8 = r3
            goto L41
        L40:
            r8 = r2
        L41:
            LD2 r4 = defpackage.AbstractC6910kG3.g
            org.chromium.ui.modelutil.PropertyModel r5 = r7.i
            boolean r6 = r5.j(r4)
            if (r8 != r6) goto L4c
            return
        L4c:
            r5.k(r4, r8)
            LD2 r4 = defpackage.AbstractC6910kG3.h
            if (r8 == 0) goto L60
            int r8 = r1.q()
            if (r8 != r0) goto L5b
            r8 = r3
            goto L5c
        L5b:
            r8 = r2
        L5c:
            r8 = r8 ^ r3
            if (r8 == 0) goto L60
            r2 = r3
        L60:
            r5.k(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnClickListenerC0699Fj3.B(boolean):void");
    }

    public final void n() {
        InterfaceC8947qB3 interfaceC8947qB3 = this.q;
        boolean z = true;
        if (interfaceC8947qB3 == null || !interfaceC8947qB3.k()) {
            InterfaceC8947qB3 interfaceC8947qB32 = this.g;
            if (!interfaceC8947qB32.k()) {
                if (this.w == 2) {
                    if (this.x != 1 || this.s) {
                        InterfaceC8947qB3 interfaceC8947qB33 = this.q;
                        if (interfaceC8947qB33 != null) {
                            z = Boolean.TRUE.equals(((C8385oa2) interfaceC8947qB33.r()).g);
                        }
                    }
                }
                z = Boolean.TRUE.equals(((C8385oa2) interfaceC8947qB32.r()).g);
            }
        }
        this.Q.p(Boolean.valueOf(z));
    }

    public final void g() {
        DF0 df0 = this.p;
        boolean e = AbstractC3899bX.e(this.u);
        boolean z = this.K;
        int i = this.y;
        df0.getClass();
        BF0 bf0 = new BF0(Profile.d(), df0.a, e, z, df0.f, df0.g, i, df0.h, df0.i, df0.j, df0.l, df0.b, df0.c, df0.d, df0.k, df0.e);
        this.i.o(AbstractC0829Gj3.f, bf0);
        OJ0 oj0 = bf0.b.I;
        if (oj0 != null) {
            ((g) this.t).d(oj0);
        }
    }

    public final OJ0 i() {
        BF0 bf0;
        PropertyModel propertyModel = this.i;
        if (propertyModel == null || (bf0 = (BF0) propertyModel.i(AbstractC0829Gj3.f)) == null) {
            return null;
        }
        return bf0.b.I;
    }
}
