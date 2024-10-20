package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Sg4 extends RF0 implements Cloneable {
    public static volatile Sg4[] j;
    public Long a = null;
    public Boolean g = null;
    public float[] h;
    public float[] i;

    public Sg4() {
        float[] fArr = AbstractC11226wq4.b;
        this.h = fArr;
        this.i = fArr;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    @Override // defpackage.AbstractC8015nV1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Sg4 clone() {
        try {
            Sg4 sg4 = (Sg4) a();
            float[] fArr = this.h;
            if (fArr != null && fArr.length > 0) {
                sg4.h = (float[]) fArr.clone();
            }
            float[] fArr2 = this.i;
            if (fArr2 != null && fArr2.length > 0) {
                sg4.i = (float[]) fArr2.clone();
            }
            return sg4;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        Long l = this.a;
        if (l != null) {
            gv.s(1, l.longValue());
        }
        Boolean bool = this.g;
        if (bool != null) {
            gv.n(2, bool.booleanValue());
        }
        float[] fArr = this.h;
        int i = 0;
        if (fArr != null && fArr.length > 0) {
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.h;
                if (i2 >= fArr2.length) {
                    break;
                }
                gv.p(3, fArr2[i2]);
                i2++;
            }
        }
        float[] fArr3 = this.i;
        if (fArr3 != null && fArr3.length > 0) {
            while (true) {
                float[] fArr4 = this.i;
                if (i >= fArr4.length) {
                    break;
                }
                gv.p(4, fArr4[i]);
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
        Boolean bool = this.g;
        if (bool != null) {
            bool.booleanValue();
            computeSerializedSize += GV.a(2);
        }
        float[] fArr = this.h;
        if (fArr != null && fArr.length > 0) {
            computeSerializedSize = computeSerializedSize + (fArr.length * 4) + (fArr.length * 1);
        }
        float[] fArr2 = this.i;
        return (fArr2 == null || fArr2.length <= 0) ? computeSerializedSize : computeSerializedSize + (fArr2.length * 4) + (fArr2.length * 1);
    }

    @Override // defpackage.AbstractC8015nV1
    public final AbstractC8015nV1 mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                break;
            }
            if (m == 8) {
                this.a = Long.valueOf(c12129zV.k());
            } else if (m == 16) {
                this.g = Boolean.valueOf(c12129zV.c());
            } else if (m == 26) {
                int j2 = c12129zV.j();
                int b = c12129zV.b(j2);
                int i = j2 / 4;
                float[] fArr = this.h;
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
                this.h = fArr2;
                c12129zV.a(b);
            } else if (m == 29) {
                int a = AbstractC11226wq4.a(c12129zV, 29);
                float[] fArr3 = this.h;
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
                this.h = fArr4;
            } else if (m == 34) {
                int j3 = c12129zV.j();
                int b2 = c12129zV.b(j3);
                int i4 = j3 / 4;
                float[] fArr5 = this.i;
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
                this.i = fArr6;
                c12129zV.a(b2);
            } else if (m != 37) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    break;
                }
            } else {
                int a2 = AbstractC11226wq4.a(c12129zV, 37);
                float[] fArr7 = this.i;
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
                this.i = fArr8;
            }
        }
        return this;
    }
}
