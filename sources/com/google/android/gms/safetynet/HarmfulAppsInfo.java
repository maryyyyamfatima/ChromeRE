package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RT2;
import defpackage.Z51;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class HarmfulAppsInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new Z51();
    public final long a;
    public final HarmfulAppsData[] g;
    public final int h;
    public final boolean i;

    public HarmfulAppsInfo(long j, HarmfulAppsData[] harmfulAppsDataArr, int i, boolean z) {
        this.a = j;
        this.g = harmfulAppsDataArr;
        this.i = z;
        if (z) {
            this.h = i;
        } else {
            this.h = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 8);
        parcel.writeLong(this.a);
        RT2.r(parcel, 3, this.g, i);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.i ? 1 : 0);
        RT2.b(a, parcel);
    }
}
