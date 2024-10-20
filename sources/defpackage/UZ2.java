package defpackage;

import J.N;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class UZ2 {
    public static void a(SZ2 sz2, int i, String str, KF1 kf1) {
        String b = sz2.b(i);
        ArrayList arrayList = new ArrayList();
        if (i == 1 || i == 2) {
            arrayList.add("CEI");
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add("CEB");
        }
        if (str.startsWith("google.")) {
            arrayList.add("CEF");
        } else if (str.equals(sz2.a())) {
            arrayList.add("CES");
        } else if (str.equals("mail.ru")) {
            arrayList.add("CEC");
        } else if (!TextUtils.isEmpty(str)) {
            arrayList.add("CEA");
        }
        String upperCase = new J53(V60.a).a("RLZSalt").toUpperCase(Locale.getDefault());
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 50) {
            sb.append(upperCase);
        }
        N.Mh7j11qR(Profile.d(), b, Locale.getDefault().getLanguage(), TextUtils.join(",", arrayList), sb.substring(0, 50), kf1);
    }
}
