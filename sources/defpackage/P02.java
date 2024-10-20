package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class P02 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable g;
    public final /* synthetic */ Runnable h;
    public final /* synthetic */ S02 i;

    @Override // java.lang.Runnable
    public final void run() {
        S02 s02 = this.i;
        if (s02.b) {
            return;
        }
        if (!this.a) {
            s02.e.getClass();
            C0225Bt c = C0225Bt.c();
            int i = s02.a;
            boolean z = s02.c;
            int a = AbstractC7464lt.a(i);
            c.getClass();
            C0225Bt.b(a, "Android.BackgroundTaskScheduler.TaskLoadedNative");
            if (z) {
                C0225Bt.b(a, "Android.BackgroundTaskScheduler.TaskLoadedNative.ReducedMode");
            } else {
                C0225Bt.b(a, "Android.BackgroundTaskScheduler.TaskLoadedNative.FullBrowser");
            }
        }
        MO mo = s02.e;
        boolean z2 = s02.c;
        mo.getClass();
        Runnable runnable = this.g;
        Runnable runnable2 = this.h;
        LO lo = new LO(runnable, z2, runnable2);
        try {
            C7629mN.a().c(lo);
            C7629mN.a().b(true, lo);
        } catch (C6540jB2 e) {
            AbstractC4851eH1.a("BTS_NativeBkgrdTask", "Background Launch Error", e);
            runnable2.run();
        }
    }

    public P02(S02 s02, boolean z, R02 r02, Q02 q02) {
        this.i = s02;
        this.a = z;
        this.g = r02;
        this.h = q02;
    }
}
