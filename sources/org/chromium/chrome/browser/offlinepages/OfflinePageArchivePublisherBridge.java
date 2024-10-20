package org.chromium.chrome.browser.offlinepages;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Build;
import defpackage.AbstractC4851eH1;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class OfflinePageArchivePublisherBridge {
    public static boolean isAndroidDownloadManagerInstalled() {
        return ((DownloadManager) V60.a.getSystemService("download")) != null;
    }

    public static int remove(long[] jArr) {
        DownloadManager downloadManager = (DownloadManager) V60.a.getSystemService("download");
        if (downloadManager == null) {
            return 0;
        }
        try {
            return downloadManager.remove(jArr);
        } catch (Exception e) {
            AbstractC4851eH1.d("OPArchivePublisher", "ADM threw while trying to remove a download. " + e, new Object[0]);
            return 0;
        }
    }

    public static long addCompletedDownload(String str, String str2, String str3, long j, String str4, String str5) {
        long addCompletedDownload;
        try {
            if (Build.VERSION.SDK_INT < 24) {
                DownloadManager downloadManager = (DownloadManager) V60.a.getSystemService("download");
                if (downloadManager == null) {
                    return 0L;
                }
                return downloadManager.addCompletedDownload(str, str2, false, "multipart/related", str3, j, false);
            }
            DownloadManager downloadManager2 = (DownloadManager) V60.a.getSystemService("download");
            if (downloadManager2 == null) {
                return 0L;
            }
            addCompletedDownload = downloadManager2.addCompletedDownload(str, str2, false, "multipart/related", str3, j, false, Uri.parse(str4), Uri.parse(str5));
            return addCompletedDownload;
        } catch (Exception e) {
            AbstractC4851eH1.d("OPArchivePublisher", "ADM threw while trying to add a download. " + e, new Object[0]);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String publishArchiveToDownloadsCollection(org.chromium.chrome.browser.offlinepages.OfflinePageItem r17) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.offlinepages.OfflinePageArchivePublisherBridge.publishArchiveToDownloadsCollection(org.chromium.chrome.browser.offlinepages.OfflinePageItem):java.lang.String");
    }
}
