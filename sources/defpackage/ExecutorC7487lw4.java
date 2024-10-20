package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lw4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC7487lw4 implements Executor {
    public final Handler a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
