package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0965Hl extends AtomicReference {
    public final boolean a(Throwable th) {
        boolean z;
        YD0 yd0 = ZD0.a;
        do {
            Throwable th2 = (Throwable) get();
            z = false;
            if (th2 == ZD0.a) {
                return false;
            }
            Throwable m10 = th2 == null ? th : new M10(th2, th);
            while (true) {
                if (compareAndSet(th2, m10)) {
                    z = true;
                    break;
                }
                if (get() != th2) {
                    break;
                }
            }
        } while (!z);
        return true;
    }

    public final Throwable b() {
        YD0 yd0 = ZD0.a;
        Throwable th = (Throwable) get();
        YD0 yd02 = ZD0.a;
        return th != yd02 ? (Throwable) getAndSet(yd02) : th;
    }
}
