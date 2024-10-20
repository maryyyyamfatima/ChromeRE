package com.google.vr.sdk.proto.nano;

import defpackage.AbstractC11226wq4;
import defpackage.C12129zV;
import defpackage.GV;
import defpackage.RF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class CardboardDevice$DeviceParams extends RF0 implements Cloneable {
    private int bitField0_;
    public float[] blueDistortionCoefficients;
    public CardboardDevice$DaydreamInternalParams daydreamInternal;
    public float[] distortionCoefficients;
    public float[] greenDistortionCoefficients;
    private boolean hasMagnet_;
    private float interLensDistance_;
    public CardboardDevice$CardboardInternalParams internal;
    public float[] leftEyeFieldOfViewAngles;
    private String model_;
    private int primaryButton_;
    private float screenToLensDistance_;
    private float trayToLensDistance_;
    private String vendor_;
    private int verticalAlignment_;

    public static int checkVerticalAlignmentTypeOrThrow(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return i;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append(i);
        sb.append(" is not a valid enum VerticalAlignmentType");
        throw new IllegalArgumentException(sb.toString());
    }

    public static int checkButtonTypeOrThrow(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            return i;
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append(i);
        sb.append(" is not a valid enum ButtonType");
        throw new IllegalArgumentException(sb.toString());
    }

    public final float getTrayToLensDistance() {
        return this.trayToLensDistance_;
    }

    public CardboardDevice$DeviceParams() {
        clear();
    }

    public final CardboardDevice$DeviceParams clear() {
        this.bitField0_ = 0;
        this.vendor_ = "";
        this.model_ = "";
        this.screenToLensDistance_ = 0.0f;
        this.interLensDistance_ = 0.0f;
        float[] fArr = AbstractC11226wq4.b;
        this.leftEyeFieldOfViewAngles = fArr;
        this.verticalAlignment_ = 0;
        this.trayToLensDistance_ = 0.0f;
        this.distortionCoefficients = fArr;
        this.greenDistortionCoefficients = fArr;
        this.blueDistortionCoefficients = fArr;
        this.hasMagnet_ = false;
        this.primaryButton_ = 1;
        this.internal = null;
        this.daydreamInternal = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // defpackage.AbstractC8015nV1
    public final CardboardDevice$DeviceParams clone() {
        try {
            CardboardDevice$DeviceParams cardboardDevice$DeviceParams = (CardboardDevice$DeviceParams) a();
            float[] fArr = this.leftEyeFieldOfViewAngles;
            if (fArr != null && fArr.length > 0) {
                cardboardDevice$DeviceParams.leftEyeFieldOfViewAngles = (float[]) fArr.clone();
            }
            float[] fArr2 = this.distortionCoefficients;
            if (fArr2 != null && fArr2.length > 0) {
                cardboardDevice$DeviceParams.distortionCoefficients = (float[]) fArr2.clone();
            }
            float[] fArr3 = this.greenDistortionCoefficients;
            if (fArr3 != null && fArr3.length > 0) {
                cardboardDevice$DeviceParams.greenDistortionCoefficients = (float[]) fArr3.clone();
            }
            float[] fArr4 = this.blueDistortionCoefficients;
            if (fArr4 != null && fArr4.length > 0) {
                cardboardDevice$DeviceParams.blueDistortionCoefficients = (float[]) fArr4.clone();
            }
            CardboardDevice$CardboardInternalParams cardboardDevice$CardboardInternalParams = this.internal;
            if (cardboardDevice$CardboardInternalParams != null) {
                cardboardDevice$DeviceParams.internal = cardboardDevice$CardboardInternalParams.clone();
            }
            CardboardDevice$DaydreamInternalParams cardboardDevice$DaydreamInternalParams = this.daydreamInternal;
            if (cardboardDevice$DaydreamInternalParams != null) {
                cardboardDevice$DeviceParams.daydreamInternal = cardboardDevice$DaydreamInternalParams.clone();
            }
            return cardboardDevice$DeviceParams;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        if ((this.bitField0_ & 1) != 0) {
            gv.x(1, this.vendor_);
        }
        if ((this.bitField0_ & 2) != 0) {
            gv.x(2, this.model_);
        }
        if ((this.bitField0_ & 4) != 0) {
            gv.p(3, this.screenToLensDistance_);
        }
        if ((this.bitField0_ & 8) != 0) {
            gv.p(4, this.interLensDistance_);
        }
        float[] fArr = this.leftEyeFieldOfViewAngles;
        int i = 0;
        if (fArr != null && fArr.length > 0) {
            int length = fArr.length * 4;
            gv.v(42);
            gv.v(length);
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.leftEyeFieldOfViewAngles;
                if (i2 >= fArr2.length) {
                    break;
                }
                gv.q(fArr2[i2]);
                i2++;
            }
        }
        if ((this.bitField0_ & 32) != 0) {
            gv.p(6, this.trayToLensDistance_);
        }
        float[] fArr3 = this.distortionCoefficients;
        if (fArr3 != null && fArr3.length > 0) {
            int length2 = fArr3.length * 4;
            gv.v(58);
            gv.v(length2);
            int i3 = 0;
            while (true) {
                float[] fArr4 = this.distortionCoefficients;
                if (i3 >= fArr4.length) {
                    break;
                }
                gv.q(fArr4[i3]);
                i3++;
            }
        }
        float[] fArr5 = this.greenDistortionCoefficients;
        if (fArr5 != null && fArr5.length > 0) {
            int length3 = fArr5.length * 4;
            gv.v(66);
            gv.v(length3);
            int i4 = 0;
            while (true) {
                float[] fArr6 = this.greenDistortionCoefficients;
                if (i4 >= fArr6.length) {
                    break;
                }
                gv.q(fArr6[i4]);
                i4++;
            }
        }
        float[] fArr7 = this.blueDistortionCoefficients;
        if (fArr7 != null && fArr7.length > 0) {
            int length4 = fArr7.length * 4;
            gv.v(74);
            gv.v(length4);
            while (true) {
                float[] fArr8 = this.blueDistortionCoefficients;
                if (i >= fArr8.length) {
                    break;
                }
                gv.q(fArr8[i]);
                i++;
            }
        }
        if ((this.bitField0_ & 64) != 0) {
            gv.n(10, this.hasMagnet_);
        }
        if ((this.bitField0_ & 16) != 0) {
            gv.r(11, this.verticalAlignment_);
        }
        if ((this.bitField0_ & 128) != 0) {
            gv.r(12, this.primaryButton_);
        }
        CardboardDevice$CardboardInternalParams cardboardDevice$CardboardInternalParams = this.internal;
        if (cardboardDevice$CardboardInternalParams != null) {
            gv.t(1729, cardboardDevice$CardboardInternalParams);
        }
        CardboardDevice$DaydreamInternalParams cardboardDevice$DaydreamInternalParams = this.daydreamInternal;
        if (cardboardDevice$DaydreamInternalParams != null) {
            gv.t(196883, cardboardDevice$DaydreamInternalParams);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += GV.i(1, this.vendor_);
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += GV.i(2, this.model_);
        }
        if ((this.bitField0_ & 4) != 0) {
            computeSerializedSize += GV.c(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            computeSerializedSize += GV.c(4);
        }
        float[] fArr = this.leftEyeFieldOfViewAngles;
        if (fArr != null && fArr.length > 0) {
            int length = fArr.length * 4;
            computeSerializedSize = computeSerializedSize + length + 1 + GV.g(length);
        }
        if ((this.bitField0_ & 32) != 0) {
            computeSerializedSize += GV.c(6);
        }
        float[] fArr2 = this.distortionCoefficients;
        if (fArr2 != null && fArr2.length > 0) {
            int length2 = fArr2.length * 4;
            computeSerializedSize = computeSerializedSize + length2 + 1 + GV.g(length2);
        }
        float[] fArr3 = this.greenDistortionCoefficients;
        if (fArr3 != null && fArr3.length > 0) {
            int length3 = fArr3.length * 4;
            computeSerializedSize = computeSerializedSize + length3 + 1 + GV.g(length3);
        }
        float[] fArr4 = this.blueDistortionCoefficients;
        if (fArr4 != null && fArr4.length > 0) {
            int length4 = fArr4.length * 4;
            computeSerializedSize = computeSerializedSize + length4 + 1 + GV.g(length4);
        }
        if ((this.bitField0_ & 64) != 0) {
            computeSerializedSize += GV.a(10);
        }
        if ((this.bitField0_ & 16) != 0) {
            computeSerializedSize += GV.d(11, this.verticalAlignment_);
        }
        if ((this.bitField0_ & 128) != 0) {
            computeSerializedSize += GV.d(12, this.primaryButton_);
        }
        CardboardDevice$CardboardInternalParams cardboardDevice$CardboardInternalParams = this.internal;
        if (cardboardDevice$CardboardInternalParams != null) {
            computeSerializedSize += GV.f(1729, cardboardDevice$CardboardInternalParams);
        }
        CardboardDevice$DaydreamInternalParams cardboardDevice$DaydreamInternalParams = this.daydreamInternal;
        return cardboardDevice$DaydreamInternalParams != null ? computeSerializedSize + GV.f(196883, cardboardDevice$DaydreamInternalParams) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final CardboardDevice$DeviceParams mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            int i = c12129zV.b;
            switch (m) {
                case 0:
                    return this;
                case 10:
                    this.vendor_ = c12129zV.l();
                    this.bitField0_ |= 1;
                    break;
                case 18:
                    this.model_ = c12129zV.l();
                    this.bitField0_ |= 2;
                    break;
                case 29:
                    this.screenToLensDistance_ = c12129zV.e();
                    this.bitField0_ |= 4;
                    break;
                case 37:
                    this.interLensDistance_ = c12129zV.e();
                    this.bitField0_ |= 8;
                    break;
                case 42:
                    int j = c12129zV.j();
                    int b = c12129zV.b(j);
                    int i2 = j / 4;
                    float[] fArr = this.leftEyeFieldOfViewAngles;
                    int length = fArr == null ? 0 : fArr.length;
                    int i3 = i2 + length;
                    float[] fArr2 = new float[i3];
                    if (length != 0) {
                        System.arraycopy(fArr, 0, fArr2, 0, length);
                    }
                    while (length < i3) {
                        fArr2[length] = c12129zV.e();
                        length++;
                    }
                    this.leftEyeFieldOfViewAngles = fArr2;
                    c12129zV.a(b);
                    break;
                case 45:
                    int a = AbstractC11226wq4.a(c12129zV, 45);
                    float[] fArr3 = this.leftEyeFieldOfViewAngles;
                    int length2 = fArr3 == null ? 0 : fArr3.length;
                    int i4 = a + length2;
                    float[] fArr4 = new float[i4];
                    if (length2 != 0) {
                        System.arraycopy(fArr3, 0, fArr4, 0, length2);
                    }
                    while (length2 < i4 - 1) {
                        fArr4[length2] = c12129zV.e();
                        c12129zV.m();
                        length2++;
                    }
                    fArr4[length2] = c12129zV.e();
                    this.leftEyeFieldOfViewAngles = fArr4;
                    break;
                case 53:
                    this.trayToLensDistance_ = c12129zV.e();
                    this.bitField0_ |= 32;
                    break;
                case 58:
                    int j2 = c12129zV.j();
                    int b2 = c12129zV.b(j2);
                    int i5 = j2 / 4;
                    float[] fArr5 = this.distortionCoefficients;
                    int length3 = fArr5 == null ? 0 : fArr5.length;
                    int i6 = i5 + length3;
                    float[] fArr6 = new float[i6];
                    if (length3 != 0) {
                        System.arraycopy(fArr5, 0, fArr6, 0, length3);
                    }
                    while (length3 < i6) {
                        fArr6[length3] = c12129zV.e();
                        length3++;
                    }
                    this.distortionCoefficients = fArr6;
                    c12129zV.a(b2);
                    break;
                case 61:
                    int a2 = AbstractC11226wq4.a(c12129zV, 61);
                    float[] fArr7 = this.distortionCoefficients;
                    int length4 = fArr7 == null ? 0 : fArr7.length;
                    int i7 = a2 + length4;
                    float[] fArr8 = new float[i7];
                    if (length4 != 0) {
                        System.arraycopy(fArr7, 0, fArr8, 0, length4);
                    }
                    while (length4 < i7 - 1) {
                        fArr8[length4] = c12129zV.e();
                        c12129zV.m();
                        length4++;
                    }
                    fArr8[length4] = c12129zV.e();
                    this.distortionCoefficients = fArr8;
                    break;
                case 66:
                    int j3 = c12129zV.j();
                    int b3 = c12129zV.b(j3);
                    int i8 = j3 / 4;
                    float[] fArr9 = this.greenDistortionCoefficients;
                    int length5 = fArr9 == null ? 0 : fArr9.length;
                    int i9 = i8 + length5;
                    float[] fArr10 = new float[i9];
                    if (length5 != 0) {
                        System.arraycopy(fArr9, 0, fArr10, 0, length5);
                    }
                    while (length5 < i9) {
                        fArr10[length5] = c12129zV.e();
                        length5++;
                    }
                    this.greenDistortionCoefficients = fArr10;
                    c12129zV.a(b3);
                    break;
                case 69:
                    int a3 = AbstractC11226wq4.a(c12129zV, 69);
                    float[] fArr11 = this.greenDistortionCoefficients;
                    int length6 = fArr11 == null ? 0 : fArr11.length;
                    int i10 = a3 + length6;
                    float[] fArr12 = new float[i10];
                    if (length6 != 0) {
                        System.arraycopy(fArr11, 0, fArr12, 0, length6);
                    }
                    while (length6 < i10 - 1) {
                        fArr12[length6] = c12129zV.e();
                        c12129zV.m();
                        length6++;
                    }
                    fArr12[length6] = c12129zV.e();
                    this.greenDistortionCoefficients = fArr12;
                    break;
                case 74:
                    int j4 = c12129zV.j();
                    int b4 = c12129zV.b(j4);
                    int i11 = j4 / 4;
                    float[] fArr13 = this.blueDistortionCoefficients;
                    int length7 = fArr13 == null ? 0 : fArr13.length;
                    int i12 = i11 + length7;
                    float[] fArr14 = new float[i12];
                    if (length7 != 0) {
                        System.arraycopy(fArr13, 0, fArr14, 0, length7);
                    }
                    while (length7 < i12) {
                        fArr14[length7] = c12129zV.e();
                        length7++;
                    }
                    this.blueDistortionCoefficients = fArr14;
                    c12129zV.a(b4);
                    break;
                case 77:
                    int a4 = AbstractC11226wq4.a(c12129zV, 77);
                    float[] fArr15 = this.blueDistortionCoefficients;
                    int length8 = fArr15 == null ? 0 : fArr15.length;
                    int i13 = a4 + length8;
                    float[] fArr16 = new float[i13];
                    if (length8 != 0) {
                        System.arraycopy(fArr15, 0, fArr16, 0, length8);
                    }
                    while (length8 < i13 - 1) {
                        fArr16[length8] = c12129zV.e();
                        c12129zV.m();
                        length8++;
                    }
                    fArr16[length8] = c12129zV.e();
                    this.blueDistortionCoefficients = fArr16;
                    break;
                case 80:
                    this.hasMagnet_ = c12129zV.c();
                    this.bitField0_ |= 64;
                    break;
                case 88:
                    this.bitField0_ |= 16;
                    int i14 = c12129zV.e - i;
                    try {
                        this.verticalAlignment_ = checkVerticalAlignmentTypeOrThrow(c12129zV.j());
                        this.bitField0_ |= 16;
                        break;
                    } catch (IllegalArgumentException unused) {
                        c12129zV.n(i14);
                        storeUnknownField(c12129zV, m);
                        break;
                    }
                case 96:
                    this.bitField0_ |= 128;
                    int i15 = c12129zV.e - i;
                    try {
                        this.primaryButton_ = checkButtonTypeOrThrow(c12129zV.j());
                        this.bitField0_ |= 128;
                        break;
                    } catch (IllegalArgumentException unused2) {
                        c12129zV.n(i15);
                        storeUnknownField(c12129zV, m);
                        break;
                    }
                case 13834:
                    if (this.internal == null) {
                        this.internal = new CardboardDevice$CardboardInternalParams();
                    }
                    c12129zV.f(this.internal);
                    break;
                case 1575066:
                    if (this.daydreamInternal == null) {
                        this.daydreamInternal = new CardboardDevice$DaydreamInternalParams();
                    }
                    c12129zV.f(this.daydreamInternal);
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
