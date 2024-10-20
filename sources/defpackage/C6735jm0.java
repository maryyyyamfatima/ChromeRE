package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6735jm0 implements InterfaceC11471xa2 {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC7423lm0 a;

    public C6735jm0(DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0) {
        this.a = dialogInterfaceOnCancelListenerC7423lm0;
    }

    @Override // defpackage.InterfaceC11471xa2
    public final void a(Object obj) {
        if (((JA1) obj) != null) {
            DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0 = this.a;
            if (dialogInterfaceOnCancelListenerC7423lm0.i0) {
                View C0 = dialogInterfaceOnCancelListenerC7423lm0.C0();
                if (C0.getParent() == null) {
                    Dialog dialog = dialogInterfaceOnCancelListenerC7423lm0.m0;
                    if (dialog != null) {
                        dialog.setContentView(C0);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
