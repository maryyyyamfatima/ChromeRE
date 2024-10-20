package defpackage;

import J.N;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ListView;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.autofill_assistant.AutofillAssistantPreferenceFragment;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbar;
import org.chromium.chrome.browser.download.DownloadUtils;
import org.chromium.chrome.browser.homepage.settings.HomepageSettings;
import org.chromium.chrome.browser.ntp.NewTabPageLayout;
import org.chromium.chrome.browser.omnibox.UrlBarApi26;
import org.chromium.chrome.browser.omnibox.g;
import org.chromium.chrome.browser.partnercustomizations.PartnerBrowserCustomizations;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileManager;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.toolbar.HomeButton;
import org.chromium.chrome.browser.toolbar.IncognitoToggleTabLayout;
import org.chromium.chrome.browser.toolbar.LocationBarModel;
import org.chromium.chrome.browser.toolbar.NewTabButton;
import org.chromium.chrome.browser.toolbar.TabSwitcherButtonView;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButton;
import org.chromium.chrome.browser.toolbar.top.TabSwitcherModeTopToolbar;
import org.chromium.chrome.browser.toolbar.top.ToggleTabStackButton;
import org.chromium.chrome.browser.toolbar.top.ToolbarControlContainer;
import org.chromium.chrome.browser.toolbar.top.ToolbarPhone;
import org.chromium.chrome.browser.toolbar.top.ToolbarTablet;
import org.chromium.chrome.browser.toolbar.top.c;
import org.chromium.chrome.browser.toolbar.top.d;
import org.chromium.chrome.browser.toolbar.top.e;
import org.chromium.chrome.browser.vr.VrModuleProvider;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;
import org.chromium.components.page_info.PageInfoController;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sQ3 */
/* loaded from: classes2.dex */
public final class C9707sQ3 implements InterfaceC10272u34, PJ3, QJ3, MS1, G1 {
    public InterfaceC7697ma2 A;
    public final OX2 A0;
    public final C10731vP3 B;
    public InterfaceC7408lj3 B0;
    public C4555dQ3 C;
    public OP3 C0;
    public SF1 D;
    public PP3 D0;
    public C3511aO0 E;
    public final InterfaceC0408Dd2 E0;
    public C9897sy1 F;
    public final InterfaceC0408Dd2 F0;
    public final C7304lQ3 G;
    public final ZP3 G0;
    public final XP3 H;
    public final C8385oa2 H0;
    public int I;
    public C1933Ow3 I0;

    /* renamed from: J */
    public final boolean f11542J;
    public final C4898eQ3 J0;
    public InterfaceC1422Ky1 K;
    public final C8385oa2 K0;
    public final YP3 L;
    public boolean L0;
    public InterfaceC0408Dd2 M;
    public C4496dF N;
    public final C8565p5 O;
    public final Callback P;
    public final Handler Q;
    public final a R;
    public final WindowAndroid S;
    public final InterfaceC0560Ei T;
    public final CompositorViewHolder U;
    public final FC V;
    public final ZU0 W;
    public ComponentCallbacksC5586gQ3 X;
    public final GE1 Y;
    public final C6621jR3 Z;
    public final C10501uk1 a;
    public LS1 a0;
    public LS1 b0;
    public LP3 c0;
    public final C2913Wk3 d0;
    public final InterfaceC7697ma2 e0;
    public final I5 f0;
    public final C10226tv3 g;
    public final QB g0;
    public final QS3 h;
    public final InterfaceC0079Ap3 h0;
    public C6373ij i;
    public final TabContentManager i0;
    public final C8226o53 j;
    public final InterfaceC10912vv3 j0;
    public final e k;
    public final ViewOnClickListenerC1069If3 k0;
    public final ToolbarControlContainer l;
    public final InterfaceC0408Dd2 l0;
    public final C7992nQ3 m;
    public C10305u91 m0;
    public final C8336oQ3 n;
    public C5232fO3 n0;
    public final C8385oa2 o;
    public final C3799bD o0;
    public final C8385oa2 p;
    public int p0;
    public final C8385oa2 q;
    public int q0;
    public final C8385oa2 r;
    public boolean r0;
    public final InterfaceC7697ma2 s;
    public boolean s0;
    public C8385oa2 t;
    public SP3 t0;
    public InterfaceC10590uz3 u;
    public HS1 u0;
    public final C6960kQ3 v;
    public HS1 v0;
    public InterfaceC7697ma2 w;
    public boolean w0;
    public C6616jQ3 x;
    public int x0;
    public final C6166i6 y;
    public int y0;
    public final LocationBarModel z;
    public InterfaceC0079Ap3 z0;

    @Override // defpackage.InterfaceC10272u34
    public final /* synthetic */ void L(boolean z) {
    }

