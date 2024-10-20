package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CI3 implements TextWatcher {
    public final /* synthetic */ TextInputLayout a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public CI3(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.a;
        textInputLayout.y(!textInputLayout.B0, false);
        if (textInputLayout.p) {
            textInputLayout.s(editable);
        }
        if (textInputLayout.x) {
            textInputLayout.z(editable);
        }
    }
}
