package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10885vr0 implements Runnable {
    public final /* synthetic */ C11914yr0 a;

    public RunnableC10885vr0(C11914yr0 c11914yr0) {
        this.a = c11914yr0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC4851eH1.f("DownloadFg", "Checking if delayed stopAndUnbindService needs to be resolved.", new Object[0]);
        C11914yr0 c11914yr0 = this.a;
        c11914yr0.c = false;
        c11914yr0.b(false);
        c11914yr0.a.removeCallbacks(c11914yr0.b);
        AbstractC4851eH1.f("DownloadFg", "Done checking if delayed stopAndUnbindService needs to be resolved.", new Object[0]);
    }
}
