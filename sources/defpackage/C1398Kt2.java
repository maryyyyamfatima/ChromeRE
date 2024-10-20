package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kt2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1398Kt2 {
    public static boolean d;
    public final InterfaceC0209Bp3 a;
    public final int b;
    public final InterfaceC0209Bp3 c;

    public C1398Kt2(InterfaceC0209Bp3 interfaceC0209Bp3) {
        InterfaceC0209Bp3 interfaceC0209Bp32 = new InterfaceC0209Bp3() { // from class: It2
            @Override // defpackage.InterfaceC0209Bp3
            public final Object get() {
                boolean z;
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    Log.i("PhenotypeProcessReaper", "Memory state is: " + runningAppProcessInfo.importance);
                } catch (RuntimeException e) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                }
                if (runningAppProcessInfo.importance >= 400) {
                    z = true;
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            }
        };
        this.a = interfaceC0209Bp3;
        this.b = Math.max(5, 10);
        this.c = interfaceC0209Bp32;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Ht2] */
    public final void a() {
        synchronized (C1398Kt2.class) {
            if (!d) {
                ?? r3 = new Runnable() { // from class: Ht2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (((Boolean) C1398Kt2.this.c.get()).booleanValue()) {
                            Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                            Process.killProcess(Process.myPid());
                            System.exit(0);
                        }
                    }
                };
                long j = this.b;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                InterfaceScheduledExecutorServiceC4493dE1 interfaceScheduledExecutorServiceC4493dE1 = (InterfaceScheduledExecutorServiceC4493dE1) this.a.get();
                RY1 schedule = ((SY1) interfaceScheduledExecutorServiceC4493dE1).schedule(new RunnableC1268Jt2(r3, interfaceScheduledExecutorServiceC4493dE1, j, timeUnit), j, timeUnit);
                schedule.f(new RunnableC10556ut2(schedule), EnumC6747jo0.a);
                d = true;
            }
        }
    }
}
