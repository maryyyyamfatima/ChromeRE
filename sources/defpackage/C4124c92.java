package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c92, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4124c92 extends AtomicReference implements InterfaceC11128wa2 {
    public final C4468d92 a;
    public final int g;

    public C4124c92(C4468d92 c4468d92, int i) {
        this.a = c4468d92;
        this.g = i;
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        EnumC7791mq0.f(this, interfaceC6416iq0);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        boolean z;
        C4468d92 c4468d92 = this.a;
        int i = this.g;
        synchronized (c4468d92) {
            Object[] objArr = c4468d92.i;
            if (objArr == null) {
                return;
            }
            Object obj2 = objArr[i];
            int i2 = c4468d92.o;
            if (obj2 == null) {
                i2++;
                c4468d92.o = i2;
            }
            objArr[i] = obj;
            if (i2 == objArr.length) {
                c4468d92.j.offer((Object[]) objArr.clone());
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c4468d92.c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:            if (r3 == r5.length) goto L18;     */
    @Override // defpackage.InterfaceC11128wa2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            d92 r0 = r4.a
            int r1 = r4.g
            Hl r2 = r0.n
            boolean r2 = r2.a(r5)
            if (r2 == 0) goto L3a
            boolean r5 = r0.k
            r2 = 1
            if (r5 == 0) goto L31
            monitor-enter(r0)
            java.lang.Object[] r5 = r0.i     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            goto L3d
        L18:
            r1 = r5[r1]     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L1e
            r1 = r2
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 != 0) goto L29
            int r3 = r0.p     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + r2
            r0.p = r3     // Catch: java.lang.Throwable -> L2e
            int r5 = r5.length     // Catch: java.lang.Throwable -> L2e
            if (r3 != r5) goto L2b
        L29:
            r0.m = r2     // Catch: java.lang.Throwable -> L2e
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            r2 = r1
            goto L31
        L2e:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r5
        L31:
            if (r2 == 0) goto L36
            r0.a()
        L36:
            r0.c()
            goto L3d
        L3a:
            defpackage.MR2.b(r5)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4124c92.onError(java.lang.Throwable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:            if (r4 == r2.length) goto L15;     */
    @Override // defpackage.InterfaceC11128wa2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r5 = this;
            d92 r0 = r5.a
            int r1 = r5.g
            monitor-enter(r0)
            java.lang.Object[] r2 = r0.i     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            goto L28
        Lb:
            r1 = r2[r1]     // Catch: java.lang.Throwable -> L29
            r3 = 1
            if (r1 != 0) goto L12
            r1 = r3
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 != 0) goto L1d
            int r4 = r0.p     // Catch: java.lang.Throwable -> L29
            int r4 = r4 + r3
            r0.p = r4     // Catch: java.lang.Throwable -> L29
            int r2 = r2.length     // Catch: java.lang.Throwable -> L29
            if (r4 != r2) goto L1f
        L1d:
            r0.m = r3     // Catch: java.lang.Throwable -> L29
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L25
            r0.a()
        L25:
            r0.c()
        L28:
            return
        L29:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4124c92.b():void");
    }
}
