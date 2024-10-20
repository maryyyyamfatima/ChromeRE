package defpackage;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.DownloadManagerBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hs0 */
/* loaded from: classes.dex */
public final class C6085hs0 extends AbstractC0185Bl {
    public final C4709ds0 h;
    public final Callback i;
    public long j;
    public int k;
    public long l;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        C5053es0 c5053es0 = new C5053es0();
        c5053es0.b = ((Boolean) obj).booleanValue();
        c5053es0.c = this.k;
        c5053es0.a = this.j;
        c5053es0.d = this.l;
        this.i.onResult(c5053es0);
    }

    public C6085hs0(C4709ds0 c4709ds0, Callback callback) {
        this.h = c4709ds0;
        this.i = callback;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        C4709ds0 c4709ds0 = this.h;
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(c4709ds0.a));
            request.setMimeType(c4709ds0.d);
            try {
                if (c4709ds0.h) {
                    String str = c4709ds0.b;
                    if (str != null) {
                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str);
                    }
                } else {
                    Object obj = DownloadManagerBridge.a;
                    File file = new File(V60.a.getExternalFilesDir(null), "Download");
                    if (!file.mkdir() && !file.isDirectory()) {
                        AbstractC4851eH1.a("DownloadDelegate", "Cannot create download directory", new Object[0]);
                        this.k = 1001;
                        return Boolean.FALSE;
                    }
                    request.setDestinationUri(Uri.fromFile(new File(file, c4709ds0.b)));
                }
                if (c4709ds0.h) {
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                } else {
                    request.setNotificationVisibility(0);
                }
                String str2 = c4709ds0.c;
                if (TextUtils.isEmpty(str2)) {
                    str2 = c4709ds0.b;
                }
                request.setDescription(str2);
                request.setTitle(c4709ds0.b);
                request.addRequestHeader("Cookie", c4709ds0.e);
                request.addRequestHeader("referrer", c4709ds0.f);
                request.addRequestHeader("User-Agent", c4709ds0.g);
                Object obj2 = DownloadManagerBridge.a;
                DownloadManager downloadManager = (DownloadManager) V60.a.getSystemService("download");
                try {
                    this.l = System.currentTimeMillis();
                    this.j = downloadManager.enqueue(request);
                    return Boolean.TRUE;
                } catch (IllegalArgumentException e) {
                    AbstractC4851eH1.a("DownloadDelegate", "Download failed: " + e, new Object[0]);
                    this.k = 1000;
                    return Boolean.FALSE;
                } catch (RuntimeException e2) {
                    AbstractC4851eH1.a("DownloadDelegate", "Failed to create target file on the external storage: " + e2, new Object[0]);
                    this.k = 1001;
                    return Boolean.FALSE;
                }
            } catch (IllegalStateException unused) {
                AbstractC4851eH1.a("DownloadDelegate", "Cannot create download directory", new Object[0]);
                this.k = 1001;
                return Boolean.FALSE;
            }
        } catch (IllegalArgumentException unused2) {
            AbstractC4851eH1.a("DownloadDelegate", "Cannot download non http or https scheme", new Object[0]);
            this.k = 1002;
            return Boolean.FALSE;
        }
    }
}
