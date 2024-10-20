package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public enum N51 implements InterfaceC0467Dp1 {
    g("HAPTIC_TYPE_UNKNOWN"),
    h("HAPTIC_TYPE_LIGHT_IMPACT"),
    i("HAPTIC_TYPE_MEDIUM_IMPACT"),
    j("HAPTIC_TYPE_HEAVY_IMPACT"),
    k("HAPTIC_TYPE_SELECTION_CLICK"),
    l("HAPTIC_TYPE_SUCCESS");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        return this.a;
    }

    public static N51 b(int i2) {
        if (i2 == 0) {
            return g;
        }
        if (i2 == 1) {
            return h;
        }
        if (i2 == 2) {
            return i;
        }
        if (i2 == 3) {
            return j;
        }
        if (i2 == 4) {
            return k;
        }
        if (i2 != 5) {
            return null;
        }
        return l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + N51.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }

    N51(String str) {
        this.a = r2;
    }
}
