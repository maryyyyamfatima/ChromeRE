package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.sync.ui.PassphraseDialogFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nk2 */
/* loaded from: classes.dex */
public final class C8101nk2 extends ClickableSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ PassphraseDialogFragment g;

    public C8101nk2(PassphraseDialogFragment passphraseDialogFragment, String str) {
        this.g = passphraseDialogFragment;
        this.a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C12008z71.a().d(this.g.getActivity(), this.a, null, Profile.d());
    }
}
