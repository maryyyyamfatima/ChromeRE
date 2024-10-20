package defpackage;

import java.io.FilterInputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4533dM1 extends FilterInputStream {
    public int a;

    public C4533dM1(C3461aE0 c3461aE0) {
        super(c3461aE0);
        this.a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (b(1L) == -1) {
            return -1;
        }
        int read = super.read();
        c(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int b = (int) b(i2);
        if (b == -1) {
            return -1;
        }
        int read = super.read(bArr, i, b);
        c(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long b = b(j);
        if (b == -1) {
            return 0L;
        }
        long skip = super.skip(b);
        c(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.a;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public final long b(long j) {
        int i = this.a;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    public final void c(long j) {
        int i = this.a;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.a = (int) (i - j);
    }
}
