package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zc3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3263Zc3 extends AbstractC10079tW2 {
    public final ScheduledExecutorService a;
    public final H10 g = new H10();
    public volatile boolean h;

    public C3263Zc3(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.AbstractC10079tW2
    public final InterfaceC6416iq0 c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future schedule;
        boolean z = this.h;
        EnumC7565mA0 enumC7565mA0 = EnumC7565mA0.INSTANCE;
        if (z) {
            return enumC7565mA0;
        }
        MR2.c(runnable);
        RunnableC5271fW2 runnableC5271fW2 = new RunnableC5271fW2(runnable, this.g);
        this.g.a(runnableC5271fW2);
        try {
            if (j <= 0) {
                schedule = this.a.submit((Callable) runnableC5271fW2);
            } else {
                schedule = this.a.schedule((Callable) runnableC5271fW2, j, timeUnit);
            }
            runnableC5271fW2.a(schedule);
            return runnableC5271fW2;
        } catch (RejectedExecutionException e) {
            dispose();
            MR2.b(e);
            return enumC7565mA0;
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.g.dispose();
    }
}
