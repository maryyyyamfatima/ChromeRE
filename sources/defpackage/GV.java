package defpackage;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class GV {
    public final ByteBuffer a;

    public static int g(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int h(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public GV(byte[] bArr, int i, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        this.a = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void o(double d, int i) {
        y(i, 1);
        long doubleToLongBits = Double.doubleToLongBits(d);
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() < 8) {
            throw new FV(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.putLong(doubleToLongBits);
    }

    public final void p(int i, float f) {
        y(i, 5);
        q(f);
    }

    public final void s(int i, long j) {
        y(i, 0);
        w(j);
    }

    public final void r(int i, int i2) {
        y(i, 0);
        if (i2 >= 0) {
            v(i2);
        } else {
            w(i2);
        }
    }

    public final void n(int i, boolean z) {
        y(i, 0);
        u(z ? 1 : 0);
    }

    public final void x(int i, String str) {
        y(i, 2);
        ByteBuffer byteBuffer = this.a;
        try {
            int g = g(str.length());
            if (g == g(str.length() * 3)) {
                int position = byteBuffer.position();
                if (byteBuffer.remaining() < g) {
                    throw new FV(position + g, byteBuffer.limit());
                }
                byteBuffer.position(position + g);
                l(str, byteBuffer);
                int position2 = byteBuffer.position();
                byteBuffer.position(position);
                v((position2 - position) - g);
                byteBuffer.position(position2);
                return;
            }
            v(m(str));
            l(str, byteBuffer);
        } catch (BufferOverflowException e) {
            FV fv = new FV(byteBuffer.position(), byteBuffer.limit());
            fv.initCause(e);
            throw fv;
        }
    }

    public final void t(int i, RF0 rf0) {
        y(i, 2);
        v(rf0.getCachedSize());
        rf0.writeTo(this);
    }

    public final void q(float f) {
        int floatToIntBits = Float.floatToIntBits(f);
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() < 4) {
            throw new FV(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public static int m(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new IllegalArgumentException("Unpaired surrogate at index " + i2);
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
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    public static void l(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(k(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        }
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 128) {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 2048) {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            } else if (charAt < 55296 || 57343 < charAt) {
                byteBuffer.put((byte) ((charAt >>> '\f') | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            } else {
                int i2 = i + 1;
                if (i2 != charSequence.length()) {
                    char charAt2 = charSequence.charAt(i2);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int codePoint = Character.toCodePoint(charAt, charAt2);
                        byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                        byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((codePoint & 63) | 128));
                        i = i2;
                    } else {
                        i = i2;
                    }
                }
                StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
                sb.append(i - 1);
                throw new IllegalArgumentException(sb.toString());
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:            return r10 + r0;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int k(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GV.k(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int b(int i) {
        return j(i) + 8;
    }

    public static int c(int i) {
        return j(i) + 4;
    }

    public static int e(int i, long j) {
        return j(i) + h(j);
    }

    public static int d(int i, int i2) {
        return j(i) + (i2 >= 0 ? g(i2) : 10);
    }

    public static int a(int i) {
        return j(i) + 1;
    }

    public static int i(int i, String str) {
        int j = j(i);
        int m = m(str);
        return j + g(m) + m;
    }

    public static int f(int i, RF0 rf0) {
        int j = j(i);
        int serializedSize = rf0.getSerializedSize();
        return j + g(serializedSize) + serializedSize;
    }

    public final void u(int i) {
        byte b = (byte) i;
        ByteBuffer byteBuffer = this.a;
        if (!byteBuffer.hasRemaining()) {
            throw new FV(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b);
    }

    public final void y(int i, int i2) {
        v((i << 3) | i2);
    }

    public static int j(int i) {
        return g((i << 3) | 0);
    }

    public final void v(int i) {
        while ((i & (-128)) != 0) {
            u((i & 127) | 128);
            i >>>= 7;
        }
        u(i);
    }

    public final void w(long j) {
        while (((-128) & j) != 0) {
            u((((int) j) & 127) | 128);
            j >>>= 7;
        }
        u((int) j);
    }
}
