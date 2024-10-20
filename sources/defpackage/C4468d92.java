package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d92, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4468d92 extends AtomicInteger implements InterfaceC6416iq0 {
    public final InterfaceC11128wa2 a;
    public final DV0 g;
    public final C4124c92[] h;
    public Object[] i;
    public final C7402li3 j;
    public volatile boolean l;
    public volatile boolean m;
    public int o;
    public int p;
    public final C0965Hl n = new C0965Hl();
    public final boolean k = false;

    public C4468d92(int i, int i2, InterfaceC11128wa2 interfaceC11128wa2, DV0 dv0) {
        this.a = interfaceC11128wa2;
        this.g = dv0;
        this.i = new Object[i];
        C4124c92[] c4124c92Arr = new C4124c92[i];
        for (int i3 = 0; i3 < i; i3++) {
            c4124c92Arr[i3] = new C4124c92(this, i3);
        }
        this.h = c4124c92Arr;
        this.j = new C7402li3(i2);
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (this.l) {
            return;
        }
        this.l = true;
        a();
        if (getAndIncrement() == 0) {
            b(this.j);
        }
    }

    public final void a() {
        for (C4124c92 c4124c92 : this.h) {
            c4124c92.getClass();
            EnumC7791mq0.a(c4124c92);
        }
    }

    public final void b(C7402li3 c7402li3) {
        synchronized (this) {
            this.i = null;
        }
        c7402li3.clear();
    }

    public final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        C7402li3 c7402li3 = this.j;
        InterfaceC11128wa2 interfaceC11128wa2 = this.a;
        boolean z = this.k;
        int i = 1;
        while (!this.l) {
            if (!z && this.n.get() != null) {
                a();
                b(c7402li3);
                interfaceC11128wa2.onError(this.n.b());
                return;
            }
            boolean z2 = this.m;
            Object[] objArr = (Object[]) c7402li3.poll();
            boolean z3 = objArr == null;
            if (z2 && z3) {
                b(c7402li3);
                Throwable b = this.n.b();
                if (b == null) {
                    interfaceC11128wa2.b();
                    return;
                } else {
                    interfaceC11128wa2.onError(b);
                    return;
                }
            }
            if (!z3) {
                try {
                    Object apply = this.g.apply(objArr);
                    Q82.a(apply, "The combiner returned a null value");
                    interfaceC11128wa2.d(apply);
                } catch (Throwable th) {
                    AbstractC4148cE0.a(th);
                    this.n.a(th);
                    a();
                    b(c7402li3);
                    interfaceC11128wa2.onError(this.n.b());
                    return;
                }
            } else {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
        b(c7402li3);
    }
}
