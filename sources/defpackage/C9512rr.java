package defpackage;

import J.N;
import android.app.Activity;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.chrome.browser.autofill.AutofillMessageConfirmFlowBridge;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rr */
/* loaded from: classes.dex */
public final class C9512rr extends AbstractC11227wr {
    public final AutofillMessageConfirmFlowBridge l;

    public C9512rr(Activity activity, AutofillMessageConfirmFlowBridge autofillMessageConfirmFlowBridge, String str, String str2, String str3, String str4) {
        super(activity, autofillMessageConfirmFlowBridge, 0, str, 0, str3, str4, true);
        this.l = autofillMessageConfirmFlowBridge;
        ((TextView) this.j.findViewById(R.id.cc_details_masked)).setText(str2);
        this.j.findViewById(R.id.message_divider).setVisibility(0);
        this.j.findViewById(R.id.google_pay_logo).setVisibility(0);
        this.g.k(AbstractC4249cY1.m, false);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i == 0) {
            N.MvL6c2l9(this.l.b);
            this.h.c(1, propertyModel);
        } else if (i == 1) {
            this.h.c(2, propertyModel);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        AutofillMessageConfirmFlowBridge autofillMessageConfirmFlowBridge = this.l;
        if (i == 2) {
            autofillMessageConfirmFlowBridge.e();
        }
        autofillMessageConfirmFlowBridge.c();
    }
}
