package defpackage;

import android.os.SystemClock;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5195fH1 {
    public static String b(String str, Object... objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            String str2 = Thread.currentThread().getId() + ":" + Thread.currentThread().getName();
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
            String className = stackTraceElement.getClassName();
            int lineNumber = stackTraceElement.getLineNumber();
            return elapsedRealtime + " " + str2 + " <" + className.substring(className.lastIndexOf(".") + 1) + "@" + lineNumber + ">: " + String.format(str, objArr);
        } catch (Exception unused) {
            return elapsedRealtime + " " + String.format(str, objArr);
        }
    }

    public static void a(String str, Object... objArr) {
        if (Log.isLoggable("LensSdk", 3)) {
            b(str, objArr);
        }
    }
}
