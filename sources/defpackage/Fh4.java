package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Fh4 extends RF0 implements Cloneable {
    public static volatile Fh4[] o;
    public Integer a = null;
    public Float g = null;
    public Integer h = null;
    public Integer i = null;
    public Integer j = null;
    public Integer k = null;
    public float[] l;
    public float[] m;
    public float[] n;

    public Fh4() {
        float[] fArr = AbstractC11226wq4.b;
        this.l = fArr;
        this.m = fArr;
        this.n = fArr;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Fh4 clone() {
        try {
            Fh4 fh4 = (Fh4) a();
            float[] fArr = this.l;
            if (fArr != null && fArr.length > 0) {
                fh4.l = (float[]) fArr.clone();
            }
            float[] fArr2 = this.m;
            if (fArr2 != null && fArr2.length > 0) {
                fh4.m = (float[]) fArr2.clone();
            }
            float[] fArr3 = this.n;
            if (fArr3 != null && fArr3.length > 0) {
                fh4.n = (float[]) fArr3.clone();
            }
            return fh4;
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
        Float f = this.g;
        if (f != null) {
            gv.p(2, f.floatValue());
        }
        Integer num2 = this.h;
        if (num2 != null) {
            gv.r(3, num2.intValue());
        }
        Integer num3 = this.i;
        if (num3 != null) {
            gv.r(4, num3.intValue());
        }
        Integer num4 = this.j;
        if (num4 != null) {
            gv.r(5, num4.intValue());
        }
        Integer num5 = this.k;
        if (num5 != null) {
            gv.r(6, num5.intValue());
        }
        float[] fArr = this.l;
        int i = 0;
        if (fArr != null && fArr.length > 0) {
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.l;
                if (i2 >= fArr2.length) {
                    break;
                }
                gv.p(7, fArr2[i2]);
                i2++;
            }
        }
        float[] fArr3 = this.m;
        if (fArr3 != null && fArr3.length > 0) {
            int i3 = 0;
            while (true) {
                float[] fArr4 = this.m;
                if (i3 >= fArr4.length) {
                    break;
                }
                gv.p(8, fArr4[i3]);
                i3++;
            }
        }
        float[] fArr5 = this.n;
        if (fArr5 != null && fArr5.length > 0) {
            while (true) {
                float[] fArr6 = this.n;
                if (i >= fArr6.length) {
                    break;
                }
                gv.p(9, fArr6[i]);
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
        Float f = this.g;
        if (f != null) {
            f.floatValue();
            computeSerializedSize += GV.c(2);
        }
        Integer num2 = this.h;
        if (num2 != null) {
            computeSerializedSize += GV.d(3, num2.intValue());
        }
        Integer num3 = this.i;
        if (num3 != null) {
            computeSerializedSize += GV.d(4, num3.intValue());
        }
        Integer num4 = this.j;
        if (num4 != null) {
            computeSerializedSize += GV.d(5, num4.intValue());
        }
        Integer num5 = this.k;
        if (num5 != null) {
            computeSerializedSize += GV.d(6, num5.intValue());
        }
        float[] fArr = this.l;
        if (fArr != null && fArr.length > 0) {
            computeSerializedSize = computeSerializedSize + (fArr.length * 4) + (fArr.length * 1);
        }
        float[] fArr2 = this.m;
        if (fArr2 != null && fArr2.length > 0) {
            computeSerializedSize = computeSerializedSize + (fArr2.length * 4) + (fArr2.length * 1);
        }
        float[] fArr3 = this.n;
        return (fArr3 == null || fArr3.length <= 0) ? computeSerializedSize : computeSerializedSize + (fArr3.length * 4) + (fArr3.length * 1);
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
                case 21:
                    this.g = Float.valueOf(c12129zV.e());
                    break;
                case 24:
                    this.h = Integer.valueOf(c12129zV.j());
                    break;
                case 32:
                    this.i = Integer.valueOf(c12129zV.j());
                    break;
                case 40:
                    this.j = Integer.valueOf(c12129zV.j());
                    break;
                case 48:
                    this.k = Integer.valueOf(c12129zV.j());
                    break;
                case 58:
                    int j = c12129zV.j();
                    int b = c12129zV.b(j);
                    int i = j / 4;
                    float[] fArr = this.l;
                    int length = fArr == null ? 0 : fArr.length;
                    int i2 = i + length;
                    float[] fArr2 = new float[i2];
                    if (length != 0) {
                        System.arraycopy(fArr, 0, fArr2, 0, length);
                    }
                    while (length < i2) {
                        fArr2[length] = c12129zV.e();
                        length++;
                    }
                    this.l = fArr2;
                    c12129zV.a(b);
                    break;
                case 61:
                    int a = AbstractC11226wq4.a(c12129zV, 61);
                    float[] fArr3 = this.l;
                    int length2 = fArr3 == null ? 0 : fArr3.length;
                    int i3 = a + length2;
                    float[] fArr4 = new float[i3];
                    if (length2 != 0) {
                        System.arraycopy(fArr3, 0, fArr4, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        fArr4[length2] = c12129zV.e();
                        c12129zV.m();
                        length2++;
                    }
                    fArr4[length2] = c12129zV.e();
                    this.l = fArr4;
                    break;
                case 66:
                    int j2 = c12129zV.j();
                    int b2 = c12129zV.b(j2);
                    int i4 = j2 / 4;
                    float[] fArr5 = this.m;
                    int length3 = fArr5 == null ? 0 : fArr5.length;
                    int i5 = i4 + length3;
                    float[] fArr6 = new float[i5];
                    if (length3 != 0) {
                        System.arraycopy(fArr5, 0, fArr6, 0, length3);
                    }
                    while (length3 < i5) {
                        fArr6[length3] = c12129zV.e();
                        length3++;
                    }
                    this.m = fArr6;
                    c12129zV.a(b2);
                    break;
                case 69:
                    int a2 = AbstractC11226wq4.a(c12129zV, 69);
                    float[] fArr7 = this.m;
                    int length4 = fArr7 == null ? 0 : fArr7.length;
                    int i6 = a2 + length4;
                    float[] fArr8 = new float[i6];
                    if (length4 != 0) {
                        System.arraycopy(fArr7, 0, fArr8, 0, length4);
                    }
                    while (length4 < i6 - 1) {
                        fArr8[length4] = c12129zV.e();
                        c12129zV.m();
                        length4++;
                    }
                    fArr8[length4] = c12129zV.e();
                    this.m = fArr8;
                    break;
                case 74:
                    int j3 = c12129zV.j();
                    int b3 = c12129zV.b(j3);
                    int i7 = j3 / 4;
                    float[] fArr9 = this.n;
                    int length5 = fArr9 == null ? 0 : fArr9.length;
                    int i8 = i7 + length5;
                    float[] fArr10 = new float[i8];
                    if (length5 != 0) {
                        System.arraycopy(fArr9, 0, fArr10, 0, length5);
                    }
                    while (length5 < i8) {
                        fArr10[length5] = c12129zV.e();
                        length5++;
                    }
                    this.n = fArr10;
                    c12129zV.a(b3);
                    break;
                case 77:
                    int a3 = AbstractC11226wq4.a(c12129zV, 77);
                    float[] fArr11 = this.n;
                    int length6 = fArr11 == null ? 0 : fArr11.length;
                    int i9 = a3 + length6;
                    float[] fArr12 = new float[i9];
                    if (length6 != 0) {
                        System.arraycopy(fArr11, 0, fArr12, 0, length6);
                    }
                    while (length6 < i9 - 1) {
                        fArr12[length6] = c12129zV.e();
                        c12129zV.m();
                        length6++;
                    }
                    fArr12[length6] = c12129zV.e();
                    this.n = fArr12;
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
