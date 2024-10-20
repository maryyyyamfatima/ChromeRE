package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wx2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2977Wx2 extends BroadcastReceiver {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final RunnableC2847Vx2 b = new RunnableC2847Vx2();

    public final void a() {
        Object obj = ThreadUtils.a;
        if (((PowerManager) V60.a.getSystemService("power")).isInteractive()) {
            RunnableC2847Vx2 runnableC2847Vx2 = this.b;
            if (runnableC2847Vx2.g == 1) {
                return;
            }
            runnableC2847Vx2.g = 1;
            runnableC2847Vx2.a.postDelayed(runnableC2847Vx2, 5000L);
            return;
        }
        if (this.a.getAndSet(true)) {
            return;
        }
        V60.a.registerReceiver(this, new IntentFilter("android.intent.action.SCREEN_ON"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && ApplicationStatus.hasVisibleActivities()) {
            RunnableC2847Vx2 runnableC2847Vx2 = this.b;
            if (runnableC2847Vx2.g != 1) {
                runnableC2847Vx2.g = 1;
                runnableC2847Vx2.a.postDelayed(runnableC2847Vx2, 5000L);
            }
            if (this.a.getAndSet(false)) {
                V60.a.unregisterReceiver(this);
            }
        }
    }
}
