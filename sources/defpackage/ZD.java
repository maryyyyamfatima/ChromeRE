package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ZD extends YD {
    public final byte[] i;

    public int t() {
        return 0;
    }

    public ZD(byte[] bArr) {
        bArr.getClass();
        this.i = bArr;
    }

    @Override // defpackage.AbstractC4147cE
    public byte a(int i) {
        return this.i[i];
    }

    @Override // defpackage.AbstractC4147cE
    public byte k(int i) {
        return this.i[i];
    }

    @Override // defpackage.AbstractC4147cE
    public int size() {
        return this.i.length;
    }

    @Override // defpackage.AbstractC4147cE
    public final AbstractC4147cE o(int i) {
        int b = AbstractC4147cE.b(0, i, size());
        if (b == 0) {
            return AbstractC4147cE.g;
        }
        return new XD(this.i, t() + 0, b);
    }

    @Override // defpackage.AbstractC4147cE
    public void g(int i, byte[] bArr) {
        System.arraycopy(this.i, 0, bArr, 0, i);
    }

    public final ByteBuffer s() {
        return ByteBuffer.wrap(this.i, t(), size()).asReadOnlyBuffer();
    }

    @Override // defpackage.AbstractC4147cE
    public final void r(SD sd) {
        sd.a(this.i, t(), size());
    }

    @Override // defpackage.AbstractC4147cE
    public final String q(Charset charset) {
        return new String(this.i, t(), size(), charset);
    }

    @Override // defpackage.AbstractC4147cE
    public final boolean l() {
        int t = t();
        return AbstractC7551m74.f(this.i, t, size() + t);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4147cE) || size() != ((AbstractC4147cE) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof ZD) {
            ZD zd = (ZD) obj;
            int i = this.a;
            int i2 = zd.a;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size > zd.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (0 + size > zd.size()) {
                throw new IllegalArgumentException(AbstractC0800Ge.a("Ran off end of other: 0, ", size, ", ", zd.size()));
            }
            int t = t() + size;
            int t2 = t();
            int t3 = zd.t() + 0;
            while (t2 < t) {
                if (this.i[t2] != zd.i[t3]) {
                    return false;
                }
                t2++;
                t3++;
            }
            return true;
        }
        return obj.equals(this);
    }

    @Override // defpackage.AbstractC4147cE
    public final int n(int i, int i2) {
        int t = t() + 0;
        Charset charset = AbstractC1507Lp1.a;
        for (int i3 = t; i3 < t + i2; i3++) {
            i = (i * 31) + this.i[i3];
        }
        return i;
    }

    @Override // defpackage.AbstractC4147cE
    public final DV m() {
        return DV.f(this.i, t(), size(), true);
    }
}
