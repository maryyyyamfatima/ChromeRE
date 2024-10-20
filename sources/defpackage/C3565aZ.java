package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aZ */
/* loaded from: classes.dex */
public final class C3565aZ extends AtomicInteger implements QQ0, InterfaceC6416iq0 {
    public final InterfaceC10434uZ a;
    public final int g;
    public final int h;
    public final ZY i = new ZY(this);
    public final AtomicBoolean j = new AtomicBoolean();
    public int k;
    public int l;
    public InterfaceC3586ac3 m;
    public InterfaceC0724Fo3 n;
    public volatile boolean o;
    public volatile boolean p;

    @Override // defpackage.InterfaceC0334Co3
    public final void d(Object obj) {
        AZ az = (AZ) obj;
        if (this.k == 0 && !this.m.offer(az)) {
            onError(new DX1());
        } else {
            a();
        }
    }

    public C3565aZ(InterfaceC10434uZ interfaceC10434uZ, int i) {
        this.a = interfaceC10434uZ;
        this.g = i;
        this.h = i - (i >> 2);
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void c(InterfaceC0724Fo3 interfaceC0724Fo3) {
        if (EnumC0854Go3.e(this.n, interfaceC0724Fo3)) {
            this.n = interfaceC0724Fo3;
            int i = this.g;
            long j = i == Integer.MAX_VALUE ? Long.MAX_VALUE : i;
            if (interfaceC0724Fo3 instanceof CG2) {
                CG2 cg2 = (CG2) interfaceC0724Fo3;
                int e = cg2.e(3);
                if (e == 1) {
                    this.k = e;
                    this.m = cg2;
                    this.o = true;
                    this.a.c(this);
                    a();
                    return;
                }
                if (e == 2) {
                    this.k = e;
                    this.m = cg2;
                    this.a.c(this);
                    interfaceC0724Fo3.a(j);
                    return;
                }
            }
            if (this.g == Integer.MAX_VALUE) {
                this.m = new C7402li3(BQ0.a);
            } else {
                this.m = new C7058ki3(this.g);
            }
            this.a.c(this);
            interfaceC0724Fo3.a(j);
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void onError(Throwable th) {
        if (this.j.compareAndSet(false, true)) {
            EnumC7791mq0.a(this.i);
            this.a.onError(th);
        } else {
            MR2.b(th);
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void b() {
        this.o = true;
        a();
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.n.cancel();
        EnumC7791mq0.a(this.i);
    }

    public final boolean e() {
        return EnumC7791mq0.b((InterfaceC6416iq0) this.i.get());
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!e()) {
            if (!this.p) {
                boolean z = this.o;
                try {
                    AZ az = (AZ) this.m.poll();
                    boolean z2 = az == null;
                    if (z && z2) {
                        if (this.j.compareAndSet(false, true)) {
                            this.a.b();
                            return;
                        }
                        return;
                    } else if (!z2) {
                        this.p = true;
                        az.b(this.i);
                        if (this.k != 1) {
                            int i = this.l + 1;
                            if (i == this.h) {
                                this.l = 0;
                                this.n.a(i);
                            } else {
                                this.l = i;
                            }
                        }
                    }
                } catch (Throwable th) {
                    AbstractC4148cE0.a(th);
                    if (this.j.compareAndSet(false, true)) {
                        this.n.cancel();
                        this.a.onError(th);
                        return;
                    } else {
                        MR2.b(th);
                        return;
                    }
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }
}
