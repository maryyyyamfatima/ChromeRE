package defpackage;

import J.N;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.android.chrome.R;
import java.util.Arrays;
import java.util.Locale;
import org.chromium.base.LocaleUtils;
import org.chromium.ui.base.ResourceBundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iO */
/* loaded from: classes.dex */
public abstract class AbstractC6260iO {
    public static void a() {
        String str;
        LocaleList localeList;
        Locale locale;
        String b = LocaleUtils.b(Locale.getDefault().toLanguageTag());
        if (Build.VERSION.SDK_INT >= 24) {
            localeList = LocaleList.getDefault();
            locale = localeList.get(0);
            str = LocaleUtils.b(locale.toLanguageTag());
        } else {
            str = b;
        }
        C4305ci c4305ci = AbstractC4649di.a;
        int i = 1;
        boolean z = TextUtils.equals(b, null) || Arrays.binarySearch(ResourceBundle.a, b, c4305ci) >= 0;
        boolean z2 = TextUtils.equals(str, null) || Arrays.binarySearch(ResourceBundle.a, str, c4305ci) >= 0;
        String b2 = LocaleUtils.b(V60.a.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1403dd));
        String b3 = LocaleUtils.b(N.MqGtfAYA());
        boolean equals = TextUtils.equals(b, b2);
        boolean equals2 = TextUtils.equals(b, b3);
        boolean z3 = C6132i01.d.c;
        EI2.h(z3 ? 3 : z2 ? 0 : (!z || z2) ? 2 : 1, 4, "LanguageUsage.UI.Android.Availability");
        boolean z4 = (z2 || z) ? false : true;
        EI2.h(z4 ? 2 : (equals && equals2) ? 0 : (!equals || equals2) ? 1 : 3, 4, "LanguageUsage.UI.Android.Correctness");
        if (!z3) {
            if (z4) {
                i = 2;
            } else if (equals) {
                i = 0;
            }
            EI2.h(i, 4, "LanguageUsage.UI.Android.Correctness.NoOverride");
            return;
        }
        if (equals && equals2) {
            i = 0;
        } else if (equals && !equals2) {
            i = 3;
        }
        EI2.h(i, 4, "LanguageUsage.UI.Android.Correctness.Override");
    }
}
