package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QU {
    public static void a() {
        T60.a.edit().remove("Chrome.Clipboard.SharedUri").remove("Chrome.Clipboard.SharedUriTimestamp").apply();
    }

    public static PU b() {
        SharedPreferences sharedPreferences = T60.a;
        C7432ln3 c = C7432ln3.c();
        try {
            String string = sharedPreferences.getString("Chrome.Clipboard.SharedUri", null);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            PU pu = new PU(Uri.parse(string), sharedPreferences.getLong("Chrome.Clipboard.SharedUriTimestamp", 0L));
            c.close();
            return pu;
        } finally {
            try {
                c.close();
            } catch (Throwable unused) {
            }
        }
    }
}
