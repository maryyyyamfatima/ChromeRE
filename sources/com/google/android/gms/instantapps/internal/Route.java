package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C7308lR2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Route extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C7308lR2();
    public final String a;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public Route(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.g = i;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.g);
        RT2.o(parcel, 4, this.h);
        RT2.o(parcel, 5, this.i);
        String str = this.j;
        RT2.o(parcel, 6, str);
        RT2.o(parcel, 7, this.k);
        RT2.o(parcel, 8, this.l);
        RT2.o(parcel, 9, str);
        RT2.b(a, parcel);
    }
}
