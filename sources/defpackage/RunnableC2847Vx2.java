package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vx2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2847Vx2 implements Runnable {
    public final Handler a = new Handler(Looper.getMainLooper());
    public int g = 0;

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g != 1) {
            return;
        }
        this.g = 3;
        Context context = V60.a;
        Object obj = C3929bc2.l;
        long max = Math.max(0L, 0L);
        AbstractC7808mt.b().b(context, TaskInfo.a(71300, max, max).a());
    }
}
