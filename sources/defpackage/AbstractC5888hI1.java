package defpackage;

import android.util.Log;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5888hI1 {
    public static final C3826bI1 a = new C3826bI1();

    public static void b(String str, Throwable th) {
        a.getClass();
        HashSet hashSet = C3826bI1.a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }

    public static void a(String str) {
        a.getClass();
        HashSet hashSet = C3826bI1.a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }
}
