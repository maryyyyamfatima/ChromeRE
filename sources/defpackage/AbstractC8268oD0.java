package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8268oD0 extends AbstractC8611pD0 implements InterfaceC5355fl0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(AbstractC8268oD0.class, Object.class, "_queue");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    static {
        AtomicReferenceFieldUpdater.newUpdater(AbstractC8268oD0.class, Object.class, "_delayed");
    }

    public final boolean a0() {
        C4661dk c4661dk = this.j;
        if (!(c4661dk == null || c4661dk.b == c4661dk.c)) {
            return false;
        }
        AbstractC7924nD0 abstractC7924nD0 = (AbstractC7924nD0) this._delayed;
        if (abstractC7924nD0 != null && !abstractC7924nD0.a()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof ZG1) {
                return ((ZG1) obj).d();
            }
            if (obj != AbstractC8954qD0.a) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC8611pD0
    public void shutdown() {
        AbstractC10706vK3.a.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            C2823Vs3 c2823Vs3 = AbstractC8954qD0.a;
            boolean z = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c2823Vs3)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof ZG1) {
                    ((ZG1) obj).b();
                    break;
                }
                if (obj == c2823Vs3) {
                    break;
                }
                ZG1 zg1 = new ZG1(8, true);
                zg1.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, zg1)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        do {
        } while (c0() <= 0);
        System.nanoTime();
        AbstractC7924nD0 abstractC7924nD0 = (AbstractC7924nD0) this._delayed;
        if (abstractC7924nD0 == null) {
            return;
        }
        abstractC7924nD0.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c0() {
        /*
            r8 = this;
            boolean r0 = r8.P()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r8._delayed
            nD0 r0 = (defpackage.AbstractC7924nD0) r0
            if (r0 == 0) goto L1a
            boolean r3 = r0.a()
            if (r3 != 0) goto L1a
            java.lang.System.nanoTime()
            monitor-enter(r0)
            monitor-exit(r0)
        L1a:
            java.lang.Object r0 = r8._queue
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 != 0) goto L22
            goto L64
        L22:
            boolean r6 = r0 instanceof defpackage.ZG1
            if (r6 == 0) goto L49
            r5 = r0
            ZG1 r5 = (defpackage.ZG1) r5
            java.lang.Object r6 = r5.f()
            Vs3 r7 = defpackage.ZG1.g
            if (r6 == r7) goto L35
            r5 = r6
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            goto L64
        L35:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = defpackage.AbstractC8268oD0.k
            ZG1 r7 = r5.e()
        L3b:
            boolean r3 = r6.compareAndSet(r8, r0, r7)
            if (r3 == 0) goto L42
            goto L1a
        L42:
            java.lang.Object r3 = r6.get(r8)
            if (r3 == r0) goto L3b
            goto L1a
        L49:
            Vs3 r6 = defpackage.AbstractC8954qD0.a
            if (r0 != r6) goto L4e
            goto L64
        L4e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = defpackage.AbstractC8268oD0.k
        L50:
            boolean r7 = r6.compareAndSet(r8, r0, r5)
            if (r7 == 0) goto L58
            r5 = r3
            goto L5f
        L58:
            java.lang.Object r7 = r6.get(r8)
            if (r7 == r0) goto L50
            r5 = r4
        L5f:
            if (r5 == 0) goto L1a
            r5 = r0
            java.lang.Runnable r5 = (java.lang.Runnable) r5
        L64:
            if (r5 == 0) goto L6a
            r5.run()
            return r1
        L6a:
            dk r0 = r8.j
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L74
            goto L7e
        L74:
            int r7 = r0.b
            int r0 = r0.c
            if (r7 != r0) goto L7b
            goto L7c
        L7b:
            r3 = r4
        L7c:
            if (r3 == 0) goto L80
        L7e:
            r3 = r5
            goto L81
        L80:
            r3 = r1
        L81:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L86
            goto La7
        L86:
            java.lang.Object r0 = r8._queue
            if (r0 != 0) goto L8b
            goto L98
        L8b:
            boolean r3 = r0 instanceof defpackage.ZG1
            if (r3 == 0) goto La2
            ZG1 r0 = (defpackage.ZG1) r0
            boolean r0 = r0.d()
            if (r0 != 0) goto L98
            goto La7
        L98:
            java.lang.Object r0 = r8._delayed
            nD0 r0 = (defpackage.AbstractC7924nD0) r0
            if (r0 != 0) goto L9f
            goto La6
        L9f:
            monitor-enter(r0)
            monitor-exit(r0)
            goto La6
        La2:
            Vs3 r3 = defpackage.AbstractC8954qD0.a
            if (r0 != r3) goto La7
        La6:
            r1 = r5
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8268oD0.c0():long");
    }

    @Override // defpackage.L90
    public final void y(E90 e90, Runnable runnable) {
        V(runnable);
    }

    public final void g0() {
        this._queue = null;
        this._delayed = null;
    }

    public void V(Runnable runnable) {
        boolean z;
        while (true) {
            Object obj = this._queue;
            z = false;
            if (this._isCompleted != 0) {
                break;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            } else if (obj instanceof ZG1) {
                ZG1 zg1 = (ZG1) obj;
                int a = zg1.a(runnable);
                if (a == 0) {
                    break;
                }
                if (a == 1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k;
                    ZG1 e = zg1.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                } else if (a == 2) {
                    break;
                }
            } else {
                if (obj == AbstractC8954qD0.a) {
                    break;
                }
                ZG1 zg12 = new ZG1(8, true);
                zg12.a((Runnable) obj);
                zg12.a(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = k;
                while (true) {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, zg12)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            Thread M = M();
            if (Thread.currentThread() != M) {
                LockSupport.unpark(M);
                return;
            }
            return;
        }
        RunnableC0046Aj0.l.V(runnable);
    }
}
