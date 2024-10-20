package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Gh4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Fh4[] g;

    public Gh4() {
        if (Fh4.o == null) {
            synchronized (AbstractC3071Xq1.a) {
                if (Fh4.o == null) {
                    Fh4.o = new Fh4[0];
                }
            }
        }
        this.g = Fh4.o;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Gh4 clone() {
        try {
            Gh4 gh4 = (Gh4) a();
            Fh4[] fh4Arr = this.g;
            if (fh4Arr != null && fh4Arr.length > 0) {
                gh4.g = new Fh4[fh4Arr.length];
                int i = 0;
                while (true) {
                    Fh4[] fh4Arr2 = this.g;
                    if (i >= fh4Arr2.length) {
                        break;
                    }
                    Fh4 fh4 = fh4Arr2[i];
                    if (fh4 != null) {
                        gh4.g[i] = fh4.clone();
                    }
                    i++;
                }
            }
            return gh4;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Integer num = this.a;
        if (num != null) {
            gv.r(1, num.intValue());
        }
        Fh4[] fh4Arr = this.g;
        if (fh4Arr != null && fh4Arr.length > 0) {
            int i = 0;
            while (true) {
                Fh4[] fh4Arr2 = this.g;
                if (i >= fh4Arr2.length) {
                    break;
                }
                Fh4 fh4 = fh4Arr2[i];
                if (fh4 != null) {
                    gv.t(2, fh4);
                }
                i++;
            }
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Integer num = this.a;
        if (num != null) {
            computeSerializedSize += GV.d(1, num.intValue());
        }
        Fh4[] fh4Arr = this.g;
        if (fh4Arr != null && fh4Arr.length > 0) {
            int i = 0;
            while (true) {
                Fh4[] fh4Arr2 = this.g;
                if (i >= fh4Arr2.length) {
                    break;
                }
                Fh4 fh4 = fh4Arr2[i];
                if (fh4 != null) {
                    computeSerializedSize += GV.f(2, fh4);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 8) {
                this.a = Integer.valueOf(c12129zV.j());
            } else if (m != 18) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                int a = AbstractC11226wq4.a(c12129zV, 18);
                Fh4[] fh4Arr = this.g;
                int length = fh4Arr == null ? 0 : fh4Arr.length;
                int i = a + length;
                Fh4[] fh4Arr2 = new Fh4[i];
                if (length != 0) {
                    System.arraycopy(fh4Arr, 0, fh4Arr2, 0, length);
                }
                while (length < i - 1) {
                    Fh4 fh4 = new Fh4();
                    fh4Arr2[length] = fh4;
                    c12129zV.f(fh4);
                    c12129zV.m();
                    length++;
                }
                Fh4 fh42 = new Fh4();
                fh4Arr2[length] = fh42;
                c12129zV.f(fh42);
                this.g = fh4Arr2;
            }
        }
        return this;
    }
}
