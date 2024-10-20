package defpackage;

import J.N;
import android.text.Editable;
import android.text.TextWatcher;
import org.chromium.chrome.browser.findinpage.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UN0 implements TextWatcher {
    public final /* synthetic */ a a;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        a aVar = this.a;
        if (aVar.s == null) {
            return;
        }
        aVar.B = false;
        if (aVar.v || aVar.p.b() == null) {
            return;
        }
        if (charSequence.length() > 0) {
            aVar.w = false;
            IN0 in0 = aVar.s;
            N.MiKuFRTN(in0.b, in0, charSequence.toString(), true, false);
        } else {
            aVar.c();
            IN0 in02 = aVar.s;
            N.MWOuMqhA(in02.b, in02, true);
            aVar.i.setEnabled(false);
            aVar.j.setEnabled(false);
        }
        if (aVar.n()) {
            return;
        }
        aVar.u = charSequence.toString();
    }

    public UN0(a aVar) {
        this.a = aVar;
    }
}
