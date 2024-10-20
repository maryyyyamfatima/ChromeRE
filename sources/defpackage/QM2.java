package defpackage;

import J.N;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaStatus;
import java.lang.ref.WeakReference;
import org.chromium.components.media_router.FlingingControllerBridge;
import org.chromium.components.media_router.MediaStatusBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QM2 extends AbstractC6450iw {
    public static WeakReference g;
    public C3865bQ0 f;

    public QM2(HE he) {
        super(he);
        new OM2(this);
        g = new WeakReference(this);
    }

    @Override // defpackage.AbstractC6450iw
    public final void i() {
        super.i();
        C1560Ma0 c1560Ma0 = this.c;
        this.f = new C3865bQ0(this, ((NM2) (c1560Ma0 != null ? c1560Ma0.a : null)).b);
    }

    @Override // defpackage.AbstractC6450iw
    public final void j() {
        C3865bQ0 c3865bQ0 = this.f;
        if (c3865bQ0.d != null) {
            KM2 e = c3865bQ0.b.e();
            MediaStatus e2 = e.e();
            C2533Tm3 c2533Tm3 = c3865bQ0.a;
            if (e2 != null) {
                c3865bQ0.f = true;
                if (e2.j == 1 && e2.k == 1) {
                    c3865bQ0.e = false;
                    c2533Tm3.d = false;
                    c2533Tm3.b = c2533Tm3.a;
                    c2533Tm3.c = System.currentTimeMillis();
                } else {
                    long g2 = e.g();
                    long c = e.c();
                    boolean l = e.l();
                    double d = e2.i;
                    c2533Tm3.a = g2;
                    c2533Tm3.b = c;
                    c2533Tm3.d = l;
                    c2533Tm3.e = d;
                    c2533Tm3.c = System.currentTimeMillis();
                }
                FlingingControllerBridge flingingControllerBridge = c3865bQ0.d;
                MediaStatusBridge mediaStatusBridge = new MediaStatusBridge(e2);
                long j = flingingControllerBridge.b;
                if (j != 0) {
                    N.MR1NlI2Y(j, flingingControllerBridge, mediaStatusBridge);
                }
            } else if (c3865bQ0.f) {
                c3865bQ0.e = false;
                c2533Tm3.a = 0L;
                c2533Tm3.b = 0L;
                c2533Tm3.c = 0L;
                c2533Tm3.d = false;
                c2533Tm3.e = 1.0d;
            }
        }
        super.j();
    }

    @Override // defpackage.AbstractC6450iw
    public final void a(QH qh) {
        C6108hw c6108hw;
        this.a = qh;
        KM2 km2 = qh.h;
        if (km2 != null && (c6108hw = this.d) != null) {
            km2.i.add(c6108hw);
        }
        try {
            QH qh2 = this.a;
            ZG zg = new ZG() { // from class: PM2
                @Override // defpackage.ZG
                public final void a(CastDevice castDevice, String str, String str2) {
                    QM2 qm2 = QM2.this;
                    qm2.getClass();
                    if ("urn:x-cast:com.google.cast.media".equals(str) && qm2.g()) {
                        QH qh3 = qm2.a;
                        qh3.h.a(qh3.i, "urn:x-cast:com.google.cast.media", str2);
                    }
                }
            };
            C8136nq1 c8136nq1 = qh2.g;
            if (c8136nq1 == null || !c8136nq1.k()) {
                return;
            }
            qh2.g.o("urn:x-cast:com.google.cast.media", zg);
        } catch (Exception e) {
            AbstractC4851eH1.a("RmtSessionCtrl", "Failed to register namespace listener for %s", "urn:x-cast:com.google.cast.media", e);
        }
    }
}
