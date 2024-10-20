package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import defpackage.RT2;
import defpackage.XJ1;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new XJ1();
    public final LoyaltyPoints A;
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
    public final int p;
    public final ArrayList q;
    public final TimeInterval r;
    public final ArrayList s;
    public final String t;
    public final String u;
    public final ArrayList v;
    public final boolean w;
    public final ArrayList x;
    public final ArrayList y;
    public final ArrayList z;

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
        RT2.f(parcel, 12, 4);
        parcel.writeInt(this.p);
        RT2.t(parcel, 13, this.q);
        RT2.n(parcel, 14, this.r, i);
        RT2.t(parcel, 15, this.s);
        RT2.o(parcel, 16, this.t);
        RT2.o(parcel, 17, this.u);
        RT2.t(parcel, 18, this.v);
        RT2.f(parcel, 19, 4);
        parcel.writeInt(this.w ? 1 : 0);
        RT2.t(parcel, 20, this.x);
        RT2.t(parcel, 21, this.y);
        RT2.t(parcel, 22, this.z);
        RT2.n(parcel, 23, this.A, i);
        RT2.b(a, parcel);
    }

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
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
        this.p = i;
        this.q = arrayList;
        this.r = timeInterval;
        this.s = arrayList2;
        this.t = str11;
        this.u = str12;
        this.v = arrayList3;
        this.w = z;
        this.x = arrayList4;
        this.y = arrayList5;
        this.z = arrayList6;
        this.A = loyaltyPoints;
    }
}
