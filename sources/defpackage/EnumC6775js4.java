package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: js4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC6775js4 implements InterfaceC0467Dp1 {
    g("INTERNAL_RUNTIME_ERROR_UNSPECIFIED"),
    h("WIRE_FORMAT_ERROR"),
    i("CONFIGURATION_ERROR"),
    j("INTERNAL_TEMPLATE_RESOLUTION_ERROR"),
    k("INTERNAL_ERROR"),
    l("INTERNAL_RESOURCE_ERROR"),
    m("INTERNAL_UTP_ERROR");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC6775js4.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }

    EnumC6775js4(String str) {
        this.a = r2;
    }
}
