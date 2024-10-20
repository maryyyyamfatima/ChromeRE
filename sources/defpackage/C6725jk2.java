package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import org.chromium.chrome.browser.sync.ui.PassphraseDialogFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jk2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6725jk2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ PassphraseDialogFragment a;

    public C6725jk2(PassphraseDialogFragment passphraseDialogFragment) {
        this.a = passphraseDialogFragment;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        PassphraseDialogFragment.R0(this.a);
        return false;
    }
}
