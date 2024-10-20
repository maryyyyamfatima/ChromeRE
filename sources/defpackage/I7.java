package defpackage;

import J.N;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I7 implements InterfaceC1151Iw0 {
    public String a;
    public final boolean b;

    @Override // defpackage.InterfaceC1151Iw0
    public final boolean a(CharSequence charSequence) {
        return false;
    }

    public I7(boolean z) {
        this.b = z;
    }

    @Override // defpackage.InterfaceC1151Iw0
    public final boolean isValid(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return this.b;
        }
        return N.MgAmKYAu(charSequence.toString(), this.a);
    }
}
