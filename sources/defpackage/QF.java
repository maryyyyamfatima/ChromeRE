package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QF {
    public boolean a;
    public PF b;
    public boolean c;

    public final void a(PF pf) {
        synchronized (this) {
            while (this.c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.b == pf) {
                return;
            }
            this.b = pf;
            if (this.a) {
                pf.onCancel();
            }
        }
    }
}
