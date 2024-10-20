package org.chromium.chrome.browser.password_check;

import android.content.DialogInterface;
import android.os.Bundle;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import defpackage.InterfaceDialogInterfaceOnClickListenerC1742Nk2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordCheckDialogFragment extends DialogInterfaceOnCancelListenerC7423lm0 {
    public final InterfaceDialogInterfaceOnClickListenerC1742Nk2 r0;

    public PasswordCheckDialogFragment(InterfaceDialogInterfaceOnClickListenerC1742Nk2 interfaceDialogInterfaceOnClickListenerC1742Nk2) {
        this.r0 = interfaceDialogInterfaceOnClickListenerC1742Nk2;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        if (bundle != null) {
            L0(false, false);
        }
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        InterfaceDialogInterfaceOnClickListenerC1742Nk2 interfaceDialogInterfaceOnClickListenerC1742Nk2 = this.r0;
        if (interfaceDialogInterfaceOnClickListenerC1742Nk2 != null) {
            interfaceDialogInterfaceOnClickListenerC1742Nk2.onDismiss();
        }
    }
}
