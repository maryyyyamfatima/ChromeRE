package org.chromium.components.browser_ui.accessibility;

import J.N;
import android.content.SharedPreferences;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C7432ln3;
import defpackage.C9912t1;
import defpackage.JM1;
import defpackage.T60;
import defpackage.V60;
import java.util.Iterator;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class FontSizePrefs {
    public static FontSizePrefs c;
    public final long a;
    public final C12157za2 b = new C12157za2();

    public final void c(boolean z, boolean z2) {
        T60.a.edit().putBoolean("user_set_force_enable_zoom", z2).apply();
        N.MkBbXiXK(this.a, this, z);
    }

    public FontSizePrefs(Profile profile) {
        this.a = N.MsRweqIy(this, profile);
    }

    public final float a() {
        C7432ln3 c2 = C7432ln3.c();
        try {
            SharedPreferences sharedPreferences = T60.a;
            float f = sharedPreferences.getFloat("user_font_scale_factor", 0.0f);
            c2.close();
            if (f == 0.0f) {
                float Maawwu0p = N.Maawwu0p(this.a, this);
                f = Math.abs(Maawwu0p - 1.0f) <= 0.001f ? 1.0f : JM1.b(Maawwu0p / V60.a.getResources().getConfiguration().fontScale, 0.5f, 2.0f);
                sharedPreferences.edit().putFloat("user_font_scale_factor", f).apply();
            }
            return f;
        } catch (Throwable th) {
            try {
                c2.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void onFontScaleFactorChanged(float f) {
        float a = a();
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            }
            TextScalePreference textScalePreference = ((C9912t1) c11814ya2.next()).a.j0;
            textScalePreference.U = f;
            textScalePreference.T = a;
            textScalePreference.V.setText(textScalePreference.X.format(a));
            textScalePreference.W.setTextSize(1, textScalePreference.U * 12.0f);
        }
    }

    public final void onForceEnableZoomChanged(boolean z) {
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((C9912t1) c11814ya2.next()).a.m0.W(z);
            }
        }
    }

    public final void b(float f) {
        long j = this.a;
        float Maawwu0p = N.Maawwu0p(j, this);
        N.M3_4WQmR(j, this, f);
        if (Maawwu0p < 1.3f && f >= 1.3f && !N.MYwzxNqz(j, this)) {
            c(true, false);
            return;
        }
        if (Maawwu0p < 1.3f || f >= 1.3f) {
            return;
        }
        C7432ln3 c2 = C7432ln3.c();
        try {
            boolean z = T60.a.getBoolean("user_set_force_enable_zoom", false);
            c2.close();
            if (z) {
                return;
            }
            c(false, false);
        } catch (Throwable th) {
            try {
                c2.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
