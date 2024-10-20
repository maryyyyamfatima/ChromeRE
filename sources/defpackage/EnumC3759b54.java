package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b54, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3759b54 implements InterfaceC0467Dp1 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("CLIENT_CAPABILITY_UNKNOWN"),
    g("CLIENT_CAPABILITY_PII"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("CLIENT_CAPABILITY_RATING_SCALE_10_11"),
    h("UNRECOGNIZED");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        if (this == h) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(EnumC3759b54.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != h) {
            sb.append(" number=");
            sb.append(a());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    EnumC3759b54(String str) {
        this.a = r2;
    }
}
