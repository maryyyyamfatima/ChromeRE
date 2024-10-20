package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bt1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4030bt1 implements InterfaceC11179wj {
    public final WindowOnFrameMetricsAvailableListenerC9724sU0 a;
    public final C5748gt1 g;
    public final IK3 h = new IK3();
    public final C0056Al0 i = new C0056Al0();
    public final WeakReference j;

    public C4030bt1(Activity activity, WindowOnFrameMetricsAvailableListenerC9724sU0 windowOnFrameMetricsAvailableListenerC9724sU0, C5748gt1 c5748gt1) {
        this.j = new WeakReference(activity);
        this.a = windowOnFrameMetricsAvailableListenerC9724sU0;
        this.g = c5748gt1;
    }

    public final void b() {
        a();
        C5748gt1 c5748gt1 = this.g;
        if (c5748gt1.e.getAndSet(true)) {
            return;
        }
        c5748gt1.c(1);
        c5748gt1.b().postDelayed(c5748gt1.b, 30000L);
    }

    public final void c() {
        a();
        C5748gt1 c5748gt1 = this.g;
        if (c5748gt1.e.getAndSet(false)) {
            Handler b = c5748gt1.b();
            RunnableC5404ft1 runnableC5404ft1 = c5748gt1.b;
            b.removeCallbacks(runnableC5404ft1);
            c5748gt1.b().post(runnableC5404ft1);
        }
    }

    public final void a() {
        this.h.getClass();
        this.i.getClass();
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        a();
        WindowOnFrameMetricsAvailableListenerC9724sU0 windowOnFrameMetricsAvailableListenerC9724sU0 = this.a;
        if (i == 2 || i == 3) {
            b();
            a();
            windowOnFrameMetricsAvailableListenerC9724sU0.b.set(true);
        } else if (i == 4) {
            b();
            a();
            windowOnFrameMetricsAvailableListenerC9724sU0.b.set(false);
        } else {
            if (i != 5) {
                return;
            }
            a();
            windowOnFrameMetricsAvailableListenerC9724sU0.b.set(false);
            c();
        }
    }
}
