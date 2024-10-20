package defpackage;

import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CV extends DV {
    public final ByteBuffer e;
    public final long f;
    public long g;
    public long h;
    public final long i;
    public int j;
    public int k;
    public int l = Integer.MAX_VALUE;

    public CV(ByteBuffer byteBuffer, boolean z) {
        this.e = byteBuffer;
        long i = Q14.c.i(Q14.g, byteBuffer);
        this.f = i;
        this.g = byteBuffer.limit() + i;
        long position = i + byteBuffer.position();
        this.h = position;
        this.i = position;
    }

    @Override // defpackage.DV
    public final int B() {
        if (e()) {
            this.k = 0;
            return 0;
        }
        int u = u();
        this.k = u;
        if ((u >>> 3) != 0) {
            return u;
        }
        throw C1127Ir1.b();
    }

    @Override // defpackage.DV
    public final void a(int i) {
        if (this.k != i) {
            throw C1127Ir1.a();
        }
    }

    @Override // defpackage.DV
    public final boolean E(int i) {
        int B;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (L() >= 10) {
                while (i3 < 10) {
                    long j = this.h;
                    this.h = j + 1;
                    if (Q14.g(j) < 0) {
                        i3++;
                    }
                }
                throw C1127Ir1.e();
            }
            while (i3 < 10) {
                long j2 = this.h;
                if (j2 == this.g) {
                    throw C1127Ir1.h();
                }
                this.h = j2 + 1;
                if (Q14.g(j2) < 0) {
                    i3++;
                }
            }
            throw C1127Ir1.e();
            return true;
        }
        if (i2 == 1) {
            M(8);
            return true;
        }
        if (i2 == 2) {
            M(u());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                M(4);
                return true;
            }
            int i4 = C1127Ir1.h;
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
        if (u <= 0 || u > L()) {
            if (u == 0) {
                return "";
            }
            if (u < 0) {
                throw C1127Ir1.f();
            }
            throw C1127Ir1.h();
        }
        byte[] bArr = new byte[u];
        long j = u;
        Q14.c.c(this.h, bArr, 0L, j);
        String str = new String(bArr, AbstractC1507Lp1.a);
        this.h += j;
        return str;
    }

    @Override // defpackage.DV
    public final String A() {
        String a;
        int u = u();
        if (u <= 0 || u > L()) {
            if (u == 0) {
                return "";
            }
            if (u <= 0) {
                throw C1127Ir1.f();
            }
            throw C1127Ir1.h();
        }
        int i = (int) (this.h - this.f);
        C6863k74 c6863k74 = AbstractC7551m74.a;
        c6863k74.getClass();
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer.hasArray()) {
            a = c6863k74.b(byteBuffer.array(), byteBuffer.arrayOffset() + i, u);
        } else if (!byteBuffer.isDirect()) {
            a = AbstractC6519j74.a(byteBuffer, i, u);
        } else {
            a = AbstractC6519j74.a(byteBuffer, i, u);
        }
        this.h += u;
        return a;
    }

    @Override // defpackage.DV
    public final ZD m() {
        int u = u();
        if (u <= 0 || u > L()) {
            if (u == 0) {
                return AbstractC4147cE.g;
            }
            if (u < 0) {
                throw C1127Ir1.f();
            }
            throw C1127Ir1.h();
        }
        byte[] bArr = new byte[u];
        long j = u;
        Q14.c.c(this.h, bArr, 0L, j);
        this.h += j;
        ZD zd = AbstractC4147cE.g;
        return new ZD(bArr);
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:            if (defpackage.Q14.g(r4) < 0) goto L148;     */
    @Override // defpackage.DV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int u() {
        /*
            r10 = this;
            long r0 = r10.h
            long r2 = r10.g
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L85
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = defpackage.Q14.g(r0)
            if (r0 < 0) goto L17
            r10.h = r4
            return r0
        L17:
            long r6 = r10.g
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L21
            goto L85
        L21:
            long r6 = r4 + r2
            byte r1 = defpackage.Q14.g(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2f
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8b
        L2f:
            long r4 = r6 + r2
            byte r1 = defpackage.Q14.g(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L3e
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r6 = r4
            goto L8b
        L3e:
            long r6 = r4 + r2
            byte r1 = defpackage.Q14.g(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L4e
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L8b
        L4e:
            long r4 = r6 + r2
            byte r1 = defpackage.Q14.g(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = defpackage.Q14.g(r4)
            if (r1 >= 0) goto L8b
            long r4 = r6 + r2
            byte r1 = defpackage.Q14.g(r6)
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = defpackage.Q14.g(r4)
            if (r1 >= 0) goto L8b
            long r4 = r6 + r2
            byte r1 = defpackage.Q14.g(r6)
            if (r1 >= 0) goto L3c
            long r6 = r4 + r2
            byte r1 = defpackage.Q14.g(r4)
            if (r1 >= 0) goto L8b
        L85:
            long r0 = r10.J()
            int r0 = (int) r0
            return r0
        L8b:
            r10.h = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CV.u():int");
    }

    public final long I() {
        long g;
        long j;
        long j2;
        int i;
        long j3 = this.h;
        if (this.g != j3) {
            long j4 = j3 + 1;
            byte g2 = Q14.g(j3);
            if (g2 >= 0) {
                this.h = j4;
                return g2;
            }
            if (this.g - j4 >= 9) {
                long j5 = j4 + 1;
                int g3 = g2 ^ (Q14.g(j4) << 7);
                if (g3 >= 0) {
                    long j6 = j5 + 1;
                    int g4 = g3 ^ (Q14.g(j5) << 14);
                    if (g4 >= 0) {
                        g = g4 ^ 16256;
                    } else {
                        j5 = j6 + 1;
                        int g5 = g4 ^ (Q14.g(j6) << 21);
                        if (g5 < 0) {
                            i = g5 ^ (-2080896);
                        } else {
                            j6 = j5 + 1;
                            long g6 = g5 ^ (Q14.g(j5) << 28);
                            if (g6 < 0) {
                                long j7 = j6 + 1;
                                long g7 = g6 ^ (Q14.g(j6) << 35);
                                if (g7 < 0) {
                                    j = -34093383808L;
                                } else {
                                    j6 = j7 + 1;
                                    g6 = g7 ^ (Q14.g(j7) << 42);
                                    if (g6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        j7 = j6 + 1;
                                        g7 = g6 ^ (Q14.g(j6) << 49);
                                        if (g7 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            j6 = j7 + 1;
                                            g = (g7 ^ (Q14.g(j7) << 56)) ^ 71499008037633920L;
                                            if (g < 0) {
                                                long j8 = 1 + j6;
                                                if (Q14.g(j6) >= 0) {
                                                    j5 = j8;
                                                    this.h = j5;
                                                    return g;
                                                }
                                            }
                                        }
                                    }
                                }
                                g = g7 ^ j;
                                j5 = j7;
                                this.h = j5;
                                return g;
                            }
                            j2 = 266354560;
                            g = g6 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.h = j5;
                    return g;
                }
                i = g3 ^ (-128);
                g = i;
                this.h = j5;
                return g;
            }
        }
        return J();
    }

    public final int G() {
        long j = this.h;
        if (this.g - j < 4) {
            throw C1127Ir1.h();
        }
        this.h = 4 + j;
        return ((Q14.g(j + 3) & 255) << 24) | (Q14.g(j) & 255) | ((Q14.g(1 + j) & 255) << 8) | ((Q14.g(2 + j) & 255) << 16);
    }

    public final long H() {
        long j = this.h;
        if (this.g - j < 8) {
            throw C1127Ir1.h();
        }
        this.h = 8 + j;
        return ((Q14.g(j + 7) & 255) << 56) | (Q14.g(j) & 255) | ((Q14.g(1 + j) & 255) << 8) | ((Q14.g(2 + j) & 255) << 16) | ((Q14.g(3 + j) & 255) << 24) | ((Q14.g(4 + j) & 255) << 32) | ((Q14.g(5 + j) & 255) << 40) | ((Q14.g(6 + j) & 255) << 48);
    }

    @Override // defpackage.DV
    public final int j(int i) {
        if (i < 0) {
            throw C1127Ir1.f();
        }
        int d = d() + i;
        int i2 = this.l;
        if (d > i2) {
            throw C1127Ir1.h();
        }
        this.l = d;
        K();
        return i2;
    }

    @Override // defpackage.DV
    public final void i(int i) {
        this.l = i;
        K();
    }

    @Override // defpackage.DV
    public final boolean e() {
        return this.h == this.g;
    }

    @Override // defpackage.DV
    public final int d() {
        return (int) (this.h - this.i);
    }

    public final long J() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.h;
            if (j2 == this.g) {
                throw C1127Ir1.h();
            }
            this.h = 1 + j2;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((Q14.g(j2) & 128) == 0) {
                return j;
            }
        }
        throw C1127Ir1.e();
    }

    public final byte[] F(int i) {
        if (i < 0 || i > L()) {
            if (i > 0) {
                throw C1127Ir1.h();
            }
            if (i == 0) {
                return AbstractC1507Lp1.b;
            }
            throw C1127Ir1.f();
        }
        byte[] bArr = new byte[i];
        long j = this.h;
        long j2 = i;
        long j3 = j + j2;
        ByteBuffer byteBuffer = this.e;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        long j4 = this.f;
        try {
            try {
                byteBuffer.position((int) (j - j4));
                byteBuffer.limit((int) (j3 - j4));
                ByteBuffer slice = byteBuffer.slice();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                slice.get(bArr);
                this.h += j2;
                return bArr;
            } catch (IllegalArgumentException e) {
                C1127Ir1 h = C1127Ir1.h();
                h.initCause(e);
                throw h;
            }
        } catch (Throwable th) {
            byteBuffer.position(position);
            byteBuffer.limit(limit);
            throw th;
        }
    }

    public final void M(int i) {
        if (i >= 0 && i <= L()) {
            this.h += i;
        } else {
            if (i < 0) {
                throw C1127Ir1.f();
            }
            throw C1127Ir1.h();
        }
    }

    public final void K() {
        long j = this.g + this.j;
        this.g = j;
        int i = (int) (j - this.i);
        int i2 = this.l;
        if (i > i2) {
            int i3 = i - i2;
            this.j = i3;
            this.g = j - i3;
            return;
        }
        this.j = 0;
    }

    public final int L() {
        return (int) (this.g - this.h);
    }
}
