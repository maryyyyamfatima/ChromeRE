package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ks4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC7119ks4 implements InterfaceC0467Dp1 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("TEMPLATE_PROCESSING_ERROR_UNSPECIFIED"),
    g("INVALID_VALUE"),
    h("MISSING_FIELD"),
    i("UNKNOWN_EXTENSION"),
    j("MODEL_ERROR"),
    k("COMMAND_EXECUTION_ERROR"),
    l("MISSING_TEMPLATE_ERROR"),
    m("PROPERTY_RESOLUTION_ERROR");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC7119ks4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }

    EnumC7119ks4(String str) {
        this.a = r2;
    }
}
