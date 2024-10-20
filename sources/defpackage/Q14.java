package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Q14 {
    public static final Unsafe a;
    public static final Class b;
    public static final P14 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    static {
        /*
            sun.misc.Unsafe r0 = o()
            defpackage.Q14.a = r0
            java.lang.Class r1 = defpackage.U8.a
            defpackage.Q14.b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = e(r1)
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = e(r2)
            if (r0 != 0) goto L19
            goto L29
        L19:
            if (r1 == 0) goto L21
            O14 r1 = new O14
            r1.<init>(r0)
            goto L2a
        L21:
            if (r2 == 0) goto L29
            N14 r1 = new N14
            r1.<init>(r0)
            goto L2a
        L29:
            r1 = 0
        L2a:
            defpackage.Q14.c = r1
            r0 = 0
            if (r1 != 0) goto L31
            r2 = r0
            goto L35
        L31:
            boolean r2 = r1.t()
        L35:
            defpackage.Q14.d = r2
            if (r1 != 0) goto L3b
            r2 = r0
            goto L3f
        L3b:
            boolean r2 = r1.s()
        L3f:
            defpackage.Q14.e = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = b(r2)
            long r2 = (long) r2
            defpackage.Q14.f = r2
            java.lang.Class<boolean[]> r2 = boolean[].class
            b(r2)
            c(r2)
            java.lang.Class<int[]> r2 = int[].class
            b(r2)
            c(r2)
            java.lang.Class<long[]> r2 = long[].class
            b(r2)
            c(r2)
            java.lang.Class<float[]> r2 = float[].class
            b(r2)
            c(r2)
            java.lang.Class<double[]> r2 = double[].class
            b(r2)
            c(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            b(r2)
            c(r2)
            java.lang.reflect.Field r2 = d()
            if (r2 == 0) goto L88
            if (r1 != 0) goto L83
            goto L88
        L83:
            long r1 = r1.k(r2)
            goto L8a
        L88:
            r1 = -1
        L8a:
            defpackage.Q14.g = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto L95
            r0 = 1
        L95:
            defpackage.Q14.h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q14.<clinit>():void");
    }

    public static Object a(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int b(Class cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static int l(long j, Object obj) {
        return c.h(j, obj);
    }

    public static void v(long j, int i, Object obj) {
        c.p(j, i, obj);
    }

    public static long m(long j, Object obj) {
        return c.i(j, obj);
    }

    public static void w(long j, long j2, Object obj) {
        c.q(j, j2, obj);
    }

    public static boolean f(long j, Object obj) {
        return c.d(j, obj);
    }

    public static void p(long j, Object obj, boolean z) {
        c.l(j, obj, z);
    }

    public static float k(long j, Object obj) {
        return c.g(j, obj);
    }

    public static void u(float f2, long j, Object obj) {
        c.o(f2, j, obj);
    }

    public static double j(long j, Object obj) {
        return c.f(j, obj);
    }

    public static void t(long j, Object obj, double d2) {
        c.n(j, obj, d2);
    }

    public static Object n(long j, Object obj) {
        return c.j(j, obj);
    }

    public static void x(long j, Object obj, Object obj2) {
        c.r(j, obj, obj2);
    }

    public static void q(byte[] bArr, long j, byte b2) {
        c.m(bArr, f + j, b2);
    }

    public static byte g(long j) {
        return c.e(j);
    }

    public static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new M14());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(Class cls) {
        Class cls2 = U8.a;
        try {
            Class cls3 = b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", cls, cls4);
            cls3.getMethod("pokeLong", cls, Long.TYPE, cls4);
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", cls, cls5, cls4);
            cls3.getMethod("peekInt", cls, cls4);
            cls3.getMethod("pokeByte", cls, Byte.TYPE);
            cls3.getMethod("peekByte", cls);
            cls3.getMethod("pokeByteArray", cls, byte[].class, cls5, cls5);
            cls3.getMethod("peekByteArray", cls, byte[].class, cls5, cls5);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        Class cls = U8.a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static byte h(long j, Object obj) {
        return (byte) ((l((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((l((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static void r(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int l = l(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        v(j2, ((255 & b2) << i) | (l & (~(255 << i))), obj);
    }

    public static void s(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        v(j2, ((255 & b2) << i) | (l(j2, obj) & (~(255 << i))), obj);
    }
}
