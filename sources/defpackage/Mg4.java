package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Mg4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Integer g = null;
    public Long h = null;
    public Long i = null;
    public Integer j = null;

    public Mg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (Mg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (Mg4) a();
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
        Integer num3 = this.j;
        if (num3 != null) {
            gv.r(5, num3.intValue());
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
        Integer num3 = this.j;
        return num3 != null ? computeSerializedSize + GV.d(5, num3.intValue()) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00e0, code lost:            return r6;     */
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
            if (r0 == 0) goto Le0
            r1 = 8
            r2 = 2
            r3 = 1
            int r4 = r7.b
            if (r0 == r1) goto La9
            r1 = 16
            r5 = 40
            if (r0 == r1) goto L71
            r1 = 24
            if (r0 == r1) goto L66
            r1 = 32
            if (r0 == r1) goto L5b
            if (r0 == r5) goto L26
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto Le0
        L26:
            int r1 = r7.e
            int r1 = r1 - r4
            int r4 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L54
            if (r4 == 0) goto L4d
            if (r4 == r3) goto L4d
            if (r4 != r2) goto L34
            goto L4d
        L34:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L54
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L54
            r5 = 42
            r3.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L54
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L54
            java.lang.String r4 = " is not a valid enum ViewSource"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L54
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L54
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L54
            throw r2     // Catch: java.lang.IllegalArgumentException -> L54
        L4d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> L54
            r6.j = r2     // Catch: java.lang.IllegalArgumentException -> L54
            goto L0
        L54:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L5b:
            long r0 = r7.k()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.i = r0
            goto L0
        L66:
            long r0 = r7.k()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.h = r0
            goto L0
        L71:
            int r1 = r7.e
            int r1 = r1 - r4
            int r4 = r7.j()     // Catch: java.lang.IllegalArgumentException -> La1
            if (r4 == 0) goto L99
            if (r4 == r3) goto L99
            if (r4 == r2) goto L99
            r2 = 3
            if (r4 != r2) goto L82
            goto L99
        L82:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> La1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> La1
            r3.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> La1
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> La1
            java.lang.String r4 = " is not a valid enum ViewType"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> La1
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> La1
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> La1
            throw r2     // Catch: java.lang.IllegalArgumentException -> La1
        L99:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> La1
            r6.g = r2     // Catch: java.lang.IllegalArgumentException -> La1
            goto L0
        La1:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        La9:
            int r1 = r7.e
            int r1 = r1 - r4
            int r4 = r7.j()     // Catch: java.lang.IllegalArgumentException -> Ld8
            if (r4 == 0) goto Ld0
            if (r4 == r3) goto Ld0
            if (r4 != r2) goto Lb7
            goto Ld0
        Lb7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> Ld8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> Ld8
            r5 = 41
            r3.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> Ld8
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> Ld8
            java.lang.String r4 = " is not a valid enum MediaType"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> Ld8
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> Ld8
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> Ld8
            throw r2     // Catch: java.lang.IllegalArgumentException -> Ld8
        Ld0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> Ld8
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> Ld8
            goto L0
        Ld8:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        Le0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Mg4.mergeFrom(zV):nV1");
    }
}
