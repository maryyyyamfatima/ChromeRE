package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ea2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4947ea2 extends AtomicReference implements InterfaceC3573aa2 {
    public Z92 a;
    public int g;
    public final int h;

    @Override // defpackage.InterfaceC3573aa2
    public final void f(Throwable th) {
        Z92 z92 = new Z92(new W62(th));
        this.a.set(z92);
        this.a = z92;
        this.g++;
        c();
    }

    public C4947ea2(int i) {
        Z92 z92 = new Z92(null);
        this.a = z92;
        set(z92);
        this.h = i;
    }

    public final void c() {
        Z92 z92 = (Z92) get();
        if (z92.a != null) {
            Z92 z922 = new Z92(null);
            z922.lazySet((Z92) z92.get());
            set(z922);
        }
    }

    @Override // defpackage.InterfaceC3573aa2
    public final void b(Object obj) {
        Z92 z92 = new Z92(obj);
        this.a.set(z92);
        this.a = z92;
        int i = this.g + 1;
        this.g = i;
        if (i > this.h) {
            this.g--;
            set((Z92) ((Z92) get()).get());
        }
    }

    @Override // defpackage.InterfaceC3573aa2
    public final void a() {
        Z92 z92 = new Z92(X62.a);
        this.a.set(z92);
        this.a = z92;
        this.g++;
        c();
    }

    @Override // defpackage.InterfaceC3573aa2
    public final void d(Y92 y92) {
        if (y92.getAndIncrement() != 0) {
            return;
        }
        int i = 1;
        do {
            Z92 z92 = (Z92) y92.h;
            if (z92 == null) {
                z92 = (Z92) get();
                y92.h = z92;
            }
            while (!y92.i) {
                Z92 z922 = (Z92) z92.get();
                if (z922 != null) {
                    if (X62.a(y92.g, z922.a)) {
                        y92.h = null;
                        return;
                    }
                    z92 = z922;
                } else {
                    y92.h = z92;
                    i = y92.addAndGet(-i);
                }
            }
            y92.h = null;
            return;
        } while (i != 0);
    }
}
