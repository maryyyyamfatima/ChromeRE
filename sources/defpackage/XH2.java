package defpackage;

import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XH2 implements InterfaceC5861hD {
    public final InterfaceC7390lg3 a;
    public final C5173fD g = new C5173fD();
    public boolean h;

    public XH2(C1102Im1 c1102Im1) {
        this.a = c1102Im1;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC0087Ar1.e(byteBuffer, "sink");
        C5173fD c5173fD = this.g;
        if (c5173fD.g == 0 && this.a.Z0(c5173fD, 8192L) == -1) {
            return -1;
        }
        return c5173fD.read(byteBuffer);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    @Override // defpackage.InterfaceC7390lg3
    public final long Z0(C5173fD c5173fD, long j) {
        AbstractC0087Ar1.e(c5173fD, "sink");
        if (!this.h) {
            C5173fD c5173fD2 = this.g;
            if (c5173fD2.g == 0 && this.a.Z0(c5173fD2, 8192L) == -1) {
                return -1L;
            }
            return c5173fD2.Z0(c5173fD, Math.min(8192L, c5173fD2.g));
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // defpackage.InterfaceC5861hD
    public final boolean a(long j) {
        C5173fD c5173fD;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(Pd4.a("byteCount < 0: ", j).toString());
        }
        if (!(!this.h)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            c5173fD = this.g;
            if (c5173fD.g >= j) {
                return true;
            }
        } while (this.a.Z0(c5173fD, 8192L) != -1);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:            return -1;     */
    @Override // defpackage.InterfaceC5861hD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int L(defpackage.C0413De2 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "options"
            defpackage.AbstractC0087Ar1.e(r8, r0)
            boolean r0 = r7.h
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L36
        Lb:
            fD r0 = r7.g
            int r2 = defpackage.Us4.b(r0, r8, r1)
            r3 = -2
            r4 = -1
            if (r2 == r3) goto L26
            if (r2 == r4) goto L24
            bE[] r8 = r8.a
            r8 = r8[r2]
            int r8 = r8.b()
            long r3 = (long) r8
            r0.r(r3)
            goto L35
        L24:
            r2 = r4
            goto L35
        L26:
            lg3 r2 = r7.a
            r5 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.Z0(r0, r5)
            r5 = -1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto Lb
            goto L24
        L35:
            return r2
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XH2.L(De2):int");
    }

    @Override // defpackage.InterfaceC5861hD
    public final long B0(C3804bE c3804bE) {
        AbstractC0087Ar1.e(c3804bE, "targetBytes");
        if (!(!this.h)) {
            throw new IllegalStateException("closed".toString());
        }
        long j = 0;
        while (true) {
            C5173fD c5173fD = this.g;
            long e = c5173fD.e(c3804bE, j);
            if (e != -1) {
                return e;
            }
            long j2 = c5173fD.g;
            if (this.a.Z0(c5173fD, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override // defpackage.InterfaceC7390lg3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.a.close();
        C5173fD c5173fD = this.g;
        c5173fD.r(c5173fD.g);
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }
}
