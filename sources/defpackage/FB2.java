package defpackage;

import J.N;
import org.chromium.chrome.browser.download.DownloadController;
import org.chromium.chrome.browser.download.DownloadManagerService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FB2 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (AX.e().g("type")) {
            return;
        }
        DownloadManagerService i = DownloadManagerService.i();
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("UseDownloadOfflineContentProvider")) {
            return;
        }
        DownloadController.a = i;
    }
}
