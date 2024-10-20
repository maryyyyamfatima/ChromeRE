package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Ch4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Integer g = null;
    public Integer h = null;
    public Integer i = null;
    public Integer j = null;
    public Integer k = null;
    public Integer l = null;
    public Integer m = null;

    public Ch4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (Ch4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (Ch4) a();
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
        return num8 != null ? computeSerializedSize + GV.d(8, num8.intValue()) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00bc, code lost:            return r6;     */
    @Override // defpackage.AbstractC8015nV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC8015nV1 mergeFrom(defpackage.C12129zV r7) {
        /*
            r6 = this;
        L0:
            int r0 = r7.m()
            if (r0 == 0) goto Lbc
            r1 = 8
            if (r0 == r1) goto L7b
            r1 = 16
            if (r0 == r1) goto L70
            r1 = 24
            if (r0 == r1) goto L65
            r1 = 32
            if (r0 == r1) goto L5a
            r1 = 40
            if (r0 == r1) goto L4f
            r1 = 48
            if (r0 == r1) goto L44
            r1 = 56
            if (r0 == r1) goto L39
            r1 = 64
            if (r0 == r1) goto L2e
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto Lbc
        L2e:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.m = r0
            goto L0
        L39:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.l = r0
            goto L0
        L44:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.k = r0
            goto L0
        L4f:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.j = r0
            goto L0
        L5a:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.i = r0
            goto L0
        L65:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.h = r0
            goto L0
        L70:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.g = r0
            goto L0
        L7b:
            int r1 = r7.e
            int r2 = r7.b
            int r1 = r1 - r2
            int r2 = r7.j()     // Catch: java.lang.IllegalArgumentException -> Lb4
            if (r2 == 0) goto Lac
            r3 = 1
            if (r2 == r3) goto Lac
            r3 = 2
            if (r2 == r3) goto Lac
            r3 = 3
            if (r2 == r3) goto Lac
            r3 = 4
            if (r2 != r3) goto L93
            goto Lac
        L93:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> Lb4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> Lb4
            r5 = 38
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> Lb4
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> Lb4
            java.lang.String r2 = " is not a valid enum Source"
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> Lb4
            java.lang.String r2 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> Lb4
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> Lb4
            throw r3     // Catch: java.lang.IllegalArgumentException -> Lb4
        Lac:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> Lb4
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> Lb4
            goto L0
        Lb4:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        Lbc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Ch4.mergeFrom(zV):nV1");
    }
}
