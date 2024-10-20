package defpackage;

import android.util.Log;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4851eH1 {
    public static String b(String str, Throwable th, Object... objArr) {
        return ((th != null || objArr.length <= 0) && objArr.length <= 1) ? str : String.format(Locale.US, str, objArr);
    }

    public static String e(String str) {
        if (str.startsWith("cr_")) {
            return str;
        }
        return "cr_" + str.substring(str.startsWith("cr.") ? 3 : 0, str.length());
    }

    public static void d(String str, String str2, Object... objArr) {
        Throwable c = c(objArr);
        String b = b(str2, c, objArr);
        if (c != null) {
            Log.i(e(str), b, c);
        } else {
            Log.i(e(str), b);
        }
    }

    public static void f(String str, String str2, Object... objArr) {
        Throwable c = c(objArr);
        String b = b(str2, c, objArr);
        if (c != null) {
            Log.w(e(str), b, c);
        } else {
            Log.w(e(str), b);
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        Throwable c = c(objArr);
        String b = b(str2, c, objArr);
        if (c != null) {
            Log.e(e(str), b, c);
        } else {
            Log.e(e(str), b);
        }
    }

    public static Throwable c(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }
}
