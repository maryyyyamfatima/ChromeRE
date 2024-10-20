package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4147cE implements Iterable, Serializable {
    public static final ZD g = new ZD(AbstractC1507Lp1.b);
    public static final C3460aE h;
    public int a = 0;

    public abstract byte a(int i);

    public abstract void g(int i, byte[] bArr);

    public abstract byte k(int i);

    public abstract boolean l();

    public abstract DV m();

    public abstract int n(int i, int i2);

    public abstract AbstractC4147cE o(int i);

    public abstract String q(Charset charset);

    public abstract void r(SD sd);

    public abstract int size();

    static {
        Class cls = U8.a;
        h = new C3460aE();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new VD(this);
    }

    public static ZD f(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        h.getClass();
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new ZD(bArr2);
    }

    public static ZD d(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public final byte[] p() {
        int size = size();
        if (size == 0) {
            return AbstractC1507Lp1.b;
        }
        byte[] bArr = new byte[size];
        g(size, bArr);
        return bArr;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int size = size();
            i = n(size, size);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC9307rF1.a("Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC0800Ge.a("Beginning index larger than ending index: ", i, ", ", i2));
        }
        throw new IndexOutOfBoundsException(AbstractC0800Ge.a("End index: ", i2, " >= ", i3));
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? XH3.a(this) : AbstractC7848n0.a(XH3.a(o(47)), "...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
