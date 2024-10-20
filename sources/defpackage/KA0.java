package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.chromium.mojo.system.impl.CoreImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class KA0 {
    public final int a;
    public final IA0 b;

    public KA0(InterfaceC7559m90 interfaceC7559m90, int i) {
        this(new IA0(interfaceC7559m90, i));
    }

    public KA0(IA0 ia0) {
        this.b = ia0;
        this.a = ia0.d;
    }

    public final KA0 t(C4638dg0 c4638dg0) {
        KA0 ka0 = new KA0(this.b);
        ka0.g(c4638dg0);
        return ka0;
    }

    public final void g(C4638dg0 c4638dg0) {
        IA0 ia0 = this.b;
        ia0.d += ((c4638dg0.a + 8) - 1) & (-8);
        if (ia0.b.capacity() < ia0.d) {
            int capacity = ia0.b.capacity();
            do {
                capacity *= 2;
            } while (capacity < ia0.d);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(capacity);
            allocateDirect.order(ByteOrder.nativeOrder());
            ia0.b.position(0);
            ByteBuffer byteBuffer = ia0.b;
            byteBuffer.limit(byteBuffer.capacity());
            allocateDirect.put(ia0.b);
            ia0.b = allocateDirect;
        }
        b(c4638dg0.a, 0);
        b(c4638dg0.b, 4);
    }

    public final void d(int i, int i2, boolean z) {
        if (z) {
            IA0 ia0 = this.b;
            ByteBuffer byteBuffer = ia0.b;
            int i3 = this.a;
            ia0.b.put(i3 + i, (byte) (((byte) (1 << i2)) | byteBuffer.get(i3 + i)));
        }
    }

    public final void n(short s, int i) {
        this.b.b.putShort(this.a + i, s);
    }

    public final void b(int i, int i2) {
        this.b.b.putInt(this.a + i2, i);
    }

    public final void a(int i, float f) {
        this.b.b.putFloat(this.a + i, f);
    }

    public final void f(int i, long j) {
        this.b.b.putLong(this.a + i, j);
    }

    public final void k(AbstractC7094ko3 abstractC7094ko3, int i, boolean z) {
        if (abstractC7094ko3 == null) {
            q(i, z);
        } else {
            f(i, this.b.d - (this.a + i));
            abstractC7094ko3.a(this);
        }
    }

    public final void l(AbstractC7859n14 abstractC7859n14, int i, boolean z) {
        if (abstractC7859n14 == null && !z) {
            throw new C5814h43("Trying to encode a null pointer for a non-nullable type.");
        }
        if (abstractC7859n14 == null) {
            f(i, 0L);
            f(i + 8, 0L);
        } else {
            abstractC7859n14.a(this, i);
        }
    }

    public final void m(String str, int i, boolean z) {
        if (str == null) {
            q(i, z);
        } else {
            c(i, z ? 1 : 0, -1, str.getBytes(Charset.forName("utf8")));
        }
    }

    public final void h(InterfaceC10281u51 interfaceC10281u51, int i, boolean z) {
        if (interfaceC10281u51 == null || !interfaceC10281u51.isValid()) {
            p(i, z);
            return;
        }
        IA0 ia0 = this.b;
        b(ia0.c.size(), i);
        ia0.c.add(interfaceC10281u51);
    }

    public final void i(InterfaceC7786mp1 interfaceC7786mp1, int i, boolean z, AbstractC6754jp1 abstractC6754jp1) {
        if (interfaceC7786mp1 == null) {
            p(i, z);
            b(0, i + 4);
            return;
        }
        InterfaceC7559m90 interfaceC7559m90 = this.b.a;
        if (interfaceC7559m90 == null) {
            throw new UnsupportedOperationException("The encoder has been created without a Core. It can't encode an interface.");
        }
        if (interfaceC7786mp1 instanceof InterfaceC7098kp1) {
            C6068hp1 G0 = ((InterfaceC7098kp1) interfaceC7786mp1).G0();
            h(((A51) G0.g).n0(), i, z);
            b(G0.h, i + 4);
        } else {
            C8433oi2 b = ((CoreImpl) interfaceC7559m90).b(null);
            abstractC6754jp1.b(interfaceC7786mp1, (InterfaceC11102wV1) b.a);
            h((InterfaceC10281u51) b.b, i, z);
            abstractC6754jp1.f();
            b(0, i + 4);
        }
    }

    public final void j(C0207Bp1 c0207Bp1, int i) {
        if (c0207Bp1 == null) {
            p(i, false);
        } else {
            if (this.b.a == null) {
                throw new UnsupportedOperationException("The encoder has been created without a Core. It can't encode an interface.");
            }
            h(c0207Bp1.n0(), i, false);
        }
    }

    public final KA0 r(int i, int i2) {
        return s(8, i, i2, -1);
    }

    public final void c(int i, int i2, int i3, byte[] bArr) {
        if (bArr == null) {
            q(i, AbstractC3104Xx.a(i2));
            return;
        }
        if (i3 != -1 && i3 != bArr.length) {
            throw new C5814h43("Trying to encode a fixed array of incorrect length.");
        }
        int length = bArr.length;
        int length2 = bArr.length;
        f(i, this.b.d - (this.a + i));
        KA0 t = t(new C4638dg0(length2 + 8, length));
        IA0 ia0 = t.b;
        ia0.b.position(t.a + 8);
        ia0.b.put(bArr);
    }

    public final void o(int[] iArr, int i, int i2) {
        if (iArr == null) {
            q(i, AbstractC3104Xx.a(i2));
            return;
        }
        KA0 s = s(4, iArr.length, i, -1);
        IA0 ia0 = s.b;
        ia0.b.position(s.a + 8);
        ia0.b.asIntBuffer().put(iArr);
    }

    public final void e(int i, int i2, float[] fArr) {
        if (fArr == null) {
            q(i, AbstractC3104Xx.a(1));
            return;
        }
        KA0 s = s(4, fArr.length, i, i2);
        IA0 ia0 = s.b;
        ia0.b.position(s.a + 8);
        ia0.b.asFloatBuffer().put(fArr);
    }

    public final void q(int i, boolean z) {
        if (!z) {
            throw new C5814h43("Trying to encode a null pointer for a non-nullable type.");
        }
        this.b.b.putLong(this.a + i, 0L);
    }

    public final void p(int i, boolean z) {
        if (!z) {
            throw new C5814h43("Trying to encode an invalid handle for a non-nullable type.");
        }
        this.b.b.putInt(this.a + i, -1);
    }

    public final KA0 s(int i, int i2, int i3, int i4) {
        if (i4 == -1 || i4 == i2) {
            f(i3, this.b.d - (this.a + i3));
            return t(new C4638dg0((i * i2) + 8, i2));
        }
        throw new C5814h43("Trying to encode a fixed array of incorrect length.");
    }
}
