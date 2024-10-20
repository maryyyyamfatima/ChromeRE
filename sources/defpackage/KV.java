package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class KV extends SD {
    public static final boolean b = Q14.e;
    public LV a;

    public static int u(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int w(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public abstract void A(int i, AbstractC4147cE abstractC4147cE);

    public abstract void B(AbstractC4147cE abstractC4147cE);

    public abstract void C(int i, int i2);

    public abstract void D(int i);

    public abstract void E(int i, long j);

    public abstract void F(long j);

    public abstract void G(int i, int i2);

    public abstract void H(int i);

    public abstract void I(int i, MessageLite messageLite, QW2 qw2);

    public abstract void J(MessageLite messageLite);

    public abstract void K(MessageLite messageLite, int i);

    public abstract void L(int i, AbstractC4147cE abstractC4147cE);

    public abstract void M(int i, String str);

    public abstract void N(String str);

    public abstract void O(int i, int i2);

    public abstract void P(int i, int i2);

    public abstract void Q(int i);

    public abstract void R(int i, long j);

    public abstract void S(long j);

    public abstract void x(byte b2);

    public abstract void y(int i, boolean z);

    public abstract void z(byte[] bArr, int i);

    public static int j(int i, int i2) {
        return k(i2) + s(i);
    }

    public static int t(int i, int i2) {
        return u(i2) + s(i);
    }

    public static int o(int i, int i2) {
        return u((i2 >> 31) ^ (i2 << 1)) + s(i);
    }

    public static int f(int i) {
        return s(i) + 4;
    }

    public static int m(int i) {
        return s(i) + 4;
    }

    public static int l(int i, long j) {
        return w(j) + s(i);
    }

    public static int v(int i, long j) {
        return w(j) + s(i);
    }

    public static int p(int i, long j) {
        return w((j >> 63) ^ (j << 1)) + s(i);
    }

    public static int g(int i) {
        return s(i) + 8;
    }

    public static int n(int i) {
        return s(i) + 8;
    }

    public static int h(int i) {
        return s(i) + 4;
    }

    public static int d(int i) {
        return s(i) + 8;
    }

    public static int b(int i) {
        return s(i) + 1;
    }

    public static int e(int i, int i2) {
        return k(i2) + s(i);
    }

    public static int q(int i, String str) {
        return r(str) + s(i);
    }

    public static int c(int i, AbstractC4147cE abstractC4147cE) {
        int s = s(i);
        int size = abstractC4147cE.size();
        return u(size) + size + s;
    }

    public static int s(int i) {
        return u((i << 3) | 0);
    }

    public static int k(int i) {
        if (i >= 0) {
            return u(i);
        }
        return 10;
    }

    public static int r(String str) {
        int length;
        try {
            length = AbstractC7551m74.c(str);
        } catch (C7207l74 unused) {
            length = str.getBytes(AbstractC1507Lp1.a).length;
        }
        return u(length) + length;
    }

    public static int i(int i, MessageLite messageLite, QW2 qw2) {
        int s = s(i) * 2;
        AbstractC4754e0 abstractC4754e0 = (AbstractC4754e0) messageLite;
        abstractC4754e0.getClass();
        QX0 qx0 = (QX0) abstractC4754e0;
        int i2 = qx0.h;
        if (i2 == -1) {
            i2 = qw2.h(abstractC4754e0);
            qx0.h = i2;
        }
        return s + i2;
    }
}
