package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jf */
/* loaded from: classes.dex */
public final class RunnableC6692jf implements Runnable {
    public final /* synthetic */ LayoutInflaterFactory2C0545Ef a;

    public RunnableC6692jf(LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef) {
        this.a = layoutInflaterFactory2C0545Ef;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = this.a;
        if ((layoutInflaterFactory2C0545Ef.Z & 1) != 0) {
            layoutInflaterFactory2C0545Ef.v(0);
        }
        if ((layoutInflaterFactory2C0545Ef.Z & 4096) != 0) {
            layoutInflaterFactory2C0545Ef.v(108);
        }
        layoutInflaterFactory2C0545Ef.Y = false;
        layoutInflaterFactory2C0545Ef.Z = 0;
    }
}
