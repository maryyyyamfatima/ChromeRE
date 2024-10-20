package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A92 extends AtomicInteger implements InterfaceC6416iq0, InterfaceC11128wa2 {
    public final InterfaceC10434uZ a;
    public final DV0 h;
    public final boolean i;
    public InterfaceC6416iq0 k;
    public volatile boolean l;
    public final C0965Hl g = new C0965Hl();
    public final H10 j = new H10();

    public A92(InterfaceC10434uZ interfaceC10434uZ, DV0 dv0, boolean z) {
        this.a = interfaceC10434uZ;
        this.h = dv0;
        this.i = z;
        lazySet(1);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.g(this.k, interfaceC6416iq0)) {
            this.k = interfaceC6416iq0;
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        try {
            AZ az = (AZ) this.h.apply(obj);
            Q82.a(az, "The mapper returned a null CompletableSource");
            getAndIncrement();
            C12021z92 c12021z92 = new C12021z92(this);
            if (this.l || !this.j.a(c12021z92)) {
                return;
            }
            az.b(c12021z92);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            this.k.dispose();
            onError(th);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        C0965Hl c0965Hl = this.g;
        if (c0965Hl.a(th)) {
            boolean z = this.i;
            InterfaceC10434uZ interfaceC10434uZ = this.a;
            if (z) {
                if (decrementAndGet() == 0) {
                    interfaceC10434uZ.onError(c0965Hl.b());
                    return;
                }
                return;
            } else {
                dispose();
                if (getAndSet(0) > 0) {
                    interfaceC10434uZ.onError(c0965Hl.b());
                    return;
                }
                return;
            }
        }
        MR2.b(th);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        if (decrementAndGet() == 0) {
            Throwable b = this.g.b();
            InterfaceC10434uZ interfaceC10434uZ = this.a;
            if (b != null) {
                interfaceC10434uZ.onError(b);
            } else {
                interfaceC10434uZ.b();
            }
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.l = true;
        this.k.dispose();
        this.j.dispose();
    }
}
