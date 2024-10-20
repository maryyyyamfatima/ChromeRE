package defpackage;

import java.io.OutputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3704aw1 {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int k;
    public int l;
    public int m;
    public int q;
    public final int[] g = new int[5003];
    public final int[] h = new int[5003];
    public int i = 0;
    public boolean j = false;
    public int n = 0;
    public int o = 0;
    public final int[] p = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    public final byte[] r = new byte[256];

    public C3704aw1(int i, int i2, int i3, byte[] bArr) {
        this.a = bArr;
        this.b = Math.max(2, i3);
    }

    public final void a(int i, OutputStream outputStream) {
        byte[] bArr;
        int i2 = this.n;
        int i3 = this.o;
        int i4 = i2 & this.p[i3];
        this.n = i4;
        if (i3 > 0) {
            this.n = i4 | (i << i3);
        } else {
            this.n = i;
        }
        this.o = i3 + this.e;
        while (true) {
            int i5 = this.o;
            bArr = this.r;
            if (i5 < 8) {
                break;
            }
            byte b = (byte) (this.n & 255);
            int i6 = this.q;
            int i7 = i6 + 1;
            this.q = i7;
            bArr[i6] = b;
            if (i7 >= 254 && i7 > 0) {
                outputStream.write(i7);
                outputStream.write(bArr, 0, this.q);
                this.q = 0;
            }
            this.n >>= 8;
            this.o -= 8;
        }
        if (this.i > this.f || this.j) {
            if (this.j) {
                int i8 = this.k;
                this.e = i8;
                this.f = (1 << i8) - 1;
                this.j = false;
            } else {
                int i9 = this.e + 1;
                this.e = i9;
                if (i9 == 12) {
                    this.f = 4096;
                } else {
                    this.f = (1 << i9) - 1;
                }
            }
        }
        if (i == this.m) {
            while (this.o > 0) {
                byte b2 = (byte) (this.n & 255);
                int i10 = this.q;
                int i11 = i10 + 1;
                this.q = i11;
                bArr[i10] = b2;
                if (i11 >= 254 && i11 > 0) {
                    outputStream.write(i11);
                    outputStream.write(bArr, 0, this.q);
                    this.q = 0;
                }
                this.n >>= 8;
                this.o -= 8;
            }
            int i12 = this.q;
            if (i12 > 0) {
                outputStream.write(i12);
                outputStream.write(bArr, 0, this.q);
                this.q = 0;
            }
        }
    }
}
