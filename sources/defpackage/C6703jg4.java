package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jg4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6703jg4 extends RF0 implements Cloneable {
    public Double a = null;
    public Double g = null;
    public Double h = null;
    public Double i = null;
    public Double j = null;
    public Double k = null;
    public Double l = null;

    public C6703jg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C6703jg4 clone() {
        try {
            return (C6703jg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Double d = this.a;
        if (d != null) {
            gv.o(d.doubleValue(), 1);
        }
        Double d2 = this.g;
        if (d2 != null) {
            gv.o(d2.doubleValue(), 2);
        }
        Double d3 = this.h;
        if (d3 != null) {
            gv.o(d3.doubleValue(), 3);
        }
        Double d4 = this.i;
        if (d4 != null) {
            gv.o(d4.doubleValue(), 4);
        }
        Double d5 = this.j;
        if (d5 != null) {
            gv.o(d5.doubleValue(), 5);
        }
        Double d6 = this.k;
        if (d6 != null) {
            gv.o(d6.doubleValue(), 6);
        }
        Double d7 = this.l;
        if (d7 != null) {
            gv.o(d7.doubleValue(), 7);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Double d = this.a;
        if (d != null) {
            d.doubleValue();
            computeSerializedSize += GV.b(1);
        }
        Double d2 = this.g;
        if (d2 != null) {
            d2.doubleValue();
            computeSerializedSize += GV.b(2);
        }
        Double d3 = this.h;
        if (d3 != null) {
            d3.doubleValue();
            computeSerializedSize += GV.b(3);
        }
        Double d4 = this.i;
        if (d4 != null) {
            d4.doubleValue();
            computeSerializedSize += GV.b(4);
        }
        Double d5 = this.j;
        if (d5 != null) {
            d5.doubleValue();
            computeSerializedSize += GV.b(5);
        }
        Double d6 = this.k;
        if (d6 != null) {
            d6.doubleValue();
            computeSerializedSize += GV.b(6);
        }
        Double d7 = this.l;
        if (d7 == null) {
            return computeSerializedSize;
        }
        d7.doubleValue();
        return computeSerializedSize + GV.b(7);
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 9) {
                this.a = Double.valueOf(c12129zV.d());
            } else if (m == 17) {
                this.g = Double.valueOf(c12129zV.d());
            } else if (m == 25) {
                this.h = Double.valueOf(c12129zV.d());
            } else if (m == 33) {
                this.i = Double.valueOf(c12129zV.d());
            } else if (m == 41) {
                this.j = Double.valueOf(c12129zV.d());
            } else if (m == 49) {
                this.k = Double.valueOf(c12129zV.d());
            } else if (m != 57) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.l = Double.valueOf(c12129zV.d());
            }
        }
        return this;
    }
}
