package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.h;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ip3 */
/* loaded from: classes.dex */
public class C1119Ip3 extends DialogInterfaceOnCancelListenerC7423lm0 {
    public Dialog r0;
    public DialogInterface.OnCancelListener s0;
    public AlertDialog t0;

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        Dialog dialog = this.r0;
        if (dialog != null) {
            return dialog;
        }
        this.i0 = false;
        if (this.t0 == null) {
            this.t0 = new AlertDialog.Builder(K()).create();
        }
        return this.t0;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.s0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final void Q0(h hVar, String str) {
        super.Q0(hVar, str);
    }
}
