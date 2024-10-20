package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AV extends DV {
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public final int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public AV(byte[] bArr, int i, int i2, boolean z) {
        this.e = bArr;
        this.f = i2 + i;
        this.h = i;
        this.i = i;
    }

    @Override // defpackage.DV
    public final int B() {
        if (e()) {
            this.j = 0;
            return 0;
        }
        int u = u();
        this.j = u;
        if ((u >>> 3) != 0) {
            return u;
        }
        throw C1127Ir1.b();
    }

    @Override // defpackage.DV
    public final void a(int i) {
        if (this.j != i) {
            throw C1127Ir1.a();
        }
    }

    @Override // defpackage.DV
    public final boolean E(int i) {
        int B;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.f - this.h;
            byte[] bArr = this.e;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.h;
                    this.h = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw C1127Ir1.e();
            }
            while (i3 < 10) {
                int i6 = this.h;
                if (i6 == this.f) {
                    throw C1127Ir1.h();
                }
                this.h = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw C1127Ir1.e();
            return true;
        }
        if (i2 == 1) {
            K(8);
            return true;
        }
        if (i2 == 2) {
            K(u());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                K(4);
                return true;
            }
            int i7 = C1127Ir1.h;
            throw new C0997Hr1();
        }
        do {
            B = B();
            if (B == 0) {
                break;
            }
        } while (E(B));
        a(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // defpackage.DV
    public final double n() {
        return Double.longBitsToDouble(H());
    }

    @Override // defpackage.DV
    public final float r() {
        return Float.intBitsToFloat(G());
    }

    @Override // defpackage.DV
    public final long D() {
        return I();
    }

    @Override // defpackage.DV
    public final long t() {
        return I();
    }

    @Override // defpackage.DV
    public final int s() {
        return u();
    }

    @Override // defpackage.DV
    public final long q() {
        return H();
    }

    @Override // defpackage.DV
    public final int p() {
        return G();
    }

    @Override // defpackage.DV
    public final boolean k() {
        return I() != 0;
    }

    @Override // defpackage.DV
    public final String z() {
        int u = u();
        if (u > 0) {
            int i = this.f;
            int i2 = this.h;
            if (u <= i - i2) {
                String str = new String(this.e, i2, u, AbstractC1507Lp1.a);
                this.h += u;
                return str;
            }
        }
        if (u == 0) {
            return "";
        }
        if (u < 0) {
            throw C1127Ir1.f();
        }
        throw C1127Ir1.h();
    }

    @Override // defpackage.DV
    public final String A() {
        int u = u();
        if (u > 0) {
            int i = this.f;
            int i2 = this.h;
            if (u <= i - i2) {
                String b = AbstractC7551m74.a.b(this.e, i2, u);
                this.h += u;
                return b;
            }
        }
        if (u == 0) {
            return "";
        }
        if (u <= 0) {
            throw C1127Ir1.f();
        }
        throw C1127Ir1.h();
    }

    @Override // defpackage.DV
    public final ZD m() {
        int u = u();
        if (u > 0) {
            int i = this.f;
            int i2 = this.h;
            if (u <= i - i2) {
                ZD f = AbstractC4147cE.f(this.e, i2, u);
                this.h += u;
                return f;
            }
        }
        if (u == 0) {
            return AbstractC4147cE.g;
        }
        byte[] F = F(u);
        ZD zd = AbstractC4147cE.g;
        return new ZD(F);
    }

    @Override // defpackage.DV
    public final byte[] l() {
        return F(u());
    }

    @Override // defpackage.DV
    public final int C() {
        return u();
    }

    @Override // defpackage.DV
    public final int o() {
        return u();
    }

    @Override // defpackage.DV
    public final int v() {
        return G();
    }

    @Override // defpackage.DV
    public final long w() {
        return H();
    }

    @Override // defpackage.DV
    public final int x() {
        return DV.b(u());
    }

    @Override // defpackage.DV
    public final long y() {
        return DV.c(I());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:            if (r3[r2] < 0) goto L186;     */
    @Override // defpackage.DV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int u() {
        /*
            r5 = this;
            int r0 = r5.h
            int r1 = r5.f
            if (r1 != r0) goto L7
            goto L6a
        L7:
            int r2 = r0 + 1
            byte[] r3 = r5.e
            r0 = r3[r0]
            if (r0 < 0) goto L12
            r5.h = r2
            return r0
        L12:
            int r1 = r1 - r2
            r4 = 9
            if (r1 >= r4) goto L18
            goto L6a
        L18:
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L24
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L70
        L24:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L31
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2f:
            r1 = r2
            goto L70
        L31:
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L3f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L70
        L3f:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
        L6a:
            long r0 = r5.J()
            int r0 = (int) r0
            return r0
        L70:
            r5.h = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AV.u():int");
    }

    public final long I() {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.e;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
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
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                    i5 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i11;
                            }
                            this.h = i5;
                            return j2;
                        }
                        i = i9 ^ (-2080896);
                    }
                    i5 = i7;
                    j2 = j;
                    this.h = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.h = i5;
                return j2;
            }
        }
        return J();
    }

    public final int G() {
        int i = this.h;
        if (this.f - i < 4) {
            throw C1127Ir1.h();
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long H() {
        int i = this.h;
        if (this.f - i < 8) {
            throw C1127Ir1.h();
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.DV
    public final void i(int i) {
        this.k = i;
        int i2 = this.f + this.g;
        this.f = i2;
        int i3 = i2 - this.i;
        if (i3 > i) {
            int i4 = i3 - i;
            this.g = i4;
            this.f = i2 - i4;
            return;
        }
        this.g = 0;
    }

    @Override // defpackage.DV
    public final boolean e() {
        return this.h == this.f;
    }

    @Override // defpackage.DV
    public final int d() {
        return this.h - this.i;
    }

    @Override // defpackage.DV
    public final int j(int i) {
        if (i < 0) {
            throw C1127Ir1.f();
        }
        int i2 = this.h;
        int i3 = this.i;
        int i4 = (i2 - i3) + i;
        if (i4 < 0) {
            throw C1127Ir1.g();
        }
        int i5 = this.k;
        if (i4 > i5) {
            throw C1127Ir1.h();
        }
        this.k = i4;
        int i6 = this.f + this.g;
        this.f = i6;
        int i7 = i6 - i3;
        if (i7 > i4) {
            int i8 = i7 - i4;
            this.g = i8;
            this.f = i6 - i8;
        } else {
            this.g = 0;
        }
        return i5;
    }

    public final long J() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.h;
            if (i2 == this.f) {
                throw C1127Ir1.h();
            }
            this.h = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.e[i2] & 128) == 0) {
                return j;
            }
        }
        throw C1127Ir1.e();
    }

    public final byte[] F(int i) {
        if (i > 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.h = i4;
                return Arrays.copyOfRange(this.e, i3, i4);
            }
        }
        if (i > 0) {
            throw C1127Ir1.h();
        }
        if (i == 0) {
            return AbstractC1507Lp1.b;
        }
        throw C1127Ir1.f();
    }

    public final void K(int i) {
        if (i >= 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3) {
                this.h = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw C1127Ir1.f();
        }
        throw C1127Ir1.h();
    }
}
