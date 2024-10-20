package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tW2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10079tW2 implements InterfaceC6416iq0 {
    public abstract InterfaceC6416iq0 c(Runnable runnable, long j, TimeUnit timeUnit);

    public InterfaceC6416iq0 b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public final InterfaceC6416iq0 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        T33 t33 = new T33();
        T33 t332 = new T33(t33);
        long nanos = timeUnit.toNanos(j2);
        long a = a(TimeUnit.NANOSECONDS);
        InterfaceC6416iq0 c = c(new RunnableC9736sW2(this, timeUnit.toNanos(j) + a, runnable, a, t332, nanos), j, timeUnit);
        if (c == EnumC7565mA0.INSTANCE) {
            return c;
        }
        EnumC7791mq0.c(t33, c);
        return t332;
    }

    public static long a(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
}
