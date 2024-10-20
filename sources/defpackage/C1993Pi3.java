package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pi3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1993Pi3 implements InterfaceC4597dZ0 {
    public int[] a;
    public final C4253cZ0 c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public int[] j;
    public int k;
    public C9064qZ0 l;
    public Bitmap m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public Boolean s;
    public final int[] b = new int[256];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public C1993Pi3(C4253cZ0 c4253cZ0, C9064qZ0 c9064qZ0, ByteBuffer byteBuffer, int i) {
        byte[] bArr;
        int[] iArr;
        this.c = c4253cZ0;
        this.l = new C9064qZ0();
        synchronized (this) {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int highestOneBit = Integer.highestOneBit(i);
            this.o = 0;
            this.l = c9064qZ0;
            this.k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.d.order(ByteOrder.LITTLE_ENDIAN);
            this.n = false;
            Iterator it = c9064qZ0.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C7002kZ0) it.next()).g == 3) {
                    this.n = true;
                    break;
                }
            }
            this.p = highestOneBit;
            int i2 = c9064qZ0.f;
            this.r = i2 / highestOneBit;
            int i3 = c9064qZ0.g;
            this.q = i3 / highestOneBit;
            int i4 = i2 * i3;
            C3492aK1 c3492aK1 = this.c.b;
            if (c3492aK1 == null) {
                bArr = new byte[i4];
            } else {
                bArr = (byte[]) c3492aK1.c(byte[].class, i4);
            }
            this.i = bArr;
            C4253cZ0 c4253cZ02 = this.c;
            int i5 = this.r * this.q;
            C3492aK1 c3492aK12 = c4253cZ02.b;
            if (c3492aK12 == null) {
                iArr = new int[i5];
            } else {
                iArr = (int[]) c3492aK12.c(int[].class, i5);
            }
            this.j = iArr;
        }
    }

    public final synchronized Bitmap b() {
        if (this.l.c <= 0 || this.k < 0) {
            if (Log.isLoggable("Pi3", 3)) {
                int i = this.l.c;
            }
            this.o = 1;
        }
        int i2 = this.o;
        if (i2 != 1 && i2 != 2) {
            this.o = 0;
            if (this.e == null) {
                C3492aK1 c3492aK1 = this.c.b;
                this.e = c3492aK1 == null ? new byte[255] : (byte[]) c3492aK1.c(byte[].class, 255);
            }
            C7002kZ0 c7002kZ0 = (C7002kZ0) this.l.e.get(this.k);
            int i3 = this.k - 1;
            C7002kZ0 c7002kZ02 = i3 >= 0 ? (C7002kZ0) this.l.e.get(i3) : null;
            int[] iArr = c7002kZ0.k;
            if (iArr == null) {
                iArr = this.l.a;
            }
            this.a = iArr;
            if (iArr == null) {
                this.o = 1;
                return null;
            }
            if (c7002kZ0.f) {
                System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                int[] iArr2 = this.b;
                this.a = iArr2;
                iArr2[c7002kZ0.h] = 0;
                if (c7002kZ0.g == 2 && this.k == 0) {
                    this.s = Boolean.TRUE;
                }
            }
            return d(c7002kZ0, c7002kZ02);
        }
        return null;
    }

    public final void c(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            String valueOf = String.valueOf(config);
            String valueOf2 = String.valueOf(Bitmap.Config.ARGB_8888);
            String valueOf3 = String.valueOf(Bitmap.Config.RGB_565);
            StringBuilder a = AbstractC10975w63.a("Unsupported format: ", valueOf, ", must be one of ", valueOf2, " or ");
            a.append(valueOf3);
            throw new IllegalArgumentException(a.toString());
        }
        this.t = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:            if (r3.j == r36.h) goto L26;     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap d(defpackage.C7002kZ0 r36, defpackage.C7002kZ0 r37) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1993Pi3.d(kZ0, kZ0):android.graphics.Bitmap");
    }

    public final Bitmap a() {
        Boolean bool = this.s;
        Bitmap a = this.c.a.a(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        a.setHasAlpha(true);
        return a;
    }
}
