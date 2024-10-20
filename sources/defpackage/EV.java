package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EV implements FH2 {
    public final DV a;
    public int b;
    public int c;
    public int d = 0;

    public EV(DV dv) {
        Charset charset = AbstractC1507Lp1.a;
        this.a = dv;
        dv.d = this;
    }

    @Override // defpackage.FH2
    public final int z() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.B();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // defpackage.FH2
    public final int getTag() {
        return this.b;
    }

    @Override // defpackage.FH2
    public final boolean G() {
        int i;
        DV dv = this.a;
        if (dv.e() || (i = this.b) == this.c) {
            return false;
        }
        return dv.E(i);
    }

    public final void U(int i) {
        if ((this.b & 7) != i) {
            throw C1127Ir1.d();
        }
    }

    @Override // defpackage.FH2
    public final double readDouble() {
        U(1);
        return this.a.n();
    }

    @Override // defpackage.FH2
    public final float readFloat() {
        U(5);
        return this.a.r();
    }

    @Override // defpackage.FH2
    public final long c() {
        U(0);
        return this.a.D();
    }

    @Override // defpackage.FH2
    public final long M() {
        U(0);
        return this.a.t();
    }

    @Override // defpackage.FH2
    public final int F() {
        U(0);
        return this.a.s();
    }

    @Override // defpackage.FH2
    public final long d() {
        U(1);
        return this.a.q();
    }

    @Override // defpackage.FH2
    public final int h() {
        U(5);
        return this.a.p();
    }

    @Override // defpackage.FH2
    public final boolean i() {
        U(0);
        return this.a.k();
    }

    @Override // defpackage.FH2
    public final String w() {
        U(2);
        return this.a.z();
    }

    @Override // defpackage.FH2
    public final String N() {
        U(2);
        return this.a.A();
    }

    @Override // defpackage.FH2
    public final Object a(Class cls, XF0 xf0) {
        U(2);
        return R(C7931nE2.c.b(cls), xf0);
    }

    @Override // defpackage.FH2
    public final Object A(QW2 qw2, XF0 xf0) {
        U(2);
        return R(qw2, xf0);
    }

    @Override // defpackage.FH2
    public final Object L(Class cls, XF0 xf0) {
        U(3);
        return Q(C7931nE2.c.b(cls), xf0);
    }

    @Override // defpackage.FH2
    public final Object y(QW2 qw2, XF0 xf0) {
        U(3);
        return Q(qw2, xf0);
    }

    public final Object R(QW2 qw2, XF0 xf0) {
        DV dv = this.a;
        int C = dv.C();
        if (dv.a >= dv.b) {
            throw new C1127Ir1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int j = dv.j(C);
        Object i = qw2.i();
        dv.a++;
        qw2.e(i, this, xf0);
        qw2.b(i);
        dv.a(0);
        dv.a--;
        dv.i(j);
        return i;
    }

    public final Object Q(QW2 qw2, XF0 xf0) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object i2 = qw2.i();
            qw2.e(i2, this, xf0);
            qw2.b(i2);
            if (this.b == this.c) {
                return i2;
            }
            throw C1127Ir1.g();
        } finally {
            this.c = i;
        }
    }

    @Override // defpackage.FH2
    public final AbstractC4147cE D() {
        U(2);
        return this.a.m();
    }

    @Override // defpackage.FH2
    public final int m() {
        U(0);
        return this.a.C();
    }

    @Override // defpackage.FH2
    public final int r() {
        U(0);
        return this.a.o();
    }

    @Override // defpackage.FH2
    public final int H() {
        U(5);
        return this.a.v();
    }

    @Override // defpackage.FH2
    public final long k() {
        U(1);
        return this.a.w();
    }

    @Override // defpackage.FH2
    public final int t() {
        U(0);
        return this.a.x();
    }

    @Override // defpackage.FH2
    public final long u() {
        U(0);
        return this.a.y();
    }

    @Override // defpackage.FH2
    public final void J(List list) {
        int B;
        int B2;
        boolean z = list instanceof AbstractC2420Sq0;
        DV dv = this.a;
        if (z) {
            AbstractC2420Sq0 abstractC2420Sq0 = (AbstractC2420Sq0) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i == 2) {
                    int C = dv.C();
                    W(C);
                    int d = dv.d() + C;
                    do {
                        abstractC2420Sq0.d(dv.n());
                    } while (dv.d() < d);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                abstractC2420Sq0.d(dv.n());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int C2 = dv.C();
                W(C2);
                int d2 = dv.d() + C2;
                do {
                    list.add(Double.valueOf(dv.n()));
                } while (dv.d() < d2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Double.valueOf(dv.n()));
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void E(List list) {
        int B;
        int B2;
        boolean z = list instanceof C4208cQ0;
        DV dv = this.a;
        if (z) {
            C4208cQ0 c4208cQ0 = (C4208cQ0) list;
            int i = this.b & 7;
            if (i == 2) {
                int C = dv.C();
                V(C);
                int d = dv.d() + C;
                do {
                    c4208cQ0.d(dv.r());
                } while (dv.d() < d);
                return;
            }
            if (i != 5) {
                throw C1127Ir1.d();
            }
            do {
                c4208cQ0.d(dv.r());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 == 2) {
            int C2 = dv.C();
            V(C2);
            int d2 = dv.d() + C2;
            do {
                list.add(Float.valueOf(dv.r()));
            } while (dv.d() < d2);
            return;
        }
        if (i2 != 5) {
            throw C1127Ir1.d();
        }
        do {
            list.add(Float.valueOf(dv.r()));
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void l(List list) {
        int B;
        int B2;
        boolean z = list instanceof DI1;
        DV dv = this.a;
        if (z) {
            DI1 di1 = (DI1) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int d = dv.d() + dv.C();
                    do {
                        di1.d(dv.D());
                    } while (dv.d() < d);
                    T(d);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                di1.d(dv.D());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int d2 = dv.d() + dv.C();
                do {
                    list.add(Long.valueOf(dv.D()));
                } while (dv.d() < d2);
                T(d2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Long.valueOf(dv.D()));
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void n(List list) {
        int B;
        int B2;
        boolean z = list instanceof DI1;
        DV dv = this.a;
        if (z) {
            DI1 di1 = (DI1) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int d = dv.d() + dv.C();
                    do {
                        di1.d(dv.t());
                    } while (dv.d() < d);
                    T(d);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                di1.d(dv.t());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int d2 = dv.d() + dv.C();
                do {
                    list.add(Long.valueOf(dv.t()));
                } while (dv.d() < d2);
                T(d2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Long.valueOf(dv.t()));
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void p(List list) {
        int B;
        int B2;
        boolean z = list instanceof C0072Ao1;
        DV dv = this.a;
        if (z) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int d = dv.d() + dv.C();
                    do {
                        c0072Ao1.d(dv.s());
                    } while (dv.d() < d);
                    T(d);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                c0072Ao1.d(dv.s());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int d2 = dv.d() + dv.C();
                do {
                    list.add(Integer.valueOf(dv.s()));
                } while (dv.d() < d2);
                T(d2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Integer.valueOf(dv.s()));
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void O(List list) {
        int B;
        int B2;
        boolean z = list instanceof DI1;
        DV dv = this.a;
        if (z) {
            DI1 di1 = (DI1) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i == 2) {
                    int C = dv.C();
                    W(C);
                    int d = dv.d() + C;
                    do {
                        di1.d(dv.q());
                    } while (dv.d() < d);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                di1.d(dv.q());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int C2 = dv.C();
                W(C2);
                int d2 = dv.d() + C2;
                do {
                    list.add(Long.valueOf(dv.q()));
                } while (dv.d() < d2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Long.valueOf(dv.q()));
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void s(List list) {
        int B;
        int B2;
        boolean z = list instanceof C0072Ao1;
        DV dv = this.a;
        if (z) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            int i = this.b & 7;
            if (i == 2) {
                int C = dv.C();
                V(C);
                int d = dv.d() + C;
                do {
                    c0072Ao1.d(dv.p());
                } while (dv.d() < d);
                return;
            }
            if (i != 5) {
                throw C1127Ir1.d();
            }
            do {
                c0072Ao1.d(dv.p());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 == 2) {
            int C2 = dv.C();
            V(C2);
            int d2 = dv.d() + C2;
            do {
                list.add(Integer.valueOf(dv.p()));
            } while (dv.d() < d2);
            return;
        }
        if (i2 != 5) {
            throw C1127Ir1.d();
        }
        do {
            list.add(Integer.valueOf(dv.p()));
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void v(List list) {
        int B;
        int B2;
        boolean z = list instanceof AbstractC7225lB;
        DV dv = this.a;
        if (z) {
            AbstractC7225lB abstractC7225lB = (AbstractC7225lB) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int d = dv.d() + dv.C();
                    do {
                        abstractC7225lB.d(dv.k());
                    } while (dv.d() < d);
                    T(d);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                abstractC7225lB.d(dv.k());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int d2 = dv.d() + dv.C();
                do {
                    list.add(Boolean.valueOf(dv.k()));
                } while (dv.d() < d2);
                T(d2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Boolean.valueOf(dv.k()));
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void B(List list) {
        S(list, false);
    }

    @Override // defpackage.FH2
    public final void C(List list) {
        S(list, true);
    }

    public final void S(List list, boolean z) {
        int B;
        int B2;
        if ((this.b & 7) != 2) {
            throw C1127Ir1.d();
        }
        boolean z2 = list instanceof InterfaceC6812jz1;
        DV dv = this.a;
        if (z2 && !z) {
            InterfaceC6812jz1 interfaceC6812jz1 = (InterfaceC6812jz1) list;
            do {
                interfaceC6812jz1.h(D());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        do {
            list.add(z ? N() : w());
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void j(List list, QW2 qw2, XF0 xf0) {
        int B;
        int i = this.b;
        if ((i & 7) != 2) {
            int i2 = C1127Ir1.h;
            throw new C0997Hr1();
        }
        do {
            list.add(R(qw2, xf0));
            DV dv = this.a;
            if (dv.e() || this.d != 0) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == i);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void K(List list, QW2 qw2, XF0 xf0) {
        int B;
        int i = this.b;
        if ((i & 7) != 3) {
            int i2 = C1127Ir1.h;
            throw new C0997Hr1();
        }
        do {
            list.add(Q(qw2, xf0));
            DV dv = this.a;
            if (dv.e() || this.d != 0) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == i);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void I(List list) {
        int B;
        if ((this.b & 7) != 2) {
            throw C1127Ir1.d();
        }
        do {
            list.add(D());
            DV dv = this.a;
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void g(List list) {
        int B;
        int B2;
        boolean z = list instanceof C0072Ao1;
        DV dv = this.a;
        if (z) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int d = dv.d() + dv.C();
                    do {
                        c0072Ao1.d(dv.C());
                    } while (dv.d() < d);
                    T(d);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                c0072Ao1.d(dv.C());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int d2 = dv.d() + dv.C();
                do {
                    list.add(Integer.valueOf(dv.C()));
                } while (dv.d() < d2);
                T(d2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Integer.valueOf(dv.C()));
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void q(List list) {
        int B;
        int B2;
        boolean z = list instanceof C0072Ao1;
        DV dv = this.a;
        if (z) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int d = dv.d() + dv.C();
                    do {
                        c0072Ao1.d(dv.o());
                    } while (dv.d() < d);
                    T(d);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                c0072Ao1.d(dv.o());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int d2 = dv.d() + dv.C();
                do {
                    list.add(Integer.valueOf(dv.o()));
                } while (dv.d() < d2);
                T(d2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Integer.valueOf(dv.o()));
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void e(List list) {
        int B;
        int B2;
        boolean z = list instanceof C0072Ao1;
        DV dv = this.a;
        if (z) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            int i = this.b & 7;
            if (i == 2) {
                int C = dv.C();
                V(C);
                int d = dv.d() + C;
                do {
                    c0072Ao1.d(dv.v());
                } while (dv.d() < d);
                return;
            }
            if (i != 5) {
                throw C1127Ir1.d();
            }
            do {
                c0072Ao1.d(dv.v());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 == 2) {
            int C2 = dv.C();
            V(C2);
            int d2 = dv.d() + C2;
            do {
                list.add(Integer.valueOf(dv.v()));
            } while (dv.d() < d2);
            return;
        }
        if (i2 != 5) {
            throw C1127Ir1.d();
        }
        do {
            list.add(Integer.valueOf(dv.v()));
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void o(List list) {
        int B;
        int B2;
        boolean z = list instanceof DI1;
        DV dv = this.a;
        if (z) {
            DI1 di1 = (DI1) list;
            int i = this.b & 7;
            if (i != 1) {
                if (i == 2) {
                    int C = dv.C();
                    W(C);
                    int d = dv.d() + C;
                    do {
                        di1.d(dv.w());
                    } while (dv.d() < d);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                di1.d(dv.w());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int C2 = dv.C();
                W(C2);
                int d2 = dv.d() + C2;
                do {
                    list.add(Long.valueOf(dv.w()));
                } while (dv.d() < d2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Long.valueOf(dv.w()));
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void b(List list) {
        int B;
        int B2;
        boolean z = list instanceof C0072Ao1;
        DV dv = this.a;
        if (z) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int d = dv.d() + dv.C();
                    do {
                        c0072Ao1.d(dv.x());
                    } while (dv.d() < d);
                    T(d);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                c0072Ao1.d(dv.x());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int d2 = dv.d() + dv.C();
                do {
                    list.add(Integer.valueOf(dv.x()));
                } while (dv.d() < d2);
                T(d2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Integer.valueOf(dv.x()));
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // defpackage.FH2
    public final void f(List list) {
        int B;
        int B2;
        boolean z = list instanceof DI1;
        DV dv = this.a;
        if (z) {
            DI1 di1 = (DI1) list;
            int i = this.b & 7;
            if (i != 0) {
                if (i == 2) {
                    int d = dv.d() + dv.C();
                    do {
                        di1.d(dv.y());
                    } while (dv.d() < d);
                    T(d);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                di1.d(dv.y());
                if (dv.e()) {
                    return;
                } else {
                    B2 = dv.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int i2 = this.b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int d2 = dv.d() + dv.C();
                do {
                    list.add(Long.valueOf(dv.y()));
                } while (dv.d() < d2);
                T(d2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Long.valueOf(dv.y()));
            if (dv.e()) {
                return;
            } else {
                B = dv.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    public final void W(int i) {
        if ((i & 7) != 0) {
            throw C1127Ir1.g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:            r10.put(r3, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:            return;     */
    @Override // defpackage.FH2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(defpackage.OL1 r10, defpackage.LL1 r11, defpackage.XF0 r12) {
        /*
            r9 = this;
            r0 = 2
            r9.U(r0)
            DV r1 = r9.a
            int r2 = r1.C()
            int r2 = r1.j(r2)
            java.lang.Object r3 = r11.b
            java.lang.Object r4 = r11.d
            r5 = r4
        L13:
            int r6 = r9.z()     // Catch: java.lang.Throwable -> L5e
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L57
            boolean r7 = r1.e()     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L23
            goto L57
        L23:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L42
            if (r6 == r0) goto L37
            boolean r6 = r9.G()     // Catch: defpackage.C0997Hr1 -> L4a java.lang.Throwable -> L5e
            if (r6 == 0) goto L31
            goto L13
        L31:
            Ir1 r6 = new Ir1     // Catch: defpackage.C0997Hr1 -> L4a java.lang.Throwable -> L5e
            r6.<init>(r8)     // Catch: defpackage.C0997Hr1 -> L4a java.lang.Throwable -> L5e
            throw r6     // Catch: defpackage.C0997Hr1 -> L4a java.lang.Throwable -> L5e
        L37:
            uq4 r6 = r11.c     // Catch: defpackage.C0997Hr1 -> L4a java.lang.Throwable -> L5e
            java.lang.Class r7 = r4.getClass()     // Catch: defpackage.C0997Hr1 -> L4a java.lang.Throwable -> L5e
            java.lang.Object r5 = r9.P(r6, r7, r12)     // Catch: defpackage.C0997Hr1 -> L4a java.lang.Throwable -> L5e
            goto L13
        L42:
            uq4 r6 = r11.a     // Catch: defpackage.C0997Hr1 -> L4a java.lang.Throwable -> L5e
            r7 = 0
            java.lang.Object r3 = r9.P(r6, r7, r7)     // Catch: defpackage.C0997Hr1 -> L4a java.lang.Throwable -> L5e
            goto L13
        L4a:
            boolean r6 = r9.G()     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L51
            goto L13
        L51:
            Ir1 r10 = new Ir1     // Catch: java.lang.Throwable -> L5e
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L5e
            throw r10     // Catch: java.lang.Throwable -> L5e
        L57:
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L5e
            r1.i(r2)
            return
        L5e:
            r10 = move-exception
            r1.i(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EV.x(OL1, LL1, XF0):void");
    }

    public final Object P(EnumC10540uq4 enumC10540uq4, Class cls, XF0 xf0) {
        switch (enumC10540uq4.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(M());
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return Long.valueOf(c());
            case 4:
                return Integer.valueOf(F());
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return Long.valueOf(d());
            case 6:
                return Integer.valueOf(h());
            case 7:
                return Boolean.valueOf(i());
            case 8:
                return N();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return a(cls, xf0);
            case 11:
                return D();
            case 12:
                return Integer.valueOf(m());
            case 13:
                return Integer.valueOf(r());
            case 14:
                return Integer.valueOf(H());
            case 15:
                return Long.valueOf(k());
            case 16:
                return Integer.valueOf(t());
            case 17:
                return Long.valueOf(u());
        }
    }

    public final void V(int i) {
        if ((i & 3) != 0) {
            throw C1127Ir1.g();
        }
    }

    public final void T(int i) {
        if (this.a.d() != i) {
            throw C1127Ir1.h();
        }
    }
}
