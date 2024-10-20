package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3502aM1 {
    public static int a(int i) {
        if (i < 3) {
            RV.b(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static Object b(Map map, Object obj) {
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }
}
