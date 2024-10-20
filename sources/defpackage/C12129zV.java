package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C12129zV {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g = Integer.MAX_VALUE;
    public int h;

    public final boolean o(int i) {
        int m;
        int i2 = i & 7;
        if (i2 == 0) {
            j();
            return true;
        }
        if (i2 == 1) {
            i();
            return true;
        }
        if (i2 == 2) {
            p(j());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                h();
                return true;
            }
            throw new C1257Jr1("Protocol message tag had invalid wire type.");
        }
        do {
            m = m();
            if (m == 0) {
                break;
            }
        } while (o(m));
        if (this.f == (((i >>> 3) << 3) | 4)) {
            return true;
        }
        throw new C1257Jr1("Protocol message end-group tag did not match expected tag.");
    }

    public final double d() {
        return Double.longBitsToDouble(i());
    }

    public final float e() {
        return Float.intBitsToFloat(h());
    }

    public final boolean c() {
        return j() != 0;
    }

    public final String l() {
        int j = j();
        if (j < 0) {
            throw new C1257Jr1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i = this.c;
        int i2 = this.e;
        if (j > i - i2) {
            throw new C1257Jr1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
        }
        String str = new String(this.a, i2, j, "UTF-8");
        this.e += j;
        return str;
    }

    public final void f(RF0 rf0) {
        int j = j();
        if (this.h >= 64) {
            throw new C1257Jr1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int b = b(j);
        this.h++;
        rf0.mergeFrom(this);
        if (this.f != 0) {
            throw new C1257Jr1("Protocol message end-group tag did not match expected tag.");
        }
        this.h--;
        a(b);
    }

    public final int j() {
        int i;
        byte g = g();
        if (g >= 0) {
            return g;
        }
        int i2 = g & Byte.MAX_VALUE;
        byte g2 = g();
        if (g2 >= 0) {
            i = g2 << 7;
        } else {
            i2 |= (g2 & Byte.MAX_VALUE) << 7;
            byte g3 = g();
            if (g3 >= 0) {
                i = g3 << 14;
            } else {
                i2 |= (g3 & Byte.MAX_VALUE) << 14;
                byte g4 = g();
                if (g4 < 0) {
                    int i3 = i2 | ((g4 & Byte.MAX_VALUE) << 21);
                    byte g5 = g();
                    int i4 = i3 | (g5 << 28);
                    if (g5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (g() >= 0) {
                            return i4;
                        }
                    }
                    throw new C1257Jr1("CodedInputStream encountered a malformed varint.");
                }
                i = g4 << 21;
            }
        }
        return i2 | i;
    }

    public final long k() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((g() & 128) == 0) {
                return j;
            }
        }
        throw new C1257Jr1("CodedInputStream encountered a malformed varint.");
    }

    public final int h() {
        return (g() & 255) | ((g() & 255) << 8) | ((g() & 255) << 16) | ((g() & 255) << 24);
    }

    public final long i() {
        return ((g() & 255) << 8) | (g() & 255) | ((g() & 255) << 16) | ((g() & 255) << 24) | ((g() & 255) << 32) | ((g() & 255) << 40) | ((g() & 255) << 48) | ((g() & 255) << 56);
    }

    public C12129zV(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2 + i;
        this.e = i;
    }

    public final int b(int i) {
        if (i < 0) {
            throw new C1257Jr1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.e;
        int i3 = this.g;
        if (i2 > i3) {
            throw new C1257Jr1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
        }
        this.g = i2;
        int i4 = this.c + this.d;
        this.c = i4;
        if (i4 > i2) {
            int i5 = i4 - i2;
            this.d = i5;
            this.c = i4 - i5;
        } else {
            this.d = 0;
        }
        return i3;
    }

    public final void a(int i) {
        this.g = i;
        int i2 = this.c + this.d;
        this.c = i2;
        if (i2 > i) {
            int i3 = i2 - i;
            this.d = i3;
            this.c = i2 - i3;
            return;
        }
        this.d = 0;
    }

    public final int m() {
        if (this.e == this.c) {
            this.f = 0;
            return 0;
        }
        int j = j();
        this.f = j;
        if (j != 0) {
            return j;
        }
        throw new C1257Jr1("Protocol message contained an invalid tag (zero).");
    }

    public final void n(int i) {
        int i2 = this.e;
        int i3 = this.b;
        if (i > i2 - i3) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.e - i3));
        }
        if (i < 0) {
            throw new IllegalArgumentException("Bad position " + i);
        }
        this.e = i3 + i;
    }

    public final byte g() {
        int i = this.e;
        if (i == this.c) {
            throw new C1257Jr1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
        }
        this.e = i + 1;
        return this.a[i];
    }

    public final void p(int i) {
        if (i < 0) {
            throw new C1257Jr1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.e;
        int i3 = i2 + i;
        int i4 = this.g;
        if (i3 > i4) {
            p(i4 - i2);
            throw new C1257Jr1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i <= this.c - i2) {
            this.e = i3;
            return;
        }
        throw new C1257Jr1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
