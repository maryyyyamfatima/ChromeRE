package defpackage;

import J.N;
import defpackage.C8469oo2;
import defpackage.InterfaceC6749jo2;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oo2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8469oo2 implements InterfaceC7093ko2 {
    @Override // defpackage.InterfaceC7093ko2
    public final void a(InterfaceC6749jo2 interfaceC6749jo2) {
        final C7781mo2 c7781mo2 = (C7781mo2) interfaceC6749jo2;
        if (((C2287Rp2) c7781mo2.e()).u || ((C2287Rp2) c7781mo2.e()).b.g() == null || ((C2287Rp2) c7781mo2.e()).b.b() == null || ((C2287Rp2) c7781mo2.e()).f.isDestroyed()) {
            return;
        }
        N.MJN0LyJO(((C2287Rp2) c7781mo2.e()).b, ((C2287Rp2) c7781mo2.e()).h, ((C2287Rp2) c7781mo2.e()).t, ((C3515aP) ((C2287Rp2) c7781mo2.e()).c).b(), !((C2287Rp2) c7781mo2.e()).B.f.B, ((C2287Rp2) c7781mo2.e()).m, new Object(c7781mo2) { // from class: org.chromium.components.payments.PaymentAppServiceBridge$PaymentAppServiceCallback
            public final InterfaceC6749jo2 a;

            {
                this.a = c7781mo2;
            }

            public final void onCanMakePaymentCalculated(boolean z) {
                Object obj = ThreadUtils.a;
                this.a.b(z);
            }

            public final void onPaymentAppCreated(PaymentApp paymentApp) {
                Object obj = ThreadUtils.a;
                this.a.g(paymentApp);
            }

            public final void onPaymentAppCreationError(String str, int i) {
                Object obj = ThreadUtils.a;
                this.a.c(str, i);
            }

            public final void onDoneCreatingPaymentApps() {
                Object obj = ThreadUtils.a;
                this.a.d(C8469oo2.this);
            }

            public final void setCanMakePaymentEvenWithoutApps() {
                Object obj = ThreadUtils.a;
                this.a.f();
            }
        });
    }
}
