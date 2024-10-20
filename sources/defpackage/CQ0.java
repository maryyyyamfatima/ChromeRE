package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CQ0 extends AtomicReference implements QQ0, InterfaceC6416iq0 {
    public final long a;
    public final DQ0 g;
    public final int h;
    public final int i;
    public volatile boolean j;
    public volatile InterfaceC3586ac3 k;
    public long l;
    public int m;

    public CQ0(DQ0 dq0, long j) {
        this.a = j;
        this.g = dq0;
        int i = dq0.j;
        this.i = i;
        this.h = i >> 2;
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void c(InterfaceC0724Fo3 interfaceC0724Fo3) {
        if (EnumC0854Go3.c(this, interfaceC0724Fo3)) {
            if (interfaceC0724Fo3 instanceof CG2) {
                CG2 cg2 = (CG2) interfaceC0724Fo3;
                int e = cg2.e(7);
                if (e == 1) {
                    this.m = e;
                    this.k = cg2;
                    this.j = true;
                    this.g.f();
                    return;
                }
                if (e == 2) {
                    this.m = e;
                    this.k = cg2;
                }
            }
            interfaceC0724Fo3.a(this.i);
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void d(Object obj) {
        if (this.m != 2) {
            DQ0 dq0 = this.g;
            if (dq0.get() == 0 && dq0.compareAndSet(0, 1)) {
                long j = dq0.p.get();
                InterfaceC3586ac3 interfaceC3586ac3 = this.k;
                if (j != 0 && (interfaceC3586ac3 == null || interfaceC3586ac3.isEmpty())) {
                    dq0.a.d(obj);
                    if (j != Long.MAX_VALUE) {
                        dq0.p.decrementAndGet();
                    }
                    a(1L);
                } else {
                    if (interfaceC3586ac3 == null && (interfaceC3586ac3 = this.k) == null) {
                        interfaceC3586ac3 = new C7058ki3(dq0.j);
                        this.k = interfaceC3586ac3;
                    }
                    if (!interfaceC3586ac3.offer(obj)) {
                        dq0.onError(new DX1("Inner queue full?!"));
                        return;
                    }
                }
                if (dq0.decrementAndGet() == 0) {
                    return;
                }
            } else {
                InterfaceC3586ac3 interfaceC3586ac32 = this.k;
                if (interfaceC3586ac32 == null) {
                    interfaceC3586ac32 = new C7058ki3(dq0.j);
                    this.k = interfaceC3586ac32;
                }
                if (!interfaceC3586ac32.offer(obj)) {
                    dq0.onError(new DX1("Inner queue full?!"));
                    return;
                } else if (dq0.getAndIncrement() != 0) {
                    return;
                }
            }
            dq0.g();
            return;
        }
        this.g.f();
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void onError(Throwable th) {
        lazySet(EnumC0854Go3.a);
        DQ0 dq0 = this.g;
        if (dq0.m.a(th)) {
            this.j = true;
            if (!dq0.h) {
                dq0.q.cancel();
                for (CQ0 cq0 : (CQ0[]) dq0.o.getAndSet(DQ0.x)) {
                    cq0.getClass();
                    EnumC0854Go3.b(cq0);
                }
            }
            dq0.f();
            return;
        }
        MR2.b(th);
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void b() {
        this.j = true;
        this.g.f();
    }

    public final void a(long j) {
        if (this.m != 1) {
            long j2 = this.l + j;
            if (j2 >= this.h) {
                this.l = 0L;
                ((InterfaceC0724Fo3) get()).a(j2);
            } else {
                this.l = j2;
            }
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        EnumC0854Go3.b(this);
    }
}
