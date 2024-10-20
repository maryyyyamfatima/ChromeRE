package defpackage;

import android.content.DialogInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class S44 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean a;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.a) {
            return;
        }
        FI2.a("Signin_Android_GmsUserRecoverableDialogAccepted");
    }
}
