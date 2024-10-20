package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class G9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context a;

    public G9(Context context) {
        this.a = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=com.google.vr.vrcore"));
        intent.setPackage("com.android.vending");
        try {
            this.a.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            int i2 = J9.a;
            Log.e("J9", "Google Play Services is not installed, unable to download VrCore.");
        }
    }
}
