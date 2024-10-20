package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UP0 {
    public ByteBuffer a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public int[] i;
    public int j;
    public int k;
    public final SP0 l;
    public final AbstractC7895n74 m;

    public UP0(int i) {
        TP0 tp0 = TP0.a;
        AbstractC7895n74 d = AbstractC7895n74.d();
        this.c = 1;
        this.d = null;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.i = new int[16];
        this.j = 0;
        this.k = 0;
        i = i <= 0 ? 1024 : i;
        this.l = tp0;
        ByteBuffer order = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        this.a = order;
        this.m = d;
        this.b = order.capacity();
    }

    public UP0() {
        this(1024);
    }

    public static boolean l(AbstractC11362xE3 abstractC11362xE3, int i) {
        return abstractC11362xE3.b(i) != 0;
    }

    public final int m() {
        return this.a.capacity() - this.b;
    }

    public final void n(int i, int i2) {
        int i3;
        if (i > this.c) {
            this.c = i;
        }
        int i4 = ((~((this.a.capacity() - this.b) + i2)) + 1) & (i - 1);
        while (this.b < i4 + i + i2) {
            int capacity = this.a.capacity();
            ByteBuffer byteBuffer = this.a;
            int capacity2 = byteBuffer.capacity();
            if (capacity2 == 0) {
                i3 = 1024;
            } else {
                i3 = 2147483639;
                if (capacity2 == 2147483639) {
                    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if (((-1073741824) & capacity2) == 0) {
                    i3 = capacity2 << 1;
                }
            }
            byteBuffer.position(0);
            ((TP0) this.l).getClass();
            ByteBuffer order = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
            order.position(order.clear().capacity() - capacity2);
            order.put(byteBuffer);
            this.a = order;
            this.b = (order.capacity() - capacity) + this.b;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer2 = this.a;
            int i6 = this.b - 1;
            this.b = i6;
            byteBuffer2.put(i6, (byte) 0);
        }
    }

    public final void a(int i, boolean z, boolean z2) {
        if (z != z2) {
            n(1, 0);
            ByteBuffer byteBuffer = this.a;
            int i2 = this.b - 1;
            this.b = i2;
            byteBuffer.put(i2, z ? (byte) 1 : (byte) 0);
            this.d[i] = m();
        }
    }

    public final void f(short s) {
        n(2, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 2;
        this.b = i;
        byteBuffer.putShort(i, s);
    }

    public final void c(int i, int i2) {
        if (i2 != 0) {
            n(4, 0);
            ByteBuffer byteBuffer = this.a;
            int i3 = this.b - 4;
            this.b = i3;
            byteBuffer.putInt(i3, i2);
            this.d[i] = m();
        }
    }

    public final void b(int i, float f) {
        if (f != 0.0d) {
            n(4, 0);
            ByteBuffer byteBuffer = this.a;
            int i2 = this.b - 4;
            this.b = i2;
            byteBuffer.putFloat(i2, f);
            this.d[i] = m();
        }
    }

    public final void d(int i) {
        n(4, 0);
        int m = (m() - i) + 4;
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 4;
        this.b = i2;
        byteBuffer.putInt(i2, m);
    }

    public final int j() {
        if (!this.f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f = false;
        int i = this.k;
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 4;
        this.b = i2;
        byteBuffer.putInt(i2, i);
        return m();
    }

    public final int g(String str) {
        AbstractC7895n74 abstractC7895n74 = this.m;
        int c = abstractC7895n74.c(str);
        n(1, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 1;
        this.b = i;
        byteBuffer.put(i, (byte) 0);
        p(1, c, 1);
        ByteBuffer byteBuffer2 = this.a;
        int i2 = this.b - c;
        this.b = i2;
        byteBuffer2.position(i2);
        abstractC7895n74.b(str, this.a);
        return j();
    }

    public final ByteBuffer h() {
        if (!this.g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        return this.a;
    }

    public final void o(int i) {
        if (this.f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
        int[] iArr = this.d;
        if (iArr == null || iArr.length < i) {
            this.d = new int[i];
        }
        this.e = i;
        Arrays.fill(this.d, 0, i, 0);
        this.f = true;
        this.h = m();
    }

    public final void p(int i, int i2, int i3) {
        if (!this.f) {
            this.k = i2;
            int i4 = i * i2;
            n(4, i4);
            n(i3, i4);
            this.f = true;
            return;
        }
        throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }

    public final void e(int i, int i2) {
        if (i2 != 0) {
            d(i2);
            this.d[i] = m();
        }
    }

    public final int i() {
        int i;
        if (this.d != null && this.f) {
            n(4, 0);
            ByteBuffer byteBuffer = this.a;
            int i2 = this.b - 4;
            this.b = i2;
            byteBuffer.putInt(i2, 0);
            int m = m();
            int i3 = this.e;
            do {
                i3--;
                if (i3 < 0) {
                    break;
                }
            } while (this.d[i3] == 0);
            int i4 = i3 + 1;
            while (i3 >= 0) {
                int i5 = this.d[i3];
                f((short) (i5 != 0 ? m - i5 : 0));
                i3--;
            }
            f((short) (m - this.h));
            f((short) ((i4 + 2) * 2));
            int i6 = 0;
            loop2: while (true) {
                if (i6 >= this.j) {
                    i = 0;
                    break;
                }
                int capacity = this.a.capacity() - this.i[i6];
                int i7 = this.b;
                short s = this.a.getShort(capacity);
                if (s == this.a.getShort(i7)) {
                    for (int i8 = 2; i8 < s; i8 += 2) {
                        if (this.a.getShort(capacity + i8) != this.a.getShort(i7 + i8)) {
                            break;
                        }
                    }
                    i = this.i[i6];
                    break loop2;
                }
                i6++;
            }
            if (i != 0) {
                int capacity2 = this.a.capacity() - m;
                this.b = capacity2;
                this.a.putInt(capacity2, i - m);
            } else {
                int i9 = this.j;
                int[] iArr = this.i;
                if (i9 == iArr.length) {
                    this.i = Arrays.copyOf(iArr, i9 * 2);
                }
                int[] iArr2 = this.i;
                int i10 = this.j;
                this.j = i10 + 1;
                iArr2[i10] = m();
                ByteBuffer byteBuffer2 = this.a;
                byteBuffer2.putInt(byteBuffer2.capacity() - m, m() - m);
            }
            this.f = false;
            return m;
        }
        throw new AssertionError("FlatBuffers: endTable called without startTable");
    }

    public final void k(int i) {
        n(this.c, 4);
        d(i);
        this.a.position(this.b);
        this.g = true;
    }
}
