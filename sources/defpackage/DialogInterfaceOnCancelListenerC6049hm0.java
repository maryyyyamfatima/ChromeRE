package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC6049hm0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC7423lm0 a;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0 = this.a;
        Dialog dialog = dialogInterfaceOnCancelListenerC7423lm0.m0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC7423lm0.onCancel(dialog);
        }
    }

    public DialogInterfaceOnCancelListenerC6049hm0(DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0) {
        this.a = dialogInterfaceOnCancelListenerC7423lm0;
    }
}
