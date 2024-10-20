package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Oh4 extends RF0 implements Cloneable {
    public Long a = null;
    public Integer g = null;
    public Integer h = null;
    public C4298cg4 i = null;
    public Integer j = null;
    public C4298cg4 k = null;
    public Kh4 l = null;
    public Mh4 m = null;
    public Boolean n = null;
    public Jh4 o = null;
    public Integer p = null;
    public Nh4 q = null;

    public Oh4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final Oh4 clone() {
        try {
            Oh4 oh4 = (Oh4) a();
            C4298cg4 c4298cg4 = this.i;
            if (c4298cg4 != null) {
                oh4.i = c4298cg4.clone();
            }
            C4298cg4 c4298cg42 = this.k;
            if (c4298cg42 != null) {
                oh4.k = c4298cg42.clone();
            }
            Kh4 kh4 = this.l;
            if (kh4 != null) {
                try {
                    oh4.l = (Kh4) kh4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            Mh4 mh4 = this.m;
            if (mh4 != null) {
                oh4.m = mh4.clone();
            }
            Jh4 jh4 = this.o;
            if (jh4 != null) {
                try {
                    oh4.o = (Jh4) jh4.a();
                } catch (CloneNotSupportedException e2) {
                    throw new AssertionError(e2);
                }
            }
            Nh4 nh4 = this.q;
            if (nh4 != null) {
                try {
                    oh4.q = (Nh4) nh4.a();
                } catch (CloneNotSupportedException e3) {
                    throw new AssertionError(e3);
                }
            }
            return oh4;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Integer num = this.g;
        if (num != null) {
            gv.r(1, num.intValue());
        }
        Integer num2 = this.h;
        if (num2 != null) {
            gv.r(2, num2.intValue());
        }
        C4298cg4 c4298cg4 = this.i;
        if (c4298cg4 != null) {
            gv.t(3, c4298cg4);
        }
        Integer num3 = this.j;
        if (num3 != null) {
            gv.r(4, num3.intValue());
        }
        C4298cg4 c4298cg42 = this.k;
        if (c4298cg42 != null) {
            gv.t(5, c4298cg42);
        }
        Kh4 kh4 = this.l;
        if (kh4 != null) {
            gv.t(6, kh4);
        }
        Mh4 mh4 = this.m;
        if (mh4 != null) {
            gv.t(7, mh4);
        }
        Boolean bool = this.n;
        if (bool != null) {
            gv.n(8, bool.booleanValue());
        }
        Jh4 jh4 = this.o;
        if (jh4 != null) {
            gv.t(9, jh4);
        }
        Integer num4 = this.p;
        if (num4 != null) {
            gv.r(10, num4.intValue());
        }
        Long l = this.a;
        if (l != null) {
            gv.s(11, l.longValue());
        }
        Nh4 nh4 = this.q;
        if (nh4 != null) {
            gv.t(12, nh4);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Integer num = this.g;
        if (num != null) {
            computeSerializedSize += GV.d(1, num.intValue());
        }
        Integer num2 = this.h;
        if (num2 != null) {
            computeSerializedSize += GV.d(2, num2.intValue());
        }
        C4298cg4 c4298cg4 = this.i;
        if (c4298cg4 != null) {
            computeSerializedSize += GV.f(3, c4298cg4);
        }
        Integer num3 = this.j;
        if (num3 != null) {
            computeSerializedSize += GV.d(4, num3.intValue());
        }
        C4298cg4 c4298cg42 = this.k;
        if (c4298cg42 != null) {
            computeSerializedSize += GV.f(5, c4298cg42);
        }
        Kh4 kh4 = this.l;
        if (kh4 != null) {
            computeSerializedSize += GV.f(6, kh4);
        }
        Mh4 mh4 = this.m;
        if (mh4 != null) {
            computeSerializedSize += GV.f(7, mh4);
        }
        Boolean bool = this.n;
        if (bool != null) {
            bool.booleanValue();
            computeSerializedSize += GV.a(8);
        }
        Jh4 jh4 = this.o;
        if (jh4 != null) {
            computeSerializedSize += GV.f(9, jh4);
        }
        Integer num4 = this.p;
        if (num4 != null) {
            computeSerializedSize += GV.d(10, num4.intValue());
        }
        Long l = this.a;
        if (l != null) {
            computeSerializedSize += GV.e(11, l.longValue());
        }
        Nh4 nh4 = this.q;
        return nh4 != null ? computeSerializedSize + GV.f(12, nh4) : computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x012e, code lost:            return r6;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x00ad. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:78:0x00ed. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:79:0x00f0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x00f3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:81:0x00f6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:82:0x00f9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:83:0x00fc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x00ff. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x0102. Please report as an issue. */
    @Override // defpackage.AbstractC8015nV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC8015nV1 mergeFrom(defpackage.C12129zV r7) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Oh4.mergeFrom(zV):nV1");
    }
}
