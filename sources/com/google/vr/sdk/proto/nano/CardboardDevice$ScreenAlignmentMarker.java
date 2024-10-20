package com.google.vr.sdk.proto.nano;

import defpackage.AbstractC3071Xq1;
import defpackage.C12129zV;
import defpackage.GV;
import defpackage.RF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class CardboardDevice$ScreenAlignmentMarker extends RF0 implements Cloneable {
    private static volatile CardboardDevice$ScreenAlignmentMarker[] _emptyArray;
    private int bitField0_;
    private float horizontal_;
    private float vertical_;

    public static CardboardDevice$ScreenAlignmentMarker[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (AbstractC3071Xq1.a) {
                if (_emptyArray == null) {
                    _emptyArray = new CardboardDevice$ScreenAlignmentMarker[0];
                }
            }
        }
        return _emptyArray;
    }

    public final float getHorizontal() {
        return this.horizontal_;
    }

    public final float getVertical() {
        return this.vertical_;
    }

    public CardboardDevice$ScreenAlignmentMarker() {
        clear();
    }

    public final CardboardDevice$ScreenAlignmentMarker clear() {
        this.bitField0_ = 0;
        this.horizontal_ = 0.0f;
        this.vertical_ = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // defpackage.AbstractC8015nV1
    public final CardboardDevice$ScreenAlignmentMarker clone() {
        try {
            return (CardboardDevice$ScreenAlignmentMarker) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        if ((this.bitField0_ & 1) != 0) {
            gv.p(1, this.horizontal_);
        }
        if ((this.bitField0_ & 2) != 0) {
            gv.p(2, this.vertical_);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += GV.c(1);
        }
        return (this.bitField0_ & 2) != 0 ? computeSerializedSize + GV.c(2) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final CardboardDevice$ScreenAlignmentMarker mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                return this;
            }
            if (m == 13) {
                this.horizontal_ = c12129zV.e();
                this.bitField0_ |= 1;
            } else if (m != 21) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    return this;
                }
            } else {
                this.vertical_ = c12129zV.e();
                this.bitField0_ |= 2;
            }
        }
    }
}
