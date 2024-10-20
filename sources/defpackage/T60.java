package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class T60 {
    public static final SharedPreferences a;

    static {
        C7432ln3 e = C7432ln3.e();
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(V60.a);
            e.close();
            a = defaultSharedPreferences;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
