package defpackage;

import android.content.DialogInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class HW implements DialogInterface.OnClickListener {
    public final /* synthetic */ KW a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        KW kw = this.a;
        int i2 = kw.k;
        InterfaceC1183Jc2 interfaceC1183Jc2 = kw.j;
        if (interfaceC1183Jc2 != null) {
            interfaceC1183Jc2.a(i2);
        }
    }

    public HW(KW kw) {
        this.a = kw;
    }
}
