package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ht0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6091ht0 {
    public static final int[] a = {R.string.f73030_resource_name_obfuscated_res_0x7f140457, R.string.f73040_resource_name_obfuscated_res_0x7f140458, R.string.f73010_resource_name_obfuscated_res_0x7f140455};

    public static String c(Context context, int[] iArr, long j) {
        int i;
        float f;
        float f2;
        if (j / 1048576 < 1) {
            i = iArr[0];
            f = (float) j;
            f2 = 1024.0f;
        } else if (j / 1073741824 < 1) {
            i = iArr[1];
            f = (float) j;
            f2 = 1048576.0f;
        } else {
            i = iArr[2];
            f = (float) j;
            f2 = 1.0737418E9f;
        }
        return context.getResources().getString(i, Float.valueOf(f / f2));
    }

    public static String b(long j, Context context) {
        return c(context, a, j);
    }

    public static long a(String str, String str2, String str3, String str4, long j, String str5, String str6) {
        long addCompletedDownload;
        Context context = V60.a;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        boolean z = !new C6861k72(context).a();
        try {
            if (Build.VERSION.SDK_INT > 23) {
                addCompletedDownload = downloadManager.addCompletedDownload(str, str2, true, str3, str4, j, z, d(str5), TextUtils.isEmpty(str6) ? null : Uri.parse(str6));
                return addCompletedDownload;
            }
            return downloadManager.addCompletedDownload(str, str2, true, str3, str4, j, z);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static Uri d(String str) {
        Uri parse = TextUtils.isEmpty(str) ? null : Uri.parse(str);
        if (parse != null) {
            String scheme = parse.normalizeScheme().getScheme();
            if (scheme == null) {
                return null;
            }
            if (!scheme.equals("https") && !scheme.equals("http")) {
                return null;
            }
        }
        return parse;
    }
}
