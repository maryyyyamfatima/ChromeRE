package defpackage;

import android.app.Activity;
import android.app.Dialog;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class N8 extends Dialog implements InterfaceC11179wj {
    public N8(Activity activity, int i) {
        super(activity, i);
        ApplicationStatus.e(this, activity);
        setOwnerActivity(activity);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        ApplicationStatus.h(this);
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (i == 6) {
            dismiss();
        }
    }
}
