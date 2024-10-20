package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9448rg1 implements Runnable {
    public final /* synthetic */ C9791sg1 a;
    public final /* synthetic */ boolean g;

    public /* synthetic */ RunnableC9448rg1(C9791sg1 c9791sg1, boolean z) {
        this.a = c9791sg1;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.g;
        C9791sg1 c9791sg1 = this.a;
        AtomicBoolean atomicBoolean = c9791sg1.b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            try {
                c9791sg1.a(z);
            } catch (Exception e) {
                Log.getStackTraceString(e);
            }
        } finally {
            EI2.j(SystemClock.elapsedRealtime() - elapsedRealtime, "Search.HistoryReport.FirebaseIndexing.Time");
            atomicBoolean.set(false);
        }
    }
}
