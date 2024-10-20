package defpackage;

import android.text.TextUtils;
import android.util.LongSparseArray;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.DownloadInfo;
import org.chromium.chrome.browser.download.DownloadItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u82, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10300u82 implements Callback {
    public final /* synthetic */ E82 a;
    public final /* synthetic */ long g;
    public final /* synthetic */ String h;

    public /* synthetic */ C10300u82(E82 e82, long j, String str) {
        this.a = e82;
        this.g = j;
        this.h = str;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C0216Br0 b;
        long j = this.g;
        String str = this.h;
        C5397fs0 c5397fs0 = (C5397fs0) obj;
        E82 e82 = this.a;
        DownloadItem downloadItem = (DownloadItem) e82.c.get(j);
        if (downloadItem == null) {
            downloadItem = new DownloadItem(null, true);
            downloadItem.c(j);
        }
        DownloadItem downloadItem2 = downloadItem;
        DownloadInfo downloadInfo = downloadItem2.c;
        if (downloadInfo == null) {
            b = new C0216Br0();
        } else {
            b = C0216Br0.b(downloadInfo);
        }
        b.j = c5397fs0.e;
        b.k = c5397fs0.f;
        if (!TextUtils.isEmpty(c5397fs0.b)) {
            b.e = c5397fs0.b;
        }
        if (!TextUtils.isEmpty(c5397fs0.c)) {
            b.c = c5397fs0.c;
        }
        b.g = c5397fs0.h;
        DownloadInfo downloadInfo2 = new DownloadInfo(b);
        downloadItem2.c = downloadInfo2;
        int i = c5397fs0.a;
        if (i == 1) {
            C0216Br0 b2 = C0216Br0.b(downloadInfo2);
            b2.g = c5397fs0.h;
            DownloadInfo downloadInfo3 = new DownloadInfo(b2);
            downloadItem2.c = downloadInfo3;
            LongSparseArray longSparseArray = e82.d;
            B82 b82 = (B82) longSparseArray.get(j);
            if (b82 == null) {
                b82 = new B82();
                b82.a("installNotifyURI", str);
            }
            B82 b822 = b82;
            if (!e82.f(b822, downloadInfo3, j, "900 Success \n\r")) {
                e82.i(b822);
            }
            longSparseArray.remove(j);
            e82.e(j);
            E82.g(downloadItem2, c5397fs0.a);
        } else if (i == 2) {
            e82.c(downloadInfo2, j, c5397fs0.g, str);
            e82.e(j);
            E82.g(downloadItem2, c5397fs0.a);
        }
        LongSparseArray longSparseArray2 = e82.c;
        if (longSparseArray2.size() == 0) {
            return;
        }
        longSparseArray2.remove(j);
        if (longSparseArray2.size() == 0) {
            e82.a.unregisterReceiver(e82);
        }
    }
}
