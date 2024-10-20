package defpackage;

import android.content.Context;
import java.util.Random;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HF0 {
    public static final Random b = new Random();
    public final Context a;

    public HF0(Context context) {
        this.a = context;
    }

    public final long a() {
        long min;
        Context context = this.a;
        if (context.getSharedPreferences("com.google.android.apps.chrome.omaha", 0).getInt("backoffFailedAttempts", 0) == 0) {
            min = Math.min(3600000L, 18000000L);
        } else {
            min = Math.min((b.nextInt(1 << Math.min(10, r3)) + 1) * 3600000, 18000000L);
        }
        context.getSharedPreferences("com.google.android.apps.chrome.omaha", 0).edit().putLong("delay", min).apply();
        return System.currentTimeMillis() + min;
    }
}
