package org.chromium.components.media_router;

import J.N;
import defpackage.AbstractC6450iw;
import defpackage.C1560Ma0;
import defpackage.C4005bp0;
import defpackage.C6614jQ1;
import defpackage.C7432ln3;
import defpackage.C8543p11;
import defpackage.DQ1;
import defpackage.HE;
import defpackage.IR0;
import defpackage.InterfaceC5240fQ1;
import defpackage.KE;
import defpackage.MQ1;
import defpackage.QE;
import defpackage.TR1;
import defpackage.UR1;
import defpackage.V60;
import defpackage.VH;
import defpackage.XP1;
import defpackage.ZP0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.SysUtils;
import org.chromium.chrome.browser.media.router.ChromeMediaRouterClient;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class BrowserMediaRouter implements XP1 {
    public long a;
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();

    public static MQ1 a() {
        try {
            C7432ln3 c = C7432ln3.c();
            try {
                MQ1 d = MQ1.d(V60.a);
                c.close();
                return d;
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused2) {
            return null;
        }
    }

    public final void c(int i, String str) {
        long j = this.a;
        if (j != 0) {
            N.MpDGY7p4(j, this, str, i);
        }
    }

    public final void d(int i, String str) {
        long j = this.a;
        if (j != 0) {
            N.M9VY0XZb(j, this, str, i);
        }
    }

    public static BrowserMediaRouter create(long j) {
        BrowserMediaRouter browserMediaRouter = new BrowserMediaRouter(j);
        C8543p11 c8543p11 = C8543p11.d;
        int c = c8543p11.c(V60.a, 12600000);
        if (c != 0) {
            c8543p11.k(V60.a, c);
        } else {
            KE ke = new KE(a(), browserMediaRouter);
            ArrayList arrayList = browserMediaRouter.b;
            arrayList.add(ke);
            arrayList.add(new QE(a(), browserMediaRouter));
        }
        return browserMediaRouter;
    }

    public boolean startObservingMediaSinks(String str) {
        if (SysUtils.isLowEndDevice()) {
            return false;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            HE he = (HE) ((InterfaceC5240fQ1) it.next());
            UR1 p = he.p(str);
            List list = HE.g;
            if (p == null) {
                he.s(str, list);
            } else {
                String a = p.a();
                HashMap hashMap = he.c;
                C4005bp0 c4005bp0 = (C4005bp0) hashMap.get(a);
                if (c4005bp0 != null) {
                    if (c4005bp0.c.add(str)) {
                        ((HE) c4005bp0.a).s(str, new ArrayList(c4005bp0.d));
                    }
                } else {
                    C6614jQ1 b = p.b();
                    if (b == null) {
                        he.s(str, list);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        MQ1 mq1 = he.a;
                        mq1.getClass();
                        for (DQ1 dq1 : MQ1.f()) {
                            if (dq1.h(b)) {
                                arrayList.add(TR1.a(dq1));
                            }
                        }
                        C4005bp0 c4005bp02 = new C4005bp0(str, arrayList, he, b);
                        mq1.a(b, c4005bp02, 4);
                        hashMap.put(a, c4005bp02);
                    }
                }
            }
        }
        return true;
    }

    public void stopObservingMediaSinks(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            HE he = (HE) ((InterfaceC5240fQ1) it.next());
            UR1 p = he.p(str);
            if (p != null) {
                String a = p.a();
                HashMap hashMap = he.c;
                C4005bp0 c4005bp0 = (C4005bp0) hashMap.get(a);
                if (c4005bp0 != null) {
                    HashSet hashSet = c4005bp0.c;
                    hashSet.remove(str);
                    if (hashSet.isEmpty()) {
                        he.a.j(c4005bp0);
                        hashMap.remove(a);
                    }
                }
            }
        }
        this.e.remove(str);
        this.d.remove(str);
    }

    public void createRoute(String str, String str2, String str3, String str4, WebContents webContents, int i) {
        TR1 tr1;
        DQ1 dq1;
        InterfaceC5240fQ1 b = b(str);
        if (b == null) {
            c(i, IR0.a("No provider supports createRoute with source: ", str, " and sink: ", str2));
            return;
        }
        ChromeMediaRouterClient.a.getClass();
        TabImpl tabImpl = (TabImpl) N.MMqeq$AW(webContents);
        int id = tabImpl == null ? -1 : tabImpl.getId();
        boolean isIncognito = webContents.isIncognito();
        HE he = (HE) b;
        if (he.v().g()) {
            he.v().getClass();
            AbstractC6450iw.c();
            he.q();
        }
        C1560Ma0 c1560Ma0 = he.f;
        XP1 xp1 = he.b;
        if (c1560Ma0 != null && c1560Ma0 != null) {
            ((BrowserMediaRouter) xp1).c(c1560Ma0.g, "Request replaced");
            he.f = null;
        }
        he.a.getClass();
        Iterator it = MQ1.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                tr1 = null;
                break;
            }
            TR1 a = TR1.a((DQ1) it.next());
            if (a.a.equals(str2)) {
                tr1 = a;
                break;
            }
        }
        if (tr1 == null) {
            ((BrowserMediaRouter) xp1).c(i, "No sink");
            return;
        }
        UR1 p = he.p(str);
        if (p == null) {
            ((BrowserMediaRouter) xp1).c(i, "Unsupported source URL");
            return;
        }
        Iterator it2 = MQ1.f().iterator();
        while (true) {
            if (!it2.hasNext()) {
                dq1 = null;
                break;
            } else {
                dq1 = (DQ1) it2.next();
                if (dq1.c.equals(tr1.a)) {
                    break;
                }
            }
        }
        if (dq1 == null) {
            ((BrowserMediaRouter) xp1).c(i, "The sink does not exist");
        }
        VH.a().c.a(he);
        he.f = new C1560Ma0(p, tr1, str3, str4, id, isIncognito, i, dq1);
        AbstractC6450iw v = he.v();
        v.c = v.b.f;
        VH.a().d(v.c.a.a());
        v.c.h.l();
    }

    public void joinRoute(String str, String str2, String str3, WebContents webContents, int i) {
        InterfaceC5240fQ1 b = b(str);
        if (b == null) {
            d(i, "Route not found.");
            return;
        }
        ChromeMediaRouterClient.a.getClass();
        TabImpl tabImpl = (TabImpl) N.MMqeq$AW(webContents);
        b.c(tabImpl == null ? -1 : tabImpl.getId(), str, str2, str3, i);
    }

    public void closeRoute(String str) {
        InterfaceC5240fQ1 interfaceC5240fQ1 = (InterfaceC5240fQ1) this.c.get(str);
        if (interfaceC5240fQ1 == null) {
            return;
        }
        interfaceC5240fQ1.n(str);
    }

    public void detachRoute(String str) {
        HashMap hashMap = this.c;
        InterfaceC5240fQ1 interfaceC5240fQ1 = (InterfaceC5240fQ1) hashMap.get(str);
        if (interfaceC5240fQ1 == null) {
            return;
        }
        interfaceC5240fQ1.e(str);
        hashMap.remove(str);
    }

    public void sendStringMessage(String str, String str2) {
        InterfaceC5240fQ1 interfaceC5240fQ1 = (InterfaceC5240fQ1) this.c.get(str);
        if (interfaceC5240fQ1 == null) {
            return;
        }
        interfaceC5240fQ1.h(str, str2);
    }

    public FlingingControllerBridge getFlingingControllerBridge(String str) {
        ZP0 b;
        InterfaceC5240fQ1 interfaceC5240fQ1 = (InterfaceC5240fQ1) this.c.get(str);
        if (interfaceC5240fQ1 == null || (b = interfaceC5240fQ1.b(str)) == null) {
            return null;
        }
        return new FlingingControllerBridge(b);
    }

    public BrowserMediaRouter(long j) {
        this.a = j;
    }

    public void teardown() {
        this.a = 0L;
    }

    public String getSinkName(String str, int i) {
        return ((TR1) ((List) this.e.get(str)).get(i)).b;
    }

    public String getSinkUrn(String str, int i) {
        return "urn:x-org.chromium:media:sink:cast-" + ((TR1) ((List) this.e.get(str)).get(i)).a;
    }

    public final InterfaceC5240fQ1 b(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            InterfaceC5240fQ1 interfaceC5240fQ1 = (InterfaceC5240fQ1) it.next();
            if (((HE) interfaceC5240fQ1).p(str) != null) {
                return interfaceC5240fQ1;
            }
        }
        return null;
    }
}
