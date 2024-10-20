package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u92 */
/* loaded from: classes.dex */
public final class C10306u92 extends AtomicInteger implements InterfaceC6416iq0, InterfaceC11128wa2 {
    public static final C9963t92[] v = new C9963t92[0];
    public static final C9963t92[] w = new C9963t92[0];
    public final InterfaceC11128wa2 a;
    public final DV0 g;
    public final boolean h;
    public final int i;
    public final int j;
    public volatile InterfaceC3258Zb3 k;
    public volatile boolean l;
    public final C0965Hl m = new C0965Hl();
    public volatile boolean n;
    public final AtomicReference o;
    public InterfaceC6416iq0 p;
    public long q;
    public long r;
    public int s;
    public final ArrayDeque t;
    public int u;

    public C10306u92(int i, int i2, InterfaceC11128wa2 interfaceC11128wa2, DV0 dv0, boolean z) {
        this.a = interfaceC11128wa2;
        this.g = dv0;
        this.h = z;
        this.i = i;
        this.j = i2;
        if (i != Integer.MAX_VALUE) {
            this.t = new ArrayDeque(i);
        }
        this.o = new AtomicReference(v);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.g(this.p, interfaceC6416iq0)) {
            this.p = interfaceC6416iq0;
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        if (this.l) {
            return;
        }
        try {
            InterfaceC7353la2 interfaceC7353la2 = (InterfaceC7353la2) this.g.apply(obj);
            Q82.a(interfaceC7353la2, "The mapper returned a null ObservableSource");
            if (this.i != Integer.MAX_VALUE) {
                synchronized (this) {
                    int i = this.u;
                    if (i == this.i) {
                        this.t.offer(interfaceC7353la2);
                        return;
                    }
                    this.u = i + 1;
                }
            }
            i(interfaceC7353la2);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            this.p.dispose();
            onError(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:            if (decrementAndGet() == 0) goto L277;     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(defpackage.InterfaceC7353la2 r8) {
        /*
            r7 = this;
        L0:
            boolean r0 = r8 instanceof java.util.concurrent.Callable
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8f
            java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L60
            if (r8 != 0) goto L12
            goto L6c
        L12:
            int r3 = r7.get()
            if (r3 != 0) goto L2a
            boolean r3 = r7.compareAndSet(r2, r1)
            if (r3 == 0) goto L2a
            wa2 r3 = r7.a
            r3.d(r8)
            int r8 = r7.decrementAndGet()
            if (r8 != 0) goto L5c
            goto L6c
        L2a:
            Zb3 r3 = r7.k
            if (r3 != 0) goto L43
            int r3 = r7.i
            if (r3 != r0) goto L3a
            li3 r3 = new li3
            int r4 = r7.j
            r3.<init>(r4)
            goto L41
        L3a:
            ki3 r3 = new ki3
            int r4 = r7.i
            r3.<init>(r4)
        L41:
            r7.k = r3
        L43:
            boolean r8 = r3.offer(r8)
            if (r8 != 0) goto L54
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r3 = "Scalar queue full?!"
            r8.<init>(r3)
            r7.onError(r8)
            goto L6c
        L54:
            int r8 = r7.getAndIncrement()
            if (r8 == 0) goto L5c
            r8 = r2
            goto L6d
        L5c:
            r7.g()
            goto L6c
        L60:
            r8 = move-exception
            defpackage.AbstractC4148cE0.a(r8)
            Hl r3 = r7.m
            r3.a(r8)
            r7.f()
        L6c:
            r8 = r1
        L6d:
            if (r8 == 0) goto Lcc
            int r8 = r7.i
            if (r8 == r0) goto Lcc
            monitor-enter(r7)
            java.util.ArrayDeque r8 = r7.t     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r8 = r8.poll()     // Catch: java.lang.Throwable -> L8c
            la2 r8 = (defpackage.InterfaceC7353la2) r8     // Catch: java.lang.Throwable -> L8c
            if (r8 != 0) goto L84
            int r0 = r7.u     // Catch: java.lang.Throwable -> L8c
            int r0 = r0 - r1
            r7.u = r0     // Catch: java.lang.Throwable -> L8c
            goto L85
        L84:
            r1 = r2
        L85:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L0
            r7.f()
            goto Lcc
        L8c:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L8c
            throw r8
        L8f:
            t92 r0 = new t92
            long r3 = r7.q
            r5 = 1
            long r5 = r5 + r3
            r7.q = r5
            r0.<init>(r7, r3)
        L9b:
            java.util.concurrent.atomic.AtomicReference r3 = r7.o
            java.lang.Object r4 = r3.get()
            t92[] r4 = (defpackage.C9963t92[]) r4
            t92[] r5 = defpackage.C10306u92.w
            if (r4 != r5) goto Lac
            defpackage.EnumC7791mq0.a(r0)
            r1 = r2
            goto Lc7
        Lac:
            int r5 = r4.length
            int r6 = r5 + 1
            t92[] r6 = new defpackage.C9963t92[r6]
            java.lang.System.arraycopy(r4, r2, r6, r2, r5)
            r6[r5] = r0
        Lb6:
            boolean r5 = r3.compareAndSet(r4, r6)
            if (r5 == 0) goto Lbe
            r3 = r1
            goto Lc5
        Lbe:
            java.lang.Object r5 = r3.get()
            if (r5 == r4) goto Lb6
            r3 = r2
        Lc5:
            if (r3 == 0) goto L9b
        Lc7:
            if (r1 == 0) goto Lcc
            r8.a(r0)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10306u92.i(la2):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(C9963t92 c9963t92) {
        boolean z;
        C9963t92[] c9963t92Arr;
        do {
            AtomicReference atomicReference = this.o;
            C9963t92[] c9963t92Arr2 = (C9963t92[]) atomicReference.get();
            int length = c9963t92Arr2.length;
            if (length == 0) {
                return;
            }
            z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c9963t92Arr2[i] == c9963t92) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c9963t92Arr = v;
            } else {
                C9963t92[] c9963t92Arr3 = new C9963t92[length - 1];
                System.arraycopy(c9963t92Arr2, 0, c9963t92Arr3, 0, i);
                System.arraycopy(c9963t92Arr2, i + 1, c9963t92Arr3, i, (length - i) - 1);
                c9963t92Arr = c9963t92Arr3;
            }
            while (true) {
                if (atomicReference.compareAndSet(c9963t92Arr2, c9963t92Arr)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != c9963t92Arr2) {
                    break;
                }
            }
        } while (!z);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        if (this.l) {
            MR2.b(th);
        } else if (this.m.a(th)) {
            this.l = true;
            f();
        } else {
            MR2.b(th);
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        if (this.l) {
            return;
        }
        this.l = true;
        f();
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        Throwable b;
        if (this.n) {
            return;
        }
        this.n = true;
        if (!e() || (b = this.m.b()) == null || b == ZD0.a) {
            return;
        }
        MR2.b(b);
    }

    public final void f() {
        if (getAndIncrement() == 0) {
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0004, code lost:            continue;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:            if (r11 != null) goto L542;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:            r11 = r10.h;        r12 = r10.i;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:            if (r11 == false) goto L515;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:            if (r12 == null) goto L511;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:            if (r12.isEmpty() == false) goto L515;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:            h(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e8, code lost:            if (a() == false) goto L514;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00eb, code lost:            r4 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ea, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ed, code lost:            r7 = r7 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ef, code lost:            if (r7 != r6) goto L565;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f1, code lost:            r7 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f2, code lost:            r3 = r3 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a5, code lost:            r12 = r11.poll();     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a9, code lost:            if (r12 != null) goto L496;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ac, code lost:            r0.d(r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b3, code lost:            if (a() == false) goto L567;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b5, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b6, code lost:            r11 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b7, code lost:            defpackage.AbstractC4148cE0.a(r11);        defpackage.EnumC7791mq0.a(r10);        r13.m.a(r11);     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c6, code lost:            if (a() != false) goto L551;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c9, code lost:            h(r10);        r4 = r4 + 1;        r7 = r7 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d0, code lost:            if (r7 != r6) goto L564;     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c8, code lost:            return;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10306u92.g():void");
    }

    public final boolean a() {
        if (this.n) {
            return true;
        }
        Throwable th = (Throwable) this.m.get();
        if (this.h || th == null) {
            return false;
        }
        e();
        Throwable b = this.m.b();
        if (b != ZD0.a) {
            this.a.onError(b);
        }
        return true;
    }

    public final boolean e() {
        C9963t92[] c9963t92Arr;
        this.p.dispose();
        AtomicReference atomicReference = this.o;
        C9963t92[] c9963t92Arr2 = (C9963t92[]) atomicReference.get();
        C9963t92[] c9963t92Arr3 = w;
        if (c9963t92Arr2 == c9963t92Arr3 || (c9963t92Arr = (C9963t92[]) atomicReference.getAndSet(c9963t92Arr3)) == c9963t92Arr3) {
            return false;
        }
        for (C9963t92 c9963t92 : c9963t92Arr) {
            c9963t92.getClass();
            EnumC7791mq0.a(c9963t92);
        }
        return true;
    }
}
