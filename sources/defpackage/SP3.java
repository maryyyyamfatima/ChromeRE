package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class SP3 implements Runnable {
    public final /* synthetic */ C9707sQ3 a;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;

    public /* synthetic */ SP3(int i, C9707sQ3 c9707sQ3, boolean z) {
        this.a = c9707sQ3;
        this.g = z;
        this.h = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.k(this.h, this.g);
    }
}
