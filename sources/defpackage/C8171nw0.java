package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nw0 */
/* loaded from: classes.dex */
public final class C8171nw0 implements TextWatcher {
    public EditText a;
    public int g;
    public int h;
    public final QP0 i;
    public final InterfaceC9738sX j;
    public final U80 k;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C8171nw0(QP0 qp0, InterfaceC9738sX interfaceC9738sX, U80 u80) {
        this.i = qp0;
        this.j = interfaceC9738sX;
        this.k = u80;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.g = i;
        this.h = i + i3;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText;
        if (editable.subSequence(this.g, this.h).toString().contains("\n")) {
            int i = this.h;
            if (!editable.subSequence(i - 1, i).toString().equals("\n") || (editText = this.a) == null) {
                return;
            }
            ((C10081tX) this.j).a(this.i.a(), AbstractC8515ow0.a(editText, ((C3184Yn) this.k).v), 2).c();
        }
    }
}
