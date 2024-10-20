package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public enum Y54 implements InterfaceC0467Dp1 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("UNKNOWN"),
    g("CLIENT_ACTIVITY_WAS_DESTROYED"),
    h("CLIENT_ACTIVITY_WAS_FINISHING"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("CLIENT_ACTIVITY_WAS_NULL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("INVALID_AUTH_PARAMS"),
    i("INVALID_COMPLETION_STYLE"),
    j("INVALID_PROMPT_STYLE"),
    k("INVALID_SURVEY_DATA_TYPE"),
    l("INVALID_SURVEY_PAYLOAD"),
    m("SURVEY_ALREADY_RUNNING"),
    n("SURVEY_EXPIRED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("SURVEY_NOT_IN_KEY_WINDOW"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("VIEW_CONTROLLER_NOT_FULL_SIZE"),
    o("UNRECOGNIZED");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        if (this == o) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(Y54.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != o) {
            sb.append(" number=");
            sb.append(a());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    Y54(String str) {
        this.a = r2;
    }
}
