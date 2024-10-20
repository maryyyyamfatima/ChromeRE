package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CW2 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = new ArrayList(DW2.d.keySet()).iterator();
        while (it.hasNext()) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
            if (scheduledThreadPoolExecutor.isShutdown()) {
                DW2.d.remove(scheduledThreadPoolExecutor);
            } else {
                scheduledThreadPoolExecutor.purge();
            }
        }
    }
}
