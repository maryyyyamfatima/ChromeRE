package com.google.vr.sdk.proto.nano;

import defpackage.AbstractC11226wq4;
import defpackage.C12129zV;
import defpackage.GV;
import defpackage.RF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Display$DisplayParams extends RF0 implements Cloneable {
    private int bitField0_;
    private float bottomBezelHeight_;
    public float[] dEPRECATEDGyroBias;
    private float xPpi_;
    private float yPpi_;

    public final float getXPpi() {
        return this.xPpi_;
    }

    public final boolean hasXPpi() {
        return (this.bitField0_ & 1) != 0;
    }

    public final Display$DisplayParams setXPpi(float f) {
        this.bitField0_ |= 1;
        this.xPpi_ = f;
        return this;
    }

    public final float getYPpi() {
        return this.yPpi_;
    }

    public final boolean hasYPpi() {
        return (this.bitField0_ & 2) != 0;
    }

    public final Display$DisplayParams setYPpi(float f) {
        this.bitField0_ |= 2;
        this.yPpi_ = f;
        return this;
    }

    public final float getBottomBezelHeight() {
        return this.bottomBezelHeight_;
    }

    public final boolean hasBottomBezelHeight() {
        return (this.bitField0_ & 4) != 0;
    }

    public Display$DisplayParams() {
        clear();
    }

    public final Display$DisplayParams clear() {
        this.bitField0_ = 0;
        this.xPpi_ = 0.0f;
        this.yPpi_ = 0.0f;
        this.bottomBezelHeight_ = 0.0f;
        this.dEPRECATEDGyroBias = AbstractC11226wq4.b;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // defpackage.AbstractC8015nV1
    public final Display$DisplayParams clone() {
        try {
            Display$DisplayParams display$DisplayParams = (Display$DisplayParams) a();
            float[] fArr = this.dEPRECATEDGyroBias;
            if (fArr != null && fArr.length > 0) {
                display$DisplayParams.dEPRECATEDGyroBias = (float[]) fArr.clone();
            }
            return display$DisplayParams;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        if ((this.bitField0_ & 1) != 0) {
            gv.p(1, this.xPpi_);
        }
        if ((this.bitField0_ & 2) != 0) {
            gv.p(2, this.yPpi_);
        }
        if ((this.bitField0_ & 4) != 0) {
            gv.p(3, this.bottomBezelHeight_);
        }
        float[] fArr = this.dEPRECATEDGyroBias;
        if (fArr != null && fArr.length > 0) {
            int length = fArr.length * 4;
            gv.v(34);
            gv.v(length);
            int i = 0;
            while (true) {
                float[] fArr2 = this.dEPRECATEDGyroBias;
                if (i >= fArr2.length) {
                    break;
                }
                gv.q(fArr2[i]);
                i++;
            }
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += GV.c(1);
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += GV.c(2);
        }
        if ((this.bitField0_ & 4) != 0) {
            computeSerializedSize += GV.c(3);
        }
        float[] fArr = this.dEPRECATEDGyroBias;
        if (fArr == null || fArr.length <= 0) {
            return computeSerializedSize;
        }
        int length = fArr.length * 4;
        return computeSerializedSize + length + 1 + GV.g(length);
    }

    @Override // defpackage.AbstractC8015nV1
    public final Display$DisplayParams mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                return this;
            }
            if (m == 13) {
                this.xPpi_ = c12129zV.e();
                this.bitField0_ |= 1;
            } else if (m == 21) {
                this.yPpi_ = c12129zV.e();
                this.bitField0_ |= 2;
            } else if (m == 29) {
                this.bottomBezelHeight_ = c12129zV.e();
                this.bitField0_ |= 4;
            } else if (m == 34) {
                int j = c12129zV.j();
                int b = c12129zV.b(j);
                int i = j / 4;
                float[] fArr = this.dEPRECATEDGyroBias;
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
                this.dEPRECATEDGyroBias = fArr2;
                c12129zV.a(b);
            } else if (m != 37) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    return this;
                }
            } else {
                int a = AbstractC11226wq4.a(c12129zV, 37);
                float[] fArr3 = this.dEPRECATEDGyroBias;
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
                this.dEPRECATEDGyroBias = fArr4;
            }
        }
    }
}
