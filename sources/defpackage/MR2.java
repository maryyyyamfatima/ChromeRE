package defpackage;

import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class MR2 {
    public static volatile DV0 a;
    public static volatile DV0 b;
    public static volatile DV0 c;
    public static volatile DV0 d;

    public static void c(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("run is null");
        }
    }

    public static void b(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else {
            if (!((th instanceof C2222Rc2) || (th instanceof DX1) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof M10))) {
                th = new F04(th);
            }
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static AbstractC10422uW2 a(Callable callable) {
        try {
            AbstractC10422uW2 abstractC10422uW2 = (AbstractC10422uW2) callable.call();
            Q82.a(abstractC10422uW2, "Scheduler Callable result can't be null");
            return abstractC10422uW2;
        } catch (Throwable th) {
            throw ZD0.a(th);
        }
    }
}
