package defpackage;

import java.lang.Thread;
import org.chromium.base.JavaHandlerThread;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mt1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7810mt1 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ JavaHandlerThread a;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.a.b = th;
    }

    public C7810mt1(JavaHandlerThread javaHandlerThread) {
        this.a = javaHandlerThread;
    }
}
