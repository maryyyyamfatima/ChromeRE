package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ni0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1730Ni0 {
    public final C8697pU1 a;
    public final int b;
    public final C1600Mi0 c;

    public final void x(int i, int i2) {
        if (this.a.a.limit() < i + i2) {
            throw new C12221zl0("Buffer is smaller than expected.");
        }
    }

    public final void b() {
        C1600Mi0 c1600Mi0 = this.c;
        long j = c1600Mi0.c + 1;
        c1600Mi0.c = j;
        if (j >= 100) {
            throw new C12221zl0("Recursion depth limit exceeded.");
        }
    }

    public final void a() {
        this.c.c--;
    }

    public C1730Ni0(C8697pU1 c8697pU1) {
        this(c8697pU1, new C1600Mi0(c8697pU1.b.size(), c8697pU1.a.limit()), 0);
    }

    public C1730Ni0(C8697pU1 c8697pU1, C1600Mi0 c1600Mi0, int i) {
        this.a = c8697pU1;
        c8697pU1.a.order(ByteOrder.LITTLE_ENDIAN);
        this.b = i;
        this.c = c1600Mi0;
    }

    public final C4638dg0 f() {
        int i = this.b;
        C1600Mi0 c1600Mi0 = this.c;
        c1600Mi0.a(i, i + 8);
        C4638dg0 g = g(0, false);
        c1600Mi0.a(i + 8, i + g.a);
        return g;
    }

    public final C4638dg0 k(int i) {
        C4638dg0 g = g(i, true);
        int i2 = g.a;
        if (i2 == 0) {
            int i3 = g.b;
            if (i3 != 0) {
                throw new C12221zl0(AbstractC9076qb1.a("Unexpected version tag for a null union. Expecting 0, found: ", i3));
            }
        } else if (i2 != 16) {
            throw new C12221zl0("Unexpected size of an union. The size must be 0 for a null union, or 16 for a non-null union.");
        }
        return g;
    }

    public final C4638dg0 g(int i, boolean z) {
        int o = o(i + 0);
        int o2 = o(i + 4);
        if (o < 0) {
            throw new C12221zl0("Negative size. Unsigned integers are not valid for java.");
        }
        if (o2 < 0 && (!z || o2 != -1)) {
            throw new C12221zl0("Negative elements or version. Unsigned integers are not valid for java.");
        }
        return new C4638dg0(o, o2);
    }

    public final C4638dg0 c(C4638dg0[] c4638dg0Arr) {
        C4638dg0 c4638dg0;
        C4638dg0 f = f();
        int length = c4638dg0Arr.length - 1;
        C4638dg0 c4638dg02 = c4638dg0Arr[length];
        int i = c4638dg02.b;
        int i2 = f.a;
        int i3 = f.b;
        if (i3 <= i) {
            while (true) {
                if (length < 0) {
                    c4638dg0 = null;
                    break;
                }
                c4638dg0 = c4638dg0Arr[length];
                if (i3 >= c4638dg0.b) {
                    break;
                }
                length--;
            }
            if (c4638dg0 == null || c4638dg0.a != i2) {
                throw new C12221zl0("Header doesn't correspond to any known version.");
            }
        } else if (i2 < c4638dg02.a) {
            throw new C12221zl0("Message newer than the last known version cannot be shorter than required by the last known version.");
        }
        return f;
    }

    public final C4638dg0 j(int i) {
        return h(i, 8L);
    }

    public final void i() {
        C4638dg0 f = f();
        if (f.a != 24) {
            throw new C12221zl0("Incorrect header for map. The size is incorrect.");
        }
        if (f.b != 0) {
            throw new C12221zl0("Incorrect header for map. The version is incorrect.");
        }
    }

    public final boolean d(int i, int i2) {
        x(i, 1);
        x(i, 1);
        return (this.a.a.get(this.b + i) & (1 << i2)) != 0;
    }

    public final short u(int i) {
        x(i, 2);
        return this.a.a.getShort(this.b + i);
    }

    public final int o(int i) {
        x(i, 4);
        return this.a.a.getInt(this.b + i);
    }

    public final float m(int i) {
        x(i, 4);
        return this.a.a.getFloat(this.b + i);
    }

    public final long r(int i) {
        x(i, 8);
        return this.a.a.getLong(this.b + i);
    }

    public final double l(int i) {
        x(i, 8);
        return this.a.a.getDouble(this.b + i);
    }

    public final C1730Ni0 s(int i, boolean z) {
        int i2 = this.b + i;
        long r = r(i);
        if (r != 0) {
            return new C1730Ni0(this.a, this.c, (int) (i2 + r));
        }
        if (z) {
            return null;
        }
        throw new C12221zl0("Trying to decode null pointer for a non-nullable type.");
    }

    public final byte[] e(int i, int i2, int i3) {
        C1730Ni0 s = s(i, AbstractC3104Xx.a(i2));
        if (s == null) {
            return null;
        }
        byte[] bArr = new byte[s.h(i3, 1L).b];
        C8697pU1 c8697pU1 = s.a;
        c8697pU1.a.position(s.b + 8);
        c8697pU1.a.get(bArr);
        return bArr;
    }

    public final int[] q(int i, int i2) {
        C1730Ni0 s = s(i, AbstractC3104Xx.a(i2));
        if (s == null) {
            return null;
        }
        int[] iArr = new int[s.h(-1, 4L).b];
        C8697pU1 c8697pU1 = s.a;
        c8697pU1.a.position(s.b + 8);
        c8697pU1.a.asIntBuffer().get(iArr);
        return iArr;
    }

    public final float[] n(int i, int i2) {
        C1730Ni0 s = s(i, AbstractC3104Xx.a(1));
        if (s == null) {
            return null;
        }
        float[] fArr = new float[s.h(i2, 4L).b];
        C8697pU1 c8697pU1 = s.a;
        c8697pU1.a.position(s.b + 8);
        c8697pU1.a.asFloatBuffer().get(fArr);
        return fArr;
    }

    public final V14 w(int i, boolean z) {
        InterfaceC10281u51 interfaceC10281u51;
        int o = o(i);
        if (o != -1) {
            C1600Mi0 c1600Mi0 = this.c;
            if (o < c1600Mi0.a) {
                throw new C12221zl0("Trying to access handle out of order.");
            }
            if (o >= c1600Mi0.e) {
                throw new C12221zl0("Trying to access non present handle.");
            }
            c1600Mi0.a = o + 1;
            interfaceC10281u51 = (InterfaceC10281u51) this.a.b.get(o);
        } else {
            if (!z) {
                throw new C12221zl0("Trying to decode an invalid handle for a non-nullable type.");
            }
            interfaceC10281u51 = C0607Er1.a;
        }
        return interfaceC10281u51.L0();
    }

    public final C0207Bp1 p(int i) {
        InterfaceC11102wV1 Z = w(i, false).Z();
        if (Z == null) {
            return null;
        }
        return new C0207Bp1(Z);
    }

    public final InterfaceC7098kp1 t(int i, boolean z, AbstractC6754jp1 abstractC6754jp1) {
        InterfaceC11102wV1 Z = w(i, z).Z();
        if (Z.isValid()) {
            return abstractC6754jp1.a(Z, o(i + 4));
        }
        return null;
    }

    public final String v(int i, boolean z) {
        byte[] e = e(i, z ? 1 : 0, -1);
        if (e == null) {
            return null;
        }
        return new String(e, Charset.forName("utf8"));
    }

    public final C4638dg0 h(int i, long j) {
        C4638dg0 f = f();
        long j2 = f.a;
        int i2 = f.b;
        if (j2 < (j * i2) + 8) {
            throw new C12221zl0("Array header is incorrect.");
        }
        if (i == -1 || i2 == i) {
            return f;
        }
        throw new C12221zl0("Incorrect array length. Expected: " + i + ", but got: " + i2 + ".");
    }
}
