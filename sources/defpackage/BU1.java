package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class BU1 implements XC1 {
    public final /* synthetic */ C10754vU1 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Runnable c;

    @Override // defpackage.XC1
    public final void b() {
        C10754vU1 c10754vU1 = this.a;
        long j = this.b;
        c10754vU1.a = j;
        Runnable runnable = this.c;
        c10754vU1.b = runnable;
        c10754vU1.c.postDelayed(runnable, j);
    }

    public BU1(C10754vU1 c10754vU1, long j, RunnableC8054nc3 runnableC8054nc3) {
        this.a = c10754vU1;
        this.b = j;
        this.c = runnableC8054nc3;
    }

    @Override // defpackage.XC1
    public final void a() {
        this.a.a();
    }
}
