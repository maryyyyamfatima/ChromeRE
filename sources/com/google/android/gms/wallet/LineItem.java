package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.BB1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LineItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new BB1();
    public final String a;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final String k;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.o(parcel, 4, this.h);
        RT2.o(parcel, 5, this.i);
        RT2.f(parcel, 6, 4);
        parcel.writeInt(this.j);
        RT2.o(parcel, 7, this.k);
        RT2.b(a, parcel);
    }

    public LineItem(int i, String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = i;
        this.k = str5;
    }
}
