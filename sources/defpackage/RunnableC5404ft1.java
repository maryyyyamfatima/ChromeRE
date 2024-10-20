package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ft1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5404ft1 implements Runnable {
    public final /* synthetic */ C5748gt1 a;

    public RunnableC5404ft1(C5748gt1 c5748gt1) {
        this.a = c5748gt1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5748gt1 c5748gt1 = this.a;
        c5748gt1.a(1);
        if (c5748gt1.e.get()) {
            c5748gt1.c(1);
            c5748gt1.b().postDelayed(c5748gt1.b, 30000L);
        }
    }
}
