package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.H80;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class ControllerGyroEvent extends ControllerEvent {
    public static final Parcelable.Creator CREATOR = new H80();
    public float h;
    public float i;
    public float j;

    public ControllerGyroEvent() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ControllerGyroEvent(Parcel parcel) {
        a(parcel);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.h);
        parcel.writeFloat(this.i);
        parcel.writeFloat(this.j);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.h = parcel.readFloat();
        this.i = parcel.readFloat();
        this.j = parcel.readFloat();
    }
}
