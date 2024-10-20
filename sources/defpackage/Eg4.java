package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Eg4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Integer g = null;
    public Long h = null;
    public Long i = null;
    public Long j = null;
    public Integer k = null;

    public Eg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (Eg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (Eg4) a();
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
        Integer num2 = this.g;
        if (num2 != null) {
            gv.r(2, num2.intValue());
        }
        Long l = this.h;
        if (l != null) {
            gv.s(3, l.longValue());
        }
        Long l2 = this.i;
        if (l2 != null) {
            gv.s(4, l2.longValue());
        }
        Long l3 = this.j;
        if (l3 != null) {
            gv.s(5, l3.longValue());
        }
        Integer num3 = this.k;
        if (num3 != null) {
            gv.r(6, num3.intValue());
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
        Integer num2 = this.g;
        if (num2 != null) {
            computeSerializedSize += GV.d(2, num2.intValue());
        }
        Long l = this.h;
        if (l != null) {
            computeSerializedSize += GV.e(3, l.longValue());
        }
        Long l2 = this.i;
        if (l2 != null) {
            computeSerializedSize += GV.e(4, l2.longValue());
        }
        Long l3 = this.j;
        if (l3 != null) {
            computeSerializedSize += GV.e(5, l3.longValue());
        }
        Integer num3 = this.k;
        return num3 != null ? computeSerializedSize + GV.d(6, num3.intValue()) : computeSerializedSize;
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
            } else if (m == 16) {
                this.g = Integer.valueOf(c12129zV.j());
            } else if (m == 24) {
                this.h = Long.valueOf(c12129zV.k());
            } else if (m == 32) {
                this.i = Long.valueOf(c12129zV.k());
            } else if (m == 40) {
                this.j = Long.valueOf(c12129zV.k());
            } else if (m != 48) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.k = Integer.valueOf(c12129zV.j());
            }
        }
        return this;
    }
}
