package defpackage;

import java.util.concurrent.Executor;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC11534xl implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        PostTask.c(QF3.h, runnable);
    }
}
