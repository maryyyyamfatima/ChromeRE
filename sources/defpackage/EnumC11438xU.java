package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC11438xU implements InterfaceC0467Dp1 {
    g("ERROR_TYPE_UNKNOWN"),
    h("ERROR_TYPE_MISSING_IMAGE_SOURCE_DEPRECATED"),
    i("ERROR_TYPE_UNSUPPORTED_TEMPLATE_CONFIG_EXTENSION_DEPRECATED"),
    j("ERROR_TYPE_TEMPLATE_PROCESSING_ERROR_DEPRECATED"),
    k("ERROR_TYPE_COMMAND_ERROR_DEPRECATED"),
    l("ERROR_TYPE_TEMPLATE_CONFIG_RESOLVER_ERROR_DEPRECATED"),
    m("ERROR_TYPE_UNSPECIFIED_DEPRECATED"),
    n("ERROR_TYPE_NULL_COMPONENT_CONTEXT_DEPRECATED"),
    o("NULL_COMPONENT_CONTEXT_ERROR_DEPRECATED"),
    p("ERROR_TYPE_IMAGE_PRELOAD_DEPRECATED"),
    q("ERROR_TYPE_ROOT_ELEMENT_CONVERTER_DEPRECATED"),
    r("LOG_LEVEL_INFO_DEPRECATED"),
    s("LOG_LEVEL_WARN"),
    t("LOG_LEVEL_ERROR_DEPRECATED"),
    u("LOG_TYPE_INVALID_FIELD"),
    v("LOG_TYPE_MISSING_FIELD"),
    w("LOG_TYPE_UNKNOWN_EXTENSION"),
    x("LOG_TYPE_MODEL_ERROR"),
    y("LOG_TYPE_WIRE_FORMAT_ERROR"),
    z("LOG_TYPE_CONFIGURATION_ERROR"),
    A("LOG_TYPE_INTERNAL_ERROR"),
    B("LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR"),
    C("LOG_TYPE_INTERNAL_MISSING_RESOURCE_ERROR"),
    D("LOG_TYPE_COMMAND_EXECUTION_ERROR"),
    E("LOG_TYPE_INTERNAL_RESOURCE_ERROR"),
    F("LOG_TYPE_INTERNAL_UTP_ERROR"),
    G("LOG_TYPE_RESOURCE_WARNING"),
    H("LOG_TYPE_PROPERTY_RESOLUTION_ERROR");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC11438xU.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }

    EnumC11438xU(String str) {
        this.a = r2;
    }
}
