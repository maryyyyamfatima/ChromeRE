package defpackage;

import android.content.SharedPreferences;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o91 */
/* loaded from: classes.dex */
public abstract class AbstractC8248o91 {
    public static boolean a;
    public static final Object b = new Object();

    public static void a(SharedPreferences sharedPreferences, InterfaceC5446g03 interfaceC5446g03, C9106qg1 c9106qg1, boolean z) {
        synchronized (b) {
            if (z) {
                sharedPreferences.edit().putBoolean("com.google.android.apps.chrome.icing.HistoryUsageMigrator.HISTORY_MIGRATION_REQUESTED", true).apply();
            } else if (!sharedPreferences.getBoolean("com.google.android.apps.chrome.icing.HistoryUsageMigrator.HISTORY_MIGRATION_REQUESTED", false)) {
                c9106qg1.i.set(true);
                return;
            }
            if (!a) {
                a = true;
                new C7904n91(interfaceC5446g03, c9106qg1, sharedPreferences).c(AbstractC0185Bl.e);
            }
        }
    }
}
