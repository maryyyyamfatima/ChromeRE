package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class zw4 implements Runnable {
    public final /* synthetic */ Zs4 a;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Bw4 i;

    public zw4(Bw4 bw4, Zs4 zs4, int i, int i2) {
        this.i = bw4;
        this.a = zs4;
        this.g = i;
        this.h = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        int i2 = this.h;
        Zs4 zs4 = this.a;
        this.i.d(new Zs4(zs4.a, i, i2, zs4.d, zs4.e, zs4.f, zs4.g, zs4.h, zs4.i));
    }
}
