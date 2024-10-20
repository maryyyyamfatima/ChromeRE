package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class M00 {
    public static void b(C3025Xh0 c3025Xh0, int i, StringBuilder sb) {
        if (c3025Xh0 == null) {
            return;
        }
        sb.append(c3025Xh0.d().c0());
        sb.append('{');
        C11703yE1 g = c3025Xh0.g();
        C5337fi0 c5337fi0 = c3025Xh0.b == 0 ? new C5337fi0(c3025Xh0.a) : null;
        sb.append((g == null || g.getVisibility() != 0) ? "H" : "V");
        if (c5337fi0 != null && c5337fi0.a() != null) {
            sb.append(" [clickable]");
        }
        if (c5337fi0 != null) {
            sb.append(" ");
            InterfaceC3331Zq1 interfaceC3331Zq1 = c5337fi0.a;
            AbstractC11581xs4 W0 = interfaceC3331Zq1.W0();
            sb.append(W0 != null ? W0.g() : -1.0f);
            sb.append("x");
            AbstractC11581xs4 W02 = interfaceC3331Zq1.W0();
            sb.append(W02 != null ? W02.d() : -1.0f);
        }
        sb.append('}');
        for (C3025Xh0 c3025Xh02 : c3025Xh0.c()) {
            sb.append("\n");
            for (int i2 = 0; i2 <= i; i2++) {
                sb.append("  ");
            }
            b(c3025Xh02, i + 1, sb);
        }
    }

    public static String a(C7849n00 c7849n00) {
        if (c7849n00 == null) {
            return "ComponentContext is null";
        }
        C3025Xh0 h = C3025Xh0.h(c7849n00.l);
        if (h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        b(h, 0, sb);
        return sb.toString();
    }
}
