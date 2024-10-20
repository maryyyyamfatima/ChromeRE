package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Et1 */
/* loaded from: classes.dex */
public class C0617Et1 implements InterfaceC10555ut1, EJ, InterfaceC6719jj2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C0617Et1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    public void G(Object obj) {
    }

    public void H() {
    }

    public String m() {
        return "Job was cancelled";
    }

    public boolean t() {
        return true;
    }

    public boolean v() {
        return this instanceof C5283fZ;
    }

    public boolean z(Throwable th) {
        return false;
    }

    public String D() {
        return getClass().getSimpleName();
    }

    public C0617Et1(boolean z) {
        this._state = z ? AbstractC0747Ft1.g : AbstractC0747Ft1.f;
        this._parentHandle = null;
    }

    @Override // defpackage.B90
    public final C90 getKey() {
        return C10212tt1.a;
    }

    @Override // defpackage.E90
    public final E90 r(E90 e90) {
        AbstractC0087Ar1.e(e90, "context");
        return AbstractC12019z90.a(this, e90);
    }

    @Override // defpackage.E90
    public final Object j(Object obj, AV0 av0) {
        return av0.c(obj, this);
    }

    @Override // defpackage.B90, defpackage.E90
    public final B90 b(C90 c90) {
        return A90.a(this, c90);
    }

    @Override // defpackage.E90
    public final E90 k(C90 c90) {
        return A90.b(this, c90);
    }

    public final void o(InterfaceC1871Ok1 interfaceC1871Ok1, Object obj) {
        QZ qz;
        AJ aj = (AJ) this._parentHandle;
        if (aj != null) {
            aj.dispose();
            this._parentHandle = F52.a;
        }
        OZ oz = obj instanceof OZ ? (OZ) obj : null;
        Throwable th = oz == null ? null : oz.a;
        if (interfaceC1871Ok1 instanceof AbstractC0097At1) {
            try {
                ((AbstractC0097At1) interfaceC1871Ok1).m(th);
                return;
            } catch (Throwable th2) {
                A(new QZ("Exception in completion handler " + interfaceC1871Ok1 + " for " + this, th2));
                return;
            }
        }
        E52 d = interfaceC1871Ok1.d();
        if (d == null) {
            return;
        }
        QZ qz2 = null;
        for (a aVar = (a) d.g(); !AbstractC0087Ar1.a(aVar, d); aVar = aVar.h()) {
            if (aVar instanceof AbstractC0097At1) {
                AbstractC0097At1 abstractC0097At1 = (AbstractC0097At1) aVar;
                try {
                    abstractC0097At1.m(th);
                } catch (Throwable th3) {
                    if (qz2 == null) {
                        qz = null;
                    } else {
                        AbstractC4492dE0.a(qz2, th3);
                        qz = qz2;
                    }
                    if (qz == null) {
                        qz2 = new QZ("Exception in completion handler " + abstractC0097At1 + " for " + this, th3);
                    }
                }
            }
        }
        if (qz2 == null) {
            return;
        }
        A(qz2);
    }

    public final AJ x() {
        return (AJ) this._parentHandle;
    }

    public final void B(InterfaceC10555ut1 interfaceC10555ut1) {
        F52 f52 = F52.a;
        if (interfaceC10555ut1 == null) {
            this._parentHandle = f52;
            return;
        }
        interfaceC10555ut1.start();
        AJ f = interfaceC10555ut1.f(this);
        this._parentHandle = f;
        if (!(y() instanceof InterfaceC1871Ok1)) {
            f.dispose();
            this._parentHandle = f52;
        }
    }

    @Override // defpackage.InterfaceC10555ut1
    public boolean c() {
        Object y = y();
        return (y instanceof InterfaceC1871Ok1) && ((InterfaceC1871Ok1) y).c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object q(C0357Ct1 c0357Ct1, Object obj) {
        Object obj2;
        Throwable th = null;
        OZ oz = obj instanceof OZ ? (OZ) obj : null;
        Throwable th2 = oz == null ? null : oz.a;
        synchronized (c0357Ct1) {
            c0357Ct1.e();
            ArrayList<Throwable> h = c0357Ct1.h(th2);
            if (h.isEmpty()) {
                if (c0357Ct1.e()) {
                    th = new C10898vt1(m(), null, this);
                }
            } else {
                Iterator it = h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th = next;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) h.get(0);
                }
            }
            if (th != null && h.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(h.size()));
                for (Throwable th3 : h) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        AbstractC4492dE0.a(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new OZ(false, th);
        }
        if (th != null) {
            boolean z = th instanceof CancellationException;
            AJ aj = (AJ) this._parentHandle;
            if (aj != null && aj != F52.a) {
                z = aj.a(th) || z;
            }
            if (z || z(th)) {
                if (obj != null) {
                    OZ.b.compareAndSet((OZ) obj, 0, 1);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        G(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (obj instanceof InterfaceC1871Ok1) {
            obj2 = new C2001Pk1();
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c0357Ct1, obj2) && atomicReferenceFieldUpdater.get(this) == c0357Ct1) {
        }
        o(c0357Ct1, obj);
        return obj;
    }

    @Override // defpackage.InterfaceC10555ut1
    public final CancellationException i() {
        Object y = y();
        if (!(y instanceof C0357Ct1)) {
            if (y instanceof InterfaceC1871Ok1) {
                throw new IllegalStateException(AbstractC0087Ar1.g(this, "Job is still new or active: ").toString());
            }
            if (!(y instanceof OZ)) {
                return new C10898vt1(AbstractC0087Ar1.g(" has completed normally", getClass().getSimpleName()), null, this);
            }
            Throwable th = ((OZ) y).a;
            r3 = th instanceof CancellationException ? (CancellationException) th : null;
            return r3 == null ? new C10898vt1(m(), th, this) : r3;
        }
        Throwable b = ((C0357Ct1) y).b();
        if (b != null) {
            String g = AbstractC0087Ar1.g(" is cancelling", getClass().getSimpleName());
            r3 = b instanceof CancellationException ? (CancellationException) b : null;
            if (r3 == null) {
                if (g == null) {
                    g = m();
                }
                r3 = new C10898vt1(g, b, this);
            }
        }
        if (r3 != null) {
            return r3;
        }
        throw new IllegalStateException(AbstractC0087Ar1.g(this, "Job is still new or active: ").toString());
    }

    @Override // defpackage.InterfaceC10555ut1
    public final InterfaceC7447lq0 s(InterfaceC7670mV0 interfaceC7670mV0) {
        return e(false, true, interfaceC7670mV0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [fj1] */
    @Override // defpackage.InterfaceC10555ut1
    public final InterfaceC7447lq0 e(boolean z, boolean z2, InterfaceC7670mV0 interfaceC7670mV0) {
        AbstractC0097At1 abstractC0097At1;
        boolean z3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z) {
            abstractC0097At1 = interfaceC7670mV0 instanceof AbstractC11241wt1 ? (AbstractC11241wt1) interfaceC7670mV0 : null;
            if (abstractC0097At1 == null) {
                abstractC0097At1 = new C3076Xr1(interfaceC7670mV0);
            }
        } else {
            abstractC0097At1 = interfaceC7670mV0 instanceof AbstractC0097At1 ? (AbstractC0097At1) interfaceC7670mV0 : null;
            if (abstractC0097At1 == null) {
                abstractC0097At1 = null;
            }
            if (abstractC0097At1 == null) {
                abstractC0097At1 = new C3206Yr1(interfaceC7670mV0);
            }
        }
        abstractC0097At1.i = this;
        while (true) {
            Object y = y();
            if (y instanceof C2595Tz0) {
                C2595Tz0 c2595Tz0 = (C2595Tz0) y;
                if (c2595Tz0.a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, y, abstractC0097At1)) {
                            z3 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != y) {
                            z3 = false;
                            break;
                        }
                    }
                    if (z3) {
                        return abstractC0097At1;
                    }
                } else {
                    E52 e52 = new E52();
                    if (!c2595Tz0.a) {
                        e52 = new C5344fj1(e52);
                    }
                    do {
                        atomicReferenceFieldUpdater = a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, c2595Tz0, e52)) {
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == c2595Tz0);
                }
            } else if (y instanceof InterfaceC1871Ok1) {
                E52 d = ((InterfaceC1871Ok1) y).d();
                if (d != null) {
                    InterfaceC7447lq0 interfaceC7447lq0 = F52.a;
                    if (z && (y instanceof C0357Ct1)) {
                        synchronized (y) {
                            th = ((C0357Ct1) y).b();
                            if (th == null || ((interfaceC7670mV0 instanceof BJ) && !((C0357Ct1) y).f())) {
                                if (g(y, d, abstractC0097At1)) {
                                    if (th == null) {
                                        return abstractC0097At1;
                                    }
                                    interfaceC7447lq0 = abstractC0097At1;
                                }
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z2) {
                            interfaceC7670mV0.b(th);
                        }
                        return interfaceC7447lq0;
                    }
                    if (g(y, d, abstractC0097At1)) {
                        return abstractC0097At1;
                    }
                } else {
                    if (y == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    I((AbstractC0097At1) y);
                }
            } else {
                if (z2) {
                    OZ oz = y instanceof OZ ? (OZ) y : null;
                    interfaceC7670mV0.b(oz != null ? oz.a : null);
                }
                return F52.a;
            }
        }
    }

    public final void I(AbstractC0097At1 abstractC0097At1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z;
        E52 e52 = new E52();
        abstractC0097At1.getClass();
        a.g.lazySet(e52, abstractC0097At1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a.a;
        atomicReferenceFieldUpdater2.lazySet(e52, abstractC0097At1);
        while (true) {
            if (abstractC0097At1.g() != abstractC0097At1) {
                break;
            }
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(abstractC0097At1, abstractC0097At1, e52)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(abstractC0097At1) != abstractC0097At1) {
                    z = false;
                    break;
                }
            }
            if (z) {
                e52.f(abstractC0097At1);
                break;
            }
        }
        a h = abstractC0097At1.h();
        do {
            atomicReferenceFieldUpdater = a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0097At1, h)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0097At1);
    }

    public boolean n(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return l(th) && t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:            r0 = defpackage.AbstractC0747Ft1.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:            if (r0 != defpackage.AbstractC0747Ft1.b) goto L438;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:            r0 = K(r0, new defpackage.OZ(false, p(r10)));     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:            if (r0 == defpackage.AbstractC0747Ft1.c) goto L510;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:            if (r0 != defpackage.AbstractC0747Ft1.a) goto L495;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:            r0 = null;        r1 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:            r4 = y();     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:            if ((r4 instanceof defpackage.C0357Ct1) == false) goto L464;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:            if ((r4 instanceof defpackage.InterfaceC1871Ok1) == false) goto L512;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:            if (r1 != null) goto L468;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:            r1 = p(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:            r5 = (defpackage.InterfaceC1871Ok1) r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:            if (v() != false) goto L424;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:            if (r5.c() == false) goto L513;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:            r5 = K(r4, new defpackage.OZ(false, r1));     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:            if (r5 == defpackage.AbstractC0747Ft1.a) goto L515;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:            if (r5 != defpackage.AbstractC0747Ft1.c) goto L516;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:            r0 = r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:            r0 = y();     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:            throw new java.lang.IllegalStateException(defpackage.AbstractC0087Ar1.g(r4, "Cannot happen in ").toString());     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:            r6 = w(r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:            if (r6 != null) goto L473;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:            r7 = new defpackage.C0357Ct1(r6, r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a6, code lost:            r4 = defpackage.C0617Et1.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ac, code lost:            if (r4.compareAndSet(r9, r5, r7) == false) goto L477;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:            if ((r0 instanceof defpackage.InterfaceC1871Ok1) == false) goto L507;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:            if (r4.get(r9) == r5) goto L523;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b6, code lost:            r4 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b7, code lost:            if (r4 != false) goto L482;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bb, code lost:            F(r6, r1);        r4 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bf, code lost:            if (r4 == false) goto L520;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:            r10 = defpackage.AbstractC0747Ft1.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:            r0 = r10;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ae, code lost:            r4 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b9, code lost:            r4 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e9, code lost:            r10 = defpackage.AbstractC0747Ft1.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0047, code lost:            monitor-enter(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:            if ((r0 instanceof defpackage.C0357Ct1) == false) goto L431;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x004f, code lost:            if (((defpackage.C0357Ct1) r4).g() == false) goto L449;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0051, code lost:            r10 = defpackage.AbstractC0747Ft1.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0053, code lost:            monitor-exit(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0056, code lost:            r5 = ((defpackage.C0357Ct1) r4).e();     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x005d, code lost:            if (r1 != null) goto L452;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x005f, code lost:            r1 = p(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0063, code lost:            ((defpackage.C0357Ct1) r4).a(r1);        r10 = ((defpackage.C0357Ct1) r4).b();     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0072, code lost:            if ((!r5) == false) goto L456;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0074, code lost:            r0 = r10;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0075, code lost:            monitor-exit(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0076, code lost:            if (r0 != null) goto L459;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0079, code lost:            F(((defpackage.C0357Ct1) r4).a, r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0080, code lost:            r10 = defpackage.AbstractC0747Ft1.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ee, code lost:            if (r0 != defpackage.AbstractC0747Ft1.a) goto L498;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f3, code lost:            if (r0 != defpackage.AbstractC0747Ft1.b) goto L501;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:            if (((defpackage.C0357Ct1) r0).f() == false) goto L431;     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00f8, code lost:            if (r0 != defpackage.AbstractC0747Ft1.d) goto L504;     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:            return false;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00fc, code lost:            return true;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0617Et1.l(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable p(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C0617Et1 c0617Et1 = (C0617Et1) ((InterfaceC6719jj2) obj);
        Object y = c0617Et1.y();
        if (y instanceof C0357Ct1) {
            cancellationException = ((C0357Ct1) y).b();
        } else if (y instanceof OZ) {
            cancellationException = ((OZ) y).a;
        } else {
            if (y instanceof InterfaceC1871Ok1) {
                throw new IllegalStateException(AbstractC0087Ar1.g(y, "Cannot be cancelling child in this state: ").toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new C10898vt1(AbstractC0087Ar1.g(J(y), "Parent job is "), cancellationException, c0617Et1);
        }
        return cancellationException2;
    }

    public final E52 w(InterfaceC1871Ok1 interfaceC1871Ok1) {
        E52 d = interfaceC1871Ok1.d();
        if (d != null) {
            return d;
        }
        if (interfaceC1871Ok1 instanceof C2595Tz0) {
            return new E52();
        }
        if (interfaceC1871Ok1 instanceof AbstractC0097At1) {
            I((AbstractC0097At1) interfaceC1871Ok1);
            return null;
        }
        throw new IllegalStateException(AbstractC0087Ar1.g(interfaceC1871Ok1, "State should have list: ").toString());
    }

    public final Object K(Object obj, Object obj2) {
        Object obj3;
        boolean z;
        if (!(obj instanceof InterfaceC1871Ok1)) {
            return AbstractC0747Ft1.a;
        }
        boolean z2 = true;
        boolean z3 = false;
        if (((obj instanceof C2595Tz0) || (obj instanceof AbstractC0097At1)) && !(obj instanceof BJ) && !(obj2 instanceof OZ)) {
            InterfaceC1871Ok1 interfaceC1871Ok1 = (InterfaceC1871Ok1) obj;
            if (obj2 instanceof InterfaceC1871Ok1) {
                obj3 = new C2001Pk1();
            } else {
                obj3 = obj2;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1871Ok1, obj3)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != interfaceC1871Ok1) {
                    z = false;
                    break;
                }
            }
            if (z) {
                G(obj2);
                o(interfaceC1871Ok1, obj2);
            } else {
                z2 = false;
            }
            return z2 ? obj2 : AbstractC0747Ft1.c;
        }
        InterfaceC1871Ok1 interfaceC1871Ok12 = (InterfaceC1871Ok1) obj;
        E52 w = w(interfaceC1871Ok12);
        if (w == null) {
            return AbstractC0747Ft1.c;
        }
        BJ bj = null;
        C0357Ct1 c0357Ct1 = interfaceC1871Ok12 instanceof C0357Ct1 ? (C0357Ct1) interfaceC1871Ok12 : null;
        if (c0357Ct1 == null) {
            c0357Ct1 = new C0357Ct1(w, null);
        }
        synchronized (c0357Ct1) {
            if (c0357Ct1.f()) {
                return AbstractC0747Ft1.a;
            }
            c0357Ct1.i();
            if (c0357Ct1 != interfaceC1871Ok12) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC1871Ok12, c0357Ct1)) {
                        z3 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC1871Ok12) {
                        break;
                    }
                }
                if (!z3) {
                    return AbstractC0747Ft1.c;
                }
            }
            boolean e = c0357Ct1.e();
            OZ oz = obj2 instanceof OZ ? (OZ) obj2 : null;
            if (oz != null) {
                c0357Ct1.a(oz.a);
            }
            Throwable b = c0357Ct1.b();
            if (!(true ^ e)) {
                b = null;
            }
            if (b != null) {
                F(w, b);
            }
            BJ bj2 = interfaceC1871Ok12 instanceof BJ ? (BJ) interfaceC1871Ok12 : null;
            if (bj2 == null) {
                E52 d = interfaceC1871Ok12.d();
                if (d != null) {
                    bj = E(d);
                }
            } else {
                bj = bj2;
            }
            if (bj != null && L(c0357Ct1, bj, obj2)) {
                return AbstractC0747Ft1.b;
            }
            return q(c0357Ct1, obj2);
        }
    }

    public final boolean L(C0357Ct1 c0357Ct1, BJ bj, Object obj) {
        while (AbstractC9869st1.a(bj.j, false, new C0227Bt1(this, c0357Ct1, bj, obj), 1) == F52.a) {
            bj = E(bj);
            if (bj == null) {
                return false;
            }
        }
        return true;
    }

    public static BJ E(a aVar) {
        while (aVar.j()) {
            aVar = aVar.i();
        }
        while (true) {
            aVar = aVar.h();
            if (!aVar.j()) {
                if (aVar instanceof BJ) {
                    return (BJ) aVar;
                }
                if (aVar instanceof E52) {
                    return null;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC10555ut1
    public final AJ f(C0617Et1 c0617Et1) {
        return (AJ) AbstractC9869st1.a(this, true, new BJ(c0617Et1), 2);
    }

    public void A(QZ qz) {
        throw qz;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(D() + '{' + J(y()) + '}');
        sb.append('@');
        sb.append(AbstractC6711ji0.a(this));
        return sb.toString();
    }

    public static String J(Object obj) {
        if (obj instanceof C0357Ct1) {
            C0357Ct1 c0357Ct1 = (C0357Ct1) obj;
            if (c0357Ct1.e()) {
                return "Cancelling";
            }
            if (c0357Ct1.f()) {
                return "Completing";
            }
        } else {
            if (!(obj instanceof InterfaceC1871Ok1)) {
                return obj instanceof OZ ? "Cancelled" : "Completed";
            }
            if (!((InterfaceC1871Ok1) obj).c()) {
                return "New";
            }
        }
        return "Active";
    }

    public final Object y() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC0668Fd2)) {
                return obj;
            }
            ((AbstractC0668Fd2) obj).a(this);
        }
    }

    public final void F(E52 e52, Throwable th) {
        QZ qz;
        QZ qz2 = null;
        for (a aVar = (a) e52.g(); !AbstractC0087Ar1.a(aVar, e52); aVar = aVar.h()) {
            if (aVar instanceof AbstractC11241wt1) {
                AbstractC0097At1 abstractC0097At1 = (AbstractC0097At1) aVar;
                try {
                    abstractC0097At1.m(th);
                } catch (Throwable th2) {
                    if (qz2 == null) {
                        qz = null;
                    } else {
                        AbstractC4492dE0.a(qz2, th2);
                        qz = qz2;
                    }
                    if (qz == null) {
                        qz2 = new QZ("Exception in completion handler " + abstractC0097At1 + " for " + this, th2);
                    }
                }
            }
        }
        if (qz2 != null) {
            A(qz2);
        }
        boolean z = th instanceof CancellationException;
        AJ aj = (AJ) this._parentHandle;
        if (aj == null || aj == F52.a) {
            return;
        }
        aj.a(th);
    }

    @Override // defpackage.InterfaceC10555ut1
    public final boolean start() {
        char c;
        boolean z;
        boolean z2;
        do {
            Object y = y();
            boolean z3 = y instanceof C2595Tz0;
            c = 65535;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            if (!z3) {
                if (y instanceof C5344fj1) {
                    E52 e52 = ((C5344fj1) y).a;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, y, e52)) {
                            z = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != y) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        H();
                        c = 1;
                    }
                }
                c = 0;
            } else {
                if (!((C2595Tz0) y).a) {
                    C2595Tz0 c2595Tz0 = AbstractC0747Ft1.g;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, y, c2595Tz0)) {
                            z2 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != y) {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        H();
                        c = 1;
                    }
                }
                c = 0;
            }
            if (c == 0) {
                return false;
            }
        } while (c != 1);
        return true;
    }

    public final boolean g(Object obj, E52 e52, AbstractC0097At1 abstractC0097At1) {
        boolean z;
        char c;
        C0487Dt1 c0487Dt1 = new C0487Dt1(abstractC0097At1, this, obj);
        do {
            a i = e52.i();
            a.g.lazySet(abstractC0097At1, i);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.a;
            atomicReferenceFieldUpdater.lazySet(abstractC0097At1, e52);
            c0487Dt1.c = e52;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(i, e52, c0487Dt1)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(i) != e52) {
                    z = false;
                    break;
                }
            }
            if (z) {
                c = c0487Dt1.a(i) == null ? (char) 1 : (char) 2;
            } else {
                c = 0;
            }
            if (c == 1) {
                return true;
            }
        } while (c != 2);
        return false;
    }

    @Override // defpackage.InterfaceC10555ut1
    public final void u(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C10898vt1(m(), null, this);
        }
        l(cancellationException);
    }

    public final boolean C(Object obj) {
        Object K;
        do {
            K = K(y(), obj);
            if (K == AbstractC0747Ft1.a) {
                return false;
            }
            if (K == AbstractC0747Ft1.b) {
                return true;
            }
        } while (K == AbstractC0747Ft1.c);
        return true;
    }
}
