package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WH2 extends InputStream {
    public final /* synthetic */ XH2 a;

    public WH2(XH2 xh2) {
        this.a = xh2;
    }

    @Override // java.io.InputStream
    public final int read() {
        XH2 xh2 = this.a;
        if (xh2.h) {
            throw new IOException("closed");
        }
        C5173fD c5173fD = xh2.g;
        if (c5173fD.g == 0 && xh2.a.Z0(c5173fD, 8192L) == -1) {
            return -1;
        }
        return xh2.g.f() & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        AbstractC0087Ar1.e(bArr, "data");
        XH2 xh2 = this.a;
        if (xh2.h) {
            throw new IOException("closed");
        }
        Xs4.b(bArr.length, i, i2);
        C5173fD c5173fD = xh2.g;
        if (c5173fD.g == 0 && xh2.a.Z0(c5173fD, 8192L) == -1) {
            return -1;
        }
        return xh2.g.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int available() {
        XH2 xh2 = this.a;
        if (xh2.h) {
            throw new IOException("closed");
        }
        return (int) Math.min(xh2.g.g, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final String toString() {
        return this.a + ".inputStream()";
    }
}
