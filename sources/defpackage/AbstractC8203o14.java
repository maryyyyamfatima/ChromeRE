package defpackage;

import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o14, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8203o14 {
    public static final Object a = new Object();
    public static final HashMap b = new HashMap();

    public static J53 a() {
        J53 j53;
        synchronized (a) {
            HashMap hashMap = b;
            if (!hashMap.containsKey("SETTINGS_SECURE_ANDROID_ID")) {
                throw new IllegalArgumentException("Unknown generator type SETTINGS_SECURE_ANDROID_ID");
            }
            j53 = (J53) hashMap.get("SETTINGS_SECURE_ANDROID_ID");
        }
        return j53;
    }
}
