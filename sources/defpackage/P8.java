package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class P8 implements Runnable {
    public final /* synthetic */ T8 a;

    @Override // java.lang.Runnable
    public final void run() {
        T8 t8 = this.a;
        if (t8.k.isShowing()) {
            t8.b();
        }
    }

    public P8(T8 t8) {
        this.a = t8;
    }
}
