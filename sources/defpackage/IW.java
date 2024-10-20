package defpackage;

import android.content.DialogInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class IW implements DialogInterface.OnCancelListener {
    public final /* synthetic */ KW a;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        KW kw = this.a;
        int i = kw.k;
        InterfaceC1183Jc2 interfaceC1183Jc2 = kw.j;
        if (interfaceC1183Jc2 != null) {
            interfaceC1183Jc2.a(i);
        }
    }

    public IW(KW kw) {
        this.a = kw;
    }
}
