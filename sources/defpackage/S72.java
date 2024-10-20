package defpackage;

import J.N;
import android.content.Context;
import org.chromium.chrome.browser.notifications.NotificationTriggerScheduler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class S72 extends S02 {
    public boolean f = true;

    @Override // defpackage.S02
    public final int d(Context context, KF3 kf3, N02 n02) {
        boolean z;
        NotificationTriggerScheduler notificationTriggerScheduler = NotificationTriggerScheduler.getInstance();
        long j = kf3.b.getLong("Timestamp");
        notificationTriggerScheduler.getClass();
        Q83 q83 = O83.a;
        if (q83.g(Long.MAX_VALUE, "notification_trigger_scheduler.next_trigger") != j) {
            z = false;
        } else {
            q83.m("notification_trigger_scheduler.next_trigger");
            z = true;
        }
        this.f = z;
        return z ? 0 : 2;
    }

    @Override // defpackage.S02
    public final void e(Context context, KF3 kf3, InterfaceC2559Ts interfaceC2559Ts) {
        NotificationTriggerScheduler.getInstance().getClass();
        N.M2E1scwJ();
        this.f = false;
        interfaceC2559Ts.a(false);
    }

    @Override // defpackage.S02
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.S02
    public final boolean g(KF3 kf3) {
        return this.f;
    }

    @Override // defpackage.InterfaceC2689Us
    public final void a() {
        NotificationTriggerScheduler notificationTriggerScheduler = NotificationTriggerScheduler.getInstance();
        notificationTriggerScheduler.a.getClass();
        notificationTriggerScheduler.schedule(System.currentTimeMillis() + 540000);
    }
}
