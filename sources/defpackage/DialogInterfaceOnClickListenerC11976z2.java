package defpackage;

import android.content.DialogInterface;
import org.chromium.chrome.browser.password_manager.AccountChooserDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC11976z2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AccountChooserDialog a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AccountChooserDialog accountChooserDialog = this.a;
        accountChooserDialog.n = accountChooserDialog.g[i];
    }

    public DialogInterfaceOnClickListenerC11976z2(AccountChooserDialog accountChooserDialog) {
        this.a = accountChooserDialog;
    }
}
