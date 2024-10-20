package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PD extends InputStream {
    public final ByteBuffer a;
    public int g = -1;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public PD(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.remaining();
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.g = this.a.position();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, available());
        byteBuffer.get(bArr, i, min);
        return min;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.g;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.a.position(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.a;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long min = Math.min(j, available());
        byteBuffer.position((int) (byteBuffer.position() + min));
        return min;
    }
}
