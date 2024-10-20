package com.google.vr.sdk.proto.nano;

import defpackage.AbstractC11226wq4;
import defpackage.C12129zV;
import defpackage.GV;
import defpackage.RF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Preferences$SafetyCylinderParams extends RF0 implements Cloneable {
    private float anchorWarningDistance_;
    private int bitField0_;
    private float collisionSphereRadius_;
    private float enterEventRadius_;
    private float exitEventRadius_;
    private boolean graphicsEnabled_;
    public float[] innerFogColor;
    private float innerRadius_;
    public float[] outerFogColor;
    private float outerRadius_;

    public Preferences$SafetyCylinderParams() {
        clear();
    }

    public final Preferences$SafetyCylinderParams clear() {
        this.bitField0_ = 0;
        this.collisionSphereRadius_ = 0.0f;
        this.innerRadius_ = 0.0f;
        this.outerRadius_ = 0.0f;
        float[] fArr = AbstractC11226wq4.b;
        this.innerFogColor = fArr;
        this.outerFogColor = fArr;
        this.enterEventRadius_ = 0.0f;
        this.exitEventRadius_ = 0.0f;
        this.anchorWarningDistance_ = 0.0f;
        this.graphicsEnabled_ = true;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // defpackage.AbstractC8015nV1
    public final Preferences$SafetyCylinderParams clone() {
        try {
            Preferences$SafetyCylinderParams preferences$SafetyCylinderParams = (Preferences$SafetyCylinderParams) a();
            float[] fArr = this.innerFogColor;
            if (fArr != null && fArr.length > 0) {
                preferences$SafetyCylinderParams.innerFogColor = (float[]) fArr.clone();
            }
            float[] fArr2 = this.outerFogColor;
            if (fArr2 != null && fArr2.length > 0) {
                preferences$SafetyCylinderParams.outerFogColor = (float[]) fArr2.clone();
            }
            return preferences$SafetyCylinderParams;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        if ((this.bitField0_ & 1) != 0) {
            gv.p(1, this.collisionSphereRadius_);
        }
        if ((this.bitField0_ & 2) != 0) {
            gv.p(2, this.innerRadius_);
        }
        if ((this.bitField0_ & 4) != 0) {
            gv.p(3, this.outerRadius_);
        }
        float[] fArr = this.innerFogColor;
        int i = 0;
        if (fArr != null && fArr.length > 0) {
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.innerFogColor;
                if (i2 >= fArr2.length) {
                    break;
                }
                gv.p(4, fArr2[i2]);
                i2++;
            }
        }
        float[] fArr3 = this.outerFogColor;
        if (fArr3 != null && fArr3.length > 0) {
            while (true) {
                float[] fArr4 = this.outerFogColor;
                if (i >= fArr4.length) {
                    break;
                }
                gv.p(5, fArr4[i]);
                i++;
            }
        }
        if ((this.bitField0_ & 8) != 0) {
            gv.p(6, this.enterEventRadius_);
        }
        if ((this.bitField0_ & 16) != 0) {
            gv.p(7, this.exitEventRadius_);
        }
        if ((this.bitField0_ & 32) != 0) {
            gv.p(8, this.anchorWarningDistance_);
        }
        if ((this.bitField0_ & 64) != 0) {
            gv.n(9, this.graphicsEnabled_);
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
        float[] fArr = this.innerFogColor;
        if (fArr != null && fArr.length > 0) {
            computeSerializedSize = computeSerializedSize + (fArr.length * 4) + (fArr.length * 1);
        }
        float[] fArr2 = this.outerFogColor;
        if (fArr2 != null && fArr2.length > 0) {
            computeSerializedSize = computeSerializedSize + (fArr2.length * 4) + (fArr2.length * 1);
        }
        if ((this.bitField0_ & 8) != 0) {
            computeSerializedSize += GV.c(6);
        }
        if ((this.bitField0_ & 16) != 0) {
            computeSerializedSize += GV.c(7);
        }
        if ((this.bitField0_ & 32) != 0) {
            computeSerializedSize += GV.c(8);
        }
        return (this.bitField0_ & 64) != 0 ? computeSerializedSize + GV.a(9) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final Preferences$SafetyCylinderParams mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            switch (m) {
                case 0:
                    return this;
                case 13:
                    this.collisionSphereRadius_ = c12129zV.e();
                    this.bitField0_ |= 1;
                    break;
                case 21:
                    this.innerRadius_ = c12129zV.e();
                    this.bitField0_ |= 2;
                    break;
                case 29:
                    this.outerRadius_ = c12129zV.e();
                    this.bitField0_ |= 4;
                    break;
                case 34:
                    int j = c12129zV.j();
                    int b = c12129zV.b(j);
                    int i = j / 4;
                    float[] fArr = this.innerFogColor;
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
                    this.innerFogColor = fArr2;
                    c12129zV.a(b);
                    break;
                case 37:
                    int a = AbstractC11226wq4.a(c12129zV, 37);
                    float[] fArr3 = this.innerFogColor;
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
                    this.innerFogColor = fArr4;
                    break;
                case 42:
                    int j2 = c12129zV.j();
                    int b2 = c12129zV.b(j2);
                    int i4 = j2 / 4;
                    float[] fArr5 = this.outerFogColor;
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
                    this.outerFogColor = fArr6;
                    c12129zV.a(b2);
                    break;
                case 45:
                    int a2 = AbstractC11226wq4.a(c12129zV, 45);
                    float[] fArr7 = this.outerFogColor;
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
                    this.outerFogColor = fArr8;
                    break;
                case 53:
                    this.enterEventRadius_ = c12129zV.e();
                    this.bitField0_ |= 8;
                    break;
                case 61:
                    this.exitEventRadius_ = c12129zV.e();
                    this.bitField0_ |= 16;
                    break;
                case 69:
                    this.anchorWarningDistance_ = c12129zV.e();
                    this.bitField0_ |= 32;
                    break;
                case 72:
                    this.graphicsEnabled_ = c12129zV.c();
                    this.bitField0_ |= 64;
                    break;
                default:
                    if (!super.storeUnknownField(c12129zV, m)) {
                        return this;
                    }
                    break;
            }
        }
    }
}
