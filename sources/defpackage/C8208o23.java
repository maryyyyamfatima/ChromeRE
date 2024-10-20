package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o23, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8208o23 extends C3804bE {
    public final transient byte[][] j;
    public final transient int[] k;

    public C8208o23(byte[][] bArr, int[] iArr) {
        super(C3804bE.i.a);
        this.j = bArr;
        this.k = iArr;
    }

    @Override // defpackage.C3804bE
    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.j;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.k;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.g = i3;
        return i3;
    }

    @Override // defpackage.C3804bE
    public final boolean f(int i, int i2, int i3, byte[] bArr) {
        AbstractC0087Ar1.e(bArr, "other");
        if (i < 0 || i > b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int a = Ws4.a(this, i);
        while (i < i4) {
            int[] iArr = this.k;
            int i5 = a == 0 ? 0 : iArr[a - 1];
            int i6 = iArr[a] - i5;
            byte[][] bArr2 = this.j;
            int i7 = iArr[bArr2.length + a];
            int min = Math.min(i4, i6 + i5) - i;
            if (!Xs4.a((i - i5) + i7, i2, min, bArr2[a], bArr)) {
                return false;
            }
            i2 += min;
            i += min;
            a++;
        }
        return true;
    }

    @Override // defpackage.C3804bE
    public final boolean g(C3804bE c3804bE, int i) {
        AbstractC0087Ar1.e(c3804bE, "other");
        if (b() - i < 0) {
            return false;
        }
        int i2 = i + 0;
        int a = Ws4.a(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int[] iArr = this.k;
            int i5 = a == 0 ? 0 : iArr[a - 1];
            int i6 = iArr[a] - i5;
            byte[][] bArr = this.j;
            int i7 = iArr[bArr.length + a];
            int min = Math.min(i2, i6 + i5) - i3;
            if (!c3804bE.f(i4, (i3 - i5) + i7, min, bArr[a])) {
                return false;
            }
            i4 += min;
            i3 += min;
            a++;
        }
        return true;
    }

    public final byte[] h() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.j;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.k;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            AbstractC6036hk.a(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.C3804bE
    public final String c() {
        return new C3804bE(h()).c();
    }

    @Override // defpackage.C3804bE
    public final String toString() {
        return new C3804bE(h()).toString();
    }

    @Override // defpackage.C3804bE
    public final byte[] d() {
        return h();
    }

    @Override // defpackage.C3804bE
    public final byte e(int i) {
        byte[][] bArr = this.j;
        int length = bArr.length - 1;
        int[] iArr = this.k;
        Xs4.b(iArr[length], i, 1L);
        int a = Ws4.a(this, i);
        return bArr[a][(i - (a == 0 ? 0 : iArr[a - 1])) + iArr[bArr.length + a]];
    }

    @Override // defpackage.C3804bE
    public final int b() {
        return this.k[this.j.length - 1];
    }

    @Override // defpackage.C3804bE
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C3804bE) {
                C3804bE c3804bE = (C3804bE) obj;
                if (c3804bE.b() != b() || !g(c3804bE, b())) {
                }
            }
            return false;
        }
        return true;
    }
}
