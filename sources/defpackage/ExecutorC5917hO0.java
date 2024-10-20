package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC5917hO0 implements Executor {
    public static final Handler a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a.post(runnable);
    }
}
