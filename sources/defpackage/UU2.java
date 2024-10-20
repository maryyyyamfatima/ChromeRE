package defpackage;

import android.content.DialogInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UU2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ VU2 a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.f.cancel();
    }

    public UU2(VU2 vu2) {
        this.a = vu2;
    }
}
