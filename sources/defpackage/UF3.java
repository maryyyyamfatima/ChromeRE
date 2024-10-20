package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class UF3 {
    public static Object a(AF3 af3) {
        boolean z;
        synchronized (af3.a) {
            z = af3.c;
        }
        if (z) {
            return c(af3);
        }
        SF3 sf3 = new SF3();
        ExecutorC9652sF3 executorC9652sF3 = AbstractC10681vF3.b;
        af3.f(executorC9652sF3, sf3);
        af3.d(executorC9652sF3, sf3);
        af3.b.a(new C0533Ec2(executorC9652sF3, sf3));
        af3.i();
        sf3.a.await();
        return c(af3);
    }

    public static Object b(AF3 af3, long j, TimeUnit timeUnit) {
        boolean z;
        synchronized (af3.a) {
            z = af3.c;
        }
        if (z) {
            return c(af3);
        }
        SF3 sf3 = new SF3();
        ExecutorC9652sF3 executorC9652sF3 = AbstractC10681vF3.b;
        af3.f(executorC9652sF3, sf3);
        af3.d(executorC9652sF3, sf3);
        af3.b.a(new C0533Ec2(executorC9652sF3, sf3));
        af3.i();
        if (!sf3.a.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for Task");
        }
        return c(af3);
    }

    public static Object c(AF3 af3) {
        if (!af3.l()) {
            if (af3.d) {
                throw new CancellationException("Task is already canceled");
            }
            throw new ExecutionException(af3.j());
        }
        return af3.k();
    }
}
