package org.chromium.chrome.browser;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import defpackage.A93;
import defpackage.AbstractC0185Bl;
import defpackage.C11679y93;
import defpackage.C12022z93;
import defpackage.C12237zn4;
import defpackage.V60;
import defpackage.Wn4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.chromium.chrome.browser.webapps.WebappRegistry;
import org.chromium.components.webapps.WebappsUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ShortcutHelper {
    public static final HashMap a = new HashMap();
    public static final A93 b = new A93();

    public static boolean doesOriginContainAnyInstalledTwa(String str) {
        WebappRegistry webappRegistry = Wn4.a;
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return webappRegistry.d.g().contains(lowerCase) && !webappRegistry.b().contains(lowerCase);
    }

    public static boolean doesOriginContainAnyInstalledWebApk(String str) {
        WebappRegistry webappRegistry = Wn4.a;
        String lowerCase = str.toLowerCase(Locale.getDefault());
        for (C12237zn4 c12237zn4 : webappRegistry.b.values()) {
            String string = c12237zn4.a.startsWith("webapk-") ? c12237zn4.b.getString("scope", "") : "";
            if (!string.isEmpty() && string.startsWith(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    public static String[] getOriginsWithInstalledWebApksOrTwas() {
        HashSet a2 = Wn4.a.a();
        return (String[]) a2.toArray(new String[a2.size()]);
    }

    public static void setForceWebApkUpdate(String str) {
        C12237zn4 c = Wn4.a.c(str);
        if (c != null) {
            c.b(true);
        }
    }

    public static void storeWebappSplashImage(String str, Bitmap bitmap) {
        C12237zn4 c = Wn4.a.c(str);
        if (c == null) {
            a.put(str, bitmap);
        } else {
            new C12022z93(bitmap, c).c(AbstractC0185Bl.e);
        }
    }

    public static void addWebapp(String str, String str2, String str3, String str4, String str5, String str6, String str7, Bitmap bitmap, boolean z, int i, int i2, int i3, long j, long j2) {
        new C11679y93(str, str2, str3, str5, str6, str7, str4, bitmap, z, i, i2, i3, j, j2).c(AbstractC0185Bl.e);
    }

    public static Intent a(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, long j, long j2, boolean z, boolean z2) {
        Intent intent = new Intent();
        Intent intent2 = intent.setPackage(V60.a.getPackageName());
        b.getClass();
        intent2.setAction("com.google.android.apps.chrome.webapps.WebappManager.ACTION_START_WEBAPP").putExtra("org.chromium.chrome.browser.webapp_id", str).putExtra("org.chromium.chrome.browser.webapp_url", str2).putExtra("org.chromium.chrome.browser.webapp_scope", str3).putExtra("org.chromium.chrome.browser.webapp_name", str4).putExtra("org.chromium.chrome.browser.webapp_short_name", str5).putExtra("org.chromium.chrome.browser.webapp_icon", str6).putExtra("org.chromium.chrome.browser.webapp_shortcut_version", i).putExtra("org.chromium.chrome.browser.webapp_display_mode", i2).putExtra("org.chromium.content_public.common.orientation", i3).putExtra("org.chromium.chrome.browser.theme_color", j).putExtra("org.chromium.chrome.browser.background_color", j2).putExtra("org.chromium.chrome.browser.is_icon_generated", z).putExtra("org.chromium.chrome.browser.webapp_icon_adaptive", z2);
        return intent;
    }

    public static void addShortcut(String str, String str2, String str3, Bitmap bitmap, boolean z, int i, String str4) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
        intent.putExtra("REUSE_URL_MATCHING_TAB_ELSE_NEW_TAB", true);
        intent.putExtra("org.chromium.chrome.browser.webapp_id", str);
        intent.putExtra("org.chromium.chrome.browser.webapp_source", i);
        intent.setPackage(V60.a.getPackageName());
        b.getClass();
        WebappsUtils.a(str, str3, bitmap, z, intent);
    }

    public static String b(String str) {
        Uri parse = Uri.parse(str);
        String encodedPath = parse.getEncodedPath();
        int lastIndexOf = encodedPath == null ? -1 : encodedPath.lastIndexOf("/");
        if (lastIndexOf < 0) {
            encodedPath = "/";
        } else if (lastIndexOf < encodedPath.length() - 1) {
            encodedPath = encodedPath.substring(0, lastIndexOf + 1);
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.encodedPath(encodedPath);
        buildUpon.fragment("");
        buildUpon.query("");
        return buildUpon.build().toString();
    }
}
