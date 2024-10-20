package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hf */
/* loaded from: classes.dex */
public class C0935Hf extends DialogInterfaceOnCancelListenerC7423lm0 {
    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public Dialog M0(Bundle bundle) {
        return new DialogC0805Gf(K(), this.g0);
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final void O0(Dialog dialog, int i) {
        if (dialog instanceof DialogC0805Gf) {
            DialogC0805Gf dialogC0805Gf = (DialogC0805Gf) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                } else {
                    dialog.getWindow().addFlags(24);
                }
            }
            dialogC0805Gf.c().i(1);
            return;
        }
        super.O0(dialog, i);
    }
}
