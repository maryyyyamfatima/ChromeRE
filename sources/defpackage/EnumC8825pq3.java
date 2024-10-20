package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pq3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC8825pq3 implements InterfaceC0467Dp1 {
    g("COMPLETION_STYLE_UNKNOWN"),
    h("COMPLETION_STYLE_CARD"),
    i("COMPLETION_STYLE_TOAST"),
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
        sb.append(EnumC8825pq3.class.getName());
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

    EnumC8825pq3(String str) {
        this.a = r2;
    }
}
