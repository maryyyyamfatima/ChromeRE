package defpackage;

import J.N;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.chrome.browser.logo.LogoView;
import org.chromium.chrome.browser.ntp.NewTabPageLayout;
import org.chromium.chrome.browser.omnibox.g;
import org.chromium.chrome.browser.omnibox.suggestions.AutocompleteController;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.chrome.browser.search_resumption.SearchResumptionModuleBridge;
import org.chromium.chrome.browser.search_resumption.SearchResumptionModuleView;
import org.chromium.chrome.browser.search_resumption.SearchResumptionTileContainerView;
import org.chromium.chrome.browser.search_resumption.SearchResumptionTileView;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.vr.VrModuleProvider;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v32 */
/* loaded from: classes.dex */
public final class C10613v32 implements InterfaceC5451g12, InterfaceC2296Rr1, HG3, GC, AK0, Qf4 {
    public Vf4 A;
    public final long B;
    public long C;
    public boolean D;
    public boolean E;
    public final int F;
    public final InterfaceC10590uz3 G;
    public C7164l03 H;
    public final Tab a;
    public final InterfaceC0079Ap3 g;
    public final I5 h;
    public final String i;
    public final InterfaceC6092ht1 j;
    public final Activity k;
    public final int l;
    public final C9927t32 m;
    public final C10270u32 n;
    public final boolean o;
    public final JC p;
    public final I60 q;
    public final C12157za2 r;
    public final QB s;
    public final SettingsLauncher t;
    public C12075zK0 u;
    public NewTabPageLayout v;
    public C8213o32 w;
    public C8556p32 x;
    public boolean y;
    public InterfaceC5991hc2 z;

    @Override // defpackage.GC
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.InterfaceC5451g12
    public final String getUrl() {
        return "chrome-native://newtab/";
    }

    @Override // defpackage.InterfaceC5451g12
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // defpackage.InterfaceC5451g12
    public final void n(String str) {
    }

    @Override // defpackage.InterfaceC5451g12
    public final String q() {
        return "newtab";
    }

    @Override // defpackage.GC
    public final /* synthetic */ void r() {
    }

