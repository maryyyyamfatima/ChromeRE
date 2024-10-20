package defpackage;

import android.content.DialogInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: al2 */
/* loaded from: classes.dex */
public final class C3639al2 implements InterfaceDialogInterfaceOnClickListenerC1742Nk2 {
    public final /* synthetic */ C3983bl2 a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C3983bl2 c3983bl2 = this.a;
        c3983bl2.d.o(AbstractC5357fl2.d, null);
        c3983bl2.d.o(AbstractC5357fl2.e, null);
    }

    @Override // defpackage.InterfaceDialogInterfaceOnClickListenerC1742Nk2
    public final void onDismiss() {
        this.a.d.o(AbstractC5357fl2.e, null);
    }

    public C3639al2(C3983bl2 c3983bl2) {
        this.a = c3983bl2;
    }
}
