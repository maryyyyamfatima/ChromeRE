package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C11716yH;
import defpackage.RT2;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CastEurekaInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C11716yH();
    public final int a;
    public final boolean g;

    public CastEurekaInfo(int i, boolean z) {
        this.a = i;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastEurekaInfo)) {
            return false;
        }
        CastEurekaInfo castEurekaInfo = (CastEurekaInfo) obj;
        return this.a == castEurekaInfo.a && this.g == castEurekaInfo.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g ? 1 : 0);
        RT2.b(a, parcel);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.g)});
    }
}
