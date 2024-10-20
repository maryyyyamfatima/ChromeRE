package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nB0 */
/* loaded from: classes.dex */
public final class RunnableC7914nB0 implements Runnable {
    public final QO2 a;
    public final /* synthetic */ C9286rB0 g;

    public RunnableC7914nB0(C9286rB0 c9286rB0, QO2 qo2) {
        this.g = c9286rB0;
        this.a = qo2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3133Yc3 c3133Yc3 = (C3133Yc3) this.a;
        c3133Yc3.a.a();
        synchronized (c3133Yc3.b) {
            synchronized (this.g) {
                C8944qB0 c8944qB0 = this.g.a;
                QO2 qo2 = this.a;
                c8944qB0.getClass();
                if (c8944qB0.a.contains(new C8601pB0(qo2, DE0.b))) {
                    this.g.A.a();
                    C9286rB0 c9286rB0 = this.g;
                    QO2 qo22 = this.a;
                    c9286rB0.getClass();
                    try {
                        ((C3133Yc3) qo22).k(c9286rB0.A, c9286rB0.w, c9286rB0.D);
                        this.g.h(this.a);
                    } catch (Throwable th) {
                        throw new C4839eF(th);
                    }
                }
                this.g.d();
            }
        }
    }
}
