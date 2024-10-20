package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XD extends ZD {
    public final int j;
    public final int k;

    @Override // defpackage.ZD, defpackage.AbstractC4147cE
    public final byte a(int i) {
        int i2 = this.k;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.i[this.j + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC9076qb1.a("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0800Ge.a("Index > length: ", i, ", ", i2));
    }

    public XD(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC4147cE.b(i, i + i2, bArr.length);
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.ZD, defpackage.AbstractC4147cE
    public final byte k(int i) {
        return this.i[this.j + i];
    }

    @Override // defpackage.ZD, defpackage.AbstractC4147cE
    public final int size() {
        return this.k;
    }

    @Override // defpackage.ZD
    public final int t() {
        return this.j;
    }

    @Override // defpackage.ZD, defpackage.AbstractC4147cE
    public final void g(int i, byte[] bArr) {
        System.arraycopy(this.i, this.j + 0, bArr, 0, i);
    }
}
