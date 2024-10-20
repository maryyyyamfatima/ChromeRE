package defpackage;

import J.N;
import j$.util.Optional;
import org.chromium.chrome.browser.ui.autofill.OtpVerificationDialogBridge;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Se2 */
/* loaded from: classes2.dex */
public final class C2362Se2 implements InterfaceC3906bY1, InterfaceC2492Te2 {
    public final ZX1 a;
    public final PropertyModel g;
    public final OtpVerificationDialogBridge h;
    public PropertyModel i;

    public C2362Se2(ZX1 zx1, BD2 bd2, OtpVerificationDialogBridge otpVerificationDialogBridge) {
        this.a = zx1;
        bd2.e(AbstractC4249cY1.a, this);
        this.g = bd2.a();
        this.h = otpVerificationDialogBridge;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.a.c(2, propertyModel);
            return;
        }
        Optional optional = (Optional) this.i.i(AbstractC2622Ue2.d);
        if (optional.isPresent()) {
            this.i.k(AbstractC2622Ue2.g, true);
            this.g.k(AbstractC4249cY1.m, true);
            N.MTvxl6AI(this.h.a, ((CharSequence) optional.get()).toString());
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        N.MKRdS4uy(this.h.a);
    }
}
