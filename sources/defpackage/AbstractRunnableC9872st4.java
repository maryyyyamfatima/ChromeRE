package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: st4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC9872st4 implements Runnable {
    public final Vv4 a;

    public AbstractRunnableC9872st4() {
        this.a = null;
    }

    public AbstractRunnableC9872st4(Vv4 vv4) {
        this.a = vv4;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            Vv4 vv4 = this.a;
            if (vv4 != null) {
                vv4.a(e);
            }
        }
    }
}
