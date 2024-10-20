package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sW2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC9736sW2 implements Runnable {
    public final Runnable a;
    public final T33 g;
    public final long h;
    public long i;
    public long j;
    public long k;
    public final /* synthetic */ AbstractC10079tW2 l;

    public RunnableC9736sW2(AbstractC10079tW2 abstractC10079tW2, long j, Runnable runnable, long j2, T33 t33, long j3) {
        this.l = abstractC10079tW2;
        this.a = runnable;
        this.g = t33;
        this.h = j3;
        this.j = j2;
        this.k = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        this.a.run();
        T33 t33 = this.g;
        if (t33.a()) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        AbstractC10079tW2 abstractC10079tW2 = this.l;
        abstractC10079tW2.getClass();
        long a = AbstractC10079tW2.a(timeUnit);
        long j2 = AbstractC10422uW2.a;
        long j3 = a + j2;
        long j4 = this.j;
        long j5 = this.h;
        if (j3 < j4 || a >= j4 + j5 + j2) {
            j = a + j5;
            long j6 = this.i + 1;
            this.i = j6;
            this.k = j - (j5 * j6);
        } else {
            long j7 = this.k;
            long j8 = this.i + 1;
            this.i = j8;
            j = (j8 * j5) + j7;
        }
        this.j = a;
        EnumC7791mq0.c(t33, abstractC10079tW2.c(this, j - a, timeUnit));
    }
}
