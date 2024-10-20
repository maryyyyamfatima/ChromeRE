package j$.util;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes3.dex */
public abstract class Objects {
    public static boolean equals(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    public static int hashCode(Object o) {
        if (o != null) {
            return o.hashCode();
        }
        return 0;
    }

    public static Object requireNonNull(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        return obj;
    }
}
