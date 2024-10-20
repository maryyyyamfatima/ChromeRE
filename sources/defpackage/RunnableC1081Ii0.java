package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ii0 */
/* loaded from: classes.dex */
public final class RunnableC1081Ii0 implements InterfaceC3275Zf0, Runnable, Comparable, InterfaceC9316rH0 {
    public Thread A;
    public InterfaceC6098hu1 B;
    public InterfaceC6098hu1 C;
    public Object D;
    public EnumC9447rg0 E;
    public InterfaceC3145Yf0 F;
    public volatile InterfaceC3607ag0 G;
    public volatile boolean H;
    public volatile boolean I;

    /* renamed from: J */
    public boolean f11447J;
    public final C5852hB0 i;
    public final InterfaceC9208qx2 j;
    public BZ0 m;
    public InterfaceC6098hu1 n;
    public EnumC7567mA2 o;
    public C10315uB0 p;
    public int q;
    public int r;
    public AbstractC6410ip0 s;
    public C0543Ee2 t;
    public InterfaceC0301Ci0 u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public Object z;
    public final C0171Bi0 a = new C0171Bi0();
    public final ArrayList g = new ArrayList();
    public final C10503uk3 h = new C10503uk3();
    public final C0561Ei0 k = new C0561Ei0();
    public final C0691Fi0 l = new C0691Fi0();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC1081Ii0 runnableC1081Ii0 = (RunnableC1081Ii0) obj;
        int ordinal = this.o.ordinal() - runnableC1081Ii0.o.ordinal();
        return ordinal == 0 ? this.v - runnableC1081Ii0.v : ordinal;
    }

    public RunnableC1081Ii0(C5852hB0 c5852hB0, C8974qH0 c8974qH0) {
        this.i = c5852hB0;
        this.j = c8974qH0;
    }

    public final void k() {
        C0691Fi0 c0691Fi0 = this.l;
        synchronized (c0691Fi0) {
            c0691Fi0.b = false;
            c0691Fi0.a = false;
            c0691Fi0.c = false;
        }
        C0561Ei0 c0561Ei0 = this.k;
        c0561Ei0.a = null;
        c0561Ei0.b = null;
        c0561Ei0.c = null;
        C0171Bi0 c0171Bi0 = this.a;
        c0171Bi0.c = null;
        c0171Bi0.d = null;
        c0171Bi0.n = null;
        c0171Bi0.g = null;
        c0171Bi0.k = null;
        c0171Bi0.i = null;
        c0171Bi0.o = null;
        c0171Bi0.j = null;
        c0171Bi0.p = null;
        c0171Bi0.a.clear();
        c0171Bi0.l = false;
        c0171Bi0.b.clear();
        c0171Bi0.m = false;
        this.H = false;
        this.m = null;
        this.n = null;
        this.t = null;
        this.o = null;
        this.p = null;
        this.u = null;
        this.w = 0;
        this.G = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.I = false;
        this.z = null;
        this.g.clear();
        this.j.a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3145Yf0 interfaceC3145Yf0 = this.F;
        try {
            try {
                try {
                    if (this.I) {
                        j();
                        if (interfaceC3145Yf0 != null) {
                            interfaceC3145Yf0.b();
                            return;
                        }
                        return;
                    }
                    m();
                    if (interfaceC3145Yf0 != null) {
                        interfaceC3145Yf0.b();
                    }
                } catch (Throwable th) {
                    Log.isLoggable("DecodeJob", 3);
                    if (this.w != 5) {
                        this.g.add(th);
                        j();
                    }
                    if (!this.I) {
                        throw th;
                    }
                    throw th;
                }
            } catch (C4839eF e) {
                throw e;
            }
        } catch (Throwable th2) {
            if (interfaceC3145Yf0 != null) {
                interfaceC3145Yf0.b();
            }
            throw th2;
        }
    }

    public final void m() {
        int b = AbstractC2373Sg3.b(this.x);
        if (b == 0) {
            this.w = h(1);
            this.G = g();
            l();
        } else if (b == 1) {
            l();
        } else {
            if (b == 2) {
                f();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: ".concat(AbstractC0821Gi0.a(this.x)));
        }
    }

    public final InterfaceC3607ag0 g() {
        int b = AbstractC2373Sg3.b(this.w);
        C0171Bi0 c0171Bi0 = this.a;
        if (b == 1) {
            return new OO2(c0171Bi0, this);
        }
        if (b == 2) {
            return new C1585Mf0(c0171Bi0.a(), c0171Bi0, this);
        }
        if (b == 3) {
            return new C8078ng3(c0171Bi0, this);
        }
        if (b == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC0951Hi0.a(this.w)));
    }

    public final void l() {
        this.A = Thread.currentThread();
        int i = UH1.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.I && this.G != null && !(z = this.G.c())) {
            this.w = h(this.w);
            this.G = g();
            if (this.w == 4) {
                a();
                return;
            }
        }
        if ((this.w == 6 || this.I) && !z) {
            j();
        }
    }

    public final void j() {
        boolean a;
        n();
        EZ0 ez0 = new EZ0("Failed to load resource", new ArrayList(this.g));
        C9286rB0 c9286rB0 = (C9286rB0) this.u;
        synchronized (c9286rB0) {
            c9286rB0.y = ez0;
        }
        synchronized (c9286rB0) {
            c9286rB0.g.a();
            if (c9286rB0.C) {
                c9286rB0.g();
            } else {
                if (c9286rB0.a.a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (c9286rB0.z) {
                    throw new IllegalStateException("Already failed once");
                }
                c9286rB0.z = true;
                InterfaceC6098hu1 interfaceC6098hu1 = c9286rB0.q;
                C8944qB0 c8944qB0 = c9286rB0.a;
                c8944qB0.getClass();
                ArrayList<C8601pB0> arrayList = new ArrayList(c8944qB0.a);
                c9286rB0.e(arrayList.size() + 1);
                C6538jB0 c6538jB0 = (C6538jB0) c9286rB0.k;
                synchronized (c6538jB0) {
                    C0877Gt1 c0877Gt1 = c6538jB0.a;
                    c0877Gt1.getClass();
                    HashMap hashMap = c9286rB0.u ? c0877Gt1.b : c0877Gt1.a;
                    if (c9286rB0.equals(hashMap.get(interfaceC6098hu1))) {
                        hashMap.remove(interfaceC6098hu1);
                    }
                }
                for (C8601pB0 c8601pB0 : arrayList) {
                    c8601pB0.b.execute(new RunnableC7570mB0(c9286rB0, c8601pB0.a));
                }
                c9286rB0.d();
            }
        }
        C0691Fi0 c0691Fi0 = this.l;
        synchronized (c0691Fi0) {
            c0691Fi0.c = true;
            a = c0691Fi0.a();
        }
        if (a) {
            k();
        }
    }

    public final void i(JO2 jo2, EnumC9447rg0 enumC9447rg0, boolean z) {
        n();
        C9286rB0 c9286rB0 = (C9286rB0) this.u;
        synchronized (c9286rB0) {
            c9286rB0.v = jo2;
            c9286rB0.w = enumC9447rg0;
            c9286rB0.D = z;
        }
        synchronized (c9286rB0) {
            c9286rB0.g.a();
            if (c9286rB0.C) {
                c9286rB0.v.b();
                c9286rB0.g();
                return;
            }
            if (c9286rB0.a.a.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (c9286rB0.x) {
                throw new IllegalStateException("Already have resource");
            }
            C8258oB0 c8258oB0 = c9286rB0.j;
            JO2 jo22 = c9286rB0.v;
            boolean z2 = c9286rB0.r;
            InterfaceC6098hu1 interfaceC6098hu1 = c9286rB0.q;
            InterfaceC11687yB0 interfaceC11687yB0 = c9286rB0.h;
            c8258oB0.getClass();
            c9286rB0.A = new C12030zB0(jo22, z2, true, interfaceC6098hu1, interfaceC11687yB0);
            c9286rB0.x = true;
            C8944qB0 c8944qB0 = c9286rB0.a;
            c8944qB0.getClass();
            ArrayList<C8601pB0> arrayList = new ArrayList(c8944qB0.a);
            c9286rB0.e(arrayList.size() + 1);
            InterfaceC6098hu1 interfaceC6098hu12 = c9286rB0.q;
            C12030zB0 c12030zB0 = c9286rB0.A;
            C6538jB0 c6538jB0 = (C6538jB0) c9286rB0.k;
            synchronized (c6538jB0) {
                if (c12030zB0 != null) {
                    if (c12030zB0.a) {
                        c6538jB0.g.a(interfaceC6098hu12, c12030zB0);
                    }
                }
                C0877Gt1 c0877Gt1 = c6538jB0.a;
                c0877Gt1.getClass();
                HashMap hashMap = c9286rB0.u ? c0877Gt1.b : c0877Gt1.a;
                if (c9286rB0.equals(hashMap.get(interfaceC6098hu12))) {
                    hashMap.remove(interfaceC6098hu12);
                }
            }
            for (C8601pB0 c8601pB0 : arrayList) {
                c8601pB0.b.execute(new RunnableC7914nB0(c9286rB0, c8601pB0.a));
            }
            c9286rB0.d();
        }
    }

    public final void n() {
        Throwable th;
        this.h.a();
        if (this.H) {
            if (this.g.isEmpty()) {
                th = null;
            } else {
                ArrayList arrayList = this.g;
                th = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.H = true;
    }

    public final int h(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            if (this.s.b()) {
                return 2;
            }
            return h(2);
        }
        if (i2 == 1) {
            if (this.s.a()) {
                return 3;
            }
            return h(3);
        }
        if (i2 == 2) {
            return this.y ? 6 : 4;
        }
        if (i2 == 3 || i2 == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC0951Hi0.a(i)));
    }

    @Override // defpackage.InterfaceC3275Zf0
    public final void a() {
        LZ0 lz0;
        this.x = 2;
        C9286rB0 c9286rB0 = (C9286rB0) this.u;
        if (c9286rB0.s) {
            lz0 = c9286rB0.n;
        } else {
            lz0 = c9286rB0.t ? c9286rB0.o : c9286rB0.m;
        }
        lz0.execute(this);
    }

    @Override // defpackage.InterfaceC3275Zf0
    public final void d(InterfaceC6098hu1 interfaceC6098hu1, Object obj, InterfaceC3145Yf0 interfaceC3145Yf0, EnumC9447rg0 enumC9447rg0, InterfaceC6098hu1 interfaceC6098hu12) {
        LZ0 lz0;
        this.B = interfaceC6098hu1;
        this.D = obj;
        this.F = interfaceC3145Yf0;
        this.E = enumC9447rg0;
        this.C = interfaceC6098hu12;
        this.f11447J = interfaceC6098hu1 != this.a.a().get(0);
        if (Thread.currentThread() != this.A) {
            this.x = 3;
            C9286rB0 c9286rB0 = (C9286rB0) this.u;
            if (c9286rB0.s) {
                lz0 = c9286rB0.n;
            } else {
                lz0 = c9286rB0.t ? c9286rB0.o : c9286rB0.m;
            }
            lz0.execute(this);
            return;
        }
        f();
    }

    @Override // defpackage.InterfaceC3275Zf0
    public final void b(InterfaceC6098hu1 interfaceC6098hu1, Exception exc, InterfaceC3145Yf0 interfaceC3145Yf0, EnumC9447rg0 enumC9447rg0) {
        LZ0 lz0;
        interfaceC3145Yf0.b();
        EZ0 ez0 = new EZ0("Fetching data failed", Collections.singletonList(exc));
        Class a = interfaceC3145Yf0.a();
        ez0.g = interfaceC6098hu1;
        ez0.h = enumC9447rg0;
        ez0.i = a;
        this.g.add(ez0);
        if (Thread.currentThread() != this.A) {
            this.x = 2;
            C9286rB0 c9286rB0 = (C9286rB0) this.u;
            if (c9286rB0.s) {
                lz0 = c9286rB0.n;
            } else {
                lz0 = c9286rB0.t ? c9286rB0.o : c9286rB0.m;
            }
            lz0.execute(this);
            return;
        }
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC1081Ii0.f():void");
    }

    public final JO2 e(Object obj, EnumC9447rg0 enumC9447rg0) {
        Class<?> cls = obj.getClass();
        C0171Bi0 c0171Bi0 = this.a;
        DE1 c = c0171Bi0.c(cls);
        C0543Ee2 c0543Ee2 = this.t;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = enumC9447rg0 == EnumC9447rg0.RESOURCE_DISK_CACHE || c0171Bi0.r;
            C8752pe2 c8752pe2 = C8840pt0.i;
            Boolean bool = (Boolean) c0543Ee2.c(c8752pe2);
            if (bool == null || (bool.booleanValue() && !z)) {
                c0543Ee2 = new C0543Ee2();
                C8958qE c8958qE = this.t.b;
                C8958qE c8958qE2 = c0543Ee2.b;
                c8958qE2.g(c8958qE);
                c8958qE2.put(c8752pe2, Boolean.valueOf(z));
            }
        }
        C0543Ee2 c0543Ee22 = c0543Ee2;
        InterfaceC8075ng0 f = this.m.a().f(obj);
        try {
            return c.a(this.q, this.r, c0543Ee22, f, new C0431Di0(this, enumC9447rg0));
        } finally {
            f.b();
        }
    }

    @Override // defpackage.InterfaceC9316rH0
    public final C10503uk3 c() {
        return this.h;
    }
}
