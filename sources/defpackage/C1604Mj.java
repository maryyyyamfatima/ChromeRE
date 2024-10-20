package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1604Mj extends AbstractC9309rF3 {
    public static volatile C1604Mj b;
    public final C2520Tk0 a = new C2520Tk0();

    public static C1604Mj a() {
        if (b != null) {
            return b;
        }
        synchronized (C1604Mj.class) {
            if (b == null) {
                b = new C1604Mj();
            }
        }
        return b;
    }
}
