package defpackage;

import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sU0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class WindowOnFrameMetricsAvailableListenerC9724sU0 implements Window$OnFrameMetricsAvailableListener {
    public final C10067tU0 a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public WindowOnFrameMetricsAvailableListenerC9724sU0(C10067tU0 c10067tU0) {
        this.a = c10067tU0;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric;
        long metric2;
        if (this.b.get()) {
            metric = frameMetrics.getMetric(8);
            metric2 = frameMetrics.getMetric(10);
            C10067tU0 c10067tU0 = this.a;
            synchronized (c10067tU0.a) {
                if (c10067tU0.e.isEmpty()) {
                    return;
                }
                c10067tU0.b.add(Long.valueOf(metric2));
                c10067tU0.c.add(Long.valueOf(metric));
                c10067tU0.d.add(Integer.valueOf(i));
            }
        }
    }
}
