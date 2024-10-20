package org.chromium.chrome.browser.contextualsearch;

import J.N;
import android.app.Activity;
import android.content.Context;
import defpackage.AbstractC10385uP0;
import defpackage.AbstractC4851eH1;
import defpackage.BA0;
import defpackage.C5147f80;
import defpackage.C5491g80;
import defpackage.C6494j33;
import defpackage.C6521j80;
import defpackage.C6838k33;
import defpackage.C6865k80;
import defpackage.C7928nE;
import defpackage.C8385oa2;
import defpackage.E70;
import defpackage.G22;
import defpackage.IG3;
import defpackage.InterfaceC5835h80;
import defpackage.S70;
import defpackage.UN;
import org.chromium.base.Callback;
import org.chromium.base.SysUtils;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchTabHelper;
import org.chromium.chrome.browser.locale.LocaleManager;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ContextualSearchTabHelper extends BA0 implements G22 {
    public final Tab a;
    public final float g;
    public C6865k80 h;
    public WebContents i;
    public ContextualSearchManager j;
    public C5147f80 k;
    public C6838k33 l;
    public long m;
    public Boolean n;
    public final C6521j80 o;

    /* JADX WARN: Type inference failed for: r2v2, types: [j80] */
    public ContextualSearchTabHelper(TabImpl tabImpl) {
        this.a = tabImpl;
        tabImpl.v(this);
        if (NetworkChangeNotifier.f != null) {
            NetworkChangeNotifier.a(this);
        }
        Context context = tabImpl.getContext();
        this.g = context != null ? 1.0f / context.getResources().getDisplayMetrics().density : 1.0f;
        this.o = new Callback() { // from class: j80
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ContextualSearchTabHelper contextualSearchTabHelper = ContextualSearchTabHelper.this;
                contextualSearchTabHelper.a1(contextualSearchTabHelper.a);
            }
        };
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        a1(tab);
        ContextualSearchManager V0 = V0(tab);
        if (V0 != null) {
            C5491g80 c5491g80 = V0.r;
            c5491g80.f = 0;
            c5491g80.e = null;
            c5491g80.h = false;
            c5491g80.p = false;
            c5491g80.q = false;
            c5491g80.r = false;
            c5491g80.i = null;
            c5491g80.m = 0L;
            c5491g80.j = false;
        }
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        if (this.m == 0 && tab.b() != null) {
            this.m = N.MjIbQ3pN(this, Profile.b(tab.b()));
        }
        if (this.h == null) {
            this.h = new C6865k80(this);
            IG3.a().a(this.h);
        }
        a1(tab);
    }

    @Override // defpackage.BA0
    public final void T0(Tab tab, boolean z, boolean z2) {
        a1(tab);
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        long j = this.m;
        if (j != 0) {
            N.M4Z1OGVX(j, this);
            this.m = 0L;
        }
        if (this.h != null) {
            IG3.a().h(this.h);
        }
        if (NetworkChangeNotifier.f != null) {
            NetworkChangeNotifier.g(this);
        }
        Y0(this.i);
        this.i = null;
        this.j = null;
        this.l = null;
        this.k = null;
        C8385oa2 W0 = W0(this.a);
        if (W0 != null) {
            W0.n(this.o);
        }
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        if (windowAndroid != null) {
            a1(tab);
        } else {
            Y0(this.i);
            this.j = null;
        }
    }

    @Override // defpackage.BA0
    public final void o0(TabImpl tabImpl) {
        ContextualSearchManager V0 = V0(tabImpl);
        if (V0 != null) {
            ((ContextualSearchManager) V0.r.a).h();
        }
    }

    @Override // defpackage.G22
    public final void b(int i) {
        Z0(this.i);
    }

    public final void a1(Tab tab) {
        WebContents b = tab.b();
        boolean z = b != this.i;
        if (z || this.j != V0(tab)) {
            this.j = V0(tab);
            if (z) {
                Y0(this.i);
                this.l = b != null ? new C6838k33(b) : null;
            }
            this.i = b;
            Z0(b);
        }
    }

    public final void Z0(WebContents webContents) {
        if (webContents == null) {
            return;
        }
        Y0(webContents);
        Tab tab = this.a;
        boolean isCustomTab = tab.isCustomTab();
        ContextualSearchManager V0 = V0(tab);
        boolean z = false;
        if (V0 == null) {
            if (isCustomTab) {
                AbstractC4851eH1.f("ContextualSearch", "No manager!", new Object[0]);
            }
            C8385oa2 W0 = W0(tab);
            if (W0 != null) {
                W0.m(this.o);
            }
        } else {
            boolean z2 = (webContents.isIncognito() || !AbstractC10385uP0.a() || S70.b() || !IG3.a().e() || LocaleManager.getInstance().a() || SysUtils.isLowEndDevice() || tab.n() || !X0(V0)) ? false : true;
            if (isCustomTab && !z2) {
                AbstractC4851eH1.f("ContextualSearch", "Not allowed to be active! Checking reasons:", new Object[0]);
                StringBuilder sb = new StringBuilder("!isIncognito: ");
                sb.append(!webContents.isIncognito());
                sb.append(" getFirstRunFlowComplete: ");
                sb.append(AbstractC10385uP0.a());
                sb.append(" !isContextualSearchDisabled: ");
                sb.append(!S70.b());
                sb.append(" isDefaultSearchEngineGoogle: ");
                sb.append(IG3.a().e());
                sb.append(" !needToCheckForSearchEnginePromo: ");
                sb.append(!LocaleManager.getInstance().a());
                sb.append(" !isRunningInCompatibilityMode: ");
                sb.append(!SysUtils.isLowEndDevice());
                sb.append(" !isShowingErrorPage: ");
                sb.append(true ^ tab.n());
                sb.append(" isDeviceOnline: ");
                sb.append(X0(V0));
                AbstractC4851eH1.f("ContextualSearch", sb.toString(), new Object[0]);
            }
            z = z2;
        }
        if (z) {
            ContextualSearchManager V02 = V0(tab);
            if (this.k != null || V02 == null) {
                return;
            }
            C5491g80 c5491g80 = V02.r;
            c5491g80.getClass();
            this.k = new C5147f80(c5491g80);
            GestureListenerManagerImpl.d(webContents).b(this.k);
            SelectionPopupControllerImpl k = SelectionPopupControllerImpl.k(webContents);
            C6838k33 c6838k33 = this.l;
            boolean z3 = c6838k33.a;
            E70 e70 = V02.l;
            if (z3) {
                c6838k33.b = new C6494j33(c6838k33.b, e70);
            } else {
                c6838k33.b = e70;
            }
            k.y(c6838k33.b);
            N.MGn2PSB6(this.m, this, webContents, this.g);
        }
    }

    public final void Y0(WebContents webContents) {
        if (webContents == null || this.k == null) {
            return;
        }
        GestureListenerManagerImpl.d(webContents).f(this.k);
        this.k = null;
        if (this.l != null) {
            SelectionPopupControllerImpl k = SelectionPopupControllerImpl.k(webContents);
            C6838k33 c6838k33 = this.l;
            if (c6838k33.a) {
                c6838k33.b = ((C6494j33) c6838k33.b).a;
            } else {
                c6838k33.b = null;
            }
            k.y(c6838k33.b);
        }
        ContextualSearchManager V0 = V0(this.a);
        if (V0 == null || X0(V0)) {
            return;
        }
        V0.i(0);
    }

    public static boolean X0(ContextualSearchManager contextualSearchManager) {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("ContextualSearchDisableOnlineDetection")) {
            return true;
        }
        return NetworkChangeNotifier.b();
    }

    public static ContextualSearchManager V0(Tab tab) {
        C8385oa2 W0 = W0(tab);
        if (W0 == null) {
            return null;
        }
        return (ContextualSearchManager) W0.g;
    }

    public static C8385oa2 W0(Tab tab) {
        if (tab.m() == null) {
            return null;
        }
        Activity activity = (Activity) tab.m().k().get();
        if (activity instanceof ChromeActivity) {
            return ((ChromeActivity) activity).u0;
        }
        return null;
    }

    public void onContextualSearchPrefChanged() {
        boolean a;
        Z0(this.i);
        ContextualSearchManager V0 = V0(this.a);
        if (V0 == null || V0.v == null) {
            return;
        }
        if (!(!N.MFs_R_Ad(S70.a().a, "search.contextual_search_fully_opted_in"))) {
            a = S70.a().a("search.contextual_search_fully_opted_in");
        } else {
            a = S70.c();
        }
        V0.v.G(a);
    }

    public void onShowUnhandledTapUIIfNeeded(int i, int i2) {
        int i3;
        if (this.k != null) {
            Tab tab = this.a;
            if (V0(tab) != null) {
                C5491g80 c5491g80 = V0(tab).r;
                c5491g80.h = false;
                int i4 = c5491g80.f;
                InterfaceC5835h80 interfaceC5835h80 = c5491g80.a;
                if (i4 != 2 && !c5491g80.q && (i3 = c5491g80.g) != 2 && i3 != 3) {
                    c5491g80.h = true;
                    c5491g80.f = 1;
                    c5491g80.k = i;
                    c5491g80.l = i2;
                    ContextualSearchManager contextualSearchManager = (ContextualSearchManager) interfaceC5835h80;
                    if (contextualSearchManager.k()) {
                        return;
                    }
                    contextualSearchManager.u.a(6);
                    return;
                }
                c5491g80.i = null;
                ContextualSearchManager contextualSearchManager2 = (ContextualSearchManager) interfaceC5835h80;
                if (contextualSearchManager2.k()) {
                    return;
                }
                contextualSearchManager2.i(7);
            }
        }
    }
}
