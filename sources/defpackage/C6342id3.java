package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: id3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6342id3 implements TextWatcher {
    public final /* synthetic */ List a;
    public final /* synthetic */ int g;
    public final /* synthetic */ C7372ld3 h;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C6342id3(C7372ld3 c7372ld3, InterfaceC1377Kp1 interfaceC1377Kp1, int i) {
        this.h = c7372ld3;
        this.a = interfaceC1377Kp1;
        this.g = i;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String trim = charSequence.toString().trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        this.h.a.a(new C7028kd3(3, trim, ((C3328Zp3) this.a.get(this.g)).k));
    }
}
