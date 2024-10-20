package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class H9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context a;

    public H9(Context context) {
        this.a = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.startActivity(new Intent("android.settings.VR_LISTENER_SETTINGS"));
    }
}
