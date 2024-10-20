package defpackage;

import com.google.protobuf.MessageLite;
import java.io.OutputStream;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JV extends KV {
    public final byte[] c;
    public final int d;
    public int e;
    public int f;
    public final OutputStream g;

    public JV(int i, OutputStream outputStream) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.c = new byte[max];
        this.d = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.g = outputStream;
    }

    public final void V(int i, int i2) {
        W((i << 3) | i2);
    }

    public final void W(int i) {
        boolean z = KV.b;
        byte[] bArr = this.c;
        if (z) {
            long j = this.e;
            while ((i & (-128)) != 0) {
                int i2 = this.e;
                this.e = i2 + 1;
                Q14.q(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            int i3 = this.e;
            this.e = i3 + 1;
            Q14.q(bArr, i3, (byte) i);
            this.f += (int) (this.e - j);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.e;
            this.e = i4 + 1;
            bArr[i4] = (byte) ((i & 127) | 128);
            this.f++;
            i >>>= 7;
        }
        int i5 = this.e;
        this.e = i5 + 1;
        bArr[i5] = (byte) i;
        this.f++;
    }

    public final void X(long j) {
        boolean z = KV.b;
        byte[] bArr = this.c;
        if (z) {
            long j2 = this.e;
            while ((j & (-128)) != 0) {
                int i = this.e;
                this.e = i + 1;
                Q14.q(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i2 = this.e;
            this.e = i2 + 1;
            Q14.q(bArr, i2, (byte) j);
            this.f += (int) (this.e - j2);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.e;
            this.e = i3 + 1;
            bArr[i3] = (byte) ((((int) j) & 127) | 128);
            this.f++;
            j >>>= 7;
        }
        int i4 = this.e;
        this.e = i4 + 1;
        bArr[i4] = (byte) j;
        this.f++;
    }

    public final void T(int i) {
        int i2 = this.e;
        int i3 = i2 + 1;
        byte[] bArr = this.c;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.e = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.f += 4;
    }

    public final void U(long j) {
        int i = this.e;
        int i2 = i + 1;
        byte[] bArr = this.c;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.e = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.f += 8;
    }

    @Override // defpackage.KV
    public final void O(int i, int i2) {
        Q((i << 3) | i2);
    }

    @Override // defpackage.KV
    public final void G(int i, int i2) {
        a0(20);
        V(i, 0);
        if (i2 >= 0) {
            W(i2);
        } else {
            X(i2);
        }
    }

    @Override // defpackage.KV
    public final void P(int i, int i2) {
        a0(20);
        V(i, 0);
        W(i2);
    }

    @Override // defpackage.KV
    public final void C(int i, int i2) {
        a0(14);
        V(i, 5);
        T(i2);
    }

    @Override // defpackage.KV
    public final void R(int i, long j) {
        a0(20);
        V(i, 0);
        X(j);
    }

    @Override // defpackage.KV
    public final void E(int i, long j) {
        a0(18);
        V(i, 1);
        U(j);
    }

    @Override // defpackage.KV
    public final void y(int i, boolean z) {
        a0(11);
        V(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.e;
        this.e = i2 + 1;
        this.c[i2] = b;
        this.f++;
    }

    @Override // defpackage.KV
    public final void M(int i, String str) {
        O(i, 2);
        N(str);
    }

    @Override // defpackage.KV
    public final void A(int i, AbstractC4147cE abstractC4147cE) {
        O(i, 2);
        B(abstractC4147cE);
    }

    public final void c0(int i, byte[] bArr) {
        int length = bArr.length;
        O(i, 2);
        z(bArr, length);
    }

    @Override // defpackage.KV
    public final void B(AbstractC4147cE abstractC4147cE) {
        Q(abstractC4147cE.size());
        abstractC4147cE.r(this);
    }

    @Override // defpackage.KV
    public final void z(byte[] bArr, int i) {
        Q(i);
        b0(bArr, 0, i);
    }

    @Override // defpackage.KV
    public final void I(int i, MessageLite messageLite, QW2 qw2) {
        O(i, 2);
        AbstractC4754e0 abstractC4754e0 = (AbstractC4754e0) messageLite;
        abstractC4754e0.getClass();
        QX0 qx0 = (QX0) abstractC4754e0;
        int i2 = qx0.h;
        if (i2 == -1) {
            i2 = qw2.h(abstractC4754e0);
            qx0.h = i2;
        }
        Q(i2);
        qw2.d(messageLite, this.a);
    }

    @Override // defpackage.KV
    public final void K(MessageLite messageLite, int i) {
        O(1, 3);
        P(2, i);
        O(3, 2);
        J(messageLite);
        O(1, 4);
    }

    @Override // defpackage.KV
    public final void L(int i, AbstractC4147cE abstractC4147cE) {
        O(1, 3);
        P(2, i);
        A(3, abstractC4147cE);
        O(1, 4);
    }

    @Override // defpackage.KV
    public final void J(MessageLite messageLite) {
        Q(messageLite.e());
        messageLite.f(this);
    }

    @Override // defpackage.KV
    public final void x(byte b) {
        if (this.e == this.d) {
            Y();
        }
        int i = this.e;
        this.e = i + 1;
        this.c[i] = b;
        this.f++;
    }

    @Override // defpackage.KV
    public final void H(int i) {
        if (i >= 0) {
            Q(i);
        } else {
            S(i);
        }
    }

    @Override // defpackage.KV
    public final void Q(int i) {
        a0(5);
        W(i);
    }

    @Override // defpackage.KV
    public final void D(int i) {
        a0(4);
        T(i);
    }

    @Override // defpackage.KV
    public final void S(long j) {
        a0(10);
        X(j);
    }

    @Override // defpackage.KV
    public final void F(long j) {
        a0(8);
        U(j);
    }

    @Override // defpackage.KV
    public final void N(String str) {
        int c;
        try {
            int length = str.length() * 3;
            int u = KV.u(length);
            int i = u + length;
            int i2 = this.d;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int b = AbstractC7551m74.b(str, bArr, 0, length);
                Q(b);
                b0(bArr, 0, b);
                return;
            }
            if (i > i2 - this.e) {
                Y();
            }
            int u2 = KV.u(str.length());
            int i3 = this.e;
            byte[] bArr2 = this.c;
            try {
                try {
                    if (u2 == u) {
                        int i4 = i3 + u2;
                        this.e = i4;
                        int b2 = AbstractC7551m74.b(str, bArr2, i4, i2 - i4);
                        this.e = i3;
                        c = (b2 - i3) - u2;
                        W(c);
                        this.e = b2;
                    } else {
                        c = AbstractC7551m74.c(str);
                        W(c);
                        this.e = AbstractC7551m74.b(str, bArr2, this.e, c);
                    }
                    this.f += c;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new IV(e);
                }
            } catch (C7207l74 e2) {
                this.f -= this.e - i3;
                this.e = i3;
                throw e2;
            }
        } catch (C7207l74 unused) {
            Level level = Level.WARNING;
            throw null;
        }
    }

    public final void Z() {
        if (this.e > 0) {
            Y();
        }
    }

    public final void b0(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        int i4 = this.d;
        int i5 = i4 - i3;
        byte[] bArr2 = this.c;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.e += i2;
            this.f += i2;
            return;
        }
        int i6 = i4 - i3;
        System.arraycopy(bArr, i, bArr2, i3, i6);
        int i7 = i + i6;
        int i8 = i2 - i6;
        this.e = i4;
        this.f += i6;
        Y();
        if (i8 <= i4) {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.e = i8;
        } else {
            this.g.write(bArr, i7, i8);
        }
        this.f += i8;
    }

    @Override // defpackage.SD
    public final void a(byte[] bArr, int i, int i2) {
        b0(bArr, i, i2);
    }

    public final void a0(int i) {
        if (this.d - this.e < i) {
            Y();
        }
    }

    public final void Y() {
        this.g.write(this.c, 0, this.e);
        this.e = 0;
    }
}
