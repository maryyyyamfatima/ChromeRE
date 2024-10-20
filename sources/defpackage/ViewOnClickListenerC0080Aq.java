package defpackage;

import android.view.View;
import org.chromium.chrome.browser.autofill.settings.AutofillEditorBase;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Aq */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0080Aq implements View.OnClickListener {
    public final /* synthetic */ AutofillEditorBase a;

    public ViewOnClickListenerC0080Aq(AutofillEditorBase autofillEditorBase) {
        this.a = autofillEditorBase;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AutofillEditorBase autofillEditorBase = this.a;
        if (autofillEditorBase.O0()) {
            autofillEditorBase.getActivity().finish();
        }
    }
}
