package defpackage;

import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oz1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8531oz1 {
    public static C6161i50 a(String str, boolean z) {
        return new C6161i50(z ? "LEGACY_OFFLINE_PAGE" : "LEGACY_DOWNLOAD", str);
    }

    public static boolean b(C6161i50 c6161i50) {
        String str;
        return (c6161i50 == null || (str = c6161i50.a) == null || !str.startsWith("LEGACY_DOWNLOAD")) ? false : true;
    }

    public static boolean c(C6161i50 c6161i50) {
        return c6161i50 != null && TextUtils.equals("LEGACY_OFFLINE_PAGE", c6161i50.a);
    }
}
