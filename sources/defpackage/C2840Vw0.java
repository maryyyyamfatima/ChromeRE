package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2840Vw0 implements TextWatcher {
    public final /* synthetic */ C1281Jw0 a;
    public final /* synthetic */ ViewOnClickListenerC2970Ww0 g;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.g.i.hasFocus()) {
            this.a.n = null;
        }
    }

    public C2840Vw0(ViewOnClickListenerC2970Ww0 viewOnClickListenerC2970Ww0, C1281Jw0 c1281Jw0) {
        this.g = viewOnClickListenerC2970Ww0;
        this.a = c1281Jw0;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.s = editable.toString();
        ViewOnClickListenerC2970Ww0 viewOnClickListenerC2970Ww0 = this.g;
        viewOnClickListenerC2970Ww0.c(false);
        viewOnClickListenerC2970Ww0.e(false);
        int i = ViewOnClickListenerC2970Ww0.n;
        C1281Jw0 c1281Jw0 = viewOnClickListenerC2970Ww0.a;
        InterfaceC1151Iw0 interfaceC1151Iw0 = c1281Jw0.j;
        if (interfaceC1151Iw0 == null ? false : interfaceC1151Iw0.a(c1281Jw0.s)) {
            viewOnClickListenerC2970Ww0.c(true);
            if (viewOnClickListenerC2970Ww0.isValid()) {
                viewOnClickListenerC2970Ww0.g.onEditorAction(viewOnClickListenerC2970Ww0.i, 5, new KeyEvent(0, 66));
            }
        }
    }
}
