package defpackage;

import android.view.View;
import org.chromium.chrome.browser.autofill.settings.AutofillEditorBase;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zq */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC12250zq implements View.OnClickListener {
    public final /* synthetic */ AutofillEditorBase a;

    public ViewOnClickListenerC12250zq(AutofillEditorBase autofillEditorBase) {
        this.a = autofillEditorBase;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.getActivity().finish();
    }
}
