package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b43, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3752b43 implements InterfaceC6554jE1 {
    public final InterfaceC6554jE1 a;
    public final ArrayDeque g = new ArrayDeque();
    public int h = 1;
    public long i = 0;
    public final Z33 j = new Z33(this);

    @Override // defpackage.InterfaceC6554jE1
    public final void a() {
    }

    public C3752b43(InterfaceC6554jE1 interfaceC6554jE1) {
        this.a = interfaceC6554jE1;
    }

    @Override // defpackage.InterfaceC6554jE1
    public final void b(Runnable runnable, String str) {
        if (runnable == null) {
            return;
        }
        synchronized (this.g) {
            int i = this.h;
            if (i != 4 && i != 3) {
                long j = this.i;
                Y33 y33 = new Y33(runnable);
                this.g.add(y33);
                this.h = 2;
                try {
                    this.a.b(this.j, str);
                    if (this.h != 2) {
                        return;
                    }
                    synchronized (this.g) {
                        if (this.i == j && this.h == 2) {
                            this.h = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.g) {
                        int i2 = this.h;
                        if ((i2 != 1 && i2 != 2) || !this.g.removeLastOccurrence(y33)) {
                            r0 = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || r0) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.g.add(runnable);
        }
    }

    @Override // defpackage.InterfaceC6554jE1
    public final void c(Runnable runnable) {
        if (this.g.isEmpty()) {
            return;
        }
        synchronized (this.g) {
            this.g.remove(runnable);
        }
    }

    public final String toString() {
        return "SequentialLithoHandler@" + System.identityHashCode(this) + "{" + String.valueOf(this.a) + "}";
    }
}
