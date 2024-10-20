package defpackage;

import android.content.DialogInterface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OF0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ QF0 a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            this.a.a = 0;
        }
    }

    public OF0(QF0 qf0) {
        this.a = qf0;
    }
}
