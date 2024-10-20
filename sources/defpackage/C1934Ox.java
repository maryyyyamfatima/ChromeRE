package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ox */
/* loaded from: classes.dex */
public final class C1934Ox implements FH2 {
    public final boolean a = true;
    public final byte[] b;
    public int c;
    public int d;
    public int e;
    public int f;

    public C1934Ox(ByteBuffer byteBuffer) {
        this.b = byteBuffer.array();
        this.c = byteBuffer.position() + byteBuffer.arrayOffset();
        this.d = byteBuffer.limit() + byteBuffer.arrayOffset();
    }

    public final boolean P() {
        return this.c == this.d;
    }

    @Override // defpackage.FH2
    public final int z() {
        if (P()) {
            return Integer.MAX_VALUE;
        }
        int X = X();
        this.e = X;
        if (X == this.f) {
            return Integer.MAX_VALUE;
        }
        return X >>> 3;
    }

    @Override // defpackage.FH2
    public final int getTag() {
        return this.e;
    }

    @Override // defpackage.FH2
    public final boolean G() {
        int i;
        int i2;
        if (P() || (i = this.e) == (i2 = this.f)) {
            return false;
        }
        int i3 = i & 7;
        if (i3 == 0) {
            int i4 = this.d;
            int i5 = this.c;
            int i6 = i4 - i5;
            byte[] bArr = this.b;
            if (i6 >= 10) {
                int i7 = 0;
                while (i7 < 10) {
                    int i8 = i5 + 1;
                    if (bArr[i5] >= 0) {
                        this.c = i8;
                        break;
                    }
                    i7++;
                    i5 = i8;
                }
            }
            for (int i9 = 0; i9 < 10; i9++) {
                int i10 = this.c;
                if (i10 == this.d) {
                    throw C1127Ir1.h();
                }
                this.c = i10 + 1;
                if (bArr[i10] >= 0) {
                    return true;
                }
            }
            throw C1127Ir1.e();
        }
        if (i3 == 1) {
            a0(8);
            this.c += 8;
            return true;
        }
        if (i3 == 2) {
            int X = X();
            a0(X);
            this.c += X;
            return true;
        }
        if (i3 != 3) {
            if (i3 != 5) {
                int i11 = C1127Ir1.h;
                throw new C0997Hr1();
            }
            a0(4);
            this.c += 4;
            return true;
        }
        this.f = ((i >>> 3) << 3) | 4;
        while (z() != Integer.MAX_VALUE && G()) {
        }
        if (this.e != this.f) {
            throw C1127Ir1.g();
        }
        this.f = i2;
        return true;
    }

    @Override // defpackage.FH2
    public final double readDouble() {
        c0(1);
        a0(8);
        return Double.longBitsToDouble(T());
    }

    @Override // defpackage.FH2
    public final float readFloat() {
        c0(5);
        a0(4);
        return Float.intBitsToFloat(S());
    }

    @Override // defpackage.FH2
    public final long c() {
        c0(0);
        return Y();
    }

    @Override // defpackage.FH2
    public final long M() {
        c0(0);
        return Y();
    }

    @Override // defpackage.FH2
    public final int F() {
        c0(0);
        return X();
    }

    @Override // defpackage.FH2
    public final long d() {
        c0(1);
        a0(8);
        return T();
    }

    @Override // defpackage.FH2
    public final int h() {
        c0(5);
        a0(4);
        return S();
    }

    @Override // defpackage.FH2
    public final boolean i() {
        c0(0);
        return X() != 0;
    }

    @Override // defpackage.FH2
    public final String w() {
        return V(false);
    }

    @Override // defpackage.FH2
    public final String N() {
        return V(true);
    }

