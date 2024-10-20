package defpackage;

import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nh2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8083nh2 {
    public Long a;
    public Long b;
    public Long c;
    public Long d;

    public final void a(int i) {
        EI2.h(i, 7, "WebsiteSettings.Discoverability.Action");
        if (i == 0) {
            this.a = Long.valueOf(SystemClock.elapsedRealtime());
            return;
        }
        if (i == 1) {
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
            this.b = valueOf;
            EI2.n(valueOf.longValue() - this.a.longValue(), "WebsiteSettings.Discoverability.TimeToOpen");
            this.a = null;
            return;
        }
        if (i == 2) {
            if (this.b != null) {
                EI2.k(SystemClock.elapsedRealtime() - this.b.longValue(), "WebsiteSettings.Discoverability.TimeToClickHighlight");
            }
            this.b = null;
        } else {
            if (i == 4) {
                this.c = Long.valueOf(SystemClock.elapsedRealtime());
                return;
            }
            if (i == 5) {
                Long valueOf2 = Long.valueOf(SystemClock.elapsedRealtime());
                this.d = valueOf2;
                EI2.n(valueOf2.longValue() - this.c.longValue(), "WebsiteSettings.Discoverability.TimeToOpenFromStoreIcon");
                this.c = null;
                return;
            }
            if (i != 6) {
                return;
            }
            if (this.d != null) {
                EI2.k(SystemClock.elapsedRealtime() - this.d.longValue(), "WebsiteSettings.Discoverability.TimeToClickHighlightStoreInfo");
            }
            this.d = null;
        }
    }
}
