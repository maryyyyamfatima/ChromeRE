package defpackage;

import android.content.Context;
import android.os.SystemClock;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ys, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3209Ys implements InterfaceC2559Ts {
    public final Context a;
    public final KF3 b;
    public final InterfaceC2689Us c;
    public final long d = SystemClock.uptimeMillis();
    public boolean e;

    public C3209Ys(Context context, KF3 kf3, InterfaceC2689Us interfaceC2689Us) {
        this.a = context;
        this.b = kf3;
        this.c = interfaceC2689Us;
    }

    @Override // defpackage.InterfaceC2559Ts
    public final void a(final boolean z) {
        PostTask.c(AbstractC5103f04.b, new Runnable() { // from class: Xs
            @Override // java.lang.Runnable
            public final void run() {
                C3209Ys c3209Ys = C3209Ys.this;
                c3209Ys.getClass();
                Object obj = ThreadUtils.a;
                if (c3209Ys.e) {
                    return;
                }
                c3209Ys.e = true;
                if (z) {
                    C0225Bt.c().getClass();
                    C0225Bt.b(0, "Android.BackgroundTaskScheduler.TaskRescheduled");
                    c3209Ys.c.a();
                }
                C0225Bt c = C0225Bt.c();
                int i = c3209Ys.b.a;
                long uptimeMillis = SystemClock.uptimeMillis() - c3209Ys.d;
                c.getClass();
                C0225Bt.d(i, uptimeMillis);
            }
        });
    }
}
