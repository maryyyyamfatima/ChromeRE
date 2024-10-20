package defpackage;

import android.util.Log;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dH1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4508dH1 {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("GMT([-+]\\d{4})$");
    }

    public static boolean d(int i) {
        if (i >= 5) {
            return true;
        }
        if (2 > i) {
            return false;
        }
        return Log.isLoggable("InkCore", i);
    }

    public static void c(String str) {
        if (d(4)) {
            Log.i("InkCore", str);
        }
    }

    public static void e(String str) {
        if (d(5)) {
            Log.w("InkCore", str);
        }
    }

    public static void a(String str) {
        if (d(6)) {
            Log.e("InkCore", str);
        }
    }

    public static void b(String str, Exception exc) {
        if (d(6)) {
            Log.e("InkCore", str, exc);
        }
    }
}
