package defpackage;

import J.N;
import android.view.View;
import android.view.ViewGroup;
import org.chromium.chrome.browser.autofill.PersonalDataManager;
import org.chromium.chrome.browser.autofill.settings.AutofillServerCardEditor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Er */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0605Er implements View.OnClickListener {
    public final /* synthetic */ AutofillServerCardEditor a;

    public ViewOnClickListenerC0605Er(AutofillServerCardEditor autofillServerCardEditor) {
        this.a = autofillServerCardEditor;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PersonalDataManager d = PersonalDataManager.d();
        AutofillServerCardEditor autofillServerCardEditor = this.a;
        N.MSOj73VL(d.a, d, autofillServerCardEditor.b0);
        int i = AutofillServerCardEditor.p0;
        ViewGroup viewGroup = (ViewGroup) autofillServerCardEditor.i0.getParent();
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView(autofillServerCardEditor.h0);
        viewGroup.removeView(autofillServerCardEditor.i0);
    }
}
