package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Td2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2487Td2 implements TextWatcher {
    public final /* synthetic */ C2747Vd2 a;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C2487Td2(C2747Vd2 c2747Vd2) {
        this.a = c2747Vd2;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.a.a(charSequence.toString().trim());
    }
}
