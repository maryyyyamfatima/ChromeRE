package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C12031zB1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LineBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C12031zB1();
    public final WordBoxParcel[] a;
    public final BoundingBoxParcel g;
    public final BoundingBoxParcel h;
    public final BoundingBoxParcel i;
    public final String j;
    public final float k;
    public final String l;
    public final int m;
    public final boolean n;
    public final int o;
    public final int p;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.r(parcel, 2, this.a, i);
        RT2.n(parcel, 3, this.g, i);
        RT2.n(parcel, 4, this.h, i);
        RT2.n(parcel, 5, this.i, i);
        RT2.o(parcel, 6, this.j);
        RT2.f(parcel, 7, 4);
        parcel.writeFloat(this.k);
        RT2.o(parcel, 8, this.l);
        RT2.f(parcel, 9, 4);
        parcel.writeInt(this.m);
        RT2.f(parcel, 10, 4);
        parcel.writeInt(this.n ? 1 : 0);
        RT2.f(parcel, 11, 4);
        parcel.writeInt(this.o);
        RT2.f(parcel, 12, 4);
        parcel.writeInt(this.p);
        RT2.b(a, parcel);
    }

    public LineBoxParcel(WordBoxParcel[] wordBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, BoundingBoxParcel boundingBoxParcel3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.a = wordBoxParcelArr;
        this.g = boundingBoxParcel;
        this.h = boundingBoxParcel2;
        this.i = boundingBoxParcel3;
        this.j = str;
        this.k = f;
        this.l = str2;
        this.m = i;
        this.n = z;
        this.o = i2;
        this.p = i3;
    }
}
