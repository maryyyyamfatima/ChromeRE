package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nh4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8085nh4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Integer g = null;
    public String h = null;
    public C7741mh4 i = null;

    public C8085nh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C8085nh4 clone() {
        try {
            C8085nh4 c8085nh4 = (C8085nh4) a();
            C7741mh4 c7741mh4 = this.i;
            if (c7741mh4 != null) {
                try {
                    c8085nh4.i = (C7741mh4) c7741mh4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            return c8085nh4;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
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
        C7741mh4 c7741mh4 = this.i;
        if (c7741mh4 != null) {
            gv.t(4, c7741mh4);
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
        C7741mh4 c7741mh4 = this.i;
        return c7741mh4 != null ? computeSerializedSize + GV.f(4, c7741mh4) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x007e, code lost:            return r6;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x004e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0051. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0054. Please report as an issue. */
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
            if (r0 == 0) goto L7e
            r1 = 8
            if (r0 == r1) goto L40
            r1 = 16
            if (r0 == r1) goto L35
            r1 = 26
            if (r0 == r1) goto L2e
            r1 = 34
            if (r0 == r1) goto L1d
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto L7e
        L1d:
            mh4 r0 = r6.i
            if (r0 != 0) goto L28
            mh4 r0 = new mh4
            r0.<init>()
            r6.i = r0
        L28:
            mh4 r0 = r6.i
            r7.f(r0)
            goto L0
        L2e:
            java.lang.String r0 = r7.l()
            r6.h = r0
            goto L0
        L35:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.g = r0
            goto L0
        L40:
            int r1 = r7.e
            int r2 = r7.b
            int r1 = r1 - r2
            int r2 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L77
            if (r2 == 0) goto L70
            r3 = 1
            if (r2 == r3) goto L70
            switch(r2) {
                case 1000: goto L70;
                case 1001: goto L70;
                case 1002: goto L70;
                case 1003: goto L70;
                case 1004: goto L70;
                case 1005: goto L70;
                case 1006: goto L70;
                case 1007: goto L70;
                default: goto L51;
            }     // Catch: java.lang.IllegalArgumentException -> L77
        L51:
            switch(r2) {
                case 2000: goto L70;
                case 2001: goto L70;
                case 2002: goto L70;
                case 2003: goto L70;
                case 2004: goto L70;
                case 2005: goto L70;
                case 2006: goto L70;
                case 2007: goto L70;
                case 2008: goto L70;
                case 2009: goto L70;
                case 2010: goto L70;
                case 2011: goto L70;
                case 2012: goto L70;
                case 2013: goto L70;
                case 2014: goto L70;
                case 2015: goto L70;
                case 2016: goto L70;
                case 2017: goto L70;
                case 2018: goto L70;
                case 2019: goto L70;
                case 2020: goto L70;
                case 2021: goto L70;
                default: goto L54;
            }     // Catch: java.lang.IllegalArgumentException -> L77
        L54:
            switch(r2) {
                case 3000: goto L70;
                case 3001: goto L70;
                case 3002: goto L70;
                case 3003: goto L70;
                case 3004: goto L70;
                case 3005: goto L70;
                case 3006: goto L70;
                case 3007: goto L70;
                case 3008: goto L70;
                case 3009: goto L70;
                case 3010: goto L70;
                case 3011: goto L70;
                case 3012: goto L70;
                case 3013: goto L70;
                case 3014: goto L70;
                default: goto L57;
            }     // Catch: java.lang.IllegalArgumentException -> L77
        L57:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L77
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L77
            r5 = 41
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L77
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L77
            java.lang.String r2 = " is not a valid enum UiElement"
            r4.append(r2)     // Catch: java.lang.IllegalArgumentException -> L77
            java.lang.String r2 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L77
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L77
            throw r3     // Catch: java.lang.IllegalArgumentException -> L77
        L70:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L77
            r6.a = r2     // Catch: java.lang.IllegalArgumentException -> L77
            goto L0
        L77:
            r7.n(r1)
            r6.storeUnknownField(r7, r0)
            goto L0
        L7e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8085nh4.mergeFrom(zV):nV1");
    }
}
