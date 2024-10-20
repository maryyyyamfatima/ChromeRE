package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3809bF implements InterfaceC3465aF, Callback {
    public Callback a;
    public final /* synthetic */ C4496dF g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        ReentrantLock reentrantLock = this.g.b;
        reentrantLock.lock();
        try {
            Callback callback = this.a;
            if (callback != null) {
                callback.onResult(obj);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public C3809bF(C4496dF c4496dF, Callback callback) {
        this.g = c4496dF;
        this.a = callback;
    }

    @Override // defpackage.InterfaceC3465aF
    public final void cancel() {
        this.a = null;
    }
}
