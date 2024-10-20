package defpackage;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z11 */
/* loaded from: classes.dex */
public final class C11972z11 implements InterfaceC6102hv {
    public final WeakReference a;
    public final C3588ad b;
    public final boolean c;

    public C11972z11(I11 i11, C3588ad c3588ad, boolean z) {
        this.a = new WeakReference(i11);
        this.b = c3588ad;
        this.c = z;
    }

    @Override // defpackage.InterfaceC6102hv
    public final void a(ConnectionResult connectionResult) {
        I11 i11 = (I11) this.a.get();
        if (i11 == null) {
            return;
        }
        Looper.myLooper();
        Looper looper = i11.a.s.g;
        Lock lock = i11.b;
        lock.lock();
        try {
            if (i11.g(0)) {
                if (!connectionResult.t1()) {
                    i11.m(connectionResult, this.b, this.c);
                }
                if (i11.l()) {
                    i11.n();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
