package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jy2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1293Jy2 {
    public final Context a;
    public long b = 0;
    public SharedPreferences c = null;
    public SharedPreferences.Editor d;
    public boolean e;
    public String f;
    public PreferenceScreen g;
    public InterfaceC1163Iy2 h;
    public InterfaceC0903Gy2 i;
    public InterfaceC1033Hy2 j;

    public C1293Jy2(Context context) {
        this.a = context;
        this.f = context.getPackageName() + "_preferences";
    }

    public final PreferenceScreen a(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.t(this);
        return preferenceScreen;
    }

    public final SharedPreferences c() {
        if (this.c == null) {
            this.c = this.a.getSharedPreferences(this.f, 0);
        }
        return this.c;
    }

    public final SharedPreferences.Editor b() {
        if (this.e) {
            if (this.d == null) {
                this.d = c().edit();
            }
            return this.d;
        }
        return c().edit();
    }
}
