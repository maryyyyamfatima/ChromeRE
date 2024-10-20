package defpackage;

import android.util.Patterns;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F40 implements InterfaceC1151Iw0 {
    @Override // defpackage.InterfaceC1151Iw0
    public final boolean a(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.InterfaceC1151Iw0
    public final boolean isValid(CharSequence charSequence) {
        return charSequence != null && Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }
}
