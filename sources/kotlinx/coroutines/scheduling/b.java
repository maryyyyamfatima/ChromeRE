package kotlinx.coroutines.scheduling;

import defpackage.AbstractC0087Ar1;
import defpackage.AbstractC0800Ge;
import defpackage.AbstractC2373Sg3;
import defpackage.AbstractC6711ji0;
import defpackage.AbstractC9307rF1;
import defpackage.AbstractRunnableC4843eF3;
import defpackage.C12053zF3;
import defpackage.C12097zO2;
import defpackage.C2823Vs3;
import defpackage.C7249lF3;
import defpackage.C8537p01;
import defpackage.Iq4;
import defpackage.VF3;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class b implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    public final int a;
    volatile /* synthetic */ long controlState;
    public final int g;
    public final long h;
    public final String i;
    public final C8537p01 j;
    public final C8537p01 k;
    public final C12097zO2 l;
    private volatile /* synthetic */ long parkedWorkersStack;
    public static final C2823Vs3 p = new C2823Vs3("NOT_IN_STACK");
    public static final /* synthetic */ AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    public b(String str, int i, int i2, long j) {
        this.a = i;
        this.g = i2;
        this.h = j;
        this.i = str;
        if (!(i >= 1)) {
            throw new IllegalArgumentException(AbstractC9307rF1.a("Core pool size ", i, " should be at least 1").toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(AbstractC0800Ge.a("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        if (!(i2 <= 2097150)) {
            throw new IllegalArgumentException(AbstractC9307rF1.a("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.j = new C8537p01();
        this.k = new C8537p01();
        this.parkedWorkersStack = 0L;
        this.l = new C12097zO2(i + 1);
        this.controlState = i << 42;
        this._isTerminated = 0;
    }

    public final void e(a aVar) {
        long j;
        int b;
        if (aVar.c() != p) {
            return;
        }
        do {
            j = this.parkedWorkersStack;
            b = aVar.b();
            aVar.g(this.l.b((int) (2097151 & j)));
        } while (!m.compareAndSet(this, j, b | ((2097152 + j) & (-2097152))));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        boolean z;
        if (o.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !AbstractC0087Ar1.a(aVar.l, this)) {
                aVar = null;
            }
            synchronized (this.l) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    Object b = this.l.b(i2);
                    AbstractC0087Ar1.b(b);
                    a aVar2 = (a) b;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        Iq4 iq4 = aVar2.a;
                        C8537p01 c8537p01 = this.k;
                        iq4.getClass();
                        AbstractRunnableC4843eF3 abstractRunnableC4843eF3 = (AbstractRunnableC4843eF3) Iq4.b.getAndSet(iq4, null);
                        if (abstractRunnableC4843eF3 != null) {
                            c8537p01.a(abstractRunnableC4843eF3);
                        }
                        do {
                            AbstractRunnableC4843eF3 d = iq4.d();
                            if (d == null) {
                                z = false;
                            } else {
                                c8537p01.a(d);
                                z = true;
                            }
                        } while (z);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            this.k.b();
            this.j.b();
            while (true) {
                AbstractRunnableC4843eF3 a = aVar == null ? null : aVar.a(true);
                if (a == null && (a = (AbstractRunnableC4843eF3) this.j.d()) == null && (a = (AbstractRunnableC4843eF3) this.k.d()) == null) {
                    break;
                }
                try {
                    a.run();
                } finally {
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable, VF3.f, false);
    }

    public final void c(Runnable runnable, C7249lF3 c7249lF3, boolean z) {
        AbstractRunnableC4843eF3 c12053zF3;
        AbstractRunnableC4843eF3 abstractRunnableC4843eF3;
        boolean a;
        int i;
        VF3.e.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC4843eF3) {
            c12053zF3 = (AbstractRunnableC4843eF3) runnable;
            c12053zF3.a = nanoTime;
            c12053zF3.g = c7249lF3;
        } else {
            c12053zF3 = new C12053zF3(runnable, nanoTime, c7249lF3);
        }
        Thread currentThread = Thread.currentThread();
        a aVar = null;
        a aVar2 = currentThread instanceof a ? (a) currentThread : null;
        if (aVar2 != null && AbstractC0087Ar1.a(aVar2.l, this)) {
            aVar = aVar2;
        }
        if (aVar == null || (i = aVar.g) == 5 || (c12053zF3.g.a == 0 && i == 2)) {
            abstractRunnableC4843eF3 = c12053zF3;
        } else {
            aVar.k = true;
            abstractRunnableC4843eF3 = aVar.a.a(c12053zF3, z);
        }
        if (abstractRunnableC4843eF3 != null) {
            if (abstractRunnableC4843eF3.g.a == 1) {
                a = this.k.a(abstractRunnableC4843eF3);
            } else {
                a = this.j.a(abstractRunnableC4843eF3);
            }
            if (!a) {
                throw new RejectedExecutionException(AbstractC0087Ar1.g(" was terminated", this.i));
            }
        }
        boolean z2 = z && aVar != null;
        if (c12053zF3.g.a != 0) {
            long addAndGet = n.addAndGet(this, 2097152L);
            if (z2 || i() || h(addAndGet)) {
                return;
            }
            i();
            return;
        }
        if (z2 || i() || h(this.controlState)) {
            return;
        }
        i();
    }

    public final boolean h(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int b = b();
            if (b == 1 && i2 > 1) {
                b();
            }
            if (b > 0) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        synchronized (this.l) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.a) {
                return 0;
            }
            if (i >= this.g) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (!(i3 > 0 && this.l.b(i3) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            a aVar = new a(this, i3);
            this.l.c(i3, aVar);
            if (!(i3 == ((int) (2097151 & n.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            aVar.start();
            return i2 + 1;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int a = this.l.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < a) {
            int i7 = i6 + 1;
            a aVar = (a) this.l.b(i6);
            if (aVar != null) {
                int c = aVar.a.c();
                int b = AbstractC2373Sg3.b(aVar.g);
                if (b == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (b == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (b == 2) {
                    i3++;
                } else if (b == 3) {
                    i4++;
                    if (c > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (b == 4) {
                    i5++;
                }
            }
            i6 = i7;
        }
        long j = this.controlState;
        return this.i + '@' + AbstractC6711ji0.a(this) + "[Pool Size {core = " + this.a + ", max = " + this.g + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.j.c() + ", global blocking queue size = " + this.k.c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.a - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    public final void f(a aVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = aVar.c();
                    while (true) {
                        if (c == p) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        a aVar2 = (a) c;
                        int b = aVar2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = aVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0 && m.compareAndSet(this, j, j2 | i3)) {
                return;
            }
        }
    }

    public final boolean i() {
        C2823Vs3 c2823Vs3;
        int i;
        while (true) {
            long j = this.parkedWorkersStack;
            a aVar = (a) this.l.b((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = aVar.c();
                while (true) {
                    c2823Vs3 = p;
                    if (c == c2823Vs3) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    a aVar2 = (a) c;
                    i = aVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c = aVar2.c();
                }
                if (i >= 0 && m.compareAndSet(this, j, i | j2)) {
                    aVar.g(c2823Vs3);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.m.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }
}
