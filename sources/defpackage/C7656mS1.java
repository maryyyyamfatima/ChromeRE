package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mS1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7656mS1 extends RF0 implements Cloneable {
    public Integer a = null;
    public Integer g = null;
    public Integer h = null;
    public Integer i = null;
    public Integer j = null;
    public Integer k = null;
    public Integer l = null;
    public Integer m = null;
    public Integer n = null;
    public Integer o = null;
    public Integer p = null;
    public Integer q = null;
    public Integer r = null;
    public Integer s = null;
    public Integer t = null;
    public Integer u = null;
    public Integer v = null;
    public Integer w = null;

    public C7656mS1() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C7656mS1) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C7656mS1) a();
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
        Integer num4 = this.i;
        if (num4 != null) {
            gv.r(4, num4.intValue());
        }
        Integer num5 = this.j;
        if (num5 != null) {
            gv.r(5, num5.intValue());
        }
        Integer num6 = this.k;
        if (num6 != null) {
            gv.r(6, num6.intValue());
        }
        Integer num7 = this.l;
        if (num7 != null) {
            gv.r(7, num7.intValue());
        }
        Integer num8 = this.m;
        if (num8 != null) {
            gv.r(8, num8.intValue());
        }
        Integer num9 = this.n;
        if (num9 != null) {
            gv.r(9, num9.intValue());
        }
        Integer num10 = this.o;
        if (num10 != null) {
            gv.r(10, num10.intValue());
        }
        Integer num11 = this.p;
        if (num11 != null) {
            gv.r(11, num11.intValue());
        }
        Integer num12 = this.q;
        if (num12 != null) {
            gv.r(12, num12.intValue());
        }
        Integer num13 = this.r;
        if (num13 != null) {
            gv.r(13, num13.intValue());
        }
        Integer num14 = this.s;
        if (num14 != null) {
            gv.r(14, num14.intValue());
        }
        Integer num15 = this.t;
        if (num15 != null) {
            gv.r(15, num15.intValue());
        }
        Integer num16 = this.u;
        if (num16 != null) {
            gv.r(16, num16.intValue());
        }
        Integer num17 = this.v;
        if (num17 != null) {
            gv.r(17, num17.intValue());
        }
        Integer num18 = this.w;
        if (num18 != null) {
            gv.r(18, num18.intValue());
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
        if (num3 != null) {
            computeSerializedSize += GV.d(3, num3.intValue());
        }
        Integer num4 = this.i;
        if (num4 != null) {
            computeSerializedSize += GV.d(4, num4.intValue());
        }
        Integer num5 = this.j;
        if (num5 != null) {
            computeSerializedSize += GV.d(5, num5.intValue());
        }
        Integer num6 = this.k;
        if (num6 != null) {
            computeSerializedSize += GV.d(6, num6.intValue());
        }
        Integer num7 = this.l;
        if (num7 != null) {
            computeSerializedSize += GV.d(7, num7.intValue());
        }
        Integer num8 = this.m;
        if (num8 != null) {
            computeSerializedSize += GV.d(8, num8.intValue());
        }
        Integer num9 = this.n;
        if (num9 != null) {
            computeSerializedSize += GV.d(9, num9.intValue());
        }
        Integer num10 = this.o;
        if (num10 != null) {
            computeSerializedSize += GV.d(10, num10.intValue());
        }
        Integer num11 = this.p;
        if (num11 != null) {
            computeSerializedSize += GV.d(11, num11.intValue());
        }
        Integer num12 = this.q;
        if (num12 != null) {
            computeSerializedSize += GV.d(12, num12.intValue());
        }
        Integer num13 = this.r;
        if (num13 != null) {
            computeSerializedSize += GV.d(13, num13.intValue());
        }
        Integer num14 = this.s;
        if (num14 != null) {
            computeSerializedSize += GV.d(14, num14.intValue());
        }
        Integer num15 = this.t;
        if (num15 != null) {
            computeSerializedSize += GV.d(15, num15.intValue());
        }
        Integer num16 = this.u;
        if (num16 != null) {
            computeSerializedSize += GV.d(16, num16.intValue());
        }
        Integer num17 = this.v;
        if (num17 != null) {
            computeSerializedSize += GV.d(17, num17.intValue());
        }
        Integer num18 = this.w;
        return num18 != null ? computeSerializedSize + GV.d(18, num18.intValue()) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            switch (m) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(c12129zV.j());
                    break;
                case 16:
                    this.g = Integer.valueOf(c12129zV.j());
                    break;
                case 24:
                    this.h = Integer.valueOf(c12129zV.j());
                    break;
                case 32:
                    this.i = Integer.valueOf(c12129zV.j());
                    break;
                case 40:
                    this.j = Integer.valueOf(c12129zV.j());
                    break;
                case 48:
                    this.k = Integer.valueOf(c12129zV.j());
                    break;
                case 56:
                    this.l = Integer.valueOf(c12129zV.j());
                    break;
                case 64:
                    this.m = Integer.valueOf(c12129zV.j());
                    break;
                case 72:
                    this.n = Integer.valueOf(c12129zV.j());
                    break;
                case 80:
                    this.o = Integer.valueOf(c12129zV.j());
                    break;
                case 88:
                    this.p = Integer.valueOf(c12129zV.j());
                    break;
                case 96:
                    this.q = Integer.valueOf(c12129zV.j());
                    break;
                case 104:
                    this.r = Integer.valueOf(c12129zV.j());
                    break;
                case 112:
                    this.s = Integer.valueOf(c12129zV.j());
                    break;
                case 120:
                    this.t = Integer.valueOf(c12129zV.j());
                    break;
                case 128:
                    this.u = Integer.valueOf(c12129zV.j());
                    break;
                case 136:
                    this.v = Integer.valueOf(c12129zV.j());
                    break;
                case 144:
                    this.w = Integer.valueOf(c12129zV.j());
                    break;
                default:
                    if (!super.storeUnknownField(c12129zV, m)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
