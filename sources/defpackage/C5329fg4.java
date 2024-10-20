package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fg4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5329fg4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Boolean g = null;
    public Integer h = null;

    public C5329fg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C5329fg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C5329fg4) a();
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
        Integer num2 = this.h;
        if (num2 != null) {
            gv.r(3, num2.intValue());
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
        Integer num2 = this.h;
        return num2 != null ? computeSerializedSize + GV.d(3, num2.intValue()) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:            return r6;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0038. Please report as an issue. */
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
            if (r0 == 0) goto L63
            r1 = 8
            if (r0 == r1) goto L2f
            r1 = 16
            if (r0 == r1) goto L24
            r1 = 24
            if (r0 == r1) goto L19
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto L63
        L19:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.h = r0
            goto L0
        L24:
            boolean r0 = r7.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.g = r0
            goto L0
        L2f:
            int r1 = r7.e
            int r2 = r7.b
            int r1 = r1 - r2
            int r2 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L5c
            switch(r2) {
                case 0: goto L3e;
                case 1: goto L3e;
                case 2: goto L3e;
                case 3: goto L3e;
                case 4: goto L3e;
                case 5: goto L3e;
                case 6: goto L3e;
                case 7: goto L3e;
                default: goto L3b;
            }     // Catch: java.lang.IllegalArgumentException -> L5c
        L3b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L5c
            goto L45
        L3e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L5c
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> L5c
            goto L0
        L45:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L5c
            r5 = 36
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L5c
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L5c
            java.lang.String r2 = " is not a valid enum Type"
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L5c
            java.lang.String r2 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L5c
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L5c
            throw r3     // Catch: java.lang.IllegalArgumentException -> L5c
        L5c:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5329fg4.mergeFrom(zV):nV1");
    }
}
