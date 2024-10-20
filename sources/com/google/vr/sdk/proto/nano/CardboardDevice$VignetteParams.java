package com.google.vr.sdk.proto.nano;

import defpackage.C12129zV;
import defpackage.GV;
import defpackage.RF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class CardboardDevice$VignetteParams extends RF0 implements Cloneable {
    private int bitField0_;
    private int condition_;
    private float value_;

    public static int checkVignetteParamsConditionOrThrow(int i) {
        if (i == 0 || i == 1) {
            return i;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append(i);
        sb.append(" is not a valid enum VignetteParamsCondition");
        throw new IllegalArgumentException(sb.toString());
    }

    public CardboardDevice$VignetteParams() {
        clear();
    }

    public final CardboardDevice$VignetteParams clear() {
        this.bitField0_ = 0;
        this.condition_ = 0;
        this.value_ = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // defpackage.AbstractC8015nV1
    public final CardboardDevice$VignetteParams clone() {
        try {
            return (CardboardDevice$VignetteParams) a();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        if ((this.bitField0_ & 1) != 0) {
            gv.r(2, this.condition_);
        }
        if ((this.bitField0_ & 2) != 0) {
            gv.p(3, this.value_);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += GV.d(2, this.condition_);
        }
        return (this.bitField0_ & 2) != 0 ? computeSerializedSize + GV.c(3) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final CardboardDevice$VignetteParams mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                return this;
            }
            if (m == 16) {
                this.bitField0_ |= 1;
                int i = c12129zV.e - c12129zV.b;
                try {
                    this.condition_ = checkVignetteParamsConditionOrThrow(c12129zV.j());
                    this.bitField0_ |= 1;
                } catch (IllegalArgumentException unused) {
                    c12129zV.n(i);
                    storeUnknownField(c12129zV, m);
                }
            } else if (m != 29) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    return this;
                }
            } else {
                this.value_ = c12129zV.e();
                this.bitField0_ |= 2;
            }
        }
    }
}
