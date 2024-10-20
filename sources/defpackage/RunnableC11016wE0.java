package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC11016wE0 extends AtomicBoolean implements Runnable, InterfaceC6416iq0 {
    public final Runnable a;

    public RunnableC11016wE0(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get()) {
            return;
        }
        try {
            this.a.run();
        } finally {
            lazySet(true);
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        lazySet(true);
    }
}
