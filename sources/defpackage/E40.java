package defpackage;

import android.telephony.PhoneNumberUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class E40 implements InterfaceC1151Iw0 {
    @Override // defpackage.InterfaceC1151Iw0
    public final boolean a(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.InterfaceC1151Iw0
    public final boolean isValid(CharSequence charSequence) {
        boolean z;
        C7432ln3 c = C7432ln3.c();
        if (charSequence != null) {
            try {
                if (PhoneNumberUtils.isGlobalPhoneNumber(PhoneNumberUtils.stripSeparators(charSequence.toString()))) {
                    z = true;
                    c.close();
                    return z;
                }
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        z = false;
        c.close();
        return z;
    }
}
