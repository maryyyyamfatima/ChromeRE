package defpackage;

import J.N;
import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2726Uz1 {
    public static int a = -1;
    public static int b = -1;

    public static boolean c(I44 i44, I44 i442) {
        return Arrays.equals(i44.a.getIntArray("gws_experiment_ids"), i442.a.getIntArray("gws_experiment_ids")) && i44.a().a.getBoolean("is_signed_in") == i442.a().a.getBoolean("is_signed_in") && i44.a().a.getBoolean("is_incognito") == i442.a().a.getBoolean("is_incognito") && i44.a().a.getBoolean("is_usage_and_crash_reporting_disabled") == i442.a().a.getBoolean("is_usage_and_crash_reporting_disabled");
    }

    public static int d(C1297Jz1 c1297Jz1) {
        int i = c1297Jz1.i;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 18;
        }
        if (i == 3) {
            return 43;
        }
        if (i == 4) {
            return 44;
        }
        if (i == 5) {
            return 45;
        }
        if (i != 6) {
            return c1297Jz1.f;
        }
        return 52;
    }

    public static String e(Context context) {
        String b2;
        return (context == null || (b2 = NW0.c(context).b()) == null) ? "" : b2;
    }

    public static boolean a() {
        C7928nE c7928nE = UN.a;
        return N.M09VlOh_("ContextMenuGoogleLensChip");
    }

    public static boolean b() {
        C7928nE c7928nE = UN.a;
        return N.M09VlOh_("ContextMenuTranslateWithGoogleLens");
    }

    public static String f(String str, String str2, String str3) {
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_(str)) {
            return "";
        }
        String MMltG$kc = N.MMltG$kc(str, str2);
        return TextUtils.isEmpty(MMltG$kc) ? str3 : MMltG$kc;
    }
}
