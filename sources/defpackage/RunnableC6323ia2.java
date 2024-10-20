package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ia2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6323ia2 extends AtomicInteger implements AG2, Runnable {
    public final InterfaceC11128wa2 a;
    public final Object g;

    public RunnableC6323ia2(InterfaceC11128wa2 interfaceC11128wa2, Object obj) {
        this.a = interfaceC11128wa2;
        this.g = obj;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.InterfaceC3586ac3
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.g;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
        lazySet(3);
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        set(3);
    }

    @Override // defpackage.BG2
    public final int e(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.g;
            InterfaceC11128wa2 interfaceC11128wa2 = this.a;
            interfaceC11128wa2.d(obj);
            if (get() == 2) {
                lazySet(3);
                interfaceC11128wa2.b();
            }
        }
    }
}
