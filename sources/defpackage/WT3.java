package defpackage;

import J.N;
import android.content.res.Resources;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WT3 implements MessageQueue.IdleHandler {
    public static boolean b;
    public static WT3 c;
    public long a;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.a;
        if (j != 0 && elapsedRealtime - j <= 1000) {
            return true;
        }
        this.a = elapsedRealtime;
        N.Ml5G_GLY();
        return true;
    }

    public static void b() {
        if (ThreadUtils.h()) {
            if (N.MnfJQqTB()) {
                if (c == null) {
                    c = new WT3();
                }
                if (b) {
                    return;
                }
                Looper.myQueue().addIdleHandler(c);
                b = true;
                return;
            }
            if (c == null || !b) {
                return;
            }
            Looper.myQueue().removeIdleHandler(c);
            b = false;
            return;
        }
        ThreadUtils.d(new Runnable() { // from class: VT3
            @Override // java.lang.Runnable
            public final void run() {
                WT3.b();
            }
        });
    }

    public static void a(int i, View view, long j) {
        String str;
        Object obj = ThreadUtils.a;
        int id = view.getId();
        try {
            if (view.getResources() != null) {
                str = id != 0 ? view.getResources().getResourceName(id) : "__no_id__";
            } else {
                str = "__no_resources__";
            }
        } catch (Resources.NotFoundException unused) {
            str = "__name_not_found__";
        }
        N.MmnP6i1r(id, i, view.isShown(), view.isDirty(), view.getClass().getSimpleName(), str, j);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                a(id, viewGroup.getChildAt(i2), j);
            }
        }
    }
}