    /* JADX WARN: Type inference failed for: r11v11, types: [FP3] */
    /* JADX WARN: Type inference failed for: r11v12, types: [GP3] */
    /* JADX WARN: Type inference failed for: r11v13, types: [HP3] */
    /* JADX WARN: Type inference failed for: r11v14, types: [JP3] */
    /* JADX WARN: Type inference failed for: r12v2, types: [DP3] */
    /* JADX WARN: Type inference failed for: r13v16, types: [KP3] */
    /* JADX WARN: Type inference failed for: r29v0, types: [TP3] */
    /* JADX WARN: Type inference failed for: r2v46, types: [tP3] */
    /* JADX WARN: Type inference failed for: r31v0, types: [UP3] */
    public C9707sQ3(a aVar, CC cc, ZU0 zu0, ToolbarControlContainer toolbarControlContainer, final CompositorViewHolder compositorViewHolder, IQ2 iq2, QS3 qs3, C1948Oz3 c1948Oz3, InterfaceC7697ma2 interfaceC7697ma2, final C0942Hg1 c0942Hg1, List list, C6166i6 c6166i6, OX2 ox2, KO3 ko3, C3511aO0 c3511aO0, InterfaceC7697ma2 interfaceC7697ma22, InterfaceC7697ma2 interfaceC7697ma23, InterfaceC0408Dd2 interfaceC0408Dd2, C0538Ed2 c0538Ed2, boolean z, InterfaceC7697ma2 interfaceC7697ma24, InterfaceC0408Dd2 interfaceC0408Dd22, C8385oa2 c8385oa2, InterfaceC0408Dd2 interfaceC0408Dd23, C0538Ed2 c0538Ed22, C10285u6 c10285u6, InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC7697ma2 interfaceC7697ma25, C2913Wk3 c2913Wk3, InterfaceC0560Ei interfaceC0560Ei, I5 i5, final InterfaceC0079Ap3 interfaceC0079Ap32, m mVar, InterfaceC0079Ap3 interfaceC0079Ap33, TabContentManager tabContentManager, InterfaceC10912vv3 interfaceC10912vv3, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, InterfaceC6092ht1 interfaceC6092ht1, C8385oa2 c8385oa22, InterfaceC0408Dd2 interfaceC0408Dd24, C4959ec2 c4959ec2, InterfaceC0079Ap3 interfaceC0079Ap34, boolean z2, C9861ss c9861ss) {
        C8385oa2 c8385oa23 = new C8385oa2();
        this.o = c8385oa23;
        C8385oa2 c8385oa24 = new C8385oa2();
        this.p = c8385oa24;
        this.q = new C8385oa2();
        C8385oa2 c8385oa25 = new C8385oa2();
        this.r = c8385oa25;
        this.t = new C8385oa2();
        this.I = 0;
        this.N = new C4496dF();
        Handler handler = new Handler();
        this.Q = handler;
        this.p0 = -1;
        this.q0 = -1;
        this.w0 = true;
        this.H0 = new C8385oa2();
        C8385oa2 c8385oa26 = new C8385oa2();
        this.K0 = c8385oa26;
        TraceEvent.b("ToolbarManager.ToolbarManager", null);
        this.R = aVar;
        this.S = c10285u6;
        this.U = compositorViewHolder;
        this.V = cc;
        this.W = zu0;
        C11840ye4 c11840ye4 = new C11840ye4(aVar.l0(), toolbarControlContainer, aVar.findViewById(R.id.action_bar_black_background));
        this.A0 = ox2;
        this.w = interfaceC7697ma24;
        this.s = c8385oa2;
        this.E0 = interfaceC0408Dd23;
        this.F0 = c0538Ed22;
        this.T = interfaceC0560Ei;
        this.d0 = c2913Wk3;
        this.P = iq2;
        this.e0 = interfaceC7697ma2;
        this.f0 = i5;
        this.g0 = mVar;
        this.h0 = interfaceC0079Ap33;
        this.i0 = tabContentManager;
        this.j0 = interfaceC10912vv3;
        this.k0 = viewOnClickListenerC1069If3;
        this.l0 = interfaceC0408Dd24;
        c8385oa26.p(Boolean.valueOf(!VrModuleProvider.b().a()));
        C4898eQ3 c4898eQ3 = new C4898eQ3(this);
        this.J0 = c4898eQ3;
        VrModuleProvider.f(c4898eQ3);
        d dVar = (d) aVar.findViewById(R.id.toolbar);
        LocationBarModel locationBarModel = new LocationBarModel(aVar, dVar instanceof ToolbarPhone ? new C3524aQ3(this) : dVar instanceof ToolbarTablet ? new C3868bQ3(this) : InterfaceC11299x32.a, new KH(), new KH(), new C5242fQ3(), QZ2.a());
        this.z = locationBarModel;
        this.l = toolbarControlContainer;
        this.A = interfaceC7697ma23;
        C10731vP3 c10731vP3 = new Callback() { // from class: vP3
            public /* synthetic */ C10731vP3() {
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                BookmarkBridge bookmarkBridge = (BookmarkBridge) obj;
                C9707sQ3 c9707sQ3 = C9707sQ3.this;
                if (bookmarkBridge == null) {
                    c9707sQ3.getClass();
                } else {
                    bookmarkBridge.b(c9707sQ3.G);
                }
            }
        };
        this.B = c10731vP3;
        ((C8385oa2) interfaceC7697ma23).m(c10731vP3);
        this.M = interfaceC0408Dd2;
        interfaceC0408Dd2.j(this.N.b(new Callback() { // from class: wP3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                InterfaceC1422Ky1 interfaceC1422Ky1 = (InterfaceC1422Ky1) obj;
                final C9707sQ3 c9707sQ3 = C9707sQ3.this;
                c9707sQ3.K = interfaceC1422Ky1;
                ((C9897sy1) interfaceC1422Ky1).e(c9707sQ3.L);
                if (((C9897sy1) c9707sQ3.K).G(2)) {
                    c9707sQ3.l.post(c9707sQ3.N.c(new Runnable() { // from class: EP3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9707sQ3.this.n(2, true);
                        }
                    }));
                }
                C6373ij c6373ij = c9707sQ3.i;
                InterfaceC1422Ky1 interfaceC1422Ky12 = c9707sQ3.K;
                c6373ij.n = interfaceC1422Ky12;
                ((C9897sy1) interfaceC1422Ky12).e(c6373ij.o);
                InterfaceC1422Ky1 interfaceC1422Ky13 = c9707sQ3.K;
                c9707sQ3.z.m = interfaceC1422Ky13;
                Object obj2 = c9707sQ3.t.g;
                if (obj2 != null) {
                    LB lb = ((JB) obj2).a;
                    lb.p = interfaceC1422Ky13;
                    ((C9897sy1) interfaceC1422Ky13).e(lb);
                }
            }
        }));
        ComponentCallbacksC5586gQ3 componentCallbacksC5586gQ3 = new ComponentCallbacksC5586gQ3(this);
        this.X = componentCallbacksC5586gQ3;
        aVar.registerComponentCallbacks(componentCallbacksC5586gQ3);
        C10501uk1 c10501uk1 = new C10501uk1();
        this.a = c10501uk1;
        C10226tv3 c10226tv3 = new C10226tv3();
        this.g = c10226tv3;
        this.h = qs3;
        qs3.i.a(this);
        C6373ij c6373ij = new C6373ij(aVar);
        this.i = c6373ij;
        c6373ij.j.a(this);
        C8226o53 c8226o53 = new C8226o53(aVar);
        this.j = c8226o53;
        this.y = c6166i6;
        boolean d = AbstractC5241fQ2.d(aVar);
        this.f11542J = d;
        C6621jR3 c6621jR3 = new C6621jR3(new InterfaceC0079Ap3() { // from class: yP3
            public /* synthetic */ C11760yP3() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return LocationBarModel.this.a();
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        }, new InterfaceC0079Ap3() { // from class: zP3
            public /* synthetic */ C12103zP3() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                InterfaceC0079Ap3 interfaceC0079Ap35 = C9707sQ3.this.z0;
                return Boolean.valueOf(interfaceC0079Ap35 != null && ((Boolean) interfaceC0079Ap35.get()).booleanValue());
            }
        }, new InterfaceC0079Ap3() { // from class: AP3
            public /* synthetic */ AP3() {
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                Profile profile = (Profile) ((C8385oa2) InterfaceC7697ma2.this).get();
                if (profile != null) {
                    return LU3.a(profile);
                }
                return null;
            }
        }, this.t, new InterfaceC0079Ap3() { // from class: BP3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                String b = C10648v91.b();
                return TextUtils.isEmpty(b) ? "chrome-native://newtab/" : b;
            }
        }, new Runnable() { // from class: CP3
            public /* synthetic */ CP3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C9707sQ3.this.m();
            }
        }, this.w);
        this.Z = c6621jR3;
        if (c9861ss != null && C9861ss.b()) {
            c9861ss.a(c6621jR3, 14);
        }
        C3799bD c3799bD = cc.g;
        this.o0 = c3799bD;
        RJ3 rj3 = DeviceFormFactor.a(aVar) ? this.i : qs3;
        C6373ij c6373ij2 = this.i;
        Objects.requireNonNull(compositorViewHolder);
        ?? r12 = new Runnable() { // from class: DP3
            @Override // java.lang.Runnable
            public final void run() {
                CompositorViewHolder.this.requestFocus();
            }
        };
        boolean z3 = dVar instanceof CustomTabToolbar;
        RJ3 rj32 = z3 ? c8226o53 : rj3;
        ?? r29 = new InterfaceC0079Ap3() { // from class: TP3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return C4771e24.a().d.b;
            }
        };
        ?? r31 = new Runnable() { // from class: UP3
            @Override // java.lang.Runnable
            public final void run() {
                C8895q24 c8895q24;
                C8552p24 c8552p24;
                C8552p24 c8552p242 = C4771e24.a().c;
                if (c8552p242 == null || c8552p242.a != 2 || (c8552p24 = (c8895q24 = AbstractC7865n24.a).d) == null) {
                    return;
                }
                String str = AbstractC6547jD.a.e;
                String str2 = c8552p24.d;
                if (str2 != null && str2.equals(str)) {
                    return;
                }
                O83.a.t("android_os_unsupported_chrome_version", str);
                c8895q24.d.d = str;
                Iterator it = c8895q24.a.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        return;
                    } else {
                        ((Callback) c11814ya2.next()).onResult(c8895q24.d);
                    }
                }
            }
        };
        LS1 ls1 = new LS1(c0538Ed2, c3799bD, c10285u6, new KS1() { // from class: VP3
            @Override // defpackage.KS1
            public final void a() {
                C9707sQ3.this.k(12, false);
            }
        }, r12, z, interfaceC0079Ap3, rj32, r29, r31, R.id.menu_button_wrapper);
        this.a0 = ls1;
        if (z) {
            QS1 qs1 = ls1.c;
            this.u0 = qs1 != null ? new Runnable() { // from class: HS1
                public /* synthetic */ HS1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    QS1 qs122 = QS1.this;
                    if (((Boolean) qs122.l.get()).booleanValue() || !qs122.k) {
                        return;
                    }
                    if (qs122.r.get() != null) {
                        qs122.b(true);
                        qs122.h.run();
                    } else {
                        if (((RS1) qs122.g.i(TS1.h)).a) {
                            qs122.a(true);
                        }
                    }
                }
            } : null;
        }
        LS1 ls12 = new LS1(c0538Ed2, c3799bD, c10285u6, new KS1() { // from class: VP3
            @Override // defpackage.KS1
            public final void a() {
                C9707sQ3.this.k(12, false);
            }
        }, r12, z, interfaceC0079Ap3, c6373ij2, r29, r31, R.id.none);
        this.b0 = ls12;
        if (d && z) {
            QS1 qs12 = ls12.c;
            this.v0 = qs12 != null ? new Runnable() { // from class: HS1
                public /* synthetic */ HS1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    QS1 qs122 = QS1.this;
                    if (((Boolean) qs122.l.get()).booleanValue() || !qs122.k) {
                        return;
                    }
                    if (qs122.r.get() != null) {
                        qs122.b(true);
                        qs122.h.run();
                    } else {
                        if (((RS1) qs122.g.i(TS1.h)).a) {
                            qs122.a(true);
                        }
                    }
                }
            } : null;
        }
        boolean b = AbstractC5177fD3.b(aVar);
        boolean i = AbstractC5177fD3.i(aVar);
        boolean g = AbstractC5177fD3.g();
        boolean d2 = AbstractC5177fD3.d(aVar);
        C3809bF b2 = this.N.b(new Callback() { // from class: WP3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C9707sQ3.this.getClass();
                AbstractC5241fQ2.b((LoadUrlParams) obj, false, Boolean.FALSE, (Tab) interfaceC0079Ap32.get());
            }
        });
        ViewStub viewStub = (ViewStub) aVar.findViewById(R.id.tab_switcher_toolbar_stub);
        Q44 q44 = new Q44(aVar, handler);
        C6373ij c6373ij3 = this.i;
        LS1 ls13 = this.a0;
        LS1 ls14 = this.b0;
        QS1 qs13 = ls13.c;
        C8385oa2 c8385oa27 = qs13 == null ? null : qs13.c;
        InterfaceC7697ma2 interfaceC7697ma26 = this.w;
        final C2556Tr1 c2556Tr1 = compositorViewHolder.j;
        ?? r11 = new Callback() { // from class: FP3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Runnable runnable = (Runnable) obj;
                C2556Tr1 c2556Tr12 = C2556Tr1.this;
                if (c2556Tr12 != null) {
                    InterfaceC2426Sr1 interfaceC2426Sr1 = c2556Tr12.a;
                    if (interfaceC2426Sr1 != null) {
                        CompositorViewHolder compositorViewHolder2 = (CompositorViewHolder) interfaceC2426Sr1;
                        if (compositorViewHolder2.o <= 0) {
                            runnable.run();
                            return;
                        }
                        ArrayList arrayList = compositorViewHolder2.p;
                        if (arrayList.contains(runnable)) {
                            return;
                        }
                        arrayList.add(runnable);
                        return;
                    }
                    runnable.run();
                    return;
                }
                runnable.run();
            }
        };
        ?? r112 = new InterfaceC0079Ap3() { // from class: GP3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                int i2 = C9707sQ3.this.I;
                C0942Hg1 c0942Hg12 = c0942Hg1;
                C8610pD c8610pD = c0942Hg12.m;
                if (i2 != 1) {
                    c8610pD.a = false;
                } else {
                    c0942Hg12.a();
                }
                return c8610pD;
            }
        };
        ?? r113 = new InterfaceC0079Ap3() { // from class: HP3
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return CompositorViewHolder.this.l.n;
            }
        };
        ?? r114 = new InterfaceC7913nB() { // from class: JP3
            @Override // defpackage.InterfaceC7913nB
            public final boolean a() {
                return N.M$3vpOHw();
            }
        };
        KH kh = new KH();
        final PartnerBrowserCustomizations b3 = PartnerBrowserCustomizations.b();
        Objects.requireNonNull(b3);
        e eVar = new e(toolbarControlContainer, viewStub, dVar, locationBarModel, c6621jR3, q44, list, rj3, c6373ij3, ls13, ls14, c8385oa27, interfaceC7697ma26, c8385oa23, c8385oa25, r11, r112, r113, c8385oa26, r114, b, i, g, d, d2, kh, new InterfaceC7913nB() { // from class: KP3
            @Override // defpackage.InterfaceC7913nB
            public final boolean a() {
                return PartnerBrowserCustomizations.this.d();
            }
        }, new KH(), z2, interfaceC7697ma22, b2);
        this.c0 = new LP3(this);
        C10648v91.c().b.a(this.c0);
        this.c0.a();
        if ((dVar instanceof ToolbarPhone) && AbstractC5241fQ2.d(aVar)) {
            c0942Hg1.j(new InterfaceC8953qD() { // from class: MP3
                @Override // defpackage.InterfaceC8953qD
                public final void b(boolean z4) {
                    C9707sQ3.this.r.p(Boolean.valueOf(z4));
                }
            });
        }
        final HomeButton g2 = dVar.g();
        if (g2 != null) {
            final C10648v91 c = C10648v91.c();
            Objects.requireNonNull(c);
            Callback callback = new Callback() { // from class: NP3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C10648v91.this.c.b((Context) obj, HomepageSettings.class, null);
                }
            };
            Callback callback2 = new Callback() { // from class: p91
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    int i2 = HomeButton.u;
                    HomeButton.this.g();
                }
            };
            c8385oa23.m(callback2);
            c8385oa24.m(callback2);
            g2.s = callback;
            g2.t = c8385oa24;
            g2.g();
        }
        this.k = eVar;
        C8565p5 c8565p5 = new C8565p5(aVar, c11840ye4, ko3);
        this.O = c8565p5;
        c8565p5.c = dVar.j();
        if (z3) {
            CustomTabToolbar customTabToolbar = (CustomTabToolbar) dVar;
            customTabToolbar.G = locationBarModel;
            ViewOnLongClickListenerC11150we0 viewOnLongClickListenerC11150we0 = customTabToolbar.F;
            viewOnLongClickListenerC11150we0.g = locationBarModel;
            viewOnLongClickListenerC11150we0.h = interfaceC0079Ap34;
            locationBarModel.l(viewOnLongClickListenerC11150we0);
            viewOnLongClickListenerC11150we0.i = interfaceC7697ma25;
            viewOnLongClickListenerC11150we0.j = new C5809h34((UrlBarApi26) viewOnLongClickListenerC11150we0.k, null, ko3, new C9435re0(), viewOnLongClickListenerC11150we0, new C9939t52(), locationBarModel.n, new C9778se0());
            viewOnLongClickListenerC11150we0.w();
            viewOnLongClickListenerC11150we0.z();
            viewOnLongClickListenerC11150we0.x();
            viewOnLongClickListenerC11150we0.B();
            this.D = viewOnLongClickListenerC11150we0;
        } else {
            InterfaceC1068If2 interfaceC1068If2 = new InterfaceC1068If2() { // from class: nP3
                @Override // defpackage.InterfaceC1068If2
                public final boolean a(String str, int i2, String str2, byte[] bArr, boolean z4) {
                    return AbstractC5241fQ2.c(new LoadUrlParams(str, i2 | 33554432), str2, bArr, false, Boolean.valueOf(z4), (Tab) InterfaceC0079Ap3.this.get()) != null;
                }
            };
            Objects.requireNonNull(c8385oa22);
            final RO ro = new RO(interfaceC7697ma25, new VL(c8385oa22), interfaceC0079Ap34);
            View findViewById = aVar.findViewById(R.id.location_bar);
            C9626sA2.g();
            org.chromium.chrome.browser.omnibox.a aVar2 = new org.chromium.chrome.browser.omnibox.a(findViewById, dVar, interfaceC7697ma22, locationBarModel, ko3, new C8820pp4(aVar.getWindow()), c10285u6, c6166i6, interfaceC7697ma25, interfaceC7697ma2, c10501uk1, i5, interfaceC1068If2, new C5930hQ3(), QZ2.a(), new Runnable() { // from class: oP3
                @Override // java.lang.Runnable
                public final void run() {
                    C9707sQ3 c9707sQ3 = C9707sQ3.this;
                    c9707sQ3.getClass();
                    int i2 = AutofillAssistantPreferenceFragment.p0;
                    String name = AutofillAssistantPreferenceFragment.class.getName();
                    Intent intent = new Intent();
                    a aVar3 = c9707sQ3.R;
                    intent.setClass(aVar3, SettingsActivity.class);
                    if (!(aVar3 instanceof Activity)) {
                        intent.addFlags(268435456);
                        intent.addFlags(67108864);
                    }
                    intent.putExtra("show_fragment", name);
                    ComponentName componentName = AbstractC2281Ro1.a;
                    try {
                        aVar3.startActivity(intent, null);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }, new InterfaceC3173Yk3() { // from class: pP3
                @Override // defpackage.InterfaceC3173Yk3
                public final void a(Tab tab, XO xo) {
                    RO ro2 = RO.this;
                    ro2.getClass();
                    WebContents b4 = tab.b();
                    if (b4 == null || !ProfileManager.b) {
                        return;
                    }
                    Activity b5 = AbstractC7239lD3.b(tab);
                    PageInfoController.h(b5, b4, null, 2, new WO(b5, b4, ro2.a, new C1827Ob2(tab), ro2.b, ro2.c, xo), xo);
                }
            }, new C5630gZ2(), new InterfaceC6908kG1() { // from class: qP3
                @Override // defpackage.InterfaceC6908kG1
                public final boolean a(Tab tab) {
                    return DownloadUtils.f(tab);
                }
            }, new InterfaceC6564jG1() { // from class: rP3
                @Override // defpackage.InterfaceC6564jG1
                public final void a(int i2, String str) {
                    if ((i2 & 255) == 5) {
                        R32.a(0);
                    } else if (N.Mj1SQ9S8(str)) {
                        R32.a(1);
                    } else {
                        R32.a(2);
                    }
                }
            }, new C6660jZ2(), new InterfaceC6114hx() { // from class: sP3
                @Override // defpackage.InterfaceC6114hx
                public final boolean a(GURL gurl) {
                    C9707sQ3 c9707sQ3 = C9707sQ3.this;
                    C8385oa2 c8385oa28 = (C8385oa2) c9707sQ3.A;
                    c8385oa28.getClass();
                    return AbstractC12248zp3.a(c8385oa28) && N.MTTi3vAA(((BookmarkBridge) ((C8385oa2) c9707sQ3.A).get()).c, gurl);
                }
            }, new ZY2(), interfaceC6092ht1, c8385oa22, c4959ec2, c3799bD, new C9778se0(), c9861ss);
            dVar.M(aVar2);
            dVar.G(c3799bD);
            this.D = aVar2;
        }
        if (this.D.j() != null) {
            ((g) this.D.j()).d(this);
        }
        C3816bG1 c3816bG1 = new C3816bG1(ox2, new C8679pQ3(c1948Oz3), aVar, locationBarModel, new Runnable() { // from class: tP3
            @Override // java.lang.Runnable
            public final void run() {
                C9707sQ3.this.k(12, false);
            }
        }, compositorViewHolder);
        if (this.D.j() != null) {
            ((g) this.D.j()).d(c3816bG1);
        }
        this.Y = new GE1(c6166i6, dVar.l, d);
        dVar.g.a(c2913Wk3);
        this.x = new C6616jQ3(this, c6166i6);
        this.v = new C6960kQ3(this);
        this.G = new C7304lQ3(this);
        C7992nQ3 c7992nQ3 = new C7992nQ3(this);
        this.m = c7992nQ3;
        cc.d(c7992nQ3);
        C8336oQ3 c8336oQ3 = new C8336oQ3(this);
        this.n = c8336oQ3;
        ((XU0) zu0).a(c8336oQ3);
        XP3 xp3 = new XP3(this);
        this.H = xp3;
        this.L = new YP3(this);
        this.G0 = new ZP3(this);
        eVar.d(c10226tv3);
        C4146cD3 c4146cD3 = eVar.b;
        if (c4146cD3 != null) {
            c4146cD3.g = c10501uk1;
            TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar = c4146cD3.j;
            if (tabSwitcherModeTopToolbar != null) {
                tabSwitcherModeTopToolbar.j = c10501uk1;
                c10501uk1.a(tabSwitcherModeTopToolbar);
                NewTabButton newTabButton = tabSwitcherModeTopToolbar.n;
                if (newTabButton != null) {
                    C10501uk1 c10501uk12 = tabSwitcherModeTopToolbar.j;
                    newTabButton.l = c10501uk12;
                    c10501uk12.a(newTabButton);
                }
            }
        } else {
            c cVar = eVar.c;
            if (cVar != null) {
                cVar.a.a.o(AbstractC1738Nj3.a, c10501uk1);
            }
        }
        C10021tL.f().a(this);
        if (locationBarModel.p != d) {
            locationBarModel.p = d;
            locationBarModel.v();
        }
        this.E = c3511aO0;
        c3511aO0.f.a(xp3);
        interfaceC0408Dd22.j(this.N.b(new Callback() { // from class: uP3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                InterfaceC7408lj3 interfaceC7408lj3 = (InterfaceC7408lj3) obj;
                C9707sQ3 c9707sQ3 = C9707sQ3.this;
                c9707sQ3.B0 = interfaceC7408lj3;
                OP3 op3 = new InterfaceC7064kj3() { // from class: OP3
                    public /* synthetic */ OP3() {
                    }

                    @Override // defpackage.InterfaceC7064kj3
                    public final void b(int i2, boolean z4) {
                        C9707sQ3 c9707sQ32 = C9707sQ3.this;
                        c9707sQ32.I = i2;
                        c9707sQ32.k.g(i2, z4);
                    }
                };
                c9707sQ3.C0 = op3;
                ((C10154tj3) interfaceC7408lj3).c.l.a(op3);
                PP3 pp3 = new InterfaceC3009Xe() { // from class: PP3
                    public /* synthetic */ PP3() {
                    }

                    @Override // defpackage.InterfaceC2489Te
                    public final void a(int i2) {
                        e eVar2 = C9707sQ3.this.k;
                        c cVar2 = eVar2.c;
                        if (cVar2 != null) {
                            float f = i2;
                            C1608Mj3 c1608Mj3 = cVar2.a;
                            int i3 = c1608Mj3.o;
                            MD2 md2 = AbstractC1738Nj3.w;
                            PropertyModel propertyModel = c1608Mj3.a;
                            if (i3 == 1 && !propertyModel.j(AbstractC1738Nj3.j)) {
                                c1608Mj3.r = f;
                                propertyModel.l(md2, f);
                            } else {
                                propertyModel.l(md2, 0.0f);
                            }
                            eVar2.h();
                        }
                    }
                };
                c9707sQ3.D0 = pp3;
                ((C10154tj3) c9707sQ3.B0).a(pp3);
            }
        }));
        TraceEvent.c("ToolbarManager.ToolbarManager");
    }

    public final void i() {
        this.k.a.B();
        a();
    }

    public final void j(Tab tab) {
        LocationBarModel locationBarModel = this.z;
        boolean z = locationBarModel.n;
        Tab a = locationBarModel.a();
        boolean isIncognito = tab != null ? tab.isIncognito() : ((AbstractC11276wz3) this.u).o();
        locationBarModel.k = tab;
        if (locationBarModel.n != isIncognito) {
            locationBarModel.n = isIncognito;
            Iterator it = locationBarModel.s.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    ((ZF1) c11814ya2.next()).i();
                }
            }
        }
        locationBarModel.z();
        locationBarModel.x();
        locationBarModel.y();
        locationBarModel.v();
        locationBarModel.w();
        locationBarModel.y();
        o(true);
        a aVar = this.R;
        if (a != null && z != isIncognito && DeviceFormFactor.a(aVar)) {
            this.O.b();
        }
        if (a != tab || z != isIncognito) {
            int a2 = AbstractC11746yN.a(aVar, isIncognito);
            if (tab != null) {
                a2 = this.h.d(tab.k(), tab);
            }
            b(a2, false);
            i();
            if (tab != null) {
                this.k.a.w();
            }
            k(12, false);
            h();
        }
        m();
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [IP3] */
    /* JADX WARN: Type inference failed for: r12v3, types: [QP3] */
    /* JADX WARN: Type inference failed for: r4v0, types: [zS3] */
    public final void g(C9897sy1 c9897sy1, TQ tq, UQ uq, VQ vq, ViewOnClickListenerC0671Fe0 viewOnClickListenerC0671Fe0, WQ wq) {
        String str;
        boolean z;
        ToggleTabStackButton toggleTabStackButton;
        TraceEvent.b("ToolbarManager.initializeWithNative", null);
        this.u = (InterfaceC10590uz3) ((C8385oa2) this.w).g;
        this.z0 = wq;
        Objects.requireNonNull(c9897sy1);
        RunnableC8183ny1 runnableC8183ny1 = new RunnableC8183ny1(c9897sy1);
        C6166i6 c6166i6 = this.y;
        FC fc = this.V;
        QS3 qs3 = this.h;
        e eVar = this.k;
        eVar.getClass();
        final InterfaceC0560Ei interfaceC0560Ei = this.T;
        final ?? r4 = new Callback() { // from class: zS3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                InterfaceC0560Ei.this.O(((Integer) obj).intValue(), null);
            }
        };
        C4146cD3 c4146cD3 = eVar.b;
        if (c4146cD3 != null) {
            c4146cD3.c = tq;
            TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar = c4146cD3.j;
            if (tabSwitcherModeTopToolbar != null && (toggleTabStackButton = tabSwitcherModeTopToolbar.o) != null) {
                toggleTabStackButton.u = tq;
            }
            c4146cD3.d = uq;
            if (tabSwitcherModeTopToolbar != null) {
                tabSwitcherModeTopToolbar.g = uq;
            }
            InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) ((C8385oa2) eVar.g).g;
            c4146cD3.f = interfaceC10590uz3;
            if (tabSwitcherModeTopToolbar != null) {
                tabSwitcherModeTopToolbar.i = interfaceC10590uz3;
                IncognitoToggleTabLayout incognitoToggleTabLayout = tabSwitcherModeTopToolbar.l;
                if (incognitoToggleTabLayout != null) {
                    incognitoToggleTabLayout.y(interfaceC10590uz3);
                }
            }
            c4146cD3.c();
            c4146cD3.d();
        } else {
            c cVar = eVar.c;
            if (cVar != null) {
                PD2 pd2 = AbstractC1738Nj3.b;
                C1608Mj3 c1608Mj3 = cVar.a;
                c1608Mj3.a.o(pd2, uq);
                InterfaceC10590uz3 interfaceC10590uz32 = (InterfaceC10590uz3) ((C8385oa2) eVar.g).g;
                c1608Mj3.m = interfaceC10590uz32;
                boolean z2 = ((AbstractC11276wz3) interfaceC10590uz32).i;
                PropertyModel propertyModel = c1608Mj3.a;
                if (z2 && c1608Mj3.g.a()) {
                    propertyModel.o(AbstractC1738Nj3.s, c1608Mj3.n);
                    propertyModel.o(AbstractC1738Nj3.t, c1608Mj3.m);
                }
                propertyModel.k(AbstractC1738Nj3.j, ((AbstractC11276wz3) c1608Mj3.m).o());
                c1608Mj3.a((C8610pD) c1608Mj3.e.get());
                ((AbstractC11276wz3) c1608Mj3.m).c(c1608Mj3.i);
                ((AbstractC11276wz3) c1608Mj3.m).g.a(c1608Mj3.j);
                XB3 xb3 = cVar.f;
                if (xb3 != null) {
                    xb3.a.o(YB3.b, tq);
                } else {
                    cVar.j = tq;
                }
                final C0959Hj3 c0959Hj3 = new C0959Hj3();
                View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: wB3
                    /* JADX WARN: Type inference failed for: r3v0, types: [xB3] */
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        Context context = view.getContext();
                        ListMenuButton listMenuButton = (ListMenuButton) view;
                        C12033zB3 c12033zB32 = C12033zB3.this;
                        C7616mK1 b = c12033zB32.b();
                        final Callback callback = r4;
                        final C11347xB3 r3 = new Callback() { // from class: xB3
                            @Override // org.chromium.base.Callback
                            public final ZE e0(Object obj) {
                                return new ZE(this, obj);
                            }

                            @Override // org.chromium.base.Callback
                            public final void onResult(Object obj) {
                                Integer num = (Integer) obj;
                                int intValue = num.intValue();
                                if (intValue == R.id.close_tab) {
                                    FI2.a("MobileMenuCloseTab.LongTapMenu");
                                } else if (intValue == R.id.new_tab_menu_id) {
                                    FI2.a("MobileMenuNewTab.LongTapMenu");
                                } else if (intValue == R.id.new_incognito_tab_menu_id) {
                                    FI2.a("MobileMenuNewIncognitoTab.LongTapMenu");
                                }
                                Callback.this.onResult(num);
                            }
                        };
                        ViewTreeObserverOnGlobalLayoutListenerC8754pe4 a = CS1.a(listMenuButton);
                        C4738dx c4738dx = new C4738dx(context, b, new SC1() { // from class: vB3
                            @Override // defpackage.SC1
                            public final void b(PropertyModel propertyModel2) {
                                r3.onResult(Integer.valueOf(propertyModel2.h(AbstractC4144cD1.e)));
                            }
                        });
                        c12033zB32.a = c4738dx.h;
                        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0807b6);
                        ListView listView = c4738dx.a;
                        listView.setPaddingRelative(listView.getPaddingStart(), dimensionPixelOffset, listView.getPaddingEnd(), dimensionPixelOffset);
                        listMenuButton.e(new C11690yB3(c4738dx, a), false);
                        listMenuButton.f();
                        return true;
                    }
                };
                TabSwitcherButtonView tabSwitcherButtonView = cVar.g;
                if (tabSwitcherButtonView != null) {
                    tabSwitcherButtonView.setOnLongClickListener(onLongClickListener);
                } else {
                    cVar.k = onLongClickListener;
                }
                cVar.a();
            }
        }
        d dVar = eVar.a;
        dVar.getClass();
        dVar.h().q();
        dVar.N(tq);
        final C12033zB3 c12033zB3 = new C12033zB3();
        dVar.O(new View.OnLongClickListener() { // from class: wB3
            /* JADX WARN: Type inference failed for: r3v0, types: [xB3] */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Context context = view.getContext();
                ListMenuButton listMenuButton = (ListMenuButton) view;
                C12033zB3 c12033zB32 = C12033zB3.this;
                C7616mK1 b = c12033zB32.b();
                final Callback callback = r4;
                final C11347xB3 r3 = new Callback() { // from class: xB3
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        Integer num = (Integer) obj;
                        int intValue = num.intValue();
                        if (intValue == R.id.close_tab) {
                            FI2.a("MobileMenuCloseTab.LongTapMenu");
                        } else if (intValue == R.id.new_tab_menu_id) {
                            FI2.a("MobileMenuNewTab.LongTapMenu");
                        } else if (intValue == R.id.new_incognito_tab_menu_id) {
                            FI2.a("MobileMenuNewIncognitoTab.LongTapMenu");
                        }
                        Callback.this.onResult(num);
                    }
                };
                ViewTreeObserverOnGlobalLayoutListenerC8754pe4 a = CS1.a(listMenuButton);
                C4738dx c4738dx = new C4738dx(context, b, new SC1() { // from class: vB3
                    @Override // defpackage.SC1
                    public final void b(PropertyModel propertyModel2) {
                        r3.onResult(Integer.valueOf(propertyModel2.h(AbstractC4144cD1.e)));
                    }
                });
                c12033zB32.a = c4738dx.h;
                int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f0807b6);
                ListView listView = c4738dx.a;
                listView.setPaddingRelative(listView.getPaddingStart(), dimensionPixelOffset, listView.getPaddingEnd(), dimensionPixelOffset);
                listMenuButton.e(new C11690yB3(c4738dx, a), false);
                listMenuButton.f();
                return true;
            }
        });
        dVar.F(vq);
        dVar.J(viewOnClickListenerC0671Fe0);
        dVar.L(runnableC8183ny1);
        dVar.v();
        if (C1096Il0.c().f) {
            Context context = dVar.getContext();
            final ToolbarControlContainer toolbarControlContainer = eVar.h;
            Objects.requireNonNull(toolbarControlContainer);
            str = "ToolbarManager.initializeWithNative";
            z = true;
            GS3 gs3 = new GS3(context, c9897sy1, new Callback() { // from class: AS3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    QQ3 qq3;
                    NU nu = (NU) obj;
                    DO3 do3 = ToolbarControlContainer.this.h;
                    if (do3 == null || (qq3 = ((e) do3).a.l) == null) {
                        return;
                    }
                    int color = qq3.a.getColor();
                    float alpha = qq3.getVisibility() == 0 ? qq3.getAlpha() : 0.0f;
                    nu.c = (color & 16777215) | (Math.round((color >>> 24) * alpha) << 24);
                    nu.d = (qq3.g & 16777215) | (Math.round(alpha * (r1 >>> 24)) << 24);
                    WeakHashMap weakHashMap = Ec4.a;
                    int layoutDirection = qq3.getLayoutDirection();
                    Rect rect = nu.b;
                    Rect rect2 = nu.a;
                    if (layoutDirection == 0) {
                        rect2.set(qq3.getLeft(), qq3.getTop(), Math.round(qq3.h * qq3.getWidth()) + qq3.getLeft(), qq3.getBottom());
                        rect.set(rect2.right, qq3.getTop(), qq3.getRight(), qq3.getBottom());
                    } else {
                        rect2.set(qq3.getRight() - Math.round(qq3.h * qq3.getWidth()), qq3.getTop(), qq3.getRight(), qq3.getBottom());
                        rect.set(qq3.getLeft(), qq3.getTop(), rect2.left, qq3.getBottom());
                    }
                }
            }, c6166i6, fc, eVar.i, qs3, 11, false);
            eVar.j = gs3;
            c9897sy1.f(gs3);
            GS3 gs32 = eVar.j;
            dVar.u = gs32;
            boolean z3 = dVar.getVisibility() == 0;
            LS3 ls3 = gs32.h;
            ls3.k = z3;
            ls3.b();
        } else {
            str = "ToolbarManager.initializeWithNative";
            z = true;
        }
        dVar.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC4211cQ3(this));
        LocationBarModel locationBarModel = this.z;
        locationBarModel.getClass();
        C7928nE c7928nE = UN.a;
        locationBarModel.j = N.M09VlOh_("LocationBarModelOptimizations");
        locationBarModel.h = Profile.d();
        if (locationBarModel.j) {
            locationBarModel.i = new LruCache(10);
            locationBarModel.g = new C11055wM(locationBarModel.b());
        }
        locationBarModel.r = N.M8_Iwqb0(locationBarModel);
        this.F = c9897sy1;
        c9897sy1.z.b.a(this.G0);
        if (this.u0 != null) {
            C4771e24.a().d(this.u0);
        }
        if (this.v0 != null) {
            C4771e24.a().d(this.v0);
        }
        IG3.a().i(new Runnable() { // from class: mP3
            @Override // java.lang.Runnable
            public final void run() {
                C9707sQ3 c9707sQ3 = C9707sQ3.this;
                c9707sQ3.getClass();
                TemplateUrlService a = IG3.a();
                C4555dQ3 c4555dQ3 = new C4555dQ3(c9707sQ3, a);
                c9707sQ3.C = c4555dQ3;
                a.a(c4555dQ3);
            }
        });
        this.s0 = z;
        ((AbstractC11276wz3) this.u).c(this.v);
        j((Tab) this.y.g);
        if (((AbstractC11276wz3) this.u).i) {
            this.r0 = z;
        }
        if (this.r0 && this.s0) {
            eVar.a.z();
        }
        InterfaceC10590uz3 interfaceC10590uz33 = this.u;
        C10226tv3 c10226tv3 = this.g;
        c10226tv3.b = interfaceC10590uz33;
        C8855pv3 c8855pv3 = new C8855pv3(c10226tv3);
        c10226tv3.c = c8855pv3;
        ((AbstractC11276wz3) interfaceC10590uz33).c(c8855pv3);
        C9198qv3 c9198qv3 = new C9198qv3(c10226tv3);
        c10226tv3.d = c9198qv3;
        ((AbstractC11276wz3) c10226tv3.b).c.b(c9198qv3);
        if (((AbstractC11276wz3) c10226tv3.b).c.d() instanceof C1024Hw3) {
            c10226tv3.e = new C9540rv3(c10226tv3);
            ((C1024Hw3) ((AbstractC11276wz3) c10226tv3.b).c.d()).Q(c10226tv3.e);
        }
        c10226tv3.b();
        InterfaceC10590uz3 interfaceC10590uz34 = this.u;
        C10501uk1 c10501uk1 = this.a;
        c10501uk1.c = interfaceC10590uz34;
        ((AbstractC11276wz3) interfaceC10590uz34).c(c10501uk1.b);
        boolean o = ((AbstractC11276wz3) c10501uk1.c).o();
        Iterator it = c10501uk1.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            } else {
                ((InterfaceC10158tk1) c11814ya2.next()).b(o);
            }
        }
        C6373ij c6373ij = this.i;
        c6373ij.m = c10501uk1;
        c10501uk1.a(c6373ij);
        SP3 sp3 = this.t0;
        if (sp3 != null) {
            sp3.run();
            this.t0 = null;
        }
        Tab h = ((AbstractC11276wz3) this.u).h();
        ToolbarControlContainer toolbarControlContainer2 = this.l;
        if (h != null && h.b() != null && !h.getUrl().k()) {
            toolbarControlContainer2.i.i = z;
        }
        if (N.M09VlOh_("ToolbarIphAndroid")) {
            Q44 q44 = new Q44(this.R, this.Q);
            this.m0 = new C10305u91(this.R, toolbarControlContainer2.findViewById(R.id.home_button), q44, new InterfaceC7913nB() { // from class: xP3
                public /* synthetic */ C11417xP3() {
                }

                @Override // defpackage.InterfaceC7913nB
                public final boolean a() {
                    return C10501uk1.this.b();
                }
            }, this.E0, this.F0, new InterfaceC0079Ap3() { // from class: IP3
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    String b = C10648v91.b();
                    return Boolean.valueOf((TextUtils.isEmpty(b) || T34.j(b)) ? false : true);
                }
            }, new InterfaceC7913nB() { // from class: QP3
                @Override // defpackage.InterfaceC7913nB
                public final boolean a() {
                    return N.MpwNAobK();
                }
            }, this.y);
            this.n0 = new C5232fO3(this.R, (ToggleTabStackButton) toolbarControlContainer2.findViewById(R.id.tab_switcher_button), q44, new InterfaceC7913nB() { // from class: xP3
                public /* synthetic */ C11417xP3() {
                }

                @Override // defpackage.InterfaceC7913nB
                public final boolean a() {
                    return C10501uk1.this.b();
                }
            }, this.E0, this.F0, this.M, new Callback() { // from class: RP3
                public /* synthetic */ RP3() {
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    e eVar2 = e.this;
                    C4146cD3 c4146cD32 = eVar2.b;
                    if (c4146cD32 == null) {
                        c cVar2 = eVar2.c;
                        if (cVar2 != null) {
                            cVar2.a.a.k(AbstractC1738Nj3.p, booleanValue);
                            return;
                        }
                        return;
                    }
                    NewTabButton newTabButton = c4146cD32.j.n;
                    if (newTabButton == null) {
                        return;
                    }
                    if (booleanValue) {
                        AbstractC3593ad4.b(newTabButton, new Yc4(1));
                    } else {
                        AbstractC3593ad4.a(newTabButton);
                    }
                }
            }, this.y);
        }
        TraceEvent.c(str);
    }

    public final void n(int i, boolean z) {
        e eVar = this.k;
        if (i == 2) {
            LocationBarModel locationBarModel = this.z;
            locationBarModel.q = true;
            locationBarModel.x();
            locationBarModel.y();
            locationBarModel.v();
            locationBarModel.w();
            eVar.e(true, z, false);
            m();
            if (locationBarModel.p) {
                org.chromium.chrome.browser.omnibox.a aVar = (org.chromium.chrome.browser.omnibox.a) this.D;
                if (aVar.v) {
                    C1245Jp c1245Jp = aVar.j.i;
                    c1245Jp.getClass();
                    c1245Jp.i(new RunnableC0335Cp(c1245Jp), -1L);
                }
            }
        }
        eVar.a.I();
    }

    public final C10613v32 f() {
        LocationBarModel locationBarModel = this.z;
        if (!locationBarModel.o()) {
            return null;
        }
        InterfaceC5451g12 x = locationBarModel.a().x();
        if (x instanceof C10613v32) {
            return (C10613v32) x;
        }
        return null;
    }

    public final ImageButton e() {
        return this.a0.e.a;
    }

    @Override // defpackage.G1
    public final void D(boolean z) {
        a aVar = this.R;
        if (this.f11542J == AbstractC5241fQ2.d(aVar)) {
            e eVar = this.k;
            eVar.a.r(z);
            C4146cD3 c4146cD3 = eVar.b;
            if (c4146cD3 != null) {
                c4146cD3.i = z;
                TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar = c4146cD3.j;
                if (tabSwitcherModeTopToolbar != null) {
                    NewTabButton newTabButton = tabSwitcherModeTopToolbar.n;
                    if (newTabButton != null) {
                        newTabButton.d();
                    }
                    tabSwitcherModeTopToolbar.m();
                    return;
                }
                return;
            }
            c cVar = eVar.c;
            if (cVar != null) {
                LD2 ld2 = AbstractC1738Nj3.k;
                C1608Mj3 c1608Mj3 = cVar.a;
                c1608Mj3.a.k(ld2, z);
                c1608Mj3.e();
                return;
            }
            return;
        }
        InterfaceC0408Dd2 interfaceC0408Dd2 = this.l0;
        if (interfaceC0408Dd2.get() != null) {
            ((C9970tA3) interfaceC0408Dd2.get()).a();
        }
        aVar.recreate();
    }

    @Override // defpackage.InterfaceC10272u34
    public final void d(boolean z) {
        this.k.c(z);
        C3511aO0 c3511aO0 = this.E;
        if (c3511aO0 != null && z) {
            c3511aO0.a(true);
        }
        C3799bD c3799bD = this.o0;
        if (c3799bD == null) {
            return;
        }
        if (z) {
            this.p0 = c3799bD.w(this.p0);
        } else {
            c3799bD.u(this.p0);
        }
        this.P.onResult(Boolean.valueOf(z));
    }

    @Override // defpackage.PJ3
    public final void b(int i, boolean z) {
        if (this.w0) {
            if (this.x0 != i) {
                this.x0 = i;
                LocationBarModel locationBarModel = this.z;
                locationBarModel.l = i;
                locationBarModel.z();
                locationBarModel.v();
                this.k.a.x(z);
                this.j.a(i, z);
            }
        }
    }

    @Override // defpackage.QJ3
    public final void c(int i, ColorStateList colorStateList) {
        l();
        if (this.w0) {
            this.j.c(i, colorStateList);
        }
    }

    public final void k(int i, boolean z) {
        if (this.s0 && this.D.j() != null) {
            boolean z2 = ((g) this.D.j()).M;
            ((g) this.D.j()).Z(null, i, z);
            if (z2 && z) {
                this.D.h();
            }
        }
    }

    public final void m() {
        InterfaceC2379Si interfaceC2379Si;
        C7616mK1 c7616mK1;
        View childAt;
        LocationBarModel locationBarModel = this.z;
        Tab a = locationBarModel.a();
        boolean z = true;
        boolean z2 = a != null && C8693pT2.W0(a);
        e eVar = this.k;
        eVar.f();
        boolean z3 = a != null && a.h();
        d dVar = eVar.a;
        dVar.V(z3);
        dVar.Z(a != null && a.j());
        Tab a2 = locationBarModel.a();
        if (z2 || ((a2 == null || !a2.e()) && this.s0)) {
            z = false;
        }
        dVar.b0(z);
        QS1 qs1 = this.a0.c;
        if (qs1 != null && (interfaceC2379Si = qs1.a) != null && qs1.d != null) {
            ((C3159Yi) interfaceC2379Si).k(z);
            ViewOnKeyListenerC11859yi viewOnKeyListenerC11859yi = qs1.d.a;
            if (viewOnKeyListenerC11859yi != null && viewOnKeyListenerC11859yi.m != null && (c7616mK1 = viewOnKeyListenerC11859yi.v) != null && viewOnKeyListenerC11859yi.k != null && viewOnKeyListenerC11859yi.l != null) {
                int size = c7616mK1.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        i = -1;
                        break;
                    } else if (((C7272lK1) viewOnKeyListenerC11859yi.v.get(i)).b.h(AbstractC1470Li.a) == R.id.icon_row_menu_id) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    int firstVisiblePosition = viewOnKeyListenerC11859yi.l.getFirstVisiblePosition();
                    int lastVisiblePosition = viewOnKeyListenerC11859yi.l.getLastVisiblePosition();
                    if (i >= firstVisiblePosition && i <= lastVisiblePosition && (childAt = viewOnKeyListenerC11859yi.l.getChildAt(i - firstVisiblePosition)) != null) {
                        viewOnKeyListenerC11859yi.m.getView(i, childAt, viewOnKeyListenerC11859yi.l);
                    }
                }
            }
        }
        l();
        MenuButton menuButton = eVar.e.e;
        if (menuButton != null) {
            menuButton.setVisibility(0);
        }
    }

    public final void l() {
        boolean z;
        if (this.A == null) {
            return;
        }
        Tab a = this.z.a();
        BookmarkBridge bookmarkBridge = (BookmarkBridge) ((C8385oa2) this.A).g;
        if (a != null && bookmarkBridge != null) {
            Object obj = ThreadUtils.a;
            if (bookmarkBridge.l(a) != null) {
                z = true;
                this.k.a.W(z, a != null || bookmarkBridge == null || bookmarkBridge.m());
            }
        }
        z = false;
        this.k.a.W(z, a != null || bookmarkBridge == null || bookmarkBridge.m());
    }

    public final void a() {
        boolean d;
        C10613v32 f = f();
        if (f != null) {
            InterfaceC5991hc2 j = this.D.j();
            f.z = j;
            if (j != null) {
                NewTabPageLayout newTabPageLayout = f.v;
                newTabPageLayout.B = ((g) j).M ? 1.0f : 0.0f;
                newTabPageLayout.k();
                OJ0 oj0 = f.u.I;
                if (oj0 != null) {
                    ((g) f.z).d(oj0);
                }
            }
            Vf4 I = ((g) f.z).I();
            f.A = I;
            if (I != null) {
                I.f.a(f);
                f.v.m();
            }
            Iterator it = this.z.s.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    ((ZF1) c11814ya2.next()).e();
                }
            }
            if (AbstractC8293oI0.a()) {
                if (AbstractC1947Oz2.d()) {
                    C7928nE c7928nE = UN.a;
                    if (N.M6bsIDpc("CommercePriceTracking", "enable_price_drop_iph", false)) {
                        d = true;
                    }
                }
                d = false;
            } else {
                d = AbstractC1947Oz2.d();
            }
            if (d) {
                ToolbarControlContainer toolbarControlContainer = this.l;
                ToggleTabStackButton toggleTabStackButton = (ToggleTabStackButton) toolbarControlContainer.findViewById(R.id.tab_switcher_button);
                Q44 q44 = new Q44(this.R, this.Q);
                Yc4 yc4 = new Yc4(1);
                yc4.b = true;
                C12180ze1 c12180ze1 = new C12180ze1(toolbarControlContainer.getResources(), "IPH_PriceDropNTP", R.string.0_resource_name_obfuscated_res_0x7f14087e, R.string.0_resource_name_obfuscated_res_0x7f14087e);
                c12180ze1.l = new Rect(0, 0, 0, -toolbarControlContainer.getResources().getDimensionPixelOffset(R.dimen.0_resource_name_obfuscated_res_0x7f080688));
                c12180ze1.h = toggleTabStackButton;
                c12180ze1.o = yc4;
                c12180ze1.e = true;
                q44.a(c12180ze1.a());
            }
        }
    }

    public final void o(boolean z) {
        if (this.L0) {
            return;
        }
        LocationBarModel locationBarModel = this.z;
        locationBarModel.w();
        if (z) {
            locationBarModel.y();
            m();
        }
    }

    public final void h() {
        Tab a;
        a aVar = this.R;
        if (DeviceFormFactor.a(aVar) && (a = this.z.a()) != null) {
            InterfaceC5451g12 x = a.x();
            boolean z = x instanceof C10613v32;
            if (z || (x instanceof C10838vj1)) {
                if (C10021tL.f().c() && z) {
                    this.D.r();
                }
                if (aVar.getResources().getConfiguration().keyboard == 2) {
                    this.D.s();
                }
            }
        }
    }
}
