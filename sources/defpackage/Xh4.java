package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Xh4 extends RF0 implements Cloneable {
    public Wh4 a = null;
    public Vh4[] g;

    public Xh4() {
        if (Vh4.k == null) {
            synchronized (AbstractC3071Xq1.a) {
                if (Vh4.k == null) {
                    Vh4.k = new Vh4[0];
                }
            }
        }
        this.g = Vh4.k;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final Xh4 clone() {
        try {
            Xh4 xh4 = (Xh4) a();
            Wh4 wh4 = this.a;
            if (wh4 != null) {
                try {
                    xh4.a = (Wh4) wh4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            Vh4[] vh4Arr = this.g;
            if (vh4Arr != null && vh4Arr.length > 0) {
                xh4.g = new Vh4[vh4Arr.length];
                int i = 0;
                while (true) {
                    Vh4[] vh4Arr2 = this.g;
                    if (i >= vh4Arr2.length) {
                        break;
                    }
                    Vh4 vh4 = vh4Arr2[i];
                    if (vh4 != null) {
                        try {
                            xh4.g[i] = (Vh4) vh4.a();
                        } catch (CloneNotSupportedException e2) {
                            throw new AssertionError(e2);
                        }
                    }
                    i++;
                }
            }
            return xh4;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Wh4 wh4 = this.a;
        if (wh4 != null) {
            gv.t(1, wh4);
        }
        Vh4[] vh4Arr = this.g;
        if (vh4Arr != null && vh4Arr.length > 0) {
            int i = 0;
            while (true) {
                Vh4[] vh4Arr2 = this.g;
                if (i >= vh4Arr2.length) {
                    break;
                }
                Vh4 vh4 = vh4Arr2[i];
                if (vh4 != null) {
                    gv.t(2, vh4);
                }
                i++;
            }
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Wh4 wh4 = this.a;
        if (wh4 != null) {
            computeSerializedSize += GV.f(1, wh4);
        }
        Vh4[] vh4Arr = this.g;
        if (vh4Arr != null && vh4Arr.length > 0) {
            int i = 0;
            while (true) {
                Vh4[] vh4Arr2 = this.g;
                if (i >= vh4Arr2.length) {
                    break;
                }
                Vh4 vh4 = vh4Arr2[i];
                if (vh4 != null) {
                    computeSerializedSize += GV.f(2, vh4);
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
            if (m == 10) {
                if (this.a == null) {
                    this.a = new Wh4();
                }
                c12129zV.f(this.a);
            } else if (m != 18) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                int a = AbstractC11226wq4.a(c12129zV, 18);
                Vh4[] vh4Arr = this.g;
                int length = vh4Arr == null ? 0 : vh4Arr.length;
                int i = a + length;
                Vh4[] vh4Arr2 = new Vh4[i];
                if (length != 0) {
                    System.arraycopy(vh4Arr, 0, vh4Arr2, 0, length);
                }
                while (length < i - 1) {
                    Vh4 vh4 = new Vh4();
                    vh4Arr2[length] = vh4;
                    c12129zV.f(vh4);
                    c12129zV.m();
                    length++;
                }
                Vh4 vh42 = new Vh4();
                vh4Arr2[length] = vh42;
                c12129zV.f(vh42);
                this.g = vh4Arr2;
            }
        }
        return this;
    }
}
