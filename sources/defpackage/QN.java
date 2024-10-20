package defpackage;

import android.os.Environment;
import android.util.Pair;
import java.io.File;
import org.chromium.chrome.browser.download.DownloadController;
import org.chromium.chrome.browser.download.DownloadInfo;
import org.chromium.chrome.browser.download.DownloadItem;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QN extends AbstractC0185Bl {
    public final /* synthetic */ DownloadInfo h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ RN k;

    public QN(RN rn, DownloadInfo downloadInfo, String str, String str2) {
        this.k = rn;
        this.h = downloadInfo;
        this.i = str;
        this.j = str2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        GURL gurl;
        Pair pair = (Pair) obj;
        String str = (String) pair.first;
        File file = (File) pair.second;
        this.k.getClass();
        DownloadInfo downloadInfo = this.h;
        int i = 1007;
        boolean z = false;
        if (file == null) {
            AbstractC4851eH1.a("Download", "Download failed: no SD card", new Object[0]);
            DownloadManagerService.i().q(new DownloadItem(downloadInfo, false), 1007);
        } else if (str.equals("mounted")) {
            z = true;
        } else {
            if (str.equals("shared")) {
                AbstractC4851eH1.a("Download", "Download failed: SD card unavailable", new Object[0]);
                i = 1001;
            } else {
                AbstractC4851eH1.a("Download", "Download failed: no SD card", new Object[0]);
            }
            DownloadManagerService.i().q(new DownloadItem(downloadInfo, false), i);
        }
        if (z && (gurl = downloadInfo.a) != null) {
            C0216Br0 b = C0216Br0.b(downloadInfo);
            b.a = gurl;
            b.c = this.i;
            b.f = gurl.i();
            b.e = this.j;
            b.l = true;
            DownloadController.a(new DownloadInfo(b));
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        String externalStorageState = Environment.getExternalStorageState();
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (!externalStoragePublicDirectory.mkdir() && !externalStoragePublicDirectory.isDirectory()) {
            externalStoragePublicDirectory = null;
        }
        return new Pair(externalStorageState, externalStoragePublicDirectory);
    }
}
