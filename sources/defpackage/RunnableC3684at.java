package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: at, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3684at implements Runnable {
    public final /* synthetic */ KF3 a;
    public final /* synthetic */ AtomicBoolean g;
    public final /* synthetic */ InterfaceC2689Us h;
    public final /* synthetic */ C5058et i;

    public RunnableC3684at(KF3 kf3, AtomicBoolean atomicBoolean, InterfaceC2689Us interfaceC2689Us, C5058et c5058et) {
        this.a = kf3;
        this.g = atomicBoolean;
        this.h = interfaceC2689Us;
        this.i = c5058et;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0225Bt c = C0225Bt.c();
        KF3 kf3 = this.a;
        int i = kf3.a;
        c.getClass();
        C0225Bt.b(AbstractC7464lt.a(i), "Android.BackgroundTaskScheduler.TaskStarted");
        this.g.set(this.h.b(V60.a, kf3, new C4714dt(this.i)));
    }
}
