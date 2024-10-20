package defpackage;

import J.N;
import android.content.Context;
import android.os.Bundle;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.chrome.browser.download.service.DownloadTaskScheduler;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.components.download.internal.BatteryStatusListenerAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zq0 */
/* loaded from: classes.dex */
public final class C3330Zq0 extends S02 {
    public int f;

    @Override // defpackage.S02
    public final boolean f() {
        return true;
    }

    @Override // defpackage.S02
    public final int d(Context context, KF3 kf3, N02 n02) {
        boolean z = kf3.b.getBoolean("extra_battery_requires_charging");
        Bundle bundle = kf3.b;
        int i = bundle.getInt("extra_optimal_battery_percentage");
        this.f = bundle.getInt("extra_task_type");
        return (z || BatteryStatusListenerAndroid.getBatteryPercentage() >= i) ? 0 : 1;
    }

    @Override // defpackage.S02
    public final boolean g(KF3 kf3) {
        return N.MtXApQ3N(this, ProfileKey.a(), kf3.b.getInt("extra_task_type"));
    }

    @Override // defpackage.S02
    public final void e(Context context, KF3 kf3, final InterfaceC2559Ts interfaceC2559Ts) {
        DownloadManagerService.i().l();
        N.MBBY92FO(this, ProfileKey.a(), this.f, new Callback() { // from class: Yq0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                InterfaceC2559Ts.this.a(((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // defpackage.InterfaceC2689Us
    public final void a() {
        DownloadTaskScheduler.scheduleTask(0, false, false, 0, 300L, 600L);
        DownloadTaskScheduler.scheduleTask(1, false, false, 0, 43200L, 86400L);
        if (UN.s.a()) {
            DownloadTaskScheduler.scheduleTask(2, false, false, 0, 300L, 86400L);
        }
    }
}
