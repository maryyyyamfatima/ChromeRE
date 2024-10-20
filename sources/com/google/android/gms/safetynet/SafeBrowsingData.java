package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C11093wT2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C11093wT2();
    public final String a;
    public final DataHolder g;
    public ParcelFileDescriptor h;
    public final long i;
    public final byte[] j;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.n(parcel, 3, this.g, i);
        RT2.n(parcel, 4, this.h, i);
        RT2.f(parcel, 5, 8);
        parcel.writeLong(this.i);
        RT2.d(parcel, 6, this.j);
        RT2.b(a, parcel);
        this.h = null;
    }

    public SafeBrowsingData(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j, byte[] bArr) {
        this.a = str;
        this.g = dataHolder;
        this.h = parcelFileDescriptor;
        this.i = j;
        this.j = bArr;
    }
}
