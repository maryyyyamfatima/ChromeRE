package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RF1;
import defpackage.RT2;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int g;
    public final long h;
    public final int i;
    public final NetworkLocationStatus[] j;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g);
        RT2.f(parcel, 3, 8);
        parcel.writeLong(this.h);
        RT2.f(parcel, 4, 4);
        int i2 = this.i;
        parcel.writeInt(i2);
        RT2.r(parcel, 5, this.j, i);
        int i3 = i2 >= 1000 ? 0 : 1;
        RT2.f(parcel, 6, 4);
        parcel.writeInt(i3);
        RT2.b(a, parcel);
    }

    static {
        new LocationAvailability(0, 1, 1, 0L, null);
        new LocationAvailability(1000, 1, 1, 0L, null);
        CREATOR = new RF1();
    }

    public LocationAvailability(int i, int i2, int i3, long j, NetworkLocationStatus[] networkLocationStatusArr) {
        this.i = i < 1000 ? 0 : 1000;
        this.a = i2;
        this.g = i3;
        this.h = j;
        this.j = networkLocationStatusArr;
    }

    public final String toString() {
        return "LocationAvailability[" + (this.i < 1000) + "]";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationAvailability)) {
            return false;
        }
        LocationAvailability locationAvailability = (LocationAvailability) obj;
        return this.a == locationAvailability.a && this.g == locationAvailability.g && this.h == locationAvailability.h && this.i == locationAvailability.i && Arrays.equals(this.j, locationAvailability.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.i)});
    }
}
