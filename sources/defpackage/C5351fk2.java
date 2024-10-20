package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import org.chromium.chrome.browser.sync.ui.PassphraseCreationDialogFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fk2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5351fk2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ PassphraseCreationDialogFragment a;

    public C5351fk2(PassphraseCreationDialogFragment passphraseCreationDialogFragment) {
        this.a = passphraseCreationDialogFragment;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        PassphraseCreationDialogFragment.R0(this.a);
        return false;
    }
}
