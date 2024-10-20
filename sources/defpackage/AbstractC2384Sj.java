package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sj */
/* loaded from: classes.dex */
public abstract class AbstractC2384Sj {
    public static int H(byte[] bArr, int i, C2254Rj c2254Rj) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c2254Rj.a = b;
            return i2;
        }
        return G(b, bArr, i2, c2254Rj);
    }

    public static int G(int i, byte[] bArr, int i2, C2254Rj c2254Rj) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c2254Rj.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c2254Rj.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c2254Rj.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c2254Rj.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c2254Rj.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int J(byte[] bArr, int i, C2254Rj c2254Rj) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c2254Rj.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        c2254Rj.b = j2;
        return i3;
    }

    public static int g(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long i(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static double d(int i, byte[] bArr) {
        return Double.longBitsToDouble(i(i, bArr));
    }

    public static float k(int i, byte[] bArr) {
        return Float.intBitsToFloat(g(i, bArr));
    }

    public static int B(byte[] bArr, int i, C2254Rj c2254Rj) {
        int H = H(bArr, i, c2254Rj);
        int i2 = c2254Rj.a;
        if (i2 < 0) {
            throw C1127Ir1.f();
        }
        if (i2 == 0) {
            c2254Rj.c = "";
            return H;
        }
        c2254Rj.c = new String(bArr, H, i2, AbstractC1507Lp1.a);
        return H + i2;
    }

    public static int E(byte[] bArr, int i, C2254Rj c2254Rj) {
        int H = H(bArr, i, c2254Rj);
        int i2 = c2254Rj.a;
        if (i2 < 0) {
            throw C1127Ir1.f();
        }
        if (i2 == 0) {
            c2254Rj.c = "";
            return H;
        }
        c2254Rj.c = AbstractC7551m74.a.b(bArr, H, i2);
        return H + i2;
    }

    public static int b(byte[] bArr, int i, C2254Rj c2254Rj) {
        int H = H(bArr, i, c2254Rj);
        int i2 = c2254Rj.a;
        if (i2 < 0) {
            throw C1127Ir1.f();
        }
        if (i2 > bArr.length - H) {
            throw C1127Ir1.h();
        }
        if (i2 == 0) {
            c2254Rj.c = AbstractC4147cE.g;
            return H;
        }
        c2254Rj.c = AbstractC4147cE.f(bArr, H, i2);
        return H + i2;
    }

    public static int o(QW2 qw2, byte[] bArr, int i, int i2, C2254Rj c2254Rj) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = G(i4, bArr, i3, c2254Rj);
            i4 = c2254Rj.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw C1127Ir1.h();
        }
        Object i6 = qw2.i();
        int i7 = i4 + i5;
        qw2.f(i6, bArr, i5, i7, c2254Rj);
        qw2.b(i6);
        c2254Rj.c = i6;
        return i7;
    }

    public static int m(QW2 qw2, byte[] bArr, int i, int i2, int i3, C2254Rj c2254Rj) {
        FV1 fv1 = (FV1) qw2;
        Object i4 = fv1.i();
        int G = fv1.G(i4, bArr, i, i2, i3, c2254Rj);
        fv1.b(i4);
        c2254Rj.c = i4;
        return G;
    }

    public static int I(int i, byte[] bArr, int i2, int i3, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        C0072Ao1 c0072Ao1 = (C0072Ao1) interfaceC1377Kp1;
        int H = H(bArr, i2, c2254Rj);
        c0072Ao1.d(c2254Rj.a);
        while (H < i3) {
            int H2 = H(bArr, H, c2254Rj);
            if (i != c2254Rj.a) {
                break;
            }
            H = H(bArr, H2, c2254Rj);
            c0072Ao1.d(c2254Rj.a);
        }
        return H;
    }

    public static int K(int i, byte[] bArr, int i2, int i3, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        DI1 di1 = (DI1) interfaceC1377Kp1;
        int J2 = J(bArr, i2, c2254Rj);
        di1.d(c2254Rj.b);
        while (J2 < i3) {
            int H = H(bArr, J2, c2254Rj);
            if (i != c2254Rj.a) {
                break;
            }
            J2 = J(bArr, H, c2254Rj);
            di1.d(c2254Rj.b);
        }
        return J2;
    }

    public static int h(int i, byte[] bArr, int i2, int i3, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        C0072Ao1 c0072Ao1 = (C0072Ao1) interfaceC1377Kp1;
        c0072Ao1.d(g(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int H = H(bArr, i4, c2254Rj);
            if (i != c2254Rj.a) {
                break;
            }
            c0072Ao1.d(g(H, bArr));
            i4 = H + 4;
        }
        return i4;
    }

    public static int j(int i, byte[] bArr, int i2, int i3, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        DI1 di1 = (DI1) interfaceC1377Kp1;
        di1.d(i(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int H = H(bArr, i4, c2254Rj);
            if (i != c2254Rj.a) {
                break;
            }
            di1.d(i(H, bArr));
            i4 = H + 8;
        }
        return i4;
    }

    public static int l(int i, byte[] bArr, int i2, int i3, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        C4208cQ0 c4208cQ0 = (C4208cQ0) interfaceC1377Kp1;
        c4208cQ0.d(Float.intBitsToFloat(g(i2, bArr)));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int H = H(bArr, i4, c2254Rj);
            if (i != c2254Rj.a) {
                break;
            }
            c4208cQ0.d(Float.intBitsToFloat(g(H, bArr)));
            i4 = H + 4;
        }
        return i4;
    }

    public static int e(int i, byte[] bArr, int i2, int i3, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        AbstractC2420Sq0 abstractC2420Sq0 = (AbstractC2420Sq0) interfaceC1377Kp1;
        abstractC2420Sq0.d(Double.longBitsToDouble(i(i2, bArr)));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int H = H(bArr, i4, c2254Rj);
            if (i != c2254Rj.a) {
                break;
            }
            abstractC2420Sq0.d(Double.longBitsToDouble(i(H, bArr)));
            i4 = H + 8;
        }
        return i4;
    }

    public static int a(int i, byte[] bArr, int i2, int i3, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        AbstractC7225lB abstractC7225lB = (AbstractC7225lB) interfaceC1377Kp1;
        int J2 = J(bArr, i2, c2254Rj);
        abstractC7225lB.d(c2254Rj.b != 0);
        while (J2 < i3) {
            int H = H(bArr, J2, c2254Rj);
            if (i != c2254Rj.a) {
                break;
            }
            J2 = J(bArr, H, c2254Rj);
            abstractC7225lB.d(c2254Rj.b != 0);
        }
        return J2;
    }

    public static int z(int i, byte[] bArr, int i2, int i3, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        C0072Ao1 c0072Ao1 = (C0072Ao1) interfaceC1377Kp1;
        int H = H(bArr, i2, c2254Rj);
        c0072Ao1.d(DV.b(c2254Rj.a));
        while (H < i3) {
            int H2 = H(bArr, H, c2254Rj);
            if (i != c2254Rj.a) {
                break;
            }
            H = H(bArr, H2, c2254Rj);
            c0072Ao1.d(DV.b(c2254Rj.a));
        }
        return H;
    }

    public static int A(int i, byte[] bArr, int i2, int i3, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        DI1 di1 = (DI1) interfaceC1377Kp1;
        int J2 = J(bArr, i2, c2254Rj);
        di1.d(DV.c(c2254Rj.b));
        while (J2 < i3) {
            int H = H(bArr, J2, c2254Rj);
            if (i != c2254Rj.a) {
                break;
            }
            J2 = J(bArr, H, c2254Rj);
            di1.d(DV.c(c2254Rj.b));
        }
        return J2;
    }

    public static int x(byte[] bArr, int i, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        C0072Ao1 c0072Ao1 = (C0072Ao1) interfaceC1377Kp1;
        int H = H(bArr, i, c2254Rj);
        int i2 = c2254Rj.a + H;
        while (H < i2) {
            H = H(bArr, H, c2254Rj);
            c0072Ao1.d(c2254Rj.a);
        }
        if (H == i2) {
            return H;
        }
        throw C1127Ir1.h();
    }

    public static int y(byte[] bArr, int i, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        DI1 di1 = (DI1) interfaceC1377Kp1;
        int H = H(bArr, i, c2254Rj);
        int i2 = c2254Rj.a + H;
        while (H < i2) {
            H = J(bArr, H, c2254Rj);
            di1.d(c2254Rj.b);
        }
        if (H == i2) {
            return H;
        }
        throw C1127Ir1.h();
    }

    public static int s(byte[] bArr, int i, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        C0072Ao1 c0072Ao1 = (C0072Ao1) interfaceC1377Kp1;
        int H = H(bArr, i, c2254Rj);
        int i2 = c2254Rj.a + H;
        while (H < i2) {
            c0072Ao1.d(g(H, bArr));
            H += 4;
        }
        if (H == i2) {
            return H;
        }
        throw C1127Ir1.h();
    }

    public static int t(byte[] bArr, int i, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        DI1 di1 = (DI1) interfaceC1377Kp1;
        int H = H(bArr, i, c2254Rj);
        int i2 = c2254Rj.a + H;
        while (H < i2) {
            di1.d(i(H, bArr));
            H += 8;
        }
        if (H == i2) {
            return H;
        }
        throw C1127Ir1.h();
    }

    public static int u(byte[] bArr, int i, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        C4208cQ0 c4208cQ0 = (C4208cQ0) interfaceC1377Kp1;
        int H = H(bArr, i, c2254Rj);
        int i2 = c2254Rj.a + H;
        while (H < i2) {
            c4208cQ0.d(Float.intBitsToFloat(g(H, bArr)));
            H += 4;
        }
        if (H == i2) {
            return H;
        }
        throw C1127Ir1.h();
    }

    public static int r(byte[] bArr, int i, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        AbstractC2420Sq0 abstractC2420Sq0 = (AbstractC2420Sq0) interfaceC1377Kp1;
        int H = H(bArr, i, c2254Rj);
        int i2 = c2254Rj.a + H;
        while (H < i2) {
            abstractC2420Sq0.d(Double.longBitsToDouble(i(H, bArr)));
            H += 8;
        }
        if (H == i2) {
            return H;
        }
        throw C1127Ir1.h();
    }

    public static int q(byte[] bArr, int i, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        AbstractC7225lB abstractC7225lB = (AbstractC7225lB) interfaceC1377Kp1;
        int H = H(bArr, i, c2254Rj);
        int i2 = c2254Rj.a + H;
        while (H < i2) {
            H = J(bArr, H, c2254Rj);
            abstractC7225lB.d(c2254Rj.b != 0);
        }
        if (H == i2) {
            return H;
        }
        throw C1127Ir1.h();
    }

    public static int v(byte[] bArr, int i, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        C0072Ao1 c0072Ao1 = (C0072Ao1) interfaceC1377Kp1;
        int H = H(bArr, i, c2254Rj);
        int i2 = c2254Rj.a + H;
        while (H < i2) {
            H = H(bArr, H, c2254Rj);
            c0072Ao1.d(DV.b(c2254Rj.a));
        }
        if (H == i2) {
            return H;
        }
        throw C1127Ir1.h();
    }

    public static int w(byte[] bArr, int i, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        DI1 di1 = (DI1) interfaceC1377Kp1;
        int H = H(bArr, i, c2254Rj);
        int i2 = c2254Rj.a + H;
        while (H < i2) {
            H = J(bArr, H, c2254Rj);
            di1.d(DV.c(c2254Rj.b));
        }
        if (H == i2) {
            return H;
        }
        throw C1127Ir1.h();
    }

    public static int C(int i, byte[] bArr, int i2, int i3, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        int H = H(bArr, i2, c2254Rj);
        int i4 = c2254Rj.a;
        if (i4 < 0) {
            throw C1127Ir1.f();
        }
        if (i4 == 0) {
            interfaceC1377Kp1.add("");
        } else {
            interfaceC1377Kp1.add(new String(bArr, H, i4, AbstractC1507Lp1.a));
            H += i4;
        }
        while (H < i3) {
            int H2 = H(bArr, H, c2254Rj);
            if (i != c2254Rj.a) {
                break;
            }
            H = H(bArr, H2, c2254Rj);
            int i5 = c2254Rj.a;
            if (i5 < 0) {
                throw C1127Ir1.f();
            }
            if (i5 == 0) {
                interfaceC1377Kp1.add("");
            } else {
                interfaceC1377Kp1.add(new String(bArr, H, i5, AbstractC1507Lp1.a));
                H += i5;
            }
        }
        return H;
    }

    public static int D(int i, byte[] bArr, int i2, int i3, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        int H = H(bArr, i2, c2254Rj);
        int i4 = c2254Rj.a;
        if (i4 < 0) {
            throw C1127Ir1.f();
        }
        if (i4 == 0) {
            interfaceC1377Kp1.add("");
        } else {
            int i5 = H + i4;
            if (!AbstractC7551m74.f(bArr, H, i5)) {
                throw C1127Ir1.c();
            }
            interfaceC1377Kp1.add(new String(bArr, H, i4, AbstractC1507Lp1.a));
            H = i5;
        }
        while (H < i3) {
            int H2 = H(bArr, H, c2254Rj);
            if (i != c2254Rj.a) {
                break;
            }
            H = H(bArr, H2, c2254Rj);
            int i6 = c2254Rj.a;
            if (i6 < 0) {
                throw C1127Ir1.f();
            }
            if (i6 == 0) {
                interfaceC1377Kp1.add("");
            } else {
                int i7 = H + i6;
                if (!AbstractC7551m74.f(bArr, H, i7)) {
                    throw C1127Ir1.c();
                }
                interfaceC1377Kp1.add(new String(bArr, H, i6, AbstractC1507Lp1.a));
                H = i7;
            }
        }
        return H;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        int H = H(bArr, i2, c2254Rj);
        int i4 = c2254Rj.a;
        if (i4 < 0) {
            throw C1127Ir1.f();
        }
        if (i4 > bArr.length - H) {
            throw C1127Ir1.h();
        }
        if (i4 == 0) {
            interfaceC1377Kp1.add(AbstractC4147cE.g);
        } else {
            interfaceC1377Kp1.add(AbstractC4147cE.f(bArr, H, i4));
            H += i4;
        }
        while (H < i3) {
            int H2 = H(bArr, H, c2254Rj);
            if (i != c2254Rj.a) {
                break;
            }
            H = H(bArr, H2, c2254Rj);
            int i5 = c2254Rj.a;
            if (i5 < 0) {
                throw C1127Ir1.f();
            }
            if (i5 > bArr.length - H) {
                throw C1127Ir1.h();
            }
            if (i5 == 0) {
                interfaceC1377Kp1.add(AbstractC4147cE.g);
            } else {
                interfaceC1377Kp1.add(AbstractC4147cE.f(bArr, H, i5));
                H += i5;
            }
        }
        return H;
    }

    public static int p(QW2 qw2, int i, byte[] bArr, int i2, int i3, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        int o = o(qw2, bArr, i2, i3, c2254Rj);
        interfaceC1377Kp1.add(c2254Rj.c);
        while (o < i3) {
            int H = H(bArr, o, c2254Rj);
            if (i != c2254Rj.a) {
                break;
            }
            o = o(qw2, bArr, H, i3, c2254Rj);
            interfaceC1377Kp1.add(c2254Rj.c);
        }
        return o;
    }

    public static int n(QW2 qw2, int i, byte[] bArr, int i2, int i3, InterfaceC1377Kp1 interfaceC1377Kp1, C2254Rj c2254Rj) {
        int i4 = (i & (-8)) | 4;
        int m = m(qw2, bArr, i2, i3, i4, c2254Rj);
        interfaceC1377Kp1.add(c2254Rj.c);
        while (m < i3) {
            int H = H(bArr, m, c2254Rj);
            if (i != c2254Rj.a) {
                break;
            }
            m = m(qw2, bArr, H, i3, i4, c2254Rj);
            interfaceC1377Kp1.add(c2254Rj.c);
        }
        return m;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0039. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(int r8, byte[] r9, int r10, int r11, java.lang.Object r12, com.google.protobuf.MessageLite r13, defpackage.A14 r14, defpackage.C2254Rj r15) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2384Sj.f(int, byte[], int, int, java.lang.Object, com.google.protobuf.MessageLite, A14, Rj):int");
    }

    public static int F(int i, byte[] bArr, int i2, int i3, C11975z14 c11975z14, C2254Rj c2254Rj) {
        if ((i >>> 3) == 0) {
            throw C1127Ir1.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int J2 = J(bArr, i2, c2254Rj);
            c11975z14.c(i, Long.valueOf(c2254Rj.b));
            return J2;
        }
        if (i4 == 1) {
            c11975z14.c(i, Long.valueOf(i(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int H = H(bArr, i2, c2254Rj);
            int i5 = c2254Rj.a;
            if (i5 < 0) {
                throw C1127Ir1.f();
            }
            if (i5 > bArr.length - H) {
                throw C1127Ir1.h();
            }
            if (i5 == 0) {
                c11975z14.c(i, AbstractC4147cE.g);
            } else {
                c11975z14.c(i, AbstractC4147cE.f(bArr, H, i5));
            }
            return H + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                c11975z14.c(i, Integer.valueOf(g(i2, bArr)));
                return i2 + 4;
            }
            throw C1127Ir1.b();
        }
        C11975z14 b = C11975z14.b();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int H2 = H(bArr, i2, c2254Rj);
            int i8 = c2254Rj.a;
            if (i8 == i6) {
                i7 = i8;
                i2 = H2;
                break;
            }
            i7 = i8;
            i2 = F(i8, bArr, H2, i3, b, c2254Rj);
        }
        if (i2 > i3 || i7 != i6) {
            throw C1127Ir1.g();
        }
        c11975z14.c(i, b);
        return i2;
    }

    public static int L(int i, byte[] bArr, int i2, int i3, C2254Rj c2254Rj) {
        if ((i >>> 3) == 0) {
            throw C1127Ir1.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return J(bArr, i2, c2254Rj);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return H(bArr, i2, c2254Rj) + c2254Rj.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw C1127Ir1.b();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = H(bArr, i2, c2254Rj);
            i6 = c2254Rj.a;
            if (i6 == i5) {
                break;
            }
            i2 = L(i6, bArr, i2, i3, c2254Rj);
        }
        if (i2 > i3 || i6 != i5) {
            throw C1127Ir1.g();
        }
        return i2;
    }
}
