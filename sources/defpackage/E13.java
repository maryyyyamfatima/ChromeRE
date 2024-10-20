package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class E13 {
    public static InterfaceC9173qr2 b(C7849n00 c7849n00, int i, Y03 y03, Y03 y032) {
        C5524gE1 e = c7849n00.e();
        if (e == null) {
            return null;
        }
        InterfaceC9173qr2 a = VH1.a(c7849n00, e, e.b(c7849n00, i));
        if (a != null) {
            a.g("section_current", y03 == null ? "null" : y03.j);
            a.g("section_next", y032 != null ? y032.j : "null");
        }
        return a;
    }

    public static String a(int i) {
        if (i == -1) {
            return "none";
        }
        if (i == 0) {
            return "setRoot";
        }
        if (i == 1) {
            return "setRootAsync";
        }
        if (i == 2) {
            return "updateState";
        }
        if (i == 3) {
            return "updateStateAsync";
        }
        throw new IllegalStateException("Unknown source");
    }
}
