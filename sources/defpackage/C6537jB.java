package defpackage;

import android.content.SharedPreferences;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6537jB {
    public AbstractC1469Lh3 a;

    public static SharedPreferences b(int i) {
        return V60.a.getSharedPreferences(String.format(Locale.US, "widgetState-%d", Integer.valueOf(i)), 0);
    }

    public static void a(int i) {
        SharedPreferences b = b(i);
        if (b != null) {
            b.edit().clear().apply();
        }
    }
}
