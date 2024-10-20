package com.google.vr.sdk.proto.nano;

import defpackage.AbstractC11226wq4;
import defpackage.C12129zV;
import defpackage.GV;
import defpackage.RF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class CardboardDevice$DaydreamInternalParams extends RF0 implements Cloneable {
    public CardboardDevice$ScreenAlignmentMarker[] alignmentMarkers;
    private int bitField0_;
    private boolean clampDistortionToMaximumFieldOfView_;
    private boolean clipFieldOfViewToDisplay_;
    private int distortionMeshResolution_;
    private boolean sensorOrientationIndependentOfDisplay_;
    private boolean useRotationalAlignmentCorrection_;
    private int version_;
    public CardboardDevice$VignetteParams vignetteParams;

    public final boolean getUseRotationalAlignmentCorrection() {
        return this.useRotationalAlignmentCorrection_;
    }

    public CardboardDevice$DaydreamInternalParams() {
        clear();
    }

    public final CardboardDevice$DaydreamInternalParams clear() {
        this.bitField0_ = 0;
        this.version_ = 0;
        this.alignmentMarkers = CardboardDevice$ScreenAlignmentMarker.emptyArray();
        this.useRotationalAlignmentCorrection_ = false;
        this.sensorOrientationIndependentOfDisplay_ = false;
        this.vignetteParams = null;
        this.distortionMeshResolution_ = 40;
        this.clipFieldOfViewToDisplay_ = true;
        this.clampDistortionToMaximumFieldOfView_ = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // defpackage.AbstractC8015nV1
    public final CardboardDevice$DaydreamInternalParams clone() {
        try {
            CardboardDevice$DaydreamInternalParams cardboardDevice$DaydreamInternalParams = (CardboardDevice$DaydreamInternalParams) a();
            CardboardDevice$ScreenAlignmentMarker[] cardboardDevice$ScreenAlignmentMarkerArr = this.alignmentMarkers;
            if (cardboardDevice$ScreenAlignmentMarkerArr != null && cardboardDevice$ScreenAlignmentMarkerArr.length > 0) {
                cardboardDevice$DaydreamInternalParams.alignmentMarkers = new CardboardDevice$ScreenAlignmentMarker[cardboardDevice$ScreenAlignmentMarkerArr.length];
                int i = 0;
                while (true) {
                    CardboardDevice$ScreenAlignmentMarker[] cardboardDevice$ScreenAlignmentMarkerArr2 = this.alignmentMarkers;
                    if (i >= cardboardDevice$ScreenAlignmentMarkerArr2.length) {
                        break;
                    }
                    CardboardDevice$ScreenAlignmentMarker cardboardDevice$ScreenAlignmentMarker = cardboardDevice$ScreenAlignmentMarkerArr2[i];
                    if (cardboardDevice$ScreenAlignmentMarker != null) {
                        cardboardDevice$DaydreamInternalParams.alignmentMarkers[i] = cardboardDevice$ScreenAlignmentMarker.clone();
                    }
                    i++;
                }
            }
            CardboardDevice$VignetteParams cardboardDevice$VignetteParams = this.vignetteParams;
            if (cardboardDevice$VignetteParams != null) {
                cardboardDevice$DaydreamInternalParams.vignetteParams = cardboardDevice$VignetteParams.clone();
            }
            return cardboardDevice$DaydreamInternalParams;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        if ((this.bitField0_ & 1) != 0) {
            gv.r(1, this.version_);
        }
        CardboardDevice$ScreenAlignmentMarker[] cardboardDevice$ScreenAlignmentMarkerArr = this.alignmentMarkers;
        if (cardboardDevice$ScreenAlignmentMarkerArr != null && cardboardDevice$ScreenAlignmentMarkerArr.length > 0) {
            int i = 0;
            while (true) {
                CardboardDevice$ScreenAlignmentMarker[] cardboardDevice$ScreenAlignmentMarkerArr2 = this.alignmentMarkers;
                if (i >= cardboardDevice$ScreenAlignmentMarkerArr2.length) {
                    break;
                }
                CardboardDevice$ScreenAlignmentMarker cardboardDevice$ScreenAlignmentMarker = cardboardDevice$ScreenAlignmentMarkerArr2[i];
                if (cardboardDevice$ScreenAlignmentMarker != null) {
                    gv.t(2, cardboardDevice$ScreenAlignmentMarker);
                }
                i++;
            }
        }
        if ((this.bitField0_ & 2) != 0) {
            gv.n(3, this.useRotationalAlignmentCorrection_);
        }
        if ((this.bitField0_ & 4) != 0) {
            gv.n(4, this.sensorOrientationIndependentOfDisplay_);
        }
        CardboardDevice$VignetteParams cardboardDevice$VignetteParams = this.vignetteParams;
        if (cardboardDevice$VignetteParams != null) {
            gv.t(5, cardboardDevice$VignetteParams);
        }
        if ((this.bitField0_ & 8) != 0) {
            gv.r(6, this.distortionMeshResolution_);
        }
        if ((this.bitField0_ & 16) != 0) {
            gv.n(7, this.clipFieldOfViewToDisplay_);
        }
        if ((this.bitField0_ & 32) != 0) {
            gv.n(8, this.clampDistortionToMaximumFieldOfView_);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += GV.d(1, this.version_);
        }
        CardboardDevice$ScreenAlignmentMarker[] cardboardDevice$ScreenAlignmentMarkerArr = this.alignmentMarkers;
        if (cardboardDevice$ScreenAlignmentMarkerArr != null && cardboardDevice$ScreenAlignmentMarkerArr.length > 0) {
            int i = 0;
            while (true) {
                CardboardDevice$ScreenAlignmentMarker[] cardboardDevice$ScreenAlignmentMarkerArr2 = this.alignmentMarkers;
                if (i >= cardboardDevice$ScreenAlignmentMarkerArr2.length) {
                    break;
                }
                CardboardDevice$ScreenAlignmentMarker cardboardDevice$ScreenAlignmentMarker = cardboardDevice$ScreenAlignmentMarkerArr2[i];
                if (cardboardDevice$ScreenAlignmentMarker != null) {
                    computeSerializedSize += GV.f(2, cardboardDevice$ScreenAlignmentMarker);
                }
                i++;
            }
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += GV.a(3);
        }
        if ((this.bitField0_ & 4) != 0) {
            computeSerializedSize += GV.a(4);
        }
        CardboardDevice$VignetteParams cardboardDevice$VignetteParams = this.vignetteParams;
        if (cardboardDevice$VignetteParams != null) {
            computeSerializedSize += GV.f(5, cardboardDevice$VignetteParams);
        }
        if ((this.bitField0_ & 8) != 0) {
            computeSerializedSize += GV.d(6, this.distortionMeshResolution_);
        }
        if ((this.bitField0_ & 16) != 0) {
            computeSerializedSize += GV.a(7);
        }
        return (this.bitField0_ & 32) != 0 ? computeSerializedSize + GV.a(8) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final CardboardDevice$DaydreamInternalParams mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                return this;
            }
            if (m == 8) {
                this.version_ = c12129zV.j();
                this.bitField0_ |= 1;
            } else if (m == 18) {
                int a = AbstractC11226wq4.a(c12129zV, 18);
                CardboardDevice$ScreenAlignmentMarker[] cardboardDevice$ScreenAlignmentMarkerArr = this.alignmentMarkers;
                int length = cardboardDevice$ScreenAlignmentMarkerArr == null ? 0 : cardboardDevice$ScreenAlignmentMarkerArr.length;
                int i = a + length;
                CardboardDevice$ScreenAlignmentMarker[] cardboardDevice$ScreenAlignmentMarkerArr2 = new CardboardDevice$ScreenAlignmentMarker[i];
                if (length != 0) {
                    System.arraycopy(cardboardDevice$ScreenAlignmentMarkerArr, 0, cardboardDevice$ScreenAlignmentMarkerArr2, 0, length);
                }
                while (length < i - 1) {
                    CardboardDevice$ScreenAlignmentMarker cardboardDevice$ScreenAlignmentMarker = new CardboardDevice$ScreenAlignmentMarker();
                    cardboardDevice$ScreenAlignmentMarkerArr2[length] = cardboardDevice$ScreenAlignmentMarker;
                    c12129zV.f(cardboardDevice$ScreenAlignmentMarker);
                    c12129zV.m();
                    length++;
                }
                CardboardDevice$ScreenAlignmentMarker cardboardDevice$ScreenAlignmentMarker2 = new CardboardDevice$ScreenAlignmentMarker();
                cardboardDevice$ScreenAlignmentMarkerArr2[length] = cardboardDevice$ScreenAlignmentMarker2;
                c12129zV.f(cardboardDevice$ScreenAlignmentMarker2);
                this.alignmentMarkers = cardboardDevice$ScreenAlignmentMarkerArr2;
            } else if (m == 24) {
                this.useRotationalAlignmentCorrection_ = c12129zV.c();
                this.bitField0_ |= 2;
            } else if (m == 32) {
                this.sensorOrientationIndependentOfDisplay_ = c12129zV.c();
                this.bitField0_ |= 4;
            } else if (m == 42) {
                if (this.vignetteParams == null) {
                    this.vignetteParams = new CardboardDevice$VignetteParams();
                }
                c12129zV.f(this.vignetteParams);
            } else if (m == 48) {
                this.distortionMeshResolution_ = c12129zV.j();
                this.bitField0_ |= 8;
            } else if (m == 56) {
                this.clipFieldOfViewToDisplay_ = c12129zV.c();
                this.bitField0_ |= 16;
            } else if (m != 64) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    return this;
                }
            } else {
                this.clampDistortionToMaximumFieldOfView_ = c12129zV.c();
                this.bitField0_ |= 32;
            }
        }
    }
}
