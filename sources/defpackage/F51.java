package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F51 implements Executor {
    public final HandlerC10413uU3 a;

    public F51(Looper looper) {
        this.a = new HandlerC10413uU3(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
