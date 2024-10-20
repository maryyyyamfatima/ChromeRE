package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kn3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7088kn3 implements Closeable {
    public final InputStream a;
    public final Charset g;
    public byte[] h;
    public int i;
    public int j;

    public C7088kn3(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(AbstractC10982w74.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.a = fileInputStream;
        this.g = charset;
        this.h = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (this.h != null) {
                this.h = null;
                this.a.close();
            }
        }
    }

    public final String b() {
        int i;
        synchronized (this.a) {
            byte[] bArr = this.h;
            if (bArr == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.i >= this.j) {
                int read = this.a.read(bArr, 0, bArr.length);
                if (read == -1) {
                    throw new EOFException();
                }
                this.i = 0;
                this.j = read;
            }
            for (int i2 = this.i; i2 != this.j; i2++) {
                byte[] bArr2 = this.h;
                if (bArr2[i2] == 10) {
                    int i3 = this.i;
                    if (i2 != i3) {
                        i = i2 - 1;
                        if (bArr2[i] == 13) {
                            String str = new String(bArr2, i3, i - i3, this.g.name());
                            this.i = i2 + 1;
                            return str;
                        }
                    }
                    i = i2;
                    String str2 = new String(bArr2, i3, i - i3, this.g.name());
                    this.i = i2 + 1;
                    return str2;
                }
            }
            C6744jn3 c6744jn3 = new C6744jn3(this, (this.j - this.i) + 80);
            while (true) {
                byte[] bArr3 = this.h;
                int i4 = this.i;
                c6744jn3.write(bArr3, i4, this.j - i4);
                this.j = -1;
                byte[] bArr4 = this.h;
                int read2 = this.a.read(bArr4, 0, bArr4.length);
                if (read2 == -1) {
                    throw new EOFException();
                }
                this.i = 0;
                this.j = read2;
                for (int i5 = 0; i5 != this.j; i5++) {
                    byte[] bArr5 = this.h;
                    if (bArr5[i5] == 10) {
                        int i6 = this.i;
                        if (i5 != i6) {
                            c6744jn3.write(bArr5, i6, i5 - i6);
                        }
                        this.i = i5 + 1;
                        return c6744jn3.toString();
                    }
                }
            }
        }
    }
}
