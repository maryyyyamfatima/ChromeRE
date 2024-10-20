package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cc0 */
/* loaded from: classes.dex */
public final class C0271Cc0 implements TextWatcher {
    public int a;
    public int g;
    public final /* synthetic */ ViewOnFocusChangeListenerC0401Dc0 h;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C0271Cc0(ViewOnFocusChangeListenerC0401Dc0 viewOnFocusChangeListenerC0401Dc0) {
        this.h = viewOnFocusChangeListenerC0401Dc0;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a = i;
        this.g = i + i3;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.subSequence(this.a, this.g).toString().contains("\n")) {
            int i = this.g;
            if (editable.subSequence(i - 1, i).toString().equals("\n")) {
                this.h.b();
            }
        }
    }
}
