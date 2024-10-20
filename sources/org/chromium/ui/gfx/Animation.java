package org.chromium.ui.gfx;

import android.provider.Settings;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class Animation {
    public static boolean prefersReducedMotion() {
        return ((double) Settings.Global.getFloat(V60.a.getContentResolver(), "animator_duration_scale", 1.0f)) == 0.0d;
    }
}
