package defpackage;

import org.chromium.components.media_router.BrowserMediaRouter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QE extends HE {
    public final QM2 h;

    @Override // defpackage.HE
    public final UR1 p(String str) {
        return NM2.d(str);
    }

    @Override // defpackage.HE
    public final AbstractC6450iw v() {
        return this.h;
    }

    @Override // defpackage.InterfaceC5240fQ1
    public final void c(int i, String str, String str2, String str3, int i2) {
        ((BrowserMediaRouter) this.b).d(i2, "Remote playback doesn't support joining routes");
    }

    @Override // defpackage.InterfaceC5240fQ1
    public final void h(String str, String str2) {
        AbstractC4851eH1.a("RmtMRP", "Remote playback does not support sending messages", new Object[0]);
    }

    public QE(MQ1 mq1, BrowserMediaRouter browserMediaRouter) {
        super(mq1, browserMediaRouter);
        this.h = new QM2(this);
    }

    @Override // defpackage.HE, defpackage.InterfaceC5240fQ1
    public final ZP0 b(String str) {
        QM2 qm2 = this.h;
        if (qm2.g() && this.d.containsKey(str)) {
            return qm2.f;
        }
        return null;
    }

    @Override // defpackage.HE, defpackage.InterfaceC5240fQ1
    public final void e(String str) {
        t(str, null);
        QM2 qm2 = this.h;
        long b = qm2.f.b();
        long j = qm2.f.a.a;
        EI2.h(j > 0 ? (int) ((b * 10) / j) : 10, 11, "Cast.Sender.Clank.SessionTimeWithoutMediaElementPercentage");
    }
}
