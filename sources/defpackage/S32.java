package defpackage;

import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class S32 {
    public static String b() {
        Uri.Builder buildUpon = Uri.parse("chrome-native://newtab/").buildUpon();
        buildUpon.appendQueryParameter("origin", "web-feed");
        return buildUpon.build().toString();
    }

    public static int a(String str) {
        String queryParameter;
        return (T34.j(str) && (queryParameter = Uri.parse(str).getQueryParameter("origin")) != null && queryParameter.equals("web-feed")) ? 1 : 0;
    }
}
