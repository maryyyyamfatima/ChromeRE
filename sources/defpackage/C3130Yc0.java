package defpackage;

import J.N;
import android.content.Intent;
import androidx.appcompat.app.a;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yc0 */
/* loaded from: classes.dex */
public final class C3130Yc0 implements InterfaceC6044hl1 {
    public final Intent A;
    public C2870Wc0 B;
    public C3000Xc0 C;
    public final InterfaceC3241Yy1 a;
    public final a g;
    public final CustomTabsConnection h;
    public final PC i;
    public final C2468Sz3 j;
    public final InterfaceC3241Yy1 k;
    public final Pj4 l;
    public final C5313fe0 m;
    public final C3933bd0 n;
    public final InterfaceC3241Yy1 o;
    public final Al4 p;
    public final C2095Qd0 q;
    public final C6166i6 r;
    public final C4620dd0 s;
    public final C11063wN2 t;
    public final InterfaceC3241Yy1 u;
    public final InterfaceC3241Yy1 v;
    public final InterfaceC0079Ap3 w;
    public final C10285u6 x;
    public final InterfaceC8533oz3 y;
    public final CustomTabsSessionToken z;

    @Override // defpackage.InterfaceC6044hl1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.InterfaceC6044hl1
    public final void W() {
    }

    public C3130Yc0(a aVar, InterfaceC3241Yy1 interfaceC3241Yy1, CustomTabsConnection customTabsConnection, PC pc, C6166i6 c6166i6, C2468Sz3 c2468Sz3, InterfaceC3241Yy1 interfaceC3241Yy12, I5 i5, Pj4 pj4, C5313fe0 c5313fe0, C3933bd0 c3933bd0, InterfaceC3241Yy1 interfaceC3241Yy13, Al4 al4, C2095Qd0 c2095Qd0, C4620dd0 c4620dd0, C11063wN2 c11063wN2, InterfaceC3241Yy1 interfaceC3241Yy14, InterfaceC3241Yy1 interfaceC3241Yy15, InterfaceC0079Ap3 interfaceC0079Ap3, C10285u6 c10285u6, InterfaceC8533oz3 interfaceC8533oz3) {
        this.a = interfaceC3241Yy1;
        this.g = aVar;
        this.h = customTabsConnection;
        this.i = pc;
        this.j = c2468Sz3;
        this.k = interfaceC3241Yy12;
        this.l = pj4;
        this.m = c5313fe0;
        this.n = c3933bd0;
        this.o = interfaceC3241Yy13;
        this.p = al4;
        this.q = c2095Qd0;
        this.r = c6166i6;
        this.s = c4620dd0;
        this.t = c11063wN2;
        this.u = interfaceC3241Yy14;
        this.v = interfaceC3241Yy15;
        this.w = interfaceC0079Ap3;
        this.x = c10285u6;
        this.y = interfaceC8533oz3;
        CustomTabsSessionToken u = pc.u();
        this.z = u;
        this.A = pc.p();
        H71 h71 = customTabsConnection.a;
        G71 g71 = h71.a;
        c4620dd0.d = (g71 == null || !g71.a.equals(u)) ? null : h71.a.b;
        i5.b(this);
    }

