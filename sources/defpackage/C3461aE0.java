package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3461aE0 extends InputStream {
    public static final ArrayDeque h;
    public InputStream a;
    public IOException g;

    static {
        char[] cArr = AbstractC10296u74.a;
        h = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.a.read();
        } catch (IOException e) {
            this.g = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.a.read(bArr);
        } catch (IOException e) {
            this.g = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.a.read(bArr, i, i2);
        } catch (IOException e) {
            this.g = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        try {
            return this.a.skip(j);
        } catch (IOException e) {
            this.g = e;
            throw e;
        }
    }
}
