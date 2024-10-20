package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C2167Qr2;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Permissions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C2167Qr2();
    public final String[] a;
    public final String[] g;
    public final String[] h;
    public final String[] i;

    public Permissions(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        this.a = strArr;
        this.g = strArr2;
        this.i = strArr3;
        this.h = strArr4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.p(parcel, 1, this.a);
        RT2.p(parcel, 2, this.g);
        RT2.p(parcel, 3, this.h);
        RT2.p(parcel, 4, this.i);
        RT2.b(a, parcel);
    }
}
