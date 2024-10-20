package defpackage;

import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class WH1 {
    public static String a(String str, String str2, boolean z) {
        if (str2.length() + str.length() > 23) {
            int i = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char charAt = str2.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str2 = str2.substring(i + 1);
        }
        String a = AbstractC7848n0.a(str, str2);
        return (z || Build.VERSION.SDK_INT < 26) ? a.substring(0, Math.min(a.length(), 23)) : a;
    }
}
