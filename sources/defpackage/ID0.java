package defpackage;

import J.N;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.usage_stats.UsageStatsBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ID0 implements Callback {
    public final /* synthetic */ OD0 a;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ MC2 i;

    public /* synthetic */ ID0(OD0 od0, long j, long j2, MC2 mc2) {
        this.a = od0;
        this.g = j;
        this.h = j2;
        this.i = mc2;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        final long j = this.g;
        final long j2 = this.h;
        final MC2 mc2 = this.i;
        final List list = (List) obj;
        OD0 od0 = this.a;
        od0.getClass();
        Callback callback = new Callback() { // from class: LD0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                List list2;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                MC2 mc22 = mc2;
                if (booleanValue) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        list2 = list;
                        if (i2 < list2.size()) {
                            if (j <= ((C10185to4) list2.get(i2)).a) {
                                break;
                            } else {
                                i2++;
                            }
                        } else {
                            i2 = list2.size();
                            break;
                        }
                    }
                    while (true) {
                        if (i < list2.size()) {
                            if (j2 <= ((C10185to4) list2.get(i)).a) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            i = list2.size();
                            break;
                        }
                    }
                    list2.subList(i2, i).clear();
                    mc22.b(null);
                    return;
                }
                mc22.e(null);
            }
        };
        UsageStatsBridge usageStatsBridge = od0.a;
        usageStatsBridge.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        N.Mr1dopkU(usageStatsBridge.b, usageStatsBridge, timeUnit.toSeconds(j), timeUnit.toSeconds(j2), callback);
    }
}
