package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C11078wQ2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C11078wQ2();
    public final int a;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;

    public RootTelemetryConfiguration(int i, int i2, int i3, boolean z, boolean z2) {
        this.a = i;
        this.g = z;
        this.h = z2;
        this.i = i2;
        this.j = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g ? 1 : 0);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h ? 1 : 0);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.i);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.j);
        RT2.b(a, parcel);
    }
}