    public final void a() {
        this.n.c().g().k(this.s.b, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:            if (r6 != null) goto L315;     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    @Override // defpackage.InterfaceC6044hl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3130Yc0.i():void");
    }

    public final void d() {
        Tab h;
        CustomTabsSessionToken customTabsSessionToken;
        Intent intent = this.A;
        if (C1761No1.f(intent) != null) {
            CustomTabsConnection customTabsConnection = this.h;
            customTabsConnection.getClass();
            Object obj = ThreadUtils.a;
            H71 h71 = customTabsConnection.a;
            G71 g71 = h71.a;
            if (g71 != null && ((customTabsSessionToken = this.z) == null || customTabsSessionToken.equals(g71.a))) {
                h71.a.c.destroy();
                h71.a = null;
            }
        }
        C3933bd0 c3933bd0 = this.n;
        if (c3933bd0.k == null) {
            c3933bd0.k = new C5319ff0();
        }
        C5319ff0 c5319ff0 = c3933bd0.k;
        AbstractC11276wz3 abstractC11276wz3 = c5319ff0.b;
        PC pc = this.i;
        pc.getClass();
        TabModel j = abstractC11276wz3.j(pc instanceof C7062kj1);
        j.g(this.j);
        final C4620dd0 c4620dd0 = this.s;
        Tab tab = c4620dd0.b;
        int i = c4620dd0.c;
        if (this.w.get() == null) {
            h = null;
        } else {
            c5319ff0.c(true);
            c5319ff0.e(true);
            h = c5319ff0.b.h();
            if (h != null) {
                h(h);
            }
        }
        if (h != null) {
            i = 2;
        } else {
            h = tab;
        }
        if (h == null) {
            h = b();
            i = 1;
        }
        if (i != 2) {
            j.e(h, 0, h.getLaunchType(), 0);
        }
        if (i == 4) {
            C10313uA3 c10313uA3 = (C10313uA3) ((C10505ul) this.v.get()).c(h.getId());
            this.t.getClass();
            C10720vN2 a = C10720vN2.a(h);
            CompositorViewHolder compositorViewHolder = (CompositorViewHolder) this.k.get();
            InterfaceC11941yv3 interfaceC11941yv3 = (InterfaceC11941yv3) this.a.get();
            Runnable runnable = c10313uA3 != null ? c10313uA3.b : null;
            a.getClass();
            compositorViewHolder.u();
            Tab tab2 = a.a;
            tab2.G(this.x, interfaceC11941yv3);
            N.MM6uB79X(tab2.b());
            if (!tab2.isDestroyed()) {
                JA3.a(tab2).b(true);
            }
            if (runnable != null) {
                runnable.run();
            }
        }
        if (h != tab) {
            c4620dd0.a(i, h);
        }
        this.r.m(new Callback() { // from class: Rc0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                Tab tab3 = (Tab) obj2;
                C4620dd0 c4620dd02 = C4620dd0.this;
                if (c4620dd02.b == tab3) {
                    return;
                }
                c4620dd02.b = tab3;
                C12157za2 c12157za2 = c4620dd02.a;
                if (tab3 == null) {
                    Iterator it = c12157za2.iterator();
                    while (true) {
                        C11814ya2 c11814ya2 = (C11814ya2) it;
                        if (!c11814ya2.hasNext()) {
                            return;
                        } else {
                            ((AbstractC4276cd0) c11814ya2.next()).a();
                        }
                    }
                } else {
                    Iterator it2 = c12157za2.iterator();
                    while (true) {
                        C11814ya2 c11814ya22 = (C11814ya2) it2;
                        if (!c11814ya22.hasNext()) {
                            return;
                        } else {
                            ((AbstractC4276cd0) c11814ya22.next()).c(tab3);
                        }
                    }
                }
            }
        });
        Tab tab3 = c4620dd0.b;
        abstractC11276wz3.p();
        if (intent.hasExtra("org.chromium.chrome.browser.ServiceTabLauncher.LAUNCH_REQUEST_ID")) {
            N.MMtVSAe3(intent.getIntExtra("org.chromium.chrome.browser.ServiceTabLauncher.LAUNCH_REQUEST_ID", 0), tab3.b());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.chromium.chrome.browser.tab.TabImpl b() {
        /*
            r9 = this;
            PC r0 = r9.i
            r0.getClass()
            boolean r1 = r0 instanceof defpackage.C7062kj1
            if (r1 == 0) goto La
            goto L1e
        La:
            android.content.Intent r2 = r9.A
            int r2 = defpackage.C1761No1.j(r2)
            Yy1 r3 = r9.v
            java.lang.Object r3 = r3.get()
            ul r3 = (defpackage.C10505ul) r3
            sl r2 = r3.c(r2)
            if (r2 != 0) goto L20
        L1e:
            r2 = 0
            goto L24
        L20:
            org.chromium.content_public.browser.WebContents r2 = r2.b()
        L24:
            java.lang.String r3 = "CustomTabs.WebContentsStateOnLaunch"
            r4 = 4
            r5 = 1
            if (r2 == 0) goto L32
            r1 = 3
            defpackage.EI2.h(r1, r4, r3)
            r2.R0()
            goto L84
        L32:
            Pj4 r2 = r9.l
            r6 = 0
            org.chromium.content_public.browser.WebContents r2 = r2.d(r1, r6, r5)
            if (r2 == 0) goto L40
            r1 = 2
            defpackage.EI2.h(r1, r4, r3)
            goto L84
        L40:
            defpackage.EI2.h(r6, r4, r3)
            Al4 r2 = r9.p
            if (r1 == 0) goto L76
            Yy1 r1 = r9.u
            java.lang.Object r1 = r1.get()
            Id0 r1 = (defpackage.C1056Id0) r1
            gj1 r1 = r1.k
            org.chromium.chrome.browser.profiles.OTRProfileID r3 = r1.a
            if (r3 != 0) goto L61
            org.chromium.chrome.browser.profiles.OTRProfileID r3 = org.chromium.chrome.browser.profiles.OTRProfileID.b
            java.lang.String r3 = "CCT:Incognito"
            java.lang.Object r3 = J.N.Mgdxq2wn(r3)
            org.chromium.chrome.browser.profiles.OTRProfileID r3 = (org.chromium.chrome.browser.profiles.OTRProfileID) r3
            r1.a = r3
        L61:
            org.chromium.chrome.browser.profiles.Profile r3 = org.chromium.chrome.browser.profiles.Profile.d()
            org.chromium.chrome.browser.profiles.OTRProfileID r1 = r1.a
            org.chromium.chrome.browser.profiles.Profile r1 = r3.e(r1)
            r2.getClass()
            java.lang.Object r1 = J.N.MDMZjIJS(r1, r6, r5)
            r2 = r1
            org.chromium.content_public.browser.WebContents r2 = (org.chromium.content_public.browser.WebContents) r2
            goto L84
        L76:
            org.chromium.chrome.browser.profiles.Profile r1 = org.chromium.chrome.browser.profiles.Profile.d()
            r2.getClass()
            java.lang.Object r1 = J.N.MDMZjIJS(r1, r6, r5)
            r2 = r1
            org.chromium.content_public.browser.WebContents r2 = (org.chromium.content_public.browser.WebContents) r2
        L84:
            Yy1 r1 = r9.a
            java.lang.Object r1 = r1.get()
            yv3 r1 = (defpackage.InterfaceC11941yv3) r1
            Sc0 r3 = new Sc0
            r3.<init>()
            bd0 r4 = r9.n
            PC r6 = r4.f
            android.content.Intent r7 = r6.p()
            Zu3 r8 = new Zu3
            r8.<init>()
            int r7 = defpackage.C1761No1.j(r7)
            r8.a = r7
            boolean r6 = r6 instanceof defpackage.C7062kj1
            r8.d = r6
            Yy1 r4 = r4.d
            java.lang.Object r4 = r4.get()
            org.chromium.ui.base.WindowAndroid r4 = (org.chromium.ui.base.WindowAndroid) r4
            r8.e = r4
            r8.b(r5)
            r8.i = r2
            r8.j = r1
            r8.n = r3
            org.chromium.chrome.browser.tab.TabImpl r1 = r8.a()
            r9.h(r1)
            java.lang.String r2 = r0.y()
            if (r2 == 0) goto Ld1
            java.lang.String r0 = r0.y()
            org.chromium.content_public.browser.WebContents r2 = r1.l
            J.N.MJsDcRCX(r2, r0)
        Ld1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3130Yc0.b():org.chromium.chrome.browser.tab.TabImpl");
    }

    public final void h(Tab tab) {
        int e;
        PC pc = this.i;
        boolean L = pc.L();
        Intent intent = this.A;
        if (!L) {
            WK2.V0(tab, intent);
            tab.a().requestFocus();
        }
        if (!tab.isIncognito()) {
            C2480Tc0 c2480Tc0 = new C2480Tc0(this);
            tab.v(c2480Tc0);
            c2480Tc0.l0(tab);
        }
        InterfaceC3241Yy1 interfaceC3241Yy1 = this.o;
        BA0 ba0 = (BA0) interfaceC3241Yy1.get();
        C2468Sz3 c2468Sz3 = this.j;
        c2468Sz3.h.add(ba0);
        c2468Sz3.h.add(this.q);
        CustomTabsConnection customTabsConnection = this.h;
        CustomTabsSessionToken customTabsSessionToken = this.z;
        C1078Ih2 c1078Ih2 = new C1078Ih2(customTabsConnection, customTabsSessionToken, tab);
        HashSet hashSet = c2468Sz3.g;
        hashSet.add(c1078Ih2);
        hashSet.add(new OO0((C2875Wd0) interfaceC3241Yy1.get(), tab));
        c2468Sz3.b(tab);
        if (C1186Jd0.T(intent, customTabsSessionToken) && (e = pc.j().e()) != 0) {
            tab.a().setBackgroundColor(e);
            tab.v(new C2740Vc0(this));
        }
    }
}
