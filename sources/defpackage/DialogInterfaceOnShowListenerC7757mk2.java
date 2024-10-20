package defpackage;

import android.content.DialogInterface;
import org.chromium.chrome.browser.sync.ui.PassphraseDialogFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mk2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnShowListenerC7757mk2 implements DialogInterface.OnShowListener {
    public final /* synthetic */ DialogC5834h8 a;
    public final /* synthetic */ PassphraseDialogFragment g;

    public DialogInterfaceOnShowListenerC7757mk2(PassphraseDialogFragment passphraseDialogFragment, DialogC5834h8 dialogC5834h8) {
        this.g = passphraseDialogFragment;
        this.a = dialogC5834h8;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        this.a.j.k.setOnClickListener(new ViewOnClickListenerC7413lk2(this));
    }
}
