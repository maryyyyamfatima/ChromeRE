package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eb0 */
/* loaded from: classes.dex */
public final class C4951eb0 implements TextWatcher {
    public final /* synthetic */ InterfaceC7357lb0 a;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C4951eb0(InterfaceC7357lb0 interfaceC7357lb0) {
        this.a = interfaceC7357lb0;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2 = charSequence.toString();
        C6669jb0 c6669jb0 = (C6669jb0) this.a;
        c6669jb0.f.o(AbstractC7013kb0.c, charSequence2);
        boolean z = !c6669jb0.g.equals(charSequence2) && c6669jb0.j.contains(charSequence2);
        c6669jb0.f.k(AbstractC7013kb0.d, z);
        if (z) {
            EI2.h(1, 2, "PasswordManager.CredentialEditError");
        }
    }
}
