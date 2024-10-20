package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Hh4 extends RF0 implements Cloneable {
    public Float a = null;
    public Float g = null;
    public Float h = null;
    public Float i = null;
    public Float j = null;
    public Float k = null;
    public Float l = null;

    public Hh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Hh4 clone() {
        try {
            return (Hh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Float f = this.a;
        if (f != null) {
            gv.p(1, f.floatValue());
        }
        Float f2 = this.g;
        if (f2 != null) {
            gv.p(2, f2.floatValue());
        }
        Float f3 = this.h;
        if (f3 != null) {
            gv.p(3, f3.floatValue());
        }
        Float f4 = this.i;
        if (f4 != null) {
            gv.p(4, f4.floatValue());
        }
        Float f5 = this.j;
        if (f5 != null) {
            gv.p(5, f5.floatValue());
        }
        Float f6 = this.k;
        if (f6 != null) {
            gv.p(6, f6.floatValue());
        }
        Float f7 = this.l;
        if (f7 != null) {
            gv.p(7, f7.floatValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Float f = this.a;
        if (f != null) {
            f.floatValue();
            computeSerializedSize += GV.c(1);
        }
        Float f2 = this.g;
        if (f2 != null) {
            f2.floatValue();
            computeSerializedSize += GV.c(2);
        }
        Float f3 = this.h;
        if (f3 != null) {
            f3.floatValue();
            computeSerializedSize += GV.c(3);
        }
        Float f4 = this.i;
        if (f4 != null) {
            f4.floatValue();
            computeSerializedSize += GV.c(4);
        }
        Float f5 = this.j;
        if (f5 != null) {
            f5.floatValue();
            computeSerializedSize += GV.c(5);
        }
        Float f6 = this.k;
        if (f6 != null) {
            f6.floatValue();
            computeSerializedSize += GV.c(6);
        }
        Float f7 = this.l;
        if (f7 == null) {
            return computeSerializedSize;
        }
        f7.floatValue();
        return computeSerializedSize + GV.c(7);
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 13) {
                this.a = Float.valueOf(c12129zV.e());
            } else if (m == 21) {
                this.g = Float.valueOf(c12129zV.e());
            } else if (m == 29) {
                this.h = Float.valueOf(c12129zV.e());
            } else if (m == 37) {
                this.i = Float.valueOf(c12129zV.e());
            } else if (m == 45) {
                this.j = Float.valueOf(c12129zV.e());
            } else if (m == 53) {
                this.k = Float.valueOf(c12129zV.e());
            } else if (m != 61) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.l = Float.valueOf(c12129zV.e());
            }
        }
        return this;
    }
}
