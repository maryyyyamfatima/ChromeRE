package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.I30;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ConnectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new I30();
    public final Bundle a;
    public final Feature[] g;
    public final int h;
    public final ConnectionTelemetryConfiguration i;

    public ConnectionInfo(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.a = bundle;
        this.g = featureArr;
        this.h = i;
        this.i = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.c(parcel, 1, this.a);
        RT2.r(parcel, 2, this.g, i);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h);
        RT2.n(parcel, 4, this.i, i);
        RT2.b(a, parcel);
    }
}
