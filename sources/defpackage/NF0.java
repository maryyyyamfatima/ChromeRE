package defpackage;

import android.content.DialogInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NF0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ QF0 a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            EI2.h(2, 3, "PasswordManager.PasswordExport.Event");
            QF0 qf0 = this.a;
            qf0.a = 2;
            if (qf0.e != null) {
                qf0.b();
            } else {
                qf0.c();
            }
        }
    }

    public NF0(QF0 qf0) {
        this.a = qf0;
    }
}
