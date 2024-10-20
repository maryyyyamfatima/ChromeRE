package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.M24;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UriData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new M24();
    public final String a;
    public final String g;

    public UriData(String str, String str2) {
        this.a = str;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.b(a, parcel);
    }
}
