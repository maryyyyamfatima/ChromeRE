package defpackage;

import J.N;
import android.content.Context;
import org.chromium.chrome.browser.background_sync.BackgroundSyncBackgroundTaskScheduler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qs */
/* loaded from: classes.dex */
public final class C2169Qs extends S02 {
    @Override // defpackage.S02
    public final boolean f() {
        return true;
    }

    @Override // defpackage.S02
    public final boolean g(KF3 kf3) {
        return true;
    }

    @Override // defpackage.S02
    public final int d(Context context, KF3 kf3, N02 n02) {
        return C1226Jl0.b(context) == 6 ? 1 : 0;
    }

    @Override // defpackage.S02
    public final void e(Context context, KF3 kf3, final InterfaceC2559Ts interfaceC2559Ts) {
        EI2.j(System.currentTimeMillis() - kf3.b.getLong("SoonestWakeupTime"), "BackgroundSync.Wakeup.DelayTime");
        N.MSbjZsF$(new Runnable() { // from class: Ps
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC2559Ts.this.a(false);
            }
        });
    }

    @Override // defpackage.InterfaceC2689Us
    public final void a() {
        BackgroundSyncBackgroundTaskScheduler.getInstance().scheduleOneOffTask(0, 360000L);
    }
}
