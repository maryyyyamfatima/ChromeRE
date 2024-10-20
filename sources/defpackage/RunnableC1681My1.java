package defpackage;

import android.os.Looper;
import android.os.Process;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: My1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1681My1 implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ ThreadFactoryC1811Ny1 g;

    public RunnableC1681My1(ThreadFactoryC1811Ny1 threadFactoryC1811Ny1, Runnable runnable) {
        this.g = threadFactoryC1811Ny1;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadFactoryC1811Ny1 threadFactoryC1811Ny1 = this.g;
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        try {
            Process.setThreadPriority(threadFactoryC1811Ny1.g);
        } catch (SecurityException unused) {
            Process.setThreadPriority(threadFactoryC1811Ny1.g + 1);
        }
        this.a.run();
    }
}
