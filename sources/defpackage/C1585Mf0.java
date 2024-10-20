package defpackage;

import java.io.File;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mf0 */
/* loaded from: classes.dex */
public final class C1585Mf0 implements InterfaceC3607ag0, InterfaceC3015Xf0 {
    public final List a;
    public final C0171Bi0 g;
    public final InterfaceC3275Zf0 h;
    public int i = -1;
    public InterfaceC6098hu1 j;
    public List k;
    public int l;
    public volatile C7686mY1 m;
    public File n;

    public C1585Mf0(List list, C0171Bi0 c0171Bi0, InterfaceC3275Zf0 interfaceC3275Zf0) {
        this.a = list;
        this.g = c0171Bi0;
        this.h = interfaceC3275Zf0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:            r8.m = null;        r0 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:            if (r0 != false) goto L197;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:            if (r8.l >= r8.k.size()) goto L168;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:            r3 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:            if (r3 == false) goto L196;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:            r3 = r8.k;        r4 = r8.l;        r8.l = r4 + 1;        r3 = (defpackage.InterfaceC8030nY1) r3.get(r4);        r4 = r8.n;        r5 = r8.g;        r8.m = r3.b(r4, r5.e, r5.f, r5.i);     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:            if (r8.m == null) goto L201;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:            if (r8.g.c(r8.m.c.a()) == null) goto L175;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:            r3 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:            if (r3 == false) goto L202;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:            r8.m.c.c(r8.g.o, r8);        r0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:            r3 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0026, code lost:            r3 = false;     */
    @Override // defpackage.InterfaceC3607ag0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r8 = this;
        L0:
            java.util.List r0 = r8.k     // Catch: java.lang.Throwable -> Lb1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L6e
            int r3 = r8.l     // Catch: java.lang.Throwable -> Lb1
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb1
            if (r3 >= r0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 != 0) goto L14
            goto L6e
        L14:
            r0 = 0
            r8.m = r0     // Catch: java.lang.Throwable -> Lb1
            r0 = r1
        L18:
            if (r0 != 0) goto L6d
            int r3 = r8.l     // Catch: java.lang.Throwable -> Lb1
            java.util.List r4 = r8.k     // Catch: java.lang.Throwable -> Lb1
            int r4 = r4.size()     // Catch: java.lang.Throwable -> Lb1
            if (r3 >= r4) goto L26
            r3 = r2
            goto L27
        L26:
            r3 = r1
        L27:
            if (r3 == 0) goto L6d
            java.util.List r3 = r8.k     // Catch: java.lang.Throwable -> Lb1
            int r4 = r8.l     // Catch: java.lang.Throwable -> Lb1
            int r5 = r4 + 1
            r8.l = r5     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> Lb1
            nY1 r3 = (defpackage.InterfaceC8030nY1) r3     // Catch: java.lang.Throwable -> Lb1
            java.io.File r4 = r8.n     // Catch: java.lang.Throwable -> Lb1
            Bi0 r5 = r8.g     // Catch: java.lang.Throwable -> Lb1
            int r6 = r5.e     // Catch: java.lang.Throwable -> Lb1
            int r7 = r5.f     // Catch: java.lang.Throwable -> Lb1
            Ee2 r5 = r5.i     // Catch: java.lang.Throwable -> Lb1
            mY1 r3 = r3.b(r4, r6, r7, r5)     // Catch: java.lang.Throwable -> Lb1
            r8.m = r3     // Catch: java.lang.Throwable -> Lb1
            mY1 r3 = r8.m     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto L18
            Bi0 r3 = r8.g     // Catch: java.lang.Throwable -> Lb1
            mY1 r4 = r8.m     // Catch: java.lang.Throwable -> Lb1
            Yf0 r4 = r4.c     // Catch: java.lang.Throwable -> Lb1
            java.lang.Class r4 = r4.a()     // Catch: java.lang.Throwable -> Lb1
            DE1 r3 = r3.c(r4)     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 == 0) goto L18
            mY1 r0 = r8.m     // Catch: java.lang.Throwable -> Lb1
            Yf0 r0 = r0.c     // Catch: java.lang.Throwable -> Lb1
            Bi0 r3 = r8.g     // Catch: java.lang.Throwable -> Lb1
            mA2 r3 = r3.o     // Catch: java.lang.Throwable -> Lb1
            r0.c(r3, r8)     // Catch: java.lang.Throwable -> Lb1
            r0 = r2
            goto L18
        L6d:
            return r0
        L6e:
            int r0 = r8.i     // Catch: java.lang.Throwable -> Lb1
            int r0 = r0 + r2
            r8.i = r0     // Catch: java.lang.Throwable -> Lb1
            java.util.List r2 = r8.a     // Catch: java.lang.Throwable -> Lb1
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lb1
            if (r0 < r2) goto L7c
            return r1
        L7c:
            java.util.List r0 = r8.a     // Catch: java.lang.Throwable -> Lb1
            int r2 = r8.i     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb1
            hu1 r0 = (defpackage.InterfaceC6098hu1) r0     // Catch: java.lang.Throwable -> Lb1
            Nf0 r2 = new Nf0     // Catch: java.lang.Throwable -> Lb1
            Bi0 r3 = r8.g     // Catch: java.lang.Throwable -> Lb1
            hu1 r4 = r3.n     // Catch: java.lang.Throwable -> Lb1
            r2.<init>(r0, r4)     // Catch: java.lang.Throwable -> Lb1
            hB0 r3 = r3.h     // Catch: java.lang.Throwable -> Lb1
            dp0 r3 = r3.a()     // Catch: java.lang.Throwable -> Lb1
            java.io.File r2 = r3.b(r2)     // Catch: java.lang.Throwable -> Lb1
            r8.n = r2     // Catch: java.lang.Throwable -> Lb1
            if (r2 == 0) goto L0
            r8.j = r0     // Catch: java.lang.Throwable -> Lb1
            Bi0 r0 = r8.g     // Catch: java.lang.Throwable -> Lb1
            BZ0 r0 = r0.c     // Catch: java.lang.Throwable -> Lb1
            LL2 r0 = r0.a()     // Catch: java.lang.Throwable -> Lb1
            java.util.List r0 = r0.e(r2)     // Catch: java.lang.Throwable -> Lb1
            r8.k = r0     // Catch: java.lang.Throwable -> Lb1
            r8.l = r1     // Catch: java.lang.Throwable -> Lb1
            goto L0
        Lb1:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1585Mf0.c():boolean");
    }

    @Override // defpackage.InterfaceC3607ag0
    public final void cancel() {
        C7686mY1 c7686mY1 = this.m;
        if (c7686mY1 != null) {
            c7686mY1.c.cancel();
        }
    }

    @Override // defpackage.InterfaceC3015Xf0
    public final void f(Object obj) {
        this.h.d(this.j, obj, this.m.c, EnumC9447rg0.DATA_DISK_CACHE, this.j);
    }

    @Override // defpackage.InterfaceC3015Xf0
    public final void d(Exception exc) {
        this.h.b(this.j, exc, this.m.c, EnumC9447rg0.DATA_DISK_CACHE);
    }
}
