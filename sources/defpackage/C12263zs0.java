package defpackage;

import J.N;
import android.content.Intent;
import java.util.HashSet;
import org.chromium.chrome.browser.download.DownloadInfo;
import org.chromium.chrome.browser.download.DownloadItem;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.chrome.browser.download.MimeUtils;
import org.chromium.chrome.browser.profiles.OTRProfileID;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zs0 */
/* loaded from: classes.dex */
public final class C12263zs0 extends AbstractC0185Bl {
    public final /* synthetic */ DownloadItem h;
    public final /* synthetic */ C5397fs0 i;
    public final /* synthetic */ DownloadManagerService j;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        DownloadItem downloadItem = this.h;
        String str = downloadItem.c.c;
        HashSet hashSet = DownloadManagerService.s;
        boolean M4t0L845 = N.M4t0L845(str);
        DownloadInfo downloadInfo = downloadItem.c;
        Intent k = DownloadManagerService.k(downloadInfo.g, downloadItem.d, M4t0L845, null, null, downloadInfo.c);
        return Boolean.valueOf(k == null ? false : C12055zG0.q(k));
    }

    public C12263zs0(DownloadManagerService downloadManagerService, DownloadItem downloadItem, C5397fs0 c5397fs0) {
        this.j = downloadManagerService;
        this.h = downloadItem;
        this.i = c5397fs0;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean canAutoOpenMimeType = MimeUtils.canAutoOpenMimeType(this.i.c);
        DownloadManagerService downloadManagerService = this.j;
        DownloadItem downloadItem = this.h;
        if (!canAutoOpenMimeType || !downloadItem.c.m || !bool.booleanValue()) {
            OTRProfileID oTRProfileID = downloadItem.c.u;
            C1910Os0 c1910Os0 = downloadManagerService.n;
            if (c1910Os0 != null) {
                c1910Os0.d(DownloadItem.a(downloadItem), null);
                return;
            }
            return;
        }
        HashSet hashSet = DownloadManagerService.s;
        downloadManagerService.n(downloadItem);
    }
}
