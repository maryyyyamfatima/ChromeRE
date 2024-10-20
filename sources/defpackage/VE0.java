package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class VE0 {
    public static BJ3 a(XE0 xe0, Boolean bool) {
        int b;
        UP0 up0 = new UP0(0);
        xe0.getClass();
        C5704gm c5704gm = new C5704gm();
        int b2 = xe0.b(8);
        C5704gm c5704gm2 = null;
        if (b2 != 0) {
            c5704gm.c(xe0.a(b2 + xe0.a), xe0.b);
        } else {
            c5704gm = null;
        }
        int c = RP0.c(up0, c5704gm);
        C5704gm c5704gm3 = new C5704gm();
        int b3 = xe0.b(10);
        if (b3 != 0) {
            c5704gm3.c(xe0.a(b3 + xe0.a), xe0.b);
        } else {
            c5704gm3 = null;
        }
        int c2 = RP0.c(up0, c5704gm3);
        C5704gm c5704gm4 = new C5704gm();
        int b4 = xe0.b(4);
        if (b4 != 0) {
            c5704gm4.c(xe0.a(b4 + xe0.a), xe0.b);
            c5704gm2 = c5704gm4;
        }
        up0.k(BJ3.h(up0, RP0.c(up0, c5704gm2), (bool.booleanValue() || (b = xe0.b(6)) == 0) ? 0L : xe0.b.getInt(b + xe0.a) & 4294967295L, c, c2));
        return BJ3.i(up0.h());
    }
}
