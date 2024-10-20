package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5173fD implements InterfaceC5861hD, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel {
    public C7520m23 a;
    public long g;

    @Override // defpackage.InterfaceC7390lg3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x014e, code lost:            return r13;     */
    @Override // defpackage.InterfaceC7390lg3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long Z0(defpackage.C5173fD r12, long r13) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5173fD.Z0(fD, long):long");
    }

    public final byte b(long j) {
        Xs4.b(this.g, j, 1L);
        C7520m23 c7520m23 = this.a;
        if (c7520m23 == null) {
            AbstractC0087Ar1.b(null);
            throw null;
        }
        long j2 = this.g;
        if (j2 - j < j) {
            while (j2 > j) {
                c7520m23 = c7520m23.g;
                AbstractC0087Ar1.b(c7520m23);
                j2 -= c7520m23.c - c7520m23.b;
            }
            return c7520m23.a[(int) ((c7520m23.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c7520m23.c;
            int i2 = c7520m23.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return c7520m23.a[(int) ((i2 + j) - j3)];
            }
            c7520m23 = c7520m23.f;
            AbstractC0087Ar1.b(c7520m23);
            j3 = j4;
        }
    }

    public final byte f() {
        if (this.g == 0) {
            throw new EOFException();
        }
        C7520m23 c7520m23 = this.a;
        AbstractC0087Ar1.b(c7520m23);
        int i = c7520m23.b;
        int i2 = c7520m23.c;
        int i3 = i + 1;
        byte b = c7520m23.a[i];
        this.g--;
        if (i3 == i2) {
            this.a = c7520m23.a();
            AbstractC7864n23.a(c7520m23);
        } else {
            c7520m23.b = i3;
        }
        return b;
    }

    public final byte[] h(long j) {
        int i = 0;
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(Pd4.a("byteCount: ", j).toString());
        }
        if (this.g < j) {
            throw new EOFException();
        }
        int i2 = (int) j;
        byte[] bArr = new byte[i2];
        while (i < i2) {
            int read = read(bArr, i, i2 - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
        return bArr;
    }

    public final C3804bE i() {
        long j = this.g;
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(Pd4.a("byteCount: ", j).toString());
        }
        if (j < j) {
            throw new EOFException();
        }
        if (j >= 4096) {
            C3804bE s = s((int) j);
            r(j);
            return s;
        }
        return new C3804bE(h(j));
    }

    public final String toString() {
        long j = this.g;
        if (j <= 2147483647L) {
            return s((int) j).toString();
        }
        throw new IllegalStateException(Pd4.a("size > Int.MAX_VALUE: ", j).toString());
    }

    @Override // defpackage.InterfaceC5861hD
    public final boolean a(long j) {
        return this.g >= j;
    }

    @Override // defpackage.InterfaceC5861hD
    public final int L(C0413De2 c0413De2) {
        AbstractC0087Ar1.e(c0413De2, "options");
        int b = Us4.b(this, c0413De2, false);
        if (b == -1) {
            return -1;
        }
        r(c0413De2.a[b].b());
        return b;
    }

    public final String k(long j) {
        return j(j, AbstractC3829bJ.a);
    }

    public final String j(long j, Charset charset) {
        AbstractC0087Ar1.e(charset, "charset");
        if (!(j >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(Pd4.a("byteCount: ", j).toString());
        }
        if (this.g < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C7520m23 c7520m23 = this.a;
        AbstractC0087Ar1.b(c7520m23);
        int i = c7520m23.b;
        if (i + j > c7520m23.c) {
            return new String(h(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c7520m23.a, i, i2, charset);
        int i3 = c7520m23.b + i2;
        c7520m23.b = i3;
        this.g -= j;
        if (i3 == c7520m23.c) {
            this.a = c7520m23.a();
            AbstractC7864n23.a(c7520m23);
        }
        return str;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC0087Ar1.e(byteBuffer, "sink");
        C7520m23 c7520m23 = this.a;
        if (c7520m23 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c7520m23.c - c7520m23.b);
        byteBuffer.put(c7520m23.a, c7520m23.b, min);
        int i = c7520m23.b + min;
        c7520m23.b = i;
        this.g -= min;
        if (i == c7520m23.c) {
            this.a = c7520m23.a();
            AbstractC7864n23.a(c7520m23);
        }
        return min;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC0087Ar1.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C7520m23 u = u(1);
            int min = Math.min(i, 8192 - u.c);
            byteBuffer.get(u.a, u.c, min);
            i -= min;
            u.c += min;
        }
        this.g += remaining;
        return remaining;
    }

    public final long c(C3804bE c3804bE, long j) {
        AbstractC0087Ar1.e(c3804bE, "bytes");
        byte[] bArr = c3804bE.a;
        if (!(bArr.length > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j2 = 0;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(Pd4.a("fromIndex < 0: ", j).toString());
        }
        C7520m23 c7520m23 = this.a;
        if (c7520m23 != null) {
            long j3 = this.g;
            if (j3 - j < j) {
                while (j3 > j) {
                    c7520m23 = c7520m23.g;
                    AbstractC0087Ar1.b(c7520m23);
                    j3 -= c7520m23.c - c7520m23.b;
                }
                byte b = bArr[0];
                int length = bArr.length;
                long j4 = (this.g - length) + 1;
                while (j3 < j4) {
                    int min = (int) Math.min(c7520m23.c, (c7520m23.b + j4) - j3);
                    for (int i = (int) ((c7520m23.b + j) - j3); i < min; i++) {
                        if (c7520m23.a[i] == b && Us4.a(c7520m23, i + 1, bArr, length)) {
                            return (i - c7520m23.b) + j3;
                        }
                    }
                    j3 += c7520m23.c - c7520m23.b;
                    c7520m23 = c7520m23.f;
                    AbstractC0087Ar1.b(c7520m23);
                    j = j3;
                }
            } else {
                while (true) {
                    long j5 = (c7520m23.c - c7520m23.b) + j2;
                    if (j5 > j) {
                        break;
                    }
                    c7520m23 = c7520m23.f;
                    AbstractC0087Ar1.b(c7520m23);
                    j2 = j5;
                }
                byte b2 = bArr[0];
                int length2 = bArr.length;
                long j6 = (this.g - length2) + 1;
                while (j2 < j6) {
                    int min2 = (int) Math.min(c7520m23.c, (c7520m23.b + j6) - j2);
                    for (int i2 = (int) ((c7520m23.b + j) - j2); i2 < min2; i2++) {
                        if (c7520m23.a[i2] == b2 && Us4.a(c7520m23, i2 + 1, bArr, length2)) {
                            return (i2 - c7520m23.b) + j2;
                        }
                    }
                    j2 += c7520m23.c - c7520m23.b;
                    c7520m23 = c7520m23.f;
                    AbstractC0087Ar1.b(c7520m23);
                    j = j2;
                }
            }
        }
        return -1L;
    }

    @Override // defpackage.InterfaceC5861hD
    public final long B0(C3804bE c3804bE) {
        AbstractC0087Ar1.e(c3804bE, "targetBytes");
        return e(c3804bE, 0L);
    }

    public final int read(byte[] bArr, int i, int i2) {
        AbstractC0087Ar1.e(bArr, "sink");
        Xs4.b(bArr.length, i, i2);
        C7520m23 c7520m23 = this.a;
        if (c7520m23 == null) {
            return -1;
        }
        int min = Math.min(i2, c7520m23.c - c7520m23.b);
        int i3 = c7520m23.b;
        AbstractC6036hk.a(i, i3, i3 + min, c7520m23.a, bArr);
        int i4 = c7520m23.b + min;
        c7520m23.b = i4;
        this.g -= min;
        if (i4 == c7520m23.c) {
            this.a = c7520m23.a();
            AbstractC7864n23.a(c7520m23);
        }
        return min;
    }

    public final void r(long j) {
        while (j > 0) {
            C7520m23 c7520m23 = this.a;
            if (c7520m23 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, c7520m23.c - c7520m23.b);
            long j2 = min;
            this.g -= j2;
            j -= j2;
            int i = c7520m23.b + min;
            c7520m23.b = i;
            if (i == c7520m23.c) {
                this.a = c7520m23.a();
                AbstractC7864n23.a(c7520m23);
            }
        }
    }

    public final void F(int i, int i2, String str) {
        char charAt;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("beginIndex < 0: ", i).toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(AbstractC0800Ge.a("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        if (!(i2 <= str.length())) {
            throw new IllegalArgumentException(AbstractC0800Ge.a("endIndex > string.length: ", i2, " > ", str.length()).toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                C7520m23 u = u(1);
                int i3 = u.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = u.a;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = u.c;
                int i6 = (i3 + i) - i5;
                u.c = i5 + i6;
                this.g += i6;
            } else {
                if (charAt2 < 2048) {
                    C7520m23 u2 = u(2);
                    int i7 = u2.c;
                    byte[] bArr2 = u2.a;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    u2.c = i7 + 2;
                    this.g += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    C7520m23 u3 = u(3);
                    int i8 = u3.c;
                    byte[] bArr3 = u3.a;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    u3.c = i8 + 3;
                    this.g += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 <= 56319) {
                        if (56320 <= charAt3 && charAt3 < 57344) {
                            int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            C7520m23 u4 = u(4);
                            int i11 = u4.c;
                            byte[] bArr4 = u4.a;
                            bArr4[i11] = (byte) ((i10 >> 18) | 240);
                            bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                            u4.c = i11 + 4;
                            this.g += 4;
                            i += 2;
                        }
                    }
                    y(63);
                    i = i9;
                }
                i++;
            }
        }
    }

    public final void y(int i) {
        C7520m23 u = u(1);
        int i2 = u.c;
        u.c = i2 + 1;
        u.a[i2] = (byte) i;
        this.g++;
    }

    public final void C(int i) {
        C7520m23 u = u(4);
        int i2 = u.c;
        int i3 = i2 + 1;
        byte[] bArr = u.a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        u.c = i5 + 1;
        this.g += 4;
    }

    public final C7520m23 u(int i) {
        if (!(i >= 1 && i <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        C7520m23 c7520m23 = this.a;
        if (c7520m23 == null) {
            C7520m23 b = AbstractC7864n23.b();
            this.a = b;
            b.g = b;
            b.f = b;
            return b;
        }
        C7520m23 c7520m232 = c7520m23.g;
        AbstractC0087Ar1.b(c7520m232);
        if (c7520m232.c + i <= 8192 && c7520m232.e) {
            return c7520m232;
        }
        C7520m23 b2 = AbstractC7864n23.b();
        c7520m232.b(b2);
        return b2;
    }

    public final long e(C3804bE c3804bE, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        AbstractC0087Ar1.e(c3804bE, "targetBytes");
        long j2 = 0;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(Pd4.a("fromIndex < 0: ", j).toString());
        }
        C7520m23 c7520m23 = this.a;
        if (c7520m23 != null) {
            long j3 = this.g;
            long j4 = j3 - j;
            byte[] bArr = c3804bE.a;
            if (j4 < j) {
                while (j3 > j) {
                    c7520m23 = c7520m23.g;
                    AbstractC0087Ar1.b(c7520m23);
                    j3 -= c7520m23.c - c7520m23.b;
                }
                if (bArr.length == 2) {
                    byte b = bArr[0];
                    byte b2 = bArr[1];
                    while (j3 < this.g) {
                        i3 = (int) ((c7520m23.b + j) - j3);
                        int i5 = c7520m23.c;
                        while (i3 < i5) {
                            byte b3 = c7520m23.a[i3];
                            if (b3 == b || b3 == b2) {
                                i4 = c7520m23.b;
                                return (i3 - i4) + j3;
                            }
                            i3++;
                        }
                        j3 += c7520m23.c - c7520m23.b;
                        c7520m23 = c7520m23.f;
                        AbstractC0087Ar1.b(c7520m23);
                        j = j3;
                    }
                } else {
                    while (j3 < this.g) {
                        i3 = (int) ((c7520m23.b + j) - j3);
                        int i6 = c7520m23.c;
                        while (i3 < i6) {
                            byte b4 = c7520m23.a[i3];
                            for (byte b5 : bArr) {
                                if (b4 == b5) {
                                    i4 = c7520m23.b;
                                    return (i3 - i4) + j3;
                                }
                            }
                            i3++;
                        }
                        j3 += c7520m23.c - c7520m23.b;
                        c7520m23 = c7520m23.f;
                        AbstractC0087Ar1.b(c7520m23);
                        j = j3;
                    }
                }
            } else {
                while (true) {
                    long j5 = (c7520m23.c - c7520m23.b) + j2;
                    if (j5 > j) {
                        break;
                    }
                    c7520m23 = c7520m23.f;
                    AbstractC0087Ar1.b(c7520m23);
                    j2 = j5;
                }
                if (bArr.length == 2) {
                    byte b6 = bArr[0];
                    byte b7 = bArr[1];
                    while (j2 < this.g) {
                        i = (int) ((c7520m23.b + j) - j2);
                        int i7 = c7520m23.c;
                        while (i < i7) {
                            byte b8 = c7520m23.a[i];
                            if (b8 == b6 || b8 == b7) {
                                i2 = c7520m23.b;
                                return (i - i2) + j2;
                            }
                            i++;
                        }
                        j2 += c7520m23.c - c7520m23.b;
                        c7520m23 = c7520m23.f;
                        AbstractC0087Ar1.b(c7520m23);
                        j = j2;
                    }
                } else {
                    while (j2 < this.g) {
                        i = (int) ((c7520m23.b + j) - j2);
                        int i8 = c7520m23.c;
                        while (i < i8) {
                            byte b9 = c7520m23.a[i];
                            for (byte b10 : bArr) {
                                if (b9 == b10) {
                                    i2 = c7520m23.b;
                                    return (i - i2) + j2;
                                }
                            }
                            i++;
                        }
                        j2 += c7520m23.c - c7520m23.b;
                        c7520m23 = c7520m23.f;
                        AbstractC0087Ar1.b(c7520m23);
                        j = j2;
                    }
                }
            }
        }
        return -1L;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5173fD) {
                long j = this.g;
                C5173fD c5173fD = (C5173fD) obj;
                if (j == c5173fD.g) {
                    if (j != 0) {
                        C7520m23 c7520m23 = this.a;
                        AbstractC0087Ar1.b(c7520m23);
                        C7520m23 c7520m232 = c5173fD.a;
                        AbstractC0087Ar1.b(c7520m232);
                        int i = c7520m23.b;
                        int i2 = c7520m232.b;
                        long j2 = 0;
                        while (j2 < this.g) {
                            long min = Math.min(c7520m23.c - i, c7520m232.c - i2);
                            long j3 = 0;
                            while (j3 < min) {
                                int i3 = i + 1;
                                byte b = c7520m23.a[i];
                                int i4 = i2 + 1;
                                if (b == c7520m232.a[i2]) {
                                    j3++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == c7520m23.c) {
                                C7520m23 c7520m233 = c7520m23.f;
                                AbstractC0087Ar1.b(c7520m233);
                                i = c7520m233.b;
                                c7520m23 = c7520m233;
                            }
                            if (i2 == c7520m232.c) {
                                c7520m232 = c7520m232.f;
                                AbstractC0087Ar1.b(c7520m232);
                                i2 = c7520m232.b;
                            }
                            j2 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C7520m23 c7520m23 = this.a;
        if (c7520m23 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c7520m23.c;
            for (int i3 = c7520m23.b; i3 < i2; i3++) {
                i = (i * 31) + c7520m23.a[i3];
            }
            c7520m23 = c7520m23.f;
            AbstractC0087Ar1.b(c7520m23);
        } while (c7520m23 != this.a);
        return i;
    }

    public final Object clone() {
        C5173fD c5173fD = new C5173fD();
        if (this.g != 0) {
            C7520m23 c7520m23 = this.a;
            AbstractC0087Ar1.b(c7520m23);
            C7520m23 c = c7520m23.c();
            c5173fD.a = c;
            c.g = c;
            c.f = c;
            for (C7520m23 c7520m232 = c7520m23.f; c7520m232 != c7520m23; c7520m232 = c7520m232.f) {
                C7520m23 c7520m233 = c.g;
                AbstractC0087Ar1.b(c7520m233);
                AbstractC0087Ar1.b(c7520m232);
                c7520m233.b(c7520m232.c());
            }
            c5173fD.g = this.g;
        }
        return c5173fD;
    }

    public final C3804bE s(int i) {
        if (i == 0) {
            return C3804bE.i;
        }
        Xs4.b(this.g, 0L, i);
        C7520m23 c7520m23 = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            AbstractC0087Ar1.b(c7520m23);
            int i5 = c7520m23.c;
            int i6 = c7520m23.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c7520m23 = c7520m23.f;
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        C7520m23 c7520m232 = this.a;
        int i7 = 0;
        while (i2 < i) {
            AbstractC0087Ar1.b(c7520m232);
            bArr[i7] = c7520m232.a;
            i2 += c7520m232.c - c7520m232.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c7520m232.b;
            c7520m232.d = true;
            i7++;
            c7520m232 = c7520m232.f;
        }
        return new C8208o23(bArr, iArr);
    }
}
