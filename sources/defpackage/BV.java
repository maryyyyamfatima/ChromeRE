package defpackage;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BV extends DV {
    public final InputStream e;
    public final byte[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l = Integer.MAX_VALUE;

    public BV(InputStream inputStream) {
        Charset charset = AbstractC1507Lp1.a;
        if (inputStream == null) {
            throw new NullPointerException("input");
        }
        this.e = inputStream;
        this.f = new byte[4096];
        this.g = 0;
        this.i = 0;
        this.k = 0;
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
            int i4 = this.g - this.i;
            byte[] bArr = this.f;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.i;
                    this.i = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw C1127Ir1.e();
            }
            while (i3 < 10) {
                if (this.i == this.g) {
                    N(1);
                }
                int i6 = this.i;
                this.i = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw C1127Ir1.e();
            return true;
        }
        if (i2 == 1) {
            O(8);
            return true;
        }
        if (i2 == 2) {
            O(u());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                O(4);
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
        return Double.longBitsToDouble(J());
    }

    @Override // defpackage.DV
    public final float r() {
        return Float.intBitsToFloat(I());
    }

    @Override // defpackage.DV
    public final long D() {
        return K();
    }

    @Override // defpackage.DV
    public final long t() {
        return K();
    }

    @Override // defpackage.DV
    public final int s() {
        return u();
    }

    @Override // defpackage.DV
    public final long q() {
        return J();
    }

    @Override // defpackage.DV
    public final int p() {
        return I();
    }

    @Override // defpackage.DV
    public final boolean k() {
        return K() != 0;
    }

    @Override // defpackage.DV
    public final String z() {
        int u = u();
        byte[] bArr = this.f;
        if (u > 0) {
            int i = this.g;
            int i2 = this.i;
            if (u <= i - i2) {
                String str = new String(bArr, i2, u, AbstractC1507Lp1.a);
                this.i += u;
                return str;
            }
        }
        if (u == 0) {
            return "";
        }
        if (u <= this.g) {
            N(u);
            String str2 = new String(bArr, this.i, u, AbstractC1507Lp1.a);
            this.i += u;
            return str2;
        }
        return new String(F(u), AbstractC1507Lp1.a);
    }

    @Override // defpackage.DV
    public final String A() {
        int u = u();
        int i = this.i;
        int i2 = this.g;
        int i3 = i2 - i;
        byte[] bArr = this.f;
        if (u <= i3 && u > 0) {
            this.i = i + u;
        } else {
            if (u == 0) {
                return "";
            }
            i = 0;
            if (u <= i2) {
                N(u);
                this.i = u + 0;
            } else {
                bArr = F(u);
            }
        }
        return AbstractC7551m74.a.b(bArr, i, u);
    }

    @Override // defpackage.DV
    public final ZD m() {
        int u = u();
        int i = this.g;
        int i2 = this.i;
        int i3 = i - i2;
        byte[] bArr = this.f;
        if (u <= i3 && u > 0) {
            ZD f = AbstractC4147cE.f(bArr, i2, u);
            this.i += u;
            return f;
        }
        if (u == 0) {
            return AbstractC4147cE.g;
        }
        byte[] G = G(u);
        if (G != null) {
            return AbstractC4147cE.f(G, 0, G.length);
        }
        int i4 = this.i;
        int i5 = this.g;
        int i6 = i5 - i4;
        this.k += i5;
        this.i = 0;
        this.g = 0;
        ArrayList H = H(u - i6);
        byte[] bArr2 = new byte[u];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = H.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        ZD zd = AbstractC4147cE.g;
        return new ZD(bArr2);
    }

    @Override // defpackage.DV
    public final byte[] l() {
        int u = u();
        int i = this.g;
        int i2 = this.i;
        if (u <= i - i2 && u > 0) {
            byte[] copyOfRange = Arrays.copyOfRange(this.f, i2, i2 + u);
            this.i += u;
            return copyOfRange;
        }
        return F(u);
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
        return I();
    }

    @Override // defpackage.DV
    public final long w() {
        return J();
    }

    @Override // defpackage.DV
    public final int x() {
        return DV.b(u());
    }

    @Override // defpackage.DV
    public final long y() {
        return DV.c(K());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:            if (r3[r2] < 0) goto L148;     */
    @Override // defpackage.DV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int u() {
        /*
            r5 = this;
            int r0 = r5.i
            int r1 = r5.g
            if (r1 != r0) goto L7
            goto L6a
        L7:
            int r2 = r0 + 1
            byte[] r3 = r5.f
            r0 = r3[r0]
            if (r0 < 0) goto L12
            r5.i = r2
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
            long r0 = r5.L()
            int r0 = (int) r0
            return r0
        L70:
            r5.i = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BV.u():int");
    }

    public final long K() {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.i;
        int i3 = this.g;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f;
            byte b = bArr[i2];
            if (b >= 0) {
                this.i = i4;
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
                            this.i = i5;
                            return j2;
                        }
                        i = i9 ^ (-2080896);
                    }
                    i5 = i7;
                    j2 = j;
                    this.i = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.i = i5;
                return j2;
            }
        }
        return L();
    }

    public final int I() {
        int i = this.i;
        if (this.g - i < 4) {
            N(4);
            i = this.i;
        }
        this.i = i + 4;
        byte[] bArr = this.f;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long J() {
        int i = this.i;
        if (this.g - i < 8) {
            N(8);
            i = this.i;
        }
        this.i = i + 8;
        byte[] bArr = this.f;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.DV
    public final int j(int i) {
        if (i < 0) {
            throw C1127Ir1.f();
        }
        int i2 = this.k + this.i + i;
        int i3 = this.l;
        if (i2 > i3) {
            throw C1127Ir1.h();
        }
        this.l = i2;
        M();
        return i3;
    }

    public final void M() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = this.k + i;
        int i3 = this.l;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.h = i4;
            this.g = i - i4;
            return;
        }
        this.h = 0;
    }

    @Override // defpackage.DV
    public final void i(int i) {
        this.l = i;
        M();
    }

    @Override // defpackage.DV
    public final boolean e() {
        return this.i == this.g && !P(1);
    }

    @Override // defpackage.DV
    public final int d() {
        return this.k + this.i;
    }

    public final void N(int i) {
        if (P(i)) {
            return;
        }
        if (i > (this.c - this.k) - this.i) {
            throw new C1127Ir1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw C1127Ir1.h();
    }

    public final boolean P(int i) {
        int i2 = this.i;
        int i3 = i2 + i;
        int i4 = this.g;
        if (i3 <= i4) {
            throw new IllegalStateException(AbstractC9307rF1.a("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        int i5 = this.k;
        int i6 = this.c;
        if (i > (i6 - i5) - i2 || i5 + i2 + i > this.l) {
            return false;
        }
        byte[] bArr = this.f;
        if (i2 > 0) {
            if (i4 > i2) {
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            this.k += i2;
            this.g -= i2;
            this.i = 0;
        }
        int i7 = this.g;
        int min = Math.min(bArr.length - i7, (i6 - this.k) - i7);
        InputStream inputStream = this.e;
        try {
            int read = inputStream.read(bArr, i7, min);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.g += read;
            M();
            if (this.g >= i) {
                return true;
            }
            return P(i);
        } catch (C1127Ir1 e) {
            e.g = true;
            throw e;
        }
    }

    public final long L() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.i == this.g) {
                N(1);
            }
            int i2 = this.i;
            this.i = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f[i2] & 128) == 0) {
                return j;
            }
        }
        throw C1127Ir1.e();
    }

    public final byte[] F(int i) {
        byte[] G = G(i);
        if (G != null) {
            return G;
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i3 - i2;
        this.k += i3;
        this.i = 0;
        this.g = 0;
        ArrayList H = H(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, i2, bArr, 0, i4);
        Iterator it = H.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] G(int i) {
        if (i == 0) {
            return AbstractC1507Lp1.b;
        }
        if (i < 0) {
            throw C1127Ir1.f();
        }
        int i2 = this.k;
        int i3 = this.i;
        int i4 = i2 + i3 + i;
        if (i4 - this.c > 0) {
            throw new C1127Ir1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.l;
        if (i4 > i5) {
            O((i5 - i2) - i3);
            throw C1127Ir1.h();
        }
        int i6 = this.g - i3;
        int i7 = i - i6;
        InputStream inputStream = this.e;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (C1127Ir1 e) {
                e.g = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, this.i, bArr, 0, i6);
        this.k += this.g;
        this.i = 0;
        this.g = 0;
        while (i6 < i) {
            try {
                int read = inputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw C1127Ir1.h();
                }
                this.k += read;
                i6 += read;
            } catch (C1127Ir1 e2) {
                e2.g = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList H(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.e.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw C1127Ir1.h();
                }
                this.k += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void O(int i) {
        int i2 = this.g;
        int i3 = this.i;
        if (i <= i2 - i3 && i >= 0) {
            this.i = i3 + i;
            return;
        }
        InputStream inputStream = this.e;
        if (i < 0) {
            throw C1127Ir1.f();
        }
        int i4 = this.k;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.l;
        if (i6 > i7) {
            O((i7 - i4) - i3);
            throw C1127Ir1.h();
        }
        this.k = i5;
        int i8 = i2 - i3;
        this.g = 0;
        this.i = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long skip = inputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i8 += (int) skip;
                    }
                } catch (C1127Ir1 e) {
                    e.g = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.k += i8;
                M();
                throw th;
            }
        }
        this.k += i8;
        M();
        if (i8 >= i) {
            return;
        }
        int i9 = this.g;
        int i10 = i9 - this.i;
        this.i = i9;
        N(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.g;
            if (i11 > i12) {
                i10 += i12;
                this.i = i12;
                N(1);
            } else {
                this.i = i11;
                return;
            }
        }
    }
}
