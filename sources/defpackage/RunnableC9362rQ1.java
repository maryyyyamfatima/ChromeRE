package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rQ1 */
/* loaded from: classes.dex */
public final class RunnableC9362rQ1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C9705sQ1 g;

    public RunnableC9362rQ1(C9705sQ1 c9705sQ1, int i) {
        this.g = c9705sQ1;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DQ1 dq1 = this.g.f.c.t;
        if (dq1 != null) {
            dq1.k(this.a);
        }
    }
}
