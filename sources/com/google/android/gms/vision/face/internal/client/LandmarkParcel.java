package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C6452iw1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C6452iw1();
    public final int a;
    public final float g;
    public final float h;
    public final int i;

    public LandmarkParcel(float f, int i, float f2, int i2) {
        this.a = i;
        this.g = f;
        this.h = f2;
        this.i = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeFloat(this.g);
        RT2.f(parcel, 3, 4);
        parcel.writeFloat(this.h);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.i);
        RT2.b(a, parcel);
    }
}
