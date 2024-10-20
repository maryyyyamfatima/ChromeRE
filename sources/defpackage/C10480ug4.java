package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ug4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10480ug4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Long g = null;
    public Long h = null;
    public Long i = null;

    public C10480ug4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C10480ug4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C10480ug4) a();
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
        Long l = this.g;
        if (l != null) {
            gv.s(2, l.longValue());
        }
        Long l2 = this.h;
        if (l2 != null) {
            gv.s(3, l2.longValue());
        }
        Long l3 = this.i;
        if (l3 != null) {
            gv.s(4, l3.longValue());
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
        Long l = this.g;
        if (l != null) {
            computeSerializedSize += GV.e(2, l.longValue());
        }
        Long l2 = this.h;
        if (l2 != null) {
            computeSerializedSize += GV.e(3, l2.longValue());
        }
        Long l3 = this.i;
        return l3 != null ? computeSerializedSize + GV.e(4, l3.longValue()) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0074, code lost:            return r6;     */
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
            if (r0 == 0) goto L74
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
            goto L74
        L1d:
            long r0 = r7.k()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.i = r0
            goto L0
        L28:
            long r0 = r7.k()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.h = r0
            goto L0
        L33:
            long r0 = r7.k()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.g = r0
            goto L0
        L3e:
            int r1 = r7.e
            int r2 = r7.b
            int r1 = r1 - r2
            int r2 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L6d
            if (r2 == 0) goto L66
            r3 = 1
            if (r2 != r3) goto L4d
            goto L66
        L4d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L6d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L6d
            r5 = 40
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L6d
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L6d
            java.lang.String r2 = " is not a valid enum ExitType"
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L6d
            java.lang.String r2 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L6d
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L6d
            throw r3     // Catch: java.lang.IllegalArgumentException -> L6d
        L66:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L6d
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> L6d
            goto L0
        L6d:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L74:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10480ug4.mergeFrom(zV):nV1");
    }
}
