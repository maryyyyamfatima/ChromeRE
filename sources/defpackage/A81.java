package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.history_clusters.HistoryClustersResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class A81 implements Callback {
    public final /* synthetic */ H81 a;

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        H81.t(this.a, (HistoryClustersResult) obj);
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }
}
