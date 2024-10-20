package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public enum VR3 implements InterfaceC0467Dp1 {
    g("UNKNOWN"),
    h("LINE"),
    i("EDIT"),
    j("MAGIC_ERASER"),
    k("QUERY"),
    l("NOTOOL"),
    m("PUSHER"),
    n("CROP"),
    o("TEXT_HIGHLIGHTER_TOOL"),
    p("STROKE_EDITING_ERASER"),
    q("SMART_HIGHLIGHTER_TOOL"),
    r("EYE_DROPPER"),
    s("TEXT"),
    t("TEXT_PUSHER"),
    u("CURSOR"),
    v("LONGFORM_SELECTION_TOOL"),
    w("LONGFORM_MAKE_SPACE_TOOL"),
    x("LONGFORM_HIGHLIGHTER_TOOL"),
    y("SHAPE"),
    z("TEST_TOOL");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + VR3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }

    VR3(String str) {
        this.a = r2;
    }
}
