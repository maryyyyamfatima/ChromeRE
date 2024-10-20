package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O14 extends P14 {
    public O14(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.P14
    public final void m(Object obj, long j, byte b) {
        if (Q14.h) {
            Q14.r(obj, j, b);
        } else {
            Q14.s(obj, j, b);
        }
    }

    @Override // defpackage.P14
    public final boolean d(long j, Object obj) {
        return Q14.h ? Q14.h(j, obj) != 0 : Q14.i(j, obj) != 0;
    }

    @Override // defpackage.P14
    public final void l(long j, Object obj, boolean z) {
        if (Q14.h) {
            Q14.r(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            Q14.s(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.P14
    public final float g(long j, Object obj) {
        return Float.intBitsToFloat(h(j, obj));
    }

    @Override // defpackage.P14
    public final void o(float f, long j, Object obj) {
        p(j, Float.floatToIntBits(f), obj);
    }

    @Override // defpackage.P14
    public final double f(long j, Object obj) {
        return Double.longBitsToDouble(i(j, obj));
    }

    @Override // defpackage.P14
    public final void n(long j, Object obj, double d) {
        q(j, Double.doubleToLongBits(d), obj);
    }

    @Override // defpackage.P14
    public final boolean t() {
        return super.t();
    }

    @Override // defpackage.P14
    public final byte e(long j) {
        return Memory.peekByte(j);
    }

    @Override // defpackage.P14
    public final void c(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) 0, (int) j3);
    }
}
