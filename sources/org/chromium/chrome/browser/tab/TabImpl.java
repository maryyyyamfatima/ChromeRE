package org.chromium.chrome.browser.tab;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.android.chrome.R;
import defpackage.AbstractC10615v34;
import defpackage.AbstractC1741Nk1;
import defpackage.AbstractC2217Rb2;
import defpackage.AbstractC2290Rq0;
import defpackage.AbstractC4368cs2;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC5475g52;
import defpackage.AbstractC6265iP;
import defpackage.AbstractC6832k23;
import defpackage.AbstractC7239lD3;
import defpackage.AbstractC7836mx3;
import defpackage.AbstractC9894sx3;
import defpackage.AbstractC9942t6;
import defpackage.Al4;
import defpackage.BA0;
import defpackage.C10021tL;
import defpackage.C10554ut0;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C1436Lb0;
import defpackage.C1695Nb0;
import defpackage.C1827Ob2;
import defpackage.C3038Xj3;
import defpackage.C4833eD3;
import defpackage.C5008ek3;
import defpackage.C5352fk3;
import defpackage.C5696gk3;
import defpackage.C5795h12;
import defpackage.C6040hk3;
import defpackage.C6047hl4;
import defpackage.C6844k43;
import defpackage.C7824mv3;
import defpackage.C7884n6;
import defpackage.C8180nx3;
import defpackage.C8385oa2;
import defpackage.C8957qD3;
import defpackage.C9642sD3;
import defpackage.CC;
import defpackage.EC;
import defpackage.EI2;
import defpackage.FI2;
import defpackage.FU0;
import defpackage.GE1;
import defpackage.Gl4;
import defpackage.IA3;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC11941yv3;
import defpackage.InterfaceC1818Nz3;
import defpackage.InterfaceC5451g12;
import defpackage.InterfaceC7697ma2;
import defpackage.InterfaceC9985tD3;
import defpackage.J44;
import defpackage.K14;
import defpackage.K44;
import defpackage.Pj4;
import defpackage.Q50;
import defpackage.UN;
import defpackage.V60;
import defpackage.ViewOnAttachStateChangeListenerC9551rx3;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.metrics.PageLoadMetrics;
import org.chromium.chrome.browser.metrics.UmaUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.chrome.browser.vr.VrModuleProvider;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TabImpl implements Tab, InterfaceC1818Nz3 {
    public boolean A;
    public boolean B;
    public InterfaceC11941yv3 C;
    public final ViewOnAttachStateChangeListenerC9551rx3 D;
    public boolean E;
    public boolean F;
    public boolean H;
    public final C8385oa2 I;

    /* renamed from: J */
    public int f11528J;
    public final boolean K;
    public long a;
    public final int g;
    public final boolean h;
    public final ContextThemeWrapper i;
    public WindowAndroid j;
    public InterfaceC5451g12 k;
    public WebContents l;
    public Q50 m;
    public View n;
    public final C9642sD3 o;
    public TabWebContentsDelegateAndroidImpl q;
    public boolean r;
    public boolean s;
    public final Integer t;
    public Integer u;
    public LoadUrlParams v;
    public boolean w;
    public boolean x;
    public final C12157za2 p = new C12157za2();
    public boolean y = true;
    public int z = 0;
    public final K44 G = new K44();

    /* JADX WARN: Type inference failed for: r2v3, types: [qx3] */
    public TabImpl(int i, boolean z, Integer num, C6844k43 c6844k43) {
        TabImpl tabImpl;
        C8385oa2 c8385oa2 = new C8385oa2();
        this.I = c8385oa2;
        c8385oa2.p(Boolean.FALSE);
        C8180nx3 a = C8180nx3.a();
        AtomicInteger atomicInteger = a.a;
        int andIncrement = i == -1 ? atomicInteger.getAndIncrement() : i;
        int i2 = (andIncrement + 1) - atomicInteger.get();
        if (i2 >= 0) {
            atomicInteger.addAndGet(i2);
            a.b.q(atomicInteger.get(), "org.chromium.chrome.browser.tab.TabIdManager.NEXT_ID");
        }
        this.g = andIncrement;
        this.h = z;
        C1436Lb0 c1436Lb0 = C1695Nb0.B;
        if ((c6844k43 == null) || !UN.r.a()) {
            tabImpl = this;
        } else {
            if (AbstractC4368cs2.d(this, C1695Nb0.class) == null) {
                K44 F = F();
                Gl4 gl4 = c6844k43.d;
                String MNZ4eg9q = N.MNZ4eg9q(gl4.a, gl4.b);
                Gl4 gl42 = c6844k43.d;
            }
            tabImpl = this;
            tabImpl.K = true;
        }
        tabImpl.i = AbstractC5475g52.a(AbstractC9942t6.b(), V60.a, false);
        tabImpl.t = num;
        tabImpl.D = new ViewOnAttachStateChangeListenerC9551rx3(tabImpl);
        tabImpl.o = new C9642sD3(tabImpl);
        new C4833eD3(new Callback() { // from class: qx3
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                TabImpl.this.b0(((Integer) obj).intValue());
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        }, tabImpl);
        tabImpl.f11528J = 0;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final void v(BA0 ba0) {
        this.p.a(ba0);
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final void w(BA0 ba0) {
        this.p.d(ba0);
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final K44 F() {
        return this.G;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final void D() {
        if (this.l != null) {
            Y(3);
            this.l.i().t();
        }
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final boolean H() {
        int a = AbstractC6832k23.a(this.l);
        return this.s || !(a == 5 || a == 4);
    }

    public final int J() {
        boolean MJSt3Ocq;
        WebContents webContents = this.l;
        int i = 0;
        boolean z = webContents != null && webContents.i().m();
        int i2 = C1695Nb0.m(this).z;
        WebContents webContents2 = this.l;
        boolean z2 = webContents2 != null && webContents2.i().m();
        if (webContents2 != null && i2 == 3) {
            i2 = z2 ? 2 : 0;
            C1695Nb0 m = C1695Nb0.m(this);
            if (m.z != i2) {
                m.z = i2;
                m.l();
            }
        }
        if (i2 == 0) {
            Profile b = AbstractC1741Nk1.b(this.j, isIncognito());
            if (N.Mudil8Bg("RequestDesktopSiteExceptions")) {
                if (webContents != null) {
                    GURL u = webContents.u();
                    if (N.MFhlM$PH(b, 74, u, u) == 1) {
                        MJSt3Ocq = true;
                    }
                }
                MJSt3Ocq = false;
            } else {
                MJSt3Ocq = N.MJSt3Ocq(b, 74);
            }
            if (MJSt3Ocq != z) {
                i = MJSt3Ocq ? 2 : 1;
            }
            EI2.b("Android.RequestDesktopSite.UseDesktopUserAgent", MJSt3Ocq);
            return i;
        }
        EI2.b("Android.RequestDesktopSite.UseDesktopUserAgent", z);
        return 0;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final WebContents b() {
        return this.l;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final void f() {
        WebContents webContents = this.l;
        if (webContents != null) {
            webContents.i().f();
        }
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final boolean g() {
        WebContents webContents = this.l;
        return webContents != null && webContents.i().g();
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final boolean h() {
        WebContents webContents = this.l;
        return webContents != null && webContents.i().h();
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final void i() {
        WebContents webContents = this.l;
        if (webContents != null) {
            webContents.i().i();
        }
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final boolean j() {
        WebContents webContents = this.l;
        return webContents != null && webContents.i().j();
    }

    public final ChromeActivity O() {
        WindowAndroid windowAndroid = this.j;
        if (windowAndroid == null) {
            return null;
        }
        Activity a = V60.a((Context) windowAndroid.j.get());
        if (a instanceof ChromeActivity) {
            return (ChromeActivity) a;
        }
        return null;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final Context getContext() {
        WindowAndroid windowAndroid = this.j;
        ContextThemeWrapper contextThemeWrapper = this.i;
        if (windowAndroid == null) {
            return contextThemeWrapper;
        }
        Context context = (Context) windowAndroid.j.get();
        return context == context.getApplicationContext() ? contextThemeWrapper : context;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final WindowAndroid m() {
        return this.j;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final Q50 y() {
        return this.m;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final View a() {
        View view = this.n;
        if (view != null) {
            return view;
        }
        InterfaceC5451g12 interfaceC5451g12 = this.k;
        return (interfaceC5451g12 == null || interfaceC5451g12.l()) ? this.m : this.k.a();
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final C9642sD3 q() {
        return this.o;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public int getId() {
        return this.g;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public GURL getUrl() {
        if (isInitialized()) {
            WebContents webContents = this.l;
            GURL u = webContents != null ? webContents.u() : GURL.emptyGURL();
            if (this.l != null || isNativePage() || !u.i().isEmpty()) {
                C1695Nb0.m(this).q(u);
            }
            if (C1695Nb0.m(this).p == null) {
                return GURL.emptyGURL();
            }
            return C1695Nb0.m(this).p;
        }
        return GURL.emptyGURL();
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final GURL z() {
        return AbstractC2290Rq0.a(getUrl());
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public String getTitle() {
        if (C1695Nb0.m(this).o == null) {
            c0();
        }
        return C1695Nb0.m(this).o;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final void c() {
        InterfaceC5451g12 interfaceC5451g12 = this.k;
        if (interfaceC5451g12 != null) {
            interfaceC5451g12.c();
            return;
        }
        if (!AbstractC2217Rb2.e(this)) {
            if (this.l == null) {
                return;
            }
            Y(2);
            this.l.i().c();
            return;
        }
        AbstractC2217Rb2.g(this.l, new C1827Ob2(this));
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final InterfaceC5451g12 x() {
        return this.k;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public boolean isNativePage() {
        return this.k != null;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final boolean u() {
        return this.n != null;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final void A() {
        InterfaceC5451g12 interfaceC5451g12 = this.k;
        if (interfaceC5451g12 == null || interfaceC5451g12.l() || this.k.a().getParent() != null) {
            return;
        }
        InterfaceC5451g12 interfaceC5451g122 = this.k;
        FU0 fu0 = new FU0(interfaceC5451g122);
        interfaceC5451g122.destroy();
        this.k = fu0;
        a0();
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public int getLaunchType() {
        return this.t.intValue();
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final int k() {
        return this.f11528J;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public boolean isIncognito() {
        return this.h;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final boolean n() {
        return this.s;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final boolean l() {
        return !isNativePage() && this.l == null;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public boolean isUserInteractable() {
        return this.E;
    }

    public final int U(LoadUrlParams loadUrlParams) {
        if (this.l == null) {
            return 0;
        }
        GURL a = AbstractC10615v34.a(loadUrlParams.a);
        if (!a.b) {
            return 0;
        }
        if (a.i().equals("chrome://history/")) {
            FI2.a("ShowHistory");
        }
        if (N.Magi68$J(a)) {
            return 1;
        }
        loadUrlParams.a = a.i();
        this.l.i().d(loadUrlParams);
        return 1;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final boolean C() {
        C5352fk3 c5352fk3;
        C6040hk3 c6040hk3;
        boolean z = false;
        if (O() == null) {
            AbstractC4851eH1.a("Tab", "Tab couldn't be loaded because Context was null.", new Object[0]);
            return false;
        }
        if (this.v != null) {
            WebContents d = Pj4.a().d(isIncognito(), isHidden(), isCustomTab());
            if (d == null) {
                d = Al4.a(AbstractC1741Nk1.b(this.j, isIncognito()), isHidden());
            }
            S(d);
            d(this.v);
            this.v = null;
            return true;
        }
        Y(1);
        if (l()) {
            WindowAndroid windowAndroid = this.j;
            K14 k14 = C5696gk3.k;
            InterfaceC7697ma2 interfaceC7697ma2 = (InterfaceC7697ma2) C5696gk3.k.e(windowAndroid.t);
            if (interfaceC7697ma2 != null && (c5352fk3 = (C5352fk3) ((C8385oa2) interfaceC7697ma2).g) != null && C5352fk3.f && (!C10021tL.f().c() || CachedFeatureFlags.b(AbstractC6265iP.d.b("PaintPreviewShowOnStartup:has_accessibility_support"), true))) {
                C5352fk3.f = false;
                GE1 ge1 = (GE1) c5352fk3.c.get();
                C3038Xj3 c3038Xj3 = new C3038Xj3(this, c5352fk3.b.g, new Runnable() { // from class: Yj3
                    public /* synthetic */ RunnableC3168Yj3() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        GE1 ge12 = GE1.this;
                        if (ge12 == null) {
                            return;
                        }
                        ME1 me1 = ge12.a.c;
                        me1.c = 0.0f;
                        ND2 nd2 = KE1.a;
                        PropertyModel propertyModel = me1.a;
                        propertyModel.m(nd2, 0);
                        propertyModel.l(KE1.b, me1.c);
                        me1.b.sendEmptyMessage(1);
                    }
                }, new Callback() { // from class: Zj3
                    public /* synthetic */ C3298Zj3() {
                    }

                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        Boolean bool = (Boolean) obj;
                        GE1 ge12 = GE1.this;
                        if (ge12 == null) {
                            return;
                        }
                        ge12.a.e = bool.booleanValue();
                    }
                });
                c3038Xj3.l = c5352fk3.a;
                c3038Xj3.m = new InterfaceC0079Ap3() { // from class: ak3
                    @Override // defpackage.InterfaceC0079Ap3
                    public final /* synthetic */ boolean i() {
                        return AbstractC12248zp3.a(this);
                    }

                    @Override // defpackage.InterfaceC0079Ap3
                    public final Object get() {
                        return Boolean.valueOf(UmaUtils.c() && !UmaUtils.b());
                    }
                };
                c3038Xj3.n = new InterfaceC0079Ap3() { // from class: bk3
                    @Override // defpackage.InterfaceC0079Ap3
                    public final /* synthetic */ boolean i() {
                        return AbstractC12248zp3.a(this);
                    }

                    @Override // defpackage.InterfaceC0079Ap3
                    public final Object get() {
                        return Boolean.valueOf(AbstractC2217Rb2.e(Tab.this));
                    }
                };
                Iterator it = c5352fk3.d.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    boolean hasNext = c11814ya2.hasNext();
                    c6040hk3 = c3038Xj3.b;
                    if (!hasNext) {
                        break;
                    }
                    c6040hk3.c.a((C7884n6) c11814ya2.next());
                }
                final C5008ek3 c5008ek3 = new C5008ek3(c3038Xj3);
                PageLoadMetrics.a(c5008ek3);
                c3038Xj3.d = new Runnable() { // from class: ck3
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object obj = ThreadUtils.a;
                        C12157za2 c12157za2 = PageLoadMetrics.a;
                        if (c12157za2 == null) {
                            return;
                        }
                        c12157za2.d(c5008ek3);
                    }
                };
                if (c3038Xj3.g == 0) {
                    z = c3038Xj3.c.d(c3038Xj3);
                    c6040hk3.getClass();
                    EI2.b("Browser.PaintPreview.TabbedPlayer.HadCapture", z);
                    c3038Xj3.g = z ? 1 : 3;
                }
                if (!z) {
                    Runnable runnable = c3038Xj3.d;
                    if (runnable != null) {
                        runnable.run();
                        c3038Xj3.d = null;
                    }
                    c3038Xj3.a.w(c3038Xj3.f);
                }
            }
        }
        try {
            TraceEvent.b("Tab.restoreIfNeeded", null);
            if ((!l() || C1695Nb0.m(this).t == null || Z()) && g()) {
                WebContents webContents = this.l;
                if (webContents != null) {
                    webContents.i().l();
                }
                this.x = true;
                Iterator it2 = this.p.iterator();
                while (true) {
                    C11814ya2 c11814ya22 = (C11814ya2) it2;
                    if (!c11814ya22.hasNext()) {
                        break;
                    }
                    ((BA0) c11814ya22.next()).N0();
                }
            }
            return true;
        } finally {
            TraceEvent.c("Tab.restoreIfNeeded");
        }
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final void B() {
        if (this.w) {
            C11814ya2 P = P();
            while (P.hasNext()) {
                ((BA0) P.next()).J0(this, getUrl());
            }
        }
        WebContents webContents = this.l;
        if (webContents != null) {
            webContents.stop();
        }
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final boolean e() {
        return this.w;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final float s() {
        if (this.w) {
            return (int) this.l.H0();
        }
        return 1.0f;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final boolean t() {
        return this.x;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final boolean isInitialized() {
        return this.a != 0;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final boolean isDestroyed() {
        return this.H;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final boolean p() {
        return this.r;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final void I(boolean z) {
        if (this.r == z) {
            return;
        }
        this.r = z;
        Iterator it = this.p.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((BA0) c11814ya2.next()).k0(this, z);
            }
        }
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public boolean isHidden() {
        return this.y;
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final void destroy() {
        this.H = true;
        c0();
        C12157za2 c12157za2 = this.p;
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            } else {
                ((BA0) c11814ya2.next()).r0(this);
            }
        }
        c12157za2.clear();
        K44 k44 = this.G;
        k44.a();
        HashMap hashMap = k44.b;
        k44.b = null;
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            ((J44) it2.next()).destroy();
        }
        C9642sD3 c9642sD3 = this.o;
        TabImpl tabImpl = c9642sD3.g;
        tabImpl.n = null;
        tabImpl.W();
        PriorityQueue priorityQueue = c9642sD3.a;
        InterfaceC9985tD3 interfaceC9985tD3 = (InterfaceC9985tD3) priorityQueue.peek();
        if (interfaceC9985tD3 != null) {
            interfaceC9985tD3.v();
        }
        priorityQueue.clear();
        EC ec = c9642sD3.i;
        if (ec != null) {
            ((CC) ec.i).g(ec);
        }
        c9642sD3.g = null;
        R(false, null);
        K(true);
        ArrayList arrayList = AbstractC9894sx3.a;
        Object obj = ThreadUtils.a;
        AbstractC9894sx3.a.remove(this);
        long j = this.a;
        if (j != 0) {
            N.M1Fyow7a(j);
        }
    }

    public final void S(WebContents webContents) {
        try {
            TraceEvent.b("ChromeTab.initWebContents", null);
            WebContents webContents2 = this.l;
            this.l = webContents;
            ContextThemeWrapper contextThemeWrapper = this.i;
            Q50 q50 = new Q50(contextThemeWrapper, webContents);
            q50.setContentDescription(contextThemeWrapper.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140128));
            this.m = q50;
            webContents.I(new C8957qD3(this, q50), q50, this.j, new C6047hl4());
            R(false, null);
            if (webContents2 != null) {
                webContents2.F(0);
                WebContentsAccessibilityImpl.k(webContents2).C(false);
            }
            this.l.F(this.z);
            N.Mt4iWzCb(this.l, J() == 2);
            this.m.addOnAttachStateChangeListener(this.D);
            a0();
            this.q = new TabWebContentsDelegateAndroidImpl(this, this.C.e(this));
            N.MUKSQbrZ(this.a, this.h, T(this), webContents, this.q, new C7824mv3(this.C.b(this), this));
            this.l.w0();
            AbstractC7836mx3.b(this);
            W();
        } finally {
            TraceEvent.c("ChromeTab.initWebContents");
        }
    }

    public final boolean Z() {
        try {
            TraceEvent.b("Tab.unfreezeContents", null);
            Gl4 gl4 = C1695Nb0.m(this).t;
            boolean z = false;
            WebContents webContents = (WebContents) N.MXGOiJkn(gl4.a, gl4.b, isHidden(), false);
            if (webContents == null) {
                webContents = Al4.a(AbstractC1741Nk1.b(this.j, isIncognito()), isHidden());
                Iterator it = this.p.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        break;
                    }
                    ((BA0) c11814ya2.next()).M0();
                }
            } else {
                z = true;
            }
            View view = (View) O().r0.g;
            webContents.b(view.getWidth(), view.getHeight());
            C1695Nb0.m(this).r(null);
            S(webContents);
            if (!z) {
                d(new LoadUrlParams(C1695Nb0.m(this).p.i().isEmpty() ? "chrome-native://newtab/" : C1695Nb0.m(this).p.i(), 5));
            }
            return z;
        } finally {
            TraceEvent.c("Tab.unfreezeContents");
        }
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final int d(LoadUrlParams loadUrlParams) {
        try {
            TraceEvent.b("Tab.loadUrl", null);
            if (!this.B) {
                this.B = V(loadUrlParams.a, false);
            }
            if (!"chrome://java-crash/".equals(loadUrlParams.a)) {
                if (this.H) {
                    throw new RuntimeException("Tab.loadUrl called on a destroyed tab");
                }
                if (this.a != 0) {
                    loadUrlParams.h = J();
                    int U = U(loadUrlParams);
                    Iterator it = this.p.iterator();
                    while (true) {
                        C11814ya2 c11814ya2 = (C11814ya2) it;
                        if (!c11814ya2.hasNext()) {
                            return U;
                        }
                        ((BA0) c11814ya2.next()).G0(U, this, loadUrlParams);
                    }
                } else {
                    throw new RuntimeException("Tab.loadUrl called when no native side exists");
                }
            } else {
                throw new RuntimeException("Intentional Java Crash");
            }
        } finally {
            TraceEvent.c("Tab.loadUrl");
        }
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final void hide(int i) {
        Tab tab;
        try {
            TraceEvent.b("Tab.hide", null);
            if (isHidden()) {
                return;
            }
            this.y = true;
            a0();
            WebContents webContents = this.l;
            if (webContents != null) {
                webContents.y();
            }
            ArrayList arrayList = C5795h12.b.a;
            arrayList.add(new WeakReference(this));
            if (arrayList.size() > 3 && (tab = (Tab) ((WeakReference) arrayList.remove(0)).get()) != null) {
                tab.A();
            }
            Iterator it = this.p.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    return;
                } else {
                    ((BA0) c11814ya2.next()).A0(i, this);
                }
            }
        } finally {
            TraceEvent.c("Tab.hide");
        }
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final void show(int i) {
        try {
            TraceEvent.b("Tab.show", null);
            if (!isHidden()) {
                return;
            }
            int i2 = 0;
            this.y = false;
            a0();
            C();
            WebContents webContents = this.l;
            if (webContents != null) {
                webContents.T0();
            }
            InterfaceC5451g12 interfaceC5451g12 = this.k;
            if (interfaceC5451g12 != null && interfaceC5451g12.l()) {
                V(interfaceC5451g12.getUrl(), true);
            }
            C5795h12 c5795h12 = C5795h12.b;
            while (true) {
                ArrayList arrayList = c5795h12.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (((Tab) ((WeakReference) arrayList.get(i2)).get()) == this) {
                    arrayList.remove(i2);
                }
                i2++;
            }
            AbstractC9894sx3.a(this);
            float s = s();
            C12157za2 c12157za2 = this.p;
            if (s < 100.0f) {
                float s2 = s();
                Iterator it = c12157za2.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        break;
                    } else {
                        ((BA0) c11814ya2.next()).D0(this, s2);
                    }
                }
            }
            Iterator it2 = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya22 = (C11814ya2) it2;
                if (!c11814ya22.hasNext()) {
                    C1695Nb0.m(this).p(System.currentTimeMillis());
                    return;
                }
                ((BA0) c11814ya22.next()).P0(i, this);
            }
        } finally {
            TraceEvent.c("Tab.show");
        }
    }

    public static boolean T(Tab tab) {
        WindowAndroid Q0;
        if (tab.b() == null || (Q0 = tab.b().Q0()) == null) {
            return true;
        }
        return !(V60.a((Context) Q0.j.get()) instanceof ChromeActivity);
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final void E(boolean z) {
        this.I.p(Boolean.valueOf(z));
    }

    @Override // defpackage.InterfaceC1818Nz3
    public final void o(boolean z) {
        View a = a();
        boolean z2 = true;
        if (a != null) {
            int i = z ? 4 : 1;
            if (a.getImportantForAccessibility() != i) {
                a.setImportantForAccessibility(i);
                a.sendAccessibilityEvent(2048);
            }
        }
        WebContents webContents = this.l;
        WebContentsAccessibilityImpl k = webContents != null ? WebContentsAccessibilityImpl.k(webContents) : null;
        if (k != null) {
            if (!z && !u()) {
                z2 = false;
            }
            k.C(z2);
        }
    }

    public final void X(IA3 ia3) {
        C1695Nb0.m(this).r(ia3.a);
        C1695Nb0.m(this).p(ia3.d);
        C1695Nb0 m = C1695Nb0.m(this);
        Gl4 gl4 = ia3.a;
        m.q(new GURL(N.MNZ4eg9q(gl4.a, gl4.b)));
        C1695Nb0 m2 = C1695Nb0.m(this);
        Gl4 gl42 = ia3.a;
        String MZZlQD12 = N.MZZlQD12(gl42.a, gl42.b);
        if (!TextUtils.equals(MZZlQD12, m2.o)) {
            m2.o = MZZlQD12;
            m2.l();
        }
        C1695Nb0 m3 = C1695Nb0.m(this);
        Integer num = ia3.g;
        if ((num != null || m3.x != null) && (num == null || !num.equals(m3.x))) {
            m3.x = num;
            m3.l();
        }
        C1695Nb0 m4 = C1695Nb0.m(this);
        int i = ia3.c;
        if (i == -1) {
            i = this.g;
        }
        m4.o(i);
        C1695Nb0 m5 = C1695Nb0.m(this);
        int i2 = ia3.i;
        if (m5.z == i2) {
            return;
        }
        m5.z = i2;
        m5.l();
    }

    public final C11814ya2 P() {
        return this.p.f();
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final void G(WindowAndroid windowAndroid, InterfaceC11941yv3 interfaceC11941yv3) {
        boolean z = true;
        if (windowAndroid != null) {
            this.j = windowAndroid;
            WebContents webContents = this.l;
            if (webContents != null) {
                webContents.i1(windowAndroid);
            }
            if (interfaceC11941yv3 != null) {
                this.C = interfaceC11941yv3;
                TabWebContentsDelegateAndroidImpl tabWebContentsDelegateAndroidImpl = new TabWebContentsDelegateAndroidImpl(this, interfaceC11941yv3.e(this));
                this.q = tabWebContentsDelegateAndroidImpl;
                WebContents webContents2 = this.l;
                if (webContents2 != null) {
                    N.M6xWklI_(this.a, tabWebContentsDelegateAndroidImpl, new C7824mv3(this.C.b(this), this));
                    webContents2.w0();
                }
            }
            if (isNativePage()) {
                V(getUrl().i(), true);
            }
        }
        if ((windowAndroid == null || interfaceC11941yv3 == null) && (windowAndroid != null || interfaceC11941yv3 != null)) {
            z = false;
        }
        if (z) {
            Iterator it = this.p.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    ((BA0) c11814ya2.next()).g0(this, windowAndroid);
                }
            }
        }
        a0();
    }

    public final void Q(boolean z) {
        this.A = !z;
        Iterator it = this.p.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((BA0) c11814ya2.next()).L0(this, z);
            }
        }
    }

    public final void N(GURL gurl) {
        c0();
        if (this.A) {
            Q(true);
        }
        Iterator it = this.p.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((BA0) c11814ya2.next()).K0(this, gurl);
            }
        }
    }

    public final void M(GURL gurl) {
        c0();
        Iterator it = this.p.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                this.x = false;
                return;
            }
            ((BA0) c11814ya2.next()).J0(this, gurl);
        }
    }

    public final void L(int i) {
        Iterator it = this.p.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (c11814ya2.hasNext()) {
                ((BA0) c11814ya2.next()).I0(i, this);
            } else {
                this.x = false;
                return;
            }
        }
    }

    public final boolean V(String str, boolean z) {
        boolean z2 = false;
        if (T(this)) {
            return false;
        }
        final InterfaceC5451g12 a = this.C.a(str, z ? null : this.k, this);
        if (a != null) {
            z2 = true;
            if (this.k != a) {
                R(true, new Runnable() { // from class: ox3
                    @Override // java.lang.Runnable
                    public final void run() {
                        TabImpl tabImpl = TabImpl.this;
                        InterfaceC5451g12 interfaceC5451g12 = a;
                        tabImpl.k = interfaceC5451g12;
                        if (!interfaceC5451g12.l()) {
                            tabImpl.k.a().addOnAttachStateChangeListener(tabImpl.D);
                        }
                        N.MhCci$0r(tabImpl.a, tabImpl.k.getUrl(), tabImpl.k.getTitle());
                        tabImpl.b0(0);
                    }
                });
            }
            C11814ya2 P = P();
            while (P.hasNext()) {
                ((BA0) P.next()).Q0(this);
            }
            C11814ya2 P2 = P();
            while (P2.hasNext()) {
                ((BA0) P2.next()).x0(this, null);
            }
        }
        return z2;
    }

    public final void W() {
        Iterator it = this.p.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((BA0) c11814ya2.next()).l0(this);
            }
        }
    }

    public final void b0(int i) {
        if (this.f11528J == i) {
            return;
        }
        this.f11528J = i;
        C11814ya2 P = P();
        while (P.hasNext()) {
            ((BA0) P.next()).s0(i, this);
        }
    }

    public final void c0() {
        String title;
        if (l()) {
            return;
        }
        if (!isNativePage()) {
            WebContents webContents = this.l;
            title = webContents != null ? webContents.getTitle() : "";
        } else {
            title = this.k.getTitle();
        }
        if (TextUtils.equals(C1695Nb0.m(this).o, title)) {
            return;
        }
        C1695Nb0 m = C1695Nb0.m(this);
        if (!TextUtils.equals(title, m.o)) {
            m.o = title;
            m.l();
        }
        C11814ya2 P = P();
        while (P.hasNext()) {
            ((BA0) P.next()).Q0(this);
        }
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public final LoadUrlParams r() {
        return this.v;
    }

    public void swapWebContents(final WebContents webContents, boolean z, boolean z2) {
        final Rect rect;
        boolean z3 = (this.m == null || this.l == null) ? false : true;
        if (z3) {
            rect = new Rect(0, 0, this.m.getWidth(), this.m.getHeight());
        } else {
            rect = new Rect();
        }
        C12157za2 c12157za2 = this.p;
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            } else {
                ((BA0) c11814ya2.next()).U0(this);
            }
        }
        if (z3) {
            this.l.y();
        }
        final Rect a = rect.isEmpty() ? AbstractC7239lD3.a(V60.a) : null;
        if (a != null) {
            rect.set(a);
        }
        this.l.k0(false);
        K(false);
        R(false, new Runnable() { // from class: px3
            @Override // java.lang.Runnable
            public final void run() {
                TabImpl tabImpl = TabImpl.this;
                tabImpl.getClass();
                Rect rect2 = rect;
                int width = rect2.width();
                int height = rect2.height();
                WebContents webContents2 = webContents;
                webContents2.b(width, height);
                Rect rect3 = a;
                if (rect3 != null) {
                    N.MzfONDmc(tabImpl.a, webContents2, rect3.right, rect3.bottom);
                }
                tabImpl.S(webContents2);
                webContents2.T0();
            }
        });
        if (z) {
            N(getUrl());
            if (z2) {
                M(getUrl());
            }
        }
        Iterator it2 = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya22 = (C11814ya2) it2;
            if (!c11814ya22.hasNext()) {
                return;
            } else {
                ((BA0) c11814ya22.next()).T0(this, z, z2);
            }
        }
    }

    public final long getNativePtr() {
        return this.a;
    }

    public final void clearNativePtr() {
        this.a = 0L;
    }

    public final void setNativePtr(long j) {
        this.a = j;
    }

    public static long[] getAllNativePtrs(Tab[] tabArr) {
        if (tabArr == null) {
            return null;
        }
        long[] jArr = new long[tabArr.length];
        for (int i = 0; i < tabArr.length; i++) {
            jArr[i] = ((TabImpl) tabArr[i]).getNativePtr();
        }
        return jArr;
    }

    public final void R(boolean z, Runnable runnable) {
        InterfaceC5451g12 interfaceC5451g12 = this.k;
        if (interfaceC5451g12 != null) {
            if (!interfaceC5451g12.l()) {
                this.k.a().removeOnAttachStateChangeListener(this.D);
            }
            this.k = null;
        }
        if (runnable != null) {
            runnable.run();
        }
        if (z) {
            W();
        }
        if (interfaceC5451g12 == null) {
            return;
        }
        interfaceC5451g12.destroy();
    }

    public final void a0() {
        boolean z = (this.y || l() || (!this.F && !VrModuleProvider.b().a()) || T(this)) ? false : true;
        if (z == this.E) {
            return;
        }
        this.E = z;
        Iterator it = this.p.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((BA0) c11814ya2.next()).C0(this, z);
            }
        }
    }

    @Override // org.chromium.chrome.browser.tab.Tab
    public boolean isCustomTab() {
        ChromeActivity O = O();
        return O != null && O.z1();
    }

    public final void deleteNavigationEntriesFromFrozenState(long j) {
        Gl4 gl4;
        Gl4 gl42 = C1695Nb0.m(this).t;
        if (gl42 == null) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) N.MGuJ$X8n(gl42.a, gl42.b, j);
        if (byteBuffer == null) {
            gl4 = null;
        } else {
            Gl4 gl43 = new Gl4(byteBuffer);
            gl43.b = 2;
            gl4 = gl43;
        }
        if (gl4 == null) {
            return;
        }
        C1695Nb0.m(this).r(gl4);
        Iterator it = this.p.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((BA0) c11814ya2.next()).H0(this);
            }
        }
    }

    public final void K(boolean z) {
        if (this.l == null) {
            return;
        }
        this.m.removeOnAttachStateChangeListener(this.D);
        this.m = null;
        a0();
        WebContents webContents = this.l;
        if (webContents.C() != null && (webContents.C() instanceof C8957qD3)) {
            C8957qD3 c8957qD3 = (C8957qD3) webContents.C();
            C10554ut0 c10554ut0 = c8957qD3.a;
            c10554ut0.g = 0;
            c10554ut0.a = 0;
            c10554ut0.j = 0;
            c10554ut0.h = false;
            c10554ut0.i = false;
            c10554ut0.m = -1L;
            if (((Q50) c8957qD3.getContainerView()) != null) {
                ((Q50) c8957qD3.getContainerView()).i.d(c10554ut0);
            }
        }
        this.l = null;
        this.q = null;
        if (z) {
            N.MYIgyGYO(this.a);
            return;
        }
        N.MoDA8Gdb(this.a);
        webContents.i0();
        webContents.I(new ViewAndroidDelegate(null), null, null, new C6047hl4());
    }

    public final void Y(int i) {
        WebContents webContents;
        if (J() == 0 || (webContents = this.l) == null) {
            return;
        }
        AbstractC7239lD3.e(i, this, !webContents.i().m(), false);
    }
}
