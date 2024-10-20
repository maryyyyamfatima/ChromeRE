package defpackage;

import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ej4 {
    public int a = 3;
    public int b = 1;

    public final void a(int i) {
        if (i == 0 || i == 0 || i == 2 || i == 1 || i == 23 || i == 3) {
            this.a = i;
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i)));
    }
}
