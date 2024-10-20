package defpackage;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import org.chromium.components.media_router.FlingingControllerBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3865bQ0 implements ZP0 {
    public final C2533Tm3 a = new C2533Tm3();
    public final QM2 b;
    public final String c;
    public FlingingControllerBridge d;
    public boolean e;
    public boolean f;

    public C3865bQ0(QM2 qm2, String str) {
        this.b = qm2;
        this.c = str;
    }

    public final long b() {
        C2533Tm3 c2533Tm3 = this.a;
        if (c2533Tm3.c == 0) {
            return 0L;
        }
        if (!c2533Tm3.d) {
            return Math.max(c2533Tm3.b, 0L);
        }
        long currentTimeMillis = c2533Tm3.b + ((long) (c2533Tm3.e * (System.currentTimeMillis() - c2533Tm3.c)));
        long j = c2533Tm3.a;
        if (j >= 0) {
            currentTimeMillis = Math.min(currentTimeMillis, j);
        }
        return Math.max(currentTimeMillis, 0L);
    }

    public final void c(long j) {
        QM2 qm2 = this.b;
        if (qm2.g()) {
            this.e = true;
            MediaInfo mediaInfo = new MediaInfo(this.c, 1, "*/*", null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
            KM2 e = qm2.e();
            e.getClass();
            Boolean bool = Boolean.TRUE;
            if (Double.compare(1.0d, 2.0d) > 0 || Double.compare(1.0d, 0.5d) < 0) {
                throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
            }
            MediaLoadRequestData mediaLoadRequestData = new MediaLoadRequestData(mediaInfo, null, bool, j, 1.0d, null, null, null, null, null, null, 0L);
            if (!e.h()) {
                KM2.f();
            } else {
                KM2.b(new C10029tM2(e, mediaLoadRequestData));
            }
        }
    }

    public static void a(C3865bQ0 c3865bQ0, QP2 qp2) {
        c3865bQ0.getClass();
        if (qp2.S0().r1()) {
            return;
        }
        AbstractC4851eH1.a("FlingCtrlAdptr", "Error when sending command. Status code: %d", Integer.valueOf(qp2.S0().g));
    }
}
