package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ma2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1562Ma2 implements InterfaceC4436d40, InterfaceC11522xj {
    public C4779e40 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final Callback m;
    public final Callback n;
    public long p;
    public long q;
    public boolean r;
    public long s;
    public int o = ApplicationStatus.getStateForApplication();
    public final Handler k = new Handler();
    public final long a = 10000;
    public final RunnableC1433La2 l = new RunnableC1433La2(this);

    public C1562Ma2(C1952Pa2 c1952Pa2, C2082Qa2 c2082Qa2) {
        this.m = c1952Pa2;
        this.n = c2082Qa2;
        ApplicationStatus.d(this);
        if (this.o == 1) {
            this.p = SystemClock.elapsedRealtime();
        }
        this.g = new C4779e40(this, "OfflineDetector");
    }

    @Override // defpackage.InterfaceC4436d40
    public final void c(int i) {
        boolean z = this.j;
        boolean z2 = i != 4;
        this.j = z2;
        if (this.r && z == z2) {
            return;
        }
        if (z2) {
            this.q = SystemClock.elapsedRealtime();
        }
        if ((this.r && !z) || !this.j) {
            this.s = SystemClock.elapsedRealtime();
        }
        this.r = true;
        a();
    }

    @Override // defpackage.InterfaceC11522xj
    public final void n(int i) {
        if (this.o == i) {
            return;
        }
        this.o = i;
        this.n.onResult(Boolean.valueOf(i == 1));
        if (this.o == 1) {
            this.p = SystemClock.elapsedRealtime();
        }
        a();
    }

    public final void a() {
        Handler handler = this.k;
        RunnableC1433La2 runnableC1433La2 = this.l;
        handler.removeCallbacks(runnableC1433La2);
        if (this.o != 1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.p;
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.q;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        long j = this.s;
        long j2 = elapsedRealtime3 - j;
        long j3 = 2000 - elapsedRealtime;
        long j4 = 2000 - elapsedRealtime2;
        long j5 = j > 0 ? this.a - j2 : 0L;
        AbstractC4851eH1.d("OfflineDetector", "Running updateState mConnectivityDetectorInitialized: %b, mTimeWhenLastForegrounded: %d, getElapsedTime: %d, mTimeWhenLastOfflineNotificationReceived: %d, mTimeWhenLastOnline: %d, mApplicationState: %d, mIsOfflineLastReportedByConnectivityDetector: %b, mIsEffectivelyOffline: %b", Boolean.valueOf(this.r), Long.valueOf(this.p), Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(this.q), Long.valueOf(this.s), Integer.valueOf(this.o), Boolean.valueOf(this.j), Boolean.valueOf(this.h));
        AbstractC4851eH1.d("OfflineDetector", "updateState(): timeSinceLastForeground: %d, timeSinceOfflineNotificationReceived: %d, timeSinceLastOnline: %d, timeNeededForForeground: %d, timeNeededForOffline: %d", Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4));
        if (!this.j || (j3 <= 0 && j4 <= 0 && j5 <= 0)) {
            runnableC1433La2.run();
        } else {
            handler.postDelayed(runnableC1433La2, Math.max(Math.max(j3, j4), j5));
        }
    }
}
