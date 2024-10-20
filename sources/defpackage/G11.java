package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G11 implements InterfaceC9914t11, InterfaceC10257u11 {
    public final /* synthetic */ I11 a;

    @Override // defpackage.C30
    public final void e(int i) {
    }

    public G11(I11 i11) {
        this.a = i11;
    }

    @Override // defpackage.C30
    public final void h(Bundle bundle) {
        I11 i11 = this.a;
        if (i11.r.i) {
            i11.b.lock();
            try {
                InterfaceC3918ba3 interfaceC3918ba3 = i11.k;
                if (interfaceC3918ba3 == null) {
                    return;
                }
                ((C4261ca3) interfaceC3918ba3).z(new F11(i11));
                return;
            } finally {
                i11.b.unlock();
            }
        }
        ((C4261ca3) i11.k).z(new F11(i11));
    }

    @Override // defpackage.InterfaceC1962Pc2
    public final void M0(ConnectionResult connectionResult) {
        I11 i11 = this.a;
        Lock lock = i11.b;
        Lock lock2 = i11.b;
        lock.lock();
        try {
            if (i11.l && !connectionResult.s1()) {
                i11.f();
                i11.n();
            } else {
                i11.k(connectionResult);
            }
            lock2.unlock();
        } catch (Throwable th) {
            lock2.unlock();
            throw th;
        }
    }
}
