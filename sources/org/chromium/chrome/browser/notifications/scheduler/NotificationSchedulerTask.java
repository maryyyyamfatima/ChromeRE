package org.chromium.chrome.browser.notifications.scheduler;

import J.N;
import android.content.Context;
import defpackage.AbstractC7808mt;
import defpackage.BF3;
import defpackage.C9524rt;
import defpackage.H72;
import defpackage.InterfaceC2559Ts;
import defpackage.KF3;
import defpackage.N02;
import defpackage.S02;
import defpackage.V60;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NotificationSchedulerTask extends S02 {
    @Override // defpackage.InterfaceC2689Us
    public final void a() {
    }

    @Override // defpackage.S02
    public final int d(Context context, KF3 kf3, N02 n02) {
        return 0;
    }

    @Override // defpackage.S02
    public final boolean f() {
        return true;
    }

    public static void cancel() {
        AbstractC7808mt.b().a(V60.a, 103);
    }

    public static void schedule(long j, long j2) {
        C9524rt b = AbstractC7808mt.b();
        BF3 a = TaskInfo.a(103, j, j2);
        a.f = true;
        a.e = true;
        b.b(V60.a, a.a());
    }

    @Override // defpackage.S02
    public final void e(Context context, KF3 kf3, InterfaceC2559Ts interfaceC2559Ts) {
        N.Mgeg_Rc9(this, new H72(interfaceC2559Ts));
    }

    @Override // defpackage.S02
    public final boolean g(KF3 kf3) {
        return N.M91xgL_Z(this);
    }
}
