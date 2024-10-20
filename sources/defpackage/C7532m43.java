package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m43, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7532m43 implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public final InterfaceC11128wa2 a;
    public InterfaceC6416iq0 g;
    public boolean h;
    public C7748mj i;
    public volatile boolean j;

    public C7532m43(InterfaceC11128wa2 interfaceC11128wa2) {
        this.a = interfaceC11128wa2;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.g(this.g, interfaceC6416iq0)) {
            this.g = interfaceC6416iq0;
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.g.dispose();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0075 A[LOOP:2: B:34:0x0050->B:43:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC11128wa2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r6.j
            if (r0 == 0) goto L5
            return
        L5:
            if (r7 != 0) goto L17
            iq0 r7 = r6.g
            r7.dispose()
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r7.<init>(r0)
            r6.onError(r7)
            return
        L17:
            monitor-enter(r6)
            boolean r0 = r6.j     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L1e
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L83
            return
        L1e:
            boolean r0 = r6.h     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L32
            mj r0 = r6.i     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L2d
            mj r0 = new mj     // Catch: java.lang.Throwable -> L83
            r0.<init>()     // Catch: java.lang.Throwable -> L83
            r6.i = r0     // Catch: java.lang.Throwable -> L83
        L2d:
            r0.a(r7)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L83
            return
        L32:
            r0 = 1
            r6.h = r0     // Catch: java.lang.Throwable -> L83
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L83
            wa2 r1 = r6.a
            r1.d(r7)
        L3b:
            monitor-enter(r6)
            mj r7 = r6.i     // Catch: java.lang.Throwable -> L80
            r1 = 0
            if (r7 != 0) goto L45
            r6.h = r1     // Catch: java.lang.Throwable -> L80
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L80
            goto L7f
        L45:
            r2 = 0
            r6.i = r2     // Catch: java.lang.Throwable -> L80
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L80
            wa2 r2 = r6.a
            java.lang.Object[] r7 = r7.a
        L4d:
            if (r7 == 0) goto L7d
            r3 = r1
        L50:
            r4 = 4
            if (r3 >= r4) goto L78
            r5 = r7[r3]
            if (r5 != 0) goto L58
            goto L78
        L58:
            X62 r4 = defpackage.X62.a
            if (r5 != r4) goto L60
            r2.b()
            goto L6b
        L60:
            boolean r4 = r5 instanceof defpackage.W62
            if (r4 == 0) goto L6d
            W62 r5 = (defpackage.W62) r5
            java.lang.Throwable r4 = r5.a
            r2.onError(r4)
        L6b:
            r4 = r0
            goto L71
        L6d:
            r2.d(r5)
            r4 = r1
        L71:
            if (r4 == 0) goto L75
            r1 = r0
            goto L7d
        L75:
            int r3 = r3 + 1
            goto L50
        L78:
            r7 = r7[r4]
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            goto L4d
        L7d:
            if (r1 == 0) goto L3b
        L7f:
            return
        L80:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L80
            throw r7
        L83:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L83
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7532m43.d(java.lang.Object):void");
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        if (this.j) {
            MR2.b(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.j) {
                if (this.h) {
                    this.j = true;
                    C7748mj c7748mj = this.i;
                    if (c7748mj == null) {
                        c7748mj = new C7748mj();
                        this.i = c7748mj;
                    }
                    c7748mj.a[0] = new W62(th);
                    return;
                }
                this.j = true;
                this.h = true;
                z = false;
            }
            if (z) {
                MR2.b(th);
            } else {
                this.a.onError(th);
            }
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        if (this.j) {
            return;
        }
        synchronized (this) {
            if (this.j) {
                return;
            }
            if (this.h) {
                C7748mj c7748mj = this.i;
                if (c7748mj == null) {
                    c7748mj = new C7748mj();
                    this.i = c7748mj;
                }
                c7748mj.a(X62.a);
                return;
            }
            this.j = true;
            this.h = true;
            this.a.b();
        }
    }
}
