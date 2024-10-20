package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Gg4 extends RF0 implements Cloneable {
    public Boolean a = null;
    public Integer g = null;
    public Boolean h = null;
    public Integer i = null;
    public Long j = null;
    public Long k = null;
    public Boolean l = null;
    public Boolean m = null;

    public Gg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (Gg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (Gg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Boolean bool = this.a;
        if (bool != null) {
            gv.n(1, bool.booleanValue());
        }
        Integer num = this.g;
        if (num != null) {
            gv.r(2, num.intValue());
        }
        Boolean bool2 = this.h;
        if (bool2 != null) {
            gv.n(3, bool2.booleanValue());
        }
        Integer num2 = this.i;
        if (num2 != null) {
            gv.r(4, num2.intValue());
        }
        Long l = this.j;
        if (l != null) {
            gv.s(5, l.longValue());
        }
        Long l2 = this.k;
        if (l2 != null) {
            gv.s(6, l2.longValue());
        }
        Boolean bool3 = this.l;
        if (bool3 != null) {
            gv.n(7, bool3.booleanValue());
        }
        Boolean bool4 = this.m;
        if (bool4 != null) {
            gv.n(8, bool4.booleanValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Boolean bool = this.a;
        if (bool != null) {
            bool.booleanValue();
            computeSerializedSize += GV.a(1);
        }
        Integer num = this.g;
        if (num != null) {
            computeSerializedSize += GV.d(2, num.intValue());
        }
        Boolean bool2 = this.h;
        if (bool2 != null) {
            bool2.booleanValue();
            computeSerializedSize += GV.a(3);
        }
        Integer num2 = this.i;
        if (num2 != null) {
            computeSerializedSize += GV.d(4, num2.intValue());
        }
        Long l = this.j;
        if (l != null) {
            computeSerializedSize += GV.e(5, l.longValue());
        }
        Long l2 = this.k;
        if (l2 != null) {
            computeSerializedSize += GV.e(6, l2.longValue());
        }
        Boolean bool3 = this.l;
        if (bool3 != null) {
            bool3.booleanValue();
            computeSerializedSize += GV.a(7);
        }
        Boolean bool4 = this.m;
        if (bool4 == null) {
            return computeSerializedSize;
        }
        bool4.booleanValue();
        return computeSerializedSize + GV.a(8);
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 8) {
                this.a = Boolean.valueOf(c12129zV.c());
            } else if (m == 16) {
                this.g = Integer.valueOf(c12129zV.j());
            } else if (m == 24) {
                this.h = Boolean.valueOf(c12129zV.c());
            } else if (m == 32) {
                this.i = Integer.valueOf(c12129zV.j());
            } else if (m == 40) {
                this.j = Long.valueOf(c12129zV.k());
            } else if (m == 48) {
                this.k = Long.valueOf(c12129zV.k());
            } else if (m == 56) {
                this.l = Boolean.valueOf(c12129zV.c());
            } else if (m != 64) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                this.m = Boolean.valueOf(c12129zV.c());
            }
        }
        return this;
    }
}