    public static void i(C10613v32 c10613v32) {
        c10613v32.getClass();
        c10613v32.C = System.nanoTime();
        FI2.a("MobileNTPShown");
        c10613v32.j.a(3);
        Q83 q83 = O83.a;
        if (!q83.e("content_suggestions_shown", false)) {
            FI2.a("Suggestions.FirstTimeSurfaceVisible");
            q83.p("content_suggestions_shown", true);
        }
        FI2.a("Suggestions.SurfaceVisible");
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("PrivacySandboxSettings3")) {
            OA2.a(1, c10613v32.k, c10613v32.t, false, c10613v32.s);
        }
        final NewTabPageLayout newTabPageLayout = c10613v32.v;
        Objects.requireNonNull(newTabPageLayout);
        AbstractC9664sI0.b(5, new Runnable() { // from class: n32
            @Override // java.lang.Runnable
            public final void run() {
                NewTabPageLayout newTabPageLayout2 = NewTabPageLayout.this;
                new Q44(newTabPageLayout2.r, new Handler()).a(NewTabPageLayout.d(newTabPageLayout2.r.getResources(), R.string.0_resource_name_obfuscated_res_0x7f14049a, R.string.0_resource_name_obfuscated_res_0x7f14049a, newTabPageLayout2.j.b.findViewById(R.id.voice_search_button), true).a());
            }
        });
    }

    public final boolean v() {
        C10613v32 c10613v32 = this.m.f;
        if (c10613v32.E) {
            return false;
        }
        return (!c10613v32.o && c10613v32.y) && !c10613v32.v.C;
    }

    @Override // defpackage.GC
    public final void b(boolean z, int i, int i2, int i3) {
        z();
    }

    @Override // defpackage.GC
    public final void k(int i) {
        z();
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [F32] */
    /* JADX WARN: Type inference failed for: r5v7, types: [E32] */
    public C10613v32(Activity activity, CC cc, InterfaceC0079Ap3 interfaceC0079Ap3, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, I5 i5, InterfaceC10590uz3 interfaceC10590uz3, boolean z, R32 r32, boolean z2, C7857n12 c7857n12, Tab tab, String str, QB qb, InterfaceC0079Ap3 interfaceC0079Ap32, WindowAndroid windowAndroid, InterfaceC6092ht1 interfaceC6092ht1, InterfaceC0079Ap3 interfaceC0079Ap33, I53 i53, C4270cc0 c4270cc0) {
        Profile profile;
        int i;
        long nanoTime = System.nanoTime();
        this.B = nanoTime;
        TraceEvent.b("NewTabPage", null);
        this.g = interfaceC0079Ap3;
        this.h = i5;
        this.a = tab;
        this.j = interfaceC6092ht1;
        this.r = new C12157za2();
        this.p = cc;
        this.G = interfaceC10590uz3;
        this.s = qb;
        this.t = i53;
        Profile b = Profile.b(tab.b());
        C9162qp3 c9162qp3 = new C9162qp3(activity, b, c7857n12, interfaceC10590uz3, tab);
        C9927t32 c9927t32 = new C9927t32(this, c9162qp3, b, c7857n12);
        this.m = c9927t32;
        C10270u32 c10270u32 = new C10270u32(this, activity, b, c9162qp3, viewOnClickListenerC1069If3);
        this.n = c10270u32;
        this.k = activity;
        this.i = activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1406cc);
        this.l = AbstractC10957w33.a(activity);
        this.o = z;
        IG3.a().a(this);
        C8213o32 c8213o32 = new C8213o32(this);
        this.w = c8213o32;
        tab.v(c8213o32);
        C8556p32 c8556p32 = new C8556p32(this);
        this.x = c8556p32;
        i5.b(c8556p32);
        this.y = IG3.a().b();
        Profile b2 = Profile.b(tab.b());
        this.v = (NewTabPageLayout) LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01b2, (ViewGroup) null);
        C12075zK0 c12075zK0 = new C12075zK0(activity, viewOnClickListenerC1069If3, windowAndroid, new C3018Xf3(c9927t32, this.v), this.v, cc.m, z2, this, b2, false, qb, interfaceC0079Ap32, null, S32.a(str), C9626sA2.g(), interfaceC0079Ap33, 1, nanoTime, ZK0.l(activity), false, null, new C9584s32(activity, viewOnClickListenerC1069If3, c9927t32.b, new BookmarkBridge(b2), c4270cc0), C12008z71.a());
        this.u = c12075zK0;
        r32.getClass();
        C11046wK0 c11046wK0 = c12075zK0.o;
        c11046wK0.getViewTreeObserver().addOnPreDrawListener(new P32(nanoTime, c11046wK0));
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        if (abstractC11276wz3.i) {
            profile = b;
            w(profile);
        } else {
            profile = b;
            abstractC11276wz3.c(new C8899q32(this, profile));
        }
        this.u.o.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC9241r32(this));
        cc.d(this);
        DownloadManagerService i2 = DownloadManagerService.i();
        N.MQ35Y$D$(i2.l(), i2, ProfileKey.a());
        this.F = activity.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807b0);
        EI2.b("NewTabPage.MobileIsUserOnline", NetworkChangeNotifier.b());
        EI2.h(!R44.a(profile).a("ntp_snippets.enable") ? 2 : !N.MpwNAobK() ? 3 : !R44.a(profile).a("ntp_snippets.list_visible") ? 1 : 0, 4, "ContentSuggestions.Feed.DisplayStatusOnOpen");
        I60 i60 = new I60(c9927t32.b, this.u.f, new RunnableC10678vF0(activity), "Suggestions");
        this.q = i60;
        windowAndroid.A.a(i60);
        final NewTabPageLayout newTabPageLayout = this.v;
        boolean z3 = this.y;
        boolean e = IG3.a().e();
        C12075zK0 c12075zK02 = this.u;
        SK0 sk0 = c12075zK02.f;
        QZ3 qz3 = c12075zK02.n;
        boolean isIncognito = tab.isIncognito();
        newTabPageLayout.getClass();
        TraceEvent.b("NewTabPageLayout.initialize()", null);
        newTabPageLayout.I = sk0;
        newTabPageLayout.q = c9927t32;
        newTabPageLayout.r = activity;
        newTabPageLayout.t = qz3;
        newTabPageLayout.f11525J = r32;
        newTabPageLayout.F = isIncognito;
        newTabPageLayout.G = windowAndroid;
        Profile d = Profile.d();
        newTabPageLayout.i = (LogoView) newTabPageLayout.findViewById(R.id.search_provider_logo);
        newTabPageLayout.s = new C11037wI1(newTabPageLayout.u.b(new Callback() { // from class: z32
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ((AbstractC11219wp3) NewTabPageLayout.this.q).c.b((LoadUrlParams) obj, false);
            }
        }), newTabPageLayout.i, d);
        C10780vZ2 c10780vZ2 = new C10780vZ2(newTabPageLayout.getContext(), newTabPageLayout);
        newTabPageLayout.j = c10780vZ2;
        boolean z4 = newTabPageLayout.F;
        WindowAndroid windowAndroid2 = newTabPageLayout.G;
        AZ2 az2 = c10780vZ2.c;
        az2.j = i5;
        i5.b(az2);
        if (az2.j.m) {
            az2.U();
        }
        c10780vZ2.d = z4;
        c10780vZ2.e = windowAndroid2;
        if (!DeviceFormFactor.a(activity)) {
            newTabPageLayout.H = newTabPageLayout.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080616);
        }
        boolean f = newTabPageLayout.f();
        if (e && AbstractC9999tG2.d()) {
            int i3 = (int) ((r3.c.y / AbstractC1895Op0.b(newTabPageLayout.getContext()).d) + 0.5f);
            C7928nE c7928nE = UN.a;
            i = N.M37SqSAy("QueryTiles", i3 < N.M37SqSAy("QueryTiles", "small_screen_height_threshold_dp", 700) ? "most_visited_max_rows_small_screen" : "most_visited_max_rows_normal_screen", 1);
        } else {
            i = 2;
        }
        C4941eZ1 c4941eZ1 = new C4941eZ1(newTabPageLayout.r, i5, newTabPageLayout.m, newTabPageLayout.G, false, f, i, 4, new Runnable() { // from class: E32
            @Override // java.lang.Runnable
            public final void run() {
                NewTabPageLayout.this.E = true;
            }
        }, new Runnable() { // from class: F32
            @Override // java.lang.Runnable
            public final void run() {
                NewTabPageLayout newTabPageLayout2 = NewTabPageLayout.this;
                if (newTabPageLayout2.B == 1.0f) {
                    newTabPageLayout2.D = true;
                }
            }
        });
        newTabPageLayout.n = c4941eZ1;
        c4941eZ1.b(newTabPageLayout.q, c10270u32, sk0);
        if (N.MwBQ$0Eq() == 1) {
            new C5528gF0(newTabPageLayout.o, d, ((AbstractC11219wp3) newTabPageLayout.q).b);
        }
        newTabPageLayout.findViewById(R.id.search_box).setBackgroundTintList(ColorStateList.valueOf(AbstractC11746yN.c(newTabPageLayout.getContext(), R.dimen.0_resource_name_obfuscated_res_0x7f080811)));
        TraceEvent.b("NewTabPageLayout.initializeSearchBoxTextView()", null);
        C10780vZ2 c10780vZ22 = newTabPageLayout.j;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: H32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((C9927t32) NewTabPageLayout.this.q).b(null, false);
            }
        };
        AZ2 az22 = c10780vZ22.c;
        az22.getClass();
        az22.g.o(BZ2.l, new ViewOnClickListenerC12152zZ2(onClickListener));
        newTabPageLayout.j.a.o(BZ2.m, new L32(newTabPageLayout));
        TraceEvent.c("NewTabPageLayout.initializeSearchBoxTextView()");
        TraceEvent.b("NewTabPageLayout.initializeVoiceSearchButton()", null);
        newTabPageLayout.j.b(new View.OnClickListener() { // from class: G32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((C9927t32) NewTabPageLayout.this.q).b(null, true);
            }
        });
        newTabPageLayout.m();
        TraceEvent.c("NewTabPageLayout.initializeVoiceSearchButton()");
        TraceEvent.b("NewTabPageLayout.initializeLensButton()", null);
        newTabPageLayout.j.a(new View.OnClickListener() { // from class: J32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = NewTabPageLayout.K;
                NewTabPageLayout newTabPageLayout2 = NewTabPageLayout.this;
                newTabPageLayout2.getClass();
                AbstractC1427Kz1.a(4);
                C10780vZ2 c10780vZ23 = newTabPageLayout2.j;
                WindowAndroid windowAndroid3 = c10780vZ23.e;
                boolean z5 = c10780vZ23.d;
                c10780vZ23.c.getClass();
                C0257Bz1 c0257Bz1 = C0257Bz1.b;
                Uri uri = Uri.EMPTY;
                C1297Jz1 c1297Jz1 = new C1297Jz1();
                c1297Jz1.e = z5;
                c1297Jz1.i = 4;
                c1297Jz1.f = 0;
                c1297Jz1.g = null;
                c1297Jz1.h = 0;
                if (!uri.equals(uri)) {
                    c1297Jz1.a = uri;
                }
                c0257Bz1.a.a(windowAndroid3, c1297Jz1);
            }
        });
        newTabPageLayout.m();
        TraceEvent.c("NewTabPageLayout.initializeLensButton()");
        TraceEvent.b("NewTabPageLayout.initializeLayoutChangeListener()", null);
        newTabPageLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: I32
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                int i13 = i12 - i10;
                int i14 = i8 - i6;
                NewTabPageLayout newTabPageLayout2 = NewTabPageLayout.this;
                if (i13 != i14 || newTabPageLayout2.D) {
                    newTabPageLayout2.D = false;
                    newTabPageLayout2.k();
                    newTabPageLayout2.n();
                    ((SK0) newTabPageLayout2.I).q();
                }
            }
        });
        TraceEvent.c("NewTabPageLayout.initializeLayoutChangeListener()");
        newTabPageLayout.l(z3, e);
        LogoView logoView = newTabPageLayout.i;
        if (!logoView.a()) {
            logoView.a = null;
            logoView.invalidate();
            logoView.q.e();
        }
        if (e && AbstractC9999tG2.d()) {
            ViewGroup viewGroup = (ViewGroup) newTabPageLayout.findViewById(R.id.query_tiles);
            final N32 n32 = newTabPageLayout.q;
            Objects.requireNonNull(n32);
            newTabPageLayout.k = new C9656sG2(viewGroup, d, new Callback() { // from class: A32
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C9313rG2 c9313rG2 = (C9313rG2) obj;
                    InterfaceC5991hc2 interfaceC5991hc2 = ((C9927t32) N32.this).f.z;
                    if (interfaceC5991hc2 == null) {
                        return;
                    }
                    ((g) interfaceC5991hc2).R(c9313rG2.a, c9313rG2.b);
                }
            });
        }
        VrModuleProvider.f(newTabPageLayout);
        if (VrModuleProvider.b().a()) {
            newTabPageLayout.b();
        }
        c9927t32.a.add(new InterfaceC0316Cl0() { // from class: B32
            @Override // defpackage.InterfaceC0316Cl0
            public final void onDestroy() {
                NewTabPageLayout newTabPageLayout2 = NewTabPageLayout.this;
                C4496dF c4496dF = newTabPageLayout2.u;
                if (c4496dF != null) {
                    c4496dF.a();
                    newTabPageLayout2.u = null;
                }
                VrModuleProvider.g(newTabPageLayout2);
                LogoView logoView2 = newTabPageLayout2.i;
                if (logoView2 != null) {
                    ObjectAnimator objectAnimator = logoView2.i;
                    if (objectAnimator != null) {
                        objectAnimator.end();
                        logoView2.i = null;
                    }
                    logoView2.q.b();
                }
                C11037wI1 c11037wI1 = newTabPageLayout2.s;
                if (c11037wI1 != null) {
                    c11037wI1.a();
                }
                newTabPageLayout2.j.c.onDestroy();
                C4941eZ1 c4941eZ12 = newTabPageLayout2.n;
                if (c4941eZ12 != null) {
                    c4941eZ12.a();
                    newTabPageLayout2.n = null;
                }
            }
        });
        newTabPageLayout.A = true;
        TraceEvent.c("NewTabPageLayout.initialize()");
        TraceEvent.c("NewTabPage");
    }

    public final void z() {
        View a = a();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        JC jc = this.p;
        int i = (((CC) jc).m - this.F) + (((CC) jc).t - ((CC) jc).m);
        int e = ((CC) jc).o - ((CC) jc).e();
        if (i != marginLayoutParams.topMargin || e != marginLayoutParams.bottomMargin) {
            marginLayoutParams.topMargin = i;
            marginLayoutParams.bottomMargin = e;
            a.setLayoutParams(marginLayoutParams);
        }
        ((ViewGroup.MarginLayoutParams) this.v.i.getLayoutParams()).topMargin = j(true);
        ((ViewGroup.MarginLayoutParams) this.v.i.getLayoutParams()).bottomMargin = j(false);
    }

    @Override // defpackage.HG3
    public final void x() {
        boolean b = IG3.a().b();
        this.y = b;
        this.v.l(b, IG3.a().e());
        this.v.h();
        z();
    }

    @Override // defpackage.InterfaceC5451g12
    public final void s() {
        OJ0 oj0 = this.u.I;
        if (oj0 != null) {
            oj0.a(23, false);
        }
    }

    @Override // defpackage.Qf4
    public final void u() {
        this.v.m();
    }

    public final void y() {
        this.j.b(3);
        EI2.k((System.nanoTime() - this.C) / 1000000, "NewTabPage.TimeSpent");
        FI2.a("Suggestions.SurfaceHidden");
        AbstractC9664sI0.c(5);
    }

    @Override // defpackage.InterfaceC5451g12
    public final void destroy() {
        boolean z = this.D;
        Tab tab = this.a;
        if (z && !tab.isHidden()) {
            y();
        }
        this.m.a();
        this.n.c();
        IG3.a().h(this);
        tab.w(this.w);
        this.w = null;
        this.h.c(this.x);
        this.x = null;
        ((CC) this.p).g(this);
        OJ0 oj0 = this.u.I;
        InterfaceC5991hc2 interfaceC5991hc2 = this.z;
        if (interfaceC5991hc2 != null && oj0 != null) {
            ((g) interfaceC5991hc2).U(oj0);
        }
        this.u.b();
        tab.m().A.d(this.q);
        Vf4 vf4 = this.A;
        if (vf4 != null) {
            vf4.f.d(this);
        }
        C7164l03 c7164l03 = this.H;
        if (c7164l03 != null) {
            C8539p03 c8539p03 = c7164l03.a;
            AutocompleteController autocompleteController = c8539p03.l;
            if (autocompleteController != null) {
                autocompleteController.a.remove(c8539p03);
            }
            SearchResumptionModuleView searchResumptionModuleView = c8539p03.q;
            if (searchResumptionModuleView != null) {
                SearchResumptionTileContainerView searchResumptionTileContainerView = searchResumptionModuleView.h;
                for (int i = 0; i < searchResumptionTileContainerView.getChildCount(); i++) {
                    ((SearchResumptionTileView) searchResumptionTileContainerView.getChildAt(i)).setOnClickListener(null);
                }
                searchResumptionTileContainerView.removeAllViews();
            }
            SearchResumptionModuleBridge searchResumptionModuleBridge = c8539p03.r;
            if (searchResumptionModuleBridge != null) {
                long j = searchResumptionModuleBridge.a;
                if (j != 0) {
                    N.MJ0smVoV(j, searchResumptionModuleBridge);
                    searchResumptionModuleBridge.a = 0L;
                }
            }
            IG3.a().h(new C7508m03(c8539p03));
            c8539p03.j.f(c8539p03);
            c8539p03.k.l(c8539p03);
            c7164l03.b.a = null;
        }
        this.E = true;
    }

    @Override // defpackage.InterfaceC5451g12
    public final String getTitle() {
        return this.i;
    }

    @Override // defpackage.InterfaceC5451g12
    public final int t() {
        return this.l;
    }

    @Override // defpackage.InterfaceC5451g12
    public final int p(int i) {
        if (!v()) {
            return i;
        }
        boolean z = this.v.e() == 1.0f;
        Activity activity = this.k;
        if (z) {
            return AbstractC11746yN.c(activity, R.dimen.0_resource_name_obfuscated_res_0x7f080811);
        }
        return AbstractC11746yN.b(activity, false);
    }

    @Override // defpackage.InterfaceC5451g12
    public final int m(int i) {
        return v() ? this.l : i;
    }

    @Override // defpackage.InterfaceC5451g12
    public final float o(float f) {
        if (v()) {
            return 0.0f;
        }
        return f;
    }

    @Override // defpackage.InterfaceC5451g12
    public final View a() {
        return this.u.o;
    }

    @Override // defpackage.InterfaceC5451g12
    public final void c() {
        C12075zK0 c12075zK0 = this.u;
        c12075zK0.getClass();
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("FeedInteractiveRefresh")) {
            c12075zK0.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.InterfaceC2296Rr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            r6 = this;
            org.chromium.chrome.browser.ntp.NewTabPageLayout r0 = r6.v
            boolean r0 = r0.E
            r1 = 1
            if (r0 != 0) goto L36
            zK0 r0 = r6.u
            SK0 r0 = r0.f
            boolean r2 = r0.w
            r3 = 0
            if (r2 != 0) goto L31
            zK0 r2 = r0.a
            wK0 r4 = r2.o
            int r4 = r4.getWidth()
            int r5 = r0.x
            if (r4 != r5) goto L31
            wK0 r2 = r2.o
            int r2 = r2.getHeight()
            int r4 = r0.y
            if (r2 != r4) goto L31
            int r2 = r0.i()
            int r0 = r0.z
            if (r2 == r0) goto L2f
            goto L31
        L2f:
            r0 = r3
            goto L32
        L31:
            r0 = r1
        L32:
            if (r0 == 0) goto L35
            goto L36
        L35:
            r1 = r3
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10613v32.f():boolean");
    }

    @Override // defpackage.InterfaceC2296Rr1
    public final void g(Canvas canvas) {
        NewTabPageLayout newTabPageLayout = this.v;
        LogoView logoView = newTabPageLayout.i;
        ObjectAnimator objectAnimator = logoView.i;
        if (objectAnimator != null) {
            objectAnimator.end();
            logoView.i = null;
        }
        newTabPageLayout.E = false;
        C12075zK0 c12075zK0 = this.u;
        C11046wK0 c11046wK0 = c12075zK0.o;
        Ge4.e(c11046wK0);
        c11046wK0.draw(canvas);
        SK0 sk0 = c12075zK0.f;
        C12075zK0 c12075zK02 = sk0.a;
        sk0.x = c12075zK02.o.getWidth();
        sk0.y = c12075zK02.o.getHeight();
        sk0.z = sk0.i();
        sk0.w = false;
    }

    @Override // defpackage.AK0
    public final BK0 d(Activity activity, C12075zK0 c12075zK0) {
        return new C6181i82(activity, this.a, c12075zK0);
    }

    @Override // defpackage.AK0
    public final boolean h(MotionEvent motionEvent) {
        InterfaceC5991hc2 interfaceC5991hc2;
        Tab tab = this.a;
        return (tab == null || !DeviceFormFactor.b(tab.m())) && (interfaceC5991hc2 = this.z) != null && ((g) interfaceC5991hc2).M;
    }

    public final int j(boolean z) {
        if (MJ0.b() && this.y) {
            return 0;
        }
        if (z) {
            return this.v.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080615);
        }
        return this.v.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080614);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(org.chromium.chrome.browser.profiles.Profile r13) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10613v32.w(org.chromium.chrome.browser.profiles.Profile):void");
    }
}
