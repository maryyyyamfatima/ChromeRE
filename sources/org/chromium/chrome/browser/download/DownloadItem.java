package org.chromium.chrome.browser.download;

import J.N;
import defpackage.AbstractC4029bt0;
import defpackage.AbstractC9856sr0;
import defpackage.C3685at0;
import defpackage.C6161i50;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadItem {
    public final C6161i50 a;
    public final boolean b;
    public DownloadInfo c;
    public long d;
    public long e;
    public long f;
    public boolean g;

    public DownloadItem(DownloadInfo downloadInfo, boolean z) {
        C6161i50 c6161i50 = new C6161i50();
        this.a = c6161i50;
        this.d = -1L;
        this.b = z;
        this.c = downloadInfo;
        if (downloadInfo != null) {
            c6161i50.a = downloadInfo.z.a;
        }
        c6161i50.b = b();
    }

    public final void c(long j) {
        this.d = j;
        this.a.b = b();
    }

    public final String b() {
        if (this.b) {
            return String.valueOf(this.d);
        }
        return this.c.l;
    }

    public static OfflineItem a(DownloadItem downloadItem) {
        OfflineItem offlineItem = new OfflineItem();
        DownloadInfo downloadInfo = downloadItem.c;
        offlineItem.a = downloadInfo.z;
        offlineItem.v = downloadInfo.g;
        offlineItem.g = downloadInfo.e;
        offlineItem.h = downloadInfo.f;
        offlineItem.j = downloadInfo.B;
        offlineItem.l = downloadInfo.C;
        offlineItem.k = false;
        offlineItem.p = downloadInfo.k;
        long j = downloadInfo.j;
        offlineItem.E = j;
        offlineItem.C = downloadInfo.r;
        GURL gurl = downloadInfo.a;
        offlineItem.x = gurl;
        offlineItem.y = downloadInfo.i;
        offlineItem.z = downloadInfo.t;
        offlineItem.A = OTRProfileID.serialize(downloadInfo.u);
        String str = downloadInfo.c;
        offlineItem.w = str;
        offlineItem.F = downloadInfo.p;
        offlineItem.G = downloadInfo.q;
        offlineItem.H = downloadInfo.y;
        offlineItem.f11537J = downloadInfo.E;
        int i = downloadInfo.F;
        offlineItem.I = i;
        offlineItem.m = downloadInfo.G;
        offlineItem.t = downloadInfo.x;
        offlineItem.r = downloadItem.e;
        offlineItem.s = downloadItem.f;
        offlineItem.q = downloadItem.g;
        offlineItem.n = downloadItem.c.w == 1;
        offlineItem.K = downloadInfo.H;
        boolean z = downloadInfo.s;
        int i2 = downloadInfo.w;
        if (i2 == 0) {
            offlineItem.B = z ? 6 : 0;
        } else if (i2 == 1) {
            offlineItem.B = j == 0 ? 5 : 2;
        } else if (i2 == 2) {
            offlineItem.B = 3;
        } else if (i2 == 3) {
            int MOENIRAW = N.MOENIRAW(gurl.i(), i);
            if (MOENIRAW == 0 || MOENIRAW == 4) {
                offlineItem.B = 4;
            } else if (z) {
                offlineItem.B = 6;
            } else {
                C3685at0 b = AbstractC4029bt0.a.b(downloadItem.a);
                if (b != null && downloadItem.c.w == 3 && b.e) {
                    offlineItem.B = 1;
                } else {
                    offlineItem.B = 5;
                }
            }
        }
        int a = AbstractC9856sr0.a(str);
        if (a == 1) {
            offlineItem.i = 0;
        } else if (a == 2) {
            offlineItem.i = 1;
        } else if (a == 3) {
            offlineItem.i = 2;
        } else if (a == 4) {
            offlineItem.i = 3;
        } else if (a == 5) {
            offlineItem.i = 4;
        } else {
            offlineItem.i = 5;
        }
        return offlineItem;
    }

    public static DownloadItem createDownloadItem(DownloadInfo downloadInfo, long j, long j2, boolean z) {
        DownloadItem downloadItem = new DownloadItem(downloadInfo, false);
        downloadItem.e = j;
        downloadItem.f = j2;
        downloadItem.g = z;
        return downloadItem;
    }
}
