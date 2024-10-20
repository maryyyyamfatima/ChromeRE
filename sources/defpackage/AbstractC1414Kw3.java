package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kw3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1414Kw3 {
    public static String a(int i) {
        return V60.a.getSharedPreferences("tab_group_titles", 0).getString(String.valueOf(i), null);
    }

    public static void b(int i, String str) {
        V60.a.getSharedPreferences("tab_group_titles", 0).edit().putString(String.valueOf(i), str).apply();
    }
}
