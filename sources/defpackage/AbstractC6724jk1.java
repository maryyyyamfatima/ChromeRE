package defpackage;

import android.app.KeyguardManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6724jk1 {
    public static boolean a() {
        return ((KeyguardManager) V60.a.getSystemService("keyguard")).isDeviceSecure();
    }
}
