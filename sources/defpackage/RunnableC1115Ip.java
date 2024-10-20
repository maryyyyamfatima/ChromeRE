package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ip */
/* loaded from: classes.dex */
public final class RunnableC1115Ip implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ C1245Jp g;

    @Override // java.lang.Runnable
    public final void run() {
        C1245Jp c1245Jp = this.g;
        c1245Jp.getClass();
        this.a.run();
        c1245Jp.s = null;
    }

    public RunnableC1115Ip(C1245Jp c1245Jp, Runnable runnable) {
        this.g = c1245Jp;
        this.a = runnable;
    }
}
