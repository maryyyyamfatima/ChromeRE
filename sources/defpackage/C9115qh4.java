package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qh4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9115qh4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Integer g = null;
    public Boolean h = null;

    public C9115qh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C9115qh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C9115qh4) a();
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
        Boolean bool = this.h;
        if (bool != null) {
            gv.n(3, bool.booleanValue());
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
        Boolean bool = this.h;
        if (bool == null) {
            return computeSerializedSize;
        }
        bool.booleanValue();
        return computeSerializedSize + GV.a(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x009d, code lost:            return r6;     */
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
            if (r0 == 0) goto L9d
            r1 = 8
            r2 = 3
            r3 = 2
            r4 = 1
            int r5 = r7.b
            if (r0 == r1) goto L61
            r1 = 16
            if (r0 == r1) goto L2a
            r1 = 24
            if (r0 == r1) goto L1f
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto L9d
        L1f:
            boolean r0 = r7.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.h = r0
            goto L0
        L2a:
            int r1 = r7.e
            int r1 = r1 - r5
            int r5 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L5a
            if (r5 == 0) goto L53
            if (r5 == r4) goto L53
            if (r5 == r3) goto L53
            if (r5 != r2) goto L3a
            goto L53
        L3a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L5a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L5a
            r4 = 43
            r3.<init>(r4)     // Catch: java.lang.IllegalArgumentException -> L5a
            r3.append(r5)     // Catch: java.lang.IllegalArgumentException -> L5a
            java.lang.String r4 = " is not a valid enum MediaSource"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L5a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L5a
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L5a
            throw r2     // Catch: java.lang.IllegalArgumentException -> L5a
        L53:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.IllegalArgumentException -> L5a
            r6.g = r2     // Catch: java.lang.IllegalArgumentException -> L5a
            goto L0
        L5a:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L61:
            int r1 = r7.e
            int r1 = r1 - r5
            int r5 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L95
            if (r5 == 0) goto L8d
            if (r5 == r4) goto L8d
            if (r5 == r3) goto L8d
            if (r5 == r2) goto L8d
            r2 = 4
            if (r5 != r2) goto L74
            goto L8d
        L74:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L95
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L95
            r4 = 41
            r3.<init>(r4)     // Catch: java.lang.IllegalArgumentException -> L95
            r3.append(r5)     // Catch: java.lang.IllegalArgumentException -> L95
            java.lang.String r4 = " is not a valid enum MediaType"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L95
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L95
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L95
            throw r2     // Catch: java.lang.IllegalArgumentException -> L95
        L8d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.IllegalArgumentException -> L95
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> L95
            goto L0
        L95:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L9d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9115qh4.mergeFrom(zV):nV1");
    }
}
