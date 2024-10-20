package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class D92 extends AtomicInteger implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public final InterfaceC11128wa2 a;
    public final boolean g;
    public final DV0 k;
    public InterfaceC6416iq0 m;
    public volatile boolean n;
    public final H10 h = new H10();
    public final C0965Hl j = new C0965Hl();
    public final AtomicInteger i = new AtomicInteger(1);
    public final AtomicReference l = new AtomicReference();

    public D92(InterfaceC11128wa2 interfaceC11128wa2, DV0 dv0, boolean z) {
        this.a = interfaceC11128wa2;
        this.k = dv0;
        this.g = z;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.g(this.m, interfaceC6416iq0)) {
            this.m = interfaceC6416iq0;
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        try {
            AbstractC6336ic3 abstractC6336ic3 = (AbstractC6336ic3) this.k.apply(obj);
            Q82.a(abstractC6336ic3, "The mapper returned a null SingleSource");
            this.i.getAndIncrement();
            C92 c92 = new C92(this);
            if (this.n || !this.h.a(c92)) {
                return;
            }
            abstractC6336ic3.b(c92);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            this.m.dispose();
            onError(th);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        this.i.decrementAndGet();
        if (this.j.a(th)) {
            if (!this.g) {
                this.h.dispose();
            }
            a();
            return;
        }
        MR2.b(th);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        this.i.decrementAndGet();
        a();
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.n = true;
        this.m.dispose();
        this.h.dispose();
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            e();
        }
    }

    public final void e() {
        InterfaceC11128wa2 interfaceC11128wa2 = this.a;
        AtomicInteger atomicInteger = this.i;
        AtomicReference atomicReference = this.l;
        int i = 1;
        while (!this.n) {
            if (!this.g && ((Throwable) this.j.get()) != null) {
                Throwable b = this.j.b();
                C7402li3 c7402li3 = (C7402li3) this.l.get();
                if (c7402li3 != null) {
                    c7402li3.clear();
                }
                interfaceC11128wa2.onError(b);
                return;
            }
            boolean z = atomicInteger.get() == 0;
            C7402li3 c7402li32 = (C7402li3) atomicReference.get();
            Object poll = c7402li32 != null ? c7402li32.poll() : null;
            boolean z2 = poll == null;
            if (z && z2) {
                Throwable b2 = this.j.b();
                if (b2 != null) {
                    interfaceC11128wa2.onError(b2);
                    return;
                } else {
                    interfaceC11128wa2.b();
                    return;
                }
            }
            if (!z2) {
                interfaceC11128wa2.d(poll);
            } else {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
        C7402li3 c7402li33 = (C7402li3) this.l.get();
        if (c7402li33 != null) {
            c7402li33.clear();
        }
    }
}
