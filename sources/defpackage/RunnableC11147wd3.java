package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wd3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC11147wd3 implements Runnable {
    public int a = 2;
    public final Runnable g;

    public RunnableC11147wd3(RunnableC7767mm0 runnableC7767mm0) {
        this.g = runnableC7767mm0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            return;
        }
        int i2 = i - 1;
        this.a = i2;
        if (i2 == 0) {
            this.g.run();
        }
    }
}
