package defpackage;

import J.N;
import android.content.DialogInterface;
import org.chromium.chrome.browser.password_check.CompromisedCredential;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zk2 */
/* loaded from: classes.dex */
public final class C3302Zk2 implements InterfaceDialogInterfaceOnClickListenerC1742Nk2 {
    public final /* synthetic */ CompromisedCredential a;
    public final /* synthetic */ C3983bl2 g;

    @Override // defpackage.InterfaceDialogInterfaceOnClickListenerC1742Nk2
    public final void onDismiss() {
        this.g.d.o(AbstractC5357fl2.b, null);
    }

    public C3302Zk2(C3983bl2 c3983bl2, CompromisedCredential compromisedCredential) {
        this.g = c3983bl2;
        this.a = compromisedCredential;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC4326cl2.b(12);
        CompromisedCredential compromisedCredential = this.a;
        AbstractC4326cl2.a(2, compromisedCredential);
        if (i != -1) {
            return;
        }
        C3983bl2 c3983bl2 = this.g;
        N.MShNfrj$(((C2392Sk2) c3983bl2.e).a.a, compromisedCredential);
        c3983bl2.d.o(AbstractC5357fl2.b, null);
        c3983bl2.d.o(AbstractC5357fl2.c, null);
    }
}
