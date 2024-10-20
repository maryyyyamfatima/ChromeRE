package org.chromium.chrome.browser.download;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.android.chrome.R;
import defpackage.A82;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC1741Nk1;
import defpackage.AbstractC2820Vs0;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC6968kS1;
import defpackage.AbstractC7848n0;
import defpackage.AbstractC8828pr0;
import defpackage.C0091As0;
import defpackage.C0216Br0;
import defpackage.C10300u82;
import defpackage.C11577xs0;
import defpackage.C11814ya2;
import defpackage.C11920ys0;
import defpackage.C12157za2;
import defpackage.C12188zf3;
import defpackage.C1910Os0;
import defpackage.C4715dt0;
import defpackage.C5053es0;
import defpackage.C5397fs0;
import defpackage.C5741gs0;
import defpackage.C6079hr0;
import defpackage.C6161i50;
import defpackage.C7130ku3;
import defpackage.C7432ln3;
import defpackage.C7474lu3;
import defpackage.C7928nE;
import defpackage.C82;
import defpackage.C9513rr0;
import defpackage.E82;
import defpackage.EI2;
import defpackage.InterfaceC10665vC2;
import defpackage.InterfaceC3210Ys0;
import defpackage.InterfaceC5391fr0;
import defpackage.O83;
import defpackage.Q83;
import defpackage.R44;
import defpackage.T60;
import defpackage.UN;
import defpackage.V60;
import defpackage.X5;
import defpackage.ZN3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.Callback;
import org.chromium.base.ContentUriUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.download.DownloadInfo;
import org.chromium.chrome.browser.download.DownloadItem;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.chrome.browser.profiles.ProfileManager;
import org.chromium.components.download.DownloadCollectionBridge;
import org.chromium.components.offline_items_collection.OfflineItemSchedule;
import org.chromium.components.prefs.PrefService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadManagerService implements InterfaceC5391fr0, InterfaceC3210Ys0, InterfaceC10665vC2 {
    public static final HashSet s = new HashSet();
    public static DownloadManagerService t;
    public final C7474lu3 g;
    public final long h;
    public final Handler i;
    public final E82 l;
    public final C4715dt0 m;
    public C1910Os0 n;
    public long o;
    public boolean p;
    public boolean r;
    public final HashMap a = new HashMap(4, 0.75f);
    public final ArrayList j = new ArrayList();
    public final C12157za2 k = new C12157za2();
    public int q = -1;

    public static String j(String str, boolean z, boolean z2) {
        return z2 ? AbstractC7848n0.a(str, ".Total") : z ? AbstractC7848n0.a(str, ".Manual") : str;
    }

    @Override // defpackage.InterfaceC10665vC2
    public final void d(Profile profile) {
    }

    @Override // defpackage.InterfaceC3210Ys0
    public final void g() {
    }

    @Override // defpackage.InterfaceC10665vC2
    public final void b(Profile profile) {
        ProfileManager.a.d(this);
        N.MFfdOo0Y(this.o, this, profile);
    }

    public static SharedPreferences f() {
        return V60.a.getSharedPreferences("DownloadRetryCount", 0);
    }

    public final void handleOMADownload(DownloadItem downloadItem, long j) {
        DownloadInfo downloadInfo = downloadItem.c;
        E82 e82 = this.l;
        e82.getClass();
        new C82(e82, downloadInfo, j).c(AbstractC0185Bl.e);
    }

    public final void n(DownloadItem downloadItem) {
        if (MimeUtils.isOMADownloadDescription(downloadItem.c.c)) {
            DownloadInfo downloadInfo = downloadItem.c;
            long j = downloadItem.d;
            E82 e82 = this.l;
            e82.getClass();
            new C82(e82, downloadInfo, j).c(AbstractC0185Bl.e);
            return;
        }
        DownloadInfo downloadInfo2 = downloadItem.c;
        long j2 = downloadItem.d;
        Context context = V60.a;
        String str = downloadInfo2.g;
        boolean M4t0L845 = N.M4t0L845(downloadInfo2.c);
        r(7, j2, context, str, downloadInfo2.l, downloadInfo2.i.i(), downloadInfo2.h.i(), downloadInfo2.c, downloadInfo2.u, M4t0L845);
    }

    public final void openDownloadItem(DownloadItem downloadItem, int i) {
        DownloadInfo downloadInfo = downloadItem.c;
        if (DownloadUtils.g(downloadInfo.g, downloadInfo.c, downloadInfo.l, downloadInfo.u, downloadInfo.i.i(), downloadInfo.h.i(), i, V60.a)) {
            return;
        }
        openDownloadsPage(downloadInfo.u, i);
    }

    public final void q(DownloadItem downloadItem, int i) {
        String string;
        String str = downloadItem.c.e;
        Context context = V60.a;
        switch (i) {
            case 1001:
                string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140410, str);
                break;
            case 1002:
            case 1005:
                string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140413, str);
                break;
            case 1003:
            default:
                string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140415, str);
                break;
            case 1004:
            case 1008:
                string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140412, str);
                break;
            case 1006:
                string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140411, str);
                break;
            case 1007:
                string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140414, str);
                break;
            case 1009:
                string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f14040f, str);
                break;
        }
        C4715dt0 c4715dt0 = this.m;
        if (c4715dt0.c() != null) {
            boolean z = i == 1009;
            OTRProfileID oTRProfileID = downloadItem.c.u;
            C1910Os0 c1910Os0 = i().n;
            if (((c1910Os0 == null || c1910Os0.p == null) ? false : true) || c4715dt0.c() == null) {
                return;
            }
            C12188zf3 a = C12188zf3.a(string, c4715dt0, 1, 10);
            a.i = false;
            a.j = 7000;
            if (z) {
                a.d = V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140725);
                a.e = null;
            }
            c4715dt0.c().c(a);
            return;
        }
        ZN3.c(V60.a, string, 0).d();
    }

    public final void u(DownloadItem downloadItem, int i) {
        boolean z = i == 1 && N.M4t0L845(downloadItem.c.c);
        String b = downloadItem.b();
        HashMap hashMap = this.a;
        C0091As0 c0091As0 = (C0091As0) hashMap.get(b);
        downloadItem.c.getClass();
        HashSet hashSet = s;
        if (c0091As0 == null) {
            if (downloadItem.c.s) {
                return;
            }
            C0091As0 c0091As02 = new C0091As0(System.currentTimeMillis(), ((ConnectivityManager) V60.a.getSystemService("connectivity")).isActiveNetworkMetered(), downloadItem, i);
            c0091As02.f = true;
            c0091As02.g = z;
            hashMap.put(b, c0091As02);
            hashSet.add(b);
            if (i != 0) {
                w(c0091As02);
                return;
            }
            return;
        }
        c0091As0.d = i;
        c0091As0.c = downloadItem;
        c0091As0.f = true;
        c0091As0.e = this.j.contains(b);
        c0091As0.g = z;
        if (i == 0) {
            if (downloadItem.c.s) {
                w(c0091As0);
            }
        } else if (i != 1 && i != 2 && i != 3) {
            if (i != 4) {
                return;
            }
            w(c0091As0);
        } else {
            e(b, true);
            e(b, false);
            w(c0091As0);
            hashSet.remove(b);
        }
    }

    public static void openDownloadsPage(OTRProfileID oTRProfileID, int i) {
        if (DownloadUtils.showDownloadManager(null, null, oTRProfileID, i, false)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
        intent.setFlags(268435456);
        try {
            V60.a.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            AbstractC4851eH1.a("DownloadService", "Cannot find Downloads app", e);
        }
    }

    public static DownloadManagerService i() {
        Object obj = ThreadUtils.a;
        if (t == null) {
            t = new DownloadManagerService(new C7474lu3(), new Handler());
        }
        return t;
    }

    public DownloadManagerService(C7474lu3 c7474lu3, Handler handler) {
        Context context = V60.a;
        Q83 q83 = O83.a;
        this.g = c7474lu3;
        this.h = 1000L;
        this.i = handler;
        this.m = new C4715dt0();
        E82 e82 = new E82(context);
        this.l = e82;
        C6079hr0 c6079hr0 = new C6079hr0();
        ArrayList arrayList = DownloadCollectionBridge.a;
        C7432ln3 c = C7432ln3.c();
        try {
            DownloadCollectionBridge.b = c6079hr0;
            c.close();
            C7928nE c7928nE = UN.a;
            if (!N.M09VlOh_("UseDownloadOfflineContentProvider")) {
                DownloadController.a = this;
            }
            q83.m("DownloadUmaEntry");
            Q83 q832 = e82.b;
            if (q832.c("PendingOMADownloads")) {
                Iterator it = m(q832, "PendingOMADownloads").iterator();
                while (it.hasNext()) {
                    A82 a = A82.a((String) it.next());
                    long j = a.a;
                    C10300u82 c10300u82 = new C10300u82(e82, j, a.b);
                    Object obj = DownloadManagerBridge.a;
                    new C5741gs0(c10300u82, j).c(AbstractC0185Bl.e);
                }
            }
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void o(DownloadInfo downloadInfo) {
        C0216Br0 b = C0216Br0.b(downloadInfo);
        b.w = 2;
        new DownloadItem(b.a(), false).b();
        u(new DownloadItem(downloadInfo, false), 3);
    }

    public static HashSet m(Q83 q83, String str) {
        return new HashSet(q83.j(str));
    }

    public static void t(Q83 q83, String str, HashSet hashSet, boolean z) {
        boolean commit;
        if (hashSet.isEmpty()) {
            if (z) {
                commit = q83.n(str);
            } else {
                q83.m(str);
                commit = true;
            }
        } else if (z) {
            q83.a.getClass();
            commit = T60.a.edit().putStringSet(str, hashSet).commit();
        } else {
            q83.u(str, hashSet);
            commit = true;
        }
        if (commit) {
            return;
        }
        AbstractC4851eH1.a("DownloadService", "Failed to write DownloadInfo ".concat(str), new Object[0]);
    }

    public final void w(C0091As0 c0091As0) {
        boolean z;
        DownloadItem downloadItem = c0091As0.c;
        DownloadInfo downloadInfo = downloadItem.c;
        int i = c0091As0.d;
        C7474lu3 c7474lu3 = this.g;
        boolean z2 = true;
        if (i != 0) {
            if (i == 1) {
                try {
                    new C11577xs0(this, downloadItem, downloadInfo, c0091As0.g).c(AbstractC0185Bl.e);
                } catch (RejectedExecutionException unused) {
                    AbstractC4851eH1.a("DownloadService", "Thread limit reached, reschedule notification update later.", new Object[0]);
                    z2 = false;
                }
            } else if (i == 2) {
                c7474lu3.d(downloadInfo);
                AbstractC4851eH1.f("DownloadService", "Download failed: " + downloadInfo.g, new Object[0]);
            } else if (i == 3) {
                c7474lu3.c(downloadItem.a);
            } else if (i == 4) {
                boolean z3 = c0091As0.e;
                c7474lu3.getClass();
                if (downloadInfo.H == null) {
                    C7130ku3 c7130ku3 = new C7130ku3(4, downloadInfo, 0);
                    c7130ku3.i = z3;
                    c7130ku3.j = 1;
                    c7474lu3.a(c7130ku3);
                }
                z = !c0091As0.e;
            }
            z = z2;
        } else {
            boolean z4 = downloadInfo.s;
            OfflineItemSchedule offlineItemSchedule = downloadInfo.H;
            if (z4) {
                c7474lu3.getClass();
                if (offlineItemSchedule == null) {
                    c7474lu3.a(new C7130ku3(1, downloadInfo, 0));
                }
                List list = AbstractC2820Vs0.a;
                EI2.h(0, 7, "MobileDownload.DownloadResumption");
                z = z2;
            } else {
                boolean z5 = c0091As0.b;
                c7474lu3.getClass();
                if (offlineItemSchedule == null) {
                    C7130ku3 c7130ku32 = new C7130ku3(0, downloadInfo, 1);
                    c7130ku32.d = c0091As0.a;
                    c7130ku32.h = z5;
                    c7474lu3.a(c7130ku32);
                }
                z = false;
            }
        }
        if (z2) {
            c0091As0.f = false;
        }
        if (z) {
            this.a.remove(downloadItem.b());
        }
    }

    public final void s() {
        if (this.p) {
            return;
        }
        this.p = true;
        ArrayList arrayList = new ArrayList();
        for (C0091As0 c0091As0 : this.a.values()) {
            if (c0091As0.f) {
                arrayList.add(c0091As0);
            }
        }
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                w((C0091As0) arrayList.get(i));
            }
            this.i.postDelayed(new Runnable() { // from class: ts0
                @Override // java.lang.Runnable
                public final void run() {
                    DownloadManagerService downloadManagerService = DownloadManagerService.this;
                    downloadManagerService.p = false;
                    downloadManagerService.s();
                }
            }, this.h);
            return;
        }
        this.p = false;
    }

    public final void p(DownloadItem downloadItem, C5053es0 c5053es0) {
        downloadItem.e = c5053es0.d;
        downloadItem.c(c5053es0.a);
        if (c5053es0.b) {
            OTRProfileID oTRProfileID = downloadItem.c.u;
            C1910Os0 c1910Os0 = this.n;
            if (c1910Os0 != null) {
                c1910Os0.c(null, true, false, false);
                return;
            }
            return;
        }
        q(downloadItem, c5053es0.c);
    }

    public static Intent k(String str, long j, boolean z, String str2, String str3, String str4) {
        Uri e;
        Intent a;
        if (j == -1) {
            if (!ContentUriUtils.e(str)) {
                return null;
            }
            Uri parse = Uri.parse(str);
            if (str4 == null) {
                Cursor query = V60.a.getContentResolver().query(parse, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.getCount() != 0) {
                            query.moveToNext();
                            str4 = query.getString(query.getColumnIndexOrThrow("mime_type"));
                            query.close();
                            query.close();
                        }
                    } finally {
                        try {
                            query.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
                return query != null ? null : null;
            }
            if (z) {
                a = AbstractC6968kS1.b(parse, parse, str4, true, V60.a);
            } else {
                a = AbstractC6968kS1.a(parse, str4, str2, str3);
            }
            return a;
        }
        C5397fs0 b = DownloadManagerBridge.b(j);
        if (str4 == null) {
            str4 = b.c;
        }
        if (str != null) {
            e = Build.VERSION.SDK_INT > 23 ? DownloadUtils.e(str) : Uri.fromFile(new File(str));
        } else {
            e = b.d;
        }
        if (e == null || Uri.EMPTY.equals(e)) {
            return null;
        }
        Uri fromFile = str == null ? e : Uri.fromFile(new File(str));
        if (z) {
            return AbstractC6968kS1.b(fromFile, e, str4, true, V60.a);
        }
        return AbstractC6968kS1.a(e, str4, str2, str3);
    }

    public static void r(int i, long j, Context context, String str, String str2, String str3, String str4, String str5, OTRProfileID oTRProfileID, boolean z) {
        new C11920ys0(i, j, context, str, str3, str4, str5, str2, oTRProfileID, z).c(AbstractC0185Bl.e);
    }

    @Override // defpackage.InterfaceC3210Ys0
    public final void h(C6161i50 c6161i50, DownloadItem downloadItem, boolean z) {
        HashMap hashMap = this.a;
        C0091As0 c0091As0 = (C0091As0) hashMap.get(downloadItem.b());
        if (c0091As0 == null || c0091As0.d != 0 || c0091As0.c.c.s) {
            int i = z ? 2 : 4;
            List list = AbstractC2820Vs0.a;
            EI2.h(i, 7, "MobileDownload.DownloadResumption");
            if (c0091As0 == null) {
                HashSet hashSet = s;
                if (!hashSet.contains(downloadItem.b())) {
                    hashSet.add(downloadItem.b());
                    EI2.h(1, 7, "MobileDownload.DownloadResumption");
                }
                u(downloadItem, 0);
                c0091As0 = (C0091As0) hashMap.get(downloadItem.b());
            }
            if (z) {
                if (!c0091As0.b) {
                    c0091As0.b = ((ConnectivityManager) V60.a.getSystemService("connectivity")).isActiveNetworkMetered();
                }
                String b = downloadItem.b();
                String j = j(b, true, false);
                SharedPreferences f = f();
                int i2 = f.getInt(j, 0);
                SharedPreferences.Editor edit = f.edit();
                edit.putInt(j, i2 + 1);
                edit.apply();
                String j2 = j(b, true, true);
                SharedPreferences f2 = f();
                int i3 = f2.getInt(j2, 0);
                SharedPreferences.Editor edit2 = f2.edit();
                edit2.putInt(j2, i3 + 1);
                edit2.apply();
                e(downloadItem.b(), true);
            } else {
                int i4 = f().getInt(downloadItem.b(), 0);
                if (this.q < 0) {
                    this.q = N.M3NaDnJv();
                }
                if (i4 >= this.q) {
                    downloadItem.b();
                    DownloadInfo downloadInfo = downloadItem.c;
                    u(new DownloadItem(downloadInfo, false), downloadInfo.r ? 4 : 2);
                    return;
                }
                String b2 = downloadItem.b();
                String j3 = j(b2, false, false);
                SharedPreferences f3 = f();
                int i5 = f3.getInt(j3, 0);
                SharedPreferences.Editor edit3 = f3.edit();
                edit3.putInt(j3, i5 + 1);
                edit3.apply();
                String j4 = j(b2, false, true);
                SharedPreferences f4 = f();
                int i6 = f4.getInt(j4, 0);
                SharedPreferences.Editor edit4 = f4.edit();
                edit4.putInt(j4, i6 + 1);
                edit4.apply();
            }
            if (ProfileManager.b || !downloadItem.c.t) {
                N.MieiRHrs(l(), this, downloadItem.b(), AbstractC1741Nk1.c(downloadItem.c.u), z);
            }
        }
    }

    @Override // defpackage.InterfaceC3210Ys0
    public final void c(C6161i50 c6161i50, OTRProfileID oTRProfileID) {
        N.MV30ev0v(l(), this, c6161i50.b, AbstractC1741Nk1.c(oTRProfileID));
        HashMap hashMap = this.a;
        C0091As0 c0091As0 = (C0091As0) hashMap.get(c6161i50.b);
        if (c0091As0 != null) {
            o(new DownloadInfo(C0216Br0.b(c0091As0.c.c)));
            String str = c6161i50.b;
            hashMap.remove(str);
            s.remove(str);
            return;
        }
        this.g.c(c6161i50);
    }

    @Override // defpackage.InterfaceC3210Ys0
    public final void a(C6161i50 c6161i50, OTRProfileID oTRProfileID) {
        N.MmztvsiA(l(), this, c6161i50.b, AbstractC1741Nk1.c(oTRProfileID));
        C0091As0 c0091As0 = (C0091As0) this.a.get(c6161i50.b);
        if (c0091As0 != null) {
            int i = c0091As0.d;
            if (i == 4 || i == 0) {
                C0216Br0 b = C0216Br0.b(c0091As0.c.c);
                b.s = true;
                b.j = -1L;
                DownloadInfo downloadInfo = new DownloadInfo(b);
                DownloadItem downloadItem = new DownloadItem(downloadInfo, false);
                if (downloadInfo.s) {
                    downloadItem.b();
                }
                u(downloadItem, 0);
                s();
            }
        }
    }

    public final long l() {
        if (this.o == 0) {
            boolean z = ProfileManager.b;
            this.o = N.MeJ$lv4P(this, z);
            if (!z) {
                ProfileManager.a(this);
            }
        }
        return this.o;
    }

    public void onResumptionFailed(String str) {
        C0216Br0 c0216Br0 = new C0216Br0();
        c0216Br0.m = str;
        c0216Br0.F = 1;
        this.g.d(new DownloadInfo(c0216Br0));
        this.a.remove(str);
        s.remove(str);
        List list = AbstractC2820Vs0.a;
        EI2.h(3, 7, "MobileDownload.DownloadResumption");
    }

    public final List createDownloadItemList() {
        return new ArrayList();
    }

    public final void addDownloadItemToList(List list, DownloadItem downloadItem) {
        list.add(downloadItem);
    }

    public final void onAllDownloadsRetrieved(final List list, ProfileKey profileKey) {
        C11814ya2 c11814ya2 = (C11814ya2) this.k.iterator();
        if (c11814ya2.hasNext()) {
            X5.a(c11814ya2.next());
            throw null;
        }
        final PrefService a = R44.a(Profile.d());
        if (a.a("download.show_missing_sd_card_error_android")) {
            final C9513rr0 c9513rr0 = AbstractC8828pr0.a;
            c9513rr0.a(new Callback() { // from class: us0
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    boolean z;
                    DownloadInfo downloadInfo;
                    int i;
                    ArrayList arrayList = (ArrayList) obj;
                    HashSet hashSet = DownloadManagerService.s;
                    final DownloadManagerService downloadManagerService = DownloadManagerService.this;
                    downloadManagerService.getClass();
                    if (arrayList.size() > 1) {
                        return;
                    }
                    C9513rr0 c9513rr02 = c9513rr0;
                    String str = c9513rr02.a ? c9513rr02.e : null;
                    for (DownloadItem downloadItem : list) {
                        String str2 = downloadItem.c.g;
                        if (!TextUtils.isEmpty(str2) && !str2.contains(str) && !ContentUriUtils.e(str2)) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C0461Do0 c0461Do0 = (C0461Do0) it.next();
                                if (!TextUtils.isEmpty(c0461Do0.b) && str2.contains(c0461Do0.b)) {
                                }
                            }
                            z = true;
                            downloadInfo = downloadItem.c;
                            i = downloadInfo.w;
                            if ((!(i == 3 || downloadInfo.r) || i == 2) && z) {
                                downloadManagerService.i.post(new Runnable() { // from class: vs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C4715dt0 c4715dt0 = DownloadManagerService.this.m;
                                        if (c4715dt0.c() == null) {
                                            return;
                                        }
                                        C12188zf3 a2 = C12188zf3.a(V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f140421), c4715dt0, 1, 24);
                                        a2.i = false;
                                        a2.j = 7000;
                                        c4715dt0.c().c(a2);
                                    }
                                });
                                a.e("download.show_missing_sd_card_error_android", false);
                                return;
                            }
                        }
                        z = false;
                        downloadInfo = downloadItem.c;
                        i = downloadInfo.w;
                        if (!(i == 3 || downloadInfo.r) || i == 2) {
                        }
                    }
                }
            });
        }
    }

    public final void onDownloadItemCreated(DownloadItem downloadItem) {
        C11814ya2 c11814ya2 = (C11814ya2) this.k.iterator();
        if (c11814ya2.hasNext()) {
            X5.a(c11814ya2.next());
            throw null;
        }
    }

    public final void onDownloadItemUpdated(DownloadItem downloadItem) {
        C11814ya2 c11814ya2 = (C11814ya2) this.k.iterator();
        if (c11814ya2.hasNext()) {
            X5.a(c11814ya2.next());
            throw null;
        }
    }

    public final void onDownloadItemRemoved(String str, OTRProfileID oTRProfileID) {
        C11814ya2 c11814ya2 = (C11814ya2) this.k.iterator();
        if (c11814ya2.hasNext()) {
            X5.a(c11814ya2.next());
            throw null;
        }
    }

    public static void onDownloadItemCanceled(DownloadItem downloadItem, boolean z) {
        i().q(downloadItem, z ? 1007 : 1009);
    }

    public static void e(String str, boolean z) {
        SharedPreferences f = f();
        String j = j(str, !z, false);
        int min = Math.min(f.getInt(j, 0), 200);
        SharedPreferences.Editor edit = f.edit();
        edit.remove(j);
        if (z) {
            EI2.m(min, "MobileDownload.ResumptionsCount.Automatic");
        } else {
            EI2.m(min, "MobileDownload.ResumptionsCount.Manual");
            String j2 = j(str, false, true);
            EI2.m(Math.min(f.getInt(j2, 0), 500), "MobileDownload.ResumptionsCount.Total");
            edit.remove(j2);
        }
        edit.apply();
    }

    public final void v(String str, OTRProfileID oTRProfileID) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        N.M2cL0nU9(l(), this, str, AbstractC1741Nk1.c(oTRProfileID));
    }
}
