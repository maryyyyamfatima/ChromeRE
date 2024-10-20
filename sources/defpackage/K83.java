package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class K83 {
    public static SharedPreferences a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (a == null) {
                a = (SharedPreferences) AbstractC7776mn3.a(new J83(context));
            }
            sharedPreferences = a;
        }
        return sharedPreferences;
    }
}
