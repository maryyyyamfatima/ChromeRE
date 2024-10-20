package defpackage;

import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.chrome.browser.offlinepages.downloads.OfflinePageDownloadBridge;
import org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ha2 */
/* loaded from: classes.dex */
public abstract class AbstractC0913Ha2 {
    public static C0783Ga2 a;

    public static C0783Ga2 a() {
        Object obj = ThreadUtils.a;
        if (a == null) {
            OfflineContentAggregatorBridge a2 = AbstractC0653Fa2.a();
            C7474lu3 c7474lu3 = DownloadManagerService.i().g;
            if (OfflinePageDownloadBridge.a == null) {
                OfflinePageDownloadBridge.a = new OfflinePageDownloadBridge();
            }
            a = new C0783Ga2(a2, c7474lu3);
        }
        return a;
    }
}
