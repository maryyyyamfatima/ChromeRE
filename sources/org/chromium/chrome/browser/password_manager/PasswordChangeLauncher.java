package org.chromium.chrome.browser.password_manager;

import android.app.Activity;
import defpackage.AbstractC2934Wp;
import defpackage.C5965hX3;
import defpackage.C6309iX3;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordChangeLauncher {
    public static void start(WindowAndroid windowAndroid, GURL gurl, String str, boolean z) {
        try {
            Activity activity = (Activity) windowAndroid.k().get();
            C5965hX3 e = C6309iX3.e();
            e.a("", "DEBUG_BUNDLE_ID");
            e.a("", "DEBUG_SOCKET_ID");
            e.a(URLEncoder.encode(str, "UTF-8"), "PASSWORD_CHANGE_USERNAME");
            e.a(Boolean.valueOf(z), "PASSWORD_CHANGE_SKIP_LOGIN");
            e.a("PASSWORD_CHANGE", "INTENT");
            Boolean bool = Boolean.TRUE;
            e.a(bool, "START_IMMEDIATELY");
            e.a(bool, "ENABLED");
            e.a(URLEncoder.encode(gurl.i(), "UTF-8"), "ORIGINAL_DEEPLINK");
            e.a(7, "CALLER");
            e.a(Integer.valueOf(z ? 10 : 11), "SOURCE");
            AbstractC2934Wp.b(activity, e.a);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException("Encoding not available.", e2);
        }
    }
}
