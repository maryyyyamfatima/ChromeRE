package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yg4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C11852yg4 extends RF0 implements Cloneable {
    public Integer a = null;
    public C6703jg4 g = null;
    public Long h = null;
    public Integer i = null;
    public Double j = null;

    public C11852yg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C11852yg4 clone() {
        try {
            C11852yg4 c11852yg4 = (C11852yg4) a();
            C6703jg4 c6703jg4 = this.g;
            if (c6703jg4 != null) {
                c11852yg4.g = c6703jg4.clone();
            }
            return c11852yg4;
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
        C6703jg4 c6703jg4 = this.g;
        if (c6703jg4 != null) {
            gv.t(2, c6703jg4);
        }
        Long l = this.h;
        if (l != null) {
            gv.s(3, l.longValue());
        }
        Integer num2 = this.i;
        if (num2 != null) {
            gv.r(4, num2.intValue());
        }
        Double d = this.j;
        if (d != null) {
            gv.o(d.doubleValue(), 5);
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
        C6703jg4 c6703jg4 = this.g;
        if (c6703jg4 != null) {
            computeSerializedSize += GV.f(2, c6703jg4);
        }
        Long l = this.h;
        if (l != null) {
            computeSerializedSize += GV.e(3, l.longValue());
        }
        Integer num2 = this.i;
        if (num2 != null) {
            computeSerializedSize += GV.d(4, num2.intValue());
        }
        Double d = this.j;
        if (d == null) {
            return computeSerializedSize;
        }
        d.doubleValue();
        return computeSerializedSize + GV.b(5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00bd, code lost:            return r6;     */
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
            if (r0 == 0) goto Lbd
            r1 = 8
            r2 = 2
            r3 = 1
            int r4 = r7.b
            if (r0 == r1) goto L83
            r1 = 18
            if (r0 == r1) goto L71
            r1 = 24
            if (r0 == r1) goto L66
            r1 = 32
            if (r0 == r1) goto L31
            r1 = 41
            if (r0 == r1) goto L26
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto Lbd
        L26:
            double r0 = r7.d()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r6.j = r0
            goto L0
        L31:
            int r1 = r7.e
            int r1 = r1 - r4
            int r4 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L5f
            if (r4 == 0) goto L58
            if (r4 == r3) goto L58
            if (r4 != r2) goto L3f
            goto L58
        L3f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L5f
            r5 = 47
            r3.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L5f
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L5f
            java.lang.String r4 = " is not a valid enum ForceHumanScale"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L5f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L5f
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L5f
            throw r2     // Catch: java.lang.IllegalArgumentException -> L5f
        L58:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> L5f
            r6.i = r2     // Catch: java.lang.IllegalArgumentException -> L5f
            goto L0
        L5f:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L66:
            long r0 = r7.k()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.h = r0
            goto L0
        L71:
            jg4 r0 = r6.g
            if (r0 != 0) goto L7c
            jg4 r0 = new jg4
            r0.<init>()
            r6.g = r0
        L7c:
            jg4 r0 = r6.g
            r7.f(r0)
            goto L0
        L83:
            int r1 = r7.e
            int r1 = r1 - r4
            int r4 = r7.j()     // Catch: java.lang.IllegalArgumentException -> Lb5
            if (r4 == 0) goto Lad
            if (r4 == r3) goto Lad
            if (r4 == r2) goto Lad
            r2 = 3
            if (r4 != r2) goto L94
            goto Lad
        L94:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> Lb5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> Lb5
            r5 = 36
            r3.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> Lb5
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> Lb5
            java.lang.String r4 = " is not a valid enum Mode"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> Lb5
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> Lb5
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> Lb5
            throw r2     // Catch: java.lang.IllegalArgumentException -> Lb5
        Lad:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> Lb5
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> Lb5
            goto L0
        Lb5:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        Lbd:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11852yg4.mergeFrom(zV):nV1");
    }
}
