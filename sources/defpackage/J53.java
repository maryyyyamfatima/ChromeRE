package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class J53 {
    public final Context a;

    public J53(Context context) {
        this.a = context.getApplicationContext();
    }

    public final String a(String str) {
        String str2;
        String string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        if (string == null) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(AbstractC9771sd.b(string.concat(str)));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            Formatter formatter = new Formatter(sb);
            for (byte b : digest) {
                formatter.format("%02x", Byte.valueOf(b));
            }
            str2 = sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            Log.e("HashUtil", "Unable to find digest algorithm MD5");
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }
}
