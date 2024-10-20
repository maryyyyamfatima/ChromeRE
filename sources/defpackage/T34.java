package defpackage;

import J.N;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.chromium.base.library_loader.b;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class T34 {
    public static final Pattern a = Pattern.compile("^(www[0-9]*|web|ftp|wap|home|mobile|amp)\\.");
    public static final ArrayList b = new ArrayList(Arrays.asList("about", "data", "file", "http", "https", "inline", "javascript"));
    public static final ArrayList c = new ArrayList(Arrays.asList("data", "blob", "file", "filesystem", "http", "https"));
    public static final HashSet d = AbstractC9048qW.d("chrome", "chrome-native", "about");

    public static boolean m(GURL gurl) {
        return gurl != null && gurl.h().equals("tel");
    }

    public static String c(GURL gurl) {
        return (!GURL.l(gurl) && m(gurl)) ? gurl.f() : "";
    }

    public static boolean e(GURL gurl) {
        if (GURL.l(gurl)) {
            return false;
        }
        return b.contains(gurl.h());
    }

    public static boolean i(GURL gurl) {
        return d.contains(gurl.h());
    }

    public static boolean h(GURL gurl) {
        return l(gurl.h());
    }

    public static boolean g(GURL gurl) {
        if (gurl.b) {
            return c.contains(gurl.h());
        }
        return false;
    }

    public static boolean k(GURL gurl) {
        if (gurl.b && i(gurl)) {
            return "newtab".equals(gurl.d());
        }
        return false;
    }

    public static boolean l(String str) {
        return "http".equals(str) || "https".equals(str);
    }

    public static String b(String str, boolean z) {
        return TextUtils.isEmpty(str) ? str : N.M3l9sLoY(str, z);
    }

    public static boolean p(String str, String str2) {
        if (TextUtils.equals(str, str2)) {
            return true;
        }
        return N.Ml0jhLAz(str, str2);
    }

    public static String n(String str) {
        Uri parse = Uri.parse(str);
        StringBuilder sb = new StringBuilder();
        sb.append(parse.getScheme());
        sb.append("://");
        String str2 = "";
        sb.append(parse.getHost() != null ? parse.getHost() : "");
        if (parse.getPort() != -1) {
            str2 = ":" + parse.getPort();
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String o(String str) {
        String trim = str.trim();
        if (trim.startsWith("https://")) {
            return trim.substring(8);
        }
        return trim.startsWith("http://") ? trim.substring(7) : trim;
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return k(AbstractC10615v34.a(str));
    }

    public static boolean d(GURL gurl) {
        return gurl.h().equals("android-app") || gurl.h().equals("intent");
    }

    public static boolean f(String str) {
        return b.n.f() ? j(str) : TextUtils.equals(str, "chrome-native://newtab/") || TextUtils.equals(str, "chrome://newtab/") || TextUtils.equals(str, "about:newtab");
    }

    public static String a(String str) {
        return C1415Kx.c().d(a.matcher(N.M25QTkfm(N.MpCt7siL(str))).replaceFirst(""));
    }
}
