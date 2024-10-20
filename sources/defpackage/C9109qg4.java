package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qg4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9109qg4 extends RF0 implements Cloneable {
    public Double a = null;
    public Double g = null;
    public Double h = null;

    public C9109qg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C9109qg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C9109qg4) a();
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
        if (d3 == null) {
            return computeSerializedSize;
        }
        d3.doubleValue();
        return computeSerializedSize + GV.b(3);
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
            } else if (m != 25) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.h = Double.valueOf(c12129zV.d());
            }
        }
        return this;
    }
}
