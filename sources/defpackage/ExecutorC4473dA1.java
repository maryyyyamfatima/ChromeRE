package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC4473dA1 implements Executor {
    public final /* synthetic */ Handler a;

    public ExecutorC4473dA1(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
