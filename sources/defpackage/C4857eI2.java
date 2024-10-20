package defpackage;

import J.N;
import android.app.Activity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.ntp.ForeignSessionHelper;
import org.chromium.chrome.browser.ntp.RecentlyClosedBridge;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.components.signin.AccountManagerFacadeProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eI2 */
/* loaded from: classes.dex */
public final class C4857eI2 implements InterfaceC1528Lt3, InterfaceC5298fb3, InterfaceC9979tC2, F4 {
    public final Profile a;
    public final Tab g;
    public final InterfaceC10590uz3 h;
    public final Runnable i;
    public TabModel j;
    public ForeignSessionHelper m;
    public List n;
    public ArrayList o;
    public C5545gI2 p;
    public RecentlyClosedBridge q;
    public SigninManager r;
    public InterfaceC4514dI2 s;
    public boolean t;
    public final C10322uC2 u;
    public final C0009Ab3 v;
    public final AbstractC1658Mt3 w;
    public int k = 0;
    public final HashMap x = new HashMap();
    public final HashMap y = new HashMap();
    public final HashMap z = new HashMap();
    public WH0 l = new WH0();

    @Override // defpackage.InterfaceC5298fb3
    public final /* synthetic */ void i() {
    }

    public C4857eI2(Tab tab, InterfaceC10590uz3 interfaceC10590uz3, Profile profile, Activity activity, RunnableC6825k12 runnableC6825k12) {
        this.a = profile;
        this.g = tab;
        this.h = interfaceC10590uz3;
        this.i = runnableC6825k12;
        this.m = new ForeignSessionHelper(profile);
        this.p = new C5545gI2(profile);
        this.q = new RecentlyClosedBridge(profile, interfaceC10590uz3);
        C1202Jg1.a().getClass();
        this.r = C1202Jg1.c(profile);
        C10322uC2 b = C10322uC2.b(activity);
        this.u = b;
        this.v = new C0009Ab3(16, C3083Xs3.a());
        AbstractC1658Mt3 b2 = AbstractC1658Mt3.b();
        this.w = b2;
        this.q.c = new Runnable() { // from class: bI2
            @Override // java.lang.Runnable
            public final void run() {
                C4857eI2.this.j();
            }
        };
        j();
        ForeignSessionHelper foreignSessionHelper = this.m;
        N.MiRrgRsD(foreignSessionHelper.a, new ForeignSessionHelper.ForeignSessionCallback() { // from class: cI2
            @Override // org.chromium.chrome.browser.ntp.ForeignSessionHelper.ForeignSessionCallback
            public final void onUpdated() {
                C4857eI2.this.f();
            }
        });
        f();
        N.Mwf$8a3o(this.m.a);
        b2.a(this);
        this.r.b(this);
        b.a(this);
        AccountManagerFacadeProvider.getInstance().b(this);
        h();
        Object obj = ThreadUtils.a;
        if (T43.j == null) {
            T43.j = new T43(profile, new WP2());
        }
        T43 t43 = T43.j;
        int i = t43.i + 1;
        t43.i = i;
        if (i == 1) {
            t43.a(20000L, true);
        }
    }

