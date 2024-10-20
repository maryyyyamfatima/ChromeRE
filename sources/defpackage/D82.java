package defpackage;

import android.app.DownloadManager;
import org.chromium.chrome.browser.download.DownloadInfo;
import org.chromium.chrome.browser.download.DownloadManagerService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class D82 extends AbstractC0185Bl {
    public final B82 h;
    public final DownloadInfo i;
    public final String j;
    public final long k;
    public DownloadInfo l;
    public final /* synthetic */ E82 m;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        E82 e82 = this.m;
        if (booleanValue) {
            if (this.l != null) {
                DownloadManagerService.i().g.e(this.l, this.k, false, false);
            }
            e82.i(this.h);
        } else {
            long j = this.k;
            if (j != -1) {
                ((DownloadManager) e82.a.getSystemService("download")).remove(j);
            }
        }
    }

    public D82(E82 e82, B82 b82, DownloadInfo downloadInfo, long j, String str) {
        this.m = e82;
        this.h = b82;
        this.i = downloadInfo;
        this.j = str;
        this.k = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a9, code lost:            if (r6 == null) goto L292;     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    @Override // defpackage.AbstractC0185Bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.D82.b():java.lang.Object");
    }
}
