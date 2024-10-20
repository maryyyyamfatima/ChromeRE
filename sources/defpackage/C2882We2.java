package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import j$.util.Optional;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: We2 */
/* loaded from: classes2.dex */
public final class C2882We2 implements TextWatcher {
    public final /* synthetic */ InterfaceC2492Te2 a;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C2882We2(InterfaceC2492Te2 interfaceC2492Te2) {
        this.a = interfaceC2492Te2;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C2362Se2 c2362Se2 = (C2362Se2) this.a;
        c2362Se2.g.k(AbstractC4249cY1.m, charSequence.length() != c2362Se2.i.h(AbstractC2622Ue2.a));
        c2362Se2.i.o(AbstractC2622Ue2.e, Optional.empty());
        c2362Se2.i.o(AbstractC2622Ue2.d, Optional.of(charSequence));
    }
}
