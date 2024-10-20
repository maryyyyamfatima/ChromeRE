package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11548xn1 {
    public final SharedPreferences a;

    public C11548xn1() {
        C7432ln3 c = C7432ln3.c();
        try {
            this.a = V60.a.getSharedPreferences("twa_permission_registry", 0);
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final Integer f(int i, C1193Je2 c1193Je2) {
        String e = e(i, c1193Je2);
        SharedPreferences sharedPreferences = this.a;
        if (!sharedPreferences.contains(e)) {
            String d = d(i, c1193Je2);
            if (sharedPreferences.contains(d)) {
                return Integer.valueOf(sharedPreferences.getBoolean(d, false) ? 1 : 2);
            }
            return null;
        }
        return Integer.valueOf(sharedPreferences.getInt(e, 3));
    }

    public final HashSet g() {
        C7432ln3 c = C7432ln3.c();
        try {
            HashSet hashSet = new HashSet(this.a.getStringSet("origins", new HashSet()));
            c.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static String d(int i, C1193Je2 c1193Je2) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (i == 4) {
            str = "geolocation_permission.";
        } else {
            if (i != 5) {
                throw new IllegalStateException("Unsupported permission type.");
            }
            str = "notification_permission.";
        }
        sb.append(str);
        sb.append(c1193Je2.toString());
        return sb.toString();
    }

    public static String e(int i, C1193Je2 c1193Je2) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (i == 4) {
            str = "geolocation_permission_setting.";
        } else {
            if (i != 5) {
                throw new IllegalStateException("Unsupported permission type.");
            }
            str = "notification_permission_setting.";
        }
        sb.append(str);
        sb.append(c1193Je2.toString());
        return sb.toString();
    }

    public static String c(C1193Je2 c1193Je2) {
        return "package_name." + c1193Je2.toString();
    }

    public static String b(C1193Je2 c1193Je2) {
        return "app_name." + c1193Je2.toString();
    }

    public static String a(C1193Je2 c1193Je2) {
        return "all_delegate_apps." + c1193Je2.toString();
    }
}
