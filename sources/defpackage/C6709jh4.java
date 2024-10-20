package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jh4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6709jh4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Integer g = null;
    public String h = null;
    public String i = null;

    public C6709jh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C6709jh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C6709jh4) a();
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
        String str = this.h;
        if (str != null) {
            gv.x(3, str);
        }
        String str2 = this.i;
        if (str2 != null) {
            gv.x(4, str2);
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
        String str = this.h;
        if (str != null) {
            computeSerializedSize += GV.i(3, str);
        }
        String str2 = this.i;
        return str2 != null ? computeSerializedSize + GV.i(4, str2) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0072, code lost:            return r6;     */
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
            if (r0 == 0) goto L72
            r1 = 8
            if (r0 == r1) goto L36
            r1 = 16
            if (r0 == r1) goto L2b
            r1 = 26
            if (r0 == r1) goto L24
            r1 = 34
            if (r0 == r1) goto L1d
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto L72
        L1d:
            java.lang.String r0 = r7.l()
            r6.i = r0
            goto L0
        L24:
            java.lang.String r0 = r7.l()
            r6.h = r0
            goto L0
        L2b:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.g = r0
            goto L0
        L36:
            int r1 = r7.e
            int r2 = r7.b
            int r1 = r1 - r2
            int r2 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L6b
            if (r2 == 0) goto L64
            r3 = 4
            if (r2 == r3) goto L64
            r3 = 5
            if (r2 == r3) goto L64
            r3 = 6
            if (r2 != r3) goto L4b
            goto L64
        L4b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L6b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L6b
            r5 = 48
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L6b
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L6b
            java.lang.String r2 = " is not a valid enum KeyboardTextType"
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L6b
            java.lang.String r2 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L6b
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L6b
            throw r3     // Catch: java.lang.IllegalArgumentException -> L6b
        L64:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L6b
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> L6b
            goto L0
        L6b:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6709jh4.mergeFrom(zV):nV1");
    }
}
