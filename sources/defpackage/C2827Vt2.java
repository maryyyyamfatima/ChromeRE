package defpackage;

import J.N;
import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vt2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2827Vt2 implements TextWatcher {
    public boolean a;
    public String g;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.a) {
            return;
        }
        String MDrtwxb3 = N.MDrtwxb3(editable.toString(), this.g);
        this.a = true;
        editable.replace(0, editable.length(), MDrtwxb3, 0, MDrtwxb3.length());
        this.a = false;
    }
}
