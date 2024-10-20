package defpackage;

import android.content.Context;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rt */
/* loaded from: classes2.dex */
public final class C9524rt {
    public final InterfaceC7120kt a;
    public final InterfaceC7120kt b;

    public C9524rt(InterfaceC7120kt interfaceC7120kt, C6776jt c6776jt) {
        this.a = interfaceC7120kt;
        this.b = c6776jt;
    }

    public final boolean b(Context context, TaskInfo taskInfo) {
        if (AX.e().g("ignore-background-tasks")) {
            return true;
        }
        int i = taskInfo.a;
        TaskInfo.TimingInfo timingInfo = taskInfo.g;
        TraceEvent i2 = TraceEvent.i("BackgroundTaskScheduler.schedule", Integer.toString(i));
        try {
            Object obj = ThreadUtils.a;
            C9182qt c9182qt = new C9182qt(this, context, taskInfo);
            timingInfo.a(c9182qt);
            boolean z = c9182qt.c;
            C0225Bt c = C0225Bt.c();
            int i3 = taskInfo.a;
            if (z) {
                int a = AbstractC7464lt.a(i3);
                c.getClass();
                C0225Bt.b(a, "Android.BackgroundTaskScheduler.TaskScheduled.Success");
            } else {
                int a2 = AbstractC7464lt.a(i3);
                c.getClass();
                C0225Bt.b(a2, "Android.BackgroundTaskScheduler.TaskScheduled.Failure");
            }
            timingInfo.a(new C8839pt(i3));
            if (z) {
                AbstractC12268zt.a(taskInfo);
            }
            if (i2 != null) {
                i2.close();
            }
            return z;
        } catch (Throwable th) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public final void a(Context context, int i) {
        TraceEvent i2 = TraceEvent.i("BackgroundTaskScheduler.cancel", Integer.toString(i));
        try {
            Object obj = ThreadUtils.a;
            C0225Bt c = C0225Bt.c();
            int a = AbstractC7464lt.a(i);
            c.getClass();
            C0225Bt.b(a, "Android.BackgroundTaskScheduler.TaskCanceled");
            C8365oW2 b = AbstractC12268zt.b(i);
            AbstractC12268zt.g(i);
            char c2 = 0;
            if (b == null) {
                AbstractC4851eH1.a("BkgrdTaskScheduler", "Task cannot be canceled because no data was found instorage or data was invalid", new Object[0]);
                if (i2 != null) {
                    i2.close();
                    return;
                }
                return;
            }
            int i3 = b.j;
            if (i3 == 0) {
                c2 = 1;
            } else if (i3 == 1) {
                c2 = 2;
            } else if (i3 == 2) {
                c2 = 3;
            }
            if (c2 == 0) {
                c2 = 4;
            }
            if (c2 == 3) {
                this.b.a(context, i);
            } else {
                this.a.a(context, i);
            }
            if (i2 != null) {
                i2.close();
            }
        } catch (Throwable th) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
