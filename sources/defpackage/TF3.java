package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class TF3 {
    public static ow4 a(C1988Ph3 c1988Ph3) {
        ow4 ow4Var = new ow4();
        synchronized (ow4Var.a) {
            if (!(!ow4Var.c)) {
                throw new IllegalStateException("Task is already complete");
            }
            ow4Var.c = true;
            ow4Var.e = c1988Ph3;
        }
        ow4Var.b.a(ow4Var);
        return ow4Var;
    }
}
