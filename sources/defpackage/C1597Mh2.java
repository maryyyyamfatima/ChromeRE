package defpackage;

import J.N;
import android.app.Activity;
import java.util.List;
import java.util.regex.Pattern;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.infobar.InfoBarContainer;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mh2 */
/* loaded from: classes2.dex */
public final class C1597Mh2 extends BA0 {
    public final Activity a;
    public final OD0 g;
    public final C10383uO3 h;
    public final C7806ms3 i;
    public final InterfaceC0079Ap3 j;
    public Tab k;
    public String l;

    public C1597Mh2(Activity activity, InterfaceC7697ma2 interfaceC7697ma2, OD0 od0, C10383uO3 c10383uO3, C7806ms3 c7806ms3, C8385oa2 c8385oa2) {
        this.a = activity;
        this.g = od0;
        this.h = c10383uO3;
        this.i = c7806ms3;
        this.j = c8385oa2;
        C10452uc0 c10452uc0 = new C10452uc0(interfaceC7697ma2, this, new Callback() { // from class: Lh2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Tab tab = (Tab) obj;
                C1597Mh2 c1597Mh2 = C1597Mh2.this;
                c1597Mh2.k = tab;
                if (tab == null) {
                    c1597Mh2.W0(null);
                    return;
                }
                if (tab.isIncognito()) {
                    c1597Mh2.W0(null);
                    c1597Mh2.k.w(c1597Mh2);
                } else {
                    if (c1597Mh2.k.isHidden()) {
                        return;
                    }
                    c1597Mh2.W0(c1597Mh2.k.getUrl());
                }
            }
        });
        c10452uc0.c.onResult((Tab) ((C8385oa2) interfaceC7697ma2).g);
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        if (tab.e() || tab.t()) {
            return;
        }
        W0(tab.getUrl());
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        W0(null);
    }

    @Override // defpackage.BA0
    public final void f0(TabImpl tabImpl) {
        W0(tabImpl.getUrl());
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        W0(null);
    }

    public final boolean V0(String str, boolean z) {
        Tab tab = this.k;
        boolean z2 = false;
        if (tab == null) {
            return false;
        }
        final C5744gs3 W0 = C5744gs3.W0(tab, this.j);
        if (z && str.equals(W0.i)) {
            return false;
        }
        if (!z) {
            if (!(W0.i != null)) {
                return false;
            }
        }
        if (z) {
            W0.i = str;
            Tab tab2 = W0.a;
            tab2.v(W0);
            tab2.B();
            WebContents b = tab2.b();
            if (b != null) {
                b.y();
                b.e1();
                b.V(true);
                WebContentsAccessibilityImpl.k(b).C(true);
                if (N.MybJWOXK(b) || N.MKIWbnaU(b) || N.MDk3$bjp(b)) {
                    N.M3xnlzVW(b);
                }
            }
            InfoBarContainer c = InfoBarContainer.c(tab2);
            if (c != null) {
                c.e(true);
            }
            if (W0.h != null && tab2.q().b(W0)) {
                z2 = true;
            }
            if (z2) {
                W0.X0();
            } else {
                W0.V0();
            }
            final TabContentManager tabContentManager = (TabContentManager) W0.g.get();
            if (tabContentManager != null) {
                W0.h.post(new Runnable() { // from class: es3
                    @Override // java.lang.Runnable
                    public final void run() {
                        Tab tab3 = C5744gs3.this.a;
                        int id = tab3.getId();
                        TabContentManager tabContentManager2 = tabContentManager;
                        tabContentManager2.h(id);
                        tabContentManager2.a(tab3);
                    }
                });
            }
            return true;
        }
        W0.a.q().c(W0);
        W0.h = null;
        WebContents b2 = W0.a.b();
        if (b2 != null) {
            b2.T0();
            b2.V(false);
            WebContentsAccessibilityImpl.k(b2).C(false);
        }
        W0.h = null;
        W0.i = null;
        if (!this.k.e() && !C8693pT2.W0(this.k)) {
            this.k.c();
        }
        return false;
    }

    @Override // defpackage.BA0
    public final void R0(GURL gurl) {
        String d = GURL.l(gurl) ? "" : gurl.d();
        MC2 mc2 = this.i.c;
        V0(d, (mc2 == null || !mc2.d()) ? false : ((List) mc2.b).contains(d));
    }

    public final void W0(GURL gurl) {
        boolean z;
        MC2 mc2;
        String str;
        C10383uO3 c10383uO3;
        OD0 od0;
        String d = GURL.l(gurl) ? "" : gurl.d();
        boolean equals = d.equals(this.l);
        boolean z2 = false;
        if (gurl != null) {
            Pattern pattern = T34.a;
            if (T34.l(gurl.h())) {
                z = true;
                mc2 = this.i.c;
                if (mc2 != null && mc2.d()) {
                    z2 = ((List) mc2.b).contains(d);
                }
                boolean V0 = V0(d, z2);
                str = this.l;
                c10383uO3 = this.h;
                od0 = this.g;
                if (str != null && (V0 || !equals)) {
                    C10185to4 c10185to4 = new C10185to4(2, this.l, System.currentTimeMillis());
                    od0.getClass();
                    od0.b.h(new JD0(od0, c10185to4, new MC2()), new DD0());
                    String str2 = this.l;
                    c10383uO3.getClass();
                    c10383uO3.a.f(new C10040tO3(str2)).g(new C1338Kh2(this, "reportUsageStop"));
                    this.l = null;
                }
                if (z || z2 || equals) {
                    return;
                }
                this.l = d;
                C10185to4 c10185to42 = new C10185to4(1, this.l, System.currentTimeMillis());
                od0.getClass();
                od0.b.h(new JD0(od0, c10185to42, new MC2()), new DD0());
                String str3 = this.l;
                c10383uO3.getClass();
                c10383uO3.a.f(new C10040tO3(str3)).g(new C1338Kh2(this, "reportUsageStart"));
                return;
            }
        }
        z = false;
        mc2 = this.i.c;
        if (mc2 != null) {
            z2 = ((List) mc2.b).contains(d);
        }
        boolean V02 = V0(d, z2);
        str = this.l;
        c10383uO3 = this.h;
        od0 = this.g;
        if (str != null) {
            C10185to4 c10185to43 = new C10185to4(2, this.l, System.currentTimeMillis());
            od0.getClass();
            od0.b.h(new JD0(od0, c10185to43, new MC2()), new DD0());
            String str22 = this.l;
            c10383uO3.getClass();
            c10383uO3.a.f(new C10040tO3(str22)).g(new C1338Kh2(this, "reportUsageStop"));
            this.l = null;
        }
        if (z) {
        }
    }
}
