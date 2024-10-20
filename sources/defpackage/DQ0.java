package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DQ0 extends AtomicInteger implements QQ0, InterfaceC0724Fo3 {
    public static final CQ0[] w = new CQ0[0];
    public static final CQ0[] x = new CQ0[0];
    public final InterfaceC0334Co3 a;
    public final DV0 g;
    public final boolean h;
    public final int i;
    public final int j;
    public volatile InterfaceC3258Zb3 k;
    public volatile boolean l;
    public final C0965Hl m = new C0965Hl();
    public volatile boolean n;
    public final AtomicReference o;
    public final AtomicLong p;
    public InterfaceC0724Fo3 q;
    public long r;
    public long s;
    public int t;
    public int u;
    public final int v;

    public DQ0(InterfaceC0334Co3 interfaceC0334Co3, DV0 dv0, boolean z, int i, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        this.o = atomicReference;
        this.p = new AtomicLong();
        this.a = interfaceC0334Co3;
        this.g = dv0;
        this.h = z;
        this.i = i;
        this.j = i2;
        this.v = Math.max(1, i >> 1);
        atomicReference.lazySet(w);
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void c(InterfaceC0724Fo3 interfaceC0724Fo3) {
        if (EnumC0854Go3.e(this.q, interfaceC0724Fo3)) {
            this.q = interfaceC0724Fo3;
            this.a.c(this);
            if (this.n) {
                return;
            }
            int i = this.i;
            if (i == Integer.MAX_VALUE) {
                interfaceC0724Fo3.a(Long.MAX_VALUE);
            } else {
                interfaceC0724Fo3.a(i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC0334Co3
    public final void d(Object obj) {
        boolean z;
        if (this.l) {
            return;
        }
        try {
            RE2 re2 = (RE2) this.g.apply(obj);
            Q82.a(re2, "The mapper returned a null Publisher");
            boolean z2 = true;
            if (re2 instanceof Callable) {
                try {
                    Object call = ((Callable) re2).call();
                    if (call == null) {
                        if (this.i == Integer.MAX_VALUE || this.n) {
                            return;
                        }
                        int i = this.u + 1;
                        this.u = i;
                        int i2 = this.v;
                        if (i == i2) {
                            this.u = 0;
                            this.q.a(i2);
                            return;
                        }
                        return;
                    }
                    if (get() == 0 && compareAndSet(0, 1)) {
                        long j = this.p.get();
                        InterfaceC3258Zb3 interfaceC3258Zb3 = this.k;
                        if (j != 0 && (interfaceC3258Zb3 == null || interfaceC3258Zb3.isEmpty())) {
                            this.a.d(call);
                            if (j != Long.MAX_VALUE) {
                                this.p.decrementAndGet();
                            }
                            if (this.i != Integer.MAX_VALUE && !this.n) {
                                int i3 = this.u + 1;
                                this.u = i3;
                                int i4 = this.v;
                                if (i3 == i4) {
                                    this.u = 0;
                                    this.q.a(i4);
                                }
                            }
                        } else {
                            if (interfaceC3258Zb3 == null) {
                                interfaceC3258Zb3 = h();
                            }
                            if (!interfaceC3258Zb3.offer(call)) {
                                onError(new IllegalStateException("Scalar queue full?!"));
                                return;
                            }
                        }
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } else if (!h().offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    } else if (getAndIncrement() != 0) {
                        return;
                    }
                    g();
                    return;
                } catch (Throwable th) {
                    AbstractC4148cE0.a(th);
                    this.m.a(th);
                    f();
                    return;
                }
            }
            long j2 = this.r;
            this.r = 1 + j2;
            CQ0 cq0 = new CQ0(this, j2);
            while (true) {
                AtomicReference atomicReference = this.o;
                CQ0[] cq0Arr = (CQ0[]) atomicReference.get();
                if (cq0Arr != x) {
                    int length = cq0Arr.length;
                    CQ0[] cq0Arr2 = new CQ0[length + 1];
                    System.arraycopy(cq0Arr, 0, cq0Arr2, 0, length);
                    cq0Arr2[length] = cq0;
                    while (true) {
                        if (atomicReference.compareAndSet(cq0Arr, cq0Arr2)) {
                            z = true;
                            break;
                        } else if (atomicReference.get() != cq0Arr) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        break;
                    }
                } else {
                    EnumC0854Go3.b(cq0);
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                ((BQ0) re2).b(cq0);
            }
        } catch (Throwable th2) {
            AbstractC4148cE0.a(th2);
            this.q.cancel();
            onError(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(CQ0 cq0) {
        boolean z;
        CQ0[] cq0Arr;
        do {
            AtomicReference atomicReference = this.o;
            CQ0[] cq0Arr2 = (CQ0[]) atomicReference.get();
            int length = cq0Arr2.length;
            if (length == 0) {
                return;
            }
            z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (cq0Arr2[i] == cq0) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                cq0Arr = w;
            } else {
                CQ0[] cq0Arr3 = new CQ0[length - 1];
                System.arraycopy(cq0Arr2, 0, cq0Arr3, 0, i);
                System.arraycopy(cq0Arr2, i + 1, cq0Arr3, i, (length - i) - 1);
                cq0Arr = cq0Arr3;
            }
            while (true) {
                if (atomicReference.compareAndSet(cq0Arr2, cq0Arr)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != cq0Arr2) {
                    break;
                }
            }
        } while (!z);
    }

    public final InterfaceC3258Zb3 h() {
        InterfaceC3258Zb3 interfaceC3258Zb3 = this.k;
        if (interfaceC3258Zb3 == null) {
            if (this.i == Integer.MAX_VALUE) {
                interfaceC3258Zb3 = new C7402li3(this.j);
            } else {
                interfaceC3258Zb3 = new C7058ki3(this.i);
            }
            this.k = interfaceC3258Zb3;
        }
        return interfaceC3258Zb3;
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void onError(Throwable th) {
        if (this.l) {
            MR2.b(th);
        } else if (this.m.a(th)) {
            this.l = true;
            f();
        } else {
            MR2.b(th);
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void b() {
        if (this.l) {
            return;
        }
        this.l = true;
        f();
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void a(long j) {
        if (EnumC0854Go3.d(j)) {
            AbstractC0355Ct.a(this.p, j);
            f();
        }
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void cancel() {
        InterfaceC3258Zb3 interfaceC3258Zb3;
        CQ0[] cq0Arr;
        if (this.n) {
            return;
        }
        this.n = true;
        this.q.cancel();
        AtomicReference atomicReference = this.o;
        CQ0[] cq0Arr2 = (CQ0[]) atomicReference.get();
        CQ0[] cq0Arr3 = x;
        if (cq0Arr2 != cq0Arr3 && (cq0Arr = (CQ0[]) atomicReference.getAndSet(cq0Arr3)) != cq0Arr3) {
            for (CQ0 cq0 : cq0Arr) {
                cq0.getClass();
                EnumC0854Go3.b(cq0);
            }
            Throwable b = this.m.b();
            if (b != null && b != ZD0.a) {
                MR2.b(b);
            }
        }
        if (getAndIncrement() != 0 || (interfaceC3258Zb3 = this.k) == null) {
            return;
        }
        interfaceC3258Zb3.clear();
    }

    public final void f() {
        if (getAndIncrement() == 0) {
            g();
        }
    }

    public final void g() {
        int i;
        long j;
        long j2;
        boolean z;
        int i2;
        long j3;
        Object obj;
        InterfaceC0334Co3 interfaceC0334Co3 = this.a;
        int i3 = 1;
        while (!e()) {
            InterfaceC3258Zb3 interfaceC3258Zb3 = this.k;
            long j4 = this.p.get();
            boolean z2 = j4 == Long.MAX_VALUE;
            long j5 = 0;
            long j6 = 0;
            if (interfaceC3258Zb3 != null) {
                do {
                    long j7 = 0;
                    obj = null;
                    while (true) {
                        if (j4 == 0) {
                            break;
                        }
                        Object poll = interfaceC3258Zb3.poll();
                        if (e()) {
                            return;
                        }
                        if (poll == null) {
                            obj = poll;
                            break;
                        }
                        interfaceC0334Co3.d(poll);
                        j6++;
                        j7++;
                        j4--;
                        obj = poll;
                    }
                    if (j7 != 0) {
                        j4 = z2 ? Long.MAX_VALUE : this.p.addAndGet(-j7);
                    }
                    if (j4 == 0) {
                        break;
                    }
                } while (obj != null);
            }
            boolean z3 = this.l;
            InterfaceC3258Zb3 interfaceC3258Zb32 = this.k;
            CQ0[] cq0Arr = (CQ0[]) this.o.get();
            int length = cq0Arr.length;
            if (z3 && ((interfaceC3258Zb32 == null || interfaceC3258Zb32.isEmpty()) && length == 0)) {
                Throwable b = this.m.b();
                if (b != ZD0.a) {
                    if (b == null) {
                        interfaceC0334Co3.b();
                        return;
                    } else {
                        interfaceC0334Co3.onError(b);
                        return;
                    }
                }
                return;
            }
            if (length != 0) {
                i = i3;
                long j8 = this.s;
                int i4 = this.t;
                if (length <= i4 || cq0Arr[i4].a != j8) {
                    if (length <= i4) {
                        i4 = 0;
                    }
                    for (int i5 = 0; i5 < length && cq0Arr[i4].a != j8; i5++) {
                        i4++;
                        if (i4 == length) {
                            i4 = 0;
                        }
                    }
                    this.t = i4;
                    this.s = cq0Arr[i4].a;
                }
                int i6 = i4;
                boolean z4 = false;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        z = z4;
                        break;
                    }
                    if (e()) {
                        return;
                    }
                    CQ0 cq0 = cq0Arr[i6];
                    Object obj2 = null;
                    while (!e()) {
                        InterfaceC3586ac3 interfaceC3586ac3 = cq0.k;
                        int i8 = length;
                        if (interfaceC3586ac3 != null) {
                            Object obj3 = obj2;
                            long j9 = j5;
                            while (true) {
                                if (j4 == j5) {
                                    break;
                                }
                                try {
                                    Object poll2 = interfaceC3586ac3.poll();
                                    if (poll2 == null) {
                                        obj3 = poll2;
                                        j5 = 0;
                                        break;
                                    }
                                    interfaceC0334Co3.d(poll2);
                                    if (e()) {
                                        return;
                                    }
                                    j4--;
                                    j9++;
                                    obj3 = poll2;
                                    j5 = 0;
                                } catch (Throwable th) {
                                    AbstractC4148cE0.a(th);
                                    EnumC0854Go3.b(cq0);
                                    this.m.a(th);
                                    if (!this.h) {
                                        this.q.cancel();
                                    }
                                    if (e()) {
                                        return;
                                    }
                                    i(cq0);
                                    i7++;
                                    z4 = true;
                                    i2 = 1;
                                }
                            }
                            if (j9 != j5) {
                                j4 = !z2 ? this.p.addAndGet(-j9) : Long.MAX_VALUE;
                                cq0.a(j9);
                                j3 = 0;
                            } else {
                                j3 = j5;
                            }
                            if (j4 != j3 && obj3 != null) {
                                length = i8;
                                obj2 = obj3;
                                j5 = 0;
                            }
                        }
                        boolean z5 = cq0.j;
                        InterfaceC3586ac3 interfaceC3586ac32 = cq0.k;
                        if (z5 && (interfaceC3586ac32 == null || interfaceC3586ac32.isEmpty())) {
                            i(cq0);
                            if (e()) {
                                return;
                            }
                            j6++;
                            z4 = true;
                        }
                        if (j4 == 0) {
                            z = z4;
                            break;
                        }
                        i6++;
                        if (i6 == i8) {
                            i6 = 0;
                        }
                        i2 = 1;
                        i7 += i2;
                        length = i8;
                        j5 = 0;
                    }
                    return;
                }
                this.t = i6;
                this.s = cq0Arr[i6].a;
                j2 = j6;
                j = 0;
            } else {
                i = i3;
                j = 0;
                j2 = j6;
                z = false;
            }
            if (j2 != j && !this.n) {
                this.q.a(j2);
            }
            if (z) {
                i3 = i;
            } else {
                i3 = addAndGet(-i);
                if (i3 == 0) {
                    return;
                }
            }
        }
    }

    public final boolean e() {
        if (!this.n) {
            if (this.h || this.m.get() == null) {
                return false;
            }
            InterfaceC3258Zb3 interfaceC3258Zb3 = this.k;
            if (interfaceC3258Zb3 != null) {
                interfaceC3258Zb3.clear();
            }
            Throwable b = this.m.b();
            if (b != ZD0.a) {
                this.a.onError(b);
            }
            return true;
        }
        InterfaceC3258Zb3 interfaceC3258Zb32 = this.k;
        if (interfaceC3258Zb32 != null) {
            interfaceC3258Zb32.clear();
        }
        return true;
    }
}
