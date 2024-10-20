package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Ph4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Integer g = null;

    public Ph4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (Ph4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (Ph4) a();
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
        return num2 != null ? computeSerializedSize + GV.d(2, num2.intValue()) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0086, code lost:            return r6;     */
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
            if (r0 == 0) goto L86
            r1 = 8
            r2 = 1
            int r3 = r7.b
            if (r0 == r1) goto L52
            r1 = 16
            if (r0 == r1) goto L19
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto L86
        L19:
            int r1 = r7.e
            int r1 = r1 - r3
            int r3 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L4b
            if (r3 == 0) goto L44
            if (r3 == r2) goto L44
            r2 = 2
            if (r3 == r2) goto L44
            r2 = 3
            if (r3 != r2) goto L2b
            goto L44
        L2b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L4b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L4b
            r5 = 48
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L4b
            r4.append(r3)     // Catch: java.lang.IllegalArgumentException -> L4b
            java.lang.String r3 = " is not a valid enum DialogActionType"
            r4.append(r3)     // Catch: java.lang.IllegalArgumentException -> L4b
            java.lang.String r3 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L4b
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L4b
            throw r2     // Catch: java.lang.IllegalArgumentException -> L4b
        L44:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.IllegalArgumentException -> L4b
            r6.g = r2     // Catch: java.lang.IllegalArgumentException -> L4b
            goto L0
        L4b:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L52:
            int r1 = r7.e
            int r1 = r1 - r3
            int r3 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L7e
            if (r3 == 0) goto L77
            if (r3 != r2) goto L5e
            goto L77
        L5e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L7e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L7e
            r5 = 42
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L7e
            r4.append(r3)     // Catch: java.lang.IllegalArgumentException -> L7e
            java.lang.String r3 = " is not a valid enum DialogType"
            r4.append(r3)     // Catch: java.lang.IllegalArgumentException -> L7e
            java.lang.String r3 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L7e
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L7e
            throw r2     // Catch: java.lang.IllegalArgumentException -> L7e
        L77:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.IllegalArgumentException -> L7e
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> L7e
            goto L0
        L7e:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Ph4.mergeFrom(zV):nV1");
    }
}
