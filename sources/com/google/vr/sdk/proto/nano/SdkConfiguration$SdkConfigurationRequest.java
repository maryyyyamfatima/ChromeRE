package com.google.vr.sdk.proto.nano;

import com.google.common.logging.nano.Vr$VREvent$SdkConfigurationParams;
import defpackage.C12129zV;
import defpackage.GV;
import defpackage.RF0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class SdkConfiguration$SdkConfigurationRequest extends RF0 implements Cloneable {
    public Vr$VREvent$SdkConfigurationParams requestedParams;
    public String sdkVersion;

    public SdkConfiguration$SdkConfigurationRequest() {
        clear();
    }

    public final SdkConfiguration$SdkConfigurationRequest clear() {
        this.sdkVersion = null;
        this.requestedParams = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // defpackage.AbstractC8015nV1
    public final SdkConfiguration$SdkConfigurationRequest clone() {
        try {
            SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest = (SdkConfiguration$SdkConfigurationRequest) a();
            Vr$VREvent$SdkConfigurationParams vr$VREvent$SdkConfigurationParams = this.requestedParams;
            if (vr$VREvent$SdkConfigurationParams != null) {
                sdkConfiguration$SdkConfigurationRequest.requestedParams = vr$VREvent$SdkConfigurationParams.clone();
            }
            return sdkConfiguration$SdkConfigurationRequest;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final void writeTo(GV gv) {
        String str = this.sdkVersion;
        if (str != null) {
            gv.x(1, str);
        }
        Vr$VREvent$SdkConfigurationParams vr$VREvent$SdkConfigurationParams = this.requestedParams;
        if (vr$VREvent$SdkConfigurationParams != null) {
            gv.t(2, vr$VREvent$SdkConfigurationParams);
        }
        super.writeTo(gv);
    }

    @Override // defpackage.RF0, defpackage.AbstractC8015nV1
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.sdkVersion;
        if (str != null) {
            computeSerializedSize += GV.i(1, str);
        }
        Vr$VREvent$SdkConfigurationParams vr$VREvent$SdkConfigurationParams = this.requestedParams;
        return vr$VREvent$SdkConfigurationParams != null ? computeSerializedSize + GV.f(2, vr$VREvent$SdkConfigurationParams) : computeSerializedSize;
    }

    @Override // defpackage.AbstractC8015nV1
    public final SdkConfiguration$SdkConfigurationRequest mergeFrom(C12129zV c12129zV) {
        while (true) {
            int m = c12129zV.m();
            if (m == 0) {
                return this;
            }
            if (m == 10) {
                this.sdkVersion = c12129zV.l();
            } else if (m != 18) {
                if (!super.storeUnknownField(c12129zV, m)) {
                    return this;
                }
            } else {
                if (this.requestedParams == null) {
                    this.requestedParams = new Vr$VREvent$SdkConfigurationParams();
                }
                c12129zV.f(this.requestedParams);
            }
        }
    }
}
