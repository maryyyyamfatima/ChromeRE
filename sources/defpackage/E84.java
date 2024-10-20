package defpackage;

import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class E84 {
    public final int[] a = {0, 0, 0, 0};

    public static E84 a(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (split.length != 4) {
            return null;
        }
        E84 e84 = new E84();
        for (int i = 0; i < 4; i++) {
            try {
                e84.a[i] = Integer.parseInt(split[i]);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return e84;
    }

    public final String toString() {
        Locale locale = Locale.US;
        int[] iArr = this.a;
        return String.format(locale, "%d.%d.%d.%d", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(iArr[2]), Integer.valueOf(iArr[3]));
    }

    public final boolean b(E84 e84) {
        for (int i = 0; i < 4; i++) {
            int i2 = this.a[i];
            int i3 = e84.a[i];
            if (i2 < i3) {
                return true;
            }
            if (i2 > i3) {
                return false;
            }
        }
        return false;
    }
}
