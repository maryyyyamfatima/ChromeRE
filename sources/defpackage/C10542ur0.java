package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.profiles.OTRProfileID;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ur0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10542ur0 extends AbstractC1598Mh3 {
    public final BinderC10199tr0 b = new BinderC10199tr0(this);
    public NotificationManager c;

    @Override // defpackage.AbstractC1598Mh3
    public final void b() {
        this.c = (NotificationManager) V60.a.getSystemService("notification");
    }

    @Override // defpackage.AbstractC1598Mh3
    public final int e(Intent intent, int i, int i2) {
        if (intent != null) {
            return 1;
        }
        AbstractC2820Vs0.a(4);
        this.a.stopSelf();
        return 1;
    }

    @Override // defpackage.AbstractC1598Mh3
    public final void c() {
        AbstractC2820Vs0.a(1);
        Iterator it = O83.a.j("ForegroundServiceObservers").iterator();
        while (it.hasNext()) {
            if (AbstractC12257zr0.a((String) it.next()) != null) {
                C2690Us0 c2690Us0 = AbstractC2560Ts0.a;
                c2690Us0.a();
                Iterator it2 = c2690Us0.d.a.iterator();
                while (it2.hasNext()) {
                    C3685at0 c3685at0 = (C3685at0) it2.next();
                    OTRProfileID oTRProfileID = c3685at0.b;
                    OTRProfileID oTRProfileID2 = OTRProfileID.b;
                    if (!(oTRProfileID != null)) {
                        c2690Us0.d(c3685at0.f, c3685at0.d, true, true, null, c3685at0.g, null, null, false, false, false, 1);
                    }
                }
            }
        }
    }

    @Override // defpackage.AbstractC1598Mh3
    public final void f() {
        AbstractC2820Vs0.a(2);
        Iterator it = O83.a.j("ForegroundServiceObservers").iterator();
        while (it.hasNext()) {
            if (AbstractC12257zr0.a((String) it.next()) != null) {
                C2690Us0 c2690Us0 = AbstractC2560Ts0.a;
                c2690Us0.getClass();
                if (ApplicationStatus.a.isEmpty()) {
                    c2690Us0.a();
                }
            }
        }
    }

    @Override // defpackage.AbstractC1598Mh3
    public final void d() {
        AbstractC2820Vs0.a(3);
    }

    @Override // defpackage.AbstractC1598Mh3
    public final IBinder a() {
        return this.b;
    }

    public final void h(int i, Notification notification) {
        AbstractC4851eH1.f("DownloadFg", AbstractC9076qb1.a("startForegroundInternal id: ", i), new Object[0]);
        AbstractServiceC1728Nh3 abstractServiceC1728Nh3 = this.a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            AbstractC0410De.a(abstractServiceC1728Nh3, i, notification);
        } else if (i2 < 29) {
            abstractServiceC1728Nh3.startForeground(i, notification);
        } else {
            abstractServiceC1728Nh3.startForeground(i, notification, 0);
        }
    }

    public final void i(int i) {
        AbstractC4851eH1.f("DownloadFg", AbstractC9076qb1.a("stopForegroundInternal flags: ", i), new Object[0]);
        AbstractServiceC1728Nh3 abstractServiceC1728Nh3 = this.a;
        try {
            if (Build.VERSION.SDK_INT < 24) {
                abstractServiceC1728Nh3.stopForeground((i & 1) != 0);
            } else {
                abstractServiceC1728Nh3.stopForeground(i);
            }
        } catch (NullPointerException e) {
            AbstractC4851eH1.a("ForegroundService", "Failed to stop foreground service, ", e);
        }
    }
}
