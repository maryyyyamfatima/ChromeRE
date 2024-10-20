package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: im0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC6392im0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC7423lm0 a;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0 = this.a;
        Dialog dialog = dialogInterfaceOnCancelListenerC7423lm0.m0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC7423lm0.onDismiss(dialog);
        }
    }

    public DialogInterfaceOnDismissListenerC6392im0(DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0) {
        this.a = dialogInterfaceOnCancelListenerC7423lm0;
    }
}
