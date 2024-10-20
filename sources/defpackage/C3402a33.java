package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a33, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3402a33 implements TextWatcher {
    public final /* synthetic */ AbstractViewOnClickListenerC4089c33 a;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        AbstractViewOnClickListenerC4089c33 abstractViewOnClickListenerC4089c33 = this.a;
        abstractViewOnClickListenerC4089c33.f0.setVisibility(TextUtils.isEmpty(charSequence) ? 4 : 0);
        if (abstractViewOnClickListenerC4089c33.b0) {
            abstractViewOnClickListenerC4089c33.g0.l(charSequence.toString());
        }
    }

    public C3402a33(AbstractViewOnClickListenerC4089c33 abstractViewOnClickListenerC4089c33) {
        this.a = abstractViewOnClickListenerC4089c33;
    }
}
