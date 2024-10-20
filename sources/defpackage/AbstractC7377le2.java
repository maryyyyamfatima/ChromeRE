package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: le2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7377le2 {
    public static final Set a;
    public static final C0202Bo1 b;

    static {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{"__overflow"}[0];
        Objects.requireNonNull(obj);
        if (!hashSet.add(obj)) {
            throw new IllegalArgumentException("duplicate element: " + obj);
        }
        a = Collections.unmodifiableSet(hashSet);
        b = new C0202Bo1(100, "OptimizationGuidePushNotifications", "max_cache_size");
    }

    public static String a(R71 r71) {
        return AbstractC6265iP.l.b(r71.toString());
    }

    public static boolean b(Set set) {
        return set != null && set.equals(a);
    }
}
