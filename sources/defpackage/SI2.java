package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SI2 extends FilterInputStream {
    public volatile byte[] a;
    public int g;
    public int h;
    public int i;
    public int j;
    public final C3492aK1 k;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public SI2(InputStream inputStream, C3492aK1 c3492aK1) {
        super(inputStream);
        this.i = -1;
        this.k = c3492aK1;
        this.a = (byte[]) c3492aK1.c(byte[].class, 65536);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.a == null || inputStream == null) {
            e();
            throw null;
        }
        return (this.g - this.j) + inputStream.available();
    }

    public static void e() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized void c() {
        if (this.a != null) {
            this.k.g(this.a);
            this.a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a != null) {
            this.k.g(this.a);
            this.a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final int b(InputStream inputStream, byte[] bArr) {
        int i = this.i;
        if (i != -1) {
            int i2 = this.j - i;
            int i3 = this.h;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.g == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.k.c(byte[].class, i3);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.a = bArr2;
                    this.k.g(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.j - this.i;
                this.j = i4;
                this.i = 0;
                this.g = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.j;
                if (read > 0) {
                    i5 += read;
                }
                this.g = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.i = -1;
            this.j = 0;
            this.g = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.h = Math.max(this.h, i);
        this.i = this.j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            e();
            throw null;
        }
        if (this.j >= this.g && b(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.a && (bArr = this.a) == null) {
            e();
            throw null;
        }
        int i = this.g;
        int i2 = this.j;
        if (i - i2 <= 0) {
            return -1;
        }
        this.j = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.a;
        if (bArr2 == null) {
            e();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            e();
            throw null;
        }
        int i5 = this.j;
        int i6 = this.g;
        if (i5 < i6) {
            int i7 = i6 - i5;
            if (i7 >= i2) {
                i7 = i2;
            }
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.j += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.i == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (b(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.a && (bArr2 = this.a) == null) {
                    e();
                    throw null;
                }
                int i8 = this.g;
                int i9 = this.j;
                i4 = i8 - i9;
                if (i4 >= i3) {
                    i4 = i3;
                }
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.j += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.i;
        if (-1 == i) {
            throw new RI2("Mark has been invalidated, pos: " + this.j + " markLimit: " + this.h);
        }
        this.j = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.a;
        if (bArr == null) {
            e();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            e();
            throw null;
        }
        int i = this.g;
        int i2 = this.j;
        if (i - i2 >= j) {
            this.j = (int) (i2 + j);
            return j;
        }
        long j2 = i - i2;
        this.j = i;
        if (this.i != -1 && j <= this.h) {
            if (b(inputStream, bArr) == -1) {
                return j2;
            }
            int i3 = this.g;
            int i4 = this.j;
            if (i3 - i4 >= j - j2) {
                this.j = (int) ((i4 + j) - j2);
                return j;
            }
            long j3 = (j2 + i3) - i4;
            this.j = i3;
            return j3;
        }
        long skip = inputStream.skip(j - j2);
        if (skip > 0) {
            this.i = -1;
        }
        return j2 + skip;
    }
}
