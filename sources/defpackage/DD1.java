package defpackage;

import android.content.DialogInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DD1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ED1 a;

    public DD1(ED1 ed1) {
        this.a = ed1;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ED1 ed1 = this.a;
        ed1.z0 = i;
        ed1.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
