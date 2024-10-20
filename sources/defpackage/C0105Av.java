package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Av, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105Av extends U31 {
    public final /* synthetic */ Dialog a;
    public final /* synthetic */ RunnableC0235Bv b;

    public C0105Av(RunnableC0235Bv runnableC0235Bv, AlertDialog alertDialog) {
        this.b = runnableC0235Bv;
        this.a = alertDialog;
    }

    @Override // defpackage.U31
    public final void a() {
        this.b.g.l();
        Dialog dialog = this.a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
