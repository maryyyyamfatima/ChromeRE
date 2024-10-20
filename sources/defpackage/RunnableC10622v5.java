package defpackage;

import android.os.Process;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10622v5 implements Runnable {
    public final /* synthetic */ Runnable a;

    public RunnableC10622v5(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
