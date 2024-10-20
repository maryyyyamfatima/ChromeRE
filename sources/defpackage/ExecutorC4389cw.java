package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC4389cw implements Executor {
    public final Handler a;

    public ExecutorC4389cw(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
