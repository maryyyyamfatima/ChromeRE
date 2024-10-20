package com.google.vr.vrcore.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.base.api.ParcelableProto;
import defpackage.C5830h71;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class HeadTrackingState extends ParcelableProto {
    public static final Parcelable.Creator CREATOR = new C5830h71();

    public HeadTrackingState() {
    }

    public HeadTrackingState(byte[] bArr) {
        super(bArr);
    }

    public HeadTrackingState(Parcel parcel) {
        super(parcel);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HeadTrackingState) {
            return Arrays.equals(((HeadTrackingState) obj).a, this.a);
        }
        return false;
    }

    @Override // com.google.vr.vrcore.base.api.ParcelableProto
    public final String toString() {
        byte[] bArr = this.a;
        int length = bArr == null ? 0 : bArr.length;
        StringBuilder sb = new StringBuilder(36);
        sb.append("HeadTrackingState[");
        sb.append(length);
        sb.append(" bytes]");
        return sb.toString();
    }
}
