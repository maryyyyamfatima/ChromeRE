package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.android.chrome.R;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.DownloadInfo;
import org.chromium.chrome.browser.download.DownloadItem;
import org.chromium.chrome.browser.download.DownloadManagerBridge;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class E82 extends BroadcastReceiver {
    public static final /* synthetic */ int f = 0;
    public final Context a;
    public final LongSparseArray c = new LongSparseArray();
    public final LongSparseArray d = new LongSparseArray();
    public final C12157za2 e = new C12157za2();
    public final Q83 b = O83.a;

    static {
        new C5463g32("oma_download_handler_android");
    }

    public static String a(B82 b82) {
        if (TextUtils.isEmpty(b82.b("objectURI"))) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri parse = Uri.parse(b82.b("objectURI"));
        Iterator it = b82.b.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.equalsIgnoreCase("application/vnd.oma.drm.message") && !str.equalsIgnoreCase("application/vnd.oma.drm.content") && !str.equalsIgnoreCase("application/vnd.oma.dd+xml") && !str.equalsIgnoreCase("application/vnd.oma.drm.rights+wbxml")) {
                intent.setDataAndType(parse, str);
                if (!AbstractC3017Xf2.b(intent, 65536).isEmpty()) {
                    return str;
                }
            }
        }
        return null;
    }

    public final boolean f(B82 b82, DownloadInfo downloadInfo, long j, String str) {
        if (b82 == null || TextUtils.isEmpty(b82.b("installNotifyURI"))) {
            return false;
        }
        new D82(this, b82, downloadInfo, j, str).c(AbstractC0185Bl.e);
        return true;
    }

    public final void i(B82 b82) {
        if (TextUtils.isEmpty(b82.b("nextURL"))) {
            return;
        }
        final String b = b82.b("nextURL");
        final Activity activity = ApplicationStatus.c;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: x82
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                E82 e82 = E82.this;
                e82.getClass();
                if (i == -1) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(b));
                    Activity activity2 = activity;
                    intent.putExtra("com.android.browser.application_id", activity2.getPackageName());
                    intent.putExtra("create_new_tab", true);
                    intent.setPackage(e82.a.getPackageName());
                    activity2.startActivity(intent);
                }
            }
        };
        C5490g8 c5490g8 = new C5490g8(activity);
        c5490g8.i(R.string.0_resource_name_obfuscated_res_0x7f14072b);
        c5490g8.f(R.string.0_resource_name_obfuscated_res_0x7f140717, onClickListener);
        c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f1402f4, onClickListener);
        C4115c8 c4115c8 = c5490g8.a;
        c4115c8.f = b;
        c4115c8.k = false;
        c5490g8.k();
    }

    public E82(Context context) {
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            if (longExtra == -1) {
                return;
            }
            boolean z = true;
            boolean z2 = this.d.get(longExtra) != null;
            Iterator it = DownloadManagerService.m(this.b, "PendingOMADownloads").iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (A82.a((String) it.next()).a == longExtra) {
                    break;
                }
            }
            if (!z2 && !z) {
                LongSparseArray longSparseArray = this.c;
                final DownloadItem downloadItem = (DownloadItem) longSparseArray.get(longExtra);
                if (downloadItem != null) {
                    Callback callback = new Callback() { // from class: v82
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            C0216Br0 b;
                            C5397fs0 c5397fs0 = (C5397fs0) obj;
                            DownloadManagerService i = DownloadManagerService.i();
                            i.getClass();
                            DownloadItem downloadItem2 = DownloadItem.this;
                            DownloadInfo downloadInfo = downloadItem2.c;
                            if (downloadInfo == null) {
                                b = new C0216Br0();
                            } else {
                                b = C0216Br0.b(downloadInfo);
                            }
                            b.k = c5397fs0.f;
                            b.j = c5397fs0.e;
                            if (!TextUtils.isEmpty(c5397fs0.b)) {
                                b.e = c5397fs0.b;
                            }
                            if (!TextUtils.isEmpty(c5397fs0.c)) {
                                b.c = c5397fs0.c;
                            }
                            b.g = c5397fs0.h;
                            downloadItem2.c = new DownloadInfo(b);
                            int i2 = c5397fs0.a;
                            if (i2 == 0) {
                                return;
                            }
                            if (i2 == 1) {
                                new C12263zs0(i, downloadItem2, c5397fs0).c(AbstractC0185Bl.e);
                            } else {
                                if (i2 != 2) {
                                    return;
                                }
                                i.q(downloadItem2, c5397fs0.g);
                            }
                        }
                    };
                    Object obj = DownloadManagerBridge.a;
                    new C5741gs0(callback, longExtra).c(AbstractC0185Bl.e);
                    if (longSparseArray.size() == 0) {
                        return;
                    }
                    longSparseArray.remove(longExtra);
                    if (longSparseArray.size() == 0) {
                        this.a.unregisterReceiver(this);
                        return;
                    }
                    return;
                }
                return;
            }
            C10300u82 c10300u82 = new C10300u82(this, longExtra, null);
            Object obj2 = DownloadManagerBridge.a;
            new C5741gs0(c10300u82, longExtra).c(AbstractC0185Bl.e);
        }
    }

    public final void c(DownloadInfo downloadInfo, long j, int i, String str) {
        String str2;
        switch (i) {
            case 1002:
            case 1004:
            case 1005:
                str2 = "954 Loader Error \n\r";
                break;
            case 1003:
            case 1007:
            default:
                str2 = "952 Device Aborted \n\r";
                break;
            case 1006:
                str2 = "901 insufficient memory \n\r";
                break;
            case 1008:
                str2 = "903 Loss of Service \n\r";
                break;
        }
        String str3 = str2;
        LongSparseArray longSparseArray = this.d;
        B82 b82 = (B82) longSparseArray.get(j);
        if (b82 == null) {
            B82 b822 = new B82();
            b822.a("installNotifyURI", str);
            if (f(b822, downloadInfo, j, str3)) {
                return;
            }
            i(b822);
            return;
        }
        h(R.string.0_resource_name_obfuscated_res_0x7f14071a, b82, downloadInfo, str3);
        longSparseArray.remove(j);
    }

    public final void h(int i, final B82 b82, final DownloadInfo downloadInfo, final String str) {
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: w82
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                E82 e82 = E82.this;
                B82 b822 = b82;
                DownloadInfo downloadInfo2 = downloadInfo;
                String str2 = str;
                if (i2 != -1) {
                    e82.getClass();
                } else {
                    if (e82.f(b822, downloadInfo2, -1L, str2)) {
                        return;
                    }
                    e82.i(b822);
                }
            }
        };
        C5490g8 c5490g8 = new C5490g8(ApplicationStatus.c, R.style.f105200_resource_name_obfuscated_res_0x7f150545);
        c5490g8.i(i);
        c5490g8.f(R.string.0_resource_name_obfuscated_res_0x7f140717, onClickListener);
        c5490g8.a.k = false;
        c5490g8.k();
    }

    public static B82 d(FileInputStream fileInputStream) {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(fileInputStream, null);
            B82 b82 = new B82();
            ArrayList arrayList = new ArrayList(Arrays.asList("type", "size", "objectURI", "installNotifyURI", "nextURL", "DDVersion", "name", "description", "vendor", "infoURL", "iconURI", "installParam"));
            String str = null;
            StringBuilder sb = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 0) {
                    if (!(b82.a.isEmpty() && b82.b.isEmpty())) {
                        return null;
                    }
                } else if (eventType == 2) {
                    String name = newPullParser.getName();
                    if (!arrayList.contains(name)) {
                        continue;
                    } else {
                        if (str != null) {
                            AbstractC4851eH1.f("OMADownloadHandler", "Nested attributes was found in the download descriptor", new Object[0]);
                            return null;
                        }
                        sb = new StringBuilder();
                        str = name;
                    }
                } else if (eventType == 3) {
                    if (str == null) {
                        continue;
                    } else {
                        if (!str.equals(newPullParser.getName())) {
                            AbstractC4851eH1.f("OMADownloadHandler", "Nested attributes was found in the download descriptor", new Object[0]);
                            return null;
                        }
                        b82.a(str, sb.toString().trim());
                        str = null;
                        sb = null;
                    }
                } else if (eventType == 4 && str != null) {
                    sb.append(newPullParser.getText());
                }
            }
            return b82;
        } catch (IOException e) {
            AbstractC4851eH1.f("OMADownloadHandler", "Failed to read download descriptor.", e);
            return null;
        } catch (XmlPullParserException e2) {
            AbstractC4851eH1.f("OMADownloadHandler", "Failed to parse download descriptor.", e2);
            return null;
        }
    }

    public static long b(B82 b82) {
        String b = b82.b("size");
        if (b == null) {
            return 0L;
        }
        try {
            return Long.parseLong(b.replace(",", ""));
        } catch (NumberFormatException e) {
            AbstractC4851eH1.f("OMADownloadHandler", "Cannot parse size information.", e);
            return 0L;
        }
    }

    public static void g(DownloadItem downloadItem, int i) {
        DownloadManagerService i2 = DownloadManagerService.i();
        OTRProfileID oTRProfileID = downloadItem.c.u;
        C1910Os0 c1910Os0 = i2.n;
        if (c1910Os0 == null) {
            return;
        }
        OfflineItem a = DownloadItem.a(downloadItem);
        a.a.a = "LEGACY_ANDROID_DOWNLOAD";
        if (i == 1) {
            a.B = 2;
        } else if (i == 2) {
            a.B = 5;
        }
        c1910Os0.d(a, null);
    }

    public final void e(long j) {
        Q83 q83 = this.b;
        HashSet m = DownloadManagerService.m(q83, "PendingOMADownloads");
        Iterator it = m.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (A82.a(str).a == j) {
                m.remove(str);
                DownloadManagerService.t(q83, "PendingOMADownloads", m, false);
                return;
            }
        }
    }
}
