package com.google.vr.sdk.proto.nano;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC11226wq4;
import defpackage.C12129zV;
import defpackage.GV;
import defpackage.RF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class CardboardDevice$CardboardInternalParams extends RF0 implements Cloneable {
    private String accelerometer_;
    private int bitField0_;
    public int[] eyeOrientations;
    private String gyroscope_;
    private float screenCenterToLensDistance_;
    private float xPpiOverride_;
    private float yPpiOverride_;

    public static int checkOrientationTypeOrThrow(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            case 4:
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            case 6:
            case 7:
                return i;
            default:
                StringBuilder sb = new StringBuilder(47);
                sb.append(i);
                sb.append(" is not a valid enum OrientationType");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public CardboardDevice$CardboardInternalParams() {
        clear();
    }

    public final CardboardDevice$CardboardInternalParams clear() {
        this.bitField0_ = 0;
        this.eyeOrientations = AbstractC11226wq4.a;
        this.screenCenterToLensDistance_ = 0.0f;
        this.xPpiOverride_ = 0.0f;
        this.yPpiOverride_ = 0.0f;
        this.accelerometer_ = "";
        this.gyroscope_ = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // defpackage.AbstractC8015nV1
    public final CardboardDevice$CardboardInternalParams clone() {
        try {
            CardboardDevice$CardboardInternalParams cardboardDevice$CardboardInternalParams = (CardboardDevice$CardboardInternalParams) a();
            int[] iArr = this.eyeOrientations;
            if (iArr != null && iArr.length > 0) {
                cardboardDevice$CardboardInternalParams.eyeOrientations = (int[]) iArr.clone();
            }
            return cardboardDevice$CardboardInternalParams;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        int[] iArr = this.eyeOrientations;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.eyeOrientations;
                int i4 = 10;
                if (i2 >= iArr2.length) {
                    break;
                }
                int i5 = iArr2[i2];
                if (i5 >= 0) {
                    i4 = GV.g(i5);
                }
                i3 += i4;
                i2++;
            }
            gv.v(10);
            gv.v(i3);
            while (true) {
                int[] iArr3 = this.eyeOrientations;
                if (i >= iArr3.length) {
                    break;
                }
                gv.v(iArr3[i]);
                i++;
            }
        }
        if ((this.bitField0_ & 1) != 0) {
            gv.p(2, this.screenCenterToLensDistance_);
        }
        if ((this.bitField0_ & 2) != 0) {
            gv.p(3, this.xPpiOverride_);
        }
        if ((this.bitField0_ & 4) != 0) {
            gv.p(4, this.yPpiOverride_);
        }
        if ((this.bitField0_ & 8) != 0) {
            gv.x(5, this.accelerometer_);
        }
        if ((this.bitField0_ & 16) != 0) {
            gv.x(6, this.gyroscope_);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int[] iArr = this.eyeOrientations;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.eyeOrientations;
                if (i >= iArr2.length) {
                    break;
                }
                int i3 = iArr2[i];
                i2 += i3 >= 0 ? GV.g(i3) : 10;
                i++;
            }
            computeSerializedSize = computeSerializedSize + i2 + 1 + GV.g(i2);
        }
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += GV.c(2);
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += GV.c(3);
        }
        if ((this.bitField0_ & 4) != 0) {
            computeSerializedSize += GV.c(4);
        }
        if ((this.bitField0_ & 8) != 0) {
            computeSerializedSize += GV.i(5, this.accelerometer_);
        }
        return (this.bitField0_ & 16) != 0 ? computeSerializedSize + GV.i(6, this.gyroscope_) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final CardboardDevice$CardboardInternalParams mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                return this;
            }
            int i = c12129zV.b;
            if (m == 8) {
                int a = AbstractC11226wq4.a(c12129zV, 8);
                int[] iArr = new int[a];
                int i2 = 0;
                for (int i3 = 0; i3 < a; i3++) {
                    if (i3 != 0) {
                        c12129zV.m();
                    }
                    int i4 = c12129zV.e - i;
                    try {
                        iArr[i2] = checkOrientationTypeOrThrow(c12129zV.j());
                        i2++;
                    } catch (IllegalArgumentException unused) {
                        c12129zV.n(i4);
                        storeUnknownField(c12129zV, m);
                    }
                }
                if (i2 != 0) {
                    int[] iArr2 = this.eyeOrientations;
                    int length = iArr2 == null ? 0 : iArr2.length;
                    if (length == 0 && i2 == a) {
                        this.eyeOrientations = iArr;
                    } else {
                        int[] iArr3 = new int[length + i2];
                        if (length != 0) {
                            System.arraycopy(iArr2, 0, iArr3, 0, length);
                        }
                        System.arraycopy(iArr, 0, iArr3, length, i2);
                        this.eyeOrientations = iArr3;
                    }
                }
            } else if (m == 10) {
                int b = c12129zV.b(c12129zV.j());
                int i5 = c12129zV.e - i;
                int i6 = 0;
                while (true) {
                    int i7 = c12129zV.g;
                    if ((i7 == Integer.MAX_VALUE ? -1 : i7 - c12129zV.e) <= 0) {
                        break;
                    }
                    try {
                        checkOrientationTypeOrThrow(c12129zV.j());
                        i6++;
                    } catch (IllegalArgumentException unused2) {
                    }
                }
                if (i6 != 0) {
                    c12129zV.n(i5);
                    int[] iArr4 = this.eyeOrientations;
                    int length2 = iArr4 == null ? 0 : iArr4.length;
                    int[] iArr5 = new int[i6 + length2];
                    if (length2 != 0) {
                        System.arraycopy(iArr4, 0, iArr5, 0, length2);
                    }
                    while (true) {
                        int i8 = c12129zV.g;
                        if ((i8 == Integer.MAX_VALUE ? -1 : i8 - c12129zV.e) <= 0) {
                            break;
                        }
                        int i9 = c12129zV.e - i;
                        try {
                            iArr5[length2] = checkOrientationTypeOrThrow(c12129zV.j());
                            length2++;
                        } catch (IllegalArgumentException unused3) {
                            c12129zV.n(i9);
                            storeUnknownField(c12129zV, 8);
                        }
                    }
                    this.eyeOrientations = iArr5;
                }
                c12129zV.a(b);
            } else if (m == 21) {
                this.screenCenterToLensDistance_ = c12129zV.e();
                this.bitField0_ |= 1;
            } else if (m == 29) {
                this.xPpiOverride_ = c12129zV.e();
                this.bitField0_ |= 2;
            } else if (m == 37) {
                this.yPpiOverride_ = c12129zV.e();
                this.bitField0_ |= 4;
            } else if (m == 42) {
                this.accelerometer_ = c12129zV.l();
                this.bitField0_ |= 8;
            } else if (m != 50) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    return this;
                }
            } else {
                this.gyroscope_ = c12129zV.l();
                this.bitField0_ |= 16;
            }
        }
    }
}
