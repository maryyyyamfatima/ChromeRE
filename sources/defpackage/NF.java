package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NF extends AbstractC0986Hp0 implements MF, R90 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(NF.class, "_decision");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(NF.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;
    public final InterfaceC8927q80 i;
    public final E90 j;
    public InterfaceC7447lq0 k;

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0052 A[EDGE_INSN: B:40:0x0052->B:28:0x0052 BREAK  A[LOOP:1: B:21:0x0044->B:39:?], SYNTHETIC] */
    @Override // defpackage.InterfaceC8927q80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Throwable r0 = defpackage.PP2.a(r12)
            r1 = 0
            if (r0 != 0) goto L8
            goto Ld
        L8:
            OZ r12 = new OZ
            r12.<init>(r1, r0)
        Ld:
            int r0 = r11.h
        Lf:
            r5 = 0
            java.lang.Object r8 = r11._state
            boolean r2 = r8 instanceof defpackage.J52
            r9 = 1
            if (r2 == 0) goto L6b
            r2 = r8
            J52 r2 = (defpackage.J52) r2
            boolean r3 = r12 instanceof defpackage.OZ
            if (r3 == 0) goto L1f
            goto L41
        L1f:
            if (r0 == r9) goto L27
            r3 = 2
            if (r0 != r3) goto L25
            goto L27
        L25:
            r3 = r1
            goto L28
        L27:
            r3 = r9
        L28:
            if (r3 != 0) goto L2b
            goto L41
        L2b:
            boolean r3 = r2 instanceof defpackage.IF
            if (r3 == 0) goto L41
            MZ r10 = new MZ
            if (r3 == 0) goto L36
            IF r2 = (defpackage.IF) r2
            goto L37
        L36:
            r2 = 0
        L37:
            r4 = r2
            r6 = 0
            r7 = 16
            r2 = r10
            r3 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            goto L42
        L41:
            r10 = r12
        L42:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.NF.m
        L44:
            boolean r3 = r2.compareAndSet(r11, r8, r10)
            if (r3 == 0) goto L4b
            goto L52
        L4b:
            java.lang.Object r3 = r2.get(r11)
            if (r3 == r8) goto L44
            r9 = r1
        L52:
            if (r9 != 0) goto L55
            goto Lf
        L55:
            boolean r12 = r11.o()
            if (r12 != 0) goto L67
            lq0 r12 = r11.k
            if (r12 != 0) goto L60
            goto L67
        L60:
            r12.dispose()
            F52 r12 = defpackage.F52.a
            r11.k = r12
        L67:
            r11.j(r0)
            goto L7c
        L6b:
            boolean r0 = r8 instanceof defpackage.RF
            if (r0 == 0) goto L7d
            RF r8 = (defpackage.RF) r8
            r8.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.RF.c
            boolean r0 = r0.compareAndSet(r8, r1, r9)
            if (r0 == 0) goto L7d
        L7c:
            return
        L7d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed, but proposed with update "
            java.lang.String r12 = defpackage.AbstractC0087Ar1.g(r12, r1)
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.NF.d(java.lang.Object):void");
    }

    @Override // defpackage.AbstractC0986Hp0
    public final InterfaceC8927q80 c() {
        return this.i;
    }

    public NF(InterfaceC8927q80 interfaceC8927q80) {
        super(1);
        this.i = interfaceC8927q80;
        this.j = interfaceC8927q80.getContext();
        this._decision = 0;
        this._state = C10279u5.a;
    }

    @Override // defpackage.InterfaceC8927q80
    public final E90 getContext() {
        return this.j;
    }

    @Override // defpackage.AbstractC0986Hp0
    public final Object h() {
        return this._state;
    }

    public final void l() {
        InterfaceC7447lq0 m2 = m();
        if (m2 != null && (!(this._state instanceof J52))) {
            m2.dispose();
            this.k = F52.a;
        }
    }

    public final boolean o() {
        return (this.h == 2) && ((C0726Fp0) this.i).i();
    }

    @Override // defpackage.R90
    public final R90 b() {
        InterfaceC8927q80 interfaceC8927q80 = this.i;
        if (interfaceC8927q80 instanceof R90) {
            return (R90) interfaceC8927q80;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:            if (r7.k != null) goto L230;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:            m();     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:            if (r0 == false) goto L245;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:            r0 = r7.i;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:            if ((r0 instanceof defpackage.C0726Fp0) == false) goto L234;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:            r0 = (defpackage.C0726Fp0) r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:            if (r0 != null) goto L237;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:            r6 = r0.l(r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:            if (r6 != null) goto L240;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:            r0 = r7.k;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:            if (r0 != null) goto L243;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:            r0.dispose();        r7.k = r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:            i(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:            r0 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:            return defpackage.Q90.COROUTINE_SUSPENDED;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:            if (r0 == false) goto L262;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:            r0 = r7.i;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:            if ((r0 instanceof defpackage.C0726Fp0) == false) goto L251;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:            r0 = (defpackage.C0726Fp0) r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:            if (r0 != null) goto L254;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:            r6 = r0.l(r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:            if (r6 != null) goto L257;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:            r0 = r7.k;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:            if (r0 != null) goto L260;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:            r0.dispose();        r7.k = r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:            i(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:            r0 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:            r0 = r7._state;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:            if ((r0 instanceof defpackage.OZ) != false) goto L279;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:            r1 = r7.h;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:            if (r1 == 1) goto L269;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:            if (r1 != 2) goto L268;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0086, code lost:            r3 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:            if (r3 == false) goto L277;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0089, code lost:            r1 = (defpackage.InterfaceC10555ut1) r7.j.b(defpackage.C10212tt1.a);     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0093, code lost:            if (r1 == null) goto L277;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0099, code lost:            if (r1.c() == false) goto L275;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009c, code lost:            r1 = r1.i();        a(r0, r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a3, code lost:            throw r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a8, code lost:            return f(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ad, code lost:            throw ((defpackage.OZ) r0).a;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:            r5 = defpackage.F52.a;        r6 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:            if (r1 == false) goto L247;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k() {
        /*
            r7 = this;
            boolean r0 = r7.o()
        L4:
            int r1 = r7._decision
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1b
            if (r1 != r2) goto Lf
            r1 = r4
            goto L24
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.NF.l
            boolean r1 = r1.compareAndSet(r7, r4, r3)
            if (r1 == 0) goto L4
            r1 = r3
        L24:
            F52 r5 = defpackage.F52.a
            r6 = 0
            if (r1 == 0) goto L56
            lq0 r1 = r7.k
            if (r1 != 0) goto L30
            r7.m()
        L30:
            if (r0 == 0) goto L53
            q80 r0 = r7.i
            boolean r1 = r0 instanceof defpackage.C0726Fp0
            if (r1 == 0) goto L3b
            Fp0 r0 = (defpackage.C0726Fp0) r0
            goto L3c
        L3b:
            r0 = r6
        L3c:
            if (r0 != 0) goto L3f
            goto L43
        L3f:
            java.lang.Throwable r6 = r0.l(r7)
        L43:
            if (r6 != 0) goto L46
            goto L53
        L46:
            lq0 r0 = r7.k
            if (r0 != 0) goto L4b
            goto L50
        L4b:
            r0.dispose()
            r7.k = r5
        L50:
            r7.i(r6)
        L53:
            Q90 r0 = defpackage.Q90.COROUTINE_SUSPENDED
            return r0
        L56:
            if (r0 == 0) goto L79
            q80 r0 = r7.i
            boolean r1 = r0 instanceof defpackage.C0726Fp0
            if (r1 == 0) goto L61
            Fp0 r0 = (defpackage.C0726Fp0) r0
            goto L62
        L61:
            r0 = r6
        L62:
            if (r0 != 0) goto L65
            goto L69
        L65:
            java.lang.Throwable r6 = r0.l(r7)
        L69:
            if (r6 != 0) goto L6c
            goto L79
        L6c:
            lq0 r0 = r7.k
            if (r0 != 0) goto L71
            goto L76
        L71:
            r0.dispose()
            r7.k = r5
        L76:
            r7.i(r6)
        L79:
            java.lang.Object r0 = r7._state
            boolean r1 = r0 instanceof defpackage.OZ
            if (r1 != 0) goto La9
            int r1 = r7.h
            if (r1 == r3) goto L87
            if (r1 != r2) goto L86
            goto L87
        L86:
            r3 = r4
        L87:
            if (r3 == 0) goto La4
            E90 r1 = r7.j
            tt1 r2 = defpackage.C10212tt1.a
            B90 r1 = r1.b(r2)
            ut1 r1 = (defpackage.InterfaceC10555ut1) r1
            if (r1 == 0) goto La4
            boolean r2 = r1.c()
            if (r2 == 0) goto L9c
            goto La4
        L9c:
            java.util.concurrent.CancellationException r1 = r1.i()
            r7.a(r0, r1)
            throw r1
        La4:
            java.lang.Object r0 = r7.f(r0)
            return r0
        La9:
            OZ r0 = (defpackage.OZ) r0
            java.lang.Throwable r0 = r0.a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.NF.k():java.lang.Object");
    }

    public final InterfaceC7447lq0 m() {
        InterfaceC10555ut1 interfaceC10555ut1 = (InterfaceC10555ut1) this.j.b(C10212tt1.a);
        if (interfaceC10555ut1 == null) {
            return null;
        }
        InterfaceC7447lq0 a = AbstractC9869st1.a(interfaceC10555ut1, true, new C12069zJ(this), 2);
        this.k = a;
        return a;
    }

    public static void p(Object obj, VD1 vd1) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + vd1 + ", already has " + obj).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(VD1 vd1) {
        IF c2946Wr1 = vd1 instanceof IF ? (IF) vd1 : new C2946Wr1(vd1);
        while (true) {
            Object obj = this._state;
            boolean z = true;
            if (obj instanceof C10279u5) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c2946Wr1)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                if (obj instanceof IF) {
                    p(obj, vd1);
                    throw null;
                }
                boolean z2 = obj instanceof OZ;
                if (z2) {
                    OZ oz = (OZ) obj;
                    oz.getClass();
                    if (!OZ.b.compareAndSet(oz, 0, 1)) {
                        p(obj, vd1);
                        throw null;
                    }
                    if (obj instanceof RF) {
                        if (!z2) {
                            oz = null;
                        }
                        try {
                            vd1.b(oz != null ? oz.a : null);
                            return;
                        } catch (Throwable th) {
                            O90.a(this.j, new QZ(AbstractC0087Ar1.g(this, "Exception in invokeOnCancellation handler for "), th));
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof MZ) {
                    MZ mz = (MZ) obj;
                    if (mz.b != null) {
                        p(obj, vd1);
                        throw null;
                    }
                    Throwable th2 = mz.e;
                    if (!(th2 != null)) {
                        MZ a = MZ.a(mz, c2946Wr1, null, 29);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m;
                        while (true) {
                            if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, a)) {
                                break;
                            } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            return;
                        }
                    } else {
                        try {
                            vd1.b(th2);
                            return;
                        } catch (Throwable th3) {
                            O90.a(this.j, new QZ(AbstractC0087Ar1.g(this, "Exception in invokeOnCancellation handler for "), th3));
                            return;
                        }
                    }
                } else {
                    MZ mz2 = new MZ(obj, c2946Wr1, (InterfaceC7670mV0) null, (CancellationException) null, 28);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = m;
                    while (true) {
                        if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, mz2)) {
                            break;
                        } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.AbstractC0986Hp0
    public final Object f(Object obj) {
        return obj instanceof MZ ? ((MZ) obj).a : obj;
    }

    @Override // defpackage.AbstractC0986Hp0
    public final Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e == null) {
            return null;
        }
        return e;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC6711ji0.b(this.i));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof J52) {
            str = "Active";
        } else {
            str = obj instanceof RF ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC6711ji0.a(this));
        return sb.toString();
    }

    @Override // defpackage.AbstractC0986Hp0
    public final void a(Object obj, CancellationException cancellationException) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof J52) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof OZ) {
                return;
            }
            boolean z = true;
            if (obj2 instanceof MZ) {
                MZ mz = (MZ) obj2;
                if (!(!(mz.e != null))) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                MZ a = MZ.a(mz, null, cancellationException, 15);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    IF r11 = mz.b;
                    if (r11 != null) {
                        try {
                            ((C2946Wr1) r11).a.b(cancellationException);
                        } catch (Throwable th) {
                            O90.a(this.j, new QZ(AbstractC0087Ar1.g(this, "Exception in invokeOnCancellation handler for "), th));
                        }
                    }
                    InterfaceC7670mV0 interfaceC7670mV0 = mz.c;
                    if (interfaceC7670mV0 == null) {
                        return;
                    }
                    try {
                        interfaceC7670mV0.b(cancellationException);
                        return;
                    } catch (Throwable th2) {
                        O90.a(this.j, new QZ(AbstractC0087Ar1.g(this, "Exception in resume onCancellation handler for "), th2));
                        return;
                    }
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m;
                MZ mz2 = new MZ(obj2, (IF) null, (InterfaceC7670mV0) null, cancellationException, 14);
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, mz2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    public final boolean i(Throwable th) {
        Object obj;
        boolean z;
        boolean z2;
        InterfaceC7447lq0 interfaceC7447lq0;
        do {
            obj = this._state;
            z = false;
            if (!(obj instanceof J52)) {
                return false;
            }
            z2 = obj instanceof IF;
            RF rf = new RF(this, th, z2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, rf)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        } while (!z);
        IF r0 = z2 ? (IF) obj : null;
        if (r0 != null) {
            try {
                ((C2946Wr1) r0).a.b(th);
            } catch (Throwable th2) {
                O90.a(this.j, new QZ(AbstractC0087Ar1.g(this, "Exception in invokeOnCancellation handler for "), th2));
            }
        }
        if (!o() && (interfaceC7447lq0 = this.k) != null) {
            interfaceC7447lq0.dispose();
            this.k = F52.a;
        }
        j(this.h);
        return true;
    }

    /* JADX WARN: Finally extract failed */
    public final void j(int i) {
        boolean z;
        while (true) {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                z = false;
            } else if (l.compareAndSet(this, 0, 2)) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        InterfaceC8927q80 interfaceC8927q80 = this.i;
        boolean z2 = i == 4;
        if (!z2 && (interfaceC8927q80 instanceof C0726Fp0)) {
            boolean z3 = i == 1 || i == 2;
            int i3 = this.h;
            if (z3 == (i3 == 1 || i3 == 2)) {
                L90 l90 = ((C0726Fp0) interfaceC8927q80).i;
                E90 context = interfaceC8927q80.getContext();
                if (l90.C()) {
                    l90.y(context, this);
                    return;
                }
                AbstractC8611pD0 a = AbstractC10706vK3.a();
                if (a.h >= 4294967296L) {
                    a.I(this);
                    return;
                }
                a.O(true);
                try {
                    AbstractC1116Ip0.a(this, this.i, true);
                    do {
                    } while (a.P());
                } catch (Throwable th) {
                    try {
                        g(th, null);
                    } finally {
                        a.F();
                    }
                }
                return;
            }
        }
        AbstractC1116Ip0.a(this, interfaceC8927q80, z2);
    }
}
