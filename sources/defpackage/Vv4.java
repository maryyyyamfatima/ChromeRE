package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Vv4 {
    public final ow4 a = new ow4();

    public final void a(Exception exc) {
        ow4 ow4Var = this.a;
        synchronized (ow4Var.a) {
            if (ow4Var.c) {
                return;
            }
            ow4Var.c = true;
            ow4Var.e = exc;
            ow4Var.b.a(ow4Var);
        }
    }

    public final void b(Integer num) {
        ow4 ow4Var = this.a;
        synchronized (ow4Var.a) {
            if (ow4Var.c) {
                return;
            }
            ow4Var.c = true;
            ow4Var.d = num;
            ow4Var.b.a(ow4Var);
        }
    }
}
