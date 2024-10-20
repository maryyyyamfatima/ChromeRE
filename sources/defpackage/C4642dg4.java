package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dg4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4642dg4 extends RF0 implements Cloneable {
    public Integer a = null;
    public Integer g = null;
    public Integer h = null;
    public Wg4[] i = Wg4.c();
    public Wg4[] j = Wg4.c();
    public Wg4[] k = Wg4.c();
    public Wg4[] l = Wg4.c();

    public C4642dg4() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4642dg4 clone() {
        try {
            C4642dg4 c4642dg4 = (C4642dg4) a();
            Wg4[] wg4Arr = this.i;
            int i = 0;
            if (wg4Arr != null && wg4Arr.length > 0) {
                c4642dg4.i = new Wg4[wg4Arr.length];
                int i2 = 0;
                while (true) {
                    Wg4[] wg4Arr2 = this.i;
                    if (i2 >= wg4Arr2.length) {
                        break;
                    }
                    Wg4 wg4 = wg4Arr2[i2];
                    if (wg4 != null) {
                        c4642dg4.i[i2] = wg4.clone();
                    }
                    i2++;
                }
            }
            Wg4[] wg4Arr3 = this.j;
            if (wg4Arr3 != null && wg4Arr3.length > 0) {
                c4642dg4.j = new Wg4[wg4Arr3.length];
                int i3 = 0;
                while (true) {
                    Wg4[] wg4Arr4 = this.j;
                    if (i3 >= wg4Arr4.length) {
                        break;
                    }
                    Wg4 wg42 = wg4Arr4[i3];
                    if (wg42 != null) {
                        c4642dg4.j[i3] = wg42.clone();
                    }
                    i3++;
                }
            }
            Wg4[] wg4Arr5 = this.k;
            if (wg4Arr5 != null && wg4Arr5.length > 0) {
                c4642dg4.k = new Wg4[wg4Arr5.length];
                int i4 = 0;
                while (true) {
                    Wg4[] wg4Arr6 = this.k;
                    if (i4 >= wg4Arr6.length) {
                        break;
                    }
                    Wg4 wg43 = wg4Arr6[i4];
                    if (wg43 != null) {
                        c4642dg4.k[i4] = wg43.clone();
                    }
                    i4++;
                }
            }
            Wg4[] wg4Arr7 = this.l;
            if (wg4Arr7 != null && wg4Arr7.length > 0) {
                c4642dg4.l = new Wg4[wg4Arr7.length];
                while (true) {
                    Wg4[] wg4Arr8 = this.l;
                    if (i >= wg4Arr8.length) {
                        break;
                    }
                    Wg4 wg44 = wg4Arr8[i];
                    if (wg44 != null) {
                        c4642dg4.l[i] = wg44.clone();
                    }
                    i++;
                }
            }
            return c4642dg4;
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
        Wg4[] wg4Arr = this.i;
        int i = 0;
        if (wg4Arr != null && wg4Arr.length > 0) {
            int i2 = 0;
            while (true) {
                Wg4[] wg4Arr2 = this.i;
                if (i2 >= wg4Arr2.length) {
                    break;
                }
                Wg4 wg4 = wg4Arr2[i2];
                if (wg4 != null) {
                    gv.t(4, wg4);
                }
                i2++;
            }
        }
        Wg4[] wg4Arr3 = this.j;
        if (wg4Arr3 != null && wg4Arr3.length > 0) {
            int i3 = 0;
            while (true) {
                Wg4[] wg4Arr4 = this.j;
                if (i3 >= wg4Arr4.length) {
                    break;
                }
                Wg4 wg42 = wg4Arr4[i3];
                if (wg42 != null) {
                    gv.t(5, wg42);
                }
                i3++;
            }
        }
        Wg4[] wg4Arr5 = this.k;
        if (wg4Arr5 != null && wg4Arr5.length > 0) {
            int i4 = 0;
            while (true) {
                Wg4[] wg4Arr6 = this.k;
                if (i4 >= wg4Arr6.length) {
                    break;
                }
                Wg4 wg43 = wg4Arr6[i4];
                if (wg43 != null) {
                    gv.t(6, wg43);
                }
                i4++;
            }
        }
        Wg4[] wg4Arr7 = this.l;
        if (wg4Arr7 != null && wg4Arr7.length > 0) {
            while (true) {
                Wg4[] wg4Arr8 = this.l;
                if (i >= wg4Arr8.length) {
                    break;
                }
                Wg4 wg44 = wg4Arr8[i];
                if (wg44 != null) {
                    gv.t(7, wg44);
                }
                i++;
            }
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
        Wg4[] wg4Arr = this.i;
        int i = 0;
        if (wg4Arr != null && wg4Arr.length > 0) {
            int i2 = 0;
            while (true) {
                Wg4[] wg4Arr2 = this.i;
                if (i2 >= wg4Arr2.length) {
                    break;
                }
                Wg4 wg4 = wg4Arr2[i2];
                if (wg4 != null) {
                    computeSerializedSize += GV.f(4, wg4);
                }
                i2++;
            }
        }
        Wg4[] wg4Arr3 = this.j;
        if (wg4Arr3 != null && wg4Arr3.length > 0) {
            int i3 = 0;
            while (true) {
                Wg4[] wg4Arr4 = this.j;
                if (i3 >= wg4Arr4.length) {
                    break;
                }
                Wg4 wg42 = wg4Arr4[i3];
                if (wg42 != null) {
                    computeSerializedSize += GV.f(5, wg42);
                }
                i3++;
            }
        }
        Wg4[] wg4Arr5 = this.k;
        if (wg4Arr5 != null && wg4Arr5.length > 0) {
            int i4 = 0;
            while (true) {
                Wg4[] wg4Arr6 = this.k;
                if (i4 >= wg4Arr6.length) {
                    break;
                }
                Wg4 wg43 = wg4Arr6[i4];
                if (wg43 != null) {
                    computeSerializedSize += GV.f(6, wg43);
                }
                i4++;
            }
        }
        Wg4[] wg4Arr7 = this.l;
        if (wg4Arr7 != null && wg4Arr7.length > 0) {
            while (true) {
                Wg4[] wg4Arr8 = this.l;
                if (i >= wg4Arr8.length) {
                    break;
                }
                Wg4 wg44 = wg4Arr8[i];
                if (wg44 != null) {
                    computeSerializedSize += GV.f(7, wg44);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0154, code lost:            return r6;     */
    @Override // defpackage.AbstractC8015nV1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC8015nV1 mergeFrom(defpackage.C12129zV r7) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4642dg4.mergeFrom(zV):nV1");
    }
}
