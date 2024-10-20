package org.chromium.chrome.browser.download;

import J.N;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import com.android.chrome.R;
import defpackage.AbstractC2217Rb2;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC2300Rs0;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC6091ht0;
import defpackage.AbstractC6968kS1;
import defpackage.AbstractC7974nN0;
import defpackage.C10021tL;
import defpackage.C11477xb2;
import defpackage.C11598xv3;
import defpackage.C1761No1;
import defpackage.C7928nE;
import defpackage.C8141nr0;
import defpackage.C9171qr0;
import defpackage.C9513rr0;
import defpackage.EI2;
import defpackage.FI2;
import defpackage.LU3;
import defpackage.RC;
import defpackage.UN;
import defpackage.V60;
import defpackage.ZN3;
import java.io.File;
import java.util.List;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ContentUriUtils;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.app.download.home.DownloadActivity;
import org.chromium.chrome.browser.offlinepages.OfflinePageBridge;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.chrome.browser.profiles.ProfileManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadUtils {
    public static boolean b(Intent intent) {
        if (!ProfileManager.b) {
            return false;
        }
        OTRProfileID deserializeWithoutVerify = OTRProfileID.deserializeWithoutVerify(AbstractC2281Ro1.u("org.chromium.chrome.browser.download.OTR_PROFILE_ID", intent.getExtras()));
        if (deserializeWithoutVerify != null) {
            Profile d = Profile.d();
            if (!N.MQioXkwA(d.b, d, deserializeWithoutVerify)) {
                return false;
            }
        }
        return true;
    }

    public static boolean i() {
        if (C10021tL.f().c()) {
            return true;
        }
        return V60.a.getResources().getConfiguration().keyboard != 1;
    }

    public static void a(ProfileKey profileKey) {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("UseDownloadOfflineContentProvider")) {
            return;
        }
        if (profileKey.a) {
            DownloadManagerService i = DownloadManagerService.i();
            N.MQ35Y$D$(i.l(), i, profileKey);
        }
        DownloadManagerService i2 = DownloadManagerService.i();
        N.MQ35Y$D$(i2.l(), i2, ProfileKey.a());
        FI2.a("Android.DownloadManager.CheckForExternallyRemovedItems");
    }

    public static void c(Context context, Tab tab) {
        Profile b;
        C11477xb2 c11477xb2 = new C11477xb2(context, tab);
        if (tab.n()) {
            OfflinePageBridge a = OfflinePageBridge.a(Profile.b(tab.b()));
            N.MNR_O1IV(a.a, a, tab.b(), "async_loading", tab.getUrl().i(), 1, c11477xb2.a());
        } else {
            N.MgaTXnFG(tab, c11477xb2.a());
            EI2.l(Math.round(tab.s() * 100.0f), "OfflinePages.SavePage.PercentLoaded");
        }
        WebContents b2 = tab.b();
        if (b2 == null || (b = Profile.b(b2)) == null) {
            return;
        }
        LU3.a(b).notifyEvent("download_page_started");
    }

    public static boolean f(Tab tab) {
        if (tab == null || tab.isIncognito() || !N.MXyz2Okt(tab.getUrl())) {
            return false;
        }
        if (!tab.n()) {
            return !AbstractC2217Rb2.e(tab);
        }
        OfflinePageBridge a = OfflinePageBridge.a(Profile.b(tab.b()));
        return N.Mvkx0jqI(a.a, a, tab.b());
    }

    public static Uri e(String str) {
        if (ContentUriUtils.e(str)) {
            return Uri.parse(str);
        }
        boolean c = C9513rr0.c(str);
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("DownloadFileProvider") && c) {
            String[] strArr = DownloadFileProvider.j;
            if (ContentUriUtils.e(str)) {
                return Uri.parse(str);
            }
            if (TextUtils.isEmpty(str)) {
                return Uri.EMPTY;
            }
            File b = C9513rr0.b();
            if (str.indexOf(b.getAbsolutePath()) == 0 && str.length() > b.getAbsolutePath().length()) {
                return DownloadFileProvider.d("download", str.substring(b.getAbsolutePath().length() + 1));
            }
            C9171qr0 a = C8141nr0.a();
            List<File> list = a.a;
            if (list != null) {
                for (File file : list) {
                    if (file != null && str.startsWith(file.getAbsolutePath())) {
                        return DownloadFileProvider.d("external_volume", str.substring(file.getAbsolutePath().length() + 1));
                    }
                }
            }
            List<File> list2 = a.b;
            if (list2 == null) {
                return Uri.EMPTY;
            }
            for (File file2 : list2) {
                if (file2 != null && str.startsWith(file2.getAbsolutePath())) {
                    return DownloadFileProvider.d("download_external", str.substring(file2.getAbsolutePath().length() + 1));
                }
            }
            return Uri.EMPTY;
        }
        return AbstractC7974nN0.b(new File(str));
    }

    public static String getUriStringForPath(String str) {
        if (ContentUriUtils.e(str)) {
            return str;
        }
        Uri e = e(str);
        return e != null ? e.toString() : new String();
    }

    public static boolean g(String str, String str2, String str3, OTRProfileID oTRProfileID, String str4, String str5, int i, Context context) {
        Uri e;
        AbstractC2300Rs0.a(i, str2);
        DownloadManagerService i2 = DownloadManagerService.i();
        i2.getClass();
        if (N.M4t0L845(str2)) {
            Uri e2 = e(str);
            C1761No1.y(context, AbstractC6968kS1.b(!ContentUriUtils.e(str) ? Uri.fromFile(new File(str)) : e2, e2, Intent.normalizeMimeType(str2), true, context), null);
            i2.v(str3, oTRProfileID);
            return true;
        }
        try {
            if (ContentUriUtils.e(str)) {
                e = Uri.parse(str);
            } else {
                e = Build.VERSION.SDK_INT > 23 ? e(str) : Uri.fromFile(new File(str));
            }
            context.startActivity(AbstractC6968kS1.a(e, str2, str4, str5));
            i2.v(str3, oTRProfileID);
            return true;
        } catch (Exception e3) {
            AbstractC4851eH1.a("download", "Cannot start activity to open file", e3);
            if ("application/zip".equals(str2)) {
                try {
                    if (context.getPackageManager().getPackageInfo("com.android.documentsui", 1) != null) {
                        Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                        intent.addFlags(268435456);
                        intent.setPackage("com.android.documentsui");
                        context.startActivity(intent);
                        return true;
                    }
                } catch (Exception e4) {
                    AbstractC4851eH1.a("download", "Cannot find files app for openning zip files", e4);
                }
            }
            if (i != 8) {
                ZN3.c(context, context.getString(R.string.0_resource_name_obfuscated_res_0x7f14040d), 0).d();
            }
            return false;
        }
    }

    public static boolean showDownloadManager(Activity activity, Tab tab, OTRProfileID oTRProfileID, int i, boolean z) {
        boolean a;
        Profile b;
        Profile e;
        Profile b2;
        if (activity == null) {
            activity = ApplicationStatus.c;
        }
        Context context = V60.a;
        if (tab == null && (activity instanceof ChromeTabbedActivity)) {
            ChromeTabbedActivity chromeTabbedActivity = (ChromeTabbedActivity) activity;
            Tab g1 = chromeTabbedActivity.g1();
            a = chromeTabbedActivity.L;
            tab = g1;
        } else {
            a = DeviceFormFactor.a(activity != null ? activity : context);
        }
        if (oTRProfileID == null && tab != null && (b2 = Profile.b(tab.b())) != null) {
            oTRProfileID = b2.a;
        }
        OTRProfileID oTRProfileID2 = OTRProfileID.b;
        if (oTRProfileID != null) {
            Profile d = Profile.d();
            if (!N.MQioXkwA(d.b, d, oTRProfileID)) {
                return false;
            }
        }
        if (a) {
            LoadUrlParams loadUrlParams = new LoadUrlParams("chrome-native://downloads/", 0);
            if (tab == null || !tab.isInitialized()) {
                new C11598xv3(false).b(2, null, loadUrlParams);
            } else {
                tab.d(loadUrlParams);
                Intent a2 = C1761No1.a(tab.getId(), 1);
                a2.addFlags(268435456);
                try {
                    context.startActivity(a2, null);
                } catch (ActivityNotFoundException unused) {
                }
            }
        } else {
            Intent intent = new Intent();
            intent.setClass(context, DownloadActivity.class);
            intent.putExtra("org.chromium.chrome.browser.download.SHOW_PREFETCHED_CONTENT", z);
            if (oTRProfileID != null) {
                intent.putExtra("org.chromium.chrome.browser.download.OTR_PROFILE_ID", OTRProfileID.serialize(oTRProfileID));
            }
            if (activity == null) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            } else {
                intent.addFlags(671088640);
                activity.startActivity(intent);
            }
        }
        if (RC.a().e()) {
            if (oTRProfileID == null) {
                e = Profile.d();
            } else {
                e = Profile.d().e(oTRProfileID);
            }
            LU3.a(e).notifyEvent("download_home_opened");
        }
        EI2.h(i, 16, "Android.DownloadPage.OpenSource");
        if (tab != null && (b = Profile.b(tab.b())) != null) {
            int c = Profile.c(b);
            EI2.h(c, 6, "Download.OpenDownloads.PerProfileType");
            if (i == 9) {
                EI2.h(c, 6, "Download.OpenDownloadsFromMenu.PerProfileType");
            }
        }
        return true;
    }

    public static void openDownload(String str, String str2, String str3, OTRProfileID oTRProfileID, String str4, String str5, int i) {
        String remapGenericMimeType = MimeUtils.remapGenericMimeType(str2, str4, str);
        Context context = ApplicationStatus.c;
        if (context == null) {
            context = V60.a;
        }
        if (g(str, remapGenericMimeType, str3, oTRProfileID, str4, str5, i, context)) {
            return;
        }
        showDownloadManager(null, null, oTRProfileID, i, false);
    }

    public static void h(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        intent.setPackage(context.getPackageName());
        context.startActivity(intent);
    }

    public static CharSequence d(String str, String str2, boolean z, long j, ClickableSpan clickableSpan) {
        String str3;
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new StyleSpan(1), 0, str2.length(), 33);
        spannableString.setSpan(clickableSpan, 0, str2.length(), 33);
        if (!z) {
            return TextUtils.expandTemplate(str, spannableString);
        }
        if (j > 0) {
            str3 = " (" + AbstractC6091ht0.b(j, V60.a) + ")";
        } else {
            str3 = "";
        }
        return TextUtils.expandTemplate(str, spannableString, str3);
    }
}
