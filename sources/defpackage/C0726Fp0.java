package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fp0 */
/* loaded from: classes.dex */
public final class C0726Fp0 extends AbstractC0986Hp0 implements R90, InterfaceC8927q80 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(C0726Fp0.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;
    public final L90 i;
    public final InterfaceC8927q80 j;
    public Object k;
    public final Object l;

    @Override // defpackage.AbstractC0986Hp0
    public final InterfaceC8927q80 c() {
        return this;
    }

    @Override // defpackage.InterfaceC8927q80
    public final E90 getContext() {
        return this.j.getContext();
    }

    public C0726Fp0(L90 l90, AbstractC9612s80 abstractC9612s80) {
        super(-1);
        this.i = l90;
        this.j = abstractC9612s80;
        this.k = AbstractC0856Gp0.a;
        Object j = getContext().j(0, C8306oK3.g);
        AbstractC0087Ar1.b(j);
        this.l = j;
        this._reusableCancellableContinuation = null;
    }

    @Override // defpackage.R90
    public final R90 b() {
        InterfaceC8927q80 interfaceC8927q80 = this.j;
        if (interfaceC8927q80 instanceof R90) {
            return (R90) interfaceC8927q80;
        }
        return null;
    }

    public final void k() {
        InterfaceC7447lq0 interfaceC7447lq0;
        Object obj = this._reusableCancellableContinuation;
        NF nf = obj instanceof NF ? (NF) obj : null;
        if (nf == null || (interfaceC7447lq0 = nf.k) == null) {
            return;
        }
        interfaceC7447lq0.dispose();
        nf.k = F52.a;
    }

    public final boolean i() {
        return this._reusableCancellableContinuation != null;
    }

    @Override // defpackage.AbstractC0986Hp0
    public final Object h() {
        Object obj = this.k;
        this.k = AbstractC0856Gp0.a;
        return obj;
    }

    @Override // defpackage.InterfaceC8927q80
    public final void d(Object obj) {
        InterfaceC8927q80 interfaceC8927q80 = this.j;
        E90 context = interfaceC8927q80.getContext();
        Throwable a = PP2.a(obj);
        Object oz = a == null ? obj : new OZ(false, a);
        L90 l90 = this.i;
        if (l90.C()) {
            this.k = oz;
            this.h = 0;
            l90.y(context, this);
            return;
        }
        AbstractC8611pD0 a2 = AbstractC10706vK3.a();
        if (a2.h >= 4294967296L) {
            this.k = oz;
            this.h = 0;
            a2.I(this);
            return;
        }
        a2.O(true);
        try {
            E90 context2 = getContext();
            Object b = AbstractC9334rK3.b(context2, this.l);
            try {
                interfaceC8927q80.d(obj);
                do {
                } while (a2.P());
            } finally {
                AbstractC9334rK3.a(context2, b);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // defpackage.AbstractC0986Hp0
    public final void a(Object obj, CancellationException cancellationException) {
        if (obj instanceof PZ) {
            ((PZ) obj).b.b(cancellationException);
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.i + ", " + AbstractC6711ji0.b(this.j) + ']';
    }

    public final Throwable l(MF mf) {
        boolean z;
        do {
            Object obj = this._reusableCancellableContinuation;
            C2823Vs3 c2823Vs3 = AbstractC0856Gp0.b;
            z = false;
            if (obj == c2823Vs3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c2823Vs3, mf)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != c2823Vs3) {
                        break;
                    }
                }
            } else {
                if (obj instanceof Throwable) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                            z = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                    if (!z) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    return (Throwable) obj;
                }
                throw new IllegalStateException(AbstractC0087Ar1.g(obj, "Inconsistent state ").toString());
            }
        } while (!z);
        return null;
    }

    public final boolean j(CancellationException cancellationException) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C2823Vs3 c2823Vs3 = AbstractC0856Gp0.b;
            boolean z = false;
            boolean z2 = true;
            if (AbstractC0087Ar1.a(obj, c2823Vs3)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c2823Vs3, cancellationException)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != c2823Vs3) {
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    return false;
                }
            }
        }
    }
}
