package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ch4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4304ch4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Long g = null;
    public Integer h = null;
    public C5679gh4 i = null;
    public Zg4 j = null;

    public static void b(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append(i);
        sb.append(" is not a valid enum PlaybackMode");
        throw new IllegalArgumentException(sb.toString());
    }

    public C4304ch4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C4304ch4 clone() {
        try {
            C4304ch4 c4304ch4 = (C4304ch4) a();
            C5679gh4 c5679gh4 = this.i;
            if (c5679gh4 != null) {
                try {
                    c4304ch4.i = (C5679gh4) c5679gh4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            Zg4 zg4 = this.j;
            if (zg4 != null) {
                try {
                    c4304ch4.j = (Zg4) zg4.a();
                } catch (CloneNotSupportedException e2) {
                    throw new AssertionError(e2);
                }
            }
            return c4304ch4;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
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
        Integer num2 = this.h;
        if (num2 != null) {
            gv.r(3, num2.intValue());
        }
        C5679gh4 c5679gh4 = this.i;
        if (c5679gh4 != null) {
            gv.t(4, c5679gh4);
        }
        Zg4 zg4 = this.j;
        if (zg4 != null) {
            gv.t(5, zg4);
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
        Integer num2 = this.h;
        if (num2 != null) {
            computeSerializedSize += GV.d(3, num2.intValue());
        }
        C5679gh4 c5679gh4 = this.i;
        if (c5679gh4 != null) {
            computeSerializedSize += GV.f(4, c5679gh4);
        }
        Zg4 zg4 = this.j;
        return zg4 != null ? computeSerializedSize + GV.f(5, zg4) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c3, code lost:            return r6;     */
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
            if (r0 == 0) goto Lc3
            r1 = 8
            r2 = 2
            r3 = 1
            int r4 = r7.b
            if (r0 == r1) goto L89
            r1 = 16
            if (r0 == r1) goto L7d
            r1 = 24
            if (r0 == r1) goto L48
            r1 = 34
            if (r0 == r1) goto L37
            r1 = 42
            if (r0 == r1) goto L26
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto Lc3
        L26:
            Zg4 r0 = r6.j
            if (r0 != 0) goto L31
            Zg4 r0 = new Zg4
            r0.<init>()
            r6.j = r0
        L31:
            Zg4 r0 = r6.j
            r7.f(r0)
            goto L0
        L37:
            gh4 r0 = r6.i
            if (r0 != 0) goto L42
            gh4 r0 = new gh4
            r0.<init>()
            r6.i = r0
        L42:
            gh4 r0 = r6.i
            r7.f(r0)
            goto L0
        L48:
            int r1 = r7.e
            int r1 = r1 - r4
            int r4 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L76
            if (r4 == 0) goto L6f
            if (r4 == r3) goto L6f
            if (r4 != r2) goto L56
            goto L6f
        L56:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L76
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L76
            r5 = 46
            r3.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L76
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L76
            java.lang.String r4 = " is not a valid enum PlaybackEngine"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L76
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L76
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L76
            throw r2     // Catch: java.lang.IllegalArgumentException -> L76
        L6f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> L76
            r6.h = r2     // Catch: java.lang.IllegalArgumentException -> L76
            goto L0
        L76:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L7d:
            long r0 = r7.k()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.g = r0
            goto L0
        L89:
            int r1 = r7.e
            int r1 = r1 - r4
            int r4 = r7.j()     // Catch: java.lang.IllegalArgumentException -> Lbb
            if (r4 == 0) goto Lb3
            if (r4 == r3) goto Lb3
            if (r4 == r2) goto Lb3
            r2 = 3
            if (r4 != r2) goto L9a
            goto Lb3
        L9a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> Lbb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> Lbb
            r5 = 45
            r3.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> Lbb
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> Lbb
            java.lang.String r4 = " is not a valid enum PlaybackState"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> Lbb
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> Lbb
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> Lbb
            throw r2     // Catch: java.lang.IllegalArgumentException -> Lbb
        Lb3:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> Lbb
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> Lbb
            goto L0
        Lbb:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        Lc3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4304ch4.mergeFrom(zV):nV1");
    }
}
