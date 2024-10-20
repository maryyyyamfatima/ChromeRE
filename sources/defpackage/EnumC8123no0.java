package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: no0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC8123no0 implements InterfaceC0467Dp1 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("DYNAMIC_PROP_TYPE_UNKNOWN"),
    g("DYNAMIC_PROP_TYPE_BACKGROUND_COLOR"),
    h("DYNAMIC_PROP_TYPE_ALPHA"),
    i("DYNAMIC_PROP_TYPE_TRANSLATION_X"),
    j("DYNAMIC_PROP_TYPE_TRANSLATION_Y"),
    k("DYNAMIC_PROP_TYPE_SCALE"),
    l("DYNAMIC_PROP_TYPE_ROTATION");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC8123no0.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }

    EnumC8123no0(String str) {
        this.a = r2;
    }
}
