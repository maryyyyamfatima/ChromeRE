package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5517gD extends OutputStream {
    public final OutputStream a;
    public byte[] g;
    public final C3492aK1 h;
    public int i;

    public C5517gD(FileOutputStream fileOutputStream, C3492aK1 c3492aK1) {
        this.a = fileOutputStream;
        this.h = c3492aK1;
        this.g = (byte[]) c3492aK1.c(byte[].class, 65536);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.g;
        int i2 = this.i;
        int i3 = i2 + 1;
        this.i = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.a.write(bArr, 0, i3);
        this.i = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.i;
            OutputStream outputStream = this.a;
            if (i6 == 0 && i4 >= this.g.length) {
                outputStream.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.g.length - i6);
            System.arraycopy(bArr, i5, this.g, this.i, min);
            int i7 = this.i + min;
            this.i = i7;
            i3 += min;
            byte[] bArr2 = this.g;
            if (i7 == bArr2.length && i7 > 0) {
                outputStream.write(bArr2, 0, i7);
                this.i = 0;
            }
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i = this.i;
        OutputStream outputStream = this.a;
        if (i > 0) {
            outputStream.write(this.g, 0, i);
            this.i = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OutputStream outputStream = this.a;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.g;
            if (bArr != null) {
                this.h.g(bArr);
                this.g = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }
}
