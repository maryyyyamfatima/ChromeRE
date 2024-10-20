package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class O22 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ R22 g;

    public O22(R22 r22, long j) {
        this.g = r22;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.b.d.c(this.a);
    }
}