    public final String V(boolean z) {
        c0(2);
        int X = X();
        if (X == 0) {
            return "";
        }
        a0(X);
        byte[] bArr = this.b;
        if (z) {
            int i = this.c;
            if (!AbstractC7551m74.f(bArr, i, i + X)) {
                throw C1127Ir1.c();
            }
        }
        String str = new String(bArr, this.c, X, AbstractC1507Lp1.a);
        this.c += X;
        return str;
    }

    @Override // defpackage.FH2
    public final Object a(Class cls, XF0 xf0) {
        c0(2);
        return U(C7931nE2.c.b(cls), xf0);
    }

    @Override // defpackage.FH2
    public final Object A(QW2 qw2, XF0 xf0) {
        c0(2);
        return U(qw2, xf0);
    }

    public final Object U(QW2 qw2, XF0 xf0) {
        int X = X();
        a0(X);
        int i = this.d;
        int i2 = this.c + X;
        this.d = i2;
        try {
            Object i3 = qw2.i();
            qw2.e(i3, this, xf0);
            qw2.b(i3);
            if (this.c == i2) {
                return i3;
            }
            throw C1127Ir1.g();
        } finally {
            this.d = i;
        }
    }

    @Override // defpackage.FH2
    public final Object L(Class cls, XF0 xf0) {
        c0(3);
        return R(C7931nE2.c.b(cls), xf0);
    }

    @Override // defpackage.FH2
    public final Object y(QW2 qw2, XF0 xf0) {
        c0(3);
        return R(qw2, xf0);
    }

    public final Object R(QW2 qw2, XF0 xf0) {
        int i = this.f;
        this.f = ((this.e >>> 3) << 3) | 4;
        try {
            Object i2 = qw2.i();
            qw2.e(i2, this, xf0);
            qw2.b(i2);
            if (this.e == this.f) {
                return i2;
            }
            throw C1127Ir1.g();
        } finally {
            this.f = i;
        }
    }

    @Override // defpackage.FH2
    public final AbstractC4147cE D() {
        AbstractC4147cE f;
        c0(2);
        int X = X();
        if (X == 0) {
            return AbstractC4147cE.g;
        }
        a0(X);
        boolean z = this.a;
        byte[] bArr = this.b;
        if (z) {
            int i = this.c;
            ZD zd = AbstractC4147cE.g;
            f = new XD(bArr, i, X);
        } else {
            f = AbstractC4147cE.f(bArr, this.c, X);
        }
        this.c += X;
        return f;
    }

    @Override // defpackage.FH2
    public final int m() {
        c0(0);
        return X();
    }

    @Override // defpackage.FH2
    public final int r() {
        c0(0);
        return X();
    }

    @Override // defpackage.FH2
    public final int H() {
        c0(5);
        a0(4);
        return S();
    }

    @Override // defpackage.FH2
    public final long k() {
        c0(1);
        a0(8);
        return T();
    }

    @Override // defpackage.FH2
    public final int t() {
        c0(0);
        return DV.b(X());
    }

    @Override // defpackage.FH2
    public final long u() {
        c0(0);
        return DV.c(Y());
    }

