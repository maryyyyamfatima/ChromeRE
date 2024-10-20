package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hg4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6017hg4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Boolean g = null;
    public Boolean h = null;
    public Integer i = null;

    public C6017hg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C6017hg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C6017hg4) a();
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
        Boolean bool = this.g;
        if (bool != null) {
            gv.n(2, bool.booleanValue());
        }
        Boolean bool2 = this.h;
        if (bool2 != null) {
            gv.n(3, bool2.booleanValue());
        }
        Integer num2 = this.i;
        if (num2 != null) {
            gv.r(4, num2.intValue());
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
        Boolean bool = this.g;
        if (bool != null) {
            bool.booleanValue();
            computeSerializedSize += GV.a(2);
        }
        Boolean bool2 = this.h;
        if (bool2 != null) {
            bool2.booleanValue();
            computeSerializedSize += GV.a(3);
        }
        Integer num2 = this.i;
        return num2 != null ? computeSerializedSize + GV.d(4, num2.intValue()) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0077, code lost:            return r6;     */
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
            if (r0 == 0) goto L77
            r1 = 8
            if (r0 == r1) goto L3e
            r1 = 16
            if (r0 == r1) goto L33
            r1 = 24
            if (r0 == r1) goto L28
            r1 = 32
            if (r0 == r1) goto L1d
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto L77
        L1d:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.i = r0
            goto L0
        L28:
            boolean r0 = r7.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.h = r0
            goto L0
        L33:
            boolean r0 = r7.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.g = r0
            goto L0
        L3e:
            int r1 = r7.e
            int r2 = r7.b
            int r1 = r1 - r2
            int r2 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L70
            if (r2 == 0) goto L69
            r3 = 1
            if (r2 == r3) goto L69
            r3 = 2
            if (r2 != r3) goto L50
            goto L69
        L50:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L70
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L70
            r5 = 43
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L70
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L70
            java.lang.String r2 = " is not a valid enum Orientation"
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L70
            java.lang.String r2 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L70
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L70
            throw r3     // Catch: java.lang.IllegalArgumentException -> L70
        L69:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L70
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> L70
            goto L0
        L70:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L77:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6017hg4.mergeFrom(zV):nV1");
    }
}
