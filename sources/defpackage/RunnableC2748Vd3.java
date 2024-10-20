package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vd3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2748Vd3 implements Runnable {
    public final /* synthetic */ C3138Yd3 a;

    public RunnableC2748Vd3(C3138Yd3 c3138Yd3) {
        this.a = c3138Yd3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.e) {
            this.a.e = false;
            C3138Yd3 c3138Yd3 = this.a;
            c3138Yd3.a.unregisterReceiver(c3138Yd3.f);
        }
    }
}
