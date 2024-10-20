package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.chrome.browser.omnibox.g;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.site_settings.CookieControlsServiceBridge;
import org.chromium.chrome.browser.tasks.tab_management.n;
import org.chromium.chrome.features.start_surface.StartSurfaceConfiguration;
import org.chromium.chrome.features.tasks.TasksView;
import org.chromium.components.prefs.PrefService;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class RB3 extends AbstractC2976Wx1 {
    public final MB3 A;
    public final ViewGroup B;
    public final OX2 C;
    public InterfaceC9632sB3 D;
    public InterfaceC9632sB3 E;
    public final C1551Ly1 F;
    public boolean G;
    public float H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public long f11464J;
    public long K;
    public long L;
    public int M;
    public boolean N;
    public AnimatorSet O;
    public AnimatorSet v;
    public boolean w;
    public C2073Py3 x;
    public final InterfaceC7408lj3 y;
    public final InterfaceC6092ht1 z;

    @Override // defpackage.AbstractC2976Wx1
    public final AbstractC5518gD0 k() {
        return null;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final int m() {
        return 2;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean q() {
        return true;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean r() {
        return true;
    }

    public RB3(Context context, InterfaceC2201Qy1 interfaceC2201Qy1, CompositorViewHolder compositorViewHolder, InterfaceC7408lj3 interfaceC7408lj3, InterfaceC6092ht1 interfaceC6092ht1, ViewGroup viewGroup, OX2 ox2) {
        super(context, interfaceC2201Qy1, compositorViewHolder);
        C1551Ly1 c = c(-1, false);
        this.F = c;
        c.k(C1551Ly1.C, true);
        this.y = interfaceC7408lj3;
        InterfaceC6720jj3 interfaceC6720jj3 = new InterfaceC6720jj3() { // from class: AB3
            @Override // defpackage.InterfaceC9289rB3
            public final void e(int i, long j) {
                RB3.this.J(i, true);
            }
        };
        C10154tj3 c10154tj3 = (C10154tj3) interfaceC7408lj3;
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = c10154tj3.c;
        viewOnClickListenerC0699Fj3.N = interfaceC6720jj3;
        C4505dG3 c4505dG3 = c10154tj3.y;
        if (c4505dG3 != null) {
            InterfaceC10318uB3 interfaceC10318uB3 = c4505dG3.a;
            if (interfaceC10318uB3 != null) {
                interfaceC10318uB3.n(viewOnClickListenerC0699Fj3);
            }
        } else {
            c10154tj3.A.k.y = viewOnClickListenerC0699Fj3;
        }
        if (c10154tj3.d) {
            C4505dG3 c4505dG32 = c10154tj3.z;
            if (c4505dG32 != null) {
                InterfaceC10318uB3 interfaceC10318uB32 = c4505dG32.a;
                if (interfaceC10318uB32 != null) {
                    interfaceC10318uB32.n(viewOnClickListenerC0699Fj3);
                }
            } else {
                c10154tj3.D = viewOnClickListenerC0699Fj3;
            }
        }
        this.z = interfaceC6092ht1;
        this.B = viewGroup;
        this.C = ox2;
        MB3 mb3 = new MB3(this, context);
        this.A = mb3;
        c10154tj3.c.a.a(mb3);
    }

    public static void R(RB3 rb3) {
        if (AbstractC5241fQ2.d(rb3.j)) {
            ((C10154tj3) rb3.y).f();
        } else {
            rb3.T().o();
        }
        rb3.w = false;
        rb3.f();
    }

    public final boolean V() {
        if (AbstractC5177fD3.i(this.j)) {
            return false;
        }
        return AbstractC5177fD3.g();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void u() {
        boolean z;
        if (this.G) {
            return;
        }
        this.G = true;
        C10154tj3 c10154tj3 = (C10154tj3) this.y;
        if (!c10154tj3.E) {
            c10154tj3.E = true;
            boolean z2 = c10154tj3.d;
            if (z2) {
                z = z2;
                c10154tj3.B = new DF0(c10154tj3.a, (ViewGroup) c10154tj3.y.b.findViewById(R.id.tasks_surface_body), c10154tj3.C, c10154tj3.e, c10154tj3.f, new C9811sj3(c10154tj3), c10154tj3.l, c10154tj3.m, c10154tj3.g, c10154tj3.j, c10154tj3.v, c10154tj3.f11544J, c10154tj3.L, c10154tj3.x);
            } else {
                z = z2;
            }
            InterfaceC0079Ap3 interfaceC0079Ap3 = c10154tj3.n;
            InterfaceC5991hc2 interfaceC5991hc2 = z ? (InterfaceC5991hc2) interfaceC0079Ap3.get() : null;
            DF0 df0 = c10154tj3.B;
            PrefService a = R44.a(Profile.d());
            ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = c10154tj3.c;
            viewOnClickListenerC0699Fj3.t = interfaceC5991hc2;
            viewOnClickListenerC0699Fj3.p = df0;
            viewOnClickListenerC0699Fj3.P = c10154tj3.l;
            PropertyModel propertyModel = viewOnClickListenerC0699Fj3.i;
            if (propertyModel != null) {
                propertyModel.k(AbstractC6910kG3.i, ((g) interfaceC5991hc2).I().b());
                boolean L = ((g) viewOnClickListenerC0699Fj3.t).L(5);
                AbstractC1427Kz1.c(5, L);
                propertyModel.k(AbstractC6910kG3.e, L);
                if (viewOnClickListenerC0699Fj3.g.u0()) {
                    ((g) viewOnClickListenerC0699Fj3.t).d(viewOnClickListenerC0699Fj3.v);
                    if (viewOnClickListenerC0699Fj3.w == 1) {
                        if (viewOnClickListenerC0699Fj3.p != null) {
                            viewOnClickListenerC0699Fj3.u(!viewOnClickListenerC0699Fj3.s);
                        }
                        Runnable runnable = viewOnClickListenerC0699Fj3.o;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
            }
            viewOnClickListenerC0699Fj3.I = Boolean.valueOf(a.a("ntp_snippets.list_visible"));
            n nVar = c10154tj3.A;
            if (nVar != null) {
                nVar.a();
            }
            C4505dG3 c4505dG3 = c10154tj3.y;
            if (c4505dG3 != null) {
                c4505dG3.b((InterfaceC5991hc2) interfaceC0079Ap3.get(), viewOnClickListenerC0699Fj3.i());
            }
            if (c10154tj3.F) {
                if (!c10154tj3.E) {
                    c10154tj3.F = true;
                } else {
                    c10154tj3.F = false;
                    C4505dG3 c4505dG32 = c10154tj3.y;
                    if (c4505dG32 != null) {
                        ViewOnClickListenerC6375ij1 viewOnClickListenerC6375ij1 = c4505dG32.c.g;
                        if (!viewOnClickListenerC6375ij1.h) {
                            viewOnClickListenerC6375ij1.a = new CookieControlsServiceBridge(viewOnClickListenerC6375ij1);
                            viewOnClickListenerC6375ij1.h = true;
                        }
                    }
                }
            }
            if (c10154tj3.G) {
                c10154tj3.G = false;
                c10154tj3.z.b((InterfaceC5991hc2) interfaceC0079Ap3.get(), null);
                ViewOnClickListenerC6375ij1 viewOnClickListenerC6375ij12 = c10154tj3.z.c.g;
                if (!viewOnClickListenerC6375ij12.h) {
                    viewOnClickListenerC6375ij12.a = new CookieControlsServiceBridge(viewOnClickListenerC6375ij12);
                    viewOnClickListenerC6375ij12.h = true;
                }
            }
        }
        if (this.x == null) {
            this.x = new C2073Py3();
        }
        this.x.h = this.l;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void H(InterfaceC10590uz3 interfaceC10590uz3, TabContentManager tabContentManager) {
        super.H(interfaceC10590uz3, tabContentManager);
        C2073Py3 c2073Py3 = this.x;
        if (c2073Py3 != null) {
            c2073Py3.h = interfaceC10590uz3;
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final C1551Ly1 l(int i) {
        return this.F;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void d() {
        InterfaceC7408lj3 interfaceC7408lj3 = this.y;
        if (interfaceC7408lj3 != null) {
            ((C10154tj3) interfaceC7408lj3).c.a.d(this.A);
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void I(long j, boolean z) {
        if (U()) {
            TraceEvent i = TraceEvent.i("StartSurfaceLayout.Show.StartSurface", null);
            try {
                W(j, z, true);
                if (i != null) {
                    i.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (i != null) {
                    try {
                        i.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
        TraceEvent i2 = TraceEvent.i("StartSurfaceLayout.Show.TabSwitcher", null);
        try {
            W(j, z, false);
            if (i2 != null) {
                i2.close();
            }
        } catch (Throwable th2) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable unused2) {
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [BB3] */
    public final void W(long j, boolean z, boolean z2) {
        super.I(j, z);
        if (!StartSurfaceConfiguration.a()) {
            this.z.a(5);
        }
        C10154tj3 c10154tj3 = (C10154tj3) this.y;
        if (c10154tj3.E) {
            c10154tj3.F = false;
            C4505dG3 c4505dG3 = c10154tj3.y;
            if (c4505dG3 != null) {
                ViewOnClickListenerC6375ij1 viewOnClickListenerC6375ij1 = c4505dG3.c.g;
                if (!viewOnClickListenerC6375ij1.h) {
                    viewOnClickListenerC6375ij1.a = new CookieControlsServiceBridge(viewOnClickListenerC6375ij1);
                    viewOnClickListenerC6375ij1.h = true;
                }
            }
        } else {
            c10154tj3.F = true;
        }
        C1551Ly1 c = c(((AbstractC11276wz3) this.l).i(), ((AbstractC11276wz3) this.l).o());
        c.u();
        this.p = new C1551Ly1[]{c};
        boolean r = z2 ? S().r() : T().r();
        boolean z3 = (!z || (((AbstractC11276wz3) this.l).g().getCount() == 0) || z2) ? false : true;
        if (AbstractC5177fD3.i(this.j)) {
            h();
            OX2 ox2 = this.C;
            if (ox2 != null) {
                HashMap e = PropertyModel.e(UX2.l);
                JD2 jd2 = UX2.c;
                GD2 gd2 = new GD2();
                gd2.a = this.B;
                e.put(jd2, gd2);
                HD2 hd2 = UX2.d;
                AD2 ad2 = new AD2();
                ad2.a = false;
                e.put(hd2, ad2);
                ox2.b(new PropertyModel(e));
            }
            if (z3) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c10154tj3.c.O, (Property<ViewGroup, Float>) View.TRANSLATION_Y, r1.getHeight(), 0.0f);
                ofFloat.setInterpolator(AbstractC8142nr1.c);
                ofFloat.setDuration(450L);
                AnimatorSet animatorSet = new AnimatorSet();
                this.v = animatorSet;
                animatorSet.play(ofFloat);
                this.v.addListener(new PB3(this));
                this.v.start();
                return;
            }
            c10154tj3.c.O.setVisibility(0);
            c10154tj3.h(false);
            ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = c10154tj3.c;
            ViewGroup viewGroup = viewOnClickListenerC0699Fj3.O;
            ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = viewOnClickListenerC0699Fj3.P;
            if (viewOnClickListenerC1069If3 != null) {
                viewOnClickListenerC1069If3.l = viewGroup;
                C1978Pf3 c1978Pf3 = viewOnClickListenerC1069If3.g;
                if (c1978Pf3 != null) {
                    c1978Pf3.e(viewGroup);
                }
            }
            viewOnClickListenerC0699Fj3.O.setY(0.0f);
            g();
            return;
        }
        final ?? r7 = new InterfaceC0079Ap3() { // from class: BB3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return RB3.this.T().l(false);
            }
        };
        boolean z4 = z3 && V() && !(((AbstractC11276wz3) this.l).g().getCount() == 0) && !z2;
        if (CachedFeatureFlags.b(AbstractC6265iP.d.b("TabToGTSAnimation:skip-slow-zooming"), true)) {
            z4 &= r;
        }
        if (AbstractC5177fD3.c()) {
            z4 &= !C10021tL.f().c();
        }
        if (!z4 || r7.get() == null) {
            c10154tj3.h(z3);
            return;
        }
        h();
        C1551Ly1 c1551Ly1 = this.p[0];
        V10 j2 = j();
        ArrayList arrayList = new ArrayList(5);
        InterfaceC0079Ap3 interfaceC0079Ap3 = new InterfaceC0079Ap3() { // from class: CB3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Float.valueOf(1.0f);
            }
        };
        InterfaceC0079Ap3 interfaceC0079Ap32 = new InterfaceC0079Ap3() { // from class: DB3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                RB3 rb3 = RB3.this;
                rb3.getClass();
                return Float.valueOf(((Rect) r7.get()).width() / (rb3.a * rb3.t));
            }
        };
        InterfaceC0079Ap3 interfaceC0079Ap33 = new InterfaceC0079Ap3() { // from class: EB3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Float.valueOf(0.0f);
            }
        };
        InterfaceC0079Ap3 interfaceC0079Ap34 = new InterfaceC0079Ap3() { // from class: FB3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                RB3 rb3 = RB3.this;
                rb3.getClass();
                return Float.valueOf(((Rect) r7.get()).left / rb3.t);
            }
        };
        InterfaceC0079Ap3 interfaceC0079Ap35 = new InterfaceC0079Ap3() { // from class: GB3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return Float.valueOf(0.0f);
            }
        };
        InterfaceC0079Ap3 interfaceC0079Ap36 = new InterfaceC0079Ap3() { // from class: HB3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                RB3 rb3 = RB3.this;
                rb3.getClass();
                return Float.valueOf(((Rect) r7.get()).top / rb3.t);
            }
        };
        MD2 md2 = C1551Ly1.g;
        HH0 hh0 = AbstractC8142nr1.e;
        arrayList.add(C4424d20.g(j2, c1551Ly1, md2, interfaceC0079Ap3, interfaceC0079Ap32, 300L, hh0));
        arrayList.add(C4424d20.g(j2, c1551Ly1, C1551Ly1.h, interfaceC0079Ap33, interfaceC0079Ap34, 300L, hh0));
        arrayList.add(C4424d20.g(j2, c1551Ly1, C1551Ly1.i, interfaceC0079Ap35, interfaceC0079Ap36, 300L, hh0));
        arrayList.add(C4424d20.f(j2, c1551Ly1, C1551Ly1.w, c1551Ly1.s(), AbstractC5177fD3.f() ? Math.min(this.a / AbstractC7239lD3.c(this.j), c1551Ly1.s()) : this.a, 300L, hh0));
        C4424d20 c2 = C4424d20.c(j2, 0.0f, 1.0f, 150L, new InterfaceC4080c20() { // from class: IB3
            @Override // defpackage.InterfaceC4080c20
            public final void a(C4424d20 c4424d20) {
                RB3 rb3 = RB3.this;
                rb3.getClass();
                rb3.H = c4424d20.b();
            }
        });
        c2.j = AbstractC8142nr1.d;
        arrayList.add(c2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.v = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.v.addListener(new NB3(this));
        this.M = this.I;
        this.f11464J = SystemClock.elapsedRealtime();
        this.K = SystemClock.elapsedRealtime();
        this.L = 0L;
        this.v.start();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void J(int i, boolean z) {
        int i2 = ((C10154tj3) this.y).c.w;
        AbstractC1868Oj3.a.i = false;
        if (i2 == 1) {
            TraceEvent i3 = TraceEvent.i("StartSurfaceLayout.Hide.StartSurface", null);
            try {
                X(i, z);
                if (i3 != null) {
                    i3.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (i3 != null) {
                    try {
                        i3.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
        TraceEvent i4 = TraceEvent.i("StartSurfaceLayout.Hide.TabSwitcher", null);
        try {
            X(i, z);
            if (i4 != null) {
                i4.close();
            }
        } catch (Throwable th2) {
            if (i4 != null) {
                try {
                    i4.close();
                } catch (Throwable unused2) {
                }
            }
            throw th2;
        }
    }

    public final void X(int i, boolean z) {
        super.J(i, z);
        if (i == -1) {
            i = ((AbstractC11276wz3) this.l).i();
        }
        C1551Ly1 c = c(i, ((AbstractC11276wz3) this.l).o());
        c.u();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c);
        if (i != ((AbstractC11276wz3) this.l).i()) {
            C1551Ly1 c2 = c(((AbstractC11276wz3) this.l).i(), ((AbstractC11276wz3) this.l).o());
            c2.l(C1551Ly1.g, 0.0f);
            c2.u();
            arrayList.add(c2);
        }
        this.p = (C1551Ly1[]) arrayList.toArray(new C1551Ly1[0]);
        L(new LinkedList(Arrays.asList(Integer.valueOf(i))));
        this.w = true;
        boolean i2 = AbstractC5177fD3.i(this.j);
        InterfaceC7408lj3 interfaceC7408lj3 = this.y;
        if (!i2) {
            ((C10154tj3) interfaceC7408lj3).c.g.w(!V());
            return;
        }
        h();
        OX2 ox2 = this.C;
        if (ox2 != null) {
            if (ox2.b.f != null) {
                ox2.a(true);
            }
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(((C10154tj3) interfaceC7408lj3).c.O, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f, r5.getHeight());
        ofFloat.setInterpolator(AbstractC8142nr1.b);
        ofFloat.setDuration(450L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.v = animatorSet;
        animatorSet.play(ofFloat);
        this.v.addListener(new QB3(this));
        this.v.start();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean t() {
        boolean t = ((C10154tj3) this.y).c.t();
        if (t) {
            C9861ss.c(4);
        }
        return t;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final SceneLayer n() {
        return this.x;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void M() {
        if (this.x == null) {
            this.x = new C2073Py3();
        }
        C1551Ly1[] c1551Ly1Arr = this.p;
        if (c1551Ly1Arr != null && P(c1551Ly1Arr[0])) {
            F();
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void N(RectF rectF, TabContentManager tabContentManager, ResourceManager resourceManager, CC cc) {
        InterfaceC9632sB3 S;
        if (this.x == null) {
            this.x = new C2073Py3();
        }
        if (((C10154tj3) this.y).c.w == 0) {
            S = this.D;
            if (S == null) {
                S = this.E;
            }
        } else {
            S = U() ? S() : T();
        }
        this.x.b(this.j, rectF, this, tabContentManager, resourceManager, cc, V() ? S.d() : 0, this.H, S.p());
        this.I++;
        if (this.K != 0) {
            this.L = Math.max(this.L, SystemClock.elapsedRealtime() - this.K);
        }
        this.K = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void h() {
        AnimatorSet animatorSet = this.v;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.v.end();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void y(int i, int i2, boolean z, boolean z2, float f, float f2) {
        float f3;
        float f4;
        if (!z2 || z) {
            return;
        }
        C10154tj3 c10154tj3 = (C10154tj3) this.y;
        if (c10154tj3.c.w != 1) {
            return;
        }
        C4505dG3 c4505dG3 = c10154tj3.y;
        AnimatorSet animatorSet = this.O;
        if (animatorSet != null && animatorSet.isStarted()) {
            this.O.end();
        }
        TasksView tasksView = c4505dG3.b;
        boolean z3 = this.k == 1;
        Context context = this.j;
        float min = (Math.min(this.a, this.g) * 0.100000024f) / 2.0f;
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(AbstractC2429Ss.a(tasksView, View.SCALE_X, 1.0f, 0.9f, 300L));
        arrayList.add(AbstractC2429Ss.a(tasksView, View.SCALE_Y, 1.0f, 0.9f, 300L));
        arrayList.add(AbstractC2429Ss.a(tasksView, View.X, 0.0f, min, 300L));
        arrayList.add(AbstractC2429Ss.a(tasksView, View.Y, 0.0f, min, 300L));
        arrayList.add(AbstractC2429Ss.a(tasksView, View.Z, 0.0f, 12.0f, 300L));
        AnimatorSet animatorSet2 = new AnimatorSet();
        HH0 hh0 = AbstractC8142nr1.e;
        animatorSet2.setInterpolator(hh0);
        animatorSet2.playTogether(arrayList);
        if (!z3) {
            f3 = this.a * 0.5f;
            f4 = min;
        } else {
            f4 = this.g * 0.5f;
            f3 = min;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(tasksView.getWidth(), tasksView.getHeight());
        gradientDrawable.setColor(AbstractC11746yN.b(context, false));
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setImageDrawable(gradientDrawable);
        tasksView.addView(appCompatImageView);
        ArrayList arrayList2 = new ArrayList(5);
        arrayList2.add(AbstractC2429Ss.a(appCompatImageView, View.ALPHA, 0.0f, 1.0f, 150L));
        arrayList2.add(AbstractC2429Ss.a(appCompatImageView, View.SCALE_X, 0.0f, 0.9f, 300L));
        arrayList2.add(AbstractC2429Ss.a(appCompatImageView, View.SCALE_Y, 0.0f, 0.9f, 300L));
        arrayList2.add(AbstractC2429Ss.a(appCompatImageView, View.X, f, f3, 300L));
        arrayList2.add(AbstractC2429Ss.a(appCompatImageView, View.Y, f2, f4, 300L));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setInterpolator(AbstractC8142nr1.g);
        animatorSet3.playTogether(arrayList2);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(animatorSet3, animatorSet2);
        ArrayList arrayList3 = new ArrayList(7);
        arrayList3.add(AbstractC2429Ss.b(tasksView, View.SCALE_X, 0.9f, 1.0f, 300L, hh0));
        arrayList3.add(AbstractC2429Ss.b(tasksView, View.SCALE_Y, 0.9f, 1.0f, 300L, hh0));
        arrayList3.add(AbstractC2429Ss.b(tasksView, View.X, min, 0.0f, 300L, hh0));
        arrayList3.add(AbstractC2429Ss.b(tasksView, View.Y, min, 0.0f, 300L, hh0));
        arrayList3.add(AbstractC2429Ss.b(tasksView, View.Z, 12.0f, 0.0f, 300L, hh0));
        arrayList3.add(AbstractC2429Ss.a(appCompatImageView, View.ALPHA, 1.0f, 0.0f, 300L));
        if (z3) {
            arrayList3.add(AbstractC2429Ss.b(appCompatImageView, View.Y, f4, -tasksView.getHeight(), 300L, AbstractC8142nr1.d));
        } else {
            arrayList3.add(AbstractC2429Ss.b(appCompatImageView, View.X, f3, tasksView.getWidth(), 300L, AbstractC8142nr1.d));
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.setStartDelay(150L);
        animatorSet5.playTogether(arrayList3);
        AnimatorSet animatorSet6 = new AnimatorSet();
        animatorSet6.playSequentially(animatorSet4, animatorSet5);
        animatorSet6.addListener(new C2299Rs(tasksView, appCompatImageView));
        this.O = animatorSet6;
        animatorSet6.start();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void f() {
        TraceEvent i = TraceEvent.i("StartSurfaceLayout.DoneHiding", null);
        try {
            super.f();
            FI2.a("MobileExitStackView");
            if (!StartSurfaceConfiguration.a()) {
                this.z.b(5);
            }
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void g() {
        TraceEvent i = TraceEvent.i("StartSurfaceLayout.DoneShowing", null);
        try {
            if (!this.N) {
                if (i != null) {
                    i.close();
                }
            } else {
                super.g();
                if (i != null) {
                    i.close();
                }
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public final InterfaceC9632sB3 S() {
        InterfaceC10318uB3 interfaceC10318uB3;
        if (this.E == null) {
            C10154tj3 c10154tj3 = (C10154tj3) this.y;
            InterfaceC9632sB3 interfaceC9632sB3 = null;
            if (c10154tj3.d && (interfaceC10318uB3 = c10154tj3.y.a) != null) {
                interfaceC9632sB3 = interfaceC10318uB3.q();
            }
            this.E = interfaceC9632sB3;
        }
        return this.E;
    }

    public final InterfaceC9632sB3 T() {
        if (this.D == null) {
            this.D = ((C10154tj3) this.y).c();
        }
        return this.D;
    }

    public final boolean U() {
        int i;
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = ((C10154tj3) this.y).c;
        int i2 = viewOnClickListenerC0699Fj3.w;
        if (i2 == 1 || i2 == 6 || i2 == 5) {
            return true;
        }
        return i2 == 7 && ((i = viewOnClickListenerC0699Fj3.x) == 1 || i == 0);
    }

    public static void Q(RB3 rb3, boolean z) {
        long b;
        int i = rb3.I - rb3.M;
        long elapsedRealtime = SystemClock.elapsedRealtime() - rb3.f11464J;
        if (((C10154tj3) rb3.y).c.x == 1) {
            b = rb3.S().b();
        } else {
            b = rb3.T().b();
        }
        int i2 = (int) (b - rb3.f11464J);
        float f = (i * 1000.0f) / ((float) elapsedRealtime);
        String.format(Locale.US, "fps = %.2f (%d / %dms), maxFrameInterval = %d, dirtySpan = %d", Float.valueOf(f), Integer.valueOf(i), Long.valueOf(elapsedRealtime), Long.valueOf(rb3.L), Integer.valueOf(i2));
        String str = z ? ".Shrink" : ".Expand";
        EI2.d((int) f, "GridTabSwitcher.FramePerSecond".concat(str));
        EI2.n(rb3.L, "GridTabSwitcher.MaxFrameInterval".concat(str));
        EI2.n(i2, "GridTabSwitcher.DirtySpan".concat(str));
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean E() {
        return this.v == null && !this.w;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean b() {
        return (AbstractC5177fD3.c() && C10021tL.f().c() && !DeviceFormFactor.a(this.j)) ? false : true;
    }
}
