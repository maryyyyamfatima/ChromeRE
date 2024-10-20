package defpackage;

import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q74, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8925q74 extends AbstractC7895n74 {
    @Override // defpackage.AbstractC7895n74
    public final int c(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new C8582p74(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.AbstractC7895n74
    public final String a(ByteBuffer byteBuffer, int i, int i2) {
        if (!byteBuffer.hasArray()) {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = i;
            int i5 = 0;
            while (i4 < i3) {
                byte b = byteBuffer.get(i4);
                if (!(b >= 0)) {
                    break;
                }
                i4++;
                cArr[i5] = (char) b;
                i5++;
            }
            int i6 = i5;
            while (i4 < i3) {
                int i7 = i4 + 1;
                byte b2 = byteBuffer.get(i4);
                if (b2 >= 0) {
                    cArr[i6] = (char) b2;
                    i6++;
                    i4 = i7;
                    while (i4 < i3) {
                        byte b3 = byteBuffer.get(i4);
                        if (!(b3 >= 0)) {
                            break;
                        }
                        i4++;
                        cArr[i6] = (char) b3;
                        i6++;
                    }
                } else {
                    if (!(b2 < -32)) {
                        if (b2 < -16) {
                            if (i7 >= i3 - 1) {
                                throw new IllegalArgumentException("Invalid UTF-8");
                            }
                            int i8 = i7 + 1;
                            AbstractC6177i74.b(b2, byteBuffer.get(i7), byteBuffer.get(i8), cArr, i6);
                            i4 = i8 + 1;
                            i6++;
                        } else {
                            if (i7 >= i3 - 2) {
                                throw new IllegalArgumentException("Invalid UTF-8");
                            }
                            int i9 = i7 + 1;
                            byte b4 = byteBuffer.get(i7);
                            int i10 = i9 + 1;
                            byte b5 = byteBuffer.get(i9);
                            i4 = i10 + 1;
                            AbstractC6177i74.a(b2, b4, b5, byteBuffer.get(i10), cArr, i6);
                            i6 = i6 + 1 + 1;
                        }
                    } else {
                        if (i7 >= i3) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i4 = i7 + 1;
                        AbstractC6177i74.c(b2, byteBuffer.get(i7), cArr, i6);
                        i6++;
                    }
                }
            }
            return new String(cArr, 0, i6);
        }
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + i;
        if ((arrayOffset | i2 | ((array.length - arrayOffset) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(array.length), Integer.valueOf(arrayOffset), Integer.valueOf(i2)));
        }
        int i11 = arrayOffset + i2;
        char[] cArr2 = new char[i2];
        int i12 = 0;
        while (arrayOffset < i11) {
            byte b6 = array[arrayOffset];
            if (!(b6 >= 0)) {
                break;
            }
            arrayOffset++;
            cArr2[i12] = (char) b6;
            i12++;
        }
        int i13 = i12;
        while (arrayOffset < i11) {
            int i14 = arrayOffset + 1;
            byte b7 = array[arrayOffset];
            if (b7 >= 0) {
                cArr2[i13] = (char) b7;
                i13++;
                arrayOffset = i14;
                while (arrayOffset < i11) {
                    byte b8 = array[arrayOffset];
                    if (!(b8 >= 0)) {
                        break;
                    }
                    arrayOffset++;
                    cArr2[i13] = (char) b8;
                    i13++;
                }
            } else {
                if (!(b7 < -32)) {
                    if (b7 < -16) {
                        if (i14 >= i11 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        int i15 = i14 + 1;
                        AbstractC6177i74.b(b7, array[i14], array[i15], cArr2, i13);
                        arrayOffset = i15 + 1;
                        i13++;
                    } else {
                        if (i14 >= i11 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        int i16 = i14 + 1;
                        byte b9 = array[i14];
                        int i17 = i16 + 1;
                        byte b10 = array[i16];
                        arrayOffset = i17 + 1;
                        AbstractC6177i74.a(b7, b9, b10, array[i17], cArr2, i13);
                        i13 = i13 + 1 + 1;
                    }
                } else {
                    if (i14 >= i11) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    arrayOffset = i14 + 1;
                    AbstractC6177i74.c(b7, array[i14], cArr2, i13);
                    i13++;
                }
            }
        }
        return new String(cArr2, 0, i13);
    }

    @Override // defpackage.AbstractC7895n74
    public final void b(String str, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        char charAt;
        char c = 2048;
        int i4 = 0;
        if (!byteBuffer.hasArray()) {
            int length = str.length();
            int position = byteBuffer.position();
            while (i4 < length) {
                try {
                    char charAt2 = str.charAt(i4);
                    if (charAt2 >= 128) {
                        break;
                    }
                    byteBuffer.put(position + i4, (byte) charAt2);
                    i4++;
                } catch (IndexOutOfBoundsException unused) {
                    int max = Math.max(i4, (position - byteBuffer.position()) + 1) + byteBuffer.position();
                    char charAt3 = str.charAt(i4);
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Failed writing ");
                    sb.append(charAt3);
                    sb.append(" at index ");
                    sb.append(max);
                    throw new ArrayIndexOutOfBoundsException(sb.toString());
                }
            }
            if (i4 == length) {
                byteBuffer.position(position + i4);
                return;
            }
            position += i4;
            while (i4 < length) {
                char charAt4 = str.charAt(i4);
                if (charAt4 < 128) {
                    byteBuffer.put(position, (byte) charAt4);
                } else if (charAt4 < 2048) {
                    int i5 = position + 1;
                    try {
                        byteBuffer.put(position, (byte) ((charAt4 >>> 6) | 192));
                        byteBuffer.put(i5, (byte) ((charAt4 & '?') | 128));
                        position = i5;
                    } catch (IndexOutOfBoundsException unused2) {
                        position = i5;
                        int max2 = Math.max(i4, (position - byteBuffer.position()) + 1) + byteBuffer.position();
                        char charAt32 = str.charAt(i4);
                        StringBuilder sb2 = new StringBuilder(37);
                        sb2.append("Failed writing ");
                        sb2.append(charAt32);
                        sb2.append(" at index ");
                        sb2.append(max2);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                } else if (charAt4 < 55296 || 57343 < charAt4) {
                    int i6 = position + 1;
                    byteBuffer.put(position, (byte) ((charAt4 >>> '\f') | 224));
                    position = i6 + 1;
                    byteBuffer.put(i6, (byte) (((charAt4 >>> 6) & 63) | 128));
                    byteBuffer.put(position, (byte) ((charAt4 & '?') | 128));
                } else {
                    int i7 = i4 + 1;
                    if (i7 != length) {
                        try {
                            char charAt5 = str.charAt(i7);
                            if (Character.isSurrogatePair(charAt4, charAt5)) {
                                int codePoint = Character.toCodePoint(charAt4, charAt5);
                                int i8 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    int i9 = i8 + 1;
                                    byteBuffer.put(i8, (byte) (((codePoint >>> 12) & 63) | 128));
                                    int i10 = i9 + 1;
                                    byteBuffer.put(i9, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(i10, (byte) ((codePoint & 63) | 128));
                                    position = i10;
                                    i4 = i7;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i8;
                                    i4 = i7;
                                    int max22 = Math.max(i4, (position - byteBuffer.position()) + 1) + byteBuffer.position();
                                    char charAt322 = str.charAt(i4);
                                    StringBuilder sb22 = new StringBuilder(37);
                                    sb22.append("Failed writing ");
                                    sb22.append(charAt322);
                                    sb22.append(" at index ");
                                    sb22.append(max22);
                                    throw new ArrayIndexOutOfBoundsException(sb22.toString());
                                }
                            } else {
                                i4 = i7;
                            }
                        } catch (IndexOutOfBoundsException unused4) {
                        }
                    }
                    throw new C8582p74(i4, length);
                }
                i4++;
                position++;
            }
            byteBuffer.position(position);
            return;
        }
        int arrayOffset = byteBuffer.arrayOffset();
        byte[] array = byteBuffer.array();
        int position2 = byteBuffer.position() + arrayOffset;
        int remaining = byteBuffer.remaining();
        int length2 = str.length();
        int i11 = remaining + position2;
        while (i4 < length2) {
            int i12 = i4 + position2;
            if (i12 >= i11 || (charAt = str.charAt(i4)) >= 128) {
                break;
            }
            array[i12] = (byte) charAt;
            i4++;
        }
        if (i4 == length2) {
            i = position2 + length2;
        } else {
            i = position2 + i4;
            while (i4 < length2) {
                char charAt6 = str.charAt(i4);
                if (charAt6 >= 128 || i >= i11) {
                    if (charAt6 < c && i <= i11 - 2) {
                        int i13 = i + 1;
                        array[i] = (byte) ((charAt6 >>> 6) | 960);
                        array[i13] = (byte) ((charAt6 & '?') | 128);
                        i = i13 + 1;
                    } else {
                        if ((charAt6 >= 55296 && 57343 >= charAt6) || i > i11 - 3) {
                            if (i <= i11 - 4) {
                                int i14 = i4 + 1;
                                if (i14 != str.length()) {
                                    char charAt7 = str.charAt(i14);
                                    if (Character.isSurrogatePair(charAt6, charAt7)) {
                                        int codePoint2 = Character.toCodePoint(charAt6, charAt7);
                                        int i15 = i + 1;
                                        array[i] = (byte) ((codePoint2 >>> 18) | 240);
                                        int i16 = i15 + 1;
                                        array[i15] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                        int i17 = i16 + 1;
                                        array[i16] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                        i = i17 + 1;
                                        array[i17] = (byte) ((codePoint2 & 63) | 128);
                                        i4 = i14;
                                    } else {
                                        i4 = i14;
                                    }
                                }
                                throw new C8582p74(i4 - 1, length2);
                            }
                            if (55296 <= charAt6 && charAt6 <= 57343 && ((i3 = i4 + 1) == str.length() || !Character.isSurrogatePair(charAt6, str.charAt(i3)))) {
                                throw new C8582p74(i4, length2);
                            }
                            StringBuilder sb3 = new StringBuilder(37);
                            sb3.append("Failed writing ");
                            sb3.append(charAt6);
                            sb3.append(" at index ");
                            sb3.append(i);
                            throw new ArrayIndexOutOfBoundsException(sb3.toString());
                        }
                        int i18 = i + 1;
                        array[i] = (byte) ((charAt6 >>> '\f') | 480);
                        int i19 = i18 + 1;
                        array[i18] = (byte) (((charAt6 >>> 6) & 63) | 128);
                        i2 = i19 + 1;
                        array[i19] = (byte) ((charAt6 & '?') | 128);
                    }
                    i4++;
                    c = 2048;
                } else {
                    i2 = i + 1;
                    array[i] = (byte) charAt6;
                }
                i = i2;
                i4++;
                c = 2048;
            }
        }
        byteBuffer.position(i - arrayOffset);
    }
}
