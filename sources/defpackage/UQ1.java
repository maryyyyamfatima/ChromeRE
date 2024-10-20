package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UQ1 extends AbstractC6958kQ1 {
    public static final C4856eI1 f = new C4856eI1("MRDiscoveryCallback");
    public final TQ1 e;
    public final Map c = Collections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = Collections.synchronizedSet(new LinkedHashSet());
    public final SQ1 a = new SQ1(this);

    public UQ1(Context context) {
        this.e = new TQ1(context);
    }

    public final void m() {
        Set o;
        HashMap hashMap = new HashMap();
        synchronized (this.c) {
            for (String str : this.c.keySet()) {
                RQ1 rq1 = (RQ1) this.c.get(AbstractC6722jk.b(str));
                if (rq1 == null) {
                    int i = AbstractC1472Li1.h;
                    o = UL2.o;
                } else {
                    o = AbstractC1472Li1.o(rq1.a);
                }
                if (!o.isEmpty()) {
                    hashMap.put(str, o);
                }
            }
        }
        AbstractC0952Hi1.b(hashMap);
    }

    public final void p(DQ1 dq1, boolean z) {
        boolean z2;
        boolean remove;
        C4856eI1 c4856eI1 = f;
        c4856eI1.a("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), dq1);
        synchronized (this.c) {
            c4856eI1.a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
            z2 = false;
            for (Map.Entry entry : this.c.entrySet()) {
                String str = (String) entry.getKey();
                RQ1 rq1 = (RQ1) entry.getValue();
                if (dq1.h(rq1.b)) {
                    if (z) {
                        C4856eI1 c4856eI12 = f;
                        c4856eI12.a("Adding/updating route for appId " + str, new Object[0]);
                        remove = rq1.a.add(dq1);
                        if (!remove) {
                            c4856eI12.g("Route " + String.valueOf(dq1) + " already exists for appId " + str, new Object[0]);
                        }
                    } else {
                        C4856eI1 c4856eI13 = f;
                        c4856eI13.a("Removing route for appId " + str, new Object[0]);
                        remove = rq1.a.remove(dq1);
                        if (!remove) {
                            c4856eI13.g("Route " + String.valueOf(dq1) + " already removed from appId " + str, new Object[0]);
                        }
                    }
                    z2 = remove;
                }
            }
        }
        if (z2) {
            f.a("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.b) {
                m();
                Iterator it = this.b.iterator();
                if (it.hasNext()) {
                    X5.a(it.next());
                    throw null;
                }
            }
        }
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void d(DQ1 dq1) {
        f.a("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        p(dq1, true);
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void e(MQ1 mq1, DQ1 dq1) {
        f.a("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        p(dq1, true);
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void f(DQ1 dq1) {
        f.a("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        p(dq1, false);
    }

    public final void n() {
        C4856eI1 c4856eI1 = f;
        c4856eI1.a(AbstractC9307rF1.a("Starting RouteDiscovery with ", this.d.size(), " IDs"), new Object[0]);
        c4856eI1.a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            o();
        } else {
            new HandlerC10413uU3(Looper.getMainLooper()).post(new Runnable() { // from class: QQ1
                @Override // java.lang.Runnable
                public final void run() {
                    UQ1.this.o();
                }
            });
        }
    }

    public final void o() {
        TQ1 tq1 = this.e;
        if (tq1.b == null) {
            tq1.b = MQ1.d(tq1.a);
        }
        MQ1 mq1 = tq1.b;
        if (mq1 != null) {
            mq1.j(this);
        }
        synchronized (this.d) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String b = AH.b(str);
                    if (b == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(b)) {
                        arrayList.add(b);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    C6614jQ1 c6614jQ1 = new C6614jQ1(bundle, arrayList);
                    if (((RQ1) this.c.get(str)) == null) {
                        this.c.put(str, new RQ1(c6614jQ1));
                    }
                    f.a("Adding mediaRouter callback for control category " + AH.b(str), new Object[0]);
                    TQ1 tq12 = this.e;
                    if (tq12.b == null) {
                        tq12.b = MQ1.d(tq12.a);
                    }
                    tq12.b.a(c6614jQ1, this, 4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f.a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
    }
}
