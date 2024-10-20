package defpackage;

import android.util.Pair;
import org.chromium.chrome.browser.download.DownloadInfo;
import org.chromium.chrome.browser.download.DownloadItem;
import org.chromium.chrome.browser.download.DownloadManagerService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xs0 */
/* loaded from: classes.dex */
public final class C11577xs0 extends AbstractC0185Bl {
    public final /* synthetic */ DownloadItem h;
    public final /* synthetic */ DownloadInfo i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ DownloadManagerService k;

    public C11577xs0(DownloadManagerService downloadManagerService, DownloadItem downloadItem, DownloadInfo downloadInfo, boolean z) {
        this.k = downloadManagerService;
        this.h = downloadItem;
        this.i = downloadInfo;
        this.j = z;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Pair pair = (Pair) obj;
        DownloadItem downloadItem = this.h;
        DownloadInfo downloadInfo = downloadItem.c;
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        DownloadManagerService downloadManagerService = this.k;
        if (booleanValue) {
            downloadManagerService.g.e(downloadInfo, downloadItem.d, ((Boolean) pair.second).booleanValue(), this.j);
            C11814ya2 c11814ya2 = (C11814ya2) downloadManagerService.k.iterator();
            if (c11814ya2.hasNext()) {
                X5.a(c11814ya2.next());
                throw null;
            }
            return;
        }
        C0216Br0 b = C0216Br0.b(downloadInfo);
        b.F = 1;
        downloadManagerService.g.d(b.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:            if ((r0 == null ? false : defpackage.C12055zG0.q(r0)) != false) goto L137;     */
    @Override // defpackage.AbstractC0185Bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            r14 = this;
            java.util.HashSet r0 = org.chromium.chrome.browser.download.DownloadManagerService.s
            org.chromium.chrome.browser.download.DownloadManagerService r0 = r14.k
            r0.getClass()
            org.chromium.chrome.browser.download.DownloadItem r0 = r14.h
            org.chromium.chrome.browser.download.DownloadInfo r1 = r0.c
            java.lang.String r1 = r1.g
            boolean r1 = org.chromium.base.ContentUriUtils.e(r1)
            r2 = 29
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L1e
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r2) goto L1c
            goto L1e
        L1c:
            r1 = r3
            goto L1f
        L1e:
            r1 = r4
        L1f:
            nE r5 = defpackage.UN.a
            java.lang.String r5 = "UseDownloadOfflineContentProvider"
            boolean r5 = J.N.M09VlOh_(r5)
            if (r5 != 0) goto L2f
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 >= r2) goto L2f
            r2 = r4
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r1 != 0) goto L61
            if (r2 == 0) goto L61
            org.chromium.chrome.browser.download.DownloadInfo r1 = r14.i
            java.lang.String r5 = r1.e
            java.lang.String r6 = r1.f
            java.lang.String r7 = r1.c
            java.lang.String r8 = r1.g
            long r9 = r1.j
            org.chromium.url.GURL r2 = r1.i
            java.lang.String r11 = r2.i()
            org.chromium.url.GURL r2 = r1.h
            java.lang.String r12 = r2.i()
            java.lang.String r13 = r1.l
            long r1 = org.chromium.chrome.browser.download.DownloadManagerBridge.a(r5, r6, r7, r8, r9, r11, r12, r13)
            r5 = -1
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 == 0) goto L5a
            r5 = r4
            goto L5b
        L5a:
            r5 = r3
        L5b:
            if (r5 == 0) goto L60
            r0.c(r1)
        L60:
            r1 = r5
        L61:
            if (r1 == 0) goto L88
            org.chromium.chrome.browser.download.DownloadInfo r2 = r0.c
            java.lang.String r2 = r2.c
            boolean r2 = org.chromium.chrome.browser.download.MimeUtils.isOMADownloadDescription(r2)
            if (r2 != 0) goto L87
            boolean r8 = r14.j
            org.chromium.chrome.browser.download.DownloadInfo r2 = r0.c
            java.lang.String r5 = r2.g
            long r6 = r0.d
            r9 = 0
            r10 = 0
            java.lang.String r11 = r2.c
            android.content.Intent r0 = org.chromium.chrome.browser.download.DownloadManagerService.k(r5, r6, r8, r9, r10, r11)
            if (r0 != 0) goto L81
            r0 = r3
            goto L85
        L81:
            boolean r0 = defpackage.C12055zG0.q(r0)
        L85:
            if (r0 == 0) goto L88
        L87:
            r3 = r4
        L88:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11577xs0.b():java.lang.Object");
    }
}
