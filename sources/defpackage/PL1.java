package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PL1 {
    public static OL1 b(Object obj) {
        return (OL1) obj;
    }

    public static LL1 a(Object obj) {
        return ((ML1) obj).a;
    }

    public static boolean d(Object obj) {
        return !((OL1) obj).a;
    }

    public static OL1 f() {
        return OL1.g.c();
    }

    public static OL1 e(Object obj, Object obj2) {
        OL1 ol1 = (OL1) obj;
        OL1 ol12 = (OL1) obj2;
        if (!ol12.isEmpty()) {
            if (!ol1.a) {
                ol1 = ol1.c();
            }
            ol1.b();
            if (!ol12.isEmpty()) {
                ol1.putAll(ol12);
            }
        }
        return ol1;
    }

    public static int c(Object obj, int i, Object obj2) {
        OL1 ol1 = (OL1) obj;
        ML1 ml1 = (ML1) obj2;
        int i2 = 0;
        if (!ol1.isEmpty()) {
            for (Map.Entry entry : ol1.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                ml1.getClass();
                int s = KV.s(i);
                int a = ML1.a(ml1.a, key, value);
                i2 += KV.u(a) + a + s;
            }
        }
        return i2;
    }
}
