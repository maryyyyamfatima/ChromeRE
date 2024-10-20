package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.chrome.browser.download.DownloadUtils;
import org.chromium.components.download.DownloadCollectionBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ku0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1401Ku0 extends AbstractC0185Bl {
    public String h;
    public final /* synthetic */ C1530Lu0 i;

    public C1401Ku0(C1530Lu0 c1530Lu0) {
        this.i = c1530Lu0;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        C1530Lu0 c1530Lu0 = this.i;
        Runnable runnable = c1530Lu0.a;
        if (runnable != null) {
            runnable.run();
        }
        String str = c1530Lu0.h;
        if (str != null) {
            DownloadUtils.openDownload(str, this.h, null, c1530Lu0.g, null, null, c1530Lu0.i);
        } else {
            DownloadManagerService.openDownloadsPage(c1530Lu0.g, c1530Lu0.i);
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        C1530Lu0 c1530Lu0 = this.i;
        File file = new File(c1530Lu0.h);
        String str = c1530Lu0.h;
        if (DownloadCollectionBridge.shouldPublishDownload(str)) {
            Uri b = DownloadCollectionBridge.b(file.getName());
            this.h = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file).toString()));
            if (b != null) {
                return b.toString();
            }
        } else if (file.exists()) {
            return str;
        }
        return null;
    }
}
