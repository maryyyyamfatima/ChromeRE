package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ph4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8772ph4 extends RF0 implements Cloneable {
    public Ih4[] a;
    public Ih4 g;
    public Float h;

    public C8772ph4() {
        if (Ih4.h == null) {
            synchronized (AbstractC3071Xq1.a) {
                if (Ih4.h == null) {
                    Ih4.h = new Ih4[0];
                }
            }
        }
        this.a = Ih4.h;
        this.g = null;
        this.h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C8772ph4 clone() {
        try {
            C8772ph4 c8772ph4 = (C8772ph4) a();
            Ih4[] ih4Arr = this.a;
            if (ih4Arr != null && ih4Arr.length > 0) {
                c8772ph4.a = new Ih4[ih4Arr.length];
                int i = 0;
                while (true) {
                    Ih4[] ih4Arr2 = this.a;
                    if (i >= ih4Arr2.length) {
                        break;
                    }
                    Ih4 ih4 = ih4Arr2[i];
                    if (ih4 != null) {
                        c8772ph4.a[i] = ih4.clone();
                    }
                    i++;
                }
            }
            Ih4 ih42 = this.g;
            if (ih42 != null) {
                c8772ph4.g = ih42.clone();
            }
            return c8772ph4;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Ih4[] ih4Arr = this.a;
        if (ih4Arr != null && ih4Arr.length > 0) {
            int i = 0;
            while (true) {
                Ih4[] ih4Arr2 = this.a;
                if (i >= ih4Arr2.length) {
                    break;
                }
                Ih4 ih4 = ih4Arr2[i];
                if (ih4 != null) {
                    gv.t(1, ih4);
                }
                i++;
            }
        }
        Ih4 ih42 = this.g;
        if (ih42 != null) {
            gv.t(2, ih42);
        }
        Float f = this.h;
        if (f != null) {
            gv.p(3, f.floatValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Ih4[] ih4Arr = this.a;
        if (ih4Arr != null && ih4Arr.length > 0) {
            int i = 0;
            while (true) {
                Ih4[] ih4Arr2 = this.a;
                if (i >= ih4Arr2.length) {
                    break;
                }
                Ih4 ih4 = ih4Arr2[i];
                if (ih4 != null) {
                    computeSerializedSize += GV.f(1, ih4);
                }
                i++;
            }
        }
        Ih4 ih42 = this.g;
        if (ih42 != null) {
            computeSerializedSize += GV.f(2, ih42);
        }
        Float f = this.h;
        if (f == null) {
            return computeSerializedSize;
        }
        f.floatValue();
        return computeSerializedSize + GV.c(3);
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 10) {
                int a = AbstractC11226wq4.a(c12129zV, 10);
                Ih4[] ih4Arr = this.a;
                int length = ih4Arr == null ? 0 : ih4Arr.length;
                int i = a + length;
                Ih4[] ih4Arr2 = new Ih4[i];
                if (length != 0) {
                    System.arraycopy(ih4Arr, 0, ih4Arr2, 0, length);
                }
                while (length < i - 1) {
                    Ih4 ih4 = new Ih4();
                    ih4Arr2[length] = ih4;
                    c12129zV.f(ih4);
                    c12129zV.m();
                    length++;
                }
                Ih4 ih42 = new Ih4();
                ih4Arr2[length] = ih42;
                c12129zV.f(ih42);
                this.a = ih4Arr2;
            } else if (m == 18) {
                if (this.g == null) {
                    this.g = new Ih4();
                }
                c12129zV.f(this.g);
            } else if (m != 29) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.h = Float.valueOf(c12129zV.e());
            }
        }
        return this;
    }
}
