package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class W92 extends X82 {
    public final A30 a;
    public final int g;
    public U92 h;

    public W92(C5979ha2 c5979ha2) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.a = c5979ha2;
        this.g = 1;
    }

    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        U92 u92;
        boolean z;
        C4260ca2 c4260ca2;
        boolean z2;
        synchronized (this) {
            u92 = this.h;
            if (u92 == null) {
                u92 = new U92(this);
                this.h = u92;
            }
            long j = u92.g;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            long j2 = j + 1;
            u92.g = j2;
            if (u92.h || j2 != this.g) {
                z = false;
            } else {
                u92.h = true;
                z = true;
            }
        }
        this.a.a(new V92(interfaceC11128wa2, this, u92));
        if (z) {
            C5979ha2 c5979ha2 = (C5979ha2) this.a;
            while (true) {
                AtomicReference atomicReference = c5979ha2.g;
                c4260ca2 = (C4260ca2) atomicReference.get();
                if (c4260ca2 != null && !c4260ca2.a()) {
                    break;
                }
                C4260ca2 c4260ca22 = new C4260ca2(c5979ha2.h.call());
                while (true) {
                    if (atomicReference.compareAndSet(c4260ca2, c4260ca22)) {
                        z2 = true;
                        break;
                    } else if (atomicReference.get() != c4260ca2) {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    c4260ca2 = c4260ca22;
                    break;
                }
            }
            boolean z3 = c4260ca2.i.get();
            AtomicBoolean atomicBoolean = c4260ca2.i;
            boolean z4 = !z3 && atomicBoolean.compareAndSet(false, true);
            try {
                u92.accept(c4260ca2);
                if (z4) {
                    c5979ha2.a.a(c4260ca2);
                }
            } catch (Throwable th) {
                if (z4) {
                    atomicBoolean.compareAndSet(true, false);
                }
                AbstractC4148cE0.a(th);
                throw ZD0.a(th);
            }
        }
    }

    public final void j(U92 u92) {
        synchronized (this) {
            try {
                U92 u922 = this.h;
                if (u922 != null && u922 == u92) {
                    u92.getClass();
                    long j = u92.g - 1;
                    u92.g = j;
                    if (j == 0) {
                        this.h = null;
                        Object obj = this.a;
                        if (obj instanceof InterfaceC6416iq0) {
                            ((InterfaceC6416iq0) obj).dispose();
                        } else if (obj instanceof InterfaceC11754yO2) {
                            ((C5979ha2) ((InterfaceC11754yO2) obj)).e((InterfaceC6416iq0) u92.get());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(U92 u92) {
        synchronized (this) {
            if (u92.g == 0 && u92 == this.h) {
                this.h = null;
                InterfaceC6416iq0 interfaceC6416iq0 = (InterfaceC6416iq0) u92.get();
                EnumC7791mq0.a(u92);
                Object obj = this.a;
                if (obj instanceof InterfaceC6416iq0) {
                    ((InterfaceC6416iq0) obj).dispose();
                } else if (obj instanceof InterfaceC11754yO2) {
                    if (interfaceC6416iq0 == null) {
                        u92.i = true;
                    } else {
                        ((C5979ha2) ((InterfaceC11754yO2) obj)).e(interfaceC6416iq0);
                    }
                }
            }
        }
    }
}
