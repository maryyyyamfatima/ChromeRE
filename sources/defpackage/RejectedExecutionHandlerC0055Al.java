package defpackage;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Al, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RejectedExecutionHandlerC0055Al implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AbstractC0185Bl.e.execute(runnable);
    }
}
