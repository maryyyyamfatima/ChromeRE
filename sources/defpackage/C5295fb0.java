package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fb0 */
/* loaded from: classes.dex */
public final class C5295fb0 implements TextWatcher {
    public final /* synthetic */ InterfaceC7357lb0 a;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C5295fb0(InterfaceC7357lb0 interfaceC7357lb0) {
        this.a = interfaceC7357lb0;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2 = charSequence.toString();
        C6669jb0 c6669jb0 = (C6669jb0) this.a;
        c6669jb0.f.o(AbstractC7013kb0.f, charSequence2);
        c6669jb0.f.k(AbstractC7013kb0.g, charSequence2.isEmpty());
        if (charSequence2.isEmpty()) {
            EI2.h(0, 2, "PasswordManager.CredentialEditError");
        }
    }
}
