package defpackage;

import android.os.Process;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PN2 extends Thread {
    public final int a;

    public PN2(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.a = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
