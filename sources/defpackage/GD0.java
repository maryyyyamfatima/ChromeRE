package defpackage;

import J.N;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.usage_stats.UsageStatsBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class GD0 implements Callback {
    public final /* synthetic */ OD0 a;
    public final /* synthetic */ List g;
    public final /* synthetic */ MC2 h;

    public /* synthetic */ GD0(List list, MC2 mc2, OD0 od0) {
        this.a = od0;
        this.g = list;
        this.h = mc2;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        final List list = (List) obj;
        OD0 od0 = this.a;
        od0.getClass();
        final List list2 = this.g;
        String[] strArr = (String[]) list2.toArray(new String[list2.size()]);
        final MC2 mc2 = this.h;
        Callback callback = new Callback() { // from class: MD0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                MC2 mc22 = mc2;
                if (booleanValue) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (list2.contains(((C10185to4) it.next()).b)) {
                            it.remove();
                        }
                    }
                    mc22.b(null);
                    return;
                }
                mc22.e(null);
            }
        };
        UsageStatsBridge usageStatsBridge = od0.a;
        N.M67g7Hwt(usageStatsBridge.b, usageStatsBridge, strArr, callback);
    }
}
