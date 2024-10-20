package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O00 {
    public static final AtomicInteger y = new AtomicInteger(1);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final YI2 f;
    public final InterfaceC6554jE1 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public boolean n;
    public InterfaceC6554jE1 o;
    public int r;
    public ComponentTree s;
    public C7070kk3 t;
    public InterfaceC7976nN2 u;
    public C7268lJ2 v;
    public final AtomicInteger g = new AtomicInteger(0);
    public boolean p = true;
    public boolean q = false;
    public int w = -1;
    public int x = -1;
    public final int h = y.getAndIncrement();

    public O00(N00 n00) {
        this.u = n00.a;
        this.o = n00.b;
        this.i = n00.d;
        this.j = n00.e;
        this.f = n00.c;
        this.b = n00.g;
        this.a = n00.h;
        this.k = n00.f;
        this.l = n00.n;
        this.m = n00.i;
        this.c = n00.j;
        this.d = n00.k;
        boolean z = n00.l;
        this.e = n00.m;
    }

    public final void c(C7849n00 c7849n00, int i, int i2, C8753pe3 c8753pe3) {
        synchronized (this) {
            if (this.u.g()) {
                return;
            }
            this.w = i;
            this.x = i2;
            d(c7849n00);
            ComponentTree componentTree = this.s;
            WZ j = this.u.j();
            InterfaceC7976nN2 interfaceC7976nN2 = this.u;
            C5277fX3 c5277fX3 = interfaceC7976nN2 instanceof C5621gX3 ? ((C5621gX3) interfaceC7976nN2).b : null;
            if (j == null) {
                componentTree.getClass();
                throw new IllegalArgumentException("Root component can't be null");
            }
            componentTree.u(j, i, i2, false, c8753pe3, 0, c5277fX3);
            synchronized (this) {
                if (componentTree == this.s && j == this.u.j()) {
                    this.n = true;
                    if (c8753pe3 != null) {
                        this.r = c8753pe3.b;
                    }
                }
            }
        }
    }

    public final void b(C7849n00 c7849n00, int i, int i2, C4175cJ2 c4175cJ2) {
        synchronized (this) {
            if (this.u.g()) {
                return;
            }
            this.w = i;
            this.x = i2;
            d(c7849n00);
            ComponentTree componentTree = this.s;
            WZ j = this.u.j();
            InterfaceC7976nN2 interfaceC7976nN2 = this.u;
            C5277fX3 c5277fX3 = interfaceC7976nN2 instanceof C5621gX3 ? ((C5621gX3) interfaceC7976nN2).b : null;
            if (c4175cJ2 != null) {
                synchronized (componentTree) {
                    if (componentTree.j == null) {
                        componentTree.j = new ArrayList();
                    }
                    componentTree.j.add(c4175cJ2);
                }
            }
            if (j == null) {
                componentTree.getClass();
                throw new IllegalArgumentException("Root component can't be null");
            }
            componentTree.u(j, i, i2, true, null, 1, c5277fX3);
            synchronized (this) {
                if (this.s == componentTree && j == this.u.j()) {
                    this.n = true;
                }
            }
        }
    }

    public final synchronized InterfaceC7976nN2 f() {
        return this.u;
    }

    public final synchronized boolean h(int i, int i2) {
        synchronized (this) {
        }
        return this.n && this.w == i && this.x == i2;
        return this.n && this.w == i && this.x == i2;
    }

    public final synchronized ComponentTree e() {
        return this.s;
    }

    public final synchronized boolean g() {
        boolean z;
        boolean z2;
        z = true;
        if (!this.u.g()) {
            ComponentTree componentTree = this.s;
            if (componentTree != null) {
                int i = this.w;
                int i2 = this.x;
                synchronized (componentTree) {
                    if (!ComponentTree.k(componentTree.V, i, i2)) {
                        if (!ComponentTree.k(componentTree.W, i, i2)) {
                            z2 = false;
                        }
                    }
                    z2 = true;
                }
                if (z2) {
                }
            }
            z = false;
        }
        return z;
    }

    public final void d(C7849n00 c7849n00) {
        C6924kJ2 c6924kJ2;
        if (this.s == null) {
            F00 f = ComponentTree.f(this.u.j(), c7849n00);
            Object l = this.u.l("is_reconciliation_enabled");
            Object l2 = this.u.l("layout_diffing_enabled");
            if (l != null) {
                f.o = ((Boolean) l).booleanValue();
            } else {
                f.o = this.c;
            }
            f.c = this.e;
            if (l2 != null) {
                f.g = ((Boolean) l2).booleanValue();
            } else {
                f.g = this.d;
            }
            f.h = this.o;
            f.j = this.t;
            f.i = this.i;
            f.n = false;
            f.m = this.j;
            YI2 yi2 = this.f;
            if (yi2 == null) {
                c6924kJ2 = null;
            } else {
                KJ2 kj2 = yi2.a;
                kj2.getClass();
                c6924kJ2 = new C6924kJ2(kj2, this);
            }
            f.l = c6924kJ2;
            f.k = this.q;
            f.e = this.k;
            f.b = this.l;
            f.f = this.m;
            f.q = this.a;
            f.r = this.b;
            C5524gE1 d = this.u.d();
            String o = this.u.o();
            f.t = d;
            f.s = o;
            ComponentTree a = f.a();
            this.s = a;
            C7268lJ2 c7268lJ2 = this.v;
            if (c7268lJ2 != null) {
                a.D = c7268lJ2;
            }
        }
    }

    public final synchronized void i() {
        ComponentTree componentTree = this.s;
        if (componentTree != null) {
            componentTree.s();
            this.s = null;
            this.u.h();
        }
        this.n = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0017, code lost:            if ((r3 instanceof java.lang.Boolean ? ((java.lang.Boolean) r3).booleanValue() : false) != false) goto L9;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L19
            nN2 r3 = r2.u     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "acquire_state_handler"
            java.lang.Object r3 = r3.l(r0)     // Catch: java.lang.Throwable -> L37
            boolean r0 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L16
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L37
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L37
            goto L17
        L16:
            r3 = 0
        L17:
            if (r3 == 0) goto L29
        L19:
            com.facebook.litho.ComponentTree r3 = r2.s     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L1e
            goto L29
        L1e:
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L37
            kk3 r0 = r3.X     // Catch: java.lang.Throwable -> L39
            kk3 r1 = new kk3     // Catch: java.lang.Throwable -> L39
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            r2.t = r1     // Catch: java.lang.Throwable -> L37
        L29:
            com.facebook.litho.ComponentTree r3 = r2.s     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L2e
            goto L32
        L2e:
            boolean r3 = r3.f11494J     // Catch: java.lang.Throwable -> L37
            r2.q = r3     // Catch: java.lang.Throwable -> L37
        L32:
            r2.i()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            return
        L37:
            r3 = move-exception
            goto L3c
        L39:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L37
        L3c:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.O00.a(boolean):void");
    }
}
