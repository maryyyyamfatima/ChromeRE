package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iC2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC6203iC2 implements InterfaceC0467Dp1 {
    g("UNKNOWN"),
    h("FAKE_APP"),
    i("AGSA_STARTUP"),
    j("DISCOVER"),
    k("TEST"),
    l("ASSISTANT_LITE");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        return this.a;
    }

    public static EnumC6203iC2 b(int i2) {
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
        return "<" + EnumC6203iC2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }

    EnumC6203iC2(String str) {
        this.a = r2;
    }
}
