package com.google.vr.vrcore.logging.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.AbstractC8015nV1;
import defpackage.I74;
import defpackage.Yh4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class VREventParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new I74();
    public final int a;
    public final Yh4 g;

    public VREventParcelable(Yh4 yh4) {
        this.a = 2012;
        this.g = yh4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VREventParcelable(Parcel parcel) {
        this.a = parcel.readInt();
        try {
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray.length > 0) {
                this.g = (Yh4) AbstractC8015nV1.mergeFrom(new Yh4(), createByteArray);
            }
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 35);
            sb.append("Logging with empty VREvent. Error: ");
            sb.append(valueOf);
            Log.i("VREventParcelable", sb.toString());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        Yh4 yh4 = this.g;
        if (yh4 != null) {
            parcel.writeByteArray(AbstractC8015nV1.toByteArray(yh4));
        }
    }
}
