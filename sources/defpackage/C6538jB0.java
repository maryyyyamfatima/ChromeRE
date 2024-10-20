package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jB0 */
/* loaded from: classes.dex */
public final class C6538jB0 implements InterfaceC9629sB0, InterfaceC7312lS1, InterfaceC11687yB0 {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final C0877Gt1 a;
    public final C10658vB0 b;
    public final C6928kK1 c;
    public final C5508gB0 d;
    public final C10387uP2 e;
    public final C4820eB0 f;
    public final C11994z5 g;

    public C6538jB0(C6928kK1 c6928kK1, AbstractC10187tp0 abstractC10187tp0, LZ0 lz0, LZ0 lz02, LZ0 lz03, LZ0 lz04) {
        this.c = c6928kK1;
        C5852hB0 c5852hB0 = new C5852hB0(abstractC10187tp0);
        C11994z5 c11994z5 = new C11994z5();
        this.g = c11994z5;
        synchronized (this) {
            synchronized (c11994z5) {
                c11994z5.d = this;
            }
        }
        this.b = new C10658vB0();
        this.a = new C0877Gt1();
        this.d = new C5508gB0(lz0, lz02, lz03, lz04, this, this);
        this.f = new C4820eB0(c5852hB0);
        this.e = new C10387uP2();
        c6928kK1.d = this;
    }

    public final C6196iB0 a(BZ0 bz0, Object obj, InterfaceC6098hu1 interfaceC6098hu1, int i, int i2, Class cls, Class cls2, EnumC7567mA2 enumC7567mA2, AbstractC6410ip0 abstractC6410ip0, C8958qE c8958qE, boolean z, boolean z2, C0543Ee2 c0543Ee2, boolean z3, boolean z4, boolean z5, boolean z6, QO2 qo2, Executor executor) {
        long j;
        if (h) {
            int i3 = UH1.a;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        long j2 = j;
        this.b.getClass();
        C10315uB0 c10315uB0 = new C10315uB0(obj, interfaceC6098hu1, i, i2, c8958qE, cls, cls2, c0543Ee2);
        synchronized (this) {
            try {
                C12030zB0 b = b(c10315uB0, z3, j2);
                if (b == null) {
                    return e(bz0, obj, interfaceC6098hu1, i, i2, cls, cls2, enumC7567mA2, abstractC6410ip0, c8958qE, z, z2, c0543Ee2, z3, z4, z5, z6, qo2, executor, c10315uB0, j2);
                }
                ((C3133Yc3) qo2).k(b, EnumC9447rg0.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e0, code lost:            r0 = r13.l;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C6196iB0 e(defpackage.BZ0 r17, java.lang.Object r18, defpackage.InterfaceC6098hu1 r19, int r20, int r21, java.lang.Class r22, java.lang.Class r23, defpackage.EnumC7567mA2 r24, defpackage.AbstractC6410ip0 r25, defpackage.C8958qE r26, boolean r27, boolean r28, defpackage.C0543Ee2 r29, boolean r30, boolean r31, boolean r32, boolean r33, defpackage.QO2 r34, java.util.concurrent.Executor r35, defpackage.C10315uB0 r36, long r37) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6538jB0.e(BZ0, java.lang.Object, hu1, int, int, java.lang.Class, java.lang.Class, mA2, ip0, qE, boolean, boolean, Ee2, boolean, boolean, boolean, boolean, QO2, java.util.concurrent.Executor, uB0, long):iB0");
    }

    public final C12030zB0 b(C10315uB0 c10315uB0, boolean z, long j) {
        C12030zB0 c12030zB0;
        Object obj;
        if (!z) {
            return null;
        }
        C11994z5 c11994z5 = this.g;
        synchronized (c11994z5) {
            C11651y5 c11651y5 = (C11651y5) c11994z5.b.get(c10315uB0);
            if (c11651y5 == null) {
                c12030zB0 = null;
            } else {
                c12030zB0 = (C12030zB0) c11651y5.get();
                if (c12030zB0 == null) {
                    c11994z5.b(c11651y5);
                }
            }
        }
        if (c12030zB0 != null) {
            c12030zB0.a();
        }
        if (c12030zB0 != null) {
            if (h) {
                int i = UH1.a;
                SystemClock.elapsedRealtimeNanos();
                String.valueOf(c10315uB0);
            }
            return c12030zB0;
        }
        C6928kK1 c6928kK1 = this.c;
        synchronized (c6928kK1) {
            C4523dK1 c4523dK1 = (C4523dK1) c6928kK1.a.remove(c10315uB0);
            if (c4523dK1 == null) {
                obj = null;
            } else {
                c6928kK1.c -= c4523dK1.b;
                obj = c4523dK1.a;
            }
        }
        JO2 jo2 = (JO2) obj;
        C12030zB0 c12030zB02 = jo2 == null ? null : jo2 instanceof C12030zB0 ? (C12030zB0) jo2 : new C12030zB0(jo2, true, true, c10315uB0, this);
        if (c12030zB02 != null) {
            c12030zB02.a();
            this.g.a(c10315uB0, c12030zB02);
        }
        if (c12030zB02 == null) {
            return null;
        }
        if (h) {
            int i2 = UH1.a;
            SystemClock.elapsedRealtimeNanos();
            String.valueOf(c10315uB0);
        }
        return c12030zB02;
    }

    public static void d(JO2 jo2) {
        if (jo2 instanceof C12030zB0) {
            ((C12030zB0) jo2).c();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final void c(InterfaceC6098hu1 interfaceC6098hu1, C12030zB0 c12030zB0) {
        C11994z5 c11994z5 = this.g;
        synchronized (c11994z5) {
            C11651y5 c11651y5 = (C11651y5) c11994z5.b.remove(interfaceC6098hu1);
            if (c11651y5 != null) {
                c11651y5.c = null;
                c11651y5.clear();
            }
        }
        if (c12030zB0.a) {
        } else {
            this.e.a(c12030zB0, false);
        }
    }
}
