package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class N22 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int g;
    public final /* synthetic */ R22 h;

    public N22(R22 r22, long j, int i) {
        this.h = r22;
        this.a = j;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.b.d.d(this.g, this.a);
    }
}
