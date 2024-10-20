package defpackage;

import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ev, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5070ev {
    public static final byte[] k = new byte[768];
    public final byte[] a;
    public int b;
    public int c;
    public final int d;
    public boolean e;
    public boolean f;
    public final int[] g = new int[256];
    public int h;
    public int i;
    public int j;

    public C5070ev(byte[] bArr) {
        this.a = bArr;
        C4726dv c4726dv = new C4726dv(bArr);
        c4726dv.skip(0);
        try {
            a(c4726dv);
            this.d = c4726dv.getPosition();
        } catch (IOException unused) {
            this.f = true;
        }
        try {
            c4726dv.close();
        } catch (IOException unused2) {
        }
    }

    public final void a(C4726dv c4726dv) {
        int i = 0;
        if (!(((c4726dv.read() == 71) && c4726dv.read() == 73) && c4726dv.read() == 70)) {
            this.f = true;
            return;
        }
        c4726dv.skip(3L);
        this.b = c4726dv.read() | (c4726dv.read() << 8);
        this.c = c4726dv.read() | (c4726dv.read() << 8);
        int read = c4726dv.read();
        this.e = (read & 128) != 0;
        this.h = 2 << (read & 7);
        this.j = c4726dv.read();
        c4726dv.skip(1L);
        if (!this.e || this.f) {
            return;
        }
        int[] iArr = this.g;
        int i2 = this.h;
        byte[] bArr = k;
        synchronized (bArr) {
            int i3 = i2 * 3;
            if (c4726dv.read(bArr, 0, i3) >= i3) {
                int i4 = 0;
                while (i < i2) {
                    byte[] bArr2 = k;
                    int i5 = i4 + 1;
                    int i6 = i5 + 1;
                    iArr[i] = ((bArr2[i4] & 255) << 16) | (-16777216) | ((bArr2[i5] & 255) << 8) | (bArr2[i6] & 255);
                    i++;
                    i4 = i6 + 1;
                }
            }
        }
        this.i = this.g[this.j];
    }
}
