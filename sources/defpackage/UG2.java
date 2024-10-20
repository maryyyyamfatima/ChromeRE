package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.homepage.settings.RadioButtonGroupHomepagePreference;
import org.chromium.components.browser_ui.widget.RadioButtonWithEditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class UG2 implements TextWatcher {
    public final /* synthetic */ RadioButtonWithEditText a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ArrayList arrayList = this.a.m;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RadioButtonGroupHomepagePreference radioButtonGroupHomepagePreference = (RadioButtonGroupHomepagePreference) ((VG2) it.next());
            if (!radioButtonGroupHomepagePreference.Y.b.equals(editable.toString())) {
                LG2 lg2 = radioButtonGroupHomepagePreference.Y;
                lg2.a = 1;
                lg2.b = editable.toString();
            }
        }
    }

    public UG2(RadioButtonWithEditText radioButtonWithEditText) {
        this.a = radioButtonWithEditText;
    }
}
