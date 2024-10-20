package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class P10 implements InterfaceC10537uq1 {
    public final /* synthetic */ Q10 a;

    public P10(Q10 q10) {
        this.a = q10;
    }

    @Override // defpackage.InterfaceC10537uq1
    public final void c(Bundle bundle) {
        Q10 q10 = this.a;
        Lock lock = q10.p;
        Lock lock2 = q10.p;
        lock.lock();
        try {
            q10.n = ConnectionResult.j;
            Q10.a(q10);
        } finally {
            lock2.unlock();
        }
    }

    @Override // defpackage.InterfaceC10537uq1
    public final void b(ConnectionResult connectionResult) {
        Q10 q10 = this.a;
        q10.p.lock();
        try {
            q10.n = connectionResult;
            Q10.a(q10);
        } finally {
            q10.p.unlock();
        }
    }

    @Override // defpackage.InterfaceC10537uq1
    public final void a(int i) {
        Q10 q10 = this.a;
        Lock lock = q10.p;
        Lock lock2 = q10.p;
        lock.lock();
        try {
            if (q10.o) {
                q10.o = false;
                q10.a.a(i);
                q10.n = null;
                q10.m = null;
                return;
            }
            q10.o = true;
            q10.g.e(i);
        } finally {
            lock2.unlock();
        }
    }
}
