package defpackage;

import J.N;
import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9500rp implements TextWatcher {
    public final /* synthetic */ AbstractC9843sp a;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C9500rp(AbstractC9843sp abstractC9843sp) {
        this.a = abstractC9843sp;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AbstractC9843sp abstractC9843sp = this.a;
        if (!abstractC9843sp.o || abstractC9843sp.n) {
            return;
        }
        abstractC9843sp.p = true;
        String obj = editable.toString();
        String M14CHwRm = abstractC9843sp.q ? N.M14CHwRm(obj) : obj;
        if (!obj.equals(M14CHwRm)) {
            editable.replace(0, editable.length(), M14CHwRm, 0, M14CHwRm.length());
        }
        abstractC9843sp.p = false;
    }
}
