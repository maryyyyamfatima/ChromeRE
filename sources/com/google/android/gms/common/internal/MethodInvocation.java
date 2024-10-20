package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RT2;
import defpackage.YW1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new YW1();
    public final int a;
    public final int g;
    public final int h;
    public final long i;
    public final long j;
    public final String k;
    public final String l;
    public final int m;
    public final int n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h);
        RT2.f(parcel, 4, 8);
        parcel.writeLong(this.i);
        RT2.f(parcel, 5, 8);
        parcel.writeLong(this.j);
        RT2.o(parcel, 6, this.k);
        RT2.o(parcel, 7, this.l);
        RT2.f(parcel, 8, 4);
        parcel.writeInt(this.m);
        RT2.f(parcel, 9, 4);
        parcel.writeInt(this.n);
        RT2.b(a, parcel);
    }

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.j = j2;
        this.k = str;
        this.l = str2;
        this.m = i4;
        this.n = i5;
    }
}
