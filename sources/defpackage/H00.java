package defpackage;

import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H00 implements Callable {
    public final /* synthetic */ I00 a;

    public H00(I00 i00) {
        this.a = i00;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C0772Fy1 c0772Fy1;
        synchronized (this.a) {
            c0772Fy1 = null;
            if (!this.a.n) {
                C0772Fy1 a = I00.a(this.a);
                synchronized (this.a) {
                    if (!this.a.n) {
                        c0772Fy1 = a;
                    }
                }
            }
        }
        return c0772Fy1;
    }
}
