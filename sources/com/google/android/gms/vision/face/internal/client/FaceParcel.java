package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C6912kH0;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FaceParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C6912kH0();
    public final int a;
    public final int g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final LandmarkParcel[] o;
    public final float p;
    public final float q;
    public final float r;
    public final ContourParcel[] s;
    public final float t;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.f(parcel, 2, 4);
        parcel.writeInt(this.g);
        RT2.f(parcel, 3, 4);
        parcel.writeFloat(this.h);
        RT2.f(parcel, 4, 4);
        parcel.writeFloat(this.i);
        RT2.f(parcel, 5, 4);
        parcel.writeFloat(this.j);
        RT2.f(parcel, 6, 4);
        parcel.writeFloat(this.k);
        RT2.f(parcel, 7, 4);
        parcel.writeFloat(this.l);
        RT2.f(parcel, 8, 4);
        parcel.writeFloat(this.m);
        RT2.r(parcel, 9, this.o, i);
        RT2.f(parcel, 10, 4);
        parcel.writeFloat(this.p);
        RT2.f(parcel, 11, 4);
        parcel.writeFloat(this.q);
        RT2.f(parcel, 12, 4);
        parcel.writeFloat(this.r);
        RT2.r(parcel, 13, this.s, i);
        RT2.f(parcel, 14, 4);
        parcel.writeFloat(this.n);
        RT2.f(parcel, 15, 4);
        parcel.writeFloat(this.t);
        RT2.b(a, parcel);
    }

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, LandmarkParcel[] landmarkParcelArr, float f8, float f9, float f10, ContourParcel[] contourParcelArr, float f11) {
        this.a = i;
        this.g = i2;
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
        this.o = landmarkParcelArr;
        this.p = f8;
        this.q = f9;
        this.r = f10;
        this.s = contourParcelArr;
        this.t = f11;
    }
}
