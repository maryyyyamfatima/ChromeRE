package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oh4 */
/* loaded from: classes4.dex */
public final class C8429oh4 extends RF0 implements Cloneable {
    public Float A;
    public Integer a = null;
    public Wg4[] g = Wg4.c();
    public Integer h = null;
    public Float i = null;
    public Float j = null;
    public Float k = null;
    public Gh4 l = null;
    public Wg4[] m = Wg4.c();
    public Wg4[] n = Wg4.c();
    public Wg4[] o = Wg4.c();
    public Wg4[] p = Wg4.c();
    public Wg4[] q = Wg4.c();
    public Wg4[] r = Wg4.c();
    public Integer s = null;
    public float[] t;
    public float[] u;
    public float[] v;
    public float[] w;
    public float[] x;
    public float[] y;
    public Float z;

    public C8429oh4() {
        float[] fArr = AbstractC11226wq4.b;
        this.t = fArr;
        this.u = fArr;
        this.v = fArr;
        this.w = fArr;
        this.x = fArr;
        this.y = fArr;
        this.z = null;
        this.A = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b */
    public final C8429oh4 clone() {
        try {
            C8429oh4 c8429oh4 = (C8429oh4) a();
            Wg4[] wg4Arr = this.g;
            int i = 0;
            if (wg4Arr != null && wg4Arr.length > 0) {
                c8429oh4.g = new Wg4[wg4Arr.length];
                int i2 = 0;
                while (true) {
                    Wg4[] wg4Arr2 = this.g;
                    if (i2 >= wg4Arr2.length) {
                        break;
                    }
                    Wg4 wg4 = wg4Arr2[i2];
                    if (wg4 != null) {
                        c8429oh4.g[i2] = wg4.clone();
                    }
                    i2++;
                }
            }
            Gh4 gh4 = this.l;
            if (gh4 != null) {
                c8429oh4.l = gh4.clone();
            }
            Wg4[] wg4Arr3 = this.m;
            if (wg4Arr3 != null && wg4Arr3.length > 0) {
                c8429oh4.m = new Wg4[wg4Arr3.length];
                int i3 = 0;
                while (true) {
                    Wg4[] wg4Arr4 = this.m;
                    if (i3 >= wg4Arr4.length) {
                        break;
                    }
                    Wg4 wg42 = wg4Arr4[i3];
                    if (wg42 != null) {
                        c8429oh4.m[i3] = wg42.clone();
                    }
                    i3++;
                }
            }
            Wg4[] wg4Arr5 = this.n;
            if (wg4Arr5 != null && wg4Arr5.length > 0) {
                c8429oh4.n = new Wg4[wg4Arr5.length];
                int i4 = 0;
                while (true) {
                    Wg4[] wg4Arr6 = this.n;
                    if (i4 >= wg4Arr6.length) {
                        break;
                    }
                    Wg4 wg43 = wg4Arr6[i4];
                    if (wg43 != null) {
                        c8429oh4.n[i4] = wg43.clone();
                    }
                    i4++;
                }
            }
            Wg4[] wg4Arr7 = this.o;
            if (wg4Arr7 != null && wg4Arr7.length > 0) {
                c8429oh4.o = new Wg4[wg4Arr7.length];
                int i5 = 0;
                while (true) {
                    Wg4[] wg4Arr8 = this.o;
                    if (i5 >= wg4Arr8.length) {
                        break;
                    }
                    Wg4 wg44 = wg4Arr8[i5];
                    if (wg44 != null) {
                        c8429oh4.o[i5] = wg44.clone();
                    }
                    i5++;
                }
            }
            Wg4[] wg4Arr9 = this.p;
            if (wg4Arr9 != null && wg4Arr9.length > 0) {
                c8429oh4.p = new Wg4[wg4Arr9.length];
                int i6 = 0;
                while (true) {
                    Wg4[] wg4Arr10 = this.p;
                    if (i6 >= wg4Arr10.length) {
                        break;
                    }
                    Wg4 wg45 = wg4Arr10[i6];
                    if (wg45 != null) {
                        c8429oh4.p[i6] = wg45.clone();
                    }
                    i6++;
                }
            }
            Wg4[] wg4Arr11 = this.q;
            if (wg4Arr11 != null && wg4Arr11.length > 0) {
                c8429oh4.q = new Wg4[wg4Arr11.length];
                int i7 = 0;
                while (true) {
                    Wg4[] wg4Arr12 = this.q;
                    if (i7 >= wg4Arr12.length) {
                        break;
                    }
                    Wg4 wg46 = wg4Arr12[i7];
                    if (wg46 != null) {
                        c8429oh4.q[i7] = wg46.clone();
                    }
                    i7++;
                }
            }
            Wg4[] wg4Arr13 = this.r;
            if (wg4Arr13 != null && wg4Arr13.length > 0) {
                c8429oh4.r = new Wg4[wg4Arr13.length];
                while (true) {
                    Wg4[] wg4Arr14 = this.r;
                    if (i >= wg4Arr14.length) {
                        break;
                    }
                    Wg4 wg47 = wg4Arr14[i];
                    if (wg47 != null) {
                        c8429oh4.r[i] = wg47.clone();
                    }
                    i++;
                }
            }
            float[] fArr = this.t;
            if (fArr != null && fArr.length > 0) {
                c8429oh4.t = (float[]) fArr.clone();
            }
            float[] fArr2 = this.u;
            if (fArr2 != null && fArr2.length > 0) {
                c8429oh4.u = (float[]) fArr2.clone();
            }
            float[] fArr3 = this.v;
            if (fArr3 != null && fArr3.length > 0) {
                c8429oh4.v = (float[]) fArr3.clone();
            }
            float[] fArr4 = this.w;
            if (fArr4 != null && fArr4.length > 0) {
                c8429oh4.w = (float[]) fArr4.clone();
            }
            float[] fArr5 = this.x;
            if (fArr5 != null && fArr5.length > 0) {
                c8429oh4.x = (float[]) fArr5.clone();
            }
            float[] fArr6 = this.y;
            if (fArr6 != null && fArr6.length > 0) {
                c8429oh4.y = (float[]) fArr6.clone();
            }
            return c8429oh4;
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
        Wg4[] wg4Arr = this.g;
        int i = 0;
        if (wg4Arr != null && wg4Arr.length > 0) {
            int i2 = 0;
            while (true) {
                Wg4[] wg4Arr2 = this.g;
                if (i2 >= wg4Arr2.length) {
                    break;
                }
                Wg4 wg4 = wg4Arr2[i2];
                if (wg4 != null) {
                    gv.t(2, wg4);
                }
                i2++;
            }
        }
        Integer num2 = this.h;
        if (num2 != null) {
            gv.r(3, num2.intValue());
        }
        Float f = this.i;
        if (f != null) {
            gv.p(4, f.floatValue());
        }
        Float f2 = this.j;
        if (f2 != null) {
            gv.p(5, f2.floatValue());
        }
        Float f3 = this.k;
        if (f3 != null) {
            gv.p(6, f3.floatValue());
        }
        Gh4 gh4 = this.l;
        if (gh4 != null) {
            gv.t(7, gh4);
        }
        Wg4[] wg4Arr3 = this.m;
        if (wg4Arr3 != null && wg4Arr3.length > 0) {
            int i3 = 0;
            while (true) {
                Wg4[] wg4Arr4 = this.m;
                if (i3 >= wg4Arr4.length) {
                    break;
                }
                Wg4 wg42 = wg4Arr4[i3];
                if (wg42 != null) {
                    gv.t(8, wg42);
                }
                i3++;
            }
        }
        Wg4[] wg4Arr5 = this.n;
        if (wg4Arr5 != null && wg4Arr5.length > 0) {
            int i4 = 0;
            while (true) {
                Wg4[] wg4Arr6 = this.n;
                if (i4 >= wg4Arr6.length) {
                    break;
                }
                Wg4 wg43 = wg4Arr6[i4];
                if (wg43 != null) {
                    gv.t(9, wg43);
                }
                i4++;
            }
        }
        Wg4[] wg4Arr7 = this.o;
        if (wg4Arr7 != null && wg4Arr7.length > 0) {
            int i5 = 0;
            while (true) {
                Wg4[] wg4Arr8 = this.o;
                if (i5 >= wg4Arr8.length) {
                    break;
                }
                Wg4 wg44 = wg4Arr8[i5];
                if (wg44 != null) {
                    gv.t(10, wg44);
                }
                i5++;
            }
        }
        Wg4[] wg4Arr9 = this.p;
        if (wg4Arr9 != null && wg4Arr9.length > 0) {
            int i6 = 0;
            while (true) {
                Wg4[] wg4Arr10 = this.p;
                if (i6 >= wg4Arr10.length) {
                    break;
                }
                Wg4 wg45 = wg4Arr10[i6];
                if (wg45 != null) {
                    gv.t(11, wg45);
                }
                i6++;
            }
        }
        Wg4[] wg4Arr11 = this.q;
        if (wg4Arr11 != null && wg4Arr11.length > 0) {
            int i7 = 0;
            while (true) {
                Wg4[] wg4Arr12 = this.q;
                if (i7 >= wg4Arr12.length) {
                    break;
                }
                Wg4 wg46 = wg4Arr12[i7];
                if (wg46 != null) {
                    gv.t(12, wg46);
                }
                i7++;
            }
        }
        Wg4[] wg4Arr13 = this.r;
        if (wg4Arr13 != null && wg4Arr13.length > 0) {
            int i8 = 0;
            while (true) {
                Wg4[] wg4Arr14 = this.r;
                if (i8 >= wg4Arr14.length) {
                    break;
                }
                Wg4 wg47 = wg4Arr14[i8];
                if (wg47 != null) {
                    gv.t(13, wg47);
                }
                i8++;
            }
        }
        Integer num3 = this.s;
        if (num3 != null) {
            gv.r(14, num3.intValue());
        }
        float[] fArr = this.t;
        if (fArr != null && fArr.length > 0) {
            int i9 = 0;
            while (true) {
                float[] fArr2 = this.t;
                if (i9 >= fArr2.length) {
                    break;
                }
                gv.p(15, fArr2[i9]);
                i9++;
            }
        }
        float[] fArr3 = this.u;
        if (fArr3 != null && fArr3.length > 0) {
            int i10 = 0;
            while (true) {
                float[] fArr4 = this.u;
                if (i10 >= fArr4.length) {
                    break;
                }
                gv.p(16, fArr4[i10]);
                i10++;
            }
        }
        float[] fArr5 = this.v;
        if (fArr5 != null && fArr5.length > 0) {
            int i11 = 0;
            while (true) {
                float[] fArr6 = this.v;
                if (i11 >= fArr6.length) {
                    break;
                }
                gv.p(17, fArr6[i11]);
                i11++;
            }
        }
        float[] fArr7 = this.w;
        if (fArr7 != null && fArr7.length > 0) {
            int i12 = 0;
            while (true) {
                float[] fArr8 = this.w;
                if (i12 >= fArr8.length) {
                    break;
                }
                gv.p(18, fArr8[i12]);
                i12++;
            }
        }
        float[] fArr9 = this.x;
        if (fArr9 != null && fArr9.length > 0) {
            int i13 = 0;
            while (true) {
                float[] fArr10 = this.x;
                if (i13 >= fArr10.length) {
                    break;
                }
                gv.p(19, fArr10[i13]);
                i13++;
            }
        }
        float[] fArr11 = this.y;
        if (fArr11 != null && fArr11.length > 0) {
            while (true) {
                float[] fArr12 = this.y;
                if (i >= fArr12.length) {
                    break;
                }
                gv.p(20, fArr12[i]);
                i++;
            }
        }
        Float f4 = this.z;
        if (f4 != null) {
            gv.p(21, f4.floatValue());
        }
        Float f5 = this.A;
        if (f5 != null) {
            gv.p(22, f5.floatValue());
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
        Wg4[] wg4Arr = this.g;
        int i = 0;
        if (wg4Arr != null && wg4Arr.length > 0) {
            int i2 = 0;
            while (true) {
                Wg4[] wg4Arr2 = this.g;
                if (i2 >= wg4Arr2.length) {
                    break;
                }
                Wg4 wg4 = wg4Arr2[i2];
                if (wg4 != null) {
                    computeSerializedSize += GV.f(2, wg4);
                }
                i2++;
            }
        }
        Integer num2 = this.h;
        if (num2 != null) {
            computeSerializedSize += GV.d(3, num2.intValue());
        }
        Float f = this.i;
        if (f != null) {
            f.floatValue();
            computeSerializedSize += GV.c(4);
        }
        Float f2 = this.j;
        if (f2 != null) {
            f2.floatValue();
            computeSerializedSize += GV.c(5);
        }
        Float f3 = this.k;
        if (f3 != null) {
            f3.floatValue();
            computeSerializedSize += GV.c(6);
        }
        Gh4 gh4 = this.l;
        if (gh4 != null) {
            computeSerializedSize += GV.f(7, gh4);
        }
        Wg4[] wg4Arr3 = this.m;
        if (wg4Arr3 != null && wg4Arr3.length > 0) {
            int i3 = 0;
            while (true) {
                Wg4[] wg4Arr4 = this.m;
                if (i3 >= wg4Arr4.length) {
                    break;
                }
                Wg4 wg42 = wg4Arr4[i3];
                if (wg42 != null) {
                    computeSerializedSize += GV.f(8, wg42);
                }
                i3++;
            }
        }
        Wg4[] wg4Arr5 = this.n;
        if (wg4Arr5 != null && wg4Arr5.length > 0) {
            int i4 = 0;
            while (true) {
                Wg4[] wg4Arr6 = this.n;
                if (i4 >= wg4Arr6.length) {
                    break;
                }
                Wg4 wg43 = wg4Arr6[i4];
                if (wg43 != null) {
                    computeSerializedSize += GV.f(9, wg43);
                }
                i4++;
            }
        }
        Wg4[] wg4Arr7 = this.o;
        if (wg4Arr7 != null && wg4Arr7.length > 0) {
            int i5 = 0;
            while (true) {
                Wg4[] wg4Arr8 = this.o;
                if (i5 >= wg4Arr8.length) {
                    break;
                }
                Wg4 wg44 = wg4Arr8[i5];
                if (wg44 != null) {
                    computeSerializedSize += GV.f(10, wg44);
                }
                i5++;
            }
        }
        Wg4[] wg4Arr9 = this.p;
        if (wg4Arr9 != null && wg4Arr9.length > 0) {
            int i6 = 0;
            while (true) {
                Wg4[] wg4Arr10 = this.p;
                if (i6 >= wg4Arr10.length) {
                    break;
                }
                Wg4 wg45 = wg4Arr10[i6];
                if (wg45 != null) {
                    computeSerializedSize += GV.f(11, wg45);
                }
                i6++;
            }
        }
        Wg4[] wg4Arr11 = this.q;
        if (wg4Arr11 != null && wg4Arr11.length > 0) {
            int i7 = 0;
            while (true) {
                Wg4[] wg4Arr12 = this.q;
                if (i7 >= wg4Arr12.length) {
                    break;
                }
                Wg4 wg46 = wg4Arr12[i7];
                if (wg46 != null) {
                    computeSerializedSize += GV.f(12, wg46);
                }
                i7++;
            }
        }
        Wg4[] wg4Arr13 = this.r;
        if (wg4Arr13 != null && wg4Arr13.length > 0) {
            while (true) {
                Wg4[] wg4Arr14 = this.r;
                if (i >= wg4Arr14.length) {
                    break;
                }
                Wg4 wg47 = wg4Arr14[i];
                if (wg47 != null) {
                    computeSerializedSize += GV.f(13, wg47);
                }
                i++;
            }
        }
        Integer num3 = this.s;
        if (num3 != null) {
            computeSerializedSize += GV.d(14, num3.intValue());
        }
        float[] fArr = this.t;
        if (fArr != null && fArr.length > 0) {
            computeSerializedSize = computeSerializedSize + (fArr.length * 4) + (fArr.length * 1);
        }
        float[] fArr2 = this.u;
        if (fArr2 != null && fArr2.length > 0) {
            computeSerializedSize = computeSerializedSize + (fArr2.length * 4) + (fArr2.length * 2);
        }
        float[] fArr3 = this.v;
        if (fArr3 != null && fArr3.length > 0) {
            computeSerializedSize = computeSerializedSize + (fArr3.length * 4) + (fArr3.length * 2);
        }
        float[] fArr4 = this.w;
        if (fArr4 != null && fArr4.length > 0) {
            computeSerializedSize = computeSerializedSize + (fArr4.length * 4) + (fArr4.length * 2);
        }
        float[] fArr5 = this.x;
        if (fArr5 != null && fArr5.length > 0) {
            computeSerializedSize = computeSerializedSize + (fArr5.length * 4) + (fArr5.length * 2);
        }
        float[] fArr6 = this.y;
        if (fArr6 != null && fArr6.length > 0) {
            computeSerializedSize = computeSerializedSize + (fArr6.length * 4) + (fArr6.length * 2);
        }
        Float f4 = this.z;
        if (f4 != null) {
            f4.floatValue();
            computeSerializedSize += GV.c(21);
        }
        Float f5 = this.A;
        if (f5 == null) {
            return computeSerializedSize;
        }
        f5.floatValue();
        return computeSerializedSize + GV.c(22);
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            switch (m) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(c12129zV.j());
                    break;
                case 18:
                    int a = AbstractC11226wq4.a(c12129zV, 18);
                    Wg4[] wg4Arr = this.g;
                    int length = wg4Arr == null ? 0 : wg4Arr.length;
                    int i = a + length;
                    Wg4[] wg4Arr2 = new Wg4[i];
                    if (length != 0) {
                        System.arraycopy(wg4Arr, 0, wg4Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        Wg4 wg4 = new Wg4();
                        wg4Arr2[length] = wg4;
                        c12129zV.f(wg4);
                        c12129zV.m();
                        length++;
                    }
                    Wg4 wg42 = new Wg4();
                    wg4Arr2[length] = wg42;
                    c12129zV.f(wg42);
                    this.g = wg4Arr2;
                    break;
                case 24:
                    this.h = Integer.valueOf(c12129zV.j());
                    break;
                case 37:
                    this.i = Float.valueOf(c12129zV.e());
                    break;
                case 45:
                    this.j = Float.valueOf(c12129zV.e());
                    break;
                case 53:
                    this.k = Float.valueOf(c12129zV.e());
                    break;
                case 58:
                    if (this.l == null) {
                        this.l = new Gh4();
                    }
                    c12129zV.f(this.l);
                    break;
                case 66:
                    int a2 = AbstractC11226wq4.a(c12129zV, 66);
                    Wg4[] wg4Arr3 = this.m;
                    int length2 = wg4Arr3 == null ? 0 : wg4Arr3.length;
                    int i2 = a2 + length2;
                    Wg4[] wg4Arr4 = new Wg4[i2];
                    if (length2 != 0) {
                        System.arraycopy(wg4Arr3, 0, wg4Arr4, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        Wg4 wg43 = new Wg4();
                        wg4Arr4[length2] = wg43;
                        c12129zV.f(wg43);
                        c12129zV.m();
                        length2++;
                    }
                    Wg4 wg44 = new Wg4();
                    wg4Arr4[length2] = wg44;
                    c12129zV.f(wg44);
                    this.m = wg4Arr4;
                    break;
                case 74:
                    int a3 = AbstractC11226wq4.a(c12129zV, 74);
                    Wg4[] wg4Arr5 = this.n;
                    int length3 = wg4Arr5 == null ? 0 : wg4Arr5.length;
                    int i3 = a3 + length3;
                    Wg4[] wg4Arr6 = new Wg4[i3];
                    if (length3 != 0) {
                        System.arraycopy(wg4Arr5, 0, wg4Arr6, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        Wg4 wg45 = new Wg4();
                        wg4Arr6[length3] = wg45;
                        c12129zV.f(wg45);
                        c12129zV.m();
                        length3++;
                    }
                    Wg4 wg46 = new Wg4();
                    wg4Arr6[length3] = wg46;
                    c12129zV.f(wg46);
                    this.n = wg4Arr6;
                    break;
                case 82:
                    int a4 = AbstractC11226wq4.a(c12129zV, 82);
                    Wg4[] wg4Arr7 = this.o;
                    int length4 = wg4Arr7 == null ? 0 : wg4Arr7.length;
                    int i4 = a4 + length4;
                    Wg4[] wg4Arr8 = new Wg4[i4];
                    if (length4 != 0) {
                        System.arraycopy(wg4Arr7, 0, wg4Arr8, 0, length4);
                    }
                    while (length4 < i4 - 1) {
                        Wg4 wg47 = new Wg4();
                        wg4Arr8[length4] = wg47;
                        c12129zV.f(wg47);
                        c12129zV.m();
                        length4++;
                    }
                    Wg4 wg48 = new Wg4();
                    wg4Arr8[length4] = wg48;
                    c12129zV.f(wg48);
                    this.o = wg4Arr8;
                    break;
                case 90:
                    int a5 = AbstractC11226wq4.a(c12129zV, 90);
                    Wg4[] wg4Arr9 = this.p;
                    int length5 = wg4Arr9 == null ? 0 : wg4Arr9.length;
                    int i5 = a5 + length5;
                    Wg4[] wg4Arr10 = new Wg4[i5];
                    if (length5 != 0) {
                        System.arraycopy(wg4Arr9, 0, wg4Arr10, 0, length5);
                    }
                    while (length5 < i5 - 1) {
                        Wg4 wg49 = new Wg4();
                        wg4Arr10[length5] = wg49;
                        c12129zV.f(wg49);
                        c12129zV.m();
                        length5++;
                    }
                    Wg4 wg410 = new Wg4();
                    wg4Arr10[length5] = wg410;
                    c12129zV.f(wg410);
                    this.p = wg4Arr10;
                    break;
                case 98:
                    int a6 = AbstractC11226wq4.a(c12129zV, 98);
                    Wg4[] wg4Arr11 = this.q;
                    int length6 = wg4Arr11 == null ? 0 : wg4Arr11.length;
                    int i6 = a6 + length6;
                    Wg4[] wg4Arr12 = new Wg4[i6];
                    if (length6 != 0) {
                        System.arraycopy(wg4Arr11, 0, wg4Arr12, 0, length6);
                    }
                    while (length6 < i6 - 1) {
                        Wg4 wg411 = new Wg4();
                        wg4Arr12[length6] = wg411;
                        c12129zV.f(wg411);
                        c12129zV.m();
                        length6++;
                    }
                    Wg4 wg412 = new Wg4();
                    wg4Arr12[length6] = wg412;
                    c12129zV.f(wg412);
                    this.q = wg4Arr12;
                    break;
                case 106:
                    int a7 = AbstractC11226wq4.a(c12129zV, 106);
                    Wg4[] wg4Arr13 = this.r;
                    int length7 = wg4Arr13 == null ? 0 : wg4Arr13.length;
                    int i7 = a7 + length7;
                    Wg4[] wg4Arr14 = new Wg4[i7];
                    if (length7 != 0) {
                        System.arraycopy(wg4Arr13, 0, wg4Arr14, 0, length7);
                    }
                    while (length7 < i7 - 1) {
                        Wg4 wg413 = new Wg4();
                        wg4Arr14[length7] = wg413;
                        c12129zV.f(wg413);
                        c12129zV.m();
                        length7++;
                    }
                    Wg4 wg414 = new Wg4();
                    wg4Arr14[length7] = wg414;
                    c12129zV.f(wg414);
                    this.r = wg4Arr14;
                    break;
                case 112:
                    this.s = Integer.valueOf(c12129zV.j());
                    break;
                case 122:
                    int j = c12129zV.j();
                    int b = c12129zV.b(j);
                    int i8 = j / 4;
                    float[] fArr = this.t;
                    int length8 = fArr == null ? 0 : fArr.length;
                    int i9 = i8 + length8;
                    float[] fArr2 = new float[i9];
                    if (length8 != 0) {
                        System.arraycopy(fArr, 0, fArr2, 0, length8);
                    }
                    while (length8 < i9) {
                        fArr2[length8] = c12129zV.e();
                        length8++;
                    }
                    this.t = fArr2;
                    c12129zV.a(b);
                    break;
                case 125:
                    int a8 = AbstractC11226wq4.a(c12129zV, 125);
                    float[] fArr3 = this.t;
                    int length9 = fArr3 == null ? 0 : fArr3.length;
                    int i10 = a8 + length9;
                    float[] fArr4 = new float[i10];
                    if (length9 != 0) {
                        System.arraycopy(fArr3, 0, fArr4, 0, length9);
                    }
                    while (length9 < i10 - 1) {
                        fArr4[length9] = c12129zV.e();
                        c12129zV.m();
                        length9++;
                    }
                    fArr4[length9] = c12129zV.e();
                    this.t = fArr4;
                    break;
                case 130:
                    int j2 = c12129zV.j();
                    int b2 = c12129zV.b(j2);
                    int i11 = j2 / 4;
                    float[] fArr5 = this.u;
                    int length10 = fArr5 == null ? 0 : fArr5.length;
                    int i12 = i11 + length10;
                    float[] fArr6 = new float[i12];
                    if (length10 != 0) {
                        System.arraycopy(fArr5, 0, fArr6, 0, length10);
                    }
                    while (length10 < i12) {
                        fArr6[length10] = c12129zV.e();
                        length10++;
                    }
                    this.u = fArr6;
                    c12129zV.a(b2);
                    break;
                case 133:
                    int a9 = AbstractC11226wq4.a(c12129zV, 133);
                    float[] fArr7 = this.u;
                    int length11 = fArr7 == null ? 0 : fArr7.length;
                    int i13 = a9 + length11;
                    float[] fArr8 = new float[i13];
                    if (length11 != 0) {
                        System.arraycopy(fArr7, 0, fArr8, 0, length11);
                    }
                    while (length11 < i13 - 1) {
                        fArr8[length11] = c12129zV.e();
                        c12129zV.m();
                        length11++;
                    }
                    fArr8[length11] = c12129zV.e();
                    this.u = fArr8;
                    break;
                case 138:
                    int j3 = c12129zV.j();
                    int b3 = c12129zV.b(j3);
                    int i14 = j3 / 4;
                    float[] fArr9 = this.v;
                    int length12 = fArr9 == null ? 0 : fArr9.length;
                    int i15 = i14 + length12;
                    float[] fArr10 = new float[i15];
                    if (length12 != 0) {
                        System.arraycopy(fArr9, 0, fArr10, 0, length12);
                    }
                    while (length12 < i15) {
                        fArr10[length12] = c12129zV.e();
                        length12++;
                    }
                    this.v = fArr10;
                    c12129zV.a(b3);
                    break;
                case 141:
                    int a10 = AbstractC11226wq4.a(c12129zV, 141);
                    float[] fArr11 = this.v;
                    int length13 = fArr11 == null ? 0 : fArr11.length;
                    int i16 = a10 + length13;
                    float[] fArr12 = new float[i16];
                    if (length13 != 0) {
                        System.arraycopy(fArr11, 0, fArr12, 0, length13);
                    }
                    while (length13 < i16 - 1) {
                        fArr12[length13] = c12129zV.e();
                        c12129zV.m();
                        length13++;
                    }
                    fArr12[length13] = c12129zV.e();
                    this.v = fArr12;
                    break;
                case 146:
                    int j4 = c12129zV.j();
                    int b4 = c12129zV.b(j4);
                    int i17 = j4 / 4;
                    float[] fArr13 = this.w;
                    int length14 = fArr13 == null ? 0 : fArr13.length;
                    int i18 = i17 + length14;
                    float[] fArr14 = new float[i18];
                    if (length14 != 0) {
                        System.arraycopy(fArr13, 0, fArr14, 0, length14);
                    }
                    while (length14 < i18) {
                        fArr14[length14] = c12129zV.e();
                        length14++;
                    }
                    this.w = fArr14;
                    c12129zV.a(b4);
                    break;
                case 149:
                    int a11 = AbstractC11226wq4.a(c12129zV, 149);
                    float[] fArr15 = this.w;
                    int length15 = fArr15 == null ? 0 : fArr15.length;
                    int i19 = a11 + length15;
                    float[] fArr16 = new float[i19];
                    if (length15 != 0) {
                        System.arraycopy(fArr15, 0, fArr16, 0, length15);
                    }
                    while (length15 < i19 - 1) {
                        fArr16[length15] = c12129zV.e();
                        c12129zV.m();
                        length15++;
                    }
                    fArr16[length15] = c12129zV.e();
                    this.w = fArr16;
                    break;
                case 154:
                    int j5 = c12129zV.j();
                    int b5 = c12129zV.b(j5);
                    int i20 = j5 / 4;
                    float[] fArr17 = this.x;
                    int length16 = fArr17 == null ? 0 : fArr17.length;
                    int i21 = i20 + length16;
                    float[] fArr18 = new float[i21];
                    if (length16 != 0) {
                        System.arraycopy(fArr17, 0, fArr18, 0, length16);
                    }
                    while (length16 < i21) {
                        fArr18[length16] = c12129zV.e();
                        length16++;
                    }
                    this.x = fArr18;
                    c12129zV.a(b5);
                    break;
                case 157:
                    int a12 = AbstractC11226wq4.a(c12129zV, 157);
                    float[] fArr19 = this.x;
                    int length17 = fArr19 == null ? 0 : fArr19.length;
                    int i22 = a12 + length17;
                    float[] fArr20 = new float[i22];
                    if (length17 != 0) {
                        System.arraycopy(fArr19, 0, fArr20, 0, length17);
                    }
                    while (length17 < i22 - 1) {
                        fArr20[length17] = c12129zV.e();
                        c12129zV.m();
                        length17++;
                    }
                    fArr20[length17] = c12129zV.e();
                    this.x = fArr20;
                    break;
                case 162:
                    int j6 = c12129zV.j();
                    int b6 = c12129zV.b(j6);
                    int i23 = j6 / 4;
                    float[] fArr21 = this.y;
                    int length18 = fArr21 == null ? 0 : fArr21.length;
                    int i24 = i23 + length18;
                    float[] fArr22 = new float[i24];
                    if (length18 != 0) {
                        System.arraycopy(fArr21, 0, fArr22, 0, length18);
                    }
                    while (length18 < i24) {
                        fArr22[length18] = c12129zV.e();
                        length18++;
                    }
                    this.y = fArr22;
                    c12129zV.a(b6);
                    break;
                case 165:
                    int a13 = AbstractC11226wq4.a(c12129zV, 165);
                    float[] fArr23 = this.y;
                    int length19 = fArr23 == null ? 0 : fArr23.length;
                    int i25 = a13 + length19;
                    float[] fArr24 = new float[i25];
                    if (length19 != 0) {
                        System.arraycopy(fArr23, 0, fArr24, 0, length19);
                    }
                    while (length19 < i25 - 1) {
                        fArr24[length19] = c12129zV.e();
                        c12129zV.m();
                        length19++;
                    }
                    fArr24[length19] = c12129zV.e();
                    this.y = fArr24;
                    break;
                case 173:
                    this.z = Float.valueOf(c12129zV.e());
                    break;
                case 181:
                    this.A = Float.valueOf(c12129zV.e());
                    break;
                default:
                    if (!super.storeUnknownField(c12129zV, m)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
