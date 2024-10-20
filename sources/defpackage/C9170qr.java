package defpackage;

import J.N;
import org.chromium.chrome.browser.ui.autofill.AutofillProgressDialogBridge;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qr */
/* loaded from: classes2.dex */
public final class C9170qr implements InterfaceC3906bY1 {
    public final /* synthetic */ AutofillProgressDialogBridge a;

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        N.MRKCaYxO(this.a.a);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        AutofillProgressDialogBridge autofillProgressDialogBridge = this.a;
        autofillProgressDialogBridge.b.c(2, autofillProgressDialogBridge.d);
    }

    public C9170qr(AutofillProgressDialogBridge autofillProgressDialogBridge) {
        this.a = autofillProgressDialogBridge;
    }
}
