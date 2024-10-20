package defpackage;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2205Qz0 implements TextWatcher {
    public final EditText a;
    public C1945Oz0 g;
    public int h = Integer.MAX_VALUE;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C2205Qz0(EditText editText) {
        this.a = editText;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.a;
        if (!editText.isInEditMode() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int b = C7843mz0.a().b();
            if (b != 0) {
                if (b == 1) {
                    C7843mz0.a().f(i, i3 + i, (Spannable) charSequence, this.h);
                    return;
                } else if (b != 3) {
                    return;
                }
            }
            C7843mz0 a = C7843mz0.a();
            if (this.g == null) {
                this.g = new C1945Oz0(editText);
            }
            a.g(this.g);
        }
    }
}
