package org.chromium.chrome.browser.offlinepages.prefetch;

import J.N;
import android.content.Context;
import defpackage.C1226Jl0;
import defpackage.InterfaceC2559Ts;
import defpackage.KF3;
import defpackage.N02;
import defpackage.S02;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PrefetchBackgroundTask extends S02 {
    public long f;
    public InterfaceC2559Ts g;
    public boolean h = true;
    public boolean i;

    @Override // defpackage.S02
    public final boolean i() {
        return true;
    }

    @Override // defpackage.S02
    public final int d(Context context, KF3 kf3, N02 n02) {
        this.g = n02;
        this.i = kf3.b.getBoolean("limitlessPrefetching");
        C1226Jl0 a = C1226Jl0.a(context);
        if ((!a.c && (a.a || a.b >= 50)) || this.i) {
            boolean z = this.i;
            int i = a.d;
            if (!z ? a.e || i != 2 : i == 6) {
                return 0;
            }
        }
        return 1;
    }

    @Override // defpackage.S02
    public final void e(Context context, KF3 kf3, InterfaceC2559Ts interfaceC2559Ts) {
        if (this.f != 0) {
            return;
        }
        N.M_yiIXuu(this);
    }

    @Override // defpackage.S02
    public final boolean f() {
        return this.h;
    }

    @Override // defpackage.S02
    public final boolean g(KF3 kf3) {
        long j = this.f;
        return j == 0 ? this.h : N.MgpkLR_Z(j, this);
    }

    @Override // defpackage.InterfaceC2689Us
    public final void a() {
        if (this.i) {
            PrefetchBackgroundTaskScheduler.scheduleTaskLimitless(0);
        } else {
            PrefetchBackgroundTaskScheduler.scheduleTask(0);
        }
    }

    public void setNativeTask(long j) {
        this.f = j;
    }

    public void doneProcessing(boolean z) {
        this.h = z;
        this.g.a(z);
        setNativeTask(0L);
    }
}
