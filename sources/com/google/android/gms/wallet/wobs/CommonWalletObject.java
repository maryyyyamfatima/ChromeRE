package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.FY;
import defpackage.RT2;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new FY();
    public String a;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final int n;
    public final ArrayList o;
    public final TimeInterval p;
    public final ArrayList q;
    public final String r;
    public final String s;
    public final ArrayList t;
    public final boolean u;
    public final ArrayList v;
    public final ArrayList w;
    public final ArrayList x;

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
        RT2.f(parcel, 10, 4);
        parcel.writeInt(this.n);
        RT2.t(parcel, 11, this.o);
        RT2.n(parcel, 12, this.p, i);
        RT2.t(parcel, 13, this.q);
        RT2.o(parcel, 14, this.r);
        RT2.o(parcel, 15, this.s);
        RT2.t(parcel, 16, this.t);
        RT2.f(parcel, 17, 4);
        parcel.writeInt(this.u ? 1 : 0);
        RT2.t(parcel, 18, this.v);
        RT2.t(parcel, 19, this.w);
        RT2.t(parcel, 20, this.x);
        RT2.b(a, parcel);
    }

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.a = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = i;
        this.o = arrayList;
        this.p = timeInterval;
        this.q = arrayList2;
        this.r = str9;
        this.s = str10;
        this.t = arrayList3;
        this.u = z;
        this.v = arrayList4;
        this.w = arrayList5;
        this.x = arrayList6;
    }

    public CommonWalletObject() {
        this.o = new ArrayList();
        this.q = new ArrayList();
        this.t = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
    }
}
