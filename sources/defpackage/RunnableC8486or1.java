package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: or1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC8486or1 extends AbstractOwnableSynchronizer implements Runnable {
    public final AbstractRunnableC9172qr1 a;

    @Override // java.lang.Runnable
    public final void run() {
    }

    public RunnableC8486or1(AbstractRunnableC9172qr1 abstractRunnableC9172qr1) {
        this.a = abstractRunnableC9172qr1;
    }

    public static void a(RunnableC8486or1 runnableC8486or1, Thread thread) {
        runnableC8486or1.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }
}
