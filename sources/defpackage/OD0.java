package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.usage_stats.UsageStatsBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class OD0 {
    public final UsageStatsBridge a;
    public final MC2 b;

    public OD0(UsageStatsBridge usageStatsBridge) {
        this.a = usageStatsBridge;
        MC2 mc2 = new MC2();
        this.b = mc2;
        mc2.a(new DD0());
        N.M6Rdk6FF(usageStatsBridge.b, usageStatsBridge, new Callback() { // from class: FD0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                List<C12243zo4> list = (List) obj;
                OD0 od0 = OD0.this;
                od0.getClass();
                ArrayList arrayList = new ArrayList(list.size());
                for (C12243zo4 c12243zo4 : list) {
                    C10871vo4 c10871vo4 = c12243zo4.l;
                    if (c10871vo4 == null) {
                        c10871vo4 = C10871vo4.m;
                    }
                    long millis = TimeUnit.NANOSECONDS.toMillis(c10871vo4.l) + TimeUnit.SECONDS.toMillis(c10871vo4.k);
                    String str = c12243zo4.k;
                    int a = AbstractC11557xo4.a(c12243zo4.m);
                    if (a == 0) {
                        a = 1;
                    }
                    arrayList.add(new C10185to4(AbstractC2373Sg3.b(a), str, millis));
                }
                od0.b.b(arrayList);
            }
        });
    }
}
