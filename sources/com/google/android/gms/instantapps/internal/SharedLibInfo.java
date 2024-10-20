package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.I83;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SharedLibInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new I83();
    public final String a;
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final byte[] k;

    public SharedLibInfo(String str, int i, String str2, String str3, long j, byte[] bArr) {
        this.a = str;
        this.g = i;
        this.h = str2;
        this.i = str3;
        this.j = j;
        this.k = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g);
        RT2.o(parcel, 3, this.h);
        RT2.o(parcel, 4, this.i);
        RT2.f(parcel, 5, 8);
        parcel.writeLong(this.j);
        RT2.d(parcel, 6, this.k);
        RT2.b(a, parcel);
    }
}
