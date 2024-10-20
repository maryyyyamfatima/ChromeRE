package defpackage;

import J.N;
import android.content.SharedPreferences;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1556Lz1 {
    public static boolean a() {
        if (C4055bx2.a().a) {
            Boolean bool = Boolean.TRUE;
            SharedPreferences b = C4055bx2.a().b();
            if (b != null) {
                C7432ln3 c = C7432ln3.c();
                try {
                    r3 = b.contains("policy.lens_camera_assisted_search_enabled") ? Boolean.valueOf(b.getBoolean("policy.lens_camera_assisted_search_enabled", false)) : null;
                } finally {
                    try {
                        c.close();
                    } catch (Throwable unused) {
                    }
                }
            }
            return bool.equals(r3);
        }
        return N.MeJM6GLF();
    }
}
