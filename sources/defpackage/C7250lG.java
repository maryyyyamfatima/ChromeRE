package defpackage;

import android.text.TextUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lG */
/* loaded from: classes.dex */
public final class C7250lG implements InterfaceC1151Iw0 {
    public final /* synthetic */ C9310rG a;

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0061. Please report as an issue. */
    @Override // defpackage.InterfaceC1151Iw0
    public final boolean a(CharSequence charSequence) {
        this.a.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        String b = PersonalDataManager.d().b(charSequence.toString(), false);
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        String replace = charSequence.toString().replace(" ", "").replace("-", "");
        b.getClass();
        char c = 65535;
        switch (b.hashCode()) {
            case -1331704771:
                if (b.equals("diners")) {
                    c = 0;
                    break;
                }
                break;
            case -296504455:
                if (b.equals("unionpay")) {
                    c = 1;
                    break;
                }
                break;
            case 2997727:
                if (b.equals("amex")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (replace.length() != 14) {
                    return false;
                }
                return true;
            case 1:
                if (replace.length() != 19) {
                    return false;
                }
                return true;
            case 2:
                if (replace.length() != 15) {
                    return false;
                }
                return true;
            default:
                if (replace.length() != 16) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.InterfaceC1151Iw0
    public final boolean isValid(CharSequence charSequence) {
        return charSequence != null && this.a.h.contains(PersonalDataManager.d().b(charSequence.toString(), true));
    }

    public C7250lG(C9310rG c9310rG) {
        this.a = c9310rG;
    }
}
