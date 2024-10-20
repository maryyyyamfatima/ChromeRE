package defpackage;

import J.N;
import org.chromium.chrome.browser.ui.autofill.AuthenticatorSelectionDialogBridge;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Om */
/* loaded from: classes2.dex */
public final class C1879Om implements InterfaceC3906bY1 {
    public final /* synthetic */ C2009Pm a;

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        N.MJ3HnZb0(this.a.c.a);
    }

    public C1879Om(C2009Pm c2009Pm) {
        this.a = c2009Pm;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        C2009Pm c2009Pm = this.a;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            c2009Pm.d.c(2, propertyModel);
            return;
        }
        AuthenticatorSelectionDialogBridge authenticatorSelectionDialogBridge = c2009Pm.c;
        N.MBwHQwOl(authenticatorSelectionDialogBridge.a, c2009Pm.i.b);
        c2009Pm.e.setVisibility(0);
        c2009Pm.e.setAlpha(0.0f);
        c2009Pm.e.animate().alpha(1.0f).setDuration(250L);
        c2009Pm.f.animate().alpha(0.0f).setDuration(250L);
        c2009Pm.h.k(AbstractC4249cY1.m, true);
    }
}
