package defpackage;

import android.app.Activity;
import android.os.Build;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: it1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6434it1 implements InterfaceC6092ht1 {
    public static final boolean c;
    public final C4030bt1 a;
    public final C5748gt1 b;

    static {
        c = Build.VERSION.SDK_INT >= 24;
    }

    public C6434it1(Activity activity) {
        if (!c) {
            this.a = null;
            this.b = null;
            return;
        }
        C10067tU0 c10067tU0 = new C10067tU0();
        WindowOnFrameMetricsAvailableListenerC9724sU0 windowOnFrameMetricsAvailableListenerC9724sU0 = new WindowOnFrameMetricsAvailableListenerC9724sU0(c10067tU0);
        C5748gt1 c5748gt1 = new C5748gt1(c10067tU0);
        this.b = c5748gt1;
        C4030bt1 c4030bt1 = new C4030bt1(activity, windowOnFrameMetricsAvailableListenerC9724sU0, c5748gt1);
        this.a = c4030bt1;
        c4030bt1.a();
        Activity activity2 = (Activity) c4030bt1.j.get();
        if (activity2 != null) {
            ApplicationStatus.e(c4030bt1, activity2);
            c4030bt1.o(activity2, ApplicationStatus.c(activity2));
            activity2.getWindow().addOnFrameMetricsAvailableListener(c4030bt1.a, c4030bt1.g.b());
        }
    }

    @Override // defpackage.InterfaceC6092ht1
    public final void a(int i) {
        if (c) {
            this.b.c(i);
        }
    }

    @Override // defpackage.InterfaceC6092ht1
    public final void b(int i) {
        if (c) {
            this.b.a(i);
        }
    }
}
