package defpackage;

import J.N;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.TextView;
import com.android.chrome.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.base.ContentUriUtils;
import org.chromium.chrome.browser.download.DownloadInfo;
import org.chromium.chrome.browser.download.DownloadItem;
import org.chromium.chrome.browser.download.DownloadManagerBridge;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C82 extends AbstractC0185Bl {
    public final DownloadInfo h;
    public final long i;
    public long j;
    public final /* synthetic */ E82 k;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        ParcelFileDescriptor openDownloadedFile;
        DownloadManager downloadManager = (DownloadManager) this.k.a.getSystemService("download");
        long j = this.i;
        DownloadInfo downloadInfo = this.h;
        boolean z = j == -1 && ContentUriUtils.e(downloadInfo.g);
        B82 b82 = null;
        try {
            if (z) {
                int openContentUriForRead = ContentUriUtils.openContentUriForRead(downloadInfo.g);
                openDownloadedFile = openContentUriForRead > 0 ? ParcelFileDescriptor.fromFd(openContentUriForRead) : null;
            } else {
                openDownloadedFile = Build.VERSION.SDK_INT < 29 ? downloadManager.openDownloadedFile(j) : ParcelFileDescriptor.open(new File(downloadInfo.g), 268435456);
            }
            if (openDownloadedFile != null) {
                b82 = E82.d(new FileInputStream(openDownloadedFile.getFileDescriptor()));
                openDownloadedFile.close();
            }
        } catch (FileNotFoundException e) {
            AbstractC4851eH1.f("OMADownloadHandler", "File not found.", e);
        } catch (IOException e2) {
            AbstractC4851eH1.f("OMADownloadHandler", "Cannot read file.", e2);
        }
        if (z) {
            ContentUriUtils.delete(downloadInfo.g);
        }
        this.j = Environment.getExternalStorageDirectory().getUsableSpace();
        AbstractC2300Rs0.a(1, downloadInfo.c);
        return b82;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        final B82 b82 = (B82) obj;
        C7928nE c7928nE = UN.a;
        boolean M09VlOh_ = N.M09VlOh_("UseDownloadOfflineContentProvider");
        DownloadInfo downloadInfo = this.h;
        if (M09VlOh_) {
            AbstractC0653Fa2.a().b(downloadInfo.z);
        } else {
            final DownloadManagerService i = DownloadManagerService.i();
            final String str = downloadInfo.l;
            i.getClass();
            final OTRProfileID oTRProfileID = downloadInfo.u;
            i.i.post(new Runnable() { // from class: ws0
                @Override // java.lang.Runnable
                public final void run() {
                    HashSet hashSet = DownloadManagerService.s;
                    DownloadManagerService downloadManagerService = DownloadManagerService.this;
                    long l = downloadManagerService.l();
                    ProfileKey c = AbstractC1741Nk1.c(oTRProfileID);
                    String str2 = str;
                    N.M8Q_hBf$(l, downloadManagerService, str2, c);
                    downloadManagerService.a.remove(str2);
                    DownloadManagerService.s.remove(str2);
                }
            });
            if (!N.M09VlOh_("UseDownloadOfflineContentProvider")) {
                DownloadManagerBridge.removeCompletedDownload(str, false);
            }
        }
        if (b82 == null) {
            return;
        }
        if (b82.b.isEmpty() || E82.b(b82) <= 0 || TextUtils.isEmpty(b82.b("objectURI"))) {
            this.k.f(b82, this.h, -1L, "906 Invalid descriptor \n\r");
            return;
        }
        String b = b82.b("DDVersion");
        if (b != null && !b.startsWith("1.")) {
            this.k.f(b82, this.h, -1L, "951 Invalid DDVersion \n\r");
            return;
        }
        long j = this.j;
        long b2 = E82.b(b82);
        final E82 e82 = this.k;
        if (j < b2) {
            e82.h(R.string.0_resource_name_obfuscated_res_0x7f14071b, b82, downloadInfo, "901 insufficient memory \n\r");
            return;
        }
        if (E82.a(b82) == null) {
            e82.h(R.string.0_resource_name_obfuscated_res_0x7f14071d, b82, downloadInfo, "953 Non-Acceptable Content \n\r");
            return;
        }
        final long j2 = this.i;
        final DownloadInfo downloadInfo2 = this.h;
        View inflate = ((LayoutInflater) e82.a.getSystemService("layout_inflater")).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0094, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.oma_download_name)).setText(b82.b("name"));
        ((TextView) inflate.findViewById(R.id.oma_download_vendor)).setText(b82.b("vendor"));
        ((TextView) inflate.findViewById(R.id.oma_download_size)).setText(b82.b("size"));
        ((TextView) inflate.findViewById(R.id.oma_download_type)).setText(E82.a(b82));
        ((TextView) inflate.findViewById(R.id.oma_download_description)).setText(b82.b("description"));
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: y82
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                String str2;
                final E82 e822 = E82.this;
                DownloadInfo downloadInfo3 = downloadInfo2;
                B82 b822 = b82;
                if (i2 != -1) {
                    e822.f(b822, downloadInfo3, -1L, "902 User Cancelled \n\r");
                    return;
                }
                e822.getClass();
                if (b822 == null) {
                    return;
                }
                Iterator it = b822.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str2 = null;
                        break;
                    }
                    str2 = (String) it.next();
                    if (str2.equalsIgnoreCase("application/vnd.oma.drm.message") || str2.equalsIgnoreCase("application/vnd.oma.drm.content")) {
                        break;
                    }
                }
                if (str2 == null) {
                    str2 = E82.a(b822);
                }
                String b3 = b822.b("name");
                String b4 = b822.b("objectURI");
                if (TextUtils.isEmpty(b3)) {
                    b3 = URLUtil.guessFileName(b4, null, str2);
                }
                C0216Br0 b5 = C0216Br0.b(downloadInfo3);
                b5.e = b3;
                b5.a = new GURL(b4);
                b5.c = str2;
                b5.f = b822.b("description");
                b5.j = E82.b(b822);
                DownloadInfo downloadInfo4 = new DownloadInfo(b5);
                final DownloadItem downloadItem = new DownloadItem(downloadInfo4, true);
                long j3 = j2;
                downloadItem.c(j3);
                C4709ds0 c4709ds0 = new C4709ds0();
                c4709ds0.b = b3;
                c4709ds0.a = b4;
                c4709ds0.d = str2;
                c4709ds0.c = b822.b("description");
                c4709ds0.e = downloadInfo4.d;
                c4709ds0.f = downloadInfo4.h.i();
                c4709ds0.g = downloadInfo4.b;
                c4709ds0.h = TextUtils.isEmpty(b822.b("installNotifyURI"));
                Callback callback = new Callback() { // from class: z82
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj2) {
                        return new ZE(this, obj2);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj2) {
                        C5053es0 c5053es0 = (C5053es0) obj2;
                        E82 e823 = E82.this;
                        e823.getClass();
                        DownloadItem downloadItem2 = downloadItem;
                        long j4 = downloadItem2.d;
                        downloadItem2.c(c5053es0.a);
                        LongSparseArray longSparseArray = e823.d;
                        boolean z = longSparseArray.get(j4) != null;
                        if (!c5053es0.b) {
                            if (z) {
                                e823.c(downloadItem2.c, j4, 1000, null);
                                return;
                            }
                            return;
                        }
                        LongSparseArray longSparseArray2 = e823.c;
                        if (longSparseArray2.size() == 0) {
                            V60.c(e823.a, e823, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), "android.permission.SEND_DOWNLOAD_COMPLETED_INTENTS");
                        }
                        longSparseArray2.put(c5053es0.a, downloadItem2);
                        if (z) {
                            long j5 = c5053es0.a;
                            B82 b823 = (B82) longSparseArray.get(j4);
                            longSparseArray.remove(j4);
                            longSparseArray.put(j5, b823);
                            String b6 = ((B82) longSparseArray.get(c5053es0.a)).b("installNotifyURI");
                            if (!TextUtils.isEmpty(b6)) {
                                String str3 = String.valueOf(c5053es0.a) + "," + b6;
                                Q83 q83 = e823.b;
                                HashSet m = DownloadManagerService.m(q83, "PendingOMADownloads");
                                m.add(str3);
                                DownloadManagerService.t(q83, "PendingOMADownloads", m, false);
                            }
                        }
                        DownloadManagerService.i().p(downloadItem2, c5053es0);
                        C11814ya2 c11814ya2 = (C11814ya2) e823.e.iterator();
                        if (c11814ya2.hasNext()) {
                            X5.a(c11814ya2.next());
                            throw null;
                        }
                    }
                };
                Object obj2 = DownloadManagerBridge.a;
                new C6085hs0(c4709ds0, callback).c(AbstractC0185Bl.e);
                e822.d.put(j3, b822);
            }
        };
        C5490g8 c5490g8 = new C5490g8(ApplicationStatus.c, R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        c5490g8.i(R.string.0_resource_name_obfuscated_res_0x7f140906);
        c5490g8.f(R.string.0_resource_name_obfuscated_res_0x7f140717, onClickListener);
        c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f1402f4, onClickListener);
        C4115c8 c4115c8 = c5490g8.a;
        c4115c8.q = inflate;
        c4115c8.k = false;
        c5490g8.k();
    }

    public C82(E82 e82, DownloadInfo downloadInfo, long j) {
        this.k = e82;
        this.h = downloadInfo;
        this.i = j;
    }
}
