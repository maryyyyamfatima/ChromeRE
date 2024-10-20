package defpackage;

import J.N;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.components.media_router.BrowserMediaRouter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class HE implements InterfaceC5240fQ1, InterfaceC4348cp0, J43 {
    public static final List g = Collections.emptyList();
    public final MQ1 a;
    public final XP1 b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final Handler e = new Handler();
    public C1560Ma0 f;

    @Override // defpackage.InterfaceC5240fQ1
    public ZP0 b(String str) {
        return null;
    }

    public abstract UR1 p(String str);

    public abstract AbstractC6450iw v();

    @Override // defpackage.J43
    public final void a(E43 e43, int i) {
        Iterator it = new HashSet(this.d.keySet()).iterator();
        while (it.hasNext()) {
            t((String) it.next(), "Launch error");
        }
        C1560Ma0 c1560Ma0 = this.f;
        if (c1560Ma0 == null) {
            return;
        }
        ((BrowserMediaRouter) this.b).c(c1560Ma0.g, "Launch error");
        this.f = null;
    }

    @Override // defpackage.J43
    public final void d(E43 e43, int i) {
        KM2 km2 = ((QH) e43).h;
        if (km2 != null) {
            long c = km2.c();
            long g2 = km2.g();
            EI2.h(g2 > 0 ? (int) (((g2 - c) * 10) / g2) : 10, 11, "Cast.Sender.Clank.CastTimeRemainingPercentage");
        }
        q();
    }

    @Override // defpackage.J43
    public final void f(E43 e43) {
        KM2 km2 = ((QH) e43).h;
        if (km2 != null) {
            long c = km2.c();
            long g2 = km2.g();
            EI2.h(g2 > 0 ? (int) (((g2 - c) * 10) / g2) : 10, 11, "Cast.Sender.Clank.CastTimeRemainingPercentage");
        }
        q();
    }

    @Override // defpackage.J43
    public final /* bridge */ /* synthetic */ void g(E43 e43, int i) {
    }

    @Override // defpackage.J43
    public final void i(E43 e43, boolean z) {
        v().a((QH) e43);
    }

    @Override // defpackage.J43
    public final void j(E43 e43, String str) {
        QH qh = (QH) e43;
        E43 c = VH.a().c.c();
        if (qh != ((c == null || !(c instanceof QH)) ? null : (QH) c) || qh == v().a || this.f == null) {
            return;
        }
        r(qh, str);
    }

    @Override // defpackage.J43
    public final /* bridge */ /* synthetic */ void k(E43 e43) {
    }

    @Override // defpackage.J43
    public final /* bridge */ /* synthetic */ void l(E43 e43, String str) {
    }

    @Override // defpackage.J43
    public final void m(E43 e43, int i) {
        v().b();
    }

    public HE(MQ1 mq1, BrowserMediaRouter browserMediaRouter) {
        this.a = mq1;
        this.b = browserMediaRouter;
    }

    public final void s(final String str, final List list) {
        list.size();
        this.e.post(new Runnable() { // from class: GE
            @Override // java.lang.Runnable
            public final void run() {
                HE he = HE.this;
                he.getClass();
                List list2 = list;
                list2.size();
                BrowserMediaRouter browserMediaRouter = (BrowserMediaRouter) he.b;
                HashMap hashMap = browserMediaRouter.d;
                String str2 = str;
                if (!hashMap.containsKey(str2)) {
                    hashMap.put(str2, new HashMap());
                }
                Map map = (Map) hashMap.get(str2);
                map.put(he, list2);
                ArrayList arrayList = new ArrayList();
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll((List) it.next());
                }
                browserMediaRouter.e.put(str2, arrayList);
                long j = browserMediaRouter.a;
                if (j != 0) {
                    N.M2xU9exV(j, browserMediaRouter, str2, arrayList.size());
                }
            }
        });
    }

    @Override // defpackage.InterfaceC5240fQ1
    public void n(String str) {
        if (((C6609jP1) this.d.get(str)) == null) {
            return;
        }
        if (!v().g()) {
            t(str, null);
        } else {
            v().getClass();
            AbstractC6450iw.c();
        }
    }

    @Override // defpackage.InterfaceC5240fQ1
    public void e(String str) {
        t(str, null);
    }

    public void r(QH qh, String str) {
        v().a(qh);
        v().i();
        C1560Ma0 c1560Ma0 = this.f;
        C6609jP1 c6609jP1 = new C6609jP1(c1560Ma0.b.a, c1560Ma0.a.c(), this.f.c);
        C1560Ma0 c1560Ma02 = this.f;
        o(c6609jP1, c1560Ma02.d, c1560Ma02.e, c1560Ma02.g, true);
        this.f = null;
    }

    public final void q() {
        if (this.f != null) {
            return;
        }
        v().h();
        v().b();
        this.a.getClass();
        MQ1.b();
        DQ1 dq1 = MQ1.c().r;
        if (dq1 != null) {
            MQ1.k(dq1);
            Iterator it = new HashSet(this.d.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                u(str);
                BrowserMediaRouter browserMediaRouter = (BrowserMediaRouter) this.b;
                long j = browserMediaRouter.a;
                if (j != 0) {
                    N.MsmvhUN_(j, browserMediaRouter, str);
                }
                browserMediaRouter.c.remove(str);
            }
            I43 i43 = VH.a().c;
            i43.getClass();
            try {
                InterfaceC10814vf1 interfaceC10814vf1 = i43.a;
                K43 k43 = new K43(this);
                C10128tf1 c10128tf1 = (C10128tf1) interfaceC10814vf1;
                Parcel a = c10128tf1.a();
                AbstractC11786yV.c(a, k43);
                c10128tf1.h(3, a);
                return;
            } catch (RemoteException unused) {
                I43.c.b("Unable to call %s on %s.", "removeSessionManagerListener", InterfaceC10814vf1.class.getSimpleName());
                return;
            }
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    public void o(C6609jP1 c6609jP1, String str, int i, int i2, boolean z) {
        this.d.put(c6609jP1.a, c6609jP1);
        String str2 = c6609jP1.a;
        String str3 = c6609jP1.b;
        BrowserMediaRouter browserMediaRouter = (BrowserMediaRouter) this.b;
        browserMediaRouter.c.put(str2, this);
        long j = browserMediaRouter.a;
        if (j != 0) {
            N.MKeidYbK(j, browserMediaRouter, str2, str3, i2, z);
        }
    }

    public final void t(String str, String str2) {
        u(str);
        BrowserMediaRouter browserMediaRouter = (BrowserMediaRouter) this.b;
        long j = browserMediaRouter.a;
        if (j != 0) {
            N.MRz6aWnp(j, browserMediaRouter, str, str2);
        }
        browserMediaRouter.c.remove(str);
    }

    public void u(String str) {
        this.d.remove(str);
    }
}
