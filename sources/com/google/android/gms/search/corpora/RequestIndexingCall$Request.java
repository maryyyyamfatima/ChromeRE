package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RT2;
import defpackage.ZN2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RequestIndexingCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ZN2();
    public String a;
    public String g;
    public long h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.o(parcel, 2, this.g);
        long j = this.h;
        RT2.f(parcel, 3, 8);
        parcel.writeLong(j);
        RT2.b(a, parcel);
    }

    public RequestIndexingCall$Request() {
    }

    public RequestIndexingCall$Request(long j, String str, String str2) {
        this.a = str;
        this.g = str2;
        this.h = j;
    }
}
