package defpackage;

import java.lang.reflect.Field;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class P14 {
    public final Unsafe a;

    public abstract void c(long j, byte[] bArr, long j2, long j3);

    public abstract boolean d(long j, Object obj);

    public abstract byte e(long j);

    public abstract double f(long j, Object obj);

    public abstract float g(long j, Object obj);

    public abstract void l(long j, Object obj, boolean z);

    public abstract void m(Object obj, long j, byte b);

    public abstract void n(long j, Object obj, double d);

    public abstract void o(float f, long j, Object obj);

    public P14(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final long k(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public boolean s() {
        Unsafe unsafe = this.a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            Unsafe unsafe2 = Q14.a;
            Level level = Level.WARNING;
            String.valueOf(th);
            throw null;
        }
    }

    public final int h(long j, Object obj) {
        return this.a.getInt(obj, j);
    }

    public final void p(long j, int i, Object obj) {
        this.a.putInt(obj, j, i);
    }

    public final long i(long j, Object obj) {
        return this.a.getLong(obj, j);
    }

    public final void q(long j, long j2, Object obj) {
        this.a.putLong(obj, j, j2);
    }

    public final Object j(long j, Object obj) {
        return this.a.getObject(obj, j);
    }

    public final void r(long j, Object obj, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }

    public boolean t() {
        Unsafe unsafe = this.a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            return Q14.d() != null;
        } catch (Throwable th) {
            Unsafe unsafe2 = Q14.a;
            Level level = Level.WARNING;
            String.valueOf(th);
            throw null;
        }
    }
}
