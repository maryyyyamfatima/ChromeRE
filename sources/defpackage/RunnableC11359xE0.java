package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC11359xE0 extends AtomicInteger implements Runnable, InterfaceC6416iq0 {
    public final Runnable a;
    public final InterfaceC7103kq0 g;
    public volatile Thread h;

    public RunnableC11359xE0(Runnable runnable, H10 h10) {
        this.a = runnable;
        this.g = h10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0) {
            this.h = Thread.currentThread();
            if (compareAndSet(0, 1)) {
                try {
                    this.a.run();
                    this.h = null;
                    if (!compareAndSet(1, 2)) {
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                        return;
                    } else {
                        InterfaceC7103kq0 interfaceC7103kq0 = this.g;
                        if (interfaceC7103kq0 != null) {
                            interfaceC7103kq0.c(this);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    this.h = null;
                    if (!compareAndSet(1, 2)) {
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } else {
                        InterfaceC7103kq0 interfaceC7103kq02 = this.g;
                        if (interfaceC7103kq02 != null) {
                            interfaceC7103kq02.c(this);
                        }
                    }
                    throw th;
                }
            }
            this.h = null;
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        while (true) {
            int i = get();
            if (i >= 2) {
                return;
            }
            if (i == 0) {
                if (compareAndSet(0, 4)) {
                    InterfaceC7103kq0 interfaceC7103kq0 = this.g;
                    if (interfaceC7103kq0 != null) {
                        interfaceC7103kq0.c(this);
                        return;
                    }
                    return;
                }
            } else if (compareAndSet(1, 3)) {
                Thread thread = this.h;
                if (thread != null) {
                    thread.interrupt();
                    this.h = null;
                }
                set(4);
                InterfaceC7103kq0 interfaceC7103kq02 = this.g;
                if (interfaceC7103kq02 != null) {
                    interfaceC7103kq02.c(this);
                    return;
                }
                return;
            }
        }
    }
}
