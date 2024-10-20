package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Ug4 extends RF0 implements Cloneable {
    public Float a = null;
    public Float g = null;
    public Float h = null;
    public float[] i;
    public float[] j;
    public Float k;
    public Float l;
    public Float m;

    public Ug4() {
        float[] fArr = AbstractC11226wq4.b;
        this.i = fArr;
        this.j = fArr;
        this.k = null;
        this.l = null;
        this.m = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Ug4 clone() {
        try {
            Ug4 ug4 = (Ug4) a();
            float[] fArr = this.i;
            if (fArr != null && fArr.length > 0) {
                ug4.i = (float[]) fArr.clone();
            }
            float[] fArr2 = this.j;
            if (fArr2 != null && fArr2.length > 0) {
                ug4.j = (float[]) fArr2.clone();
            }
            return ug4;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Float f = this.a;
        if (f != null) {
            gv.p(1, f.floatValue());
        }
        Float f2 = this.g;
        if (f2 != null) {
            gv.p(2, f2.floatValue());
        }
        Float f3 = this.h;
        if (f3 != null) {
            gv.p(3, f3.floatValue());
        }
        float[] fArr = this.i;
        int i = 0;
        if (fArr != null && fArr.length > 0) {
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.i;
                if (i2 >= fArr2.length) {
                    break;
                }
                gv.p(4, fArr2[i2]);
                i2++;
            }
        }
        float[] fArr3 = this.j;
        if (fArr3 != null && fArr3.length > 0) {
            while (true) {
                float[] fArr4 = this.j;
                if (i >= fArr4.length) {
                    break;
                }
                gv.p(5, fArr4[i]);
                i++;
            }
        }
        Float f4 = this.k;
        if (f4 != null) {
            gv.p(6, f4.floatValue());
        }
        Float f5 = this.l;
        if (f5 != null) {
            gv.p(7, f5.floatValue());
        }
        Float f6 = this.m;
        if (f6 != null) {
            gv.p(8, f6.floatValue());
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Float f = this.a;
        if (f != null) {
            f.floatValue();
            computeSerializedSize += GV.c(1);
        }
        Float f2 = this.g;
        if (f2 != null) {
            f2.floatValue();
            computeSerializedSize += GV.c(2);
        }
        Float f3 = this.h;
        if (f3 != null) {
            f3.floatValue();
            computeSerializedSize += GV.c(3);
        }
        float[] fArr = this.i;
        if (fArr != null && fArr.length > 0) {
            computeSerializedSize = computeSerializedSize + (fArr.length * 4) + (fArr.length * 1);
        }
        float[] fArr2 = this.j;
        if (fArr2 != null && fArr2.length > 0) {
            computeSerializedSize = computeSerializedSize + (fArr2.length * 4) + (fArr2.length * 1);
        }
        Float f4 = this.k;
        if (f4 != null) {
            f4.floatValue();
            computeSerializedSize += GV.c(6);
        }
        Float f5 = this.l;
        if (f5 != null) {
            f5.floatValue();
            computeSerializedSize += GV.c(7);
        }
        Float f6 = this.m;
        if (f6 == null) {
            return computeSerializedSize;
        }
        f6.floatValue();
        return computeSerializedSize + GV.c(8);
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            switch (m) {
                case 0:
                    break;
                case 13:
                    this.a = Float.valueOf(c12129zV.e());
                    break;
                case 21:
                    this.g = Float.valueOf(c12129zV.e());
                    break;
                case 29:
                    this.h = Float.valueOf(c12129zV.e());
                    break;
                case 34:
                    int j = c12129zV.j();
                    int b = c12129zV.b(j);
                    int i = j / 4;
                    float[] fArr = this.i;
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
                    this.i = fArr2;
                    c12129zV.a(b);
                    break;
                case 37:
                    int a = AbstractC11226wq4.a(c12129zV, 37);
                    float[] fArr3 = this.i;
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
                    this.i = fArr4;
                    break;
                case 42:
                    int j2 = c12129zV.j();
                    int b2 = c12129zV.b(j2);
                    int i4 = j2 / 4;
                    float[] fArr5 = this.j;
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
                    this.j = fArr6;
                    c12129zV.a(b2);
                    break;
                case 45:
                    int a2 = AbstractC11226wq4.a(c12129zV, 45);
                    float[] fArr7 = this.j;
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
                    this.j = fArr8;
                    break;
                case 53:
                    this.k = Float.valueOf(c12129zV.e());
                    break;
                case 61:
                    this.l = Float.valueOf(c12129zV.e());
                    break;
                case 69:
                    this.m = Float.valueOf(c12129zV.e());
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
