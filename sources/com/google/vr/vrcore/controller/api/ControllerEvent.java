package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public abstract class ControllerEvent implements Parcelable {
    public long a;
    public int g = 0;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.g);
    }

    public void a(Parcel parcel) {
        this.a = parcel.readLong();
        this.g = parcel.readInt();
    }
}
