package com.google.android.gms.instantapps.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C5030eo1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class InstantAppPreLaunchInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C5030eo1();
    public final int a;
    public final String g;
    public final boolean h;
    public final Intent i;
    public final Intent j;
    public final AppInfo k;
    public final Route l;
    public final boolean m;
    public final byte[] n;
    public final String o;
    public final int p;
    public final int q;
    public final String r;
    public final byte[] s;
    public final Bundle t;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.a);
        RT2.o(parcel, 3, this.g);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h ? 1 : 0);
        RT2.n(parcel, 5, this.i, i);
        RT2.n(parcel, 6, this.j, i);
        RT2.n(parcel, 8, this.k, i);
        RT2.n(parcel, 9, this.l, i);
        RT2.f(parcel, 10, 4);
        parcel.writeInt(this.m ? 1 : 0);
        RT2.d(parcel, 11, this.n);
        RT2.o(parcel, 12, this.o);
        RT2.f(parcel, 13, 4);
        parcel.writeInt(this.p);
        RT2.o(parcel, 14, this.r);
        RT2.c(parcel, 15, this.t);
        RT2.f(parcel, 16, 4);
        parcel.writeInt(this.q);
        RT2.d(parcel, 17, this.s);
        RT2.b(a, parcel);
    }

    public InstantAppPreLaunchInfo(int i, String str, boolean z, Intent intent, Intent intent2, AppInfo appInfo, Route route, boolean z2, byte[] bArr, String str2, int i2, int i3, String str3, byte[] bArr2, Bundle bundle) {
        this.a = i;
        this.g = str;
        this.h = z;
        this.i = intent;
        this.j = intent2;
        this.k = appInfo;
        this.l = route;
        this.m = z2;
        this.n = bArr;
        this.o = str2;
        this.p = i2;
        this.r = str3;
        this.q = i3;
        this.s = bArr2;
        this.t = bundle;
    }
}
