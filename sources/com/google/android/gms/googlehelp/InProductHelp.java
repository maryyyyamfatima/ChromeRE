package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C3161Yi1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class InProductHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C3161Yi1();
    public GoogleHelp a;
    public final String g;
    public final String h;
    public final int i;
    public final String j;
    public final int k;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 1, this.a, i);
        RT2.o(parcel, 2, this.g);
        RT2.o(parcel, 3, this.h);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.i);
        RT2.o(parcel, 5, this.j);
        RT2.f(parcel, 6, 4);
        parcel.writeInt(this.k);
        RT2.b(a, parcel);
    }

    public InProductHelp(GoogleHelp googleHelp, String str, String str2, int i, String str3, int i2) {
        this.a = googleHelp;
        this.g = str;
        this.h = str2;
        this.i = i;
        this.j = str3;
        this.k = i2;
    }
}
