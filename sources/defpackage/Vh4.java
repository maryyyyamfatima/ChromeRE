package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Vh4 extends RF0 implements Cloneable {
    public static volatile Vh4[] k;
    public Integer a = null;
    public Long g = null;
    public Long h = null;
    public Long i = null;
    public Long j = null;

    public Vh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (Vh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (Vh4) a();
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
        Long l = this.g;
        if (l != null) {
            long longValue = l.longValue();
            gv.y(2, 0);
            gv.w(longValue);
        }
        Long l2 = this.h;
        if (l2 != null) {
            long longValue2 = l2.longValue();
            gv.y(3, 0);
            gv.w(longValue2);
        }
        Long l3 = this.i;
        if (l3 != null) {
            long longValue3 = l3.longValue();
            gv.y(4, 0);
            gv.w(longValue3);
        }
        Long l4 = this.j;
        if (l4 != null) {
            long longValue4 = l4.longValue();
            gv.y(5, 0);
            gv.w(longValue4);
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
        Long l = this.g;
        if (l != null) {
            computeSerializedSize += GV.j(2) + GV.h(l.longValue());
        }
        Long l2 = this.h;
        if (l2 != null) {
            computeSerializedSize += GV.j(3) + GV.h(l2.longValue());
        }
        Long l3 = this.i;
        if (l3 != null) {
            computeSerializedSize += GV.j(4) + GV.h(l3.longValue());
        }
        Long l4 = this.j;
        if (l4 == null) {
            return computeSerializedSize;
        }
        return computeSerializedSize + GV.j(5) + GV.h(l4.longValue());
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
                this.g = Long.valueOf(c12129zV.k());
            } else if (m == 24) {
                this.h = Long.valueOf(c12129zV.k());
            } else if (m == 32) {
                this.i = Long.valueOf(c12129zV.k());
            } else if (m == 40) {
                this.j = Long.valueOf(c12129zV.k());
            } else if (!super.storeUnknownField(c12129zV, m)) {
                break;
            }
        }
        return this;
    }
}
