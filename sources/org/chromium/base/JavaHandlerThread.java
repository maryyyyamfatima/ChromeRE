package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;
import defpackage.C7810mt1;
import defpackage.RunnableC7122kt1;
import defpackage.RunnableC7466lt1;
import java.lang.Thread;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class JavaHandlerThread {
    public final HandlerThread a;
    public Throwable b;

    public JavaHandlerThread(String str, int i) {
        this.a = new HandlerThread(str, i);
    }

    public static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    public final void quitThreadSafely(long j) {
        HandlerThread handlerThread = this.a;
        new Handler(handlerThread.getLooper()).post(new RunnableC7466lt1(this, j));
        handlerThread.getLooper().quitSafely();
    }

    public final void joinThread() {
        boolean z = false;
        while (!z) {
            try {
                this.a.join();
                z = true;
            } catch (InterruptedException unused) {
            }
        }
    }

    public final void startAndInitialize(long j, long j2) {
        HandlerThread handlerThread = this.a;
        if (!(handlerThread.getState() != Thread.State.NEW)) {
            handlerThread.start();
        }
        new Handler(handlerThread.getLooper()).post(new RunnableC7122kt1(j, j2));
    }

    public final boolean isAlive() {
        return this.a.isAlive();
    }

    public final void listenForUncaughtExceptionsForTesting() {
        this.a.setUncaughtExceptionHandler(new C7810mt1(this));
    }

    public final Throwable getUncaughtExceptionIfAny() {
        return this.b;
    }
}
