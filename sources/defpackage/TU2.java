package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TU2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ VU2 a;

    public TU2(VU2 vu2) {
        this.a = vu2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        Uri.Builder scheme = new Uri.Builder().scheme("package");
        VU2 vu2 = this.a;
        intent.setData(scheme.opaquePart(vu2.a.getPackageName()).build());
        ((Activity) vu2.a).startActivity(intent);
    }
}
