package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ct, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4371ct implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ C4714dt g;

    @Override // java.lang.Runnable
    public final void run() {
        C5058et c5058et = this.g.a;
        c5058et.c = this.a;
        c5058et.a.countDown();
    }

    public RunnableC4371ct(C4714dt c4714dt, boolean z) {
        this.g = c4714dt;
        this.a = z;
    }
}
