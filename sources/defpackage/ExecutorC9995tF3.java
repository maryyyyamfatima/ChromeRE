package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tF3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC9995tF3 implements Executor {
    public final HandlerC10413uU3 a = new HandlerC10413uU3(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
