package org.chromium.chrome.browser.searchwidget;

import android.R;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.AbstractActivityC7416ll;
import defpackage.AbstractC10615v34;
import defpackage.AbstractC2281Ro1;
import defpackage.Al4;
import defpackage.C0538Ed2;
import defpackage.C10285u6;
import defpackage.C11123wZ2;
import defpackage.C1271Ju0;
import defpackage.C1449Ld3;
import defpackage.C3353Zu3;
import defpackage.C4959ec2;
import defpackage.C4998ej;
import defpackage.C5630gZ2;
import defpackage.C5809h34;
import defpackage.C6153i34;
import defpackage.C6660jZ2;
import defpackage.C7348lZ2;
import defpackage.C8036nZ2;
import defpackage.C8385oa2;
import defpackage.C8723pZ2;
import defpackage.C8820pp4;
import defpackage.C9626sA2;
import defpackage.C9778se0;
import defpackage.C9861ss;
import defpackage.FI2;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC0809Gf3;
import defpackage.InterfaceC10272u34;
import defpackage.InterfaceC1068If2;
import defpackage.InterfaceC3173Yk3;
import defpackage.InterfaceC6114hx;
import defpackage.InterfaceC6564jG1;
import defpackage.InterfaceC6908kG1;
import defpackage.InterfaceC7114ks;
import defpackage.QZ2;
import defpackage.Vf4;
import defpackage.ViewOnClickListenerC1069If3;
import defpackage.ViewOnClickListenerC8380oZ2;
import defpackage.ZX1;
import defpackage.ZY2;
import java.lang.ref.WeakReference;
import org.chromium.base.Callback;
import org.chromium.base.SysUtils;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.chrome.browser.locale.LocaleManager;
import org.chromium.chrome.browser.omnibox.a;
import org.chromium.chrome.browser.omnibox.g;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.searchwidget.SearchActivity;
import org.chromium.chrome.browser.searchwidget.SearchActivityLocationBarLayout;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SearchActivity extends AbstractActivityC7416ll implements InterfaceC0809Gf3, InterfaceC7114ks, InterfaceC10272u34 {
    public static final Object f0 = new Object();
    public static C8723pZ2 g0;
    public ViewGroup T;
    public boolean U;
    public String V;
    public int W;
    public String X;
    public byte[] Y;
    public SearchActivityLocationBarLayout Z;
    public a a0;
    public ViewOnClickListenerC1069If3 b0;
    public C11123wZ2 c0;
    public TabImpl d0;
    public final C8385oa2 e0 = new C8385oa2();

    @Override // defpackage.InterfaceC10272u34
    public final /* synthetic */ void L(boolean z) {
    }

    @Override // defpackage.LC
    public final boolean o() {
        return true;
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final boolean C0(Intent intent) {
        R0().getClass();
        return true;
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final C10285u6 v0() {
        return new C7348lZ2(this, this, new C1449Ld3(new WeakReference(this)), this.F);
    }

    @Override // defpackage.LM
    public final ZX1 p0() {
        return new ZX1(new C4998ej(this));
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.LC
    public final void l() {
        super.l();
        C8036nZ2 c8036nZ2 = new C8036nZ2();
        WebContents a = Al4.a(Profile.d(), false);
        C3353Zu3 c3353Zu3 = new C3353Zu3();
        c3353Zu3.e = this.H;
        c3353Zu3.b(1);
        c3353Zu3.i = a;
        c3353Zu3.j = c8036nZ2;
        TabImpl a2 = c3353Zu3.a();
        this.d0 = a2;
        a2.d(new LoadUrlParams("about:blank", 0));
        this.c0.c = this.d0;
        this.e0.p(Profile.b(a));
        Callback callback = new Callback() { // from class: aZ2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Boolean bool = (Boolean) obj;
                Object obj2 = SearchActivity.f0;
                final SearchActivity searchActivity = SearchActivity.this;
                if (searchActivity.m()) {
                    return;
                }
                if (bool == null || !bool.booleanValue()) {
                    AbstractC4851eH1.a("searchwidget", "User failed to select a default search engine.", new Object[0]);
                    searchActivity.finish();
                } else {
                    searchActivity.B.post(new Runnable() { // from class: bZ2
                        @Override // java.lang.Runnable
                        public final void run() {
                            SearchActivity searchActivity2 = SearchActivity.this;
                            searchActivity2.U = true;
                            String str = searchActivity2.V;
                            if (str != null) {
                                searchActivity2.T0(str, searchActivity2.W, searchActivity2.X, searchActivity2.Y);
                            }
                            CustomTabsConnection.g().A();
                            Vf4 b = searchActivity2.a0.b();
                            int S0 = SearchActivity.S0(searchActivity2.getIntent().getAction());
                            if (AbstractC2281Ro1.j(searchActivity2.getIntent(), "org.chromium.chrome.browser.ui.searchactivityutils.FROM_QUICK_ACTION_SEARCH_WIDGET", false)) {
                                if (S0 == 1) {
                                    FI2.a("QuickActionSearchWidget.VoiceQuery");
                                } else if (S0 == 2) {
                                    FI2.a("QuickActionSearchWidget.LensQuery");
                                } else if (S0 == 0) {
                                    FI2.a("QuickActionSearchWidget.TextQuery");
                                }
                            }
                            SearchActivityLocationBarLayout searchActivityLocationBarLayout = searchActivity2.Z;
                            C10285u6 c10285u6 = searchActivity2.H;
                            C1245Jp c1245Jp = searchActivityLocationBarLayout.k.i;
                            c1245Jp.getClass();
                            c1245Jp.i(new RunnableC0335Cp(c1245Jp), -1L);
                            C10094tZ2.f(searchActivityLocationBarLayout.getContext(), c10285u6);
                            searchActivityLocationBarLayout.q = false;
                            searchActivityLocationBarLayout.k.i.G = false;
                            String a3 = searchActivityLocationBarLayout.j.a();
                            if (!TextUtils.isEmpty(a3)) {
                                searchActivityLocationBarLayout.k.a(searchActivityLocationBarLayout.j.b(), a3);
                            }
                            if (searchActivityLocationBarLayout.r) {
                                searchActivityLocationBarLayout.f(S0, b, c10285u6);
                                searchActivityLocationBarLayout.r = false;
                            }
                            FI2.a("SearchWidget.WidgetSelected");
                            SearchActivity.R0().getClass();
                        }
                    });
                }
            }
        };
        R0().getClass();
        LocaleManager.getInstance().c(this, callback);
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final View z0() {
        return this.Z;
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.c0.b = AbstractC2281Ro1.j(getIntent(), "org.chromium.chrome.browser.ui.searchactivityutils.FROM_QUICK_ACTION_SEARCH_WIDGET", false);
        Q0();
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.VS0, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.a0.o.Z(null, 12, false);
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.VS0, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.Z.g();
    }

    @Override // defpackage.InterfaceC0809Gf3
    public final ViewOnClickListenerC1069If3 z() {
        return this.b0;
    }

    public static int S0(String str) {
        if (TextUtils.equals(str, "org.chromium.chrome.browser.ui.searchactivityutils.ACTION_START_VOICE_SEARCH") || TextUtils.equals(str, "org.chromium.chrome.browser.ui.searchactivityutils.ACTION_START_EXTENDED_VOICE_SEARCH")) {
            return 1;
        }
        return TextUtils.equals(str, "org.chromium.chrome.browser.ui.searchactivityutils.ACTION_START_LENS_SEARCH") ? 2 : 0;
    }

    public final void Q0() {
        int S0 = S0(getIntent().getAction());
        if (AbstractC2281Ro1.j(getIntent(), "org.chromium.chrome.browser.ui.searchactivityutils.FROM_QUICK_ACTION_SEARCH_WIDGET", false)) {
            if (S0 == 1) {
                FI2.a("QuickActionSearchWidget.VoiceQuery");
            } else if (S0 == 2) {
                FI2.a("QuickActionSearchWidget.LensQuery");
            } else if (S0 == 0) {
                FI2.a("QuickActionSearchWidget.TextQuery");
            }
        }
        SearchActivityLocationBarLayout searchActivityLocationBarLayout = this.Z;
        String w = AbstractC2281Ro1.w(getIntent(), "query");
        Vf4 b = this.a0.b();
        C10285u6 c10285u6 = this.H;
        C5809h34 c5809h34 = searchActivityLocationBarLayout.j;
        if (w == null) {
            w = "";
        }
        c5809h34.f(C6153i34.b(w), 0, 0);
        if (searchActivityLocationBarLayout.q || (S0 != 0 && !searchActivityLocationBarLayout.n)) {
            searchActivityLocationBarLayout.r = true;
        } else {
            searchActivityLocationBarLayout.f(S0, b, c10285u6);
        }
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.LM, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        g gVar;
        TabImpl tabImpl = this.d0;
        if (tabImpl != null && tabImpl.isInitialized()) {
            this.d0.destroy();
        }
        a aVar = this.a0;
        if (aVar != null && (gVar = aVar.o) != null) {
            gVar.U(this);
            this.a0.destroy();
            this.a0 = null;
        }
        this.B.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // defpackage.InterfaceC10272u34
    public final void d(boolean z) {
        if (z) {
            this.a0.o.b0(false);
        }
    }

    public final void T0(String str, int i, String str2, byte[] bArr) {
        Intent intent;
        if (!this.U) {
            this.V = str;
            this.W = i;
            this.X = str2;
            this.Y = bArr;
            return;
        }
        if (TextUtils.isEmpty(str)) {
            intent = null;
        } else {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(AbstractC10615v34.a(str).j()));
            intent2.setFlags(268959744);
            intent2.setClass(this, ChromeLauncherActivity.class);
            if (!TextUtils.isEmpty(str2) && bArr != null && bArr.length != 0) {
                intent2.putExtra("com.android.chrome.post_data_type", str2);
                intent2.putExtra("com.android.chrome.post_data", bArr);
            }
            if (AbstractC2281Ro1.j(getIntent(), "org.chromium.chrome.browser.searchwidget.FROM_SEARCH_WIDGET", false)) {
                intent2.putExtra("org.chromium.chrome.browser.searchwidget.FROM_SEARCH_WIDGET", true);
            }
            intent2.putExtra("org.chromium.chrome.browser.searchwidget.FROM_SEARCH_ACTIVITY", true);
            AbstractC2281Ro1.a(intent2);
            intent = intent2;
        }
        if (intent == null) {
            return;
        }
        Bundle bundle = ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out).toBundle();
        ComponentName componentName = AbstractC2281Ro1.a;
        try {
            startActivity(intent, bundle);
        } catch (ActivityNotFoundException unused) {
        }
        FI2.a("SearchWidget.SearchMade");
        LocaleManager.getInstance().b(str, i, true);
        finish();
    }

    @Override // defpackage.InterfaceC7114ks
    public final boolean k() {
        finish();
        overridePendingTransition(0, com.android.chrome.R.anim.0_resource_name_obfuscated_res_0x7f02000d);
        return true;
    }

    public static C8723pZ2 R0() {
        synchronized (f0) {
            if (g0 == null) {
                g0 = new C8723pZ2();
            }
        }
        return g0;
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final void P0() {
        C9861ss c9861ss;
        if (!SysUtils.isLowEndDevice()) {
            getWindow().addFlags(16777216);
            this.S = true;
        }
        this.b0 = new ViewOnClickListenerC1069If3(this, (ViewGroup) findViewById(R.id.content), null);
        C11123wZ2 c11123wZ2 = new C11123wZ2(this);
        this.c0 = c11123wZ2;
        c11123wZ2.b = AbstractC2281Ro1.j(getIntent(), "org.chromium.chrome.browser.ui.searchactivityutils.FROM_QUICK_ACTION_SEARCH_WIDGET", false);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this).inflate(com.android.chrome.R.layout.0_resource_name_obfuscated_res_0x7f0e0256, (ViewGroup) null, false);
        viewGroup.setOnClickListener(new ViewOnClickListenerC8380oZ2(this));
        this.T = viewGroup;
        setContentView(viewGroup);
        this.Z = (SearchActivityLocationBarLayout) this.T.findViewById(com.android.chrome.R.id.search_location_bar);
        View findViewById = this.T.findViewById(com.android.chrome.R.id.toolbar);
        InterfaceC1068If2 interfaceC1068If2 = new InterfaceC1068If2() { // from class: YY2
            @Override // defpackage.InterfaceC1068If2
            public final boolean a(String str, int i, String str2, byte[] bArr, boolean z) {
                Object obj = SearchActivity.f0;
                SearchActivity.this.T0(str, i, str2, bArr);
                return true;
            }
        };
        if (C9861ss.b()) {
            C9861ss c9861ss2 = new C9861ss();
            this.l.a(this, c9861ss2.a);
            c9861ss = c9861ss2;
        } else {
            c9861ss = null;
        }
        SearchActivityLocationBarLayout searchActivityLocationBarLayout = this.Z;
        C8385oa2 c8385oa2 = this.e0;
        C9626sA2.g();
        C11123wZ2 c11123wZ22 = this.c0;
        C8820pp4 c8820pp4 = new C8820pp4(getWindow());
        C10285u6 c10285u6 = this.H;
        InterfaceC0079Ap3 interfaceC0079Ap3 = new InterfaceC0079Ap3() { // from class: dZ2
            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                Object obj = SearchActivity.f0;
                return null;
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }
        };
        C8385oa2 c8385oa22 = this.y;
        a aVar = new a(searchActivityLocationBarLayout, findViewById, c8385oa2, c11123wZ22, null, c8820pp4, c10285u6, interfaceC0079Ap3, c8385oa22, null, null, this.D, interfaceC1068If2, this, QZ2.a(), new Runnable() { // from class: eZ2
            @Override // java.lang.Runnable
            public final void run() {
                Object obj = SearchActivity.f0;
            }
        }, new InterfaceC3173Yk3() { // from class: fZ2
            @Override // defpackage.InterfaceC3173Yk3
            public final void a(Tab tab, XO xo) {
                Object obj = SearchActivity.f0;
            }
        }, new C5630gZ2(), new InterfaceC6908kG1() { // from class: hZ2
            @Override // defpackage.InterfaceC6908kG1
            public final boolean a(Tab tab) {
                Object obj = SearchActivity.f0;
                return false;
            }
        }, new InterfaceC6564jG1() { // from class: iZ2
            @Override // defpackage.InterfaceC6564jG1
            public final void a(int i, String str) {
                Object obj = SearchActivity.f0;
            }
        }, new C6660jZ2(), new InterfaceC6114hx() { // from class: kZ2
            @Override // defpackage.InterfaceC6114hx
            public final boolean a(GURL gurl) {
                Object obj = SearchActivity.f0;
                return false;
            }
        }, new ZY2(), new C1271Ju0(), null, new C4959ec2(this, new C0538Ed2(), c8385oa22), null, new C9778se0(), c9861ss);
        this.a0 = aVar;
        aVar.t(true);
        g gVar = this.a0.o;
        gVar.f11527J = true;
        gVar.d(this);
        Q0();
        R0().getClass();
        this.B.post(new Runnable() { // from class: cZ2
            @Override // java.lang.Runnable
            public final void run() {
                SearchActivity searchActivity = SearchActivity.this;
                searchActivity.P = false;
                boolean M0 = searchActivity.M0();
                Y02 y02 = searchActivity.C;
                y02.b(M0);
                if (searchActivity.Q) {
                    TraceEvent.f("onFirstDrawComplete");
                    y02.g = true;
                    y02.a();
                }
            }
        });
        F0();
    }
}
