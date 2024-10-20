package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eg4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4985eg4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Float g = null;
    public Boolean h = null;
    public Boolean i = null;
    public Long j = null;
    public Long k = null;
    public Long l = null;

    public C4985eg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C4985eg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C4985eg4) a();
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
        Float f = this.g;
        if (f != null) {
            gv.p(2, f.floatValue());
        }
        Boolean bool = this.h;
        if (bool != null) {
            gv.n(3, bool.booleanValue());
        }
        Boolean bool2 = this.i;
        if (bool2 != null) {
            gv.n(4, bool2.booleanValue());
        }
        Long l = this.j;
        if (l != null) {
            gv.s(5, l.longValue());
        }
        Long l2 = this.k;
        if (l2 != null) {
            gv.s(6, l2.longValue());
        }
        Long l3 = this.l;
        if (l3 != null) {
            gv.s(7, l3.longValue());
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
        Float f = this.g;
        if (f != null) {
            f.floatValue();
            computeSerializedSize += GV.c(2);
        }
        Boolean bool = this.h;
        if (bool != null) {
            bool.booleanValue();
            computeSerializedSize += GV.a(3);
        }
        Boolean bool2 = this.i;
        if (bool2 != null) {
            bool2.booleanValue();
            computeSerializedSize += GV.a(4);
        }
        Long l = this.j;
        if (l != null) {
            computeSerializedSize += GV.e(5, l.longValue());
        }
        Long l2 = this.k;
        if (l2 != null) {
            computeSerializedSize += GV.e(6, l2.longValue());
        }
        Long l3 = this.l;
        return l3 != null ? computeSerializedSize + GV.e(7, l3.longValue()) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 8) {
                int i = c12129zV.e - c12129zV.b;
                try {
                    int j = c12129zV.j();
                    if (j != 0 && j != 1 && j != 2 && j != 3 && j != 4) {
                        StringBuilder sb = new StringBuilder(39);
                        sb.append(j);
                        sb.append(" is not a valid enum Outcome");
                        throw new IllegalArgumentException(sb.toString());
                        break;
                    }
                    this.a = Integer.valueOf(j);
                } catch (IllegalArgumentException unused) {
                    c12129zV.n(i);
                    storeUnknownField(c12129zV, m);
                }
            } else if (m == 21) {
                this.g = Float.valueOf(c12129zV.e());
            } else if (m == 24) {
                this.h = Boolean.valueOf(c12129zV.c());
            } else if (m == 32) {
                this.i = Boolean.valueOf(c12129zV.c());
            } else if (m == 40) {
                this.j = Long.valueOf(c12129zV.k());
            } else if (m == 48) {
                this.k = Long.valueOf(c12129zV.k());
            } else if (m != 56) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.l = Long.valueOf(c12129zV.k());
            }
        }
        return this;
    }
}
