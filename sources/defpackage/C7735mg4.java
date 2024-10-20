package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mg4 */
/* loaded from: classes4.dex */
public final class C7735mg4 extends RF0 implements Cloneable {
    public static volatile C7735mg4[] j;
    public Hh4 a = null;
    public C7391lg4[] g;
    public Integer h;
    public Integer i;

    public C7735mg4() {
        if (C7391lg4.i == null) {
            synchronized (AbstractC3071Xq1.a) {
                if (C7391lg4.i == null) {
                    C7391lg4.i = new C7391lg4[0];
                }
            }
        }
        this.g = C7391lg4.i;
        this.h = null;
        this.i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final C7735mg4 clone() {
        try {
            C7735mg4 c7735mg4 = (C7735mg4) a();
            Hh4 hh4 = this.a;
            if (hh4 != null) {
                c7735mg4.a = hh4.clone();
            }
            C7391lg4[] c7391lg4Arr = this.g;
            if (c7391lg4Arr != null && c7391lg4Arr.length > 0) {
                c7735mg4.g = new C7391lg4[c7391lg4Arr.length];
                int i = 0;
                while (true) {
                    C7391lg4[] c7391lg4Arr2 = this.g;
                    if (i >= c7391lg4Arr2.length) {
                        break;
                    }
                    C7391lg4 c7391lg4 = c7391lg4Arr2[i];
                    if (c7391lg4 != null) {
                        c7735mg4.g[i] = c7391lg4.clone();
                    }
                    i++;
                }
            }
            return c7735mg4;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Hh4 hh4 = this.a;
        if (hh4 != null) {
            gv.t(2, hh4);
        }
        C7391lg4[] c7391lg4Arr = this.g;
        if (c7391lg4Arr != null && c7391lg4Arr.length > 0) {
            int i = 0;
            while (true) {
                C7391lg4[] c7391lg4Arr2 = this.g;
                if (i >= c7391lg4Arr2.length) {
                    break;
                }
                C7391lg4 c7391lg4 = c7391lg4Arr2[i];
                if (c7391lg4 != null) {
                    gv.t(3, c7391lg4);
                }
                i++;
            }
        }
        Integer num = this.h;
        if (num != null) {
            gv.r(4, num.intValue());
        }
        Integer num2 = this.i;
        if (num2 != null) {
            gv.r(5, num2.intValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Hh4 hh4 = this.a;
        if (hh4 != null) {
            computeSerializedSize += GV.f(2, hh4);
        }
        C7391lg4[] c7391lg4Arr = this.g;
        if (c7391lg4Arr != null && c7391lg4Arr.length > 0) {
            int i = 0;
            while (true) {
                C7391lg4[] c7391lg4Arr2 = this.g;
                if (i >= c7391lg4Arr2.length) {
                    break;
                }
                C7391lg4 c7391lg4 = c7391lg4Arr2[i];
                if (c7391lg4 != null) {
                    computeSerializedSize += GV.f(3, c7391lg4);
                }
                i++;
            }
        }
        Integer num = this.h;
        if (num != null) {
            computeSerializedSize += GV.d(4, num.intValue());
        }
        Integer num2 = this.i;
        return num2 != null ? computeSerializedSize + GV.d(5, num2.intValue()) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00d6, code lost:            return r6;     */
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
            if (r0 == 0) goto Ld6
            r1 = 18
            if (r0 == r1) goto Lc4
            r1 = 26
            if (r0 == r1) goto L8e
            r1 = 1
            r2 = 32
            r3 = 2
            int r4 = r7.b
            if (r0 == r2) goto L57
            r2 = 40
            if (r0 == r2) goto L22
            boolean r0 = super.storeUnknownField(r7, r0)
            if (r0 != 0) goto L0
            goto Ld6
        L22:
            int r2 = r7.e
            int r2 = r2 - r4
            int r4 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L50
            if (r4 == 0) goto L49
            if (r4 == r1) goto L49
            if (r4 != r3) goto L30
            goto L49
        L30:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L50
            r5 = 44
            r3.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L50
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L50
            java.lang.String r4 = " is not a valid enum VrSystemType"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L50
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L50
            r1.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L50
            throw r1     // Catch: java.lang.IllegalArgumentException -> L50
        L49:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> L50
            r6.i = r1     // Catch: java.lang.IllegalArgumentException -> L50
            goto L0
        L50:
            r7.n(r2)
            r6.storeUnknownField(r7, r0)
            goto L0
        L57:
            int r2 = r7.e
            int r2 = r2 - r4
            int r4 = r7.j()     // Catch: java.lang.IllegalArgumentException -> L86
            if (r4 == 0) goto L7e
            if (r4 == r1) goto L7e
            if (r4 != r3) goto L65
            goto L7e
        L65:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L86
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L86
            r5 = 37
            r3.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L86
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L86
            java.lang.String r4 = " is not a valid enum VrSdk"
            r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L86
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L86
            r1.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L86
            throw r1     // Catch: java.lang.IllegalArgumentException -> L86
        L7e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> L86
            r6.h = r1     // Catch: java.lang.IllegalArgumentException -> L86
            goto L0
        L86:
            r7.n(r2)
            r6.storeUnknownField(r7, r0)
            goto L0
        L8e:
            int r0 = defpackage.AbstractC11226wq4.a(r7, r1)
            lg4[] r1 = r6.g
            r2 = 0
            if (r1 != 0) goto L99
            r3 = r2
            goto L9a
        L99:
            int r3 = r1.length
        L9a:
            int r0 = r0 + r3
            lg4[] r4 = new defpackage.C7391lg4[r0]
            if (r3 == 0) goto La2
            java.lang.System.arraycopy(r1, r2, r4, r2, r3)
        La2:
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Lb6
            lg4 r1 = new lg4
            r1.<init>()
            r4[r3] = r1
            r7.f(r1)
            r7.m()
            int r3 = r3 + 1
            goto La2
        Lb6:
            lg4 r0 = new lg4
            r0.<init>()
            r4[r3] = r0
            r7.f(r0)
            r6.g = r4
            goto L0
        Lc4:
            Hh4 r0 = r6.a
            if (r0 != 0) goto Lcf
            Hh4 r0 = new Hh4
            r0.<init>()
            r6.a = r0
        Lcf:
            Hh4 r0 = r6.a
            r7.f(r0)
            goto L0
        Ld6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7735mg4.mergeFrom(zV):nV1");
    }
}
