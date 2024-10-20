package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DH0 {
    public static long b(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    public static long a(byte[] bArr) {
        int length = bArr.length;
        int i = length + 0;
        if (i < 0 || i > bArr.length) {
            throw new IndexOutOfBoundsException(AbstractC9076qb1.a("Out of bound index with offput: 0 and length: ", length));
        }
        if (length <= 32) {
            if (length > 16) {
                long j = (length * 2) - 7286425919675154353L;
                long d = d(0, bArr) * (-5435081209227447693L);
                long d2 = d(8, bArr);
                long d3 = d(i - 8, bArr) * j;
                return b(Long.rotateRight(d3, 30) + Long.rotateRight(d + d2, 43) + (d(i - 16, bArr) * (-7286425919675154353L)), Long.rotateRight(d2 - 7286425919675154353L, 18) + d + d3, j);
            }
            if (length >= 8) {
                long j2 = (length * 2) - 7286425919675154353L;
                long d4 = d(0, bArr) - 7286425919675154353L;
                long d5 = d(i - 8, bArr);
                return b((Long.rotateRight(d5, 37) * j2) + d4, (Long.rotateRight(d4, 25) + d5) * j2, j2);
            }
            if (length >= 4) {
                return b(((c(0, bArr) & 4294967295L) << 3) + length, c(i - 4, bArr) & 4294967295L, (length * 2) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            long j3 = (((bArr[0] & 255) + ((bArr[(length >> 1) + 0] & 255) << 8)) * (-7286425919675154353L)) ^ ((((bArr[(length - 1) + 0] & 255) << 2) + length) * (-4348849565147123417L));
            return (-7286425919675154353L) * (j3 ^ (j3 >>> 47));
        }
        if (length <= 64) {
            long j4 = (length * 2) - 7286425919675154353L;
            long d6 = d(0, bArr) * (-7286425919675154353L);
            long d7 = d(8, bArr);
            long d8 = d(i - 8, bArr) * j4;
            long rotateRight = Long.rotateRight(d8, 30) + Long.rotateRight(d6 + d7, 43) + (d(i - 16, bArr) * (-7286425919675154353L));
            long b = b(rotateRight, Long.rotateRight(d7 - 7286425919675154353L, 18) + d6 + d8, j4);
            long d9 = d(16, bArr) * j4;
            long d10 = d(24, bArr);
            long d11 = (d(i - 32, bArr) + rotateRight) * j4;
            return b(((d(i - 24, bArr) + b) * j4) + Long.rotateRight(d11, 30) + Long.rotateRight(d9 + d10, 43), Long.rotateRight(d10 + d6, 18) + d9 + d11, j4);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long d12 = d(0, bArr) + 95310865018149119L;
        int i2 = length - 1;
        int i3 = ((i2 / 64) * 64) + 0;
        int i4 = i2 & 63;
        int i5 = (i3 + i4) - 63;
        long j5 = 2480279821605975764L;
        long j6 = 1390051526045402406L;
        int i6 = 0;
        while (true) {
            long rotateRight2 = Long.rotateRight(d(i6 + 8, bArr) + d12 + j5 + jArr[0], 37) * (-5435081209227447693L);
            long rotateRight3 = Long.rotateRight(d(i6 + 48, bArr) + j5 + jArr[1], 42) * (-5435081209227447693L);
            long j7 = rotateRight2 ^ jArr2[1];
            long d13 = d(i6 + 40, bArr) + jArr[0] + rotateRight3;
            long rotateRight4 = Long.rotateRight(j6 + jArr2[0], 33) * (-5435081209227447693L);
            e(bArr, i6, jArr[1] * (-5435081209227447693L), j7 + jArr2[0], jArr);
            e(bArr, i6 + 32, rotateRight4 + jArr2[1], d(i6 + 16, bArr) + d13, jArr2);
            int i7 = i6 + 64;
            if (i7 == i3) {
                long j8 = (-5435081209227447693L) + ((j7 & 255) << 1);
                long j9 = jArr2[0] + i4;
                jArr2[0] = j9;
                long j10 = jArr[0] + j9;
                jArr[0] = j10;
                jArr2[0] = jArr2[0] + j10;
                long rotateRight5 = Long.rotateRight(d(i5 + 8, bArr) + rotateRight4 + d13 + jArr[0], 37) * j8;
                long rotateRight6 = Long.rotateRight(d(i5 + 48, bArr) + d13 + jArr[1], 42) * j8;
                long j11 = rotateRight5 ^ (jArr2[1] * 9);
                long d14 = d(i5 + 40, bArr) + (jArr[0] * 9) + rotateRight6;
                long rotateRight7 = Long.rotateRight(j7 + jArr2[0], 33) * j8;
                e(bArr, i5, jArr[1] * j8, j11 + jArr2[0], jArr);
                e(bArr, i5 + 32, rotateRight7 + jArr2[1], d(i5 + 16, bArr) + d14, jArr2);
                return b((((d14 >>> 47) ^ d14) * (-4348849565147123417L)) + b(jArr[0], jArr2[0], j8) + j11, b(jArr[1], jArr2[1], j8) + rotateRight7, j8);
            }
            i6 = i7;
            j6 = j7;
            j5 = d13;
            d12 = rotateRight4;
        }
    }

    public static long d(int i, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    public static int c(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void e(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long d = d(i, bArr);
        long d2 = d(i + 8, bArr);
        long d3 = d(i + 16, bArr);
        long d4 = d(i + 24, bArr);
        long j3 = j + d;
        long j4 = d2 + j3 + d3;
        long rotateRight = Long.rotateRight(j4, 44) + Long.rotateRight(j2 + j3 + d4, 21);
        jArr[0] = j4 + d4;
        jArr[1] = rotateRight + j3;
    }
}
