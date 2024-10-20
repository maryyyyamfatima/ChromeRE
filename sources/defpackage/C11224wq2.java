package defpackage;

import org.chromium.components.payments.PayerData;
import org.chromium.components.payments.PaymentApp;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wq2 */
/* loaded from: classes2.dex */
public final class C11224wq2 implements InterfaceC11910yq2 {
    public final C10881vq2 a;
    public final C7787mp2 g;
    public final boolean h;
    public final PaymentApp i;

    public C11224wq2(PaymentApp paymentApp, C7787mp2 c7787mp2) {
        this.i = paymentApp;
        this.h = paymentApp.u();
        this.g = c7787mp2;
        C10881vq2 c10881vq2 = new C10881vq2(0);
        this.a = c10881vq2;
        c10881vq2.f = new C4001bo2(0);
    }

    @Override // defpackage.InterfaceC11910yq2
    public final void a(String str, String str2, PayerData payerData, InterfaceC11567xq2 interfaceC11567xq2) {
        C10881vq2 c10881vq2 = this.a;
        c10881vq2.b = str;
        c10881vq2.c = str2;
        C7787mp2 c7787mp2 = this.g;
        if (c7787mp2.e && this.h) {
            c10881vq2.d = AbstractC5031eo2.a(payerData.d);
            c10881vq2.e = payerData.e;
        }
        boolean z = c7787mp2.b;
        PaymentApp paymentApp = this.i;
        if (z && paymentApp.s()) {
            c10881vq2.f.c = payerData.a;
        }
        if (c7787mp2.d && paymentApp.t()) {
            c10881vq2.f.d = payerData.b;
        }
        if (c7787mp2.c && paymentApp.r()) {
            c10881vq2.f.b = payerData.c;
        }
        ((C2287Rp2) interfaceC11567xq2).p(c10881vq2);
    }
}
