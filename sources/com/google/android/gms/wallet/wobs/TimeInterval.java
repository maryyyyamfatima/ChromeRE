package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.KM3;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new KM3();
    public final long a;
    public final long g;

    public TimeInterval(long j, long j2) {
        this.a = j;
        this.g = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 8);
        parcel.writeLong(this.a);
        RT2.f(parcel, 3, 8);
        parcel.writeLong(this.g);
        RT2.b(a, parcel);
    }
}
