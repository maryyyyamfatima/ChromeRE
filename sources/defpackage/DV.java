package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DV {
    public int a;
    public final int b = 100;
    public final int c = Integer.MAX_VALUE;
    public EV d;

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i);

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i);

    public abstract int j(int i);

    public abstract boolean k();

    public abstract byte[] l();

    public abstract ZD m();

    public abstract double n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract float r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    public static DV g(InputStream inputStream) {
        if (inputStream == null) {
            byte[] bArr = AbstractC1507Lp1.b;
            return f(bArr, 0, bArr.length, false);
        }
        return new BV(inputStream);
    }

    public static AV f(byte[] bArr, int i, int i2, boolean z) {
        AV av = new AV(bArr, i, i2, z);
        try {
            av.j(i2);
            return av;
        } catch (C1127Ir1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static DV h(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return f(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && Q14.d) {
            return new CV(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return f(bArr, 0, remaining, true);
    }
}
