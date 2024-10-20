package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4028bt implements Runnable {
    public final /* synthetic */ KF3 a;
    public final /* synthetic */ AtomicBoolean g;
    public final /* synthetic */ InterfaceC2689Us h;

    public RunnableC4028bt(KF3 kf3, AtomicBoolean atomicBoolean, InterfaceC2689Us interfaceC2689Us) {
        this.a = kf3;
        this.g = atomicBoolean;
        this.h = interfaceC2689Us;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0225Bt c = C0225Bt.c();
        KF3 kf3 = this.a;
        int i = kf3.a;
        c.getClass();
        C0225Bt.b(AbstractC7464lt.a(i), "Android.BackgroundTaskScheduler.TaskStopped");
        this.g.set(this.h.c(V60.a, kf3));
    }
}
