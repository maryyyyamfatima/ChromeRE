package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zk3 */
/* loaded from: classes.dex */
public final class RunnableC12218zk3 implements Runnable {
    public final /* synthetic */ C0054Ak3 a;

    @Override // java.lang.Runnable
    public final void run() {
        C0054Ak3 c0054Ak3 = this.a;
        c0054Ak3.D = false;
        V10 v10 = c0054Ak3.f11435J;
        PropertyModel propertyModel = c0054Ak3.y;
        MD2 md2 = C1551Ly1.q;
        C4424d20.e(v10, propertyModel, md2, propertyModel.g(md2), 1.0f, 500L).start();
        V10 v102 = c0054Ak3.f11435J;
        MD2 md22 = C1551Ly1.x;
        C4424d20.e(v102, propertyModel, md22, propertyModel.g(md22), 0.0f, 500L).start();
        propertyModel.k(C1551Ly1.A, false);
    }

    public RunnableC12218zk3(C0054Ak3 c0054Ak3) {
        this.a = c0054Ak3;
    }
}
