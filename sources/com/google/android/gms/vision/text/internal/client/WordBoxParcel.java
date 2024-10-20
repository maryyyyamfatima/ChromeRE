package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.Dq4;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class WordBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new Dq4();
    public final SymbolBoxParcel[] a;
    public final BoundingBoxParcel g;
    public final BoundingBoxParcel h;
    public final String i;
    public final float j;
    public final String k;
    public final boolean l;

    public WordBoxParcel(SymbolBoxParcel[] symbolBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, String str, float f, String str2, boolean z) {
        this.a = symbolBoxParcelArr;
        this.g = boundingBoxParcel;
        this.h = boundingBoxParcel2;
        this.i = str;
        this.j = f;
        this.k = str2;
        this.l = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.r(parcel, 2, this.a, i);
        RT2.n(parcel, 3, this.g, i);
        RT2.n(parcel, 4, this.h, i);
        RT2.o(parcel, 5, this.i);
        RT2.f(parcel, 6, 4);
        parcel.writeFloat(this.j);
        RT2.o(parcel, 7, this.k);
        RT2.f(parcel, 8, 4);
        parcel.writeInt(this.l ? 1 : 0);
        RT2.b(a, parcel);
    }
}
