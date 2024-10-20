package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2966Wv1 implements Runnable {
    public final /* synthetic */ C3096Xv1 a;

    public RunnableC2966Wv1(C3096Xv1 c3096Xv1) {
        this.a = c3096Xv1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3096Xv1 c3096Xv1 = this.a;
        c3096Xv1.a.dismiss();
        c3096Xv1.g.removeAllViews();
    }
}
