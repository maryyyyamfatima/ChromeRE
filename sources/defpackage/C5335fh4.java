package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fh4 */
/* loaded from: classes4.dex */
public final class C5335fh4 extends RF0 implements Cloneable {
    public Long a = null;
    public C4648dh4 g = null;
    public Double h = null;
    public Integer i = null;
    public Integer j = null;
    public Integer k = null;
    public Integer l = null;
    public Integer m = null;
    public C4991eh4 n = null;
    public Integer o = null;
    public Boolean p = null;
    public Boolean q = null;
    public Boolean r = null;

    public C5335fh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final C5335fh4 clone() {
        try {
            C5335fh4 c5335fh4 = (C5335fh4) a();
            C4648dh4 c4648dh4 = this.g;
            if (c4648dh4 != null) {
                c5335fh4.g = c4648dh4.clone();
            }
            C4991eh4 c4991eh4 = this.n;
            if (c4991eh4 != null) {
                try {
                    c5335fh4.n = (C4991eh4) c4991eh4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            return c5335fh4;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Long l = this.a;
        if (l != null) {
            gv.s(1, l.longValue());
        }
        C4648dh4 c4648dh4 = this.g;
        if (c4648dh4 != null) {
            gv.t(2, c4648dh4);
        }
        Double d = this.h;
        if (d != null) {
            gv.o(d.doubleValue(), 3);
        }
        Integer num = this.i;
        if (num != null) {
            gv.r(4, num.intValue());
        }
        Integer num2 = this.j;
        if (num2 != null) {
            gv.r(5, num2.intValue());
        }
        Integer num3 = this.k;
        if (num3 != null) {
            gv.r(6, num3.intValue());
        }
        Integer num4 = this.l;
        if (num4 != null) {
            gv.r(7, num4.intValue());
        }
        Integer num5 = this.m;
        if (num5 != null) {
            gv.r(8, num5.intValue());
        }
        C4991eh4 c4991eh4 = this.n;
        if (c4991eh4 != null) {
            gv.t(9, c4991eh4);
        }
        Integer num6 = this.o;
        if (num6 != null) {
            gv.r(10, num6.intValue());
        }
        Boolean bool = this.p;
        if (bool != null) {
            gv.n(11, bool.booleanValue());
        }
        Boolean bool2 = this.q;
        if (bool2 != null) {
            gv.n(12, bool2.booleanValue());
        }
        Boolean bool3 = this.r;
        if (bool3 != null) {
            gv.n(13, bool3.booleanValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Long l = this.a;
        if (l != null) {
            computeSerializedSize += GV.e(1, l.longValue());
        }
        C4648dh4 c4648dh4 = this.g;
        if (c4648dh4 != null) {
            computeSerializedSize += GV.f(2, c4648dh4);
        }
        Double d = this.h;
        if (d != null) {
            d.doubleValue();
            computeSerializedSize += GV.b(3);
        }
        Integer num = this.i;
        if (num != null) {
            computeSerializedSize += GV.d(4, num.intValue());
        }
        Integer num2 = this.j;
        if (num2 != null) {
            computeSerializedSize += GV.d(5, num2.intValue());
        }
        Integer num3 = this.k;
        if (num3 != null) {
            computeSerializedSize += GV.d(6, num3.intValue());
        }
        Integer num4 = this.l;
        if (num4 != null) {
            computeSerializedSize += GV.d(7, num4.intValue());
        }
        Integer num5 = this.m;
        if (num5 != null) {
            computeSerializedSize += GV.d(8, num5.intValue());
        }
        C4991eh4 c4991eh4 = this.n;
        if (c4991eh4 != null) {
            computeSerializedSize += GV.f(9, c4991eh4);
        }
        Integer num6 = this.o;
        if (num6 != null) {
            computeSerializedSize += GV.d(10, num6.intValue());
        }
        Boolean bool = this.p;
        if (bool != null) {
            bool.booleanValue();
            computeSerializedSize += GV.a(11);
        }
        Boolean bool2 = this.q;
        if (bool2 != null) {
            bool2.booleanValue();
            computeSerializedSize += GV.a(12);
        }
        Boolean bool3 = this.r;
        if (bool3 == null) {
            return computeSerializedSize;
        }
        bool3.booleanValue();
        return computeSerializedSize + GV.a(13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f3, code lost:            return r6;     */
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
            int r1 = r7.b
            switch(r0) {
                case 0: goto Lf3;
                case 8: goto Le7;
                case 18: goto Ld5;
                case 25: goto Lc9;
                case 32: goto Lbd;
                case 40: goto Lb1;
                case 48: goto La5;
                case 56: goto L66;
                case 64: goto L4e;
                case 74: goto L3d;
                case 80: goto L32;
                case 88: goto L27;
                case 96: goto L1c;
                case 104: goto L11;
                default: goto L9;
            }
        L9:
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto Lf3
        L11:
            boolean r0 = r7.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.r = r0
            goto L0
        L1c:
            boolean r0 = r7.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.q = r0
            goto L0
        L27:
            boolean r0 = r7.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.p = r0
            goto L0
        L32:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.o = r0
            goto L0
        L3d:
            eh4 r0 = r6.n
            if (r0 != 0) goto L48
            eh4 r0 = new eh4
            r0.<init>()
            r6.n = r0
        L48:
            eh4 r0 = r6.n
            r7.f(r0)
            goto L0
        L4e:
            int r2 = r7.e
            int r2 = r2 - r1
            int r1 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L5f
            defpackage.C3617ah4.b(r1)     // Catch: java.lang.IllegalArgumentException -> L5f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L5f
            r6.m = r1     // Catch: java.lang.IllegalArgumentException -> L5f
            goto L0
        L5f:
            r7.n(r2)
            r6.storeUnknownField(r7, r0)
            goto L0
        L66:
            int r2 = r7.e
            int r2 = r2 - r1
            int r1 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L9d
            if (r1 == 0) goto L95
            r3 = 1
            if (r1 == r3) goto L95
            r3 = 2
            if (r1 == r3) goto L95
            r3 = 3
            if (r1 == r3) goto L95
            r3 = 4
            if (r1 != r3) goto L7c
            goto L95
        L7c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L9d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L9d
            r5 = 42
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L9d
            r4.append(r1)     // Catch: java.lang.IllegalArgumentException -> L9d
            java.lang.String r1 = " is not a valid enum VideoCodec"
            r4.append(r1)     // Catch: java.lang.IllegalArgumentException -> L9d
            java.lang.String r1 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L9d
            r3.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L9d
            throw r3     // Catch: java.lang.IllegalArgumentException -> L9d
        L95:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L9d
            r6.l = r1     // Catch: java.lang.IllegalArgumentException -> L9d
            goto L0
        L9d:
            r7.n(r2)
            r6.storeUnknownField(r7, r0)
            goto L0
        La5:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.k = r0
            goto L0
        Lb1:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.j = r0
            goto L0
        Lbd:
            int r0 = r7.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.i = r0
            goto L0
        Lc9:
            double r0 = r7.d()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r6.h = r0
            goto L0
        Ld5:
            dh4 r0 = r6.g
            if (r0 != 0) goto Le0
            dh4 r0 = new dh4
            r0.<init>()
            r6.g = r0
        Le0:
            dh4 r0 = r6.g
            r7.f(r0)
            goto L0
        Le7:
            long r0 = r7.k()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.a = r0
            goto L0
        Lf3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5335fh4.mergeFrom(zV):nV1");
    }
}
