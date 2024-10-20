package defpackage;

import J.N;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.usage_stats.UsageStatsBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class HD0 implements Callback {
    public final /* synthetic */ OD0 a;
    public final /* synthetic */ MC2 g;

    public /* synthetic */ HD0(OD0 od0, MC2 mc2) {
        this.a = od0;
        this.g = mc2;
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
        final MC2 mc2 = this.g;
        Callback callback = new Callback() { // from class: KD0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                MC2 mc22 = mc2;
                if (booleanValue) {
                    list.clear();
                    mc22.b(null);
                } else {
                    mc22.e(null);
                }
            }
        };
        UsageStatsBridge usageStatsBridge = od0.a;
        N.Mot8dCyk(usageStatsBridge.b, usageStatsBridge, callback);
    }
}
