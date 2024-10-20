package defpackage;

import com.google.protobuf.MessageLite;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HV extends KV {
    public final byte[] c;
    public final int d;
    public int e;

    public HV(byte[] bArr, int i) {
        int i2 = 0 + i;
        if ((0 | i | (bArr.length - i2)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.c = bArr;
        this.e = 0;
        this.d = i2;
    }

    @Override // defpackage.KV
    public final void O(int i, int i2) {
        Q((i << 3) | i2);
    }

    @Override // defpackage.KV
    public final void G(int i, int i2) {
        O(i, 0);
        H(i2);
    }

    @Override // defpackage.KV
    public final void P(int i, int i2) {
        O(i, 0);
        Q(i2);
    }

    @Override // defpackage.KV
    public final void C(int i, int i2) {
        O(i, 5);
        D(i2);
    }

    @Override // defpackage.KV
    public final void R(int i, long j) {
        O(i, 0);
        S(j);
    }

    @Override // defpackage.KV
    public final void E(int i, long j) {
        O(i, 1);
        F(j);
    }

    @Override // defpackage.KV
    public final void y(int i, boolean z) {
        O(i, 0);
        x(z ? (byte) 1 : (byte) 0);
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

    @Override // defpackage.KV
    public final void B(AbstractC4147cE abstractC4147cE) {
        Q(abstractC4147cE.size());
        abstractC4147cE.r(this);
    }

    @Override // defpackage.KV
    public final void z(byte[] bArr, int i) {
        Q(i);
        U(bArr, 0, i);
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
        try {
            byte[] bArr = this.c;
            int i = this.e;
            this.e = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new IV(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e);
        }
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
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.c;
            if (i2 == 0) {
                int i3 = this.e;
                this.e = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.e;
                    this.e = i4 + 1;
                    bArr[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new IV(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e);
                }
            }
            throw new IV(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e);
        }
    }

    @Override // defpackage.KV
    public final void D(int i) {
        try {
            byte[] bArr = this.c;
            int i2 = this.e;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.e = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new IV(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e);
        }
    }

    @Override // defpackage.KV
    public final void S(long j) {
        boolean z = KV.b;
        int i = this.d;
        byte[] bArr = this.c;
        if (z && i - this.e >= 10) {
            while ((j & (-128)) != 0) {
                int i2 = this.e;
                this.e = i2 + 1;
                Q14.q(bArr, i2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i3 = this.e;
            this.e = i3 + 1;
            Q14.q(bArr, i3, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i4 = this.e;
                this.e = i4 + 1;
                bArr[i4] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new IV(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(i), 1), e);
            }
        }
        int i5 = this.e;
        this.e = i5 + 1;
        bArr[i5] = (byte) j;
    }

    @Override // defpackage.KV
    public final void F(long j) {
        try {
            byte[] bArr = this.c;
            int i = this.e;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.e = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new IV(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e);
        }
    }

    public final void U(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new IV(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), Integer.valueOf(i2)), e);
        }
    }

    @Override // defpackage.SD
    public final void a(byte[] bArr, int i, int i2) {
        U(bArr, i, i2);
    }

    @Override // defpackage.KV
    public final void N(String str) {
        int i = this.e;
        try {
            int u = KV.u(str.length() * 3);
            int u2 = KV.u(str.length());
            int i2 = this.d;
            byte[] bArr = this.c;
            if (u2 == u) {
                int i3 = i + u2;
                this.e = i3;
                int b = AbstractC7551m74.b(str, bArr, i3, i2 - i3);
                this.e = i;
                Q((b - i) - u2);
                this.e = b;
                return;
            }
            Q(AbstractC7551m74.c(str));
            int i4 = this.e;
            this.e = AbstractC7551m74.b(str, bArr, i4, i2 - i4);
        } catch (IndexOutOfBoundsException e) {
            throw new IV(e);
        } catch (C7207l74 unused) {
            this.e = i;
            Level level = Level.WARNING;
            throw null;
        }
    }

    public final int T() {
        return this.d - this.e;
    }
}
