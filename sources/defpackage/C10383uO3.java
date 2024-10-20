package defpackage;

import J.N;
import java.util.Iterator;
import java.util.Map;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.usage_stats.UsageStatsBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uO3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10383uO3 {
    public final MC2 a;
    public C7294lO3 b;
    public final UsageStatsBridge c;

    public C10383uO3(UsageStatsBridge usageStatsBridge) {
        this.c = usageStatsBridge;
        MC2 mc2 = new MC2();
        this.a = mc2;
        N.MiNnjkrf(usageStatsBridge.b, usageStatsBridge, new Callback() { // from class: nO3
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Map map = (Map) obj;
                C10383uO3 c10383uO3 = C10383uO3.this;
                c10383uO3.getClass();
                Iterator it = map.entrySet().iterator();
                long j = 0;
                while (it.hasNext()) {
                    j = Math.max(j, Long.valueOf((String) ((Map.Entry) it.next()).getKey()).longValue());
                }
                c10383uO3.b = new C7294lO3(j + 1);
                c10383uO3.a.b(map);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        });
        mc2.a(new DD0());
    }

    public static String a(Map map, String str) {
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getValue()).equals(str)) {
                return (String) entry.getKey();
            }
        }
        return null;
    }
}
