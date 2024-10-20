package defpackage;

import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ov4 {
    public final Object a = new Object();
    public ArrayDeque b;
    public boolean c;

    public final void a(ow4 ow4Var) {
        Iv4 iv4;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        iv4 = (Iv4) this.b.poll();
                        if (iv4 == null) {
                            this.c = false;
                            return;
                        }
                    }
                    iv4.a(ow4Var);
                }
            }
        }
    }
}
