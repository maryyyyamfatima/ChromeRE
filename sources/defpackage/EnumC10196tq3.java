package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tq3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC10196tq3 implements InterfaceC0467Dp1 {
    g("PROMPT_STYLE_UNKNOWN"),
    h("PROMPT_STYLE_FIRST_CARD_NON_MODAL"),
    i("PROMPT_STYLE_FIRST_CARD_MODAL"),
    j("UNRECOGNIZED");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        if (this == j) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(EnumC10196tq3.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != j) {
            sb.append(" number=");
            sb.append(a());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    EnumC10196tq3(String str) {
        this.a = r2;
    }
}
