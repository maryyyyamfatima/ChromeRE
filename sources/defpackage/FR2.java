package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FR2 extends AtomicReference implements InterfaceC6416iq0 {
    public FR2(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + a() + ", " + String.valueOf(get()) + ")";
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        ((Runnable) andSet).run();
    }

    public final boolean a() {
        return get() == null;
    }
}
