package defpackage;

import android.text.TextUtils;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ON3 {
    public static String a(String str, GURL gurl) {
        if (!TextUtils.isEmpty(str) || gurl == null || GURL.l(gurl)) {
            return str;
        }
        String d = gurl.d();
        String str2 = "";
        if (d == null) {
            d = "";
        }
        String f = gurl.f();
        if (f != null && !f.equals("/")) {
            str2 = f;
        }
        return d.concat(str2);
    }
}
