package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C2785Vl0;
import defpackage.RT2;
import defpackage.WH;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DeviceStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C2785Vl0();
    public final double a;
    public final boolean g;
    public final int h;
    public final ApplicationMetadata i;
    public final int j;
    public final EqualizerSettings k;
    public final double l;

    public DeviceStatus(double d, boolean z, int i, ApplicationMetadata applicationMetadata, int i2, EqualizerSettings equalizerSettings, double d2) {
        this.a = d;
        this.g = z;
        this.h = i;
        this.i = applicationMetadata;
        this.j = i2;
        this.k = equalizerSettings;
        this.l = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 8);
        parcel.writeDouble(this.a);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g ? 1 : 0);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h);
        RT2.n(parcel, 5, this.i, i);
        RT2.f(parcel, 6, 4);
        parcel.writeInt(this.j);
        RT2.n(parcel, 7, this.k, i);
        RT2.f(parcel, 8, 8);
        parcel.writeDouble(this.l);
        RT2.b(a, parcel);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceStatus)) {
            return false;
        }
        DeviceStatus deviceStatus = (DeviceStatus) obj;
        if (this.a == deviceStatus.a && this.g == deviceStatus.g && this.h == deviceStatus.h && WH.a(this.i, deviceStatus.i) && this.j == deviceStatus.j) {
            EqualizerSettings equalizerSettings = this.k;
            if (WH.a(equalizerSettings, equalizerSettings) && this.l == deviceStatus.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.g), Integer.valueOf(this.h), this.i, Integer.valueOf(this.j), this.k, Double.valueOf(this.l)});
    }
}
