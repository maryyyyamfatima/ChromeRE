package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EM2 implements InterfaceC3857bO2 {
    public final /* synthetic */ GM2 a;

    public EM2(GM2 gm2) {
        this.a = gm2;
    }

    @Override // defpackage.InterfaceC3857bO2
    public final void b(long j) {
        try {
            GM2 gm2 = this.a;
            Status status = new Status(2103, null, 0);
            gm2.getClass();
            gm2.a(new FM2(status));
        } catch (IllegalStateException e) {
            KM2.k.c("Result already set when calling onRequestReplaced", e, new Object[0]);
        }
    }

    @Override // defpackage.InterfaceC3857bO2
    public final void a(long j, int i, C5913hN1 c5913hN1) {
        if (!(c5913hN1 instanceof C5913hN1)) {
        }
        try {
            this.a.a(new IM2(new Status(i, null, 0)));
        } catch (IllegalStateException e) {
            KM2.k.c("Result already set when calling onRequestCompleted", e, new Object[0]);
        }
    }
}
