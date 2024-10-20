package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C7230lC;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BoundingBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C7230lC();
    public final int a;
    public final int g;
    public final int h;
    public final int i;
    public final float j;

    public BoundingBoxParcel(int i, int i2, int i3, int i4, float f) {
        this.a = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.i);
        RT2.f(parcel, 6, 4);
        parcel.writeFloat(this.j);
        RT2.b(a, parcel);
    }
}
