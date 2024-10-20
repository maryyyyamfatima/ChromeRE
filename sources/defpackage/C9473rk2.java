package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import org.chromium.chrome.browser.sync.ui.PassphraseTypeDialogFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rk2 */
/* loaded from: classes.dex */
public final class C9473rk2 extends ClickableSpan {
    public final /* synthetic */ PassphraseTypeDialogFragment a;

    public C9473rk2(PassphraseTypeDialogFragment passphraseTypeDialogFragment) {
        this.a = passphraseTypeDialogFragment;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/settings/chrome/sync"));
        intent.setPackage(V60.a.getPackageName());
        AbstractC2281Ro1.x(intent, null);
        this.a.getActivity().startActivity(intent);
    }
}
