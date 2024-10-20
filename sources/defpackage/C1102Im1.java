package defpackage;

import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Im1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1102Im1 implements InterfaceC7390lg3 {
    public final InputStream a;
    public final C8321oN3 g;

    public C1102Im1(InputStream inputStream, C8321oN3 c8321oN3) {
        AbstractC0087Ar1.e(inputStream, "input");
        this.a = inputStream;
        this.g = c8321oN3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:            if ((r8 != null && defpackage.AbstractC0719Fn3.a(r8, "getsockname failed", 0, false) >= 0) != false) goto L24;     */
    @Override // defpackage.InterfaceC7390lg3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long Z0(defpackage.C5173fD r6, long r7) {
        /*
            r5 = this;
            java.lang.String r7 = "sink"
            defpackage.AbstractC0087Ar1.e(r6, r7)
            r7 = 1
            oN3 r8 = r5.g     // Catch: java.lang.AssertionError -> L46
            r8.a()     // Catch: java.lang.AssertionError -> L46
            m23 r8 = r6.u(r7)     // Catch: java.lang.AssertionError -> L46
            int r0 = r8.c     // Catch: java.lang.AssertionError -> L46
            int r0 = 8192 - r0
            long r0 = (long) r0     // Catch: java.lang.AssertionError -> L46
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.lang.AssertionError -> L46
            int r0 = (int) r0     // Catch: java.lang.AssertionError -> L46
            java.io.InputStream r1 = r5.a     // Catch: java.lang.AssertionError -> L46
            byte[] r2 = r8.a     // Catch: java.lang.AssertionError -> L46
            int r3 = r8.c     // Catch: java.lang.AssertionError -> L46
            int r0 = r1.read(r2, r3, r0)     // Catch: java.lang.AssertionError -> L46
            r1 = -1
            if (r0 != r1) goto L3a
            int r0 = r8.b     // Catch: java.lang.AssertionError -> L46
            int r1 = r8.c     // Catch: java.lang.AssertionError -> L46
            if (r0 != r1) goto L37
            m23 r0 = r8.a()     // Catch: java.lang.AssertionError -> L46
            r6.a = r0     // Catch: java.lang.AssertionError -> L46
            defpackage.AbstractC7864n23.a(r8)     // Catch: java.lang.AssertionError -> L46
        L37:
            r6 = -1
            return r6
        L3a:
            int r1 = r8.c     // Catch: java.lang.AssertionError -> L46
            int r1 = r1 + r0
            r8.c = r1     // Catch: java.lang.AssertionError -> L46
            long r1 = r6.g     // Catch: java.lang.AssertionError -> L46
            long r3 = (long) r0     // Catch: java.lang.AssertionError -> L46
            long r1 = r1 + r3
            r6.g = r1     // Catch: java.lang.AssertionError -> L46
            return r3
        L46:
            r6 = move-exception
            java.lang.Throwable r8 = r6.getCause()
            r0 = 0
            if (r8 == 0) goto L62
            java.lang.String r8 = r6.getMessage()
            if (r8 == 0) goto L5e
            java.lang.String r1 = "getsockname failed"
            int r8 = defpackage.AbstractC0719Fn3.a(r8, r1, r0, r0)
            if (r8 < 0) goto L5e
            r8 = r7
            goto L5f
        L5e:
            r8 = r0
        L5f:
            if (r8 == 0) goto L62
            goto L63
        L62:
            r7 = r0
        L63:
            if (r7 == 0) goto L6b
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r6)
            throw r7
        L6b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1102Im1.Z0(fD, long):long");
    }

    @Override // defpackage.InterfaceC7390lg3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final String toString() {
        return "source(" + this.a + ")";
    }
}
