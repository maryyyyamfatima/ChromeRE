package defpackage;

import androidx.fragment.app.h;
import org.chromium.chrome.browser.sync.ui.PassphraseActivity;
import org.chromium.chrome.browser.sync.ui.PassphraseDialogFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ek2 */
/* loaded from: classes.dex */
public final class C5007ek2 implements InterfaceC1528Lt3 {
    public final /* synthetic */ PassphraseActivity a;

    public C5007ek2(PassphraseActivity passphraseActivity) {
        this.a = passphraseActivity;
    }

    @Override // defpackage.InterfaceC1528Lt3
    public final void B() {
        if (AbstractC1658Mt3.b().h()) {
            int i = PassphraseActivity.z;
            PassphraseActivity passphraseActivity = this.a;
            if (passphraseActivity.y != null) {
                AbstractC1658Mt3.b().l(passphraseActivity.y);
                passphraseActivity.y = null;
            }
            h h0 = passphraseActivity.h0();
            h0.getClass();
            C10547us c10547us = new C10547us(h0);
            c10547us.c();
            new PassphraseDialogFragment().P0(c10547us, "passphrase_fragment");
        }
    }
}
