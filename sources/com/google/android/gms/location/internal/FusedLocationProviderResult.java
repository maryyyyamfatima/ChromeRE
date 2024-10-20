package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C3551aW0;
import defpackage.QP2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FusedLocationProviderResult extends AbstractSafeParcelable implements QP2 {
    public static final Parcelable.Creator CREATOR;
    public final Status a;

    static {
        new FusedLocationProviderResult(Status.k);
        CREATOR = new C3551aW0();
    }

    public FusedLocationProviderResult(Status status) {
        this.a = status;
    }

    @Override // defpackage.QP2
    public final Status S0() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 1, this.a, i);
        RT2.b(a, parcel);
    }
}
