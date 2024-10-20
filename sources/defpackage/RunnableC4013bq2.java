package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bq2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4013bq2 implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ C4356cq2 g;

    public RunnableC4013bq2(C4356cq2 c4356cq2, RunnableC2677Up2 runnableC2677Up2) {
        this.g = c4356cq2;
        this.a = runnableC2677Up2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        this.g.c = false;
    }
}
