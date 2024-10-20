package defpackage;

import android.app.Activity;
import android.app.AlertDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class T44 extends V44 {
    public final Activity a;
    public AlertDialog b;
    public final boolean c;
    public int d;

    public T44(Activity activity, boolean z) {
        this.a = activity;
        this.c = z;
    }

    @Override // defpackage.V44
    public final void a(int i) {
        AlertDialog alertDialog;
        if (this.d != i && (alertDialog = this.b) != null) {
            alertDialog.cancel();
            this.b = null;
        }
        if (this.b == null) {
            AlertDialog d = C8543p11.d.d(i, -1, this.a, null);
            this.b = d;
            this.d = i;
            S44 s44 = new S44();
            d.setOnDismissListener(s44);
            d.setOnCancelListener(s44);
        }
        AlertDialog alertDialog2 = this.b;
        if (alertDialog2 == null || alertDialog2.isShowing()) {
            return;
        }
        this.b.setCancelable(this.c);
        this.b.show();
        FI2.a("Signin_Android_GmsUserRecoverableDialogShown");
    }
}
