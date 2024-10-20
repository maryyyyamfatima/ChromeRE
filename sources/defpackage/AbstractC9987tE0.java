package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9987tE0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static Executor a(InterfaceC7559m90 interfaceC7559m90) {
        ThreadLocal threadLocal = a;
        Executor executor = (Executor) threadLocal.get();
        if (executor != null) {
            return executor;
        }
        ExecutorC9644sE0 executorC9644sE0 = new ExecutorC9644sE0(interfaceC7559m90);
        threadLocal.set(executorC9644sE0);
        return executorC9644sE0;
    }
}
