package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pv3 */
/* loaded from: classes.dex */
public final class C2058Pv3 implements TextWatcher {
    public final /* synthetic */ C2318Rv3 a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C2318Rv3 c2318Rv3 = this.a;
        if (c2318Rv3.w) {
            c2318Rv3.x = editable.toString();
        }
    }

    public C2058Pv3(C2318Rv3 c2318Rv3) {
        this.a = c2318Rv3;
    }
}
