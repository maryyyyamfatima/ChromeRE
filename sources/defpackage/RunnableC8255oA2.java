package defpackage;

import android.os.Process;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oA2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC8255oA2 implements Runnable {
    public final Runnable a;
    public final int g;

    public RunnableC8255oA2(int i, Runnable runnable) {
        this.a = runnable;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.g);
        this.a.run();
    }
}
