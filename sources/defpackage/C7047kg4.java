package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kg4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7047kg4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Integer g = null;
    public Integer h = null;
    public Integer i = null;

    public static void c(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append(i);
        sb.append(" is not a valid enum ExpansionState");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void b(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append(i);
        sb.append(" is not a valid enum DisplayMode");
        throw new IllegalArgumentException(sb.toString());
    }

    public C7047kg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final Object clone() {
        try {
            return (C7047kg4) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 clone() {
        try {
            return (C7047kg4) a();
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
        Integer num2 = this.g;
        if (num2 != null) {
            gv.r(2, num2.intValue());
        }
        Integer num3 = this.h;
        if (num3 != null) {
            gv.r(3, num3.intValue());
        }
        Integer num4 = this.i;
        if (num4 != null) {
            gv.r(4, num4.intValue());
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
        Integer num3 = this.h;
        if (num3 != null) {
            computeSerializedSize += GV.d(3, num3.intValue());
        }
        Integer num4 = this.i;
        return num4 != null ? computeSerializedSize + GV.d(4, num4.intValue()) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            int i = c12129zV.b;
            if (m == 8) {
                int i2 = c12129zV.e - i;
                try {
                    int j = c12129zV.j();
                    c(j);
                    this.a = Integer.valueOf(j);
                } catch (IllegalArgumentException unused) {
                    c12129zV.n(i2);
                    storeUnknownField(c12129zV, m);
                }
            } else if (m == 16) {
                int i3 = c12129zV.e - i;
                try {
                    int j2 = c12129zV.j();
                    b(j2);
                    this.g = Integer.valueOf(j2);
                } catch (IllegalArgumentException unused2) {
                    c12129zV.n(i3);
                    storeUnknownField(c12129zV, m);
                }
            } else if (m == 24) {
                int i4 = c12129zV.e - i;
                try {
                    int j3 = c12129zV.j();
                    c(j3);
                    this.h = Integer.valueOf(j3);
                } catch (IllegalArgumentException unused3) {
                    c12129zV.n(i4);
                    storeUnknownField(c12129zV, m);
                }
            } else if (m == 32) {
                int i5 = c12129zV.e - i;
                try {
                    int j4 = c12129zV.j();
                    b(j4);
                    this.i = Integer.valueOf(j4);
                } catch (IllegalArgumentException unused4) {
                    c12129zV.n(i5);
                    storeUnknownField(c12129zV, m);
                }
            } else if (!super.storeUnknownField(c12129zV, m)) {
                break;
            }
        }
        return this;
    }
}
