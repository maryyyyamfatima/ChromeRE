package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ih4 */
/* loaded from: classes4.dex */
public final class C6366ih4 extends RF0 implements Cloneable {
    public static volatile C6366ih4[] q;
    public Long a = null;
    public Integer g = null;
    public C6709jh4 h = null;
    public C4298cg4 i = null;
    public String[] j;
    public String[] k;
    public String l;
    public Integer m;
    public String n;
    public Integer o;
    public String[] p;

    public C6366ih4() {
        String[] strArr = AbstractC11226wq4.c;
        this.j = strArr;
        this.k = strArr;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = strArr;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final C6366ih4 clone() {
        try {
            C6366ih4 c6366ih4 = (C6366ih4) a();
            C6709jh4 c6709jh4 = this.h;
            if (c6709jh4 != null) {
                try {
                    c6366ih4.h = (C6709jh4) c6709jh4.a();
                } catch (CloneNotSupportedException e) {
                    throw new AssertionError(e);
                }
            }
            C4298cg4 c4298cg4 = this.i;
            if (c4298cg4 != null) {
                c6366ih4.i = c4298cg4.clone();
            }
            String[] strArr = this.j;
            if (strArr != null && strArr.length > 0) {
                c6366ih4.j = (String[]) strArr.clone();
            }
            String[] strArr2 = this.k;
            if (strArr2 != null && strArr2.length > 0) {
                c6366ih4.k = (String[]) strArr2.clone();
            }
            String[] strArr3 = this.p;
            if (strArr3 != null && strArr3.length > 0) {
                c6366ih4.p = (String[]) strArr3.clone();
            }
            return c6366ih4;
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
        Integer num = this.g;
        if (num != null) {
            gv.r(2, num.intValue());
        }
        C6709jh4 c6709jh4 = this.h;
        if (c6709jh4 != null) {
            gv.t(3, c6709jh4);
        }
        C4298cg4 c4298cg4 = this.i;
        if (c4298cg4 != null) {
            gv.t(4, c4298cg4);
        }
        String[] strArr = this.j;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.j;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    gv.x(5, str);
                }
                i2++;
            }
        }
        String[] strArr3 = this.k;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.k;
                if (i3 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i3];
                if (str2 != null) {
                    gv.x(6, str2);
                }
                i3++;
            }
        }
        String str3 = this.l;
        if (str3 != null) {
            gv.x(7, str3);
        }
        Integer num2 = this.m;
        if (num2 != null) {
            gv.r(8, num2.intValue());
        }
        String str4 = this.n;
        if (str4 != null) {
            gv.x(9, str4);
        }
        Integer num3 = this.o;
        if (num3 != null) {
            gv.r(10, num3.intValue());
        }
        String[] strArr5 = this.p;
        if (strArr5 != null && strArr5.length > 0) {
            while (true) {
                String[] strArr6 = this.p;
                if (i >= strArr6.length) {
                    break;
                }
                String str5 = strArr6[i];
                if (str5 != null) {
                    gv.x(11, str5);
                }
                i++;
            }
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
        Integer num = this.g;
        if (num != null) {
            computeSerializedSize += GV.d(2, num.intValue());
        }
        C6709jh4 c6709jh4 = this.h;
        if (c6709jh4 != null) {
            computeSerializedSize += GV.f(3, c6709jh4);
        }
        C4298cg4 c4298cg4 = this.i;
        if (c4298cg4 != null) {
            computeSerializedSize += GV.f(4, c4298cg4);
        }
        String[] strArr = this.j;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.j;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i4++;
                    int m = GV.m(str);
                    i3 += GV.g(m) + m;
                }
                i2++;
            }
            computeSerializedSize = computeSerializedSize + i3 + (i4 * 1);
        }
        String[] strArr3 = this.k;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr4 = this.k;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    i7++;
                    int m2 = GV.m(str2);
                    i6 += GV.g(m2) + m2;
                }
                i5++;
            }
            computeSerializedSize = computeSerializedSize + i6 + (i7 * 1);
        }
        String str3 = this.l;
        if (str3 != null) {
            computeSerializedSize += GV.i(7, str3);
        }
        Integer num2 = this.m;
        if (num2 != null) {
            computeSerializedSize += GV.d(8, num2.intValue());
        }
        String str4 = this.n;
        if (str4 != null) {
            computeSerializedSize += GV.i(9, str4);
        }
        Integer num3 = this.o;
        if (num3 != null) {
            computeSerializedSize += GV.d(10, num3.intValue());
        }
        String[] strArr5 = this.p;
        if (strArr5 == null || strArr5.length <= 0) {
            return computeSerializedSize;
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            String[] strArr6 = this.p;
            if (i >= strArr6.length) {
                return computeSerializedSize + i8 + (i9 * 1);
            }
            String str5 = strArr6[i];
            if (str5 != null) {
                i9++;
                int m3 = GV.m(str5);
                i8 += GV.g(m3) + m3;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0161, code lost:            return r6;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:101:0x0128. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x012b. Please report as an issue. */
    @Override // defpackage.AbstractC8015nV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC8015nV1 mergeFrom(defpackage.C12129zV r7) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6366ih4.mergeFrom(zV):nV1");
    }
}
