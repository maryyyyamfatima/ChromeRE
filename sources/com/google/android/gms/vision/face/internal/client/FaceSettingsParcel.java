package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C7256lH0;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FaceSettingsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C7256lH0();
    public int a;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public float k;

    public FaceSettingsParcel() {
    }

    public FaceSettingsParcel(float f, int i, int i2, int i3, boolean z, boolean z2) {
        this.a = i;
        this.g = i2;
        this.h = i3;
        this.i = z;
        this.j = z2;
        this.k = f;
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
        boolean z = this.i;
        RT2.f(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.j;
        RT2.f(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        float f = this.k;
        RT2.f(parcel, 7, 4);
        parcel.writeFloat(f);
        RT2.b(a, parcel);
    }
}
