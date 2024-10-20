package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C4088c32;
import defpackage.RT2;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Deprecated
/* loaded from: classes.dex */
public final class NetworkLocationStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C4088c32();
    public final int a;
    public final int g;
    public final long h;
    public final long i;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g);
        RT2.f(parcel, 3, 8);
        parcel.writeLong(this.h);
        RT2.f(parcel, 4, 8);
        parcel.writeLong(this.i);
        RT2.b(a, parcel);
    }

    public NetworkLocationStatus(int i, int i2, long j, long j2) {
        this.a = i;
        this.g = i2;
        this.h = j;
        this.i = j2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.a), Long.valueOf(this.i), Long.valueOf(this.h)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NetworkLocationStatus)) {
            return false;
        }
        NetworkLocationStatus networkLocationStatus = (NetworkLocationStatus) obj;
        return this.a == networkLocationStatus.a && this.g == networkLocationStatus.g && this.h == networkLocationStatus.h && this.i == networkLocationStatus.i;
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.a + " Cell status: " + this.g + " elapsed time NS: " + this.i + " system time ms: " + this.h;
    }
}
