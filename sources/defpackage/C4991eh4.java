package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eh4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4991eh4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Integer g = null;
    public Integer h = null;

    public C4991eh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C4991eh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C4991eh4) a();
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
        Integer num3 = this.h;
        if (num3 != null) {
            gv.r(3, num3.intValue());
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
        Integer num3 = this.h;
        return num3 != null ? computeSerializedSize + GV.d(3, num3.intValue()) : computeSerializedSize;
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
                int i = c12129zV.e - c12129zV.b;
                try {
                    int j = c12129zV.j();
                    if (j != 0 && j != 1 && j != 2 && j != 3 && j != 4) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(j);
                        sb.append(" is not a valid enum ProjectionType");
                        throw new IllegalArgumentException(sb.toString());
                        break;
                    }
                    this.g = Integer.valueOf(j);
                } catch (IllegalArgumentException unused) {
                    c12129zV.n(i);
                    storeUnknownField(c12129zV, m);
                }
            } else if (m != 24) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.h = Integer.valueOf(c12129zV.j());
            }
        }
        return this;
    }
}
