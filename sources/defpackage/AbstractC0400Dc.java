package defpackage;

import android.content.Context;
import android.provider.Settings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0400Dc {
    static {
        boolean z = B10.a;
    }

    public static boolean a(Context context) {
        if (B10.c) {
            return false;
        }
        if (B10.b) {
            return (context == null || Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) ? false : true;
        }
        return true;
    }
}
