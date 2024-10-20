package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1346Kj0 implements InterfaceC0947Hh1 {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    @Override // defpackage.InterfaceC0947Hh1
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        AbstractC6464iy2.b(inputStream);
        return f(new C1216Jj0(inputStream));
    }

    @Override // defpackage.InterfaceC0947Hh1
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        AbstractC6464iy2.b(byteBuffer);
        return f(new C0696Fj0(byteBuffer));
    }

    @Override // defpackage.InterfaceC0947Hh1
    public final int d(InputStream inputStream, C3492aK1 c3492aK1) {
        AbstractC6464iy2.b(inputStream);
        C1216Jj0 c1216Jj0 = new C1216Jj0(inputStream);
        AbstractC6464iy2.b(c3492aK1);
        return e(c1216Jj0, c3492aK1);
    }

    @Override // defpackage.InterfaceC0947Hh1
    public final int b(ByteBuffer byteBuffer, C3492aK1 c3492aK1) {
        AbstractC6464iy2.b(byteBuffer);
        C0696Fj0 c0696Fj0 = new C0696Fj0(byteBuffer);
        AbstractC6464iy2.b(c3492aK1);
        return e(c0696Fj0, c3492aK1);
    }

    public static ImageHeaderParser$ImageType f(InterfaceC1086Ij0 interfaceC1086Ij0) {
        try {
            int a2 = interfaceC1086Ij0.a();
            if (a2 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int b2 = (a2 << 8) | interfaceC1086Ij0.b();
            if (b2 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int b3 = (b2 << 8) | interfaceC1086Ij0.b();
            if (b3 == -1991225785) {
                interfaceC1086Ij0.skip(21L);
                try {
                    return interfaceC1086Ij0.b() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (C0956Hj0 unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (b3 == 1380533830) {
                interfaceC1086Ij0.skip(4L);
                if (((interfaceC1086Ij0.a() << 16) | interfaceC1086Ij0.a()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int a3 = (interfaceC1086Ij0.a() << 16) | interfaceC1086Ij0.a();
                if ((a3 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = a3 & 255;
                if (i != 88) {
                    if (i == 76) {
                        interfaceC1086Ij0.skip(4L);
                        return (interfaceC1086Ij0.b() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                    }
                    return ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC1086Ij0.skip(4L);
                short b4 = interfaceC1086Ij0.b();
                if ((b4 & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                if ((b4 & 16) != 0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            boolean z = false;
            if (((interfaceC1086Ij0.a() << 16) | interfaceC1086Ij0.a()) == 1718909296) {
                int a4 = (interfaceC1086Ij0.a() << 16) | interfaceC1086Ij0.a();
                if (a4 != 1635150182 && a4 != 1635150195) {
                    interfaceC1086Ij0.skip(4L);
                    int i2 = b3 - 16;
                    if (i2 % 4 == 0) {
                        int i3 = 0;
                        while (i3 < 5 && i2 > 0) {
                            int a5 = (interfaceC1086Ij0.a() << 16) | interfaceC1086Ij0.a();
                            if (a5 != 1635150182 && a5 != 1635150195) {
                                i3++;
                                i2 -= 4;
                            }
                        }
                    }
                }
                z = true;
                break;
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (C0956Hj0 unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[Catch: Hj0 -> 0x005e, TryCatch #0 {Hj0 -> 0x005e, blocks: (B:3:0x0001, B:14:0x001b, B:28:0x0049, B:31:0x0055, B:35:0x005a, B:36:0x005d, B:16:0x0024, B:20:0x0032, B:22:0x003c, B:30:0x0051), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049 A[Catch: Hj0 -> 0x005e, TRY_LEAVE, TryCatch #0 {Hj0 -> 0x005e, blocks: (B:3:0x0001, B:14:0x001b, B:28:0x0049, B:31:0x0055, B:35:0x005a, B:36:0x005d, B:16:0x0024, B:20:0x0032, B:22:0x003c, B:30:0x0051), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0046 A[EDGE_INSN: B:38:0x0046->B:26:0x0046 BREAK  A[LOOP:0: B:14:0x001b->B:37:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(defpackage.InterfaceC1086Ij0 r5, defpackage.C3492aK1 r6) {
        /*
            r0 = -1
            int r1 = r5.a()     // Catch: defpackage.C0956Hj0 -> L5e
            r2 = 65496(0xffd8, float:9.178E-41)
            r3 = r1 & r2
            if (r3 == r2) goto L17
            r2 = 19789(0x4d4d, float:2.773E-41)
            if (r1 == r2) goto L17
            r2 = 18761(0x4949, float:2.629E-41)
            if (r1 != r2) goto L15
            goto L17
        L15:
            r1 = 0
            goto L18
        L17:
            r1 = 1
        L18:
            if (r1 != 0) goto L1b
            return r0
        L1b:
            short r1 = r5.b()     // Catch: defpackage.C0956Hj0 -> L5e
            r2 = 255(0xff, float:3.57E-43)
            if (r1 == r2) goto L24
            goto L45
        L24:
            short r1 = r5.b()     // Catch: defpackage.C0956Hj0 -> L5e
            r2 = 218(0xda, float:3.05E-43)
            if (r1 != r2) goto L2d
            goto L45
        L2d:
            r2 = 217(0xd9, float:3.04E-43)
            if (r1 != r2) goto L32
            goto L45
        L32:
            int r2 = r5.a()     // Catch: defpackage.C0956Hj0 -> L5e
            int r2 = r2 + (-2)
            r3 = 225(0xe1, float:3.15E-43)
            if (r1 == r3) goto L46
            long r1 = (long) r2     // Catch: defpackage.C0956Hj0 -> L5e
            long r3 = r5.skip(r1)     // Catch: defpackage.C0956Hj0 -> L5e
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L1b
        L45:
            r2 = r0
        L46:
            if (r2 != r0) goto L49
            return r0
        L49:
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r1 = r6.c(r1, r2)     // Catch: defpackage.C0956Hj0 -> L5e
            byte[] r1 = (byte[]) r1     // Catch: defpackage.C0956Hj0 -> L5e
            int r5 = g(r5, r1, r2)     // Catch: java.lang.Throwable -> L59
            r6.g(r1)     // Catch: defpackage.C0956Hj0 -> L5e
            return r5
        L59:
            r5 = move-exception
            r6.g(r1)     // Catch: defpackage.C0956Hj0 -> L5e
            throw r5     // Catch: defpackage.C0956Hj0 -> L5e
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1346Kj0.e(Ij0, aK1):int");
    }

    public static int g(InterfaceC1086Ij0 interfaceC1086Ij0, byte[] bArr, int i) {
        ByteOrder byteOrder;
        short a2;
        int i2;
        int i3;
        if (interfaceC1086Ij0.c(i, bArr) != i) {
            return -1;
        }
        byte[] bArr2 = a;
        boolean z = bArr != null && i > bArr2.length;
        if (z) {
            int i4 = 0;
            while (true) {
                if (i4 >= bArr2.length) {
                    break;
                }
                if (bArr[i4] != bArr2[i4]) {
                    z = false;
                    break;
                }
                i4++;
            }
        }
        if (!z) {
            return -1;
        }
        C0826Gj0 c0826Gj0 = new C0826Gj0(i, bArr);
        short a3 = c0826Gj0.a(6);
        if (a3 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a3 == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        ByteBuffer byteBuffer = c0826Gj0.a;
        byteBuffer.order(byteOrder);
        int i5 = (byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1) + 6;
        short a4 = c0826Gj0.a(i5);
        for (int i6 = 0; i6 < a4; i6++) {
            int i7 = (i6 * 12) + i5 + 2;
            if (c0826Gj0.a(i7) == 274 && (a2 = c0826Gj0.a(i7 + 2)) >= 1 && a2 <= 12) {
                int i8 = i7 + 4;
                int i9 = byteBuffer.remaining() - i8 >= 4 ? byteBuffer.getInt(i8) : -1;
                if (i9 >= 0 && (i2 = i9 + b[a2]) <= 4 && (i3 = i7 + 8) >= 0 && i3 <= byteBuffer.remaining() && i2 >= 0 && i2 + i3 <= byteBuffer.remaining()) {
                    return c0826Gj0.a(i3);
                }
            }
        }
        return -1;
    }
}
