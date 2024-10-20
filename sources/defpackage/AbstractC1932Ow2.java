package defpackage;

import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ow2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1932Ow2 {
    public static final HashMap a = new HashMap();

    public static boolean a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = a;
        return currentTimeMillis - (hashMap.get(str) != null ? ((Long) hashMap.get(str)).longValue() : 0L) < 500;
    }
}
