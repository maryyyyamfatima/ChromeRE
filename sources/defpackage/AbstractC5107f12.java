package defpackage;

import android.net.Uri;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f12, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5107f12 {
    public static boolean a(GURL gurl, boolean z) {
        return (gurl == null || b(gurl.i(), null, z) == 0) ? false : true;
    }

    public static int b(String str, InterfaceC5451g12 interfaceC5451g12, boolean z) {
        if (str == null) {
            return 0;
        }
        Uri parse = Uri.parse(str);
        if (!"chrome-native".equals(parse.getScheme()) && !"chrome".equals(parse.getScheme())) {
            return 0;
        }
        String host = parse.getHost();
        if (interfaceC5451g12 != null && interfaceC5451g12.q().equals(host)) {
            return 1;
        }
        if ("newtab".equals(host)) {
            return 2;
        }
        if ("bookmarks".equals(host)) {
            return 3;
        }
        if ("downloads".equals(host)) {
            return 5;
        }
        if ("history".equals(host)) {
            return 6;
        }
        if ("recent-tabs".equals(host) && !z) {
            return 4;
        }
        if ("explore".equals(host)) {
            return 7;
        }
        if ("apps".equals(host)) {
            return 8;
        }
        return "management".equals(host) ? 9 : 0;
    }
}
