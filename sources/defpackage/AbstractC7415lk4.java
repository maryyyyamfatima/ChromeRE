package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lk4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7415lk4 {
    public static long a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null || !string.endsWith("L")) {
            return 2147483648L;
        }
        try {
            return Long.parseLong(string.substring(0, string.length() - 1));
        } catch (NumberFormatException unused) {
            return 2147483648L;
        }
    }
}
