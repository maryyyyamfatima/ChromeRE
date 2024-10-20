package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RT2;
import defpackage.VJ1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new VJ1();
    public final int a;
    public final String g;
    public final double h;
    public final String i;
    public final long j;
    public final int k;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.a);
        RT2.o(parcel, 3, this.g);
        RT2.f(parcel, 4, 8);
        parcel.writeDouble(this.h);
        RT2.o(parcel, 5, this.i);
        RT2.f(parcel, 6, 8);
        parcel.writeLong(this.j);
        RT2.f(parcel, 7, 4);
        parcel.writeInt(this.k);
        RT2.b(a, parcel);
    }

    public LoyaltyPointsBalance(int i, String str, double d, String str2, long j, int i2) {
        this.a = i;
        this.g = str;
        this.h = d;
        this.i = str2;
        this.j = j;
        this.k = i2;
    }
}
