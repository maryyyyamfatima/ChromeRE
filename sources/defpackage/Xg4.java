package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Xg4 extends RF0 implements Cloneable {
    public Long a = null;
    public Integer g = null;
    public Integer h = null;
    public Integer i = null;
    public Integer j = null;

    public Xg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (Xg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (Xg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Long l = this.a;
        if (l != null) {
            gv.s(1, l.longValue());
        }
        Integer num = this.g;
        if (num != null) {
            gv.r(2, num.intValue());
        }
        Integer num2 = this.h;
        if (num2 != null) {
            gv.r(3, num2.intValue());
        }
        Integer num3 = this.i;
        if (num3 != null) {
            gv.r(4, num3.intValue());
        }
        Integer num4 = this.j;
        if (num4 != null) {
            gv.r(5, num4.intValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Long l = this.a;
        if (l != null) {
            computeSerializedSize += GV.e(1, l.longValue());
        }
        Integer num = this.g;
        if (num != null) {
            computeSerializedSize += GV.d(2, num.intValue());
        }
        Integer num2 = this.h;
        if (num2 != null) {
            computeSerializedSize += GV.d(3, num2.intValue());
        }
        Integer num3 = this.i;
        if (num3 != null) {
            computeSerializedSize += GV.d(4, num3.intValue());
        }
        Integer num4 = this.j;
        return num4 != null ? computeSerializedSize + GV.d(5, num4.intValue()) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 8) {
                this.a = Long.valueOf(c12129zV.k());
            } else if (m == 16) {
                this.g = Integer.valueOf(c12129zV.j());
            } else if (m == 24) {
                this.h = Integer.valueOf(c12129zV.j());
            } else if (m == 32) {
                int i = c12129zV.e - c12129zV.b;
                try {
                    int j = c12129zV.j();
                    C3617ah4.b(j);
                    this.i = Integer.valueOf(j);
                } catch (IllegalArgumentException unused) {
                    c12129zV.n(i);
                    storeUnknownField(c12129zV, m);
                }
            } else if (m == 40) {
                this.j = Integer.valueOf(c12129zV.j());
            } else if (!super.storeUnknownField(c12129zV, m)) {
                break;
            }
        }
        return this;
    }
}
