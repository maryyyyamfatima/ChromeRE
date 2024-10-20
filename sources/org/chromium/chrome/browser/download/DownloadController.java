package org.chromium.chrome.browser.download;

import J.N;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC7281lM0;
import defpackage.AbstractC8828pr0;
import defpackage.C0216Br0;
import defpackage.C4709ds0;
import defpackage.C6085hs0;
import defpackage.C7432ln3;
import defpackage.InterfaceC5391fr0;
import defpackage.V60;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.components.download.DownloadCollectionBridge;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadController {
    public static InterfaceC5391fr0 a;

    public static void onDownloadStarted() {
    }

    public static void onDownloadInterrupted(DownloadInfo downloadInfo, boolean z) {
        int i;
        InterfaceC5391fr0 interfaceC5391fr0 = a;
        if (interfaceC5391fr0 == null) {
            return;
        }
        DownloadManagerService downloadManagerService = (DownloadManagerService) interfaceC5391fr0;
        DownloadItem downloadItem = new DownloadItem(downloadInfo, false);
        if (downloadInfo.r) {
            if (z) {
                downloadItem.b();
            }
            i = 4;
        } else {
            i = 2;
        }
        downloadManagerService.u(downloadItem, i);
    }

    public static void onDownloadCancelled(DownloadInfo downloadInfo) {
        InterfaceC5391fr0 interfaceC5391fr0 = a;
        if (interfaceC5391fr0 == null) {
            return;
        }
        ((DownloadManagerService) interfaceC5391fr0).o(downloadInfo);
    }

    public static void onDownloadUpdated(DownloadInfo downloadInfo) {
        InterfaceC5391fr0 interfaceC5391fr0 = a;
        if (interfaceC5391fr0 == null) {
            return;
        }
        DownloadManagerService downloadManagerService = (DownloadManagerService) interfaceC5391fr0;
        DownloadItem downloadItem = new DownloadItem(downloadInfo, false);
        if (downloadInfo.s) {
            downloadItem.b();
        }
        downloadManagerService.u(downloadItem, 0);
        downloadManagerService.s();
    }

    public static boolean hasFileAccess(WindowAndroid windowAndroid) {
        ArrayList arrayList = DownloadCollectionBridge.a;
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        if (windowAndroid == null) {
            return false;
        }
        return windowAndroid.hasPermission("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static void onDownloadCompleted(DownloadInfo downloadInfo) {
        int i;
        final String str = downloadInfo.g;
        if (str != null && !str.isEmpty()) {
            AbstractC8828pr0.a.a(new Callback() { // from class: Qs0
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        C0461Do0 c0461Do0 = (C0461Do0) it.next();
                        if (str.contains(c0461Do0.b)) {
                            EI2.h(c0461Do0.e, 3, "MobileDownload.Location.Download.DirectoryType");
                            return;
                        }
                    }
                }
            });
        }
        final String str2 = downloadInfo.g;
        boolean isEmpty = TextUtils.isEmpty(str2);
        String str3 = downloadInfo.c;
        if (!isEmpty && str3 != null && str3.startsWith("image/") && Build.VERSION.SDK_INT < 29) {
            AbstractC8828pr0.a.a(new Callback() { // from class: ZR1
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        C0461Do0 c0461Do0 = (C0461Do0) it.next();
                        if (c0461Do0.e == 1) {
                            String str4 = str2;
                            if (str4.contains(c0461Do0.b)) {
                                new C3532aS1(str4).c(AbstractC0185Bl.e);
                                return;
                            }
                        }
                    }
                }
            });
        }
        InterfaceC5391fr0 interfaceC5391fr0 = a;
        if (interfaceC5391fr0 == null) {
            return;
        }
        DownloadManagerService downloadManagerService = (DownloadManagerService) interfaceC5391fr0;
        if (downloadInfo.j == 0) {
            i = 2;
        } else {
            str3 = MimeUtils.remapGenericMimeType(str3, downloadInfo.i.i(), downloadInfo.e);
            i = 1;
        }
        C0216Br0 b = C0216Br0.b(downloadInfo);
        b.c = str3;
        DownloadItem downloadItem = new DownloadItem(new DownloadInfo(b), false);
        String str4 = downloadInfo.l;
        Object obj = DownloadManagerBridge.a;
        C7432ln3 c = C7432ln3.c();
        try {
            long j = V60.a.getSharedPreferences("download_id_mappings", 0).getLong(str4, -1L);
            c.close();
            downloadItem.c(j);
            downloadManagerService.u(downloadItem, i);
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static void enqueueAndroidDownloadManagerRequest(GURL gurl, String str, String str2, String str3, String str4, GURL gurl2) {
        C0216Br0 c0216Br0 = new C0216Br0();
        c0216Br0.a = gurl;
        c0216Br0.b = str;
        c0216Br0.e = str2;
        c0216Br0.c = str3;
        c0216Br0.d = str4;
        c0216Br0.h = gurl2;
        c0216Br0.l = true;
        a(c0216Br0.a());
    }

    public static void a(DownloadInfo downloadInfo) {
        final DownloadManagerService i = DownloadManagerService.i();
        final DownloadItem downloadItem = new DownloadItem(downloadInfo, true);
        i.getClass();
        C4709ds0 c4709ds0 = new C4709ds0();
        c4709ds0.a = downloadItem.c.a.i();
        DownloadInfo downloadInfo2 = downloadItem.c;
        c4709ds0.b = downloadInfo2.e;
        c4709ds0.c = downloadInfo2.f;
        c4709ds0.d = downloadInfo2.c;
        c4709ds0.e = downloadInfo2.d;
        c4709ds0.f = downloadInfo2.h.i();
        c4709ds0.g = downloadItem.c.b;
        c4709ds0.h = true;
        Callback callback = new Callback() { // from class: ss0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                HashSet hashSet = DownloadManagerService.s;
                DownloadManagerService.this.p(downloadItem, (C5053es0) obj);
            }
        };
        Object obj = DownloadManagerBridge.a;
        new C6085hs0(c4709ds0, callback).c(AbstractC0185Bl.e);
    }

    public static void requestFileAccess(final long j, WindowAndroid windowAndroid) {
        if (windowAndroid != null) {
            AbstractC7281lM0.a(windowAndroid, new Callback() { // from class: er0
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Pair pair = (Pair) obj;
                    N.MLbF8aR_(j, ((Boolean) pair.first).booleanValue(), (String) pair.second);
                }
            });
        } else {
            N.MLbF8aR_(j, false, null);
        }
    }
}
