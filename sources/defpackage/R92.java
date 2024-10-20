package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class R92 extends AbstractC4052bx implements InterfaceC11128wa2, Runnable {
    public final InterfaceC11128wa2 a;
    public final AbstractC10079tW2 g;
    public final boolean h;
    public final int i;
    public InterfaceC3586ac3 j;
    public InterfaceC6416iq0 k;
    public Throwable l;
    public volatile boolean m;
    public volatile boolean n;
    public int o;
    public boolean p;

    public R92(InterfaceC11128wa2 interfaceC11128wa2, AbstractC10079tW2 abstractC10079tW2, boolean z, int i) {
        this.a = interfaceC11128wa2;
        this.g = abstractC10079tW2;
        this.h = z;
        this.i = i;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.g(this.k, interfaceC6416iq0)) {
            this.k = interfaceC6416iq0;
            if (interfaceC6416iq0 instanceof AG2) {
                AG2 ag2 = (AG2) interfaceC6416iq0;
                int e = ag2.e(7);
                if (e == 1) {
                    this.o = e;
                    this.j = ag2;
                    this.m = true;
                    this.a.c(this);
                    if (getAndIncrement() == 0) {
                        this.g.b(this);
                        return;
                    }
                    return;
                }
                if (e == 2) {
                    this.o = e;
                    this.j = ag2;
                    this.a.c(this);
                    return;
                }
            }
            this.j = new C7402li3(this.i);
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        if (this.m) {
            return;
        }
        if (this.o != 2) {
            this.j.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.g.b(this);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        if (this.m) {
            MR2.b(th);
            return;
        }
        this.l = th;
        this.m = true;
        if (getAndIncrement() == 0) {
            this.g.b(this);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        if (this.m) {
            return;
        }
        this.m = true;
        if (getAndIncrement() == 0) {
            this.g.b(this);
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.k.dispose();
        this.g.dispose();
        if (getAndIncrement() == 0) {
            this.j.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:            r3 = addAndGet(-r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:            if (r3 != 0) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:            return;     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            boolean r0 = r7.p
            r1 = 1
            if (r0 == 0) goto L4f
            r0 = r1
        L6:
            boolean r2 = r7.n
            if (r2 == 0) goto Lc
            goto L97
        Lc:
            boolean r2 = r7.m
            java.lang.Throwable r3 = r7.l
            boolean r4 = r7.h
            if (r4 != 0) goto L28
            if (r2 == 0) goto L28
            if (r3 == 0) goto L28
            r7.n = r1
            wa2 r0 = r7.a
            java.lang.Throwable r1 = r7.l
            r0.onError(r1)
            tW2 r0 = r7.g
            r0.dispose()
            goto L97
        L28:
            wa2 r3 = r7.a
            r4 = 0
            r3.d(r4)
            if (r2 == 0) goto L47
            r7.n = r1
            java.lang.Throwable r0 = r7.l
            if (r0 == 0) goto L3c
            wa2 r1 = r7.a
            r1.onError(r0)
            goto L41
        L3c:
            wa2 r0 = r7.a
            r0.b()
        L41:
            tW2 r0 = r7.g
            r0.dispose()
            goto L97
        L47:
            int r0 = -r0
            int r0 = r7.addAndGet(r0)
            if (r0 != 0) goto L6
            goto L97
        L4f:
            ac3 r0 = r7.j
            wa2 r2 = r7.a
            r3 = r1
        L54:
            boolean r4 = r7.m
            boolean r5 = r0.isEmpty()
            boolean r4 = r7.a(r4, r5, r2)
            if (r4 == 0) goto L61
            goto L97
        L61:
            boolean r4 = r7.m
            java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L81
            if (r5 != 0) goto L6b
            r6 = r1
            goto L6c
        L6b:
            r6 = 0
        L6c:
            boolean r4 = r7.a(r4, r6, r2)
            if (r4 == 0) goto L73
            goto L97
        L73:
            if (r6 == 0) goto L7d
            int r3 = -r3
            int r3 = r7.addAndGet(r3)
            if (r3 != 0) goto L54
            goto L97
        L7d:
            r2.d(r5)
            goto L61
        L81:
            r3 = move-exception
            defpackage.AbstractC4148cE0.a(r3)
            r7.n = r1
            iq0 r1 = r7.k
            r1.dispose()
            r0.clear()
            r2.onError(r3)
            tW2 r0 = r7.g
            r0.dispose()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R92.run():void");
    }

    public final boolean a(boolean z, boolean z2, InterfaceC11128wa2 interfaceC11128wa2) {
        if (this.n) {
            this.j.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.l;
        if (this.h) {
            if (!z2) {
                return false;
            }
            this.n = true;
            if (th != null) {
                interfaceC11128wa2.onError(th);
            } else {
                interfaceC11128wa2.b();
            }
            this.g.dispose();
            return true;
        }
        if (th != null) {
            this.n = true;
            this.j.clear();
            interfaceC11128wa2.onError(th);
            this.g.dispose();
            return true;
        }
        if (!z2) {
            return false;
        }
        this.n = true;
        interfaceC11128wa2.b();
        this.g.dispose();
        return true;
    }

    @Override // defpackage.BG2
    public final int e(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.p = true;
        return 2;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final Object poll() {
        return this.j.poll();
    }

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
        this.j.clear();
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        return this.j.isEmpty();
    }
}
