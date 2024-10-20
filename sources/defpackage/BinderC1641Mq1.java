package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mq1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1641Mq1 extends AbstractBinderC3001Xc1 {
    public final /* synthetic */ C6905kF3 a;

    @Override // defpackage.InterfaceC3131Yc1
    public final void b(Status status) {
        PendingIntent pendingIntent = status.i;
        if (pendingIntent != null) {
            status = Status.k;
        }
        RF3.b(status, pendingIntent, this.a);
    }

    public BinderC1641Mq1(C6905kF3 c6905kF3) {
        this.a = c6905kF3;
    }
}