    public static void d(HashMap hashMap, String str) {
        int size = hashMap.size();
        EI2.c(size, "Tabs.RecentlyClosed.EntriesShownInPage.".concat(str));
        if (size > 0) {
            Iterator it = hashMap.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((Boolean) it.next()).booleanValue() ? 1 : 0;
            }
            EI2.c(i, "Tabs.RecentlyClosed.EntriesRestoredInPage.".concat(str));
            EI2.l(Math.round((i * 100.0f) / size), "Tabs.RecentlyClosed.PercentOfEntriesRestoredInPage.".concat(str));
        }
    }

    public final void j() {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("BulkTabRestore")) {
            RecentlyClosedBridge recentlyClosedBridge = this.q;
            recentlyClosedBridge.getClass();
            ArrayList arrayList = new ArrayList();
            this.o = N.Mihu$Iyc(recentlyClosedBridge.a, arrayList, 5) ? arrayList : null;
        } else {
            RecentlyClosedBridge recentlyClosedBridge2 = this.q;
            recentlyClosedBridge2.getClass();
            ArrayList arrayList2 = new ArrayList();
            this.o = N.MDcVP4$A(recentlyClosedBridge2.a, arrayList2, 5) ? arrayList2 : null;
        }
        for (AbstractC11381xI2 abstractC11381xI2 : this.o) {
            if (abstractC11381xI2 instanceof C12067zI2) {
                Integer valueOf = Integer.valueOf(abstractC11381xI2.a);
                HashMap hashMap = this.x;
                if (!hashMap.containsKey(valueOf)) {
                    hashMap.put(Integer.valueOf(abstractC11381xI2.a), Boolean.FALSE);
                }
            }
            if (abstractC11381xI2 instanceof C11724yI2) {
                Integer valueOf2 = Integer.valueOf(abstractC11381xI2.a);
                HashMap hashMap2 = this.y;
                if (!hashMap2.containsKey(valueOf2)) {
                    hashMap2.put(Integer.valueOf(abstractC11381xI2.a), Boolean.FALSE);
                }
            }
            if (abstractC11381xI2 instanceof C11038wI2) {
                Integer valueOf3 = Integer.valueOf(abstractC11381xI2.a);
                HashMap hashMap3 = this.z;
                if (!hashMap3.containsKey(valueOf3)) {
                    hashMap3.put(Integer.valueOf(abstractC11381xI2.a), Boolean.FALSE);
                }
            }
        }
        InterfaceC4514dI2 interfaceC4514dI2 = this.s;
        if (interfaceC4514dI2 != null) {
            ((ViewOnAttachStateChangeListenerC5201fI2) interfaceC4514dI2).d();
        }
    }

    public final void f() {
        List emptyList;
        ForeignSessionHelper foreignSessionHelper = this.m;
        if (!N.MWH8i2u_(foreignSessionHelper.a)) {
            emptyList = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            emptyList = !N.MrEqlTFQ(foreignSessionHelper.a, arrayList) ? Collections.emptyList() : arrayList;
        }
        this.n = emptyList;
        InterfaceC4514dI2 interfaceC4514dI2 = this.s;
        if (interfaceC4514dI2 != null) {
            ((ViewOnAttachStateChangeListenerC5201fI2) interfaceC4514dI2).d();
        }
    }

    public final void a(ForeignSessionHelper.ForeignSession foreignSession, C6967kS0 c6967kS0, int i) {
        if (this.t) {
            return;
        }
        FI2.a("MobileRecentTabManagerTabFromOtherDeviceOpened");
        ForeignSessionHelper foreignSessionHelper = this.m;
        N.MRO3CB0d(foreignSessionHelper.a, this.g, foreignSession.a, c6967kS0.c, i);
    }

    public final void c(C12067zI2 c12067zI2, int i) {
        if (this.t) {
            return;
        }
        this.x.put(Integer.valueOf(c12067zI2.a), Boolean.TRUE);
        FI2.a("MobileRecentTabManagerRecentTabOpened");
        RecentlyClosedBridge recentlyClosedBridge = this.q;
        TabModel tabModel = this.j;
        if (tabModel == null) {
            tabModel = ((AbstractC11276wz3) this.h).k(this.g.getId());
            this.j = tabModel;
        }
        N.MvBdqLcK(recentlyClosedBridge.a, tabModel, c12067zI2.a, i);
    }

    public final void h() {
        int i;
        boolean z = true;
        if (!this.r.p().c(1)) {
            if (this.r.n()) {
                i = this.r.p().c(0) ? 2 : 1;
            }
            i = 0;
        } else {
            if (!this.w.j() || this.n.isEmpty()) {
                i = 3;
            }
            i = 0;
        }
        int i2 = this.k;
        if (i == i2) {
            return;
        }
        if ((i2 != 0 && i2 != 3) || (i != 2 && i != 1)) {
            z = false;
        }
        if (z) {
            this.v.d();
        }
        this.k = i;
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void b() {
        e();
    }

    @Override // defpackage.InterfaceC5298fb3
    public final void g() {
        e();
    }

    @Override // defpackage.F4
    public final void E() {
        e();
    }

    @Override // defpackage.InterfaceC9979tC2
    public final void u(String str) {
        e();
    }

    @Override // defpackage.InterfaceC1528Lt3
    public final void B() {
        e();
    }

    public final void e() {
        h();
        if (this.t) {
            return;
        }
        f();
        InterfaceC4514dI2 interfaceC4514dI2 = this.s;
        if (interfaceC4514dI2 != null) {
            ((ViewOnAttachStateChangeListenerC5201fI2) interfaceC4514dI2).d();
        }
    }
}
