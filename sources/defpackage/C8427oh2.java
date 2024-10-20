package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.history.BrowsingHistoryBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oh2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8427oh2 implements Callback {
    public final /* synthetic */ C9455rh2 a;

    public /* synthetic */ C8427oh2(C9455rh2 c9455rh2) {
        this.a = c9455rh2;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C9455rh2 c9455rh2 = this.a;
        c9455rh2.getClass();
        c9455rh2.o = ((Long) obj).longValue();
        BrowsingHistoryBridge browsingHistoryBridge = c9455rh2.m;
        if (browsingHistoryBridge != null) {
            long j = browsingHistoryBridge.b;
            if (j != 0) {
                N.MZEuRD6z(j, browsingHistoryBridge);
                browsingHistoryBridge.b = 0L;
            }
            c9455rh2.m = null;
        }
        c9455rh2.h();
    }
}
