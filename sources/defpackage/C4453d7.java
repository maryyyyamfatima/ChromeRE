package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4453d7 implements TextWatcher {
    public final /* synthetic */ ViewOnClickListenerC4796e7 a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.b();
    }

    public C4453d7(ViewOnClickListenerC4796e7 viewOnClickListenerC4796e7) {
        this.a = viewOnClickListenerC4796e7;
    }
}
