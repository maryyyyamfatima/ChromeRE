package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rB0 */
/* loaded from: classes.dex */
public final class C9286rB0 implements InterfaceC0301Ci0, InterfaceC9316rH0 {
    public static final C8258oB0 E = new C8258oB0();
    public C12030zB0 A;
    public RunnableC1081Ii0 B;
    public volatile boolean C;
    public boolean D;
    public final C8944qB0 a;
    public final C10503uk3 g;
    public final InterfaceC11687yB0 h;
    public final InterfaceC9208qx2 i;
    public final C8258oB0 j;
    public final InterfaceC9629sB0 k;
    public final LZ0 l;
    public final LZ0 m;
    public final LZ0 n;
    public final LZ0 o;
    public final AtomicInteger p;
    public InterfaceC6098hu1 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public JO2 v;
    public EnumC9447rg0 w;
    public boolean x;
    public EZ0 y;
    public boolean z;

    public C9286rB0(LZ0 lz0, LZ0 lz02, LZ0 lz03, LZ0 lz04, InterfaceC9629sB0 interfaceC9629sB0, InterfaceC11687yB0 interfaceC11687yB0, C8974qH0 c8974qH0) {
        C8258oB0 c8258oB0 = E;
        this.a = new C8944qB0(new ArrayList(2));
        this.g = new C10503uk3();
        this.p = new AtomicInteger();
        this.l = lz0;
        this.m = lz02;
        this.n = lz03;
        this.o = lz04;
        this.k = interfaceC9629sB0;
        this.h = interfaceC11687yB0;
        this.i = c8974qH0;
        this.j = c8258oB0;
    }

    public final synchronized void a(QO2 qo2, Executor executor) {
        this.g.a();
        C8944qB0 c8944qB0 = this.a;
        c8944qB0.getClass();
        c8944qB0.a.add(new C8601pB0(qo2, executor));
        boolean z = true;
        if (this.x) {
            e(1);
            executor.execute(new RunnableC7914nB0(this, qo2));
        } else if (this.z) {
            e(1);
            executor.execute(new RunnableC7570mB0(this, qo2));
        } else {
            if (this.C) {
                z = false;
            }
            AbstractC6464iy2.a("Cannot add callbacks to a cancelled EngineJob", z);
        }
    }

    public final synchronized void h(QO2 qo2) {
        boolean z;
        this.g.a();
        C8944qB0 c8944qB0 = this.a;
        c8944qB0.a.remove(new C8601pB0(qo2, DE0.b));
        if (this.a.a.isEmpty()) {
            b();
            if (!this.x && !this.z) {
                z = false;
                if (z && this.p.get() == 0) {
                    g();
                }
            }
            z = true;
            if (z) {
                g();
            }
        }
    }

    public final void b() {
        if (f()) {
            return;
        }
        this.C = true;
        RunnableC1081Ii0 runnableC1081Ii0 = this.B;
        runnableC1081Ii0.I = true;
        InterfaceC3607ag0 interfaceC3607ag0 = runnableC1081Ii0.G;
        if (interfaceC3607ag0 != null) {
            interfaceC3607ag0.cancel();
        }
        InterfaceC9629sB0 interfaceC9629sB0 = this.k;
        InterfaceC6098hu1 interfaceC6098hu1 = this.q;
        C6538jB0 c6538jB0 = (C6538jB0) interfaceC9629sB0;
        synchronized (c6538jB0) {
            C0877Gt1 c0877Gt1 = c6538jB0.a;
            c0877Gt1.getClass();
            HashMap hashMap = this.u ? c0877Gt1.b : c0877Gt1.a;
            if (equals(hashMap.get(interfaceC6098hu1))) {
                hashMap.remove(interfaceC6098hu1);
            }
        }
    }

    public final boolean f() {
        return this.z || this.x || this.C;
    }

    public final synchronized void e(int i) {
        C12030zB0 c12030zB0;
        AbstractC6464iy2.a("Not yet complete!", f());
        if (this.p.getAndAdd(i) == 0 && (c12030zB0 = this.A) != null) {
            c12030zB0.a();
        }
    }

    public final void d() {
        C12030zB0 c12030zB0;
        synchronized (this) {
            this.g.a();
            AbstractC6464iy2.a("Not yet complete!", f());
            int decrementAndGet = this.p.decrementAndGet();
            AbstractC6464iy2.a("Can't decrement below 0", decrementAndGet >= 0);
            if (decrementAndGet == 0) {
                c12030zB0 = this.A;
                g();
            } else {
                c12030zB0 = null;
            }
        }
        if (c12030zB0 != null) {
            c12030zB0.c();
        }
    }

    public final synchronized void g() {
        boolean a;
        if (this.q == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.q = null;
        this.A = null;
        this.v = null;
        this.z = false;
        this.C = false;
        this.x = false;
        this.D = false;
        RunnableC1081Ii0 runnableC1081Ii0 = this.B;
        C0691Fi0 c0691Fi0 = runnableC1081Ii0.l;
        synchronized (c0691Fi0) {
            c0691Fi0.a = true;
            a = c0691Fi0.a();
        }
        if (a) {
            runnableC1081Ii0.k();
        }
        this.B = null;
        this.y = null;
        this.w = null;
        this.i.a(this);
    }

    @Override // defpackage.InterfaceC9316rH0
    public final C10503uk3 c() {
        return this.g;
    }
}
