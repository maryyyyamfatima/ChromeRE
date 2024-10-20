package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lg4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7391lg4 extends RF0 implements Cloneable {
    public static volatile C7391lg4[] i;
    public Integer a = null;
    public Hh4 g = null;
    public Integer h = null;

    public C7391lg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C7391lg4 clone() {
        try {
            C7391lg4 c7391lg4 = (C7391lg4) a();
            Hh4 hh4 = this.g;
            if (hh4 != null) {
                c7391lg4.g = hh4.clone();
            }
            return c7391lg4;
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
        Hh4 hh4 = this.g;
        if (hh4 != null) {
            gv.t(2, hh4);
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
        Hh4 hh4 = this.g;
        if (hh4 != null) {
            computeSerializedSize += GV.f(2, hh4);
        }
        Integer num2 = this.h;
        return num2 != null ? computeSerializedSize + GV.d(3, num2.intValue()) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x009f, code lost:            return r6;     */
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
            if (r0 == 0) goto L9f
            r1 = 8
            r2 = 36
            r3 = 2
            r4 = 1
            int r5 = r7.b
            if (r0 == r1) goto L6a
            r1 = 18
            if (r0 == r1) goto L59
            r1 = 24
            if (r0 == r1) goto L20
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto L9f
        L20:
            int r1 = r7.e
            int r1 = r1 - r5
            int r5 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L52
            if (r5 == 0) goto L4b
            if (r5 == r4) goto L4b
            if (r5 == r3) goto L4b
            r3 = 3
            if (r5 == r3) goto L4b
            r3 = 4
            if (r5 != r3) goto L34
            goto L4b
        L34:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L52
            r4.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L52
            r4.append(r5)     // Catch: java.lang.IllegalArgumentException -> L52
            java.lang.String r2 = " is not a valid enum Type"
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L52
            java.lang.String r2 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L52
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L52
            throw r3     // Catch: java.lang.IllegalArgumentException -> L52
        L4b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.IllegalArgumentException -> L52
            r6.h = r2     // Catch: java.lang.IllegalArgumentException -> L52
            goto L0
        L52:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L59:
            Hh4 r0 = r6.g
            if (r0 != 0) goto L64
            Hh4 r0 = new Hh4
            r0.<init>()
            r6.g = r0
        L64:
            Hh4 r0 = r6.g
            r7.f(r0)
            goto L0
        L6a:
            int r1 = r7.e
            int r1 = r1 - r5
            int r5 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L97
            if (r5 == 0) goto L8f
            if (r5 == r4) goto L8f
            if (r5 != r3) goto L78
            goto L8f
        L78:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L97
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L97
            r4.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L97
            r4.append(r5)     // Catch: java.lang.IllegalArgumentException -> L97
            java.lang.String r2 = " is not a valid enum Role"
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L97
            java.lang.String r2 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L97
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L97
            throw r3     // Catch: java.lang.IllegalArgumentException -> L97
        L8f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.IllegalArgumentException -> L97
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> L97
            goto L0
        L97:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L9f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7391lg4.mergeFrom(zV):nV1");
    }
}
