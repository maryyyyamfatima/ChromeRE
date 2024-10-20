package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public enum R64 implements InterfaceC0467Dp1 {
    g("UNKNOWN"),
    h("BACKEND_TIMEOUT"),
    i("FAILED_TO_FETCH_SURVEY"),
    j("NO_AVAILABLE_SURVEY"),
    k("TRIGGER_ID_NOT_SET"),
    l("UNSUPPORTED_CRONET_ENGINE"),
    m("UNRECOGNIZED");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        if (this == m) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(R64.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != m) {
            sb.append(" number=");
            sb.append(a());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    R64(String str) {
        this.a = r2;
    }
}
