package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ss4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC9866ss4 {
    g("INHERIT"),
    h("LTR"),
    i("RTL");

    public final int a;

    EnumC9866ss4(String str) {
        this.a = r2;
    }

    public static EnumC9866ss4 a(int i2) {
        if (i2 == 0) {
            return g;
        }
        if (i2 == 1) {
            return h;
        }
        if (i2 == 2) {
            return i;
        }
        throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown enum value: ", i2));
    }
}
