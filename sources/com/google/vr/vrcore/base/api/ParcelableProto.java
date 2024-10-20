package com.google.vr.vrcore.base.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.common.api.HeadTrackingState;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public abstract class ParcelableProto implements Parcelable {
    public byte[] a;

    public ParcelableProto() {
        this.a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableProto(byte[] bArr) {
        this.a = bArr;
    }

    public ParcelableProto(Parcel parcel) {
        this.a = null;
        a(parcel);
    }

    public String toString() {
        byte[] bArr = this.a;
        int length = bArr == null ? 0 : bArr.length;
        StringBuilder sb = new StringBuilder(34);
        sb.append("ParcelableProto[");
        sb.append(length);
        sb.append(" bytes]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this instanceof HeadTrackingState;
        if (z) {
            byte[] bArr = this.a;
            parcel.writeInt(bArr == null ? 0 : bArr.length);
        }
        byte[] bArr2 = this.a;
        if (bArr2 == null && z) {
            parcel.writeByteArray(new byte[0]);
        } else {
            parcel.writeByteArray(bArr2);
        }
    }

    public final void a(Parcel parcel) {
        if (this instanceof HeadTrackingState) {
            parcel.readInt();
        }
        this.a = parcel.createByteArray();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
