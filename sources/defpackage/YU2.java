package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.offlinepages.OfflinePageBridge;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YU2 implements OfflinePageBridge.SavePageCallback {
    public final WindowAndroid a;
    public final Callback b;
    public final OfflinePageBridge c;

    public YU2(WindowAndroid windowAndroid, Callback callback, OfflinePageBridge offlinePageBridge) {
        this.a = windowAndroid;
        this.b = callback;
        this.c = offlinePageBridge;
    }

    @Override // org.chromium.chrome.browser.offlinepages.OfflinePageBridge.SavePageCallback
    public final void onSavePageDone(int i, String str, long j) {
        if (i != 0) {
            return;
        }
        XU2 xu2 = new XU2(this);
        OfflinePageBridge offlinePageBridge = this.c;
        N.M8YdeM7z(offlinePageBridge.a, offlinePageBridge, j, xu2);
    }
}
