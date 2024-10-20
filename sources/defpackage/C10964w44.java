package defpackage;

import android.app.Activity;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.usage_stats.UsageStatsBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w44 */
/* loaded from: classes2.dex */
public final class C10964w44 {
    public static C10964w44 i;
    public final Profile a;
    public final OD0 b;
    public final P72 c;
    public final C7806ms3 d;
    public final C10383uO3 e;
    public final ArrayList f;
    public final C12233zn0 g;
    public boolean h;

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static C10964w44 b() {
        if (i == null) {
            i = new C10964w44();
        }
        return i;
    }

    public static void a(Activity activity, C6166i6 c6166i6, C8385oa2 c8385oa2) {
        if (c()) {
            C10964w44 b = b();
            b.getClass();
            Object obj = ThreadUtils.a;
            b.f.add(new WeakReference(new C1597Mh2(activity, c6166i6, b.b, b.e, b.d, c8385oa2)));
        }
    }

    public C10964w44() {
        Profile d = Profile.d();
        this.a = d;
        UsageStatsBridge usageStatsBridge = new UsageStatsBridge(d, this);
        this.b = new OD0(usageStatsBridge);
        P72 p72 = new P72(d);
        this.c = p72;
        C7806ms3 c7806ms3 = new C7806ms3(usageStatsBridge, p72);
        this.d = c7806ms3;
        this.e = new C10383uO3(usageStatsBridge);
        this.f = new ArrayList();
        this.g = AppHooks.get().f();
        c7806ms3.c.f(new C6431is3()).g(new Callback() { // from class: o44
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C10964w44.this.d((List) obj, true);
            }
        });
        Object obj = ThreadUtils.a;
        this.h = R44.a(d).a("usage_stats_reporting.enabled");
    }

    public final void d(List list, boolean z) {
        Iterator it = AbstractC9048qW.e(this.f).iterator();
        while (it.hasNext()) {
            C1597Mh2 c1597Mh2 = (C1597Mh2) it.next();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                Tab tab = c1597Mh2.k;
                if (tab != null && tab.isInitialized()) {
                    C5744gs3 W0 = C5744gs3.W0(c1597Mh2.k, c1597Mh2.j);
                    if (str.equals(c1597Mh2.l) || str.equals(W0.i)) {
                        if (c1597Mh2.V0(str, z)) {
                            C10185to4 c10185to4 = new C10185to4(2, c1597Mh2.l, System.currentTimeMillis());
                            OD0 od0 = c1597Mh2.g;
                            od0.getClass();
                            od0.b.h(new JD0(od0, c10185to4, new MC2()), new DD0());
                            String str2 = c1597Mh2.l;
                            C10383uO3 c10383uO3 = c1597Mh2.h;
                            c10383uO3.getClass();
                            c10383uO3.a.f(new C10040tO3(str2)).g(new C1338Kh2(c1597Mh2, "reportUsageStop"));
                            c1597Mh2.l = null;
                        }
                    }
                }
            }
        }
    }
}