    @Override // defpackage.FH2
    public final void J(List list) {
        int i;
        int i2;
        if (list instanceof AbstractC2420Sq0) {
            AbstractC2420Sq0 abstractC2420Sq0 = (AbstractC2420Sq0) list;
            int i3 = this.e & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int X = X();
                    e0(X);
                    int i4 = this.c + X;
                    while (this.c < i4) {
                        abstractC2420Sq0.d(Double.longBitsToDouble(T()));
                    }
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                abstractC2420Sq0.d(readDouble());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        int i5 = this.e & 7;
        if (i5 != 1) {
            if (i5 == 2) {
                int X2 = X();
                e0(X2);
                int i6 = this.c + X2;
                while (this.c < i6) {
                    list.add(Double.valueOf(Double.longBitsToDouble(T())));
                }
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Double.valueOf(readDouble()));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void E(List list) {
        int i;
        int i2;
        if (list instanceof C4208cQ0) {
            C4208cQ0 c4208cQ0 = (C4208cQ0) list;
            int i3 = this.e & 7;
            if (i3 == 2) {
                int X = X();
                d0(X);
                int i4 = this.c + X;
                while (this.c < i4) {
                    c4208cQ0.d(Float.intBitsToFloat(S()));
                }
                return;
            }
            if (i3 != 5) {
                throw C1127Ir1.d();
            }
            do {
                c4208cQ0.d(readFloat());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        int i5 = this.e & 7;
        if (i5 == 2) {
            int X2 = X();
            d0(X2);
            int i6 = this.c + X2;
            while (this.c < i6) {
                list.add(Float.valueOf(Float.intBitsToFloat(S())));
            }
            return;
        }
        if (i5 != 5) {
            throw C1127Ir1.d();
        }
        do {
            list.add(Float.valueOf(readFloat()));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void l(List list) {
        int i;
        int i2;
        if (list instanceof DI1) {
            DI1 di1 = (DI1) list;
            int i3 = this.e & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int X = this.c + X();
                    while (this.c < X) {
                        di1.d(Y());
                    }
                    b0(X);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                di1.d(c());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        int i4 = this.e & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int X2 = this.c + X();
                while (this.c < X2) {
                    list.add(Long.valueOf(Y()));
                }
                b0(X2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Long.valueOf(c()));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void n(List list) {
        int i;
        int i2;
        if (list instanceof DI1) {
            DI1 di1 = (DI1) list;
            int i3 = this.e & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int X = this.c + X();
                    while (this.c < X) {
                        di1.d(Y());
                    }
                    b0(X);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                di1.d(M());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        int i4 = this.e & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int X2 = this.c + X();
                while (this.c < X2) {
                    list.add(Long.valueOf(Y()));
                }
                b0(X2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Long.valueOf(M()));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void p(List list) {
        int i;
        int i2;
        if (list instanceof C0072Ao1) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            int i3 = this.e & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int X = this.c + X();
                    while (this.c < X) {
                        c0072Ao1.d(X());
                    }
                    b0(X);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                c0072Ao1.d(F());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        int i4 = this.e & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int X2 = this.c + X();
                while (this.c < X2) {
                    list.add(Integer.valueOf(X()));
                }
                b0(X2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Integer.valueOf(F()));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void O(List list) {
        int i;
        int i2;
        if (list instanceof DI1) {
            DI1 di1 = (DI1) list;
            int i3 = this.e & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int X = X();
                    e0(X);
                    int i4 = this.c + X;
                    while (this.c < i4) {
                        di1.d(T());
                    }
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                di1.d(d());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        int i5 = this.e & 7;
        if (i5 != 1) {
            if (i5 == 2) {
                int X2 = X();
                e0(X2);
                int i6 = this.c + X2;
                while (this.c < i6) {
                    list.add(Long.valueOf(T()));
                }
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Long.valueOf(d()));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void s(List list) {
        int i;
        int i2;
        if (list instanceof C0072Ao1) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            int i3 = this.e & 7;
            if (i3 == 2) {
                int X = X();
                d0(X);
                int i4 = this.c + X;
                while (this.c < i4) {
                    c0072Ao1.d(S());
                }
                return;
            }
            if (i3 != 5) {
                throw C1127Ir1.d();
            }
            do {
                c0072Ao1.d(h());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        int i5 = this.e & 7;
        if (i5 == 2) {
            int X2 = X();
            d0(X2);
            int i6 = this.c + X2;
            while (this.c < i6) {
                list.add(Integer.valueOf(S()));
            }
            return;
        }
        if (i5 != 5) {
            throw C1127Ir1.d();
        }
        do {
            list.add(Integer.valueOf(h()));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void v(List list) {
        int i;
        int i2;
        if (list instanceof AbstractC7225lB) {
            AbstractC7225lB abstractC7225lB = (AbstractC7225lB) list;
            int i3 = this.e & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int X = this.c + X();
                    while (this.c < X) {
                        abstractC7225lB.d(X() != 0);
                    }
                    b0(X);
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                abstractC7225lB.d(i());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        int i4 = this.e & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int X2 = this.c + X();
                while (this.c < X2) {
                    list.add(Boolean.valueOf(X() != 0));
                }
                b0(X2);
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Boolean.valueOf(i()));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void B(List list) {
        W(list, false);
    }

    @Override // defpackage.FH2
    public final void C(List list) {
        W(list, true);
    }

    public final void W(List list, boolean z) {
        int i;
        int i2;
        if ((this.e & 7) != 2) {
            throw C1127Ir1.d();
        }
        if ((list instanceof InterfaceC6812jz1) && !z) {
            InterfaceC6812jz1 interfaceC6812jz1 = (InterfaceC6812jz1) list;
            do {
                interfaceC6812jz1.h(D());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        do {
            list.add(V(z));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void j(List list, QW2 qw2, XF0 xf0) {
        int i;
        int i2 = this.e;
        if ((i2 & 7) != 2) {
            int i3 = C1127Ir1.h;
            throw new C0997Hr1();
        }
        do {
            list.add(U(qw2, xf0));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == i2);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void K(List list, QW2 qw2, XF0 xf0) {
        int i;
        int i2 = this.e;
        if ((i2 & 7) != 3) {
            int i3 = C1127Ir1.h;
            throw new C0997Hr1();
        }
        do {
            list.add(R(qw2, xf0));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == i2);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void I(List list) {
        int i;
        if ((this.e & 7) != 2) {
            throw C1127Ir1.d();
        }
        do {
            list.add(D());
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void g(List list) {
        int i;
        int i2;
        if (list instanceof C0072Ao1) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            int i3 = this.e & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int X = this.c + X();
                    while (this.c < X) {
                        c0072Ao1.d(X());
                    }
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                c0072Ao1.d(m());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        int i4 = this.e & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int X2 = this.c + X();
                while (this.c < X2) {
                    list.add(Integer.valueOf(X()));
                }
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Integer.valueOf(m()));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void q(List list) {
        int i;
        int i2;
        if (list instanceof C0072Ao1) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            int i3 = this.e & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int X = this.c + X();
                    while (this.c < X) {
                        c0072Ao1.d(X());
                    }
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                c0072Ao1.d(r());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        int i4 = this.e & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int X2 = this.c + X();
                while (this.c < X2) {
                    list.add(Integer.valueOf(X()));
                }
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Integer.valueOf(r()));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void e(List list) {
        int i;
        int i2;
        if (list instanceof C0072Ao1) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            int i3 = this.e & 7;
            if (i3 == 2) {
                int X = X();
                d0(X);
                int i4 = this.c + X;
                while (this.c < i4) {
                    c0072Ao1.d(S());
                }
                return;
            }
            if (i3 != 5) {
                throw C1127Ir1.d();
            }
            do {
                c0072Ao1.d(H());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        int i5 = this.e & 7;
        if (i5 == 2) {
            int X2 = X();
            d0(X2);
            int i6 = this.c + X2;
            while (this.c < i6) {
                list.add(Integer.valueOf(S()));
            }
            return;
        }
        if (i5 != 5) {
            throw C1127Ir1.d();
        }
        do {
            list.add(Integer.valueOf(H()));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void o(List list) {
        int i;
        int i2;
        if (list instanceof DI1) {
            DI1 di1 = (DI1) list;
            int i3 = this.e & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int X = X();
                    e0(X);
                    int i4 = this.c + X;
                    while (this.c < i4) {
                        di1.d(T());
                    }
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                di1.d(k());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        int i5 = this.e & 7;
        if (i5 != 1) {
            if (i5 == 2) {
                int X2 = X();
                e0(X2);
                int i6 = this.c + X2;
                while (this.c < i6) {
                    list.add(Long.valueOf(T()));
                }
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Long.valueOf(k()));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void b(List list) {
        int i;
        int i2;
        if (list instanceof C0072Ao1) {
            C0072Ao1 c0072Ao1 = (C0072Ao1) list;
            int i3 = this.e & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int X = this.c + X();
                    while (this.c < X) {
                        c0072Ao1.d(DV.b(X()));
                    }
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                c0072Ao1.d(t());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        int i4 = this.e & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int X2 = this.c + X();
                while (this.c < X2) {
                    list.add(Integer.valueOf(DV.b(X())));
                }
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Integer.valueOf(t()));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void f(List list) {
        int i;
        int i2;
        if (list instanceof DI1) {
            DI1 di1 = (DI1) list;
            int i3 = this.e & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int X = this.c + X();
                    while (this.c < X) {
                        di1.d(DV.c(Y()));
                    }
                    return;
                }
                throw C1127Ir1.d();
            }
            do {
                di1.d(u());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (X() == this.e);
            this.c = i2;
            return;
        }
        int i4 = this.e & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int X2 = this.c + X();
                while (this.c < X2) {
                    list.add(Long.valueOf(DV.c(Y())));
                }
                return;
            }
            throw C1127Ir1.d();
        }
        do {
            list.add(Long.valueOf(u()));
            if (P()) {
                return;
            } else {
                i = this.c;
            }
        } while (X() == this.e);
        this.c = i;
    }

    @Override // defpackage.FH2
    public final void x(OL1 ol1, LL1 ll1, XF0 xf0) {
        c0(2);
        int X = X();
        a0(X);
        int i = this.d;
        this.d = this.c + X;
        try {
            Object obj = ll1.b;
            Object obj2 = ll1.d;
            Object obj3 = obj2;
            while (true) {
                int z = z();
                if (z == Integer.MAX_VALUE) {
                    ol1.put(obj, obj3);
                    return;
                }
                if (z == 1) {
                    obj = Q(ll1.a, null, null);
                } else if (z == 2) {
                    obj3 = Q(ll1.c, obj2.getClass(), xf0);
                } else {
                    try {
                        if (!G()) {
                            throw new C1127Ir1("Unable to parse map entry.");
                            break;
                        }
                    } catch (C0997Hr1 unused) {
                        if (!G()) {
                            throw new C1127Ir1("Unable to parse map entry.");
                        }
                    }
                }
            }
        } finally {
            this.d = i;
        }
    }

    public final Object Q(EnumC10540uq4 enumC10540uq4, Class cls, XF0 xf0) {
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
                return V(true);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
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

    public final int X() {
        int i;
        int i2 = this.c;
        int i3 = this.d;
        if (i3 == i2) {
            throw C1127Ir1.h();
        }
        int i4 = i2 + 1;
        byte[] bArr = this.b;
        byte b = bArr[i2];
        if (b >= 0) {
            this.c = i4;
            return b;
        }
        if (i3 - i4 < 9) {
            return (int) Z();
        }
        int i5 = i4 + 1;
        int i6 = b ^ (bArr[i4] << 7);
        if (i6 < 0) {
            i = i6 ^ (-128);
        } else {
            int i7 = i5 + 1;
            int i8 = i6 ^ (bArr[i5] << 14);
            if (i8 >= 0) {
                i = i8 ^ 16256;
            } else {
                i5 = i7 + 1;
                int i9 = i8 ^ (bArr[i7] << 21);
                if (i9 < 0) {
                    i = i9 ^ (-2080896);
                } else {
                    i7 = i5 + 1;
                    byte b2 = bArr[i5];
                    i = (i9 ^ (b2 << 28)) ^ 266354560;
                    if (b2 < 0) {
                        i5 = i7 + 1;
                        if (bArr[i7] < 0) {
                            i7 = i5 + 1;
                            if (bArr[i5] < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            throw C1127Ir1.e();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i5 = i7;
        }
        this.c = i5;
        return i;
    }

    public final long Y() {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.c;
        int i3 = this.d;
        if (i3 == i2) {
            throw C1127Ir1.h();
        }
        int i4 = i2 + 1;
        byte[] bArr = this.b;
        byte b = bArr[i2];
        if (b >= 0) {
            this.c = i4;
            return b;
        }
        if (i3 - i4 < 9) {
            return Z();
        }
        int i5 = i4 + 1;
        int i6 = b ^ (bArr[i4] << 7);
        if (i6 >= 0) {
            int i7 = i5 + 1;
            int i8 = i6 ^ (bArr[i5] << 14);
            if (i8 >= 0) {
                j = i8 ^ 16256;
            } else {
                i5 = i7 + 1;
                int i9 = i8 ^ (bArr[i7] << 21);
                if (i9 >= 0) {
                    long j4 = i9;
                    int i10 = i5 + 1;
                    long j5 = (bArr[i5] << 28) ^ j4;
                    if (j5 >= 0) {
                        j2 = j5 ^ 266354560;
                        i5 = i10;
                    } else {
                        int i11 = i10 + 1;
                        long j6 = j5 ^ (bArr[i10] << 35);
                        if (j6 < 0) {
                            j3 = -34093383808L;
                        } else {
                            i7 = i11 + 1;
                            long j7 = j6 ^ (bArr[i11] << 42);
                            if (j7 >= 0) {
                                j = j7 ^ 4363953127296L;
                            } else {
                                i11 = i7 + 1;
                                j6 = j7 ^ (bArr[i7] << 49);
                                if (j6 < 0) {
                                    j3 = -558586000294016L;
                                } else {
                                    i7 = i11 + 1;
                                    j = (j6 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                    if (j < 0) {
                                        i11 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            throw C1127Ir1.e();
                                        }
                                        j2 = j;
                                        i5 = i11;
                                    }
                                }
                            }
                        }
                        j2 = j3 ^ j6;
                        i5 = i11;
                    }
                    this.c = i5;
                    return j2;
                }
                i = i9 ^ (-2080896);
            }
            i5 = i7;
            j2 = j;
            this.c = i5;
            return j2;
        }
        i = i6 ^ (-128);
        j2 = i;
        this.c = i5;
        return j2;
    }

    public final long Z() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.c;
            if (i2 == this.d) {
                throw C1127Ir1.h();
            }
            this.c = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.b[i2] & 128) == 0) {
                return j;
            }
        }
        throw C1127Ir1.e();
    }

    public final int S() {
        int i = this.c;
        this.c = i + 4;
        byte[] bArr = this.b;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long T() {
        this.c = this.c + 8;
        byte[] bArr = this.b;
        return ((bArr[r0 + 7] & 255) << 56) | (bArr[r0] & 255) | ((bArr[r0 + 1] & 255) << 8) | ((bArr[r0 + 2] & 255) << 16) | ((bArr[r0 + 3] & 255) << 24) | ((bArr[r0 + 4] & 255) << 32) | ((bArr[r0 + 5] & 255) << 40) | ((bArr[r0 + 6] & 255) << 48);
    }

    public final void a0(int i) {
        if (i < 0 || i > this.d - this.c) {
            throw C1127Ir1.h();
        }
    }

    public final void c0(int i) {
        if ((this.e & 7) != i) {
            throw C1127Ir1.d();
        }
    }

    public final void e0(int i) {
        a0(i);
        if ((i & 7) != 0) {
            throw C1127Ir1.g();
        }
    }

    public final void d0(int i) {
        a0(i);
        if ((i & 3) != 0) {
            throw C1127Ir1.g();
        }
    }

    public final void b0(int i) {
        if (this.c != i) {
            throw C1127Ir1.h();
        }
    }
}
