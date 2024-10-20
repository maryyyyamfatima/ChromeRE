package defpackage;

import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: np0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC8129np0 implements Callable {
    public final /* synthetic */ C9844sp0 a;

    public CallableC8129np0(C9844sp0 c9844sp0) {
        this.a = c9844sp0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.a) {
            C9844sp0 c9844sp0 = this.a;
            if (c9844sp0.n == null) {
                return null;
            }
            c9844sp0.F();
            if (this.a.j()) {
                this.a.y();
                this.a.p = 0;
            }
            return null;
        }
    }
}
