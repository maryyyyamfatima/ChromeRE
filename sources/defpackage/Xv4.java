package defpackage;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Xv4 {
    public static X509Certificate[][] a(String str) {
        RandomAccessFile randomAccessFile;
        Pair b;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile2.length() < 22) {
                b = null;
            } else {
                b = b(randomAccessFile2, 0);
                if (b == null) {
                    b = b(randomAccessFile2, 65535);
                }
            }
            try {
                if (b == null) {
                    long length = randomAccessFile2.length();
                    StringBuilder sb = new StringBuilder(102);
                    sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                    sb.append(length);
                    sb.append(" bytes");
                    throw new Dv4(sb.toString());
                }
                ByteBuffer byteBuffer = (ByteBuffer) b.first;
                long longValue = ((Long) b.second).longValue();
                long j = (-20) + longValue;
                if (j >= 0) {
                    randomAccessFile2.seek(j);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new Dv4("ZIP64 APK not supported");
                    }
                }
                c(byteBuffer);
                long j2 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
                if (j2 >= longValue) {
                    StringBuilder sb2 = new StringBuilder(122);
                    sb2.append("ZIP Central Directory offset out of range: ");
                    sb2.append(j2);
                    sb2.append(". ZIP End of Central Directory offset: ");
                    sb2.append(longValue);
                    throw new Dv4(sb2.toString());
                }
                c(byteBuffer);
                if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j2 != longValue) {
                    throw new Dv4("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (j2 < 32) {
                    StringBuilder sb3 = new StringBuilder(87);
                    sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb3.append(j2);
                    throw new Dv4(sb3.toString());
                }
                ByteBuffer allocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                allocate.order(byteOrder);
                randomAccessFile2.seek(j2 - allocate.capacity());
                randomAccessFile2.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                    throw new Dv4("No APK Signing Block before ZIP Central Directory");
                }
                long j3 = allocate.getLong(0);
                if (j3 < allocate.capacity() || j3 > 2147483639) {
                    StringBuilder sb4 = new StringBuilder(57);
                    sb4.append("APK Signing Block size out of range: ");
                    sb4.append(j3);
                    throw new Dv4(sb4.toString());
                }
                int i = (int) (8 + j3);
                long j4 = j2 - i;
                if (j4 < 0) {
                    StringBuilder sb5 = new StringBuilder(59);
                    sb5.append("APK Signing Block offset out of range: ");
                    sb5.append(j4);
                    throw new Dv4(sb5.toString());
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(i);
                allocate2.order(byteOrder);
                randomAccessFile2.seek(j4);
                randomAccessFile2.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                randomAccessFile = randomAccessFile2;
                long j5 = allocate2.getLong(0);
                if (j5 != j3) {
                    StringBuilder sb6 = new StringBuilder(103);
                    sb6.append("APK Signing Block sizes in header and footer do not match: ");
                    sb6.append(j5);
                    sb6.append(" vs ");
                    sb6.append(j3);
                    throw new Dv4(sb6.toString());
                }
                Pair create = Pair.create(allocate2, Long.valueOf(j4));
                ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                long longValue2 = ((Long) create.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int capacity = byteBuffer2.capacity() - 24;
                if (capacity < 8) {
                    StringBuilder sb7 = new StringBuilder(38);
                    sb7.append("end < start: ");
                    sb7.append(capacity);
                    sb7.append(" < 8");
                    throw new IllegalArgumentException(sb7.toString());
                }
                int capacity2 = byteBuffer2.capacity();
                if (capacity > byteBuffer2.capacity()) {
                    StringBuilder sb8 = new StringBuilder(41);
                    sb8.append("end > capacity: ");
                    sb8.append(capacity);
                    sb8.append(" > ");
                    sb8.append(capacity2);
                    throw new IllegalArgumentException(sb8.toString());
                }
                int limit = byteBuffer2.limit();
                int position = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(capacity);
                    byteBuffer2.position(8);
                    ByteBuffer slice = byteBuffer2.slice();
                    slice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(limit);
                    byteBuffer2.position(position);
                    int i2 = 0;
                    while (slice.hasRemaining()) {
                        i2++;
                        if (slice.remaining() < 8) {
                            StringBuilder sb9 = new StringBuilder(70);
                            sb9.append("Insufficient data to read size of APK Signing Block entry #");
                            sb9.append(i2);
                            throw new Dv4(sb9.toString());
                        }
                        long j6 = slice.getLong();
                        if (j6 < 4 || j6 > 2147483647L) {
                            StringBuilder sb10 = new StringBuilder(76);
                            sb10.append("APK Signing Block entry #");
                            sb10.append(i2);
                            sb10.append(" size out of range: ");
                            sb10.append(j6);
                            throw new Dv4(sb10.toString());
                        }
                        int i3 = (int) j6;
                        int position2 = slice.position() + i3;
                        if (i3 > slice.remaining()) {
                            int remaining = slice.remaining();
                            StringBuilder sb11 = new StringBuilder(91);
                            sb11.append("APK Signing Block entry #");
                            sb11.append(i2);
                            sb11.append(" size out of range: ");
                            sb11.append(i3);
                            sb11.append(", available: ");
                            sb11.append(remaining);
                            throw new Dv4(sb11.toString());
                        }
                        if (slice.getInt() == 1896449818) {
                            X509Certificate[][] d = d(randomAccessFile.getChannel(), new C11256wv4(j(i3 - 4, slice), longValue2, j2, longValue, byteBuffer));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return d;
                        }
                        slice.position(position2);
                    }
                    throw new Dv4("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(limit);
                    byteBuffer2.position(position);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = randomAccessFile2;
        }
    }

    public static Pair b(RandomAccessFile randomAccessFile, int i) {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        c(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, 65535);
            for (int i4 = 0; i4 < min; i4++) {
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                    break;
                }
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i2));
    }

    public static void c(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static X509Certificate[][] d(FileChannel fileChannel, C11256wv4 c11256wv4) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer k = k(c11256wv4.a);
                int i = 0;
                while (k.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(e(k(k), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j = c11256wv4.b;
                long j2 = c11256wv4.c;
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                C9199qv4 c9199qv4 = new C9199qv4(fileChannel, 0L, j);
                C9199qv4 c9199qv42 = new C9199qv4(fileChannel, j2, c11256wv4.d - j2);
                ByteBuffer duplicate = c11256wv4.e.duplicate();
                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                c(duplicate);
                int position = duplicate.position() + 16;
                if (j < 0 || j > 4294967295L) {
                    StringBuilder sb2 = new StringBuilder(47);
                    sb2.append("uint32 value of out range: ");
                    sb2.append(j);
                    throw new IllegalArgumentException(sb2.toString());
                }
                duplicate.putInt(duplicate.position() + position, (int) j);
                C6787ju4 c6787ju4 = new C6787ju4(duplicate);
                int size = hashMap.size();
                int[] iArr = new int[size];
                Iterator it = hashMap.keySet().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = ((Integer) it.next()).intValue();
                    i2++;
                }
                try {
                    byte[][] f = f(iArr, new InterfaceC5763gv4[]{c9199qv4, c9199qv42, c6787ju4});
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = iArr[i3];
                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i4)), f[i3])) {
                            throw new SecurityException(h(i4).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                } catch (DigestException e2) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                }
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:            r12 = g(r11);        r13 = g(r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:            if (r12 == 1) goto L152;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:            if (r13 == 1) goto L149;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x00ca. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147 A[Catch: InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x026b, InvalidAlgorithmParameterException -> 0x026d, InvalidKeyException -> 0x026f, InvalidKeySpecException -> 0x0271, NoSuchAlgorithmException -> 0x0273, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x026b, blocks: (B:76:0x0131, B:78:0x0147, B:79:0x014a), top: B:75:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.cert.X509Certificate[] e(java.nio.ByteBuffer r18, java.util.HashMap r19, java.security.cert.CertificateFactory r20) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Xv4.e(java.nio.ByteBuffer, java.util.HashMap, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    public static byte[][] f(int[] iArr, InterfaceC5763gv4[] interfaceC5763gv4Arr) {
        int i;
        long j;
        int length;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            i = 3;
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            j3 += (interfaceC5763gv4Arr[i2].a() + 1048575) / 1048576;
            i2++;
        }
        if (j3 >= 2097151) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(j3);
            throw new DigestException(sb.toString());
        }
        int i3 = (int) j3;
        byte[][] bArr = new byte[iArr.length];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i4 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(i(iArr[i4]) * i3) + 5];
            bArr2[0] = 90;
            m(i3, bArr2);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            String h = h(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(h);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(h.concat(" digest not supported"), e);
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i) {
            InterfaceC5763gv4 interfaceC5763gv4 = interfaceC5763gv4Arr[i6];
            long j4 = j2;
            int i9 = i6;
            long a = interfaceC5763gv4.a();
            while (a > j2) {
                int min = (int) Math.min(a, j);
                m(min, bArr3);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr3);
                }
                long j5 = j4;
                try {
                    interfaceC5763gv4.b(messageDigestArr, j5, min);
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        InterfaceC5763gv4 interfaceC5763gv42 = interfaceC5763gv4;
                        byte[] bArr4 = bArr[i11];
                        int i13 = i(i12);
                        byte[] bArr5 = bArr3;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr4, (i7 * i13) + 5, i13);
                        if (digest != i13) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i11++;
                        interfaceC5763gv4 = interfaceC5763gv42;
                        bArr3 = bArr5;
                        messageDigestArr = messageDigestArr2;
                    }
                    InterfaceC5763gv4 interfaceC5763gv43 = interfaceC5763gv4;
                    long j6 = min;
                    long j7 = j5 + j6;
                    a -= j6;
                    i7++;
                    j2 = 0;
                    j = 1048576;
                    interfaceC5763gv4 = interfaceC5763gv43;
                    bArr3 = bArr3;
                    j4 = j7;
                } catch (IOException e2) {
                    StringBuilder sb3 = new StringBuilder(59);
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i7);
                    sb3.append(" of section #");
                    sb3.append(i8);
                    throw new DigestException(sb3.toString(), e2);
                }
            }
            i8++;
            i6 = i9 + 1;
            j2 = 0;
            i = 3;
            j = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr7 = bArr[i14];
            String h2 = h(i15);
            try {
                bArr6[i14] = MessageDigest.getInstance(h2).digest(bArr7);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(h2.concat(" digest not supported"), e3);
            }
        }
        return bArr6;
    }

    public static int g(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString(i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    public static String h(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int i(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static ByteBuffer j(int i, ByteBuffer byteBuffer) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static ByteBuffer k(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(93);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return j(i, byteBuffer);
        }
        int remaining2 = byteBuffer.remaining();
        StringBuilder sb2 = new StringBuilder(101);
        sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
        sb2.append(i);
        sb2.append(", remaining: ");
        sb2.append(remaining2);
        throw new IOException(sb2.toString());
    }

    public static byte[] l(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        StringBuilder sb = new StringBuilder(90);
        sb.append("Underflow while reading length-prefixed value. Length: ");
        sb.append(i);
        sb.append(", available: ");
        sb.append(remaining);
        throw new IOException(sb.toString());
    }

    public static void m(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }
}
