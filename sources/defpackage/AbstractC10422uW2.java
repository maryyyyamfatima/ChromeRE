package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uW2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10422uW2 {
    public static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract AbstractC10079tW2 b();

    public InterfaceC6416iq0 c(Runnable runnable) {
        return d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public InterfaceC6416iq0 d(Runnable runnable, long j, TimeUnit timeUnit) {
        AbstractC10079tW2 b = b();
        MR2.c(runnable);
        RunnableC9051qW2 runnableC9051qW2 = new RunnableC9051qW2(runnable, b);
        b.c(runnableC9051qW2, j, timeUnit);
        return runnableC9051qW2;
    }

    public InterfaceC6416iq0 e(K92 k92, long j, long j2, TimeUnit timeUnit) {
        AbstractC10079tW2 b = b();
        RunnableC9393rW2 runnableC9393rW2 = new RunnableC9393rW2(k92, b);
        InterfaceC6416iq0 d = b.d(runnableC9393rW2, j, j2, timeUnit);
        return d == EnumC7565mA0.INSTANCE ? d : runnableC9393rW2;
    }
}
