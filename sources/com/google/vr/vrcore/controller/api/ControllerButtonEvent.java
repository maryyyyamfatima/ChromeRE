package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.E80;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class ControllerButtonEvent extends ControllerEvent {
    public static final Parcelable.Creator CREATOR = new E80();
    public int h;
    public boolean i;

    public ControllerButtonEvent() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ControllerButtonEvent(Parcel parcel) {
        a(parcel);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i ? 1 : 0);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.h = parcel.readInt();
        this.i = parcel.readInt() != 0;
    }
}
