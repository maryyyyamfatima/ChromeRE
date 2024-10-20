package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2185Qv0 {
    public static float a(EdgeEffect edgeEffect) {
        float distance;
        if (Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        try {
            distance = edgeEffect.getDistance();
            return distance;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        float onPullDistance;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                onPullDistance = edgeEffect.onPullDistance(f, f2);
                return onPullDistance;
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
        edgeEffect.onPull(f, f2);
        return f;
    }
}
