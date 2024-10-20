package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.G44;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new G44();
    public final String a;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final boolean r;
    public final String s;
    public final String t;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        RT2.o(parcel, 4, this.h);
        RT2.o(parcel, 5, this.i);
        RT2.o(parcel, 6, this.j);
        RT2.o(parcel, 7, this.k);
        RT2.o(parcel, 8, this.l);
        RT2.o(parcel, 9, this.m);
        RT2.o(parcel, 10, this.n);
        RT2.o(parcel, 11, this.o);
        RT2.o(parcel, 12, this.p);
        RT2.o(parcel, 13, this.q);
        RT2.f(parcel, 14, 4);
        parcel.writeInt(this.r ? 1 : 0);
        RT2.o(parcel, 15, this.s);
        RT2.o(parcel, 16, this.t);
        RT2.b(a, parcel);
    }

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.a = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = str10;
        this.p = str11;
        this.q = str12;
        this.r = z;
        this.s = str13;
        this.t = str14;
    }
}
