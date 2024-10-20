package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Nh4 extends RF0 implements Cloneable {
    public Integer a = null;

    public Nh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (Nh4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (Nh4) a();
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
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Integer num = this.a;
        return num != null ? computeSerializedSize + GV.d(1, num.intValue()) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004a, code lost:            return r6;     */
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
            if (r0 == 0) goto L4a
            r1 = 8
            if (r0 == r1) goto L11
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto L4a
        L11:
            int r1 = r7.e
            int r2 = r7.b
            int r1 = r1 - r2
            int r2 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L43
            if (r2 == 0) goto L3c
            r3 = 1
            if (r2 == r3) goto L3c
            r3 = 2
            if (r2 != r3) goto L23
            goto L3c
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L43
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L43
            r5 = 51
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L43
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L43
            java.lang.String r2 = " is not a valid enum LockScreenEventType"
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L43
            java.lang.String r2 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L43
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L43
            throw r3     // Catch: java.lang.IllegalArgumentException -> L43
        L3c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L43
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> L43
            goto L0
        L43:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L4a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Nh4.mergeFrom(zV):nV1");
    }
}
