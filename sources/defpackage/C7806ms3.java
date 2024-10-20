package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.usage_stats.UsageStatsBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ms3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7806ms3 {
    public final UsageStatsBridge a;
    public final P72 b;
    public final MC2 c = new MC2();
    public MC2 d;

    /* JADX WARN: Type inference failed for: r5v2, types: [hs3] */
    public C7806ms3(UsageStatsBridge usageStatsBridge, P72 p72) {
        this.a = usageStatsBridge;
        this.b = p72;
        final ?? r5 = new Callback() { // from class: hs3
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C7806ms3.this.c.b((List) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        };
        N.MggFWmhE(usageStatsBridge.b, usageStatsBridge, new Callback() { // from class: a44
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                r5.onResult(new ArrayList(Arrays.asList((String[]) obj)));
            }
        });
        this.d = MC2.c(null);
    }
}
