package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bb2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3923bb2 {
    public boolean a;
    public boolean b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;

    public C3923bb2() {
        Q83 q83 = O83.a;
        if (q83.c("Chrome.OfflineIndicatorV2.WallTimeShownMs")) {
            this.c = q83.h("Chrome.OfflineIndicatorV2.WallTimeShownMs");
            this.a = true;
        }
        if (q83.c("Chrome.OfflineIndicatorV2.LastUpdateWallTimeMs")) {
            this.d = q83.h("Chrome.OfflineIndicatorV2.LastUpdateWallTimeMs");
        }
        if (q83.c("Chrome.OfflineIndicatorV2.TimeInForegroundMs")) {
            this.e = q83.h("Chrome.OfflineIndicatorV2.TimeInForegroundMs");
        }
        if (q83.c("Chrome.OfflineIndicatorV2.TimeInBackgroundMs")) {
            this.f = q83.h("Chrome.OfflineIndicatorV2.TimeInBackgroundMs");
        }
        if (q83.c("Chrome.OfflineIndicatorV2.FirstTimeInForegroundMs")) {
            this.g = q83.h("Chrome.OfflineIndicatorV2.FirstTimeInForegroundMs");
        }
        if (q83.c("Chrome.OfflineIndicatorV2.NumTimesBackgrounded")) {
            this.h = q83.f(0, "Chrome.OfflineIndicatorV2.NumTimesBackgrounded");
        }
    }

    public final void a() {
        if (this.a) {
            if (this.b) {
                Q83 q83 = O83.a;
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.e + (currentTimeMillis - this.d);
                this.e = j;
                q83.s(j, "Chrome.OfflineIndicatorV2.TimeInForegroundMs");
                this.d = currentTimeMillis;
                q83.s(currentTimeMillis, "Chrome.OfflineIndicatorV2.LastUpdateWallTimeMs");
            } else {
                Q83 q832 = O83.a;
                long currentTimeMillis2 = System.currentTimeMillis();
                long j2 = this.f + (currentTimeMillis2 - this.d);
                this.f = j2;
                q832.s(j2, "Chrome.OfflineIndicatorV2.TimeInBackgroundMs");
                this.d = currentTimeMillis2;
                q832.s(currentTimeMillis2, "Chrome.OfflineIndicatorV2.LastUpdateWallTimeMs");
            }
            if (System.currentTimeMillis() - this.c >= 0) {
                EI2.g("OfflineIndicator.ShownDurationV2", this.e + this.f, 1L, 3600000L, 100);
                EI2.j(this.e, "OfflineIndicator.ShownDurationV2.InForeground");
                EI2.d(this.h, "OfflineIndicator.ShownDurationV2.NumTimesBackgrounded");
                if (O83.a.c("Chrome.OfflineIndicatorV2.TimeInBackgroundMs")) {
                    EI2.j(this.f, "OfflineIndicator.ShownDurationV2.InBackground");
                    EI2.j(this.g, "OfflineIndicator.ShownDurationV2.UntilFirstTimeBackgrounded");
                } else {
                    EI2.j(this.e, "OfflineIndicator.ShownDurationV2.InForegroundWithoutBeingBackgrounded");
                }
            }
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.g = 0L;
            this.h = 0;
            this.a = false;
            Q83 q833 = O83.a;
            q833.m("Chrome.OfflineIndicatorV2.WallTimeShownMs");
            q833.m("Chrome.OfflineIndicatorV2.LastUpdateWallTimeMs");
            q833.m("Chrome.OfflineIndicatorV2.TimeInForegroundMs");
            q833.m("Chrome.OfflineIndicatorV2.TimeInBackgroundMs");
            q833.m("Chrome.OfflineIndicatorV2.FirstTimeInForegroundMs");
            q833.m("Chrome.OfflineIndicatorV2.NumTimesBackgrounded");
        }
    }
}
