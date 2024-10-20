package defpackage;

import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pB3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8604pB3 {
    public static long a;
    public static int b;
    public static boolean c;
    public static boolean d;

    public static void a(boolean z) {
        String str;
        if (a <= 0) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - a;
        int i = b;
        if (i == 0) {
            str = "Tabs.SwitchFromCloseLatency";
        } else if (i == 1) {
            str = "Tabs.SwitchFromExitLatency";
        } else if (i == 2) {
            str = "Tabs.SwitchFromNewLatency";
        } else if (i != 3) {
            return;
        } else {
            str = "Tabs.SwitchFromUserLatency";
        }
        EI2.n(uptimeMillis, str.concat(z ? "_Perceived" : "_Actual"));
    }
}
