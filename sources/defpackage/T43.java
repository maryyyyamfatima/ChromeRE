package defpackage;

import J.N;
import android.os.SystemClock;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.ntp.ForeignSessionHelper;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class T43 implements InterfaceC11522xj {
    public static T43 j;
    public final WP2 a;
    public final Profile g;
    public boolean h = false;
    public int i;

    public T43(Profile profile, WP2 wp2) {
        this.g = profile;
        this.a = wp2;
        ApplicationStatus.d(this);
    }

    public final void a(long j2, final boolean z) {
        WP2 wp2 = this.a;
        Runnable runnable = wp2.b;
        if (runnable != null) {
            wp2.a.removeCallbacks(runnable);
            wp2.b = null;
        }
        wp2.c = null;
        if (this.h == z) {
            return;
        }
        Runnable runnable2 = new Runnable() { // from class: S43
            @Override // java.lang.Runnable
            public final void run() {
                T43 t43 = T43.this;
                boolean z2 = z;
                t43.h = z2;
                ForeignSessionHelper foreignSessionHelper = new ForeignSessionHelper(t43.g);
                N.Mq_fLm3S(foreignSessionHelper.a, z2);
                N.MHB2z4$M(foreignSessionHelper.a);
                foreignSessionHelper.a = 0L;
            }
        };
        Runnable runnable3 = wp2.b;
        if (runnable3 != null) {
            wp2.a.removeCallbacks(runnable3);
            wp2.b = null;
        }
        wp2.c = runnable2;
        wp2.d = SystemClock.elapsedRealtime() + j2;
        wp2.a();
    }

    @Override // defpackage.InterfaceC11522xj
    public final void n(int i) {
        Runnable runnable;
        WP2 wp2 = this.a;
        if (i == 1) {
            wp2.a();
        } else {
            if (i != 2 || (runnable = wp2.b) == null) {
                return;
            }
            wp2.a.removeCallbacks(runnable);
            wp2.b = null;
        }
    }
}
