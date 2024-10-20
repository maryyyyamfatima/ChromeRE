package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.gcm.Task;
import org.chromium.base.ThreadUtils;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ot */
/* loaded from: classes2.dex */
public final class C8496ot implements InterfaceC7120kt {
    static {
        new C3339Zs();
    }

    public static Task c(TaskInfo taskInfo) {
        Bundle bundle = new Bundle();
        bundle.putBundle("_background_task_extras", taskInfo.b);
        C8152nt c8152nt = new C8152nt(bundle);
        taskInfo.g.a(c8152nt);
        AbstractC4500dF3 abstractC4500dF3 = c8152nt.a;
        AbstractC4500dF3 c = abstractC4500dF3.c(taskInfo.e);
        int i = taskInfo.c;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 0;
            } else if (i == 2) {
                i2 = 1;
            }
        }
        c.d(i2).e(taskInfo.d).f().g(Integer.toString(taskInfo.a)).h(taskInfo.f);
        return abstractC4500dF3.a();
    }

    @Override // defpackage.InterfaceC7120kt
    public final boolean b(Context context, TaskInfo taskInfo) {
        C11111wX0 c11111wX0;
        Object obj = ThreadUtils.a;
        if (VR.a(context)) {
            synchronized (C11111wX0.class) {
                if (C11111wX0.c == null) {
                    C11111wX0.c = new C11111wX0(context.getApplicationContext());
                }
                c11111wX0 = C11111wX0.c;
            }
        } else {
            c11111wX0 = null;
        }
        if (c11111wX0 == null) {
            AbstractC4851eH1.a("BkgrdTaskSchedGcmNM", "GcmNetworkManager is not available.", new Object[0]);
            return false;
        }
        try {
            c11111wX0.f(c(taskInfo));
            return true;
        } catch (IllegalArgumentException e) {
            AbstractC4851eH1.a("BkgrdTaskSchedGcmNM", AbstractC4809e90.a("GcmNetworkManager failed to schedule task, gcm message: ", e.getMessage() == null ? "null." : e.getMessage()), new Object[0]);
            return false;
        }
    }

    @Override // defpackage.InterfaceC7120kt
    public final void a(Context context, int i) {
        C11111wX0 c11111wX0;
        Object obj = ThreadUtils.a;
        if (VR.a(context)) {
            synchronized (C11111wX0.class) {
                if (C11111wX0.c == null) {
                    C11111wX0.c = new C11111wX0(context.getApplicationContext());
                }
                c11111wX0 = C11111wX0.c;
            }
        } else {
            c11111wX0 = null;
        }
        if (c11111wX0 == null) {
            AbstractC4851eH1.a("BkgrdTaskSchedGcmNM", "GcmNetworkManager is not available.", new Object[0]);
            return;
        }
        try {
            c11111wX0.b(Integer.toString(i));
        } catch (IllegalArgumentException unused) {
            AbstractC4851eH1.a("BkgrdTaskSchedGcmNM", "GcmNetworkManager failed to cancel task.", new Object[0]);
        }
    }
}
