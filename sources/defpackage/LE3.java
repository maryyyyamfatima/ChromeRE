package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class LE3 {
    public static final HE3 a;
    public static final IE3 g;
    public static final JE3 h;
    public static final KE3 i;
    public static final /* synthetic */ LE3[] j;

    public abstract int b(Object obj, Object obj2);

    public LE3(String str, int i2) {
    }

    public static LE3[] values() {
        return (LE3[]) j.clone();
    }

    static {
        HE3 he3 = new HE3();
        a = he3;
        IE3 ie3 = new IE3();
        g = ie3;
        JE3 je3 = new JE3();
        h = je3;
        KE3 ke3 = new KE3();
        i = ke3;
        j = new LE3[]{he3, ie3, je3, ke3};
    }

    public static LE3 a(Object obj) {
        if (obj instanceof String) {
            return g;
        }
        if (obj instanceof Boolean) {
            return a;
        }
        if (obj instanceof Long) {
            return h;
        }
        if (obj instanceof Double) {
            return i;
        }
        throw new AssertionError("invalid tag type: " + obj.getClass());
    }
}
