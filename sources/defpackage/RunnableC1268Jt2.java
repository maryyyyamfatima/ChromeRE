package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jt2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1268Jt2 implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ InterfaceScheduledExecutorServiceC4493dE1 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TimeUnit i;

    public RunnableC1268Jt2(RunnableC1008Ht2 runnableC1008Ht2, InterfaceScheduledExecutorServiceC4493dE1 interfaceScheduledExecutorServiceC4493dE1, long j, TimeUnit timeUnit) {
        this.a = runnableC1008Ht2;
        this.g = interfaceScheduledExecutorServiceC4493dE1;
        this.h = j;
        this.i = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        RY1 schedule = ((SY1) this.g).schedule(this, this.h, this.i);
        schedule.f(new RunnableC10556ut2(schedule), EnumC6747jo0.a);
    }
}
