package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.I80;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class ControllerListenerOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new I80();
    public boolean a;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ControllerListenerOptions(int i) {
        if ((i & 1) != 0) {
            this.a = true;
        }
        if ((i & 2) != 0) {
            this.i = true;
        }
        if ((i & 4) != 0) {
            this.g = true;
        }
        if ((i & 8) != 0) {
            this.h = true;
        }
        if ((i & 16) != 0) {
            this.j = true;
        }
    }

    public ControllerListenerOptions(Parcel parcel) {
        this.a = parcel.readInt() != 0;
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
    }

    public final String toString() {
        return String.format(Locale.US, "ori=%b, gyro=%b, accel=%b, touch=%b, gestures=%b", Boolean.valueOf(this.a), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j));
    }
}
