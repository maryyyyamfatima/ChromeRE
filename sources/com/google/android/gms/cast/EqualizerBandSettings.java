package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.QC0;
import defpackage.RT2;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class EqualizerBandSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new QC0();
    public final float a;
    public final float g;
    public final float h;

    public EqualizerBandSettings(float f, float f2, float f3) {
        this.a = f;
        this.g = f2;
        this.h = f3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 4);
        parcel.writeFloat(this.a);
        RT2.f(parcel, 3, 4);
        parcel.writeFloat(this.g);
        RT2.f(parcel, 4, 4);
        parcel.writeFloat(this.h);
        RT2.b(a, parcel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EqualizerBandSettings)) {
            return false;
        }
        EqualizerBandSettings equalizerBandSettings = (EqualizerBandSettings) obj;
        return this.a == equalizerBandSettings.a && this.g == equalizerBandSettings.g && this.h == equalizerBandSettings.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.g), Float.valueOf(this.h)});
    }
}
