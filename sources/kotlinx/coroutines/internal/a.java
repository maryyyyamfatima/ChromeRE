package kotlinx.coroutines.internal;

import defpackage.AbstractC0668Fd2;
import defpackage.AbstractC6711ji0;
import defpackage.SM2;
import defpackage.YD2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_next");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_prev");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public boolean j() {
        return g() instanceof SM2;
    }

    public final a h() {
        Object g2 = g();
        SM2 sm2 = g2 instanceof SM2 ? (SM2) g2 : null;
        a aVar = sm2 != null ? sm2.a : null;
        return aVar == null ? (a) g2 : aVar;
    }

    public final a i() {
        a e = e();
        if (e == null) {
            Object obj = this._prev;
            while (true) {
                e = (a) obj;
                if (!e.j()) {
                    break;
                }
                obj = e._prev;
            }
        }
        return e;
    }

    public final void k() {
        a aVar;
        boolean z;
        do {
            Object g2 = g();
            if (g2 instanceof SM2) {
                a aVar2 = ((SM2) g2).a;
                return;
            }
            if (g2 == this) {
                return;
            }
            aVar = (a) g2;
            SM2 sm2 = (SM2) aVar._removedRef;
            if (sm2 == null) {
                sm2 = new SM2(aVar);
                h.lazySet(aVar, sm2);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, g2, sm2)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != g2) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        aVar.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:            r7 = kotlinx.coroutines.internal.a.a;        r4 = ((defpackage.SM2) r4).a;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:            if (r7.compareAndSet(r3, r1, r4) == false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:            if (r7.get(r3) == r1) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:            if (r5 != false) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004a, code lost:            r5 = true;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.a e() {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = r9._prev
            kotlinx.coroutines.internal.a r0 = (kotlinx.coroutines.internal.a) r0
            r1 = r0
        L5:
            r2 = 0
            r3 = r2
        L7:
            java.lang.Object r4 = r1._next
            r5 = 0
            r6 = 1
            if (r4 != r9) goto L24
            if (r0 != r1) goto L10
            return r1
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.internal.a.g
        L12:
            boolean r2 = r7.compareAndSet(r9, r0, r1)
            if (r2 == 0) goto L1a
            r5 = r6
            goto L20
        L1a:
            java.lang.Object r2 = r7.get(r9)
            if (r2 == r0) goto L12
        L20:
            if (r5 != 0) goto L23
            goto L0
        L23:
            return r1
        L24:
            boolean r7 = r9.j()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r4 != 0) goto L2e
            return r1
        L2e:
            boolean r7 = r4 instanceof defpackage.AbstractC0668Fd2
            if (r7 == 0) goto L38
            Fd2 r4 = (defpackage.AbstractC0668Fd2) r4
            r4.a(r1)
            goto L0
        L38:
            boolean r7 = r4 instanceof defpackage.SM2
            if (r7 == 0) goto L5c
            if (r3 == 0) goto L57
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.internal.a.a
            SM2 r4 = (defpackage.SM2) r4
            kotlinx.coroutines.internal.a r4 = r4.a
        L44:
            boolean r2 = r7.compareAndSet(r3, r1, r4)
            if (r2 == 0) goto L4c
            r5 = r6
            goto L52
        L4c:
            java.lang.Object r2 = r7.get(r3)
            if (r2 == r1) goto L44
        L52:
            if (r5 != 0) goto L55
            goto L0
        L55:
            r1 = r3
            goto L5
        L57:
            java.lang.Object r1 = r1._prev
            kotlinx.coroutines.internal.a r1 = (kotlinx.coroutines.internal.a) r1
            goto L7
        L5c:
            r3 = r4
            kotlinx.coroutines.internal.a r3 = (kotlinx.coroutines.internal.a) r3
            r8 = r3
            r3 = r1
            r1 = r8
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.a.e():kotlinx.coroutines.internal.a");
    }

    public String toString() {
        return new YD2(this) { // from class: WG1
        } + '@' + AbstractC6711ji0.a(this);
    }

    public final Object g() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC0668Fd2)) {
                return obj;
            }
            ((AbstractC0668Fd2) obj).a(this);
        }
    }

    public final void f(a aVar) {
        boolean z;
        do {
            a aVar2 = (a) aVar._prev;
            if (g() != aVar) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, aVar2, this)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(aVar) != aVar2) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (j()) {
            aVar.e();
        }
    }
}
