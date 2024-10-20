package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yc3 */
/* loaded from: classes.dex */
public final class C3133Yc3 implements GN2, InterfaceC11153we3, QO2 {
    public static final boolean B = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public final C10503uk3 a;
    public final Object b;
    public final InterfaceC4200cO2 c;
    public final KN2 d;
    public final Context e;
    public final BZ0 f;
    public final Object g;
    public final Class h;
    public final AbstractC2834Vv i;
    public final int j;
    public final int k;
    public final EnumC7567mA2 l;
    public final TE3 m;
    public final List n;
    public final XV3 o;
    public final Executor p;
    public JO2 q;
    public C6196iB0 r;
    public volatile C6538jB0 s;
    public int t;
    public Drawable u;
    public Drawable v;
    public Drawable w;
    public int x;
    public int y;
    public boolean z;

    public C3133Yc3(Context context, BZ0 bz0, Object obj, Object obj2, Class cls, AbstractC2834Vv abstractC2834Vv, int i, int i2, EnumC7567mA2 enumC7567mA2, TE3 te3, WN2 wn2, ArrayList arrayList, KN2 kn2, C6538jB0 c6538jB0, XV3 xv3, Executor executor) {
        if (B) {
            String.valueOf(hashCode());
        }
        this.a = new C10503uk3();
        this.b = obj;
        this.e = context;
        this.f = bz0;
        this.g = obj2;
        this.h = cls;
        this.i = abstractC2834Vv;
        this.j = i;
        this.k = i2;
        this.l = enumC7567mA2;
        this.m = te3;
        this.c = wn2;
        this.n = arrayList;
        this.d = kn2;
        this.s = c6538jB0;
        this.o = xv3;
        this.p = executor;
        this.t = 1;
        if (this.A == null && bz0.h.a.containsKey(AbstractC10778vZ0.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // defpackage.GN2
    public final void c() {
        int i;
        synchronized (this.b) {
            if (!this.z) {
                this.a.a();
                int i2 = UH1.a;
                SystemClock.elapsedRealtimeNanos();
                if (this.g == null) {
                    if (AbstractC10296u74.g(this.j, this.k)) {
                        this.x = this.j;
                        this.y = this.k;
                    }
                    if (this.w == null) {
                        AbstractC2834Vv abstractC2834Vv = this.i;
                        Drawable drawable = abstractC2834Vv.t;
                        this.w = drawable;
                        if (drawable == null && (i = abstractC2834Vv.u) > 0) {
                            this.w = g(i);
                        }
                    }
                    h(new EZ0("Received null model"), this.w == null ? 5 : 3);
                    return;
                }
                int i3 = this.t;
                if (i3 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i3 == 4) {
                    k(this.q, EnumC9447rg0.MEMORY_CACHE, false);
                    return;
                }
                List<InterfaceC4200cO2> list = this.n;
                if (list != null) {
                    for (InterfaceC4200cO2 interfaceC4200cO2 : list) {
                    }
                }
                this.t = 3;
                if (AbstractC10296u74.g(this.j, this.k)) {
                    m(this.j, this.k);
                } else {
                    this.m.c(this);
                }
                int i4 = this.t;
                if (i4 == 2 || i4 == 3) {
                    KN2 kn2 = this.d;
                    if (kn2 == null || kn2.g(this)) {
                        this.m.k(e());
                    }
                }
                if (B) {
                    SystemClock.elapsedRealtimeNanos();
                }
                return;
            }
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    public final void d() {
        if (!this.z) {
            this.a.a();
            this.m.h(this);
            C6196iB0 c6196iB0 = this.r;
            if (c6196iB0 != null) {
                synchronized (c6196iB0.c) {
                    c6196iB0.a.h(c6196iB0.b);
                }
                this.r = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f A[Catch: all -> 0x004e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:11:0x0013, B:13:0x001b, B:14:0x001f, B:16:0x0023, B:21:0x002f, B:22:0x0038, B:23:0x003a, B:30:0x0046, B:31:0x004d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.GN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            monitor-enter(r0)
            boolean r1 = r5.z     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L46
            uk3 r1 = r5.a     // Catch: java.lang.Throwable -> L4e
            r1.a()     // Catch: java.lang.Throwable -> L4e
            int r1 = r5.t     // Catch: java.lang.Throwable -> L4e
            r2 = 6
            if (r1 != r2) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            return
        L13:
            r5.d()     // Catch: java.lang.Throwable -> L4e
            JO2 r1 = r5.q     // Catch: java.lang.Throwable -> L4e
            r3 = 0
            if (r1 == 0) goto L1e
            r5.q = r3     // Catch: java.lang.Throwable -> L4e
            goto L1f
        L1e:
            r1 = r3
        L1f:
            KN2 r3 = r5.d     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L2c
            boolean r3 = r3.f(r5)     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L2a
            goto L2c
        L2a:
            r3 = 0
            goto L2d
        L2c:
            r3 = 1
        L2d:
            if (r3 == 0) goto L38
            TE3 r3 = r5.m     // Catch: java.lang.Throwable -> L4e
            android.graphics.drawable.Drawable r4 = r5.e()     // Catch: java.lang.Throwable -> L4e
            r3.m(r4)     // Catch: java.lang.Throwable -> L4e
        L38:
            r5.t = r2     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L45
            jB0 r0 = r5.s
            r0.getClass()
            defpackage.C6538jB0.d(r1)
        L45:
            return
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.Throwable -> L4e
        L4e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3133Yc3.clear():void");
    }

    @Override // defpackage.GN2
    public final void pause() {
        synchronized (this.b) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @Override // defpackage.GN2
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            int i = this.t;
            z = i == 2 || i == 3;
        }
        return z;
    }

    @Override // defpackage.GN2
    public final boolean j() {
        boolean z;
        synchronized (this.b) {
            z = this.t == 4;
        }
        return z;
    }

    @Override // defpackage.GN2
    public final boolean i() {
        boolean z;
        synchronized (this.b) {
            z = this.t == 6;
        }
        return z;
    }

    @Override // defpackage.GN2
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.t == 4;
        }
        return z;
    }

    public final Drawable e() {
        int i;
        if (this.v == null) {
            AbstractC2834Vv abstractC2834Vv = this.i;
            Drawable drawable = abstractC2834Vv.l;
            this.v = drawable;
            if (drawable == null && (i = abstractC2834Vv.m) > 0) {
                this.v = g(i);
            }
        }
        return this.v;
    }

    public final void m(int i, int i2) {
        Object obj;
        int i3 = i;
        this.a.a();
        Object obj2 = this.b;
        synchronized (obj2) {
            try {
                boolean z = B;
                if (z) {
                    int i4 = UH1.a;
                    SystemClock.elapsedRealtimeNanos();
                }
                if (this.t == 3) {
                    this.t = 2;
                    float f = this.i.g;
                    if (i3 != Integer.MIN_VALUE) {
                        i3 = Math.round(i3 * f);
                    }
                    this.x = i3;
                    this.y = i2 == Integer.MIN_VALUE ? i2 : Math.round(f * i2);
                    if (z) {
                        int i5 = UH1.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    C6538jB0 c6538jB0 = this.s;
                    BZ0 bz0 = this.f;
                    Object obj3 = this.g;
                    AbstractC2834Vv abstractC2834Vv = this.i;
                    try {
                        obj = obj2;
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            this.r = c6538jB0.a(bz0, obj3, abstractC2834Vv.q, this.x, this.y, abstractC2834Vv.x, this.h, this.l, abstractC2834Vv.h, abstractC2834Vv.w, abstractC2834Vv.r, abstractC2834Vv.D, abstractC2834Vv.v, abstractC2834Vv.n, abstractC2834Vv.B, abstractC2834Vv.E, abstractC2834Vv.C, this, this.p);
                            if (this.t != 2) {
                                this.r = null;
                            }
                            if (z) {
                                int i6 = UH1.a;
                                SystemClock.elapsedRealtimeNanos();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
    }

    public final boolean f() {
        KN2 kn2 = this.d;
        return kn2 == null || !kn2.getRoot().a();
    }

    public final void k(JO2 jo2, EnumC9447rg0 enumC9447rg0, boolean z) {
        C3133Yc3 c3133Yc3;
        Throwable th;
        this.a.a();
        JO2 jo22 = null;
        try {
            synchronized (this.b) {
                try {
                    this.r = null;
                    if (jo2 != null) {
                        Object obj = jo2.get();
                        try {
                            if (obj != null && this.h.isAssignableFrom(obj.getClass())) {
                                KN2 kn2 = this.d;
                                if (!(kn2 == null || kn2.h(this))) {
                                    this.q = null;
                                    this.t = 4;
                                    this.s.getClass();
                                    C6538jB0.d(jo2);
                                }
                                l(jo2, obj, enumC9447rg0);
                                return;
                            }
                            this.q = null;
                            h(new EZ0("Expected to receive an object of " + String.valueOf(this.h) + " but instead got " + String.valueOf(obj != null ? obj.getClass() : "") + "{" + String.valueOf(obj) + "} inside Resource{" + String.valueOf(jo2) + "}." + (obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.")), 5);
                            this.s.getClass();
                            C6538jB0.d(jo2);
                        } catch (Throwable th2) {
                            th = th2;
                            jo22 = jo2;
                            c3133Yc3 = this;
                            while (true) {
                                try {
                                    try {
                                        break;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (jo22 != null) {
                                            c3133Yc3.s.getClass();
                                            C6538jB0.d(jo22);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    c3133Yc3 = c3133Yc3;
                                }
                                th = th4;
                                c3133Yc3 = c3133Yc3;
                            }
                            throw th;
                        }
                    } else {
                        h(new EZ0("Expected to receive a Resource<R> with an object of " + String.valueOf(this.h) + " inside, but instead got null."), 5);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c3133Yc3 = this;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            c3133Yc3 = this;
        }
    }

    public final void l(JO2 jo2, Object obj, EnumC9447rg0 enumC9447rg0) {
        boolean f = f();
        this.t = 4;
        this.q = jo2;
        if (this.f.i <= 3) {
            String.valueOf(enumC9447rg0);
            String.valueOf(this.g);
            int i = UH1.a;
            SystemClock.elapsedRealtimeNanos();
        }
        this.z = true;
        try {
            List list = this.n;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4200cO2) it.next()).g(obj);
                }
            }
            InterfaceC4200cO2 interfaceC4200cO2 = this.c;
            if (interfaceC4200cO2 != null) {
                interfaceC4200cO2.g(obj);
            }
            this.m.d(obj, this.o.a(enumC9447rg0, f));
            this.z = false;
            KN2 kn2 = this.d;
            if (kn2 != null) {
                kn2.e(this);
            }
        } catch (Throwable th) {
            this.z = false;
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void h(EZ0 ez0, int i) {
        int i2;
        int i3;
        this.a.a();
        synchronized (this.b) {
            ez0.getClass();
            int i4 = this.f.i;
            if (i4 <= i) {
                Log.w("Glide", "Load failed for [" + String.valueOf(this.g) + "] with dimensions [" + this.x + "x" + this.y + "]", ez0);
                if (i4 <= 4) {
                    ez0.e();
                }
            }
            Drawable drawable = null;
            this.r = null;
            this.t = 5;
            boolean z = true;
            this.z = true;
            try {
                List<InterfaceC4200cO2> list = this.n;
                if (list != null) {
                    for (InterfaceC4200cO2 interfaceC4200cO2 : list) {
                        f();
                        interfaceC4200cO2.j(ez0);
                    }
                }
                InterfaceC4200cO2 interfaceC4200cO22 = this.c;
                if (interfaceC4200cO22 != null) {
                    f();
                    interfaceC4200cO22.j(ez0);
                }
                KN2 kn2 = this.d;
                if (kn2 != null && !kn2.g(this)) {
                    z = false;
                }
                if (this.g == null) {
                    if (this.w == null) {
                        AbstractC2834Vv abstractC2834Vv = this.i;
                        Drawable drawable2 = abstractC2834Vv.t;
                        this.w = drawable2;
                        if (drawable2 == null && (i3 = abstractC2834Vv.u) > 0) {
                            this.w = g(i3);
                        }
                    }
                    drawable = this.w;
                }
                if (drawable == null) {
                    if (this.u == null) {
                        AbstractC2834Vv abstractC2834Vv2 = this.i;
                        Drawable drawable3 = abstractC2834Vv2.j;
                        this.u = drawable3;
                        if (drawable3 == null && (i2 = abstractC2834Vv2.k) > 0) {
                            this.u = g(i2);
                        }
                    }
                    drawable = this.u;
                }
                if (drawable == null) {
                    drawable = e();
                }
                this.m.i(drawable);
                this.z = false;
                KN2 kn22 = this.d;
                if (kn22 != null) {
                    kn22.d(this);
                }
            } catch (Throwable th) {
                this.z = false;
                throw th;
            }
        }
    }

    @Override // defpackage.GN2
    public final boolean b(GN2 gn2) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC2834Vv abstractC2834Vv;
        EnumC7567mA2 enumC7567mA2;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        AbstractC2834Vv abstractC2834Vv2;
        EnumC7567mA2 enumC7567mA22;
        int size2;
        boolean equals;
        if (!(gn2 instanceof C3133Yc3)) {
            return false;
        }
        synchronized (this.b) {
            i = this.j;
            i2 = this.k;
            obj = this.g;
            cls = this.h;
            abstractC2834Vv = this.i;
            enumC7567mA2 = this.l;
            List list = this.n;
            size = list != null ? list.size() : 0;
        }
        C3133Yc3 c3133Yc3 = (C3133Yc3) gn2;
        synchronized (c3133Yc3.b) {
            i3 = c3133Yc3.j;
            i4 = c3133Yc3.k;
            obj2 = c3133Yc3.g;
            cls2 = c3133Yc3.h;
            abstractC2834Vv2 = c3133Yc3.i;
            enumC7567mA22 = c3133Yc3.l;
            List list2 = c3133Yc3.n;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = AbstractC10296u74.a;
            if (obj == null) {
                equals = obj2 == null;
            } else {
                equals = obj.equals(obj2);
            }
            if (equals && cls.equals(cls2) && abstractC2834Vv.equals(abstractC2834Vv2) && enumC7567mA2 == enumC7567mA22 && size == size2) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.b) {
            obj = this.g;
            cls = this.h;
        }
        return super.toString() + "[model=" + String.valueOf(obj) + ", transcodeClass=" + String.valueOf(cls) + "]";
    }

    public final Drawable g(int i) {
        Resources.Theme theme = this.i.z;
        if (theme == null) {
            theme = this.e.getTheme();
        }
        BZ0 bz0 = this.f;
        return AbstractC1266Jt0.a(bz0, bz0, i, theme);
    }
}
