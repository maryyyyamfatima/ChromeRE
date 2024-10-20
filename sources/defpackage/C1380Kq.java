package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.android.chrome.R;
import org.chromium.chrome.browser.autofill.settings.AutofillLocalCardEditor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kq */
/* loaded from: classes.dex */
public final class C1380Kq implements TextWatcher {
    public final /* synthetic */ AutofillLocalCardEditor a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C1380Kq(AutofillLocalCardEditor autofillLocalCardEditor) {
        this.a = autofillLocalCardEditor;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z = !editable.toString().matches(".*\\d.*");
        AutofillLocalCardEditor autofillLocalCardEditor = this.a;
        autofillLocalCardEditor.q0 = z;
        autofillLocalCardEditor.k0.l(autofillLocalCardEditor.q0 ? "" : autofillLocalCardEditor.d0.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140228));
        autofillLocalCardEditor.Q0();
    }
}
