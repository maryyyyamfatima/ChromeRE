package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Dg4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Bg4 g = null;
    public Cg4 h = null;
    public String i = null;

    public static void b(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append(i);
        sb.append(" is not a valid enum StereoFormat");
        throw new IllegalArgumentException(sb.toString());
    }

    public Dg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Dg4 clone() {
        try {
            Dg4 dg4 = (Dg4) a();
            Bg4 bg4 = this.g;
            if (bg4 != null) {
                try {
                    dg4.g = (Bg4) bg4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            Cg4 cg4 = this.h;
            if (cg4 != null) {
                try {
                    dg4.h = (Cg4) cg4.a();
                } catch (CloneNotSupportedException e2) {
                    throw new AssertionError(e2);
                }
            }
            return dg4;
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
        Bg4 bg4 = this.g;
        if (bg4 != null) {
            gv.t(2, bg4);
        }
        Cg4 cg4 = this.h;
        if (cg4 != null) {
            gv.t(3, cg4);
        }
        String str = this.i;
        if (str != null) {
            gv.x(4, str);
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
        Bg4 bg4 = this.g;
        if (bg4 != null) {
            computeSerializedSize += GV.f(2, bg4);
        }
        Cg4 cg4 = this.h;
        if (cg4 != null) {
            computeSerializedSize += GV.f(3, cg4);
        }
        String str = this.i;
        return str != null ? computeSerializedSize + GV.i(4, str) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0083, code lost:            return r6;     */
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
            if (r0 == 0) goto L83
            r1 = 8
            if (r0 == r1) goto L46
            r1 = 18
            if (r0 == r1) goto L35
            r1 = 26
            if (r0 == r1) goto L24
            r1 = 34
            if (r0 == r1) goto L1d
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto L83
        L1d:
            java.lang.String r0 = r7.l()
            r6.i = r0
            goto L0
        L24:
            Cg4 r0 = r6.h
            if (r0 != 0) goto L2f
            Cg4 r0 = new Cg4
            r0.<init>()
            r6.h = r0
        L2f:
            Cg4 r0 = r6.h
            r7.f(r0)
            goto L0
        L35:
            Bg4 r0 = r6.g
            if (r0 != 0) goto L40
            Bg4 r0 = new Bg4
            r0.<init>()
            r6.g = r0
        L40:
            Bg4 r0 = r6.g
            r7.f(r0)
            goto L0
        L46:
            int r1 = r7.e
            int r2 = r7.b
            int r1 = r1 - r2
            int r2 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L7b
            if (r2 == 0) goto L74
            r3 = 1
            if (r2 == r3) goto L74
            r3 = 2
            if (r2 == r3) goto L74
            r3 = 3
            if (r2 != r3) goto L5b
            goto L74
        L5b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L7b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L7b
            r5 = 40
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L7b
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L7b
            java.lang.String r2 = " is not a valid enum ViewMode"
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L7b
            java.lang.String r2 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L7b
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L7b
            throw r3     // Catch: java.lang.IllegalArgumentException -> L7b
        L74:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L7b
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> L7b
            goto L0
        L7b:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L83:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Dg4.mergeFrom(zV):nV1");
    }
}
