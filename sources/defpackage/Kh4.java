package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Kh4 extends RF0 implements Cloneable {
    public String a = null;
    public String g = null;
    public String h = null;
    public String i = null;
    public String j = null;
    public Boolean k = null;
    public Integer l = null;
    public String m = null;
    public Integer n = null;
    public Integer o = null;
    public Integer p = null;
    public Integer q = null;
    public Integer r = null;
    public Integer s = null;
    public Integer t = null;
    public Integer u = null;
    public Integer v = null;

    public Kh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (Kh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (Kh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        String str = this.a;
        if (str != null) {
            gv.x(1, str);
        }
        String str2 = this.g;
        if (str2 != null) {
            gv.x(2, str2);
        }
        String str3 = this.h;
        if (str3 != null) {
            gv.x(3, str3);
        }
        String str4 = this.i;
        if (str4 != null) {
            gv.x(4, str4);
        }
        String str5 = this.j;
        if (str5 != null) {
            gv.x(5, str5);
        }
        Integer num = this.l;
        if (num != null) {
            gv.r(6, num.intValue());
        }
        String str6 = this.m;
        if (str6 != null) {
            gv.x(7, str6);
        }
        Integer num2 = this.n;
        if (num2 != null) {
            gv.r(8, num2.intValue());
        }
        Integer num3 = this.o;
        if (num3 != null) {
            gv.r(9, num3.intValue());
        }
        Integer num4 = this.p;
        if (num4 != null) {
            gv.r(10, num4.intValue());
        }
        Integer num5 = this.q;
        if (num5 != null) {
            gv.r(11, num5.intValue());
        }
        Integer num6 = this.r;
        if (num6 != null) {
            gv.r(12, num6.intValue());
        }
        Integer num7 = this.s;
        if (num7 != null) {
            gv.r(13, num7.intValue());
        }
        Integer num8 = this.t;
        if (num8 != null) {
            gv.r(14, num8.intValue());
        }
        Integer num9 = this.u;
        if (num9 != null) {
            gv.r(15, num9.intValue());
        }
        Boolean bool = this.k;
        if (bool != null) {
            gv.n(16, bool.booleanValue());
        }
        Integer num10 = this.v;
        if (num10 != null) {
            gv.r(17, num10.intValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.a;
        if (str != null) {
            computeSerializedSize += GV.i(1, str);
        }
        String str2 = this.g;
        if (str2 != null) {
            computeSerializedSize += GV.i(2, str2);
        }
        String str3 = this.h;
        if (str3 != null) {
            computeSerializedSize += GV.i(3, str3);
        }
        String str4 = this.i;
        if (str4 != null) {
            computeSerializedSize += GV.i(4, str4);
        }
        String str5 = this.j;
        if (str5 != null) {
            computeSerializedSize += GV.i(5, str5);
        }
        Integer num = this.l;
        if (num != null) {
            computeSerializedSize += GV.d(6, num.intValue());
        }
        String str6 = this.m;
        if (str6 != null) {
            computeSerializedSize += GV.i(7, str6);
        }
        Integer num2 = this.n;
        if (num2 != null) {
            computeSerializedSize += GV.d(8, num2.intValue());
        }
        Integer num3 = this.o;
        if (num3 != null) {
            computeSerializedSize += GV.d(9, num3.intValue());
        }
        Integer num4 = this.p;
        if (num4 != null) {
            computeSerializedSize += GV.d(10, num4.intValue());
        }
        Integer num5 = this.q;
        if (num5 != null) {
            computeSerializedSize += GV.d(11, num5.intValue());
        }
        Integer num6 = this.r;
        if (num6 != null) {
            computeSerializedSize += GV.d(12, num6.intValue());
        }
        Integer num7 = this.s;
        if (num7 != null) {
            computeSerializedSize += GV.d(13, num7.intValue());
        }
        Integer num8 = this.t;
        if (num8 != null) {
            computeSerializedSize += GV.d(14, num8.intValue());
        }
        Integer num9 = this.u;
        if (num9 != null) {
            computeSerializedSize += GV.d(15, num9.intValue());
        }
        Boolean bool = this.k;
        if (bool != null) {
            bool.booleanValue();
            computeSerializedSize += GV.a(16);
        }
        Integer num10 = this.v;
        return num10 != null ? computeSerializedSize + GV.d(17, num10.intValue()) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x011a, code lost:            return r6;     */
    @Override // defpackage.AbstractC8015nV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC8015nV1 mergeFrom(defpackage.C12129zV r7) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Kh4.mergeFrom(zV):nV1");
    }
}
