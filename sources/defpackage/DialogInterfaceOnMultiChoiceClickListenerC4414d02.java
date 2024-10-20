package defpackage;

import android.content.DialogInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnMultiChoiceClickListenerC4414d02 implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ C4757e02 a;

    public DialogInterfaceOnMultiChoiceClickListenerC4414d02(C4757e02 c4757e02) {
        this.a = c4757e02;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        C4757e02 c4757e02 = this.a;
        if (z) {
            c4757e02.A0 = c4757e02.z0.add(c4757e02.C0[i].toString()) | c4757e02.A0;
        } else {
            c4757e02.A0 = c4757e02.z0.remove(c4757e02.C0[i].toString()) | c4757e02.A0;
        }
    }
}
