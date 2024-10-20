package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C8353oU0;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FrameMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C8353oU0();
    public int a;
    public int g;
    public int h;
    public long i;
    public int j;

    public FrameMetadataParcel() {
    }

    public FrameMetadataParcel(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.j = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        int i2 = this.a;
        RT2.f(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.g;
        RT2.f(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.h;
        RT2.f(parcel, 4, 4);
        parcel.writeInt(i4);
        long j = this.i;
        RT2.f(parcel, 5, 8);
        parcel.writeLong(j);
        int i5 = this.j;
        RT2.f(parcel, 6, 4);
        parcel.writeInt(i5);
        RT2.b(a, parcel);
    }
}
