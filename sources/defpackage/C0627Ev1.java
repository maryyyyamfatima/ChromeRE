package defpackage;

import android.os.Process;
import java.lang.Thread;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ev1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0627Ev1 implements Thread.UncaughtExceptionHandler {
    public boolean a;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.a) {
            return;
        }
        this.a = true;
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
