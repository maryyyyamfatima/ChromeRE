package defpackage;

import org.chromium.components.payments.PaymentApp;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fo2 */
/* loaded from: classes2.dex */
public final class RunnableC5375fo2 implements Runnable {
    public final /* synthetic */ InterfaceC5719go2 a;
    public final /* synthetic */ PaymentApp g;

    public RunnableC5375fo2(PaymentApp paymentApp, C2287Rp2 c2287Rp2) {
        this.g = paymentApp;
        this.a = c2287Rp2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((C2287Rp2) this.a).m(false);
    }
}
