package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Hg4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Kg4 g = null;
    public Lg4 h = null;

    public Hg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Hg4 clone() {
        try {
            Hg4 hg4 = (Hg4) a();
            Kg4 kg4 = this.g;
            if (kg4 != null) {
                hg4.g = kg4.clone();
            }
            Lg4 lg4 = this.h;
            if (lg4 != null) {
                hg4.h = lg4.clone();
            }
            return hg4;
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
        Kg4 kg4 = this.g;
        if (kg4 != null) {
            gv.t(2, kg4);
        }
        Lg4 lg4 = this.h;
        if (lg4 != null) {
            gv.t(3, lg4);
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
        Kg4 kg4 = this.g;
        if (kg4 != null) {
            computeSerializedSize += GV.f(2, kg4);
        }
        Lg4 lg4 = this.h;
        return lg4 != null ? computeSerializedSize + GV.f(3, lg4) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x007a, code lost:            return r6;     */
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
            if (r0 == 0) goto L7a
            r1 = 8
            if (r0 == r1) goto L3b
            r1 = 18
            if (r0 == r1) goto L2a
            r1 = 26
            if (r0 == r1) goto L19
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto L7a
        L19:
            Lg4 r0 = r6.h
            if (r0 != 0) goto L24
            Lg4 r0 = new Lg4
            r0.<init>()
            r6.h = r0
        L24:
            Lg4 r0 = r6.h
            r7.f(r0)
            goto L0
        L2a:
            Kg4 r0 = r6.g
            if (r0 != 0) goto L35
            Kg4 r0 = new Kg4
            r0.<init>()
            r6.g = r0
        L35:
            Kg4 r0 = r6.g
            r7.f(r0)
            goto L0
        L3b:
            int r1 = r7.e
            int r2 = r7.b
            int r1 = r1 - r2
            int r2 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L73
            if (r2 == 0) goto L6c
            r3 = 1
            if (r2 == r3) goto L6c
            r3 = 2
            if (r2 == r3) goto L6c
            r3 = 3
            if (r2 == r3) goto L6c
            r3 = 4
            if (r2 != r3) goto L53
            goto L6c
        L53:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L73
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L73
            r5 = 43
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L73
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L73
            java.lang.String r2 = " is not a valid enum CaptureType"
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L73
            java.lang.String r2 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L73
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L73
            throw r3     // Catch: java.lang.IllegalArgumentException -> L73
        L6c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L73
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> L73
            goto L0
        L73:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L7a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Hg4.mergeFrom(zV):nV1");
    }
}
