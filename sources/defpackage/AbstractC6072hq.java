package defpackage;

import android.content.SharedPreferences;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6072hq {
    public static boolean a(boolean z) {
        return T60.a.getBoolean("autofill_assistant_switch", z);
    }

    public static boolean b() {
        SharedPreferences sharedPreferences = T60.a;
        return sharedPreferences.getBoolean("AUTOFILL_ASSISTANT_ONBOARDING_ACCEPTED", false) || sharedPreferences.getBoolean("AUTOFILL_ASSISTANT_SKIP_INIT_SCREEN", false);
    }

    public static void c(String str, boolean z) {
        SharedPreferences.Editor edit = T60.a.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }
}
