package defpackage;

import J.N;
import org.chromium.chrome.browser.ui.autofill.AutofillErrorDialogBridge;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bq */
/* loaded from: classes2.dex */
public final class C0210Bq implements InterfaceC3906bY1 {
    public final /* synthetic */ AutofillErrorDialogBridge a;

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        N.MBDxxdbe(this.a.a);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        AutofillErrorDialogBridge autofillErrorDialogBridge = this.a;
        autofillErrorDialogBridge.b.c(1, autofillErrorDialogBridge.d);
    }

    public C0210Bq(AutofillErrorDialogBridge autofillErrorDialogBridge) {
        this.a = autofillErrorDialogBridge;
    }
}
