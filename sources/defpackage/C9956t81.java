package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.history_clusters.HistoryClustersResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t81, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9956t81 implements Callback {
    public final /* synthetic */ H81 a;

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        this.a.v((HistoryClustersResult) obj);
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }
}
