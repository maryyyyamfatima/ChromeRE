package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.Lj4;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new Lj4();
    public final String a;
    public final String g;
    public final TimeInterval h;
    public final UriData i;
    public final UriData j;

    public WalletObjectMessage(String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.a = str;
        this.g = str2;
        this.h = timeInterval;
        this.i = uriData;
        this.j = uriData2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.n(parcel, 4, this.h, i);
        RT2.n(parcel, 5, this.i, i);
        RT2.n(parcel, 6, this.j, i);
        RT2.b(a, parcel);
    }
}
